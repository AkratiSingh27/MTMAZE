package com.MTMAZE.MTMAZE.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "designation")
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Ensure this field exists
    private int id;
    private String name;



}
