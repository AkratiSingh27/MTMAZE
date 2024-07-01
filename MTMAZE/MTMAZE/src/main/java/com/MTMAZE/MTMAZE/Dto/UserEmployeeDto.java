package com.MTMAZE.MTMAZE.Dto;

import com.MTMAZE.MTMAZE.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName ="build")
@NoArgsConstructor
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
