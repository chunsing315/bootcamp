package com.bootcamp.tutorial_practice.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.tutorial_practice.controller.CommentOperation;
import com.bootcamp.tutorial_practice.model.Comment;
import com.bootcamp.tutorial_practice.service.CommentService;

@RestController
public class CommentController implements CommentOperation {

    @Autowired
    private CommentService commentService;

    @Override
    public Comment[] getComments() {
        return commentService.getComments();
    };

    @Override
    public Comment getComment(String id) {
        return commentService.getCommentById(id);
    }

    @Override
    public Comment[] getComments(String postId) {
        return commentService.getAllCommentsByPostId(postId);
    }

}
