package com.weg.fit.flow.repositorio;

import org.springframework.stereotype.Repository;

import com.weg.fit.flow.model.Aluno;

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {
    
}
