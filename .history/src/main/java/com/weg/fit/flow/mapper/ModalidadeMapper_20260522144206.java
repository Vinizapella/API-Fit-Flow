package com.weg.fit.flow.mapper;

import com.weg.fit.flow.dto.modalidade.ModalidadeCreateDTO;
import com.weg.fit.flow.dto.modalidade.ModalidadeResponseDTO;
import com.weg.fit.flow.model.Modalidade;

public class ModalidadeMapper {
    public Modalidade toEntity(
        ModalidadeCreateDTO modalidadeCreateDTO
    ){
        return new Modalidade(
            modalidadeCreateDTO.nome(),
            modalidadeCreateDTO.precoMensal(),
            null
        );
    }
    public ModalidadeResponseDTO toResponse(
        Modalidade modalidade
    ){
        return new ModalidadeResponseDTO
    }
}
