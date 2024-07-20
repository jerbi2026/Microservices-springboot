package com.example.produit.Services;

import com.example.produit.DTO.ProduitAlimentaireDTO;

import java.util.List;

public interface IProduitAlimentaireService {

    List<ProduitAlimentaireDTO> findall();
    ProduitAlimentaireDTO findbyId(String id);
    ProduitAlimentaireDTO addProduit(ProduitAlimentaireDTO articledto);
    ProduitAlimentaireDTO modProduit(ProduitAlimentaireDTO articledto);
    void deletebyId(String id);



}
