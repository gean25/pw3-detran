package br.com.gean.pedro.pw3detran.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.gean.pedro.pw3detran.entity.Pessoa;
import br.com.gean.pedro.pw3detran.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaRepository repository;
	
	private List<Pessoa> dados = new ArrayList<Pessoa>();
	
	@GetMapping
	public List<Pessoa> listarTodos(){
		dados = repository.findAll();
		return dados;
	}
	
	@GetMapping("/{id}")
	public Pessoa buscarPorId(@PathVariable Integer id) {
		Pessoa tipo = new Pessoa();
		tipo = repository.findById(id).get();
		return tipo;
	}
	
	@PostMapping
	public void inserir (@RequestBody Pessoa pessoa)
	{
		repository.save(pessoa);
	}
	
	@PutMapping("/{id}")
	public void atualizar(@PathVariable Integer id, @RequestBody Pessoa pessoa) 
	{
		boolean existe = repository.existsById(id);
		if(existe)
		{
			repository.save(pessoa);
		}
	}
	
	@DeleteMapping("/{id}")
	public void atualizar(@PathVariable Integer id) 
	{
		 repository.deleteById(id);
	}
	
} 
