package com.weg.fit.flow.dto.matricula;

import java.math.BigDecimal;

public record MatriculaResponseDTO(
    Long id,
    Integer mesesContratados,
    BigDecimal valorTotal, 
    String nomeAluno,
     nomeModalidade
) {
    
}
