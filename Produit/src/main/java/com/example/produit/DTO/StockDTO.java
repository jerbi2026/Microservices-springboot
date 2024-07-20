package com.example.produit.DTO;

import lombok.*;
import org.springframework.data.annotation.*;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StockDTO {

    @Id
    int id;

    long qtestock;
}
