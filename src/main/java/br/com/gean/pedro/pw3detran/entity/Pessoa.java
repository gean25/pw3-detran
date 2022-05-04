package br.com.gean.pedro.pw3detran.entity;




import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "pessoa")
@Entity
@Getter
@Setter 
public class Pessoa {
	
	@Column(name = "idPessoa")
	@Id
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "endereco")
	private String endereco;
}
