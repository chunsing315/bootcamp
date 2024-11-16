package com.bootcamp.tutorial_practice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bootcamp.tutorial_practice.model.Post;
import com.bootcamp.tutorial_practice.model.dto.PostDTO;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface PostOperation {
    @GetMapping(value = "/posts")
    PostDTO[] getPosts();

    @GetMapping(value = "/post/{id}")
    PostDTO getPost(@PathVariable String id);

    @GetMapping("/db/posts")
    List<Post> getPostsFromDB() throws JsonProcessingException;
    
    // @GetMapping(value = "/post")
    // PostDTO[] getPosts(@RequestParam(value = "userID")String userId, @RequestParam(value = "postID")String postId);

}
