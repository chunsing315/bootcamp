package com.bootcamp.tutorial_practice.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bootcamp.tutorial_practice.entity.UserEntity;
import com.bootcamp.tutorial_practice.infra.ApiUtil;
import com.bootcamp.tutorial_practice.infra.Scheme;
import com.bootcamp.tutorial_practice.infra.exception.BusinessException;
import com.bootcamp.tutorial_practice.infra.exception.ErrorCode;
import com.bootcamp.tutorial_practice.infra.exception.NonPositiveLongException;
import com.bootcamp.tutorial_practice.model.dto.UserDTO;
import com.bootcamp.tutorial_practice.model.mapper.JPHMapper;
import com.bootcamp.tutorial_practice.repository.UserRepository;
import com.bootcamp.tutorial_practice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Value("${api.url.endpoint.user}")
    private String userEndpoint;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ApiUtil apiUtil;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JPHMapper jphMapper;
    // @Autowired
    // private Mapper mapper;


    @Override
    public List<UserDTO> getUsersFromWebsite(){
        String url = apiUtil.getUrl(Scheme.HTTPS, userEndpoint);
        return Arrays.asList(this.restTemplate.getForObject(url, UserDTO[].class));
    };

    @Override
    public UserDTO[] getUsers() {
        UserDTO[] users = restTemplate.getForObject(apiUtil.getUrl(Scheme.HTTPS, userEndpoint), UserDTO[].class);
        Arrays.stream(users).forEach(user -> {
                    userRepository.save(this.jphMapper.map(user));
                });
        return users;
    }

    @Override
    public UserDTO getUserById(String id) {

        try {
            Long longId = Long.parseLong(id);
            if (longId <= 0L) {
                throw new NonPositiveLongException("ID cannot be less than 1: " + id);
            }
            return Arrays.stream(this.getUsers())
                    .filter(user -> user.getId() == longId)
                    .findFirst()
                    .orElseThrow(() -> new NoSuchElementException("User not found with userID: " + id));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid format \"" + id + "\"", e);
        }
        // catch (NoSuchElementException e){
        // System.err.println(e.getMessage());
        // return null;
        // }
    }

    @Override
    public List<UserEntity> getUsersFromDB() {
        return userRepository.findAll();
    };

    @Override
    public Optional<UserEntity> getUsersFromDbById(String id) {
        return userRepository.findById(Long.valueOf(id));
    };

    @Override
    public void deleteById(Long id) {
        if (!this.userRepository.existsById(id)) {
            throw new BusinessException(ErrorCode.USER_ID_NOT_FOUND);
            // return false;
        }
        this.userRepository.deleteById(id); // delete from Users where id = 100000
        // return true;
    };

    // @Override
    // public User findByUsername3(String username) {
    // return null;
    // };

    // @Override
    // public User findByUsername2(String username) {
    // return null;
    // };
    @Override
    public UserEntity getUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .stream()
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("not found"));

        // User foundUser = Arrays.stream(userentity)
        // .filter(user -> user.getUsername() == username)
        // .findFirst()
        // .orElseThrow(() -> new NoSuchElementException("User not found with username:
        // " + username));

        // return GeneralResponse.<User>builder()
        // .code("00000")
        // .message("Success.")
        // .data(List.of(foundUser))
        // .build();
    }
}
