package com.theo.service;

import com.theo.dto.paciente.PacienteCreateDto;
import com.theo.dto.paciente.PacienteDto;
import com.theo.dto.paciente.PacienteUpdateDto;

import java.util.List;

public interface PacienteService {

    List<PacienteDto> listarTodos();

    PacienteDto buscarPorId(Long id);

    PacienteDto registrar(PacienteCreateDto pacienteCreateDto);

    PacienteDto actualizar(PacienteUpdateDto pacienteUpdateDto);

    PacienteDto eliminarPorId(Long id);

}
