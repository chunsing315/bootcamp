
package com.bootcamp.tutorial_practice.service.impl;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bootcamp.tutorial_practice.entity.CommentEntity;
import com.bootcamp.tutorial_practice.entity.PostEntity;
import com.bootcamp.tutorial_practice.infra.ApiUtil;
import com.bootcamp.tutorial_practice.infra.Scheme;
import com.bootcamp.tutorial_practice.infra.exception.BusinessException;
import com.bootcamp.tutorial_practice.infra.exception.ErrorCode;
import com.bootcamp.tutorial_practice.infra.exception.NonPositiveLongException;
import com.bootcamp.tutorial_practice.model.Comment;
import com.bootcamp.tutorial_practice.model.Post;
import com.bootcamp.tutorial_practice.model.mapper.Mapper;
import com.bootcamp.tutorial_practice.repository.CommentRepository;
import com.bootcamp.tutorial_practice.repository.PostRepository;
import com.bootcamp.tutorial_practice.service.CommentService;
import com.bootcamp.tutorial_practice.service.PostService;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ApiUtil apiUtil;
    @Autowired
    CommentRepository commentRepository;
    // @Autowired
    // Mapper mapper;
    @Value("${api.url.endpoint.comment}")
    private String commentEndpoint;

    @Override
    public Comment[] getComments() {
        Comment[] comments = restTemplate.getForObject(apiUtil.getUrl(Scheme.HTTPS, commentEndpoint), Comment[].class);
        if (commentRepository.findAll().isEmpty()) {
            Arrays.stream(comments)
                    .forEach(comment -> {
                        CommentEntity commentEntity = Mapper.mapToCommentEntity(comment);
                        commentRepository.save(commentEntity);
                    });
        } else {
            System.out.println("Already has data.");
        }

        return comments;
    };

    @Override
    public Comment getCommentById(String id) {
        if (this.getComments() == null) {
            throw new BusinessException(ErrorCode.USER_ID_NOT_FOUND);
        }
        try {
            Long longId = Long.valueOf(id);
            if (longId <= 0L) {
                throw new BusinessException(ErrorCode.LESS_THAN_ONE_INT);
            }
            ;

            Comment filteredComment = Arrays.stream(this.getComments())
                    .filter(comment -> longId.equals(comment.getId()))
                    // .toArray(Comment[]::new);
                    .findFirst().orElseThrow(() -> new BusinessException(ErrorCode.USER_ID_NOT_FOUND));
            return filteredComment;
        } catch (
        NumberFormatException e) {
            throw new BusinessException(ErrorCode.BAD_INPUT);
        }
    };

    @Override
    public Comment[] getAllCommentsByPostId(String postId) {
        return Arrays.stream(this.getComments())
                .filter(comment -> Long.valueOf(postId).equals(comment.getPostId()))
                .toArray(Comment[]::new);
    };
}
