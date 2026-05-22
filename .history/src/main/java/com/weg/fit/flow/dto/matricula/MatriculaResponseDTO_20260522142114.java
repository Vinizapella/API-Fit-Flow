package com.weg.fit.flow.dto.matricula;

public record MatriculaResponseDTO(
    Long id,
    Integer mesesContratados,
    Big valorTotal, nomeAluno (String), nomeModalidade
) {
    
}
