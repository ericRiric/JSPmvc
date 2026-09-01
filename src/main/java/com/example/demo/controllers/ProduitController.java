package com.example.demo.controllers;

import com.example.demo.models.Produit;
import com.example.demo.services.ProduitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProduitController {
    private final ProduitService produitService;

    public ProduitController() {
        produitService = new ProduitService();
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("produits", produitService.getProduitArrayList());
        return "produit";
    }

    @GetMapping("/ajouter")
    public String formAjouter() {
        return "ajouter";
    }

    @PostMapping("/ajouter")
    public String postAjouter(@ModelAttribute("produit") Produit produit) {
        produitService.ajouterProduit(produit);
        return "redirect:/";
    }

    @PostMapping("/supprimer/{noProduit}")
    public String supprimer(@PathVariable("noProduit") int noProduit) {
        produitService.supprimerProduit(noProduit);
        return "redirect:/";
    }
}