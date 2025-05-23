package com.dat.backend.blogservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateNewBlog {
    private String title;
    private String content;
    private Long authorId;
}
