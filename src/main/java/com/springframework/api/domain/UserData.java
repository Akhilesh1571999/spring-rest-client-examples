package com.springframework.api.domain;

import java.util.List;

public class UserData {
    public List<User> data;
    public List<User> getData() {
        return data;
    }
    public void setData(List<User> data) {
        this.data = data;
    }
}
