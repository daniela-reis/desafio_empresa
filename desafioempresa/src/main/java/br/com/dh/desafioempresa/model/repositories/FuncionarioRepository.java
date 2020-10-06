package br.com.dh.desafioempresa.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.dh.desafioempresa.model.entities.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {

}
