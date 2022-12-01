package br.com.senai.saep.atividade_saep.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.saep.atividade_saep.model.Concessionaria;
import br.com.senai.saep.atividade_saep.repository.ConcessionariaRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/concessionaria")
public class ConcessionariaRestController {
	
	@Autowired
	private ConcessionariaRepository repository;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public Iterable<Concessionaria> concessionaria(){
		
		return repository.findAll();
	}
	

}
