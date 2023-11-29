package com.example.web.member;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MemberSignUpDto {

    private String id;
    private String password;
    private String passwordCheck;
    private String name;
    private String email;
    private String date;

}
