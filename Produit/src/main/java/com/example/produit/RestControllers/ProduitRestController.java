package com.example.produit.RestControllers;


import com.example.produit.DTO.ProduitAlimentaireDTO;
import com.example.produit.Services.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/produit")
@RequiredArgsConstructor
public class ProduitRestController {
    private final ProduitService service;

    @GetMapping("/getallproduits")
    public List<ProduitAlimentaireDTO> getAllproduits() {
        return service.findall();
    }

    @GetMapping("/getproduit/{id}")
    public ProduitAlimentaireDTO getproduitById(@PathVariable String id) {
        return service.findbyId(id);
    }

    @PostMapping("/addproduit")
    public ProduitAlimentaireDTO createArticle(@RequestBody ProduitAlimentaireDTO ProduitAlimentaireDTO) {
        return service.addProduit(ProduitAlimentaireDTO);
    }

    @PutMapping("/updatearticle/{id}")
    public ProduitAlimentaireDTO updateProduit(@PathVariable String id, @RequestBody ProduitAlimentaireDTO produitdto) {
        produitdto.setId(id);
        return service.modProduit(produitdto);
    }

    @DeleteMapping("/deleteproduit/{id}")
    public void deleteProduit(@PathVariable String id) {
        service.deletebyId(id);
    }
}


