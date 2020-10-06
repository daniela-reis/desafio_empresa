package br.com.dh.desafioempresa.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dh.desafioempresa.model.entities.Pedido;
import br.com.dh.desafioempresa.model.repositories.PedidoRepository;

@RestController
@RequestMapping("pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping()
	public Iterable<Pedido> getPedidos() {
		return pedidoRepository.findAll();
	}
	
	@GetMapping("/{id}") 
	public Optional <Pedido> getById(@PathVariable String id) { 
		return pedidoRepository.findById(id); 
	}
	
	@PostMapping()
	public Pedido cadastrarPedido(@RequestBody Pedido pedido) {
		return pedidoRepository.save(pedido);
	}


}
