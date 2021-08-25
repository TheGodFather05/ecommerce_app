package com.ecommerce.api.controller;

import com.ecommerce.api.data.user.UserRepository;
import com.ecommerce.api.entity.authentication.AuthenticationRequest;
import com.ecommerce.api.entity.authentication.AuthenticationResponse;
import com.ecommerce.api.entity.user.User;
import com.ecommerce.api.service.CustomUserDetailsService;
import com.ecommerce.api.service.user.UserService;
import com.ecommerce.api.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
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

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthenticationRequest request) throws Exception {

        UserDetails userDetails = userService.logUserIn(request);

        final String jwt = jwtUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> register(@RequestBody User user) throws Exception {

        UserDetails savedUser = userService.registerUser(user);

        final String jwt = jwtUtil.generateToken(savedUser);


        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
