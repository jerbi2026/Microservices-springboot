package com.example.stock.Services;

import com.example.stock.Entities.Stock;

import java.util.List;

public interface IServiceStock {

    Stock addStock(Stock c);
    Stock UpdateStock(Stock c);
    List<Stock> allStock();
    Stock getStock(String id);
    void deleteStockById(String id);
    void deleteStock(Stock c);
}
