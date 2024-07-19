package com.example.article.DOA.Enteties;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "article")
@FieldDefaults(level = AccessLevel.PRIVATE )
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {

    @Id

    private String id;
    private String title;
    private String content;
    private String author;
    private String id_Stock;
}
