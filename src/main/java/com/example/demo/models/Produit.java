package com.example.demo.models;

public class Produit {
    private Integer noProduit;
    private String nom;
    private Double prix;
    private Integer quantite;
    private Boolean taxable;

    public Produit(Integer noProduit, String nom, Double prix, Integer quantite, Boolean taxable) {
        this.noProduit = noProduit;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
        this.taxable = taxable;
    }

    public Integer getNoProduit() {
        return noProduit;
    }

    public void setNoProduit(Integer noProduit) {
        this.noProduit = noProduit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Boolean getTaxable() {
        return taxable;
    }

    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }
}
