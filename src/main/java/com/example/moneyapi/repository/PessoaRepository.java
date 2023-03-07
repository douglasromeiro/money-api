package com.example.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.example.moneyapi.model.Pessoa;

@Controller
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
