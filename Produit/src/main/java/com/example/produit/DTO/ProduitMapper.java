package com.example.produit.DTO;


import com.example.produit.DOA.Enteties.ProduitAlimentaire;

public class ProduitMapper {

    public static ProduitAlimentaireDTO EntitytoDTOA(ProduitAlimentaire produitAlimentaire){
        if (produitAlimentaire == null ){
            return null;
        }
        ProduitAlimentaireDTO dto = new ProduitAlimentaireDTO();
        dto.builder().id(produitAlimentaire.getId()).title(produitAlimentaire.getTitle()).company(produitAlimentaire.getCompany());
        return dto;
    }


    public static ProduitAlimentaireDTO EntitytoDTOS(ProduitAlimentaire produitAlimentaire, StockDTO stockDTO){
        if (produitAlimentaire == null ){
            return null;
        }
        ProduitAlimentaireDTO dto = new ProduitAlimentaireDTO();
        dto = dto.builder().id(produitAlimentaire.getId()).title(produitAlimentaire.getTitle()).company(produitAlimentaire.getCompany()).id_Stock(produitAlimentaire.getId_Stock()).build();
        return dto;
    }

    public static ProduitAlimentaire DTOtoEntity(ProduitAlimentaireDTO dto){
        if (dto == null){
            return null;

        }
        ProduitAlimentaire produitAlimentaire = new ProduitAlimentaire();
        produitAlimentaire = produitAlimentaire.builder().id(dto.getId()).title(dto.getTitle()).company(dto.getCompany()).id_Stock(dto.getId_Stock()).build();
        return produitAlimentaire;
    }


}
