package com.example.reservation.User;

import java.util.Map;

public interface UserService {
    boolean checkId(String email) throws Exception;

    public User login(Map<String, String> map) throws Exception;
}
