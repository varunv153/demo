package com.example.demo.CreditSaison;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/album")
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    @Autowired
    private PhotoService photoService;

    @GetMapping("/{albumId}")
    public ResponseEntity<Map<String, Object>> getAlbumDetails(@PathVariable Long albumId) {
        Album album = albumService.getAlbumById(albumId);

        if (album == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        List<Photo> photos = photoService.getPhotosByAlbumId(albumId);

        Map<String, Object> response = new HashMap<>();
        response.put("album", album);
        response.put("photos", photos);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
