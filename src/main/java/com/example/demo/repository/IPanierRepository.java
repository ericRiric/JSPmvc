package com.example.demo.repository;

import com.example.demo.models.Panier;
import com.example.demo.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPanierRepository extends JpaRepository<Panier, Integer> {
    List<Panier> getAllByUtilisateur(Utilisateur utilisateur);
}
