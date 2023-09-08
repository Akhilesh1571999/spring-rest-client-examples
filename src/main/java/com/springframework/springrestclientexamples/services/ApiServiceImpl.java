package com.springframework.springrestclientexamples.services;

import com.springframework.api.domain.User;
import com.springframework.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private final RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData =restTemplate.getForObject("https://apifaketory.com/api/user?limit=" + limit , UserData.class);
        return userData.getData();
    }
}
