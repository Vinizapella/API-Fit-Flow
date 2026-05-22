package com.weg.fit.flow.model;

import java.math.BigDecimal;

import org.hibernate.id.factory.spi.GenerationTypeStrategy;

import jakarta.annotation.Generated;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "modalidade")
public class Modalidade {

    @Id
    @Generated(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private BigDecimal mensalidade;

    private 

}
