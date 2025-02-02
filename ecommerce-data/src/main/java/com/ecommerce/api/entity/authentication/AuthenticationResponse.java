package com.ecommerce.api.entity.authentication;

import com.ecommerce.api.entity.user.User;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthenticationResponse {

    private String token;

    public AuthenticationResponse() {
    }

    public AuthenticationResponse(String token) {
        this.token = token;
    }

}
