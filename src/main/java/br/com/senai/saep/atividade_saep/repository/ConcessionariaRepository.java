package br.com.senai.saep.atividade_saep.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.saep.atividade_saep.model.Concessionaria;

@Repository
public interface ConcessionariaRepository extends PagingAndSortingRepository<Concessionaria, Long>{

	
}
