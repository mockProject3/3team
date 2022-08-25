package com.example.reservation.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
@Repository
public interface UserMapper {
    @Insert("insert into Users " +
            "(userId,userPw,userName,userTel,userBirth) " +
            "values(#{id},#{pwd},#{name},#{tel},#{birth})")
    void addUsers(String id, String name, String tel, String birth, String pwd);

    //@Select("select * from users where userId = #{userId} and userPw = #{userPw}")
    public User login(Map<String, String> map);
}