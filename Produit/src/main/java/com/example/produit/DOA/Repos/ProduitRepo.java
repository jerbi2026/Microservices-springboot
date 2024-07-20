package com.example.produit.DOA.Repos;

import com.example.produit.DOA.Enteties.ProduitAlimentaire;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepo extends MongoRepository<ProduitAlimentaire,String> {
}
