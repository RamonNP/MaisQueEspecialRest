package com.especial.inca.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.especial.inca.game.model.User;

public interface UserRepository extends JpaRepository<User, String> {
}