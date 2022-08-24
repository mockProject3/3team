package com.example.reservation.Controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {

    private int memberNum;
    private String name;
    private String email;
    private String phone;
    private String pwd;
}
/*
* 회원번호 int memberNum
* 이름 String name
* 이메일(아이디) String email
* 연락처 String phone
* 비밀번호 String pwd
* */