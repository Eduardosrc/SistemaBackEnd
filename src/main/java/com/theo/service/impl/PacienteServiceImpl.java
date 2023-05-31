package com.theo.service.impl;

import com.theo.dto.paciente.PacienteCreateDto;
import com.theo.dto.paciente.PacienteDto;
import com.theo.dto.paciente.PacienteUpdateDto;
import com.theo.mapper.PacienteMapper;
import com.theo.model.Paciente;
import com.theo.repository.PacienteRepository;
import com.theo.service.PacienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PacienteServiceImpl implements PacienteService {

    PacienteRepository repo;

    @Override
    public List<PacienteDto> listarTodos() {
        return PacienteMapper.instancia.entityListToEntityDtoList(repo.findAll());
    }

    @Override
    public PacienteDto buscarPorId(Long id) {
        Optional<Paciente> paciente = repo.findById(id);
        if(paciente.isPresent()){
            return PacienteMapper.instancia.entityToEntityDto(paciente.get());
        }else{
            return null;
        }
    }

    @Override
    public PacienteDto registrar(PacienteCreateDto pacienteCreateDto) {
        PacienteDto pacienteDto = PacienteMapper.instancia.entityCreateToEntityDto(pacienteCreateDto);
        Paciente response = repo.save(PacienteMapper.instancia.entityDtoToEntity(pacienteDto));
        return PacienteMapper.instancia.entityToEntityDto(response);
    }

    @Override
    public PacienteDto actualizar(PacienteUpdateDto pacienteUpdateDto) {
        PacienteDto pacienteDto = PacienteMapper.instancia.entityUpdateToEntityDto(pacienteUpdateDto);
        Paciente response = repo.save(PacienteMapper.instancia.entityDtoToEntity(pacienteDto));
        return PacienteMapper.instancia.entityToEntityDto(response);
    }

    @Override
    public PacienteDto eliminarPorId(Long id) {
        return null;
    }
}
