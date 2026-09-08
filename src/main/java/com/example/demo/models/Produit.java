package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jsp_db")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer noProduit;
    private String nom;
    private Double prix;
    private Integer quantite;
    private Boolean taxable;
}
