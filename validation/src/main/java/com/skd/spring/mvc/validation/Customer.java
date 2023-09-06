package com.skd.spring.mvc.validation;

import com.skd.spring.mvc.validation.validation.CourseCode;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Customer {

    @NotNull(message = " is required!")
    @Size(min = 1, message = " is required!")
    private String firstName;

    private String lastName;

    @NotNull(message = " is required!")
    @Min(value = 0, message = " must be greater than or equal to zero!")
    @Max(value = 10, message = " must be less than or equal to ten!")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = " only five characters/digits allowed!")
    private String postalCode;

    @CourseCode
    private String courseCode;

    public Customer() {
    }

    public Customer(@NotNull(message = " is required!") @Size(min = 1, message = " is required!") String firstName,
            String lastName,
            @NotNull(message = " is required!") @Min(value = 0, message = " must be greater than or equal to zero!") @Max(value = 10, message = " must be less than or equal to ten!") Integer freePasses,
            @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = " only five characters/digits allowed!") String postalCode,
            String courseCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.freePasses = freePasses;
        this.postalCode = postalCode;
        this.courseCode = courseCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", freePasses=" + freePasses
                + ", postalCode=" + postalCode + ", courseCode=" + courseCode + "]";
    }

}
