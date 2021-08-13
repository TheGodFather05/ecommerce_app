package com.ecommerce.api.entity.user;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    static User user;
    @BeforeAll
    static void init() {
        user=new User();
    }

    @Test
    void getFirstName() {
        String firstName="Timi";
        user.setFirstName(firstName);
        assertEquals(firstName,user.getFirstName());
    }

    @Test
    void getLastName() {
        String lastName="Fomo";
        user.setLastName(lastName);
        assertEquals(lastName,user.getLastName());
    }

    @Test
    void getEmail() {
        String email="Timi";
        user.setEmail(email);
        assertEquals(email,user.getEmail());
    }

    @Test
    void getTelephone() {
        long telephone=677889922;
        user.setTelephone(telephone);
        assertEquals(telephone,user.getTelephone());
    }

    @Test
    void getCountryCode() {
        int countryCode=237;
        user.setCountryCode(countryCode);
        assertEquals(countryCode,user.getCountryCode());
    }

    @Test
    void getUsername() {
        String userName="FomoTimi";
        user.setUsername(userName);
        assertEquals(userName,user.getUsername());
    }

    @Test
    void getPassword() {
        String password="test123456";
        user.setPassword(password);
        assertEquals(password,user.getPassword());
    }
}