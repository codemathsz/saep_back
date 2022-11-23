package br.com.senai.saep.atividade_saep.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.saep.atividade_saep.model.Clientes;

@Repository
public interface ClientesRepository extends PagingAndSortingRepository<Clientes, Long>{

	
}
