package com.example.demo.services;

import com.example.demo.dto.UtilisateurDto;
import com.example.demo.models.Panier;
import com.example.demo.models.Utilisateur;
import com.example.demo.repository.IPanierRepository;
import com.example.demo.repository.IUtilisateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UtilisateurService {
    private final IUtilisateurRepository userRepository;
    private final IPanierRepository panierRepository;
    private final RoleService roleService;
    private final PasswordEncoder passwordEncoder;

    public List<Utilisateur> getUsersList() {
        return userRepository.findAll();
    }

    public Boolean containsUser(String nom, String password) {
        Utilisateur user = userRepository.findFirstByNom(nom);
        return user != null && passwordEncoder.matches(password, user.getPassword());
    }

    public Utilisateur getUtilisateur(String nom) {
        return userRepository.findFirstByNom(nom);
    }

    public Utilisateur addUser(UtilisateurDto user) {
         Utilisateur utilisateur = userRepository.save(
                Utilisateur.builder()
                        .nom(user.getUsername())
                        .password(passwordEncoder.encode(user.getPassword()))
                        .roles(roleService.findByNom("ROLE_USER"))
                        .build()
        );

         /*
         panierRepository.save(
         );
         */

         return utilisateur;
    }
}
