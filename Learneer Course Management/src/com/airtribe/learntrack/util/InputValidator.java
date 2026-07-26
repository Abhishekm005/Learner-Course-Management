package com.airtribe.learntrack.util;

import com.airtribe.learntrack.exception.InvalidInputException;

public class InputValidator {

    public static void validateString(String string, String filed){
        if(string==null || string.trim().isEmpty()){
            throw new InvalidInputException(filed + "Cannot be empty");
        }
    }

    public static void validateEmail(String email){
        if(email == null || ! email.contains("@")){
            throw new InvalidInputException(email + "Invalid email");
        }
    }

    public static int validateId(int id, String filed){
        if(id <= 0){
            throw new InvalidInputException(filed + "Must be a positive");
        }
        return id;
    }

}
