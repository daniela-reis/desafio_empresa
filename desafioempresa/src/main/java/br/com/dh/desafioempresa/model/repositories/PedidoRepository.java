package br.com.dh.desafioempresa.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.dh.desafioempresa.model.entities.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, String>{

}
