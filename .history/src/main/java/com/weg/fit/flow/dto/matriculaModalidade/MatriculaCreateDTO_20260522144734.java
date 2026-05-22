package com.weg.fit.flow.dto.matriculaModalidade;

public record MatriculaCreateDTO(
    Long alunoId, 
    Long modalidadeId,
    Integer mesesContratados
) {
    
}
