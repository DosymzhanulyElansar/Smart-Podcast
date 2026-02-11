package com.example.smartpodcast.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.smartpodcast.model.Podcast;
import com.example.smartpodcast.service.PodcastService;

@RestController
@RequestMapping("/api/podcasts")
public class PodcastController {
    private final PodcastService service;

    public PodcastController(PodcastService service) {
        this.service = service;
    }

    @GetMapping
    public List<Podcast> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Podcast create(@RequestBody Podcast podcast) {
        return service.save(podcast);
    }
}