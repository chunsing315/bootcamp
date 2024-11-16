package com.bootcamp.tutorial_practice.service;

import java.util.List;

import com.bootcamp.tutorial_practice.model.Post;
import com.bootcamp.tutorial_practice.model.dto.PostDTO;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface PostService {
    List<PostDTO> getPosts();

    PostDTO getPostById(String id);
    List<Post> getPostsFromDB() throws JsonProcessingException; ;
    // PostDTO[] getPostsByPostIdAndUserId(String userId, String postId);
}
