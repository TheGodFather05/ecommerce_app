package com.ecommerce.api.service.user;

import com.ecommerce.api.entity.authentication.AuthenticationRequest;
import com.ecommerce.api.entity.user.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public UserDetails registerUser(User user) throws Exception;

    public UserDetails logUserIn(AuthenticationRequest request) throws Exception;

}
