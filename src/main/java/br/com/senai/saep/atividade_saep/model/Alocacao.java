package br.com.senai.saep.atividade_saep.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Alocacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int area;
	private int quantidade;
	@OneToOne
	private Automovel automovel;
	@ManyToOne
	private Concessionaria concessionaria;
	

}
