package com.weg.fit.flow.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula_modalidade")
public class MatriculaModalidade {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private Integer mesesContratados;

    private BigDecimal valorTotal;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Modalidade modalidade;
    
    

}
