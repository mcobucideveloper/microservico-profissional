package com.developer.microservicoprofissional.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import javax.validation.Valid;

import com.developer.microservicoprofissional.api.assembler.TipoProfissionalAssembler;
import com.developer.microservicoprofissional.api.assembler.TipoProfissionalDisassembler;
import com.developer.microservicoprofissional.api.model.TipoProfissionalModel;
import com.developer.microservicoprofissional.api.model.input.TipoProfissionalInput;
import com.developer.microservicoprofissional.domain.model.TipoProfissional;
import com.developer.microservicoprofissional.service.TipoProfissionalService;

@RestController
@RequestMapping(value = "/tipoProfissional")
public class TipoProfissionalController {
	
	
	@Autowired
	private TipoProfissionalService tipoProfissionalService;
	
	@Autowired
	private TipoProfissionalDisassembler tipoProfissionalDisassembler;
	
	@Autowired
	private TipoProfissionalAssembler tipoProfissionalAssembler;
	
	@PostMapping  
	@ResponseStatus(HttpStatus.CREATED)
	public TipoProfissionalModel adicionar(@RequestBody @Valid TipoProfissionalInput tipoProfissionalInput) {
		TipoProfissional tipoProfissional = tipoProfissionalDisassembler.toDomainObject(tipoProfissionalInput);
		tipoProfissional = tipoProfissionalService.salvar(tipoProfissional);
		
		return tipoProfissionalAssembler.toModel(tipoProfissional);
	}

}
