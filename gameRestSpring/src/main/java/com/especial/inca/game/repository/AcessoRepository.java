package com.especial.inca.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.especial.inca.game.model.Acesso;

public interface  AcessoRepository extends JpaRepository<Acesso, String>{

	Acesso findByDescLogin(String descLogin);
}