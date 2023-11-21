package com.example.demo.CreditSaison;

import com.example.demo.CreditSaison.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface AlbumRepository extends JpaRepository<Album,Integer> {
    List<Album> findByUserId(Long userId);
}
