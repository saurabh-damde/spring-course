package com.skd.spring.mvc.validation;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {

    @NotNull(message = " is required!")
    @Size(min = 1, message = " is required!")
    private String firstName;

    private String lastName;

    @Min(value = 0, message = "must be greater than or equal to zero!")
    @Max(value = 10, message = "must be less than or equal to ten!")
    private int freePasses;

    public Customer() {
    }

    public Customer(String firstName, String lastName, int freePasses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.freePasses = freePasses;
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

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    @Override
    public String toString() {
        return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", freePasses=" + freePasses + "]";
    }

}
