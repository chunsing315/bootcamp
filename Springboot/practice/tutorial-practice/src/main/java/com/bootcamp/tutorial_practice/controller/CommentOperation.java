package com.bootcamp.tutorial_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.PatchExchange;

import com.bootcamp.tutorial_practice.model.Comment;
import com.bootcamp.tutorial_practice.model.Post;

public interface CommentOperation {
    @GetMapping(value = "/comments")
    Comment[] getComments();

    @GetMapping(value = "/comment/{id}")
    Comment getComment(@PathVariable String id);

    @GetMapping(value = "/comment")
    Comment[] getComments(@RequestParam(value = "postID")String postId);

}
