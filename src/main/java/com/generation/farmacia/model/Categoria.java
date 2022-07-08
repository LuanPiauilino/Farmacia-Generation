package com.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Necessário inserir o nome da categoria.")
	private String nome;

	private boolean precisaReceita;

	@NotBlank(message = "Necessário inserir qual é a função dessa categoria.")
	private String funcao;

	private boolean usoInfantil;

	
	
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

	public boolean isPrecisaReceita() {
		return precisaReceita;
	}

	public void setPrecisaReceita(boolean precisaReceita) {
		this.precisaReceita = precisaReceita;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public boolean isUsoInfantil() {
		return usoInfantil;
	}

	public void setUsoInfantil(boolean usoInfantil) {
		this.usoInfantil = usoInfantil;
	}

}
