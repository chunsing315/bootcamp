package com.bootcamp.bc_forum_tutorial.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.bootcamp.bc_forum_tutorial.model.CommentPlaceHolder;
import com.bootcamp.bc_forum_tutorial.model.PostPlaceHolder;
import com.bootcamp.bc_forum_tutorial.model.UserPlaceHolder;

public interface JPHcontroller {

    @GetMapping("/users")
    List<UserPlaceHolder> getUserRawData();
    List<CommentPlaceHolder> getCommentRawData();
    List<PostPlaceHolder> getPostRawData();

}
