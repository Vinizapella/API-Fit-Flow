package com.weg.fit.flow.mapper;

import org.springframework.stereotype.Component;

import com.weg.fit.flow.dto.matriculaModalidade.MatriculaModalidadeResponseDTO;
import com.weg.fit.flow.model.MatriculaModalidade;

@Component
public class MatriculaMapper {
    public MatriculaModalidadeResponseDTO toResponse(
        MatriculaModalidade matriculaModalidade
    ){
        return new MatriculaResponseDTO(
            matriculaModalidade.getId(), 
            matriculaModalidade.getMesesContratados(), 
            matriculaModalidade.getValorTotal(), 
            matriculaModalidade.getAluno().getNome(), 
            matriculaModalidade.getModalidade().getNome()
        );
    }
}
