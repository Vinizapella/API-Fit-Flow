package com.weg.fit.flow.dto.aluno;

public record AlunoResponseDTO(
    String id, 
    String nome,
    String matricula,
    String email
) {
    
}
