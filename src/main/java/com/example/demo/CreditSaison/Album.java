package com.example.demo.CreditSaison;

import jakarta.persistence.*;
import lombok.Data;


@Table
@Entity
@Data
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String title;
}