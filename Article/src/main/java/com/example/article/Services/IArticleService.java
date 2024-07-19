package com.example.article.Services;

import com.example.article.DOA.Enteties.Article;
import com.example.article.DTO.articleDTO;

import java.util.List;

public interface IArticleService {

    List<articleDTO> findall();
    articleDTO findbyId(String id);
    articleDTO addArticle(articleDTO articledto);
    articleDTO modArticle(articleDTO articledto);
    void deletebyId(String id);



}
