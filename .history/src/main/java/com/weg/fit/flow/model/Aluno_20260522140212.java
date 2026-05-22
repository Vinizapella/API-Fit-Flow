package com.weg.fit.flow.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "aluno")
public class Aluno {

    @Id
    @Generated
    private Long id;

}
