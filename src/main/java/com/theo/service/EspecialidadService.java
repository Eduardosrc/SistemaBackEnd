package com.theo.service;

import com.theo.dto.especialidad.EspecialidadCreateDto;
import com.theo.dto.especialidad.EspecialidadDto;
import com.theo.dto.especialidad.EspecialidadUpdateDto;

import java.util.List;

public interface EspecialidadService {

    List<EspecialidadDto> listarTodas();

    EspecialidadDto buscarPorId(Long id);

    EspecialidadDto registrar(EspecialidadCreateDto especialidadCreateDto);

    EspecialidadDto actualizar(EspecialidadUpdateDto especialidadUpdateDto);

    EspecialidadDto eliminarPorId(Long id);

}
