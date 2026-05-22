package com.weg.fit.flow.dto.matricula;

public record MatriculaResponseDTO(
    Long id, mesesContratados, valorTotal, nomeAluno (String), nomeModalidade
) {
    
}
