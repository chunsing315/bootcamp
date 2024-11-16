package com.bootcamp.tutorial_practice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.bootcamp.tutorial_practice.entity.UserEntity;
import com.bootcamp.tutorial_practice.infra.GeneralResponse;
import com.bootcamp.tutorial_practice.model.User;
import com.bootcamp.tutorial_practice.model.dto.UserDTO;

public interface UserOperation {
    @GetMapping(value = "/users")
    List<UserDTO> getUser();

    @GetMapping(value = "/user")
    UserDTO getUserById(@RequestParam(value = "userID") String Id);

    @GetMapping(value = "/hello")
    String hello();

    @GetMapping(value = "db/users")
    List<UserEntity> getUsersFromDB();

    @GetMapping(value = "db/user/{id}")
    UserEntity getUsersFromDbById(@PathVariable String id);

    @DeleteMapping(value = "db/user/{id}")
    void deleteUsersFromDbById(@PathVariable String id);

    /* Update the row of database -> by Id find something, then modify */
    // @PutMapping("/user/{userID}")
    // @ResponseStatus(HttpStatus.ACCEPTED)
    // // User modifyUser(@PathVariable String id, @RequestBody UserRequest
    // UserRequest);
    /*
     * {
     * "usernameæ" : "test"
     * "email" : "test@test.com"
     * "phone" : "123456"
     * }
     */

    // only a column
    /*
     * @PatchMapping("/email/{userID}")
     * 
     * @ResponseStatus(HttpStatus.ACCEPTED)
     * User updateEmail(@PathVariable String id,@RequestParam String email);
     * 
     * @PatchMapping("/phone/{userID}")
     * 
     * @ResponseStatus(HttpStatus.ACCEPTED)
     * User updatePhone(@PathVariable String id,@RequestParam String phone);
     */

    @GetMapping(value = "/user/username/{username}")
    GeneralResponse<User> getUserByUsername(@PathVariable String username);
    // Controller Layer: Convert UserEntity -> User -> GeneralResponse<User>
}
