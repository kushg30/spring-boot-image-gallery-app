package com.example.imagegalleryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.imagegalleryapp.entity.ImageGallery;

@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long> {

}
