package com.example.demo.repository;

import com.example.demo.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    Utilisateur findFirstByNom(String nom);
}
