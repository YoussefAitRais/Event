package org.event.event.Controller;

import lombok.RequiredArgsConstructor;
import org.event.event.DTO.RegisterRequest;
import org.event.event.Services.RegisterService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
@RequiredArgsConstructor
public class RegisterController {

    private final RegisterService registerService;

    @PostMapping
    public String register(@RequestBody RegisterRequest request) {
        registerService.register(request);
        return "User registered successfully!";
    }
}
