package com.example.demo.services;

import com.example.demo.repository.IPanierRepository;
import org.springframework.stereotype.Service;

@Service
public class PanierService {
    private final IPanierRepository panierRepository;

    public PanierService(IPanierRepository panierRepository) {
        this.panierRepository = panierRepository;
    }
}
