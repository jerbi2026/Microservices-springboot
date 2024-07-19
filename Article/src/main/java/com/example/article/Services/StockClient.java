package com.example.article.Services;


import com.example.article.DTO.StockDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "Stock-MS")
public interface StockClient {
    @GetMapping("api/stock/getStock/{id}")
    StockDTO getbyID(@PathVariable("id") String id);
}
