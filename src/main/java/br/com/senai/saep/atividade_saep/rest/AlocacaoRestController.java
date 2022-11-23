package br.com.senai.saep.atividade_saep.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.saep.atividade_saep.model.Alocacao;
import br.com.senai.saep.atividade_saep.repository.AlocacaoRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/alocacao")
public class AlocacaoRestController {

	@Autowired
	private AlocacaoRepository alocacaoRepository;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Iterable<Alocacao> listAlocacao(){
		return alocacaoRepository.findAll();
	}
	
	@RequestMapping(value = "/{area}", method = RequestMethod.GET)
	public Iterable<Alocacao> listAlocacaoFindByArea(@PathVariable("area") int area){
		return alocacaoRepository.findByArea(area);
	}
	
}
