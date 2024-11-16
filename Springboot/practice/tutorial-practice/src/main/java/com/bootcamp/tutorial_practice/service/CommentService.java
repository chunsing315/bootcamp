package com.bootcamp.tutorial_practice.service;

import java.util.List;

import com.bootcamp.tutorial_practice.model.Comment;
import com.bootcamp.tutorial_practice.model.CommentDTO;

public interface CommentService {
    Comment[] getComments();

    Comment getCommentById(String id);

    Comment[] getAllCommentsByPostId(String postId);
}
