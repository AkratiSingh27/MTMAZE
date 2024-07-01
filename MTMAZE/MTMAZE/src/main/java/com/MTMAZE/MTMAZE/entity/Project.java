package com.MTMAZE.MTMAZE.entity;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Ensure this field exists
    private int id;
    private String name;
    private String description;
    private String starting_date;
    private String created_by;
    private String updated_by;
    private String creation_date;
    private String updation_date;
    private boolean deleted;
}
