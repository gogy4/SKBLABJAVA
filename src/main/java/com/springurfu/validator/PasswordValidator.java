package com.springurfu.webhomework.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<ValidPassword, String> {
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()";

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        if (password == null) {
            context.buildConstraintViolationWithTemplate("Пароль не может быть пустым")
                    .addConstraintViolation();
            return false;
        }
        if (password.length() < 8) {
            context.buildConstraintViolationWithTemplate("Пароль должен быть не менее 8 символов")
                    .addConstraintViolation();
            return false;
        }

        var hasUpper = false;
        var hasLower = false;
        var hasSpecial = false;

        for (var c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (SPECIAL_CHARACTERS.indexOf(c) != -1) hasSpecial = true;

            if (hasUpper && hasLower && hasSpecial) {
                return true;
            }
        }

        if (!hasUpper) {
            context
                    .buildConstraintViolationWithTemplate("Пароль должен содержать хотя бы одну заглавную букву")
                    .addConstraintViolation();
        }
        if (!hasLower) {
            context
                    .buildConstraintViolationWithTemplate("Пароль должен содержать хотя бы одну строчную букву")
                    .addConstraintViolation();
        }
        if (!hasSpecial) {
            context
                    .buildConstraintViolationWithTemplate("Пароль должен содержать " +
                            "хотя бы один специальный символ из !@#$%^&*()")
                    .addConstraintViolation();
        }
        return false;
    }

}
