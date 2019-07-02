package com.especial.inca.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.especial.inca.game.model.Usuario;

public interface UserRepository extends JpaRepository<Usuario, String> {
}