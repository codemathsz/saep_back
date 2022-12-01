package br.com.senai.saep.atividade_saep.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public List<Alocacao> listAlocacaoFindByArea(@PathVariable("area") int area){
		
		if (area == 0) {
			return null;
		}else {
		
			List<Alocacao> alocacao = alocacaoRepository.findByAreaId(area);
		
			return alocacao;
		}
	}
	
}
