package com.example.demo.repository;

import com.example.demo.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface IRoleRepository extends JpaRepository<Role, Integer> {
    Set<Role> findByNom(String query);
}
