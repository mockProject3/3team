package com.example.reservation.User;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean checkId(String email) throws Exception {
        return true;
    }
}
