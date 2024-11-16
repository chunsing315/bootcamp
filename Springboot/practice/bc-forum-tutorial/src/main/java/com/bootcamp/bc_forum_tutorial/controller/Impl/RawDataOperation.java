package com.bootcamp.bc_forum_tutorial.controller.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.bc_forum_tutorial.controller.RawDataController;
import com.bootcamp.bc_forum_tutorial.model.ModifyMobile;
import com.bootcamp.bc_forum_tutorial.model.UserCommentDTO;
import com.bootcamp.bc_forum_tutorial.model.UserDTO;
import com.bootcamp.bc_forum_tutorial.service.CommentService;
import com.bootcamp.bc_forum_tutorial.service.PostService;
import com.bootcamp.bc_forum_tutorial.service.UserService;

@RestController
public class RawDataOperation implements RawDataController {
    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;
    @Autowired
    private CommentService commentService;

   

    @Override
    public String hello(){
        return "hello";
    }

    @Override
    public List<UserCommentDTO> getUserByID(String userID){
        return userService.getUserCommentByID(Long.valueOf(userID));
    };

    @Override
    public UserDTO modifyMobileNumber(@RequestBody ModifyMobile modifyMobile){
        return userService.modifyMobile(modifyMobile.getUserId(),modifyMobile.getPhone());
    };
}
