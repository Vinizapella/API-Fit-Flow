package com.weg.fit.flow.model;

import org.hibernate.id.factory.spi.GenerationTypeStrategy;

import jakarta.annotation.Generated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "modalidade")
public class Modalidade {

    @Id
    @Generated(strategy = GenerationTypeStrategy)

}
