package com.example.article.RestControllers;


import com.example.article.DOA.Enteties.Article;
import com.example.article.DTO.articleDTO;
import com.example.article.Services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/article")
@RequiredArgsConstructor
public class ArticleRestController {
    private final ArticleService service;

    @GetMapping("/getallarticles")
    public List<articleDTO> getAllArticles() {
        return service.findall();
    }

    @GetMapping("/getarticle/{id}")
    public articleDTO getArticleById(@PathVariable String id) {
        return service.findbyId(id);
    }

    @PostMapping("/addarticle")
    public articleDTO createArticle(@RequestBody articleDTO articleDTO) {
        return service.addArticle(articleDTO);
    }

    @PutMapping("/updatearticle/{id}")
    public articleDTO updateArticle(@PathVariable String id, @RequestBody articleDTO articledto) {
        articledto.setId(id);
        return service.modArticle(articledto);
    }

    @DeleteMapping("/deletearticle/{id}")
    public void deleteArticle(@PathVariable String id) {
        service.deletebyId(id);
    }
}


