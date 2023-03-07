package com.example.moneyapi.resource.filter;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class LancamentoFilter {

	private String descricao;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate lancamentoDe;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate lancamentoAte;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getLancamentoDe() {
		return lancamentoDe;
	}
	public void setLancamentoDe(LocalDate lancamentoDe) {
		this.lancamentoDe = lancamentoDe;
	}
	public LocalDate getLancamentoAte() {
		return lancamentoAte;
	}
	public void setLancamentoAte(LocalDate lancamentoAte) {
		this.lancamentoAte = lancamentoAte;
	}
	
	
}
