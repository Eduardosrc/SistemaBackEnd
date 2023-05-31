package com.theo.service;

import com.theo.dto.medico.MedicoCreateDto;
import com.theo.dto.medico.MedicoDto;
import com.theo.dto.medico.MedicoUpdateDto;

import java.util.List;

public interface MedicoService {

    List<MedicoDto> listarTodos();

    MedicoDto buscarPorId(Long id);

    MedicoDto registrar(MedicoCreateDto medicoCreateDto);

    MedicoDto actualizar(MedicoUpdateDto medicoUpdateDto);

    MedicoDto eliminarPorId(Long id);

}
