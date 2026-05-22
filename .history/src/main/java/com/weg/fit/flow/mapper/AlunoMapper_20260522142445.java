package com.weg.fit.flow.mapper;

import com.weg.fit.flow.dto.aluno.AlunoCreateDTO;
import com.weg.fit.flow.model.Aluno;

public class AlunoMapper {

    public Aluno toEntity(
        AlunoCreateDTO alunoCreateDTO
    ){
        return new Aluno(
            nome, 
            matricula, 
            email)
    }
    
}
