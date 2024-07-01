package com.MTMAZE.MTMAZE.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Ensure this field exists
    private int id;
    private String project_id;
    private String task_name;
    private String assigned_to_id;
    private String eta_date;
    private String notes;
    private String created_by;
    private String updated_by;
    private String creation_date;
    private String updation_date;
    private boolean deleted;

}