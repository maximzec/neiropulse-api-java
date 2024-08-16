package ru.neiropulse.api.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MessageController {

    @GetMapping("/message")
    public String getMessage() {
        return "This is the message";
    }
}