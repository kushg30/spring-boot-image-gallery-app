package com.example.imagegalleryapp.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.imagegalleryapp.entity.ImageGallery;
import com.example.imagegalleryapp.repository.ImageGalleryRepository;

@Service
public class ImageGalleryService {

	@Autowired
	private ImageGalleryRepository imageGalleryRepository;

	public void saveImage(ImageGallery imageGallery) {
		imageGalleryRepository.save(imageGallery);
	}

	public List<ImageGallery> getAllActiveImages() {
		return imageGalleryRepository.findAll();
	}

	public Optional<ImageGallery> getImageById(Long id) {
		return imageGalleryRepository.findById(id);
	}
}