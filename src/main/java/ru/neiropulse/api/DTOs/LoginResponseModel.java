package ru.neiropulse.api.Models;

public class LoginResponseModel {
    private String token;

    public LoginResponseModel(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}