package com.weg.fit.flow.dto.matricula;

public record MatriculaResponseDTO(
    Long id,
    Integer mesesContratados, valorTotal, nomeAluno (String), nomeModalidade
) {
    
}
