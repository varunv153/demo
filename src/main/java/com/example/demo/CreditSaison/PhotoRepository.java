package com.example.demo.CreditSaison;

import com.example.demo.CreditSaison.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface PhotoRepository extends JpaRepository<Photo,Long> {
    List<Photo> findByAlbumId(Long albumId);
}
