package com.weg.fit.flow.mapper;

import org.springframework.stereotype.Component;

import com.weg.fit.flow.dto.matricula.MatriculaResponseDTO;
import com.weg.fit.flow.model.MatriculaModalidade;

@Component
public class MatriculaMapper {
    public MatriculaResponseDTO toResponse(
        MatriculaModalidade matriculaModalidade
    ){
        return new MatriculaResponseDTO(id, mesesContratados, valorTotal, nomeAluno, nomeModalidade)
    }
}
