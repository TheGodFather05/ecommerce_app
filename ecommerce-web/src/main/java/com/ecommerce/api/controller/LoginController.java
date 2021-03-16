package com.ecommerce.api.controller;

import com.ecommerce.api.entity.authentication.AuthenticationRequest;
import com.ecommerce.api.entity.authentication.AuthenticationResponse;
import com.ecommerce.api.service.CustomUserDetailsService;
import com.ecommerce.api.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @PostMapping("/")
    public ResponseEntity<?> login(@RequestBody AuthenticationRequest request) throws Exception {

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername()
                    , request.getPassword()));
        } catch (BadCredentialsException e) {
            throw new Exception("Bad credentials. Please provide valid username and password", e);
        }


        final String jwt = jwtUtil.generateToken(userDetailsService.loadUserByUsername(request.getUsername()));

        String username, password;

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
