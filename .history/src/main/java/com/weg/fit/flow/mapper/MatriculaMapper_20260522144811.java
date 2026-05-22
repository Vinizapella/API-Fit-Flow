package com.weg.fit.flow.mapper;

import org.springframework.stereotype.Component;

import com.weg.fit.flow.dto.matriculaModalidade.MatriculaModalidadeResponseDTO;
import com.weg.fit.flow.model.MatriculaModalidade;

@Component
public class MatriculaModalidadeMapper {
    public MatriculaModalidadeResponseDTO toResponse(
        MatriculaModalidade matriculaModalidade
    ){
        return new MatriculaModalidadeResponseDTO(
            matriculaModalidade.getId(), 
            matriculaModalidade.getMesesContratados(), 
            matriculaModalidade.getValorTotal(), 
            matriculaModalidade.getAluno().getNome(), 
            matriculaModalidade.getModalidade().getNome()
        );
    }
}
