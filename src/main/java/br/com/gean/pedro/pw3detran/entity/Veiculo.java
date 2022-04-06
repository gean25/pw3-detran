package br.com.gean.pedro.pw3detran.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "veiculo")
@Entity
@Getter
@Setter 
public class Veiculo {
	@Column(name = "idVeiculo")
	@Id
	int id;
	@Column(name = "renavam")
	private String renavam;
	@Column(name = "placa")
	private String placa;
	@Column(name = "modelo")
	private String modelo;
	@Column(name = "ano")
	private int ano;
	@OneToMany
	@JoinColumn(name = "proprietario")
	private Pessoa Pessoa;
}
