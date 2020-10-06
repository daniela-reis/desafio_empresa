package br.com.dh.desafioempresa.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.dh.desafioempresa.model.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
