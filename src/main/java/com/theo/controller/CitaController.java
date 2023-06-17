package com.theo.controller;

import com.theo.dto.cita.CitaCreateDto;
import com.theo.dto.cita.CitaDto;
import com.theo.dto.cita.CitaUpdateDto;
import com.theo.service.CitaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/citas")
@AllArgsConstructor
public class CitaController {

    CitaService service;

    @GetMapping
    public ResponseEntity<List<CitaDto>> listar(){
        return new ResponseEntity<>(service.listarTodas(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<CitaDto> buscarPorId(@PathVariable("id") Long id){
        CitaDto citaDto = service.buscarPorId(id);
        if(citaDto == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(citaDto, HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<CitaDto> registrar(@Valid @RequestBody CitaCreateDto citaCreateDto){
        return new ResponseEntity<>(service.registrar(citaCreateDto), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<CitaDto> actualizar(@Valid @RequestBody CitaUpdateDto citaUpdateDto){
        CitaDto citaDto = service.buscarPorId(citaUpdateDto.getId());
        if(citaDto == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(service.actualizar(citaUpdateDto), HttpStatus.OK);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<CitaDto> eliminarPorId(@PathVariable("id") Long id){
        CitaDto citaDto = service.eliminarPorId(id);
        if(citaDto == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(citaDto, HttpStatus.OK);
        }
    }

}
