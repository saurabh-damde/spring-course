package com.skd.spring.mvc.validation.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    public String value() default "Mz";

    public String message() default "Must start with 'Mz'";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};

}
