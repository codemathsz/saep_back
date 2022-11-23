package br.com.senai.saep.atividade_saep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.senai.saep.atividade_saep.model.Alocacao;

@Repository
public interface AlocacaoRepository extends PagingAndSortingRepository<Alocacao, Long>{
	
	@Query("SELECT a FROM Alocacao a WHERE a.area = :area")
	public List<Alocacao> findByArea(@Param("area") int area);

}
