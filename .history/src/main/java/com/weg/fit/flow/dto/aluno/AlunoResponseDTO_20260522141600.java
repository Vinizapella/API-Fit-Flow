package com.weg.fit.flow.dto.aluno;

public record AlunoResponseDTO(
    Long id, 
    String nome,
    String matricula,
    String email
) {
    
}
