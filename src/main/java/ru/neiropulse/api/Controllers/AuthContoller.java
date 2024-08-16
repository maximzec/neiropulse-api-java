package ru.neiropulse.api.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.neiropulse.api.Models.LoginRequestModel;
import ru.neiropulse.api.Models.LoginResponseModel;

@RestController
@RequestMapping("/auth")
public class AuthContoller {

    @PostMapping("/login")
    public LoginResponseModel login(LoginRequestModel model) {
        return new LoginResponseModel("ok");
    }

}
