package br.com.senai.saep.atividade_saep.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import br.com.senai.saep.atividade_saep.model.Automovel;
import br.com.senai.saep.atividade_saep.model.Erro;
import br.com.senai.saep.atividade_saep.model.Sucesso;
import br.com.senai.saep.atividade_saep.repository.AutomovelRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/automovel")
public class AutomovelRestController {
	
	@Autowired
	private AutomovelRepository repository;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Automovel automovelFindById(@PathVariable("id") Long id) {
		
		return repository.findById(id).get();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> vender(@PathVariable("id") Long id){
		Optional<Automovel> automovel = repository.findById(id);
		
		if (automovel.get().getId() == id) {
			repository.delete(automovel.get());
			
			
			Sucesso sucesso = new Sucesso(HttpStatus.OK, "Sucesso");
			return new ResponseEntity<Object>(sucesso, HttpStatus.OK);
		} else {
			Erro erro = new Erro(HttpStatus.INTERNAL_SERVER_ERROR, "Não foi possível vender o automovel", null);
			return new ResponseEntity<Object>(erro, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
