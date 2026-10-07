package com.example.demo.controllers;

import com.example.demo.models.Produit;
import com.example.demo.models.Utilisateur;
import com.example.demo.services.ProduitService;
import com.example.demo.services.UtilisateurService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProduitController {
    private final ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("/")
    public String index(Model model, @RequestParam(required = false) String search) {
        if (search != null && !search.isBlank()) {
            model.addAttribute("produits", produitService.rechercherProduit(search));
        } else {
            model.addAttribute("produits", produitService.getProduitArrayList());
        }
        return "produit";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/ajouter")
    public String formAjouter(Model model) {
        Produit produit = new Produit();
        model.addAttribute("produit", produit);
        return "ajouter";
    }

    @PreAuthorize("hasRole('USER')")
    @PostMapping("/ajouter")
    public String postAjouter(@ModelAttribute("produit") Produit produit) {
        produitService.ajouterProduit(produit);
        return "redirect:/";
    }

    @PreAuthorize("hasRole('USER')")
    @PostMapping("/supprimer/{noProduit}")
    public String supprimer(@PathVariable("noProduit") int noProduit) {
        produitService.supprimerProduit(noProduit);
        return "redirect:/";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/modifier/{noProduit}")
    public String getModifier(@PathVariable("noProduit") int noProduit, Model model) {
        model.addAttribute("produit", produitService.getProduitItem(noProduit));
        return "modifier";
    }

    @PreAuthorize("hasRole('USER')")
    @PostMapping("/modifier/{noProduit}")
    public String postModifier(@PathVariable("noProduit") int noProduit, @ModelAttribute("produit") Produit produit) {
        produitService.modifierProduit(produit, noProduit);
        return "redirect:/";
    }
}