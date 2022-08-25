package com.example.reservation.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean checkId(String email) throws Exception {
        return true;
    }

    @Override
    public User login(Map<String, String> map) throws Exception {
        return userMapper.login(map);
    }
}