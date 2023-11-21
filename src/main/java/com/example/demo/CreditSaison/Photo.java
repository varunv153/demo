package com.example.demo.CreditSaison;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;

    private String title;

    private String url;

    private String thumbnailUrl;
}