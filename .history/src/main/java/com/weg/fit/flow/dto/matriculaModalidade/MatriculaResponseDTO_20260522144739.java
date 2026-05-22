package com.weg.fit.flow.dto.matriculaModalidade;

import java.math.BigDecimal;

public record MatriculaModalidadeResponseDTO(
    Long id,
    Integer mesesContratados,
    BigDecimal valorTotal, 
    String nomeAluno,
    String nomeModalidade
) {
    
}
