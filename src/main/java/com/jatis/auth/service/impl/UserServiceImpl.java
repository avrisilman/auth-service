package com.jatis.auth.service.impl;

import com.jatis.auth.model.User;
import com.jatis.auth.repository.UserRepository;
import com.jatis.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Value("${security.jwt.client-secret}")
    private String secret;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
