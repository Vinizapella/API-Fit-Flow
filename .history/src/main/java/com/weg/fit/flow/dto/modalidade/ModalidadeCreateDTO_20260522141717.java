package com.weg.fit.flow.dto.modalidade;

import java.math.BigDecimal;

public record ModalidadeCreateDTO(
    String nome, 
    BigDecimal precoMensal
) {

}
