package com.ecommerce.api.service.user;

import com.ecommerce.api.data.user.UserRepository;
import com.ecommerce.api.entity.authentication.AuthenticationRequest;
import com.ecommerce.api.entity.user.User;
import com.ecommerce.api.service.CustomUserDetailsService;
import com.ecommerce.api.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    public UserDetails registerUser(User user) throws Exception{
        if(userRepository.findByEmail(user.getEmail()).orElse(null)!=null)
            throw  new Exception("Email already exists for another User account");

        if(userRepository.findByUsername(user.getUsername()).orElse(null)!=null)
            throw new Exception("This username is already taken please try with another one");

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userDetailsService.loadUserByUsername(userRepository.save(user).getUsername());
    }

    @Override
    public UserDetails logUserIn(AuthenticationRequest request) throws Exception{
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername()
                    , request.getPassword()));
        } catch (BadCredentialsException e) {
            throw new Exception("Bad credentials. Please provide valid username and password", e);
        }
        return userDetailsService.loadUserByUsername(request.getUsername());
    }

}
