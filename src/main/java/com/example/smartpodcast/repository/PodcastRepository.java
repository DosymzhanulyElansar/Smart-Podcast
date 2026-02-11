package com.example.smartpodcast.repository;

import com.example.smartpodcast.model.Podcast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PodcastRepository extends JpaRepository<Podcast, Long> {
    // Spring сам создаст логику хранения в памяти
}