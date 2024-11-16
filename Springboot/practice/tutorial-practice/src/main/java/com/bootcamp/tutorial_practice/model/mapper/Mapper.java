package com.bootcamp.tutorial_practice.model.mapper;

import org.springframework.stereotype.Component;

import com.bootcamp.tutorial_practice.entity.CommentEntity;
import com.bootcamp.tutorial_practice.entity.PostEntity;
import com.bootcamp.tutorial_practice.entity.UserEntity;
import com.bootcamp.tutorial_practice.model.Comment;
import com.bootcamp.tutorial_practice.model.Post;
import com.bootcamp.tutorial_practice.model.User;
import com.bootcamp.tutorial_practice.model.dto.PostDTO;

@Component
public final class Mapper {

    public static User map(UserEntity userEntity){
        return User.builder()
                .name(userEntity.getName())
                .id(userEntity.getId())
                .username(userEntity.getUsername())
                .email(userEntity.getEmail())
                .phone(userEntity.getPhone())
                .website(userEntity.getWebsite())
                .build();
    }

    public static UserEntity mapToUserEntity(User user) {
        return UserEntity.builder()
                .name(user.getName())
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .phone(user.getPhone())
                .website(user.getWebsite())
                .build();
    }

    public static PostEntity mapToPostEntity(PostDTO postDTO) {
        return PostEntity.builder()
                .title(postDTO.getTitle())
                .body(postDTO.getBody())
                .build();
    }

    public static CommentEntity mapToCommentEntity(Comment comment) {
        return CommentEntity.builder()
                .id(comment.getId())
                .name(comment.getName())
                .postId(comment.getPostId())
                .body(comment.getBody())
                .email(comment.getEmail())
                .build();
    }
}
