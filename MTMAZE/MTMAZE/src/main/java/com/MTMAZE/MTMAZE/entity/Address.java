package com.MTMAZE.MTMAZE.entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name = "address_line1")
        private String addressLine1;
        @Column(name = "address_line2")
        private String addressLine2;
        private String city;
        private String state;
        private String country;
    @Column(name = "pin_code")
        private int pinCode;
    }
