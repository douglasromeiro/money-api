package com.example.moneyapi.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.moneyapi.model.Pessoa;
import com.example.moneyapi.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRespoitory;
	
	public Pessoa atualizarPessoa(Long codigo, Pessoa pessoa) {
		
		Optional<Pessoa> pessoaSalva = buscaPessoaPeloCodigo(codigo);
		
		BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
		
		Pessoa pessoaAtualizada = pessoaSalva.get();
		
		return pessoaRespoitory.save(pessoaAtualizada);
		
	}

	public Pessoa atualizatStatusPessoa(Long codigo, Boolean ativo) {
		Optional<Pessoa> pessoaSalva = buscaPessoaPeloCodigo(codigo);
		Pessoa pessoa = pessoaSalva.get();
		pessoa.setAtivo(ativo);
		
		return pessoaRespoitory.save(pessoa);
		
	}
	
	public Optional<Pessoa> buscaPessoaPeloCodigo(Long codigo) {
		Optional<Pessoa> pessoaSalva = pessoaRespoitory.findById(codigo);
		if(!pessoaSalva.isPresent()) {
			throw new EmptyResultDataAccessException(1);
		}
		return pessoaSalva;
	}
	

}
