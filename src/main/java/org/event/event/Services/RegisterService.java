package org.event.event.Services;

import lombok.RequiredArgsConstructor;
import org.event.event.DTO.RegisterRequest;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterService {

    private final InMemoryUserDetailsManager userDetailsManager;
    private final PasswordEncoder passwordEncoder;

    public void register(RegisterRequest request) {
        if (userDetailsManager.userExists(request.getUsername())) {
            throw new RuntimeException("User already exists!");
        }

        var user = User.withUsername(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .authorities("read")
                .build();

        userDetailsManager.createUser(user);
    }
}
