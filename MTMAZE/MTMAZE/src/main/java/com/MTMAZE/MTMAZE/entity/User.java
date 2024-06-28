package com.MTMAZE.MTMAZE.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "user")
public class User {
                @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                private int id;
                @Column(name = "first_name")
                private String firstName;
        @Column(name = "middle_name")
                private String middleName;
        @Column(name = "last_name")
                private String lastName;
                private String email;
                private String password;
        @Column(name = "mobile_no")
                private String mobileNo;
        @Column(name = "present_address_id")
                private int presentAddressId;
        @Column(name = "permanent_address_id")
                private int permanentAddressId;
                private String role;
        }


