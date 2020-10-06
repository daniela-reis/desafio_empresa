package br.com.dh.desafioempresa.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id_funcionario;
	private String nome;
	private double salario;
	private String cargo;
	private String email;
	private String senha;
	private boolean habilitado;
	
	public Funcionario() {}

	public Funcionario(String nome, double salario, String cargo, String email, String senha, boolean habilitado) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		this.email = email;
		this.senha = senha;
		this.habilitado = habilitado;
	}

	public int getId_funcionario() {
		return id_funcionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	

}
