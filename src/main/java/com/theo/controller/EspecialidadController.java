package com.theo.controller;

import com.theo.dto.especialidad.EspecialidadDto;
import com.theo.service.EspecialidadService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/especialidades")
public class EspecialidadController {

    EspecialidadService service;

    @GetMapping
    public ResponseEntity<List<EspecialidadDto>> listar(){
        return new ResponseEntity<>(service.listarTodas(), HttpStatus.OK);
    }

}
