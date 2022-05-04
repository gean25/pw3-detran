package br.com.gean.pedro.pw3detran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gean.pedro.pw3detran.entity.Pessoa;

public interface PessoaRepository extends JpaRepository <Pessoa, Integer>{

}
