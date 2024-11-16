package com.bootcamp.demo.tutorial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bootcamp.demo.tutorial.infra.ApiUtil;
import com.bootcamp.demo.tutorial.infra.Scheme;
import com.bootcamp.demo.tutorial.model.User;
import com.bootcamp.demo.tutorial.service.UserService;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ApiUtil apiUtil;

    @Value("${api.url.endpoint.user}") // before server start, base on the path, scan application.yml
    String userEnpoint;

    @Override
    public List<User> getUser(){
        User[] userArr = restTemplate.getForObject(apiUtil.getUrl(Scheme.HTTPS,userEnpoint), User[].class);
        return this.ConvertArrToList(userArr);
    };

    private List<User> ConvertArrToList(User[] userArr){
        return List.of(userArr);
    }
}
