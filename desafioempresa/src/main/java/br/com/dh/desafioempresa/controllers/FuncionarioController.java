package br.com.dh.desafioempresa.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dh.desafioempresa.model.entities.Funcionario;
import br.com.dh.desafioempresa.model.repositories.FuncionarioRepository;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@GetMapping()
	public Iterable<Funcionario> getFuncionarios() {
		return funcionarioRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional <Funcionario> getById(@PathVariable int id){
		return funcionarioRepository.findById(id);
	}
	
	@PostMapping()
	public Funcionario cadastrarFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	
	@PutMapping("salario/{idFuncionario}")
	public Funcionario reajustarSalario(@PathVariable int idFuncionario, @RequestBody Funcionario dadosFuncionario) throws Exception{
		
		Funcionario funcionarioDB = funcionarioRepository.findById(idFuncionario)
				.orElseThrow(() -> new IllegalAccessException());
		
		if(dadosFuncionario.getSalario() != funcionarioDB.getSalario()) funcionarioDB.setSalario(dadosFuncionario.getSalario());
		
		funcionarioRepository.save(funcionarioDB); 
		
		return funcionarioDB;
	}
	
	@PutMapping("demissao/{idFuncionario}")
	public Funcionario demitirFuncionario(@PathVariable int idFuncionario, @RequestBody Funcionario dadosFuncionario) throws Exception{
		
		Funcionario funcionarioDB = funcionarioRepository.findById(idFuncionario)
				.orElseThrow(() -> new IllegalAccessException());
		
		if(dadosFuncionario.getHabilitado() != funcionarioDB.getHabilitado()) funcionarioDB.setHabilitado(dadosFuncionario.getHabilitado());
		
		funcionarioRepository.save(funcionarioDB); 
		
		return funcionarioDB;
	}

}
