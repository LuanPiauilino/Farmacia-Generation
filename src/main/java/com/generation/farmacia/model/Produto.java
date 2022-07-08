package com.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Necessário inserir o nome da produto.")
	private String nome;

	@NotBlank(message = "Necessário inserir o modo de uso desse produto.")
	private String jeitoUsar;
	
	@NotNull
	private boolean generico;

	@NotBlank(message = "Necessário inserior o nome do fabricante do produto.")
	private String fabricante;

	@NotNull
	@DecimalMin(value = "0.1")
	private double preco;

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getJeitoUsar() {
		return jeitoUsar;
	}

	public void setJeitoUsar(String jeitoUsar) {
		this.jeitoUsar = jeitoUsar;
	}

	public boolean isGenerico() {
		return generico;
	}

	public void setGenerico(boolean generico) {
		this.generico = generico;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
