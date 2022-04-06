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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "veiculo")
@Entity
@Getter
@Setter 
public class Multa {
	@Column(name = "idMulta")
	@Id
	private int id;
	
	@Column(name = "dataAplicacao")
	private LocalDate data;
	
	@Column(name = "vencimento")
	private LocalDate vencimento;
	
	@Column(name = "estadoMulta")
	private String estado;
	
	@Column(name = "orgao")
	private String orgao;
	
	@OneToOne
	@JoinColumn(name = "veiculo")
	private Veiculo veiculo;
	
	@OneToOne
	@JoinColumn(name = "condutor")
	private Pessoa condutor;
	
}
