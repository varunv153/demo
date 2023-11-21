package com.example.demo.CreditSaison;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;

    public Album getAlbumById(Long albumId) {
        return albumRepository.findById(Math.toIntExact(albumId)).orElse(null);
    }

}