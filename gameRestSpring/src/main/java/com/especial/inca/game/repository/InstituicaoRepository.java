package com.especial.inca.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.especial.inca.game.model.Instituicao;


public interface InstituicaoRepository extends JpaRepository<Instituicao, Long>{

	//void saveAcesso(Acesso acesso);

	
}
