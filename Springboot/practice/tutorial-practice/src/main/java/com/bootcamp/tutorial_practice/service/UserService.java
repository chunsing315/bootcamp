package com.bootcamp.tutorial_practice.service;

import java.util.List;
import java.util.Optional;

import com.bootcamp.tutorial_practice.entity.UserEntity;
import com.bootcamp.tutorial_practice.model.dto.UserDTO;

public interface UserService {
    UserDTO[] getUsers();

    List<UserDTO> getUsersFromWebsite();

    UserDTO getUserById(String id);

    List<UserEntity> getUsersFromDB();

    Optional<UserEntity> getUsersFromDbById(String id);

    void deleteById(Long id);

    // User findByUsername3(String username);
    // User findByUsername2(String username);
    UserEntity getUserByUsername(String username);
}
