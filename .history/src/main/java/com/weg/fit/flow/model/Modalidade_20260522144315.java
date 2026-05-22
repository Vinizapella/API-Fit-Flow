package com.weg.fit.flow.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPrecoMensal() {
        return precoMensal;
    }

    public void setPrecoMensal(BigDecimal precoMensal) {
        this.precoMensal = precoMensal;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    

    
}
