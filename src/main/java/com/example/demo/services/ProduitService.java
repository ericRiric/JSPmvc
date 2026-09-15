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
        return produitRepository.findByNoProduit(id).get(0); // Note: getFirst est dans java 21
    }

    public void ajouterProduit(Produit produit) {
        produitRepository.save(produit);
    }

    public void supprimerProduit(Integer id) {
        produitRepository.delete(produitRepository.findByNoProduit(id).get(0));
    }

    public void modifierProduit(Produit produit, Integer id) {
        // Du big G
        Produit produitExistant = produitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produit introuvable"));

        produitExistant.setNom(produit.getNom());
        produitExistant.setPrix(produit.getPrix());
        produitExistant.setQuantite(produit.getQuantite());
        produitExistant.setTaxable(produit.getTaxable());

        produitRepository.save(produitExistant);
    }

    public List<Produit> rechercherProduit(String query) {
        return produitRepository.findByNomContainsIgnoreCase(query);
    }
}
