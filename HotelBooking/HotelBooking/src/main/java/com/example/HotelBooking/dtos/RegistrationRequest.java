package com.example.HotelBooking.dtos;


import com.example.HotelBooking.enums.UserRole;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationRequest {

    @NotBlank(message="FirstName is required")
    private String FirstName;

    @NotBlank(message="LastName is required")
    private String lastName;


    @NotBlank(message="Email is required")
    private String Email;


    @NotBlank(message="Phone Number is required")
    private String PhoneNumber;

    private UserRole role;


    @NotBlank(message ="Password is required")
    private String password;



}
