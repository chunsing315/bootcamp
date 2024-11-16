package com.bootcamp.demo.tutorial.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bootcamp.demo.tutorial.controller.PostOperator;
import com.bootcamp.demo.tutorial.model.Post;
import com.bootcamp.demo.tutorial.service.PostService;

public class PostController implements PostOperator {

    @Autowired
    private PostService postService;

    // @Override
    // public Post[] getPosts() {
    //     return postService.getPosts();
    // }
}
