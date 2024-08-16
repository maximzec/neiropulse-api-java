package ru.neiropulse.api.Models;

public class LoginRequestModel {

    private String login;
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