package com.bootcamp.tutorial_practice.controller.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.tutorial_practice.controller.UserOperation;
import com.bootcamp.tutorial_practice.entity.UserEntity;
import com.bootcamp.tutorial_practice.infra.GeneralResponse;
import com.bootcamp.tutorial_practice.infra.exception.BusinessException;
import com.bootcamp.tutorial_practice.infra.exception.ErrorCode;
import com.bootcamp.tutorial_practice.model.User;
import com.bootcamp.tutorial_practice.model.dto.UserDTO;
import com.bootcamp.tutorial_practice.model.mapper.Mapper;
import com.bootcamp.tutorial_practice.service.UserService;

@RestController
public class UserController implements UserOperation {

    @Autowired
    private UserService userService;

    @Override
    public List<UserDTO> getUser() {
        return List.of(userService.getUsers());
    }

    @Override
    public UserDTO getUserById(String id) {
        return userService.getUserById(id);
    }

    @Override
    public String hello() {
        return "Hello";
    }

    @Override
    public List<UserEntity> getUsersFromDB() {
        return this.userService.getUsersFromDB();
    };

    @Override
    public UserEntity getUsersFromDbById(String id) {
        try {
            if (Long.valueOf(id) < 1L) {
                throw new BusinessException(ErrorCode.LESS_THAN_ONE_INT);
            }
            ;
        } catch (NumberFormatException e) {
            throw new BusinessException(ErrorCode.BAD_INPUT);
        }

        // Optional can be in Controlle or Service layer
        Optional<UserEntity> userEntity = this.userService.getUsersFromDbById(id);
        if (userEntity.isPresent()) {
            return userEntity.get();
        }
        throw new BusinessException(ErrorCode.USER_ID_NOT_FOUND);
    }

    @Override
    public void deleteUsersFromDbById(String id) {
        this.userService.deleteById(Long.valueOf(id));
    };

    // @Override
    // public User modifyUser(String id, UserRequest UserRequest) {
    // this.userService.modifyUser(id, UserRequest);
    // };

    // @Override
    // public User updateEmail(String email){
    // this.userService.updateEmail(email);
    // };

    // @Override
    // public User updatePhone(String phone){
    // this.userService.updateEmail(email);
    // };
    @Override
    public GeneralResponse<User> getUserByUsername(String username) {
        User foundUser = Mapper.map(userService.getUserByUsername(username));
        return GeneralResponse.<User>builder()
                .code("00000")
                .message("found")
                .data(List.of(foundUser))
                .build();
    };

}
