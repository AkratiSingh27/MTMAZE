package com.MTMAZE.MTMAZE.Dto;

import com.MTMAZE.MTMAZE.entity.Address;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class UserEmployeeDto {
    @NotEmpty
    @Size(min = 2, message = "user name should have at least 2 characters")
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String password;
    private String mobileNo;
    private Address presentAddress;
    private Address permanentAddress;
    private String role;
}
