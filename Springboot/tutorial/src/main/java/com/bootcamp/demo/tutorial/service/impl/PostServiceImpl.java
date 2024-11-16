package com.bootcamp.demo.tutorial.service.impl;

import org.springframework.beans.factory.annotation.Value;

public class PostServiceImpl {
    
    @Value("${api.url.endpoint.post}") // before server start, base on the path, scan application.yml
    String postEnpoint;
}
