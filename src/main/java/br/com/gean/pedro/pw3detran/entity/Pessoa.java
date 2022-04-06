package br.com.gean.pedro.pw3detran.entity;


import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
@Getter
@Setter 
public class Pessoa {
	
	@Column(name = "idPessoa")
	@Id
	int id;
	
	@Column(name = "nome")
	String nome;
	
	@Column(name = "endereco")
	String endereco;
}
