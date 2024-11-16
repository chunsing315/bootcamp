package com.bootcamp.tutorial_practice.config;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bootcamp.tutorial_practice.entity.CompanyEntity;
import com.bootcamp.tutorial_practice.entity.PostEntity;
import com.bootcamp.tutorial_practice.entity.UserEntity;
import com.bootcamp.tutorial_practice.model.dto.PostDTO;
import com.bootcamp.tutorial_practice.model.dto.UserDTO;
import com.bootcamp.tutorial_practice.model.mapper.JPHMapper;
import com.bootcamp.tutorial_practice.repository.UserRepository;
import com.bootcamp.tutorial_practice.service.PostService;
import com.bootcamp.tutorial_practice.service.UserService;

@Component
public class SaveDataRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;
    @Autowired
    private JPHMapper jphMapper;

    @Override
    public void run(String... args) throws Exception {
        // Call API
        List<UserDTO> users = this.userService.getUsersFromWebsite();
        // Call API
        List<PostDTO> posts = this.postService.getPosts();

        // Contrruct List<UserEntity>
        // Stream + filter
        List<UserEntity> userEntities = users.stream().map(u -> {
            UserEntity userEntity = this.jphMapper.map(u);

            List<PostEntity> postEntities = posts.stream() //
                    .filter(p -> p.getUserId().equals(u.getId())) //
                    .map(p -> {
                        PostEntity postEntity = this.jphMapper.map(p);
                        postEntity.setUser(userEntity);
                        return postEntity;
                    }) //
                    .collect(Collectors.toList());

            CompanyEntity companyEntity = this.jphMapper.map(u.getCompany());
            companyEntity.setUser(userEntity);

            userEntity.setPosts(postEntities);
            userEntity.setCompany(companyEntity);
            return userEntity;
        }).collect(Collectors.toList());

        // Save All users, companies and posts at the same time.
        userRepository.saveAll(userEntities);
    }
}
