package com.multi.news.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewsResponseDto {
    private String author;

    private String title;

    private String url;

    private String publishedAt;
}