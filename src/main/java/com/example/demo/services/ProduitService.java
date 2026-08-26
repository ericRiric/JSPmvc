package com.example.demo.services;

import com.example.demo.models.Produit;
import com.example.demo.repository.IProduitRepository;
import com.example.demo.repository.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProduitService {
    private final IProduitRepository produitRepository;

    public ProduitService() {
        this.produitRepository = new ProduitRepository();
    }

    public ArrayList<Produit> getProduitArrayList() {
        return produitRepository.getProduitArrayList();
    }

    public Produit getProduitItem(Integer id) {
        return produitRepository.getProduitItem(id);
    }

    public void ajouterProduit(Produit produit) {
        produitRepository.ajouterProduit(produit);
    }

    public Produit supprimerProduit(Integer id) {
        return produitRepository.supprimerProduit(id);
    }

    public void modifierProduit(Produit produit, Integer id) {
        produitRepository.modifierProduit(produit, id);
    }
}
