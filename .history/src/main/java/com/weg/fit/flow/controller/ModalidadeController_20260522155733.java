package com.weg.fit.flow.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.fit.flow.dto.modalidade.ModalidadeCreateDTO;
import com.weg.fit.flow.dto.modalidade.ModalidadeResponseDTO;
import com.weg.fit.flow.mapper.ModalidadeMapper;
import com.weg.fit.flow.service.ModalidadeService;

@RestController
@RequestMapping("/modalidades")
public class ModalidadeController {
    
    private final ModalidadeMapper modalidadeMapper;

    private final ModalidadeService modalidadeService;

    public ModalidadeController(
        ModalidadeMapper modalidadeMapper,
        ModalidadeService modalidadeService
        ) {
        this.modalidadeMapper = modalidadeMapper;
        this.modalidadeService = modalidadeService;
    }

    @PostMapping
    public ResponseEntity<ModalidadeResponseDTO> criarModalidade(
        @RequestBody
        ModalidadeCreateDTO modalidadeCreateDTO
    ){
        return ResponseEntity.status(HttpStatus.CREATED)
        .body(body)
    }

}
