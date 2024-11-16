package com.bootcamp.bc_forum_tutorial.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bootcamp.bc_forum_tutorial.model.ModifyMobile;
import com.bootcamp.bc_forum_tutorial.model.UserCommentDTO;
import com.bootcamp.bc_forum_tutorial.model.UserDTO;

public interface RawDataController {

    @GetMapping("/hello")
    public String hello();

    @GetMapping("/getUserCommentByID")
    public List<UserCommentDTO> getUserByID(String userID);

    @PatchMapping("/mobile")
    UserDTO modifyMobileNumber(@RequestBody ModifyMobile modifyMbile);

}
