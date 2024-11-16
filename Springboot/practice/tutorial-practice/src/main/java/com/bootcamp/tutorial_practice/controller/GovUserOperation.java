package com.bootcamp.tutorial_practice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.bootcamp.tutorial_practice.entity.UserEntity;
import com.bootcamp.tutorial_practice.infra.GeneralResponse;
import com.bootcamp.tutorial_practice.model.User;

import jakarta.persistence.criteria.CriteriaBuilder.In;

public interface GovUserOperation {
    @GetMapping(value = "/gov/user")
    GeneralResponse<User> getUserByUsername(@RequestParam(value = "userID") String Id);
}
