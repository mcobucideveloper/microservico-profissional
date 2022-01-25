package com.developer.microservicoprofissional.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developer.microservicoprofissional.domain.model.TipoProfissional;
import com.developer.microservicoprofissional.repository.TipoProfissionalRepository;

@Service
public class TipoProfissionalService {
	
	@Autowired
	private TipoProfissionalRepository tipoProfissionalRepository;
	
	@Transactional
	public TipoProfissional salvar(TipoProfissional tipoProfissional) {
		
		return tipoProfissionalRepository.save(tipoProfissional);	
	}
	
	
	

}
