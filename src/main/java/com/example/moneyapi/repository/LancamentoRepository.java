package com.example.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.example.moneyapi.model.Lancamento;
import com.example.moneyapi.repository.lancamento.LancamentoRepositoryQuery;

@Controller
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
