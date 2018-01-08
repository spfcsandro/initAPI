package com.kasale.initapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kasale.initapi.service.ExemploService;
import com.kasale.initapi.util.SenhaUtils;

@RestController
@RequestMapping ( "/api/exemplo" )
public class ExemploController {

	@Autowired
	ExemploService exemploService;
	
	
	@GetMapping ( value = "/{nome}" )
	public String exemplo(@PathVariable("nome") String nome) {
		
		String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
		boolean senhaValida = SenhaUtils.senhaValida( "123456",senhaEncoded);
		
		if(senhaValida) {
			exemploService.testarServico(SenhaUtils.gerarBCrypt("123456"));
		}
		return "Olá " + nome;
	}
	
}
