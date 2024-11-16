package com.bootcamp.tutorial_practice.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.tutorial_practice.controller.PostOperation;
import com.bootcamp.tutorial_practice.model.Post;
import com.bootcamp.tutorial_practice.model.dto.PostDTO;
import com.bootcamp.tutorial_practice.service.PostService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class PostController implements PostOperation {

    @Autowired
    private PostService postService;

    @Override
    public PostDTO[] getPosts() {
        
        try {
            return (PostDTO[]) postService.getPostsFromDB().stream().toArray();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    };

    // @Override
    // public PostDTO[] getPosts(String userId, String postId) {
    //     return postService.getPostsByPostIdAndUserId(userId, postId);
    // };

    @Override
    public PostDTO getPost(String id) {
        return postService.getPostById(id);
    }

    @Override
    public List<Post> getPostsFromDB() throws JsonProcessingException{
        return postService.getPostsFromDB();
    };

}
