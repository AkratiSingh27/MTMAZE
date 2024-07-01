package com.MTMAZE.MTMAZE.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employee_project")
public class EmployeeProject {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
// Ensure this field exists
    private int id;
    private String project_id;
    private String emp_id;
    private String created_by;
    private String updated_by;
    private String creation_date;
    private String updation_date;
    private boolean deleted;




}
