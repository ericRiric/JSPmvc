package com.example.demo.controllers;

import com.example.demo.models.Produit;
import com.example.demo.services.ProduitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produit")
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
        return "redirect:/produit/";
    }
}