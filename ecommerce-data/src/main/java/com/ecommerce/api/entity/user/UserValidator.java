package com.ecommerce.api.entity.user;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component("beforeCreateUserValidator")
public class UserValidator implements Validator {

    private final String passwordRegex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,128}$]";

    private final String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$]";

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        User user = (User) target;


        if (!validateEmail(user.getEmail())) {
            errors.rejectValue("email","","Invalid email! Please provide a valid email");
        }

        /*if (!validatePassword(user.getPassword())) {
            errors.rejectValue("password","",
                    "password should contain uppercase and lowercase letters, numbers and should be at least 4 characters ");
        }*/

        if (!validatePhoneNumber(user.getTelephone())) {
            errors.rejectValue("telephone","",
                    "The number of digits of a telephone number should be greather than 5 and less than 15");
        }

        if (!validateCountryCode(user.getCountryCode())) {

        }
    }

    public boolean validateEmail(String email) {

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validatePassword(String password) {

        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public boolean validatePhoneNumber(long telephone) {
        int length = String.valueOf(telephone).length();
        return length > 5 && length <= 15;
    }

    public boolean validateCountryCode(int countryCode) {
        return countryCode <= 3;
    }
}
