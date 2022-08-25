package com.example.reservation.user;

import java.util.Map;

public interface UserService {
    void addUser(String id,String name,String tel,String birth,String pwd);

    public User login(Map<String, String> map) throws Exception;
}
