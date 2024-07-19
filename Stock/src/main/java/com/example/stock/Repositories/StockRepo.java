package com.example.stock.Repositories;


import com.example.stock.Entities.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepo extends CrudRepository<Stock,String> {
}
