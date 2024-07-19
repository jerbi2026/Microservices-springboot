package com.example.stock.Services;


import com.example.stock.Entities.Stock;
import com.example.stock.Repositories.StockRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StockService implements IServiceStock{
    final StockRepo sr;
    @Override
    public Stock addStock(Stock c) {
        return sr.save(c);
    }

    @Override
    public Stock UpdateStock(Stock c) {
        return sr.save(c);
    }

    @Override
    public List<Stock> allStock() {
        return (List<Stock>) sr.findAll();
    }

    @Override
    public Stock getStock(String id) {
        return sr.findById(id).get();
    }

    @Override
    public void deleteStockById(String id) {
        sr.deleteById(id);
    }

    @Override
    public void deleteStock(Stock c) {
        sr.delete(c);
    }
}
