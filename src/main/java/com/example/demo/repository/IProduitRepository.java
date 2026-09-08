package com.example.demo.repository;

import com.example.demo.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface IProduitRepository extends JpaRepository<Produit, Integer> {
    ArrayList<Produit> getProduitArrayList();
    Produit getProduitItem(Integer id);
    void ajouterProduit(Produit produit);
    Produit supprimerProduit(Integer id);
    void modifierProduit(Produit produit, Integer id);
}
