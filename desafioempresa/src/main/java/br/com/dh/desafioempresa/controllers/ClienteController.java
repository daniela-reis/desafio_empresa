package br.com.dh.desafioempresa.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dh.desafioempresa.model.entities.Cliente;
import br.com.dh.desafioempresa.model.repositories.ClienteRepository;

@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping()
	public Iterable<Cliente> getClientes() {
		return clienteRepository.findAll();
	}
	
	@GetMapping("/{id}") 
	public Optional <Cliente> getById(@PathVariable int id) { 
		return clienteRepository.findById(id); 
	}
	
	@PostMapping()
	public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
		return cliente;
	}

}
