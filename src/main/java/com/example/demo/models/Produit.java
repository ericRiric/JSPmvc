package com.example.demo.models;

public class Produit {
    public Integer NoProduit;
    public String Nom;
    public Double Prix;
    public Integer Quantite;
    public Boolean Taxable;

    public Produit(Integer noProduit, String nom, Double prix, Integer quantite, Boolean taxable) {
        NoProduit = noProduit;
        Nom = nom;
        Prix = prix;
        Quantite = quantite;
        Taxable = taxable;
    }
}
