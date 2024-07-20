package com.example.produit.DTO;


import lombok.*;
import org.springframework.data.annotation.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProduitAlimentaireDTO {
    @Id
    String id;

    String title;
    String company;
    String id_Stock;




}
