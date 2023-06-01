package com.theo.controller;

import com.theo.dto.medico.MedicoCreateDto;
import com.theo.dto.medico.MedicoDto;
import com.theo.dto.medico.MedicoUpdateDto;
import com.theo.service.MedicoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/medicos")
@AllArgsConstructor
public class MedicoController {

    MedicoService service;

    @GetMapping
    public ResponseEntity<List<MedicoDto>> listar(){
        return new ResponseEntity<>(service.listarTodos(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<MedicoDto> buscarPorId(@PathVariable("id") Long id){
        MedicoDto medicoDto = service.buscarPorId(id);
        if(medicoDto == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(medicoDto, HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<MedicoDto> registrar(@Valid @RequestBody MedicoCreateDto medicoCreateDto){
        return new ResponseEntity<>(service.registrar(medicoCreateDto), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<MedicoDto> actualizar(@Valid @RequestBody MedicoUpdateDto medicoUpdateDto){
        MedicoDto medicoDto = service.buscarPorId(medicoUpdateDto.getId());
        if(medicoDto == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(service.actualizar(medicoUpdateDto), HttpStatus.OK);
        }
    }

}
