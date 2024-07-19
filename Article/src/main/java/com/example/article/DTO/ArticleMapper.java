package com.example.article.DTO;


import com.example.article.DOA.Enteties.Article;

public class ArticleMapper {

    public static articleDTO EntitytoDTOA(Article article){
        if (article == null ){
            return null;
        }
        articleDTO dto = new articleDTO();
        dto.builder().id(article.getId()).title(article.getTitle()).content(article.getContent()).author(article.getAuthor());
        return dto;
    }


    public static articleDTO EntitytoDTOS(Article article,StockDTO stockDTO){
        if (article == null ){
            return null;
        }
        articleDTO dto = new articleDTO();
        dto = dto.builder().id(article.getId()).title(article.getTitle()).content(article.getContent()).author(article.getAuthor()).id_Stock(article.getId_Stock()).build();
        return dto;
    }

    public static Article DTOtoEntity(articleDTO dto){
        if (dto == null){
            return null;

        }
        Article article = new Article();
        article = article.builder().id(dto.getId()).title(dto.getTitle()).content(dto.getContent()).author(dto.getAuthor()).id_Stock(dto.getId_Stock()).build();
        return article;
    }


}
