package com.example.smartpodcast.patterns;

import com.example.smartpodcast.model.Podcast;

public class PodcastFactory {
    public static Podcast createPodcast(String title, String author, String genre) {
        return Podcast.builder()
                .title(title)
                .author(author)
                .genre(genre) // <--- Ошибка была здесь, теперь метод должен найтись
                .build();
    }
}
