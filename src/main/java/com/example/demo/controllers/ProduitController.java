package com.example.demo.controllers;

import com.example.demo.services.ProduitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produit")
public class ProduitController {
    private ProduitService produitService;

    public ProduitController() {
        produitService = new ProduitService();
    }

    @GetMapping("/index")
    public String index() {
        return "produit";
    }
}
