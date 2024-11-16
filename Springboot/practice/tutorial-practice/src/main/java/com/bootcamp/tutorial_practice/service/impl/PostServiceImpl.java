package com.bootcamp.tutorial_practice.service.impl;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bootcamp.tutorial_practice.entity.PostEntity;
import com.bootcamp.tutorial_practice.infra.ApiUtil;
import com.bootcamp.tutorial_practice.infra.Scheme;
import com.bootcamp.tutorial_practice.infra.exception.NonPositiveLongException;
import com.bootcamp.tutorial_practice.model.Post;
import com.bootcamp.tutorial_practice.model.dto.PostDTO;
import com.bootcamp.tutorial_practice.model.mapper.JPHMapper;
import com.bootcamp.tutorial_practice.model.mapper.Mapper;
import com.bootcamp.tutorial_practice.repository.PostRepository;
import com.bootcamp.tutorial_practice.service.PostService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private JPHMapper jphMapper;

    @Autowired
    private ApiUtil apiUtil;

    @Autowired
    PostRepository postRepository;
    // @Autowired
    // Mapper mapper;
    @Value("${api.url.endpoint.post}")
    private String postEndpoint;

    @Override
    public List<PostDTO> getPosts() {
        PostDTO[] postDTOs = restTemplate.getForObject(apiUtil.getUrl(Scheme.HTTPS, postEndpoint), PostDTO[].class);
        Arrays.stream(postDTOs)
                .forEach(postDTO -> {
                    PostEntity postEntity = Mapper.mapToPostEntity(postDTO);
                    postRepository.save(postEntity);
                });

        return Arrays.asList(postDTOs);
    };

    @Override
    public PostDTO getPostById(String id) {
        try {
            Long longId = Long.valueOf(id);
            if (longId <= 0L) {
                throw new NonPositiveLongException("ID cannot be less than 1: " + id);
            }
            ;
            return getPosts().stream()
                    .filter(post -> longId.equals(post.getUserId()))
                    .findFirst()
                    .orElseThrow(() -> new NoSuchElementException("User not found with userID: " + id));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("ID can only be integer larger than one.");
        }
    };

    @Override
    public List<Post> getPostsFromDB() throws JsonProcessingException {
        // Cache Pattern (redis +DB)
        // Get from Redis
        String json = this.redisTemplate.opsForValue().get("jhp-posts");
        // If not found, read from DB then write to Redis
        if (json == null) {
            List<Post> posts = this.postRepository.findAll().stream()
                                    .map(p -> this.jphMapper.map(p)).collect(Collectors.toList());
            String jsonToWrite = new ObjectMapper().writeValueAsString(posts);
            System.out.println(jsonToWrite);
            this.redisTemplate.opsForValue().set("jhp-posts",jsonToWrite, Duration.ofSeconds(15));
            return posts;
        }

        return Arrays.asList(new ObjectMapper().readValue(json, Post[].class));

    }
    // @Override
    // public PostDTO[] getPostsByPostIdAndUserId(String userId, String postId) {
    // return Arrays.stream(this.getPosts())
    // .filter(post -> Long.valueOf(userId).equals(post.getUserId())
    // && Long.valueOf(postId).equals(post.getId()))
    // .toArray(PostDTO[]::new);
    // };
}
