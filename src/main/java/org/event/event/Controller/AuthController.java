package org.event.event.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/Auth")
public class AuthController {

    @GetMapping("/auth")
    public String auth() {
        return "Hello World";
    }
}
