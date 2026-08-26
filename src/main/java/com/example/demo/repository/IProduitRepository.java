package com.example.demo.repository;

import com.example.demo.models.Produit;

import java.util.ArrayList;

public interface IProduitRepository {
    ArrayList<Produit> getProduitArrayList();
    Produit getProduitItem(Integer id);
    void ajouterProduit(Produit produit);
    Produit supprimerProduit(Integer id);
    void modifierProduit(Produit produit, Integer id);
}
