package com.lq.service;

import com.lq.entity.User;

public interface UserService {
    void register(User user);

    boolean login(String username, String password);
}
