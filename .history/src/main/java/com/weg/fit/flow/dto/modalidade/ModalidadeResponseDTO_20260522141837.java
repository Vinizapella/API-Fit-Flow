package com.weg.fit.flow.dto.modalidade;

import java.math.BigDecimal;

public record ModalidadeResponseDTO(
    Long id,
    String nome,
    BigDecimal precoMensal, ativa
) {
    
}
