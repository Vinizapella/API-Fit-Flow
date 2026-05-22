package com.weg.fit.flow.service;

import org.springframework.stereotype.Service;

import com.weg.fit.flow.mapper.ModalidadeMapper;
import com.weg.fit.flow.repositorio.ModalidadeRepositorio;

@Service
public class ModalidadeService {

    private final ModalidadeRepositorio modalidadeRepositorio;

    private final ModalidadeMapper modalidadeMapper;

    public ModalidadeService(
        ModalidadeRepositorio modalidadeRepositorio, 
        ModalidadeMapper modalidadeMapper) {
        this.modalidadeRepositorio = modalidadeRepositorio;
        this.modalidadeMapper = modalidadeMapper;
    }

    
    
}
