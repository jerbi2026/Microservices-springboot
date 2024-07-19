package com.example.article.DTO;


import lombok.*;
import org.springframework.data.annotation.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class articleDTO {
    @Id
    String id;

    String title;
    String content;
    String author;
    String id_Stock;




}
