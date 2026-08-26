package com.example.demo.repository;

import com.example.demo.models.Produit;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ProduitRepository implements IProduitRepository {
    private ArrayList<Produit> produitArrayList = new ArrayList<>();

    public ProduitRepository() {
        this.ajouterProduit(new Produit(
                0,
                "Goonoid",
                10.99,
                5,
                false
        ));
        this.ajouterProduit(new Produit(
                1,
                "Goon",
                20.99,
                12,
                true
        ));
    }

    @Override
    public ArrayList<Produit> getProduitArrayList() {
        return (ArrayList<Produit>) produitArrayList.clone();
    }

    @Override
    public Produit getProduitItem(Integer id) {
        return produitArrayList
                .stream()
                .filter(p -> p.getNoProduit().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void ajouterProduit(Produit produit) {
        produitArrayList.add(produit);
    }

    @Override
    public Produit supprimerProduit(Integer id) {
        Produit produitASupprimer = produitArrayList
                .stream()
                .filter(p -> p.getNoProduit().equals(id))
                .findFirst()
                .orElse(null);

        if (produitASupprimer != null) {
            produitArrayList.remove(produitASupprimer);
        }

        return produitASupprimer;
    }

    @Override
    public void modifierProduit(Produit produit, Integer id) {
        Produit produitAModifier = produitArrayList
                .stream()
                .filter(p -> p.getNoProduit().equals(id))
                .findFirst()
                .orElse(null);

        if (produitAModifier != null) {
            produitArrayList.remove(produitAModifier);
            produitArrayList.add(produit);
        }
    }
}
