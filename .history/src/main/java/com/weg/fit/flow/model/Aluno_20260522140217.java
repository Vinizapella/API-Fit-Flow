package com.weg.fit.flow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "aluno")
public class Aluno {

    @Id
    @GeneratedValue()
    private Long id;

}
