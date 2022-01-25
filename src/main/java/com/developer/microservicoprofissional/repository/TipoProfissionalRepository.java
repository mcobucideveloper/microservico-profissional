package com.developer.microservicoprofissional.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.developer.microservicoprofissional.domain.model.TipoProfissional;

@Repository
public interface TipoProfissionalRepository extends  CustomJpaRepository<TipoProfissional, Long> {
	
	Optional<TipoProfissional> findByDescricao(String descricao);	

}
