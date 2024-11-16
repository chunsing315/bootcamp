package com.bootcamp.bc_forum_tutorial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bootcamp.bc_forum_tutorial.model.PostPlaceHolder;
import com.bootcamp.bc_forum_tutorial.service.PostService;
import com.bootcamp.bc_forum_tutorial.util.UrlManager;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private UrlManager urlManager;
    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.jsonplaceholder.endpoint.post}")
    private String endpoint;

    public List<PostPlaceHolder> getRawData() {
        String url = urlManager.getUrl(endpoint);
        return List.of(restTemplate.getForObject(url, PostPlaceHolder[].class));
    };
}
