package com.bootcamp.bc_forum_tutorial.service;

import java.util.List;

import com.bootcamp.bc_forum_tutorial.model.CommentPlaceHolder;

public interface CommentService {
    List<CommentPlaceHolder> getRawData();
}