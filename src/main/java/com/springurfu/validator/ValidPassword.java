package com.springurfu.webhomework.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Size;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Size(min = 8, max = 50)
@Constraint(validatedBy = PasswordValidator.class)
public @interface ValidPassword {
    String message() default "Пароль должен содержать хотя бы 2 буквы разного регистра, " +
            "и хотя бы 1 специальный символ из !@#$%^&*()";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
