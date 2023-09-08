package com.springframework.springrestclientexamples.services;

import com.springframework.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
