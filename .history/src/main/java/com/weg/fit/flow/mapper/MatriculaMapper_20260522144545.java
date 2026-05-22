package com.weg.fit.flow.mapper;

import org.springframework.stereotype.Component;

import com.weg.fit.flow.dto.matricula.MatriculaResponseDTO;
import com.weg.fit.flow.model.MatriculaModalidade;

@Component
public class MatriculaMapper {
    private final AlunoMapper alunoMapper;

    MatriculaMapper(AlunoMapper alunoMapper) {
        this.alunoMapper = alunoMapper;
    }

    public MatriculaResponseDTO toResponse(
        MatriculaModalidade matriculaModalidade
    ){
        return new MatriculaResponseDTO(alunoMapper), mesesContratados, valorTotal, nomeAluno, nomeModalidade)
    }
}
