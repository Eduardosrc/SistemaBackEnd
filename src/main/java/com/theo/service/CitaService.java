package com.theo.service;

import com.theo.dto.cita.CitaCreateDto;
import com.theo.dto.cita.CitaDto;
import com.theo.dto.cita.CitaUpdateDto;

import java.util.List;

public interface CitaService {

    List<CitaDto> listarTodas();

    CitaDto buscarPorId(Long id);

    CitaDto registrar(CitaCreateDto citaCreateDto);

    CitaDto actualizar(CitaUpdateDto citaUpdateDto);

    CitaDto eliminarPorId(Long id);

}
