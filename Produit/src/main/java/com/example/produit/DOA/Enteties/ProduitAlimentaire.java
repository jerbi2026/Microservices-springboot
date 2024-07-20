package com.example.produit.DOA.Enteties;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "ProduitAlimentaire")
@FieldDefaults(level = AccessLevel.PRIVATE )
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProduitAlimentaire {

    @Id

    private String id;
    private String title;
    private String company;
    private String id_Stock;
}
