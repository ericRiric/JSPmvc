package com.example.demo.controllers;

import com.example.demo.models.Produit;
import com.example.demo.repository.IProduitRepository;
import com.example.demo.repository.ProduitRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produit")
public class ProduitController {
    private IProduitRepository produitRepository;

    public ProduitController() {
        produitRepository = new ProduitRepository();

        produitRepository.ajouterProduit(new Produit(
                0,
                "Goonoid",
                10.99,
                5,
                false
        ));
        produitRepository.ajouterProduit(new Produit(
                1,
                "Goon",
                20.99,
                12,
                true
        ));
    }

    @GetMapping("/index")
    public String index() {
        return "produit";
    }
}
