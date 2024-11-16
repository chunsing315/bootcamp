package com.bootcamp.tutorial_practice.model.mapper;

import com.bootcamp.tutorial_practice.entity.CompanyEntity;
import com.bootcamp.tutorial_practice.entity.PostEntity;
import com.bootcamp.tutorial_practice.entity.UserEntity;
import com.bootcamp.tutorial_practice.model.Post;
import com.bootcamp.tutorial_practice.model.User;
import com.bootcamp.tutorial_practice.model.dto.PostDTO;
import com.bootcamp.tutorial_practice.model.dto.UserDTO;

public class JPHMapper {
    public User map(UserEntity userEntity){
        return User.builder()
                .name(userEntity.getName())
                .id(userEntity.getId())
                .username(userEntity.getUsername())
                .email(userEntity.getEmail())
                .phone(userEntity.getPhone())
                .website(userEntity.getWebsite())
                .build();
    }
    public Post map(PostEntity postEntity){
        return Post.builder()
                .body(postEntity.getBody())
                .id(postEntity.getId())
                .title(postEntity.getTitle())
                .build();
    } 
    public UserEntity map(UserDTO user) {
        return UserEntity.builder()
                .name(user.getName())
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .phone(user.getPhone())
                .website(user.getWebsite())
                .build();
    }
    public PostEntity map(PostDTO post) {
        return PostEntity.builder()
                .body(post.getBody())
                .title(post.getTitle())
                .build();
    }


    public CompanyEntity map(UserDTO.CompanyDTO company){
        return CompanyEntity.builder()
            .bs(company.getBs())
            .catchPhrase(company.getCatchPhrase())
            .name(company.getName())
            .build();
    }
}
