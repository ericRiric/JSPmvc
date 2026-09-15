package com.example.demo.repository;

import com.example.demo.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface IProduitRepository extends JpaRepository<Produit, Integer> {
    List<Produit> findByNoProduit(Integer id);
    List<Produit> findByNomContainsIgnoreCase(String query);
}
