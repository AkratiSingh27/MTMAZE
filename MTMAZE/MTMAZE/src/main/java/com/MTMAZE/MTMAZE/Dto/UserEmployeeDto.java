package com.MTMAZE.MTMAZE.Dto;

import com.MTMAZE.MTMAZE.entity.Address;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserEmployeeDto {

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
