package com.bootcamp.bc_forum_tutorial.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bootcamp.bc_forum_tutorial.entity.UserEntity;
import com.bootcamp.bc_forum_tutorial.exception.ErrorCode;
import com.bootcamp.bc_forum_tutorial.exception.UserNotFindException;
import com.bootcamp.bc_forum_tutorial.model.CommentDTO;
import com.bootcamp.bc_forum_tutorial.model.Mapper;
import com.bootcamp.bc_forum_tutorial.model.UserCommentDTO;
import com.bootcamp.bc_forum_tutorial.model.UserDTO;
import com.bootcamp.bc_forum_tutorial.model.UserPlaceHolder;
import com.bootcamp.bc_forum_tutorial.repository.UserRepository;
import com.bootcamp.bc_forum_tutorial.service.UserService;
import com.bootcamp.bc_forum_tutorial.util.UrlManager;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UrlManager urlManager;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private Mapper mapper;
    @Autowired
    UserRepository userRepository;
    

    @Value("${api.jsonplaceholder.endpoint.user}")
    private String endpoint;

    @Override
    public List<UserPlaceHolder> getRawData() {
        String url = urlManager.getUrl(endpoint);
        return List.of(restTemplate.getForObject(url, UserPlaceHolder[].class));
    };

    @Autowired
    public void saveAll(List<UserEntity> userEntities) {
        userRepository.saveAll(userEntities);
    }

    @Override
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    @Override
    public List<UserCommentDTO> getUserCommentByID(Long userID) {
        UserEntity user = this.getAll().stream()
                .filter(userEntity -> userID.equals(userEntity.getId()))
                .findFirst()
                .get();
        UserDTO userDTO = mapper.map(user);

        List<CommentDTO> targetCommentDTOs = userDTO.getPosts().stream()
                .flatMap(postDTO -> postDTO.getComments().stream())
                .collect(Collectors.toList());

        List<UserCommentDTO> result = new ArrayList<>();
        UserCommentDTO target = UserCommentDTO.builder()
                .id(userDTO.getId())
                .username(userDTO.getUsername())
                .comments(targetCommentDTOs).build();
        result.add(target);
        return result;
    };

    @Override
    public UserDTO modifyMobile(Long userID, String newMobile) {
        UserEntity userEntity = userRepository.findById(userID)//
                .orElseThrow(
                        () -> new UserNotFindException(ErrorCode.USER_NOT_FOUND.getMessage()));

        userEntity.setPhone(newMobile);
        userRepository.save(userEntity);

        return mapper.map(userEntity);
    };

}
