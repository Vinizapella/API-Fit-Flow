package com.weg.fit.flow.model;

import java.math.BigDecimal;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "modalidade")
public class Modalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private BigDecimal precoMensal;

    private Boolean ativa = true;

    

    public Modalidade(String nome, BigDecimal precoMensal, Boolean ativa) {
        this.nome = nome;
        this.precoMensal = precoMensal;
        this.ativa = ativa;
    }

    public Modalidade(Long id, String nome, BigDecimal precoMensal, Boolean ativa) {
        this.id = id;
        this.nome = nome;
        this.precoMensal = precoMensal;
        this.ativa = ativa;
    }

    public Modalidade() {
    }

    

    
}
