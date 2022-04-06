package br.com.gean.pedro.pw3detran.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.gean.pedro.pw3detran.enums.EstadoMultaEnum;

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
	
	@Enumerated(EnumType.STRING)
	@Column(name = "estadoMulta")
	private EstadoMultaEnum estado;
	
	@Column(name = "orgao")
	private String orgao;
	
	@ManyToOne
	@JoinColumn(name = "veiculo")
	private Veiculo veiculo;
	
	@ManyToOne
	@JoinColumn(name = "condutor")
	private Pessoa condutor;
	
}
