package com.bootcamp.tutorial_practice.controller.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.tutorial_practice.controller.GovUserOperation;
import com.bootcamp.tutorial_practice.controller.UserOperation;
import com.bootcamp.tutorial_practice.entity.UserEntity;
import com.bootcamp.tutorial_practice.infra.GeneralResponse;
import com.bootcamp.tutorial_practice.infra.exception.BusinessException;
import com.bootcamp.tutorial_practice.infra.exception.ErrorCode;
import com.bootcamp.tutorial_practice.model.User;
import com.bootcamp.tutorial_practice.model.mapper.Mapper;
import com.bootcamp.tutorial_practice.service.UserService;

@RestController
public class GovUserController implements GovUserOperation {

    @Autowired
    private UserService userService;


    @Override
    public GeneralResponse<User> getUserByUsername(String username) {
        User foundUser = Mapper.map(userService.getUserByUsername(username));
        return GeneralResponse.<User>builder()
                .code("00000")
                .message("found")
                .data(List.of(foundUser))
                .build();
    }

}
