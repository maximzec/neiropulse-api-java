package ru.neiropulse.api.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import ru.neiropulse.api.DTOs.Auth.LoginRequestModel;
import ru.neiropulse.api.DTOs.Auth.LoginResponseModel;

@RestController
@RequestMapping("api/v1/auth")
public class AuthContoller {

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody LoginRequestModel model) {

        if (model.getLogin().equals("admin") && model.getPassword().equals("123456789")) {
            return new ResponseEntity<>(new LoginResponseModel("ok"), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
        }

    }

}
