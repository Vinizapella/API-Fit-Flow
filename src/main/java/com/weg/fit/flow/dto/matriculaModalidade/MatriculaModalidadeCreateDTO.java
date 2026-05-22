package com.weg.fit.flow.dto.matriculaModalidade;

public record MatriculaModalidadeCreateDTO(
    Long alunoId, 
    Long modalidadeId,
    Integer mesesContratados
) {
    
}
