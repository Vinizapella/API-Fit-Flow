package com.weg.fit.flow.mapper;

import com.weg.fit.flow.dto.aluno.AlunoCreateDTO;
import com.weg.fit.flow.dto.aluno.AlunoResponseDTO;
import com.weg.fit.flow.model.Aluno;
import org.springframework.stereotype.Component;

@Component
public class AlunoMapper {

    public Aluno toEntity(
        AlunoCreateDTO alunoCreateDTO
    ){
        return new Aluno(
            alunoCreateDTO.nome(), 
            alunoCreateDTO.matricula(), 
            alunoCreateDTO.email());
    }

    public AlunoResponseDTO toResponse(
        Aluno aluno
    ){
        return new AlunoResponseDTO(
            aluno.getId(),
            aluno.getNome(),
            aluno.getMatricula(),
            aluno.getEmail()
        );
    }
}
