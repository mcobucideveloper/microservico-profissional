package com.developer.microservicoprofissional.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.developer.microservicoprofissional.api.model.TipoProfissionalModel;
import com.developer.microservicoprofissional.domain.model.TipoProfissional;

@Component
public class TipoProfissionalAssembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public TipoProfissionalModel toModel(TipoProfissional tipoProfissional) {
		return modelMapper.map(tipoProfissional, TipoProfissionalModel.class);
	}
	
	public List<TipoProfissionalModel> toCollectionModel(List<TipoProfissional> cozinhas) {
		return cozinhas.stream()
				.map(cozinha -> toModel(cozinha))
				.collect(Collectors.toList());
	}

}
