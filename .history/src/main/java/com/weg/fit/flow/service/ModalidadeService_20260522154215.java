package com.weg.fit.flow.service;

import org.springframework.stereotype.Service;

import com.weg.fit.flow.dto.modalidade.ModalidadeCreateDTO;
import com.weg.fit.flow.dto.modalidade.ModalidadeResponseDTO;
import com.weg.fit.flow.mapper.ModalidadeMapper;
import com.weg.fit.flow.model.Modalidade;
import com.weg.fit.flow.repositorio.ModalidadeRepositorio;

@Service
public class ModalidadeService {

    private final ModalidadeRepositorio modalidadeRepositorio;

    private final ModalidadeMapper modalidadeMapper;

    public ModalidadeService(
        ModalidadeRepositorio modalidadeRepositorio, 
        ModalidadeMapper modalidadeMapper
    ) {
        this.modalidadeRepositorio = modalidadeRepositorio;
        this.modalidadeMapper = modalidadeMapper;
    }

    public ModalidadeResponseDTO criarModalidade(
        ModalidadeCreateDTO modalidadeCreateDTO
    ){
        Modalidade modalidade = modalidadeMapper.toEntity(modalidadeCreateDTO);
        modalidadeRepositorio.save(m)
    }
    
}
