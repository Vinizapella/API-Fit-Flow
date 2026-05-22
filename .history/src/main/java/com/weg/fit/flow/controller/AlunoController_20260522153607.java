package com.weg.fit.flow.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.fit.flow.dto.MensagemDTO;
import com.weg.fit.flow.dto.aluno.AlunoCreateDTO;
import com.weg.fit.flow.dto.aluno.AlunoResponseDTO;
import com.weg.fit.flow.dto.aluno.AlunoUpdateDTO;
import com.weg.fit.flow.mapper.AlunoMapper;
import com.weg.fit.flow.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoMapper alunoMapper;

    private final AlunoService alunoService;

    public AlunoController(
        AlunoMapper alunoMapper, 
        AlunoService alunoService
    ) {
        this.alunoMapper = alunoMapper;
        this.alunoService = alunoService;
    }

    @PostMapping
    public ResponseEntity<AlunoResponseDTO> criarAluno(
        @RequestBody
        AlunoCreateDTO alunoCreateDTO
    ){
        return ResponseEntity.status(HttpStatus.CREATED)
        .body(alunoService.criarAluno(alunoCreateDTO));
    }

    @GetMapping
    public ResponseEntity<List<AlunoResponseDTO>> listarListaDeAlunos(){
        return ResponseEntity.status(HttpStatus.OK)
        .body(alunoService.listarAlunos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoResponseDTO> procurarAlunoPorId(
        @PathVariable
        Long id
    ){
        return ResponseEntity.status(HttpStatus.OK)
        .body(alunoService.procurarAlunoPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlunoResponseDTO> atualizarAluno(
        @RequestBody
        AlunoUpdateDTO alunoUpdateDTO,
        @PathVariable
        Long id
    ){
        return ResponseEntity.status(HttpStatus.OK)
        .body(alunoService.atualizarAluno(alunoUpdateDTO, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MensagemDTO> deletarAluno(
        @PathVariable
        Long id
    ){
        return ResponseEntity.status(status)
    }
    
}
