package com.jatis.auth.service;

import com.jatis.auth.model.User;

public interface UserService {
    User findByUsername(String username);
}
