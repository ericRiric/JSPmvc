package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "paniers")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne(mappedBy = "utilisateur")
    private Utilisateur utilisateur;
}
