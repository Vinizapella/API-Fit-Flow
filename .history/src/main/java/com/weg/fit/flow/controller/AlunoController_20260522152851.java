package com.weg.fit.flow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.fit.flow.mapper.AlunoMapper;
import com.weg.fit.flow.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoMapper alunoMapper;

    private final AlunoService alunoService;

    public AlunoController(AlunoMapper alunoMapper, AlunoService alunoService) {
        this.alunoMapper = alunoMapper;
        this.alunoService = alunoService;
    }

    
    
}
