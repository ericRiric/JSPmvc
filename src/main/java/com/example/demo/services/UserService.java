package com.example.demo.services;

import com.example.demo.dto.UserDto;
import com.example.demo.models.User;
import com.example.demo.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final IUserRepository userRepository;
    private final RoleService roleService;

    public List<User> getUsersList() {
        return userRepository.findAll();
    }

    public User addUser(UserDto user) {
        return userRepository.save(
                User.builder()
                        .nom(user.getNom())
                        .passwd("") // TODO: passwordEncoder.encode(user.passwd)
                        .roles(roleService.findByNom("ROLE_USER"))
                        .build()
        );
    }
}
