package com.MTMAZE.MTMAZE.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "employee_tbl")
public class Employee {
    @Id
    // Ensure this field exists
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int UserId;
    private String createdBy;
    private String updatedBy;
    private String creationDate;
    private String updationDate;
    private boolean deleted;

}
