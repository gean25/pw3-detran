package br.com.gean.pedro.pw3detran.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Table(name = "pessoa")
@Entity
@Getter
@Setter 

public class Pessoa {
	
	@Max(value = 1000)
	@Min(value = 0)
	@NotNull(message = "Campo Obrigatório") 
	@Column(name = "idPessoa")
	@Id
	private int id;
	
	@NotBlank(message = "Campo Obrigatório") 
	@Length(max = 30)
	@Column(name = "nome")
	private String nome;
	
	@NotBlank(message = "Campo Obrigatório") 
	@Column(name = "endereco")
	private String endereco;
}
