package com.example.produit.Services;

import com.example.produit.DOA.Enteties.ProduitAlimentaire;
import com.example.produit.DOA.Repos.ProduitRepo;
import com.example.produit.DTO.ProduitMapper;
import com.example.produit.DTO.StockDTO;
import com.example.produit.DTO.ProduitAlimentaireDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProduitService implements IProduitAlimentaireService {


    final RestTemplate restTemplate;
    final ProduitRepo ar;
    final StockClient sc;

    @Override
    public List<ProduitAlimentaireDTO> findall() {
        return ar.findAll().stream()
                .map(ProduitMapper::EntitytoDTOA)
                .collect(Collectors.toList());
    }

    @Override
    public ProduitAlimentaireDTO findbyId(String id) {

        ProduitAlimentaire produitAlimentaire = ar.findById(id).orElseThrow(() -> new IllegalArgumentException("No Article found with this id: " + id));


        StockDTO stockDTO = restTemplate.getForObject("http://stock-ms/api/stock/getStock/" + produitAlimentaire.getId_Stock(), StockDTO.class);

        return ProduitMapper.EntitytoDTOS(produitAlimentaire,stockDTO);
    }

    @Override
    public ProduitAlimentaireDTO addProduit(ProduitAlimentaireDTO articledto) {
        ProduitAlimentaire produitAlimentaire1 = ProduitMapper.DTOtoEntity(articledto);
         ar.save(produitAlimentaire1);
        return articledto;

    }

    @Override
    public ProduitAlimentaireDTO modProduit(ProduitAlimentaireDTO articledto) {

        ProduitAlimentaire produitAlimentaire = ProduitMapper.DTOtoEntity(articledto);
        ProduitAlimentaire existingarticle = ar.save(produitAlimentaire);
        return ProduitMapper.EntitytoDTOA(existingarticle);

    }

    @Override
    public void deletebyId(String id) {
       ar.deleteById(id);
    }
}
