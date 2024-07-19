package com.example.article.Services;

import com.example.article.DOA.Enteties.Article;
import com.example.article.DOA.Repos.ArticleRepo;
import com.example.article.DTO.ArticleMapper;
import com.example.article.DTO.StockDTO;
import com.example.article.DTO.articleDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArticleService implements IArticleService{


    final RestTemplate restTemplate;
    final ArticleRepo  ar;
    final StockClient sc;

    @Override
    public List<articleDTO> findall() {
        return ar.findAll().stream()
                .map(ArticleMapper::EntitytoDTOA)
                .collect(Collectors.toList());
    }

    @Override
    public articleDTO findbyId(String id) {

        Article article = ar.findById(id).orElseThrow(() -> new IllegalArgumentException("No Article found with this id: " + id));


        StockDTO stockDTO = restTemplate.getForObject("http://stock-ms/api/stock/getStock/" + article.getId_Stock(), StockDTO.class);

        return ArticleMapper.EntitytoDTOS(article,stockDTO);
    }

    @Override
    public articleDTO addArticle(articleDTO articledto) {
        Article article1 = ArticleMapper.DTOtoEntity(articledto);
         ar.save(article1);
        return articledto;

    }

    @Override
    public articleDTO modArticle(articleDTO articledto) {

        Article article = ArticleMapper.DTOtoEntity(articledto);
        Article existingarticle = ar.save(article);
        return ArticleMapper.EntitytoDTOA(existingarticle);

    }

    @Override
    public void deletebyId(String id) {
       ar.deleteById(id);
    }
}
