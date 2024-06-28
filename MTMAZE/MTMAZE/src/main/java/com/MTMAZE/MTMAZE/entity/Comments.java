package com.MTMAZE.MTMAZE.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "comments")
public class Comments {
    @Id
    // Ensure this field exists
    private int id;
    private String task_id;
    private Long project_id;
    private String emp_id;
    private String comments;
    private String time_taken;
    private String created_by;
    private String updated_by;
    private String creation_date;
    private String updation_date;
    private boolean deleted;






}
