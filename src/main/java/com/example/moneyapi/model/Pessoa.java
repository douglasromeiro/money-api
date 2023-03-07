package com.example.moneyapi.model;

import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pessoa")
public class Pessoa {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long codigo;
	@NotNull
	private String nome;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "logradouro", column = @Column(name="logradouro")),
		@AttributeOverride(name = "numero", column = @Column(name="numero")),
		@AttributeOverride(name = "complemento", column = @Column(name="complemento")),
		@AttributeOverride(name = "bairro", column = @Column(name="bairro")),
		@AttributeOverride(name = "cep", column = @Column(name="cep")),
		@AttributeOverride(name = "cidade", column = @Column(name="cidade")),
		@AttributeOverride(name = "estado", column = @Column(name="estado"))
	})
	private Endereco endereco;
	
	private boolean ativo;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public boolean isInactive() {
		return !this.ativo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ativo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return ativo == other.ativo;
	}
	
	

}
