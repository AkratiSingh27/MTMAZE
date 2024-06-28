package com.MTMAZE.MTMAZE.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "designation")
public class Designation {
    @Id
    // Ensure this field exists
    private int id;
    private String name;



}
