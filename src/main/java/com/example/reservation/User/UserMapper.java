package com.example.reservation.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
@Repository
public interface UserMapper {

    @Select("select * from users where userId = #{userId} and userPw = #{userPw}")
    public User login(Map<String, String> map);
}