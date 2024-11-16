package com.bootcamp.demo.demo_restapi.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bootcamp.demo.demo_restapi.service.UserService;
import com.bootcamp.demo.demo_restapi.bootcamp.Scheme;
import com.bootcamp.demo.demo_restapi.bootcamp.UrlManager;
import com.bootcamp.demo.demo_restapi.entity.UserEntity;
import com.bootcamp.demo.demo_restapi.model.User;
import com.bootcamp.demo.demo_restapi.repository.UserRepository;

@Service
public class UserServiceHolder implements UserService {
    // private String url = "https://jsonplaceholder.typicode.com/users";

    // before @Service bean creatd, spring finds "api.url" value => from
    // Application.yml
    // this is an advantage of using spring. No need to use static. The variable is
    // in the yml. Every envir can access url.

    // Field injection style
    @Value("${api.url.domain}")
    private String domain;

    @Value("${api.url.endpoint}")
    private String endpoint;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;

    // constructor injection
    // old school style

    // public UserServiceHolder(RestTemplate restTemplate,
    // @Value("${api.url.endpoint}") String endpoint,
    // @Value("${api.url.domain}") String domain) {
    // this.domain = domain;
    // this.endpoint = endpoint;
    // this.restTemplate = restTemplate;
    // }

    // API
    @Override
    public User[] getUsers() {

        String url = UrlManager.builder()
                .scheme(Scheme.HTTPS)
                .domain(this.domain)
                .endpoint(this.endpoint)
                .build()
                .toString();
        System.out.println("url= " + url);

        User[] users = this.restTemplate.getForObject(url, User[].class);
        // Sub-optimal: because this will create new object Everytime!
        // User[] users = new RestTemplate.getForObject(url, User[].class);
        // System.out.println("users=" + Arrays.toString(users));

        Arrays.asList(users).stream().forEach(e -> {
            UserEntity u = UserEntity.builder()
                .email(e.getEmail())
                .name(e.getName())
                .id(Long.valueOf(e.getId()))
                .phone(e.getPhone())
                .website(e.getWebsite())
                .username(e.getUsername())
                .build();
            System.out.println(e.getName());
            System.out.println(e.getId());
            System.out.println(e.getEmail());
            System.out.println(e.getPhone());
            System.out.println(e.getUsername());
            System.out.println(e.getWebsite());            
            // convert user to UserEntity object
            userRepository.save(u);
        });
        return users;
    }
}
