package com.weg.fit.flow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.fit.flow.mapper.ModalidadeMapper;
import com.weg.fit.flow.service.ModalidadeService;

@RestController
@RequestMapping("/modalidades")
public class ModalidadeController {
    
    private final ModalidadeMapper modalidadeMapper;

    private final ModalidadeService modalidadeService;

    

}
