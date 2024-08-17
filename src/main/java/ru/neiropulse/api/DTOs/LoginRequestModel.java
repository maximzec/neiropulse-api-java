package ru.neiropulse.api.Models;

import jakarta.validation.constraints.NotBlank;

public class LoginRequestModel {

    @NotBlank(message = "Login is required")
    private String login;

    @NotBlank(message = "Password is required")
    private String password;

    public LoginRequestModel(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

}