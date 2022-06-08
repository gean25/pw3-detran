package br.com.gean.pedro.pw3detran.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.Length;

@Table(name = "veiculo")
@Entity
@Getter
@Setter 
public class Veiculo {
	
	@Max(value = 1000000)
	@NotBlank(message = "Campo Obrigatório")
	@Column(name = "idVeiculo")
	@Id
	int id;
	
	@NotBlank(message = "Campo Obrigatório")
	@Column(name = "renavam")
	private String renavam;
	
	@NotBlank(message = "Campo Obrigatório")
	@Column(name = "placa")
	private String placa;
	
	@Column(name = "modelo")
	private String modelo;
	
	@Column(name = "ano")
	private int ano;
	
	@Length(max = 40)
	@NotBlank(message = "Campo Obrigatório")
	@ManyToOne
	@JoinColumn(name = "proprietario")
	private Pessoa Pessoa;
}
