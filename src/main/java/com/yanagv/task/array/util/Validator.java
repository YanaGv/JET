package com.yanagv.task.array.util;

public class Validator {
    public boolean validate(String string){
        boolean isValidate;
        isValidate = string.matches("^(\\d+\\s?)+\\n");
        return isValidate;
    }
}
