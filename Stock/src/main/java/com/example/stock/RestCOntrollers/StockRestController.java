package com.example.stock.RestCOntrollers;

import com.example.stock.Entities.Stock;
import com.example.stock.Services.IServiceStock;
import com.example.stock.Services.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/stock")
@RequiredArgsConstructor
public class StockRestController {
    final StockService service;

    @GetMapping("/getallstocks")
    public List<Stock> getAllStockes() {
        return service.allStock();
    }

    @GetMapping("/getStock/{id}")
    public Stock getStockById(@PathVariable String id) {
        return service.getStock(id);
    }

    @PostMapping("/addStock")
    public Stock createStock(@RequestBody Stock Stock) {
        return service.addStock(Stock);
    }

    @PutMapping("/updateStock/{id}")
    public Stock updateStock(@PathVariable String id, @RequestBody Stock Stock) {
        Stock.setId(id);
        return service.addStock(Stock);
    }

    @DeleteMapping("/deleteStock/{id}")
    public void deleteStock(@PathVariable String id) {
        service.deleteStockById(id);
    }
}

