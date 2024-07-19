package com.example.article.DOA.Repos;

import com.example.article.DOA.Enteties.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepo extends MongoRepository<Article,String> {
}
