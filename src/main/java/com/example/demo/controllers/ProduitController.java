package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produit")
public class ProduitController {
    @GetMapping("/index")
    public String index() {
        return "produit";
    }
}
