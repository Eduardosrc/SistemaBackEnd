package com.theo.controller;

import com.theo.dto.paciente.PacienteCreateDto;
import com.theo.dto.paciente.PacienteDto;
import com.theo.dto.paciente.PacienteUpdateDto;
import com.theo.service.PacienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/pacientes")
@AllArgsConstructor
public class PacienteController {

    PacienteService service;

    @GetMapping
    public ResponseEntity<List<PacienteDto>> listar(){
        return new ResponseEntity<>(service.listarTodos(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<PacienteDto> buscarPorId(@PathVariable("id") Long id){
        PacienteDto pacienteDto = service.buscarPorId(id);
        if(pacienteDto == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(pacienteDto, HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<PacienteDto> registrar(@Valid @RequestBody PacienteCreateDto pacienteCreateDto){
        return new ResponseEntity<>(service.registrar(pacienteCreateDto), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<PacienteDto> actualizar(@Valid @RequestBody PacienteUpdateDto pacienteUpdateDto){
        PacienteDto pacienteDto = service.buscarPorId(pacienteUpdateDto.getId());
        if(pacienteDto == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(service.actualizar(pacienteUpdateDto), HttpStatus.OK);
        }
    }

}
