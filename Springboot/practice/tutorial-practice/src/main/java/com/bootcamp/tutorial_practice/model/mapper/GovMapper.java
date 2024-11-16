package com.bootcamp.tutorial_practice.model.mapper;

import org.springframework.stereotype.Component;

import com.bootcamp.tutorial_practice.dto.GovUserDto;
import com.bootcamp.tutorial_practice.entity.UserEntity;

@Component
public class GovMapper {
    public static GovUserDto map(UserEntity entity) {
        return GovUserDto.builder()
                .name(entity.getName())
                .email(entity.getEmail())
                .build();
    }
}
