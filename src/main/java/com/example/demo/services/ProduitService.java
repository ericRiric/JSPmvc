package com.example.demo.services;

import com.example.demo.models.Produit;
import com.example.demo.repository.IProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    private final IProduitRepository produitRepository;

    public ProduitService(IProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    public List<Produit> getProduitArrayList() {
        return produitRepository.findAll();
    }

    public Produit getProduitItem(Integer id) {
        return produitRepository.findByNoProduit(id).getFirst();
    }

    public void ajouterProduit(Produit produit) {
        produitRepository.save(produit);
    }

    public void supprimerProduit(Integer id) {
        produitRepository.delete(produitRepository.findByNoProduit(id).getFirst());
    }

    public void modifierProduit(Produit produit, Integer id) {
        produitRepository.delete(produitRepository.findByNoProduit(id).getFirst());
        produitRepository.save(produit);
    }
}
