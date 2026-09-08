package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "produits")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Produit {
    @Id
    @Column(name = "no_produit")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer noProduit;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prix")
    private Double prix;

    @Column(name = "quantite")
    private Integer quantite;

    @Column(name = "taxable")
    private Boolean taxable;
}
