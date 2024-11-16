package com.bootcamp.bc_forum_tutorial.service;

import java.util.List;

import com.bootcamp.bc_forum_tutorial.entity.UserEntity;
import com.bootcamp.bc_forum_tutorial.model.UserCommentDTO;
import com.bootcamp.bc_forum_tutorial.model.UserDTO;
import com.bootcamp.bc_forum_tutorial.model.UserPlaceHolder;

public interface UserService {
    List<UserPlaceHolder> getRawData();

    void saveAll(List<UserEntity> userEntities);

    List<UserCommentDTO> getUserCommentByID(Long userID);

    List<UserEntity> getAll();

    UserDTO modifyMobile(Long id, String phone);

}
