package com.weg.fit.flow.repositorio;

import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {
    
}
