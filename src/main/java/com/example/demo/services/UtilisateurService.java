package com.example.demo.services;

import com.example.demo.dto.UserDto;
import com.example.demo.models.Utilisateur;
import com.example.demo.repository.IUtilisateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UtilisateurService {
    private final IUtilisateurRepository userRepository;
    private final RoleService roleService;

    public List<Utilisateur> getUsersList() {
        return userRepository.findAll();
    }

    public Boolean containsUser(String nom, String passwd) {
        Utilisateur user = userRepository.findFirstByNom(nom);
        return user != null && user.getPasswd().equals(passwd);
    }

    public Utilisateur addUser(UserDto user) {
        return userRepository.save(
                Utilisateur.builder()
                        .nom(user.getNom())
                        .passwd("") // TODO: passwordEncoder.encode(user.passwd)
                        .roles(roleService.findByNom("ROLE_USER"))
                        .build()
        );
    }
}
