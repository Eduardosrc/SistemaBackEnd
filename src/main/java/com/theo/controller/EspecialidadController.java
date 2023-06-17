package com.theo.controller;

import com.theo.dto.especialidad.EspecialidadCreateDto;
import com.theo.dto.especialidad.EspecialidadDto;
import com.theo.dto.especialidad.EspecialidadUpdateDto;
import com.theo.service.EspecialidadService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("{id}")
    public ResponseEntity<EspecialidadDto> buscarPorId(@PathVariable("id") Long id){
        EspecialidadDto especialidadDto = service.buscarPorId(id);
        if(especialidadDto == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(especialidadDto, HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<EspecialidadDto> registrar(@Valid @RequestBody EspecialidadCreateDto especialidadCreateDto){
        return new ResponseEntity<>(service.registrar(especialidadCreateDto), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<EspecialidadDto> actualizar(@Valid @RequestBody EspecialidadUpdateDto especialidadUpdateDto){
        EspecialidadDto especialidadDto = service.buscarPorId(especialidadUpdateDto.getId());
        if(especialidadDto == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(service.actualizar(especialidadUpdateDto), HttpStatus.OK);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<EspecialidadDto> eliminarPorId(@PathVariable("id") Long id){
        EspecialidadDto especialidadDto = service.eliminarPorId(id);
        if(especialidadDto == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(especialidadDto, HttpStatus.OK);
        }
    }

}
