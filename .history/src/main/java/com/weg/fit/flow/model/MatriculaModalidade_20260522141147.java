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

    

    public MatriculaModalidade(Long id, Integer mesesContratados, BigDecimal valorTotal, Aluno aluno,
            Modalidade modalidade) {
        this.id = id;
        this.mesesContratados = mesesContratados;
        this.valorTotal = valorTotal;
        this.aluno = aluno;
        this.modalidade = modalidade;
    }

    public MatriculaModalidade() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMesesContratados() {
        return mesesContratados;
    }

    public void setMesesContratados(Integer mesesContratados) {
        this.mesesContratados = mesesContratados;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }
    
    

}
