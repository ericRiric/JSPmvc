package com.example.demo.services;

import com.example.demo.models.Utilisateur;
import com.example.demo.repository.IUtilisateurRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final IUtilisateurRepository utilisateurRepository;

    public CustomUserDetailsService(IUtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Utilisateur utilisateur = utilisateurRepository.findFirstByNom(username);

        if (utilisateur != null) {
            User authUser = new User(
                    username,
                    utilisateur.getPasswd(),
                    utilisateur.getRoles().stream().map((role) -> new SimpleGrantedAuthority(role.getNom())).collect(Collectors.toList())
            );
            return authUser;
        } else {
            throw new UsernameNotFoundException("Nom d'utilisateur ou mot de passe invalide");
        }
    }
}
