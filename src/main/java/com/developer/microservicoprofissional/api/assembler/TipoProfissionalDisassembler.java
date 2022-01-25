package com.developer.microservicoprofissional.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.developer.microservicoprofissional.api.model.input.TipoProfissionalInput;
import com.developer.microservicoprofissional.domain.model.TipoProfissional;

@Component
public class TipoProfissionalDisassembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public TipoProfissional toDomainObject(TipoProfissionalInput tipoProfissionalInput) {
		var objeto = modelMapper.map(tipoProfissionalInput, TipoProfissional.class);
		return objeto;
	}
	
	public void copyToDomainObject(TipoProfissionalInput tipoProfissionalInput, TipoProfissional tipoProfissional) {
		modelMapper.map(tipoProfissionalInput, tipoProfissional);
	}
	
	
	

}
