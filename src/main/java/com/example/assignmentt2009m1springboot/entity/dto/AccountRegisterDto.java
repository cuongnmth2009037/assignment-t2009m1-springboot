package com.example.assignmentt2009m1springboot.entity.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountRegisterDto {
    private long id;
    private String username;
    private String password;
    private String confirmPassword;
    private int role;
}
