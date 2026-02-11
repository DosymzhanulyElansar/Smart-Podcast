package com.example.smartpodcast.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "podcasts")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // Именно эта аннотация создает методы для билдера
public class Podcast {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String author;
    private String genre; // <--- Проверь, чтобы здесь было написано genre
}