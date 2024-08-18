package ru.neiropulse.api.DTOs;

public class LoginResponseModel {
    private String token;

    public LoginResponseModel(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}