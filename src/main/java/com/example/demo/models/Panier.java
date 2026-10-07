package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "paniers")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private Utilisateur utilisateur;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "PanierProduit",
            joinColumns = @JoinColumn(name = "panier_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"panier_id", "produit_id"})
    )
    private Set<Produit> produits;
}
