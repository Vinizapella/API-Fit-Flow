package com.weg.fit.flow.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weg.fit.flow.model.Modalidade;

@Repository
public interface ModalidadeRepositorio extends JpaRepository<Modalidade, Object>{
    
}
