package com.example.reservation.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userId;
    private String userPW;
    private String userName;
    private String userTel;
    private String userBirth;
}
/*
* 회원번호 int memberNum
* 이름 String name
* 이메일(아이디) String email
* 연락처 String phone
* 비밀번호 String pwd
* */