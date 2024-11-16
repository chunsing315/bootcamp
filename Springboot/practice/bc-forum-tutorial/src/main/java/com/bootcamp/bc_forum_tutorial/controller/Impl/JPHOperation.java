package com.bootcamp.bc_forum_tutorial.controller.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.bc_forum_tutorial.controller.JPHcontroller;
import com.bootcamp.bc_forum_tutorial.model.CommentPlaceHolder;
import com.bootcamp.bc_forum_tutorial.model.PostPlaceHolder;
import com.bootcamp.bc_forum_tutorial.model.UserPlaceHolder;
import com.bootcamp.bc_forum_tutorial.service.CommentService;
import com.bootcamp.bc_forum_tutorial.service.PostService;
import com.bootcamp.bc_forum_tutorial.service.UserService;

@RestController
public class JPHOperation implements JPHcontroller{

    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;
    @Autowired
    private CommentService commentService;

    
     @Override
    public List<UserPlaceHolder> getUserRawData() {
        return userService.getRawData();
    };

    @Override
    public List<CommentPlaceHolder> getCommentRawData() {
        return commentService.getRawData();
    };

    @Override
    public List<PostPlaceHolder> getPostRawData() {
        return postService.getRawData();
    };
    
}
