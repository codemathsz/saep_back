package br.com.senai.saep.atividade_saep.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.saep.atividade_saep.model.Clientes;
import br.com.senai.saep.atividade_saep.repository.ClientesRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/clientes")
public class ClientesRestController {
	
	@Autowired
	private ClientesRepository repository;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Iterable<Clientes> clientes (){
		
		return repository.findAll();
	}

}
