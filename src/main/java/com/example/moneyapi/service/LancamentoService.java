package com.example.moneyapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.moneyapi.model.Lancamento;
import com.example.moneyapi.model.Pessoa;
import com.example.moneyapi.repository.LancamentoRepository;
import com.example.moneyapi.repository.PessoaRepository;
import com.example.moneyapi.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento validaLancamento(Lancamento lancamento) {
	
		Pessoa pessoa = pessoaRepository.getOne(lancamento.getPessoa().getCodigo());
		
		if(pessoa == null || pessoa.isInactive()) {
			throw new PessoaInexistenteOuInativaException();
		}
		
		return lancamentoRepository.save(lancamento);
	}
}
