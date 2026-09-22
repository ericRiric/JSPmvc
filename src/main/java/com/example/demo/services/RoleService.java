package com.example.demo.services;

import com.example.demo.models.Role;
import com.example.demo.repository.IRoleRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RoleService {
    private final IRoleRepository roleRepository;

    public RoleService(IRoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Set<Role> findByNom(String query) {
        return this.roleRepository.findByNom(query);
    }
}
