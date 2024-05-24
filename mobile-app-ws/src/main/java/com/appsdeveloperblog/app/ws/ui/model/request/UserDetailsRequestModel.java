package com.appsdeveloperblog.app.ws.ui.model.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDetailsRequestModel {
    @NotNull(message="fist name cannot be null")
    @Size(min=3 , message = "not less than 3 characters")
    private String firstName;
    @NotNull(message = "last name cannot be null")
    private String lastName;
    @NotNull(message = "email cannot be null")
    @Email
    private String email;
    @NotNull(message = "password cannot be null" )
    @Size(min = 8 , max = 16 , message = " password cannot be less than 8 characters and more than 16 characters ")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
