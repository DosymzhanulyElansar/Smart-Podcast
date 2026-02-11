package com.example.smartpodcast.service;

import com.example.smartpodcast.model.Podcast;
import com.example.smartpodcast.repository.PodcastRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PodcastService {
    private final PodcastRepository repository;

    public PodcastService(PodcastRepository repository) {
        this.repository = repository;
    }

    public List<Podcast> getAll() {
        return repository.findAll();
    }

    public Podcast save(Podcast podcast) {
        return repository.save(podcast);
    }
}