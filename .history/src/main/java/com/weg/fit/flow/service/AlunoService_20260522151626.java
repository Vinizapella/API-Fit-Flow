package com.weg.fit.flow.service;

import com.weg.fit.flow.dto.aluno.AlunoCreateDTO;
import com.weg.fit.flow.dto.aluno.AlunoResponseDTO;
import com.weg.fit.flow.mapper.AlunoMapper;
import com.weg.fit.flow.model.Aluno;
import com.weg.fit.flow.repositorio.AlunoRepositorio;

public class AlunoService {

    private final AlunoMapper alunoMapper;

    private final AlunoRepositorio alunoRepositorio;

    public AlunoService(
        AlunoMapper alunoMapper, 
        AlunoRepositorio alunoRepositorio) {
        this.alunoMapper = alunoMapper;
        this.alunoRepositorio = alunoRepositorio;
    }



    public AlunoResponseDTO criarAluno(
        AlunoCreateDTO alunoCreateDTO
    ){
        Aluno aluno = alunoMapper.toEntity(alunoCreateDTO);

        alunoRepositorio.save(aluno);

        return alunoMapper.toResponse(aluno);

    }
    
}
