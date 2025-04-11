package com.example.session3_dynamic_data_modelview.jwtModule.Dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}