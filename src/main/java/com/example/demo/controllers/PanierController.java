package com.example.demo.controllers;

import com.example.demo.models.Utilisateur;
import com.example.demo.services.PanierService;
import com.example.demo.services.UtilisateurService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@PreAuthorize("hasRole('USER')")
@RequestMapping("/p")
public class PanierController {
    private final PanierService panierService;
    private final UtilisateurService utilisateurService;

    public PanierController(PanierService panierService, UtilisateurService utilisateurService) {
        this.panierService = panierService;
        this.utilisateurService = utilisateurService;
    }

    @PostMapping("/p/ajouter/{noProduit}")
    public String postPanierAjout(@PathVariable("noProduit") int noProduit, Authentication auth) {
        Utilisateur utilisateur = utilisateurService.getUtilisateur(auth.getName());
        return "/";
    }
}
