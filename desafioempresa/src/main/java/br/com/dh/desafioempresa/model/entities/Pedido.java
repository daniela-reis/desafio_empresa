package br.com.dh.desafioempresa.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String nfe;
	private String status;
	private double total;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_cliente")
	@JsonIgnoreProperties("pedidos")
	private Pedido pedido;
		
	
	public Pedido() {}
	
	public Pedido(String nfe, String status, double total) {
		this.nfe = nfe;
		this.status = status;
		this.total = total;
	}
	public String getNfe() {
		return nfe;
	}
	public void setNfe(String nfe) {
		this.nfe = nfe;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	

}
