package com.theo.service.impl;

import com.theo.dto.cita.CitaCreateDto;
import com.theo.dto.cita.CitaDto;
import com.theo.dto.cita.CitaUpdateDto;
import com.theo.mapper.CitaMapper;
import com.theo.model.Cita;
import com.theo.repository.CitaRepository;
import com.theo.service.CitaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CitaServiceImpl implements CitaService {

    CitaRepository repo;

    @Override
    public List<CitaDto> listarTodas() {
        return CitaMapper.instancia.entityListToEntityDtoList(repo.findAll());
    }

    @Override
    public CitaDto buscarPorId(Long id) {
        Optional<Cita> cita = repo.findById(id);
        if(cita.isPresent()){
            return CitaMapper.instancia.entityToEntityDto(cita.get());
        }else{
            return null;
        }
    }

    @Override
    public CitaDto registrar(CitaCreateDto citaCreateDto) {
        CitaDto citaDto = CitaMapper.instancia.entityCreateToEntityDto(citaCreateDto);
        Cita response = repo.save(CitaMapper.instancia.entityDtoToEntity(citaDto));
        return CitaMapper.instancia.entityToEntityDto(response);
    }

    @Override
    public CitaDto actualizar(CitaUpdateDto citaUpdateDto) {
        CitaDto citaDto = CitaMapper.instancia.entityUpdateToEntityDto(citaUpdateDto);
        Cita response = repo.save(CitaMapper.instancia.entityDtoToEntity(citaDto));
        return CitaMapper.instancia.entityToEntityDto(response);
    }

    @Override
    public CitaDto eliminarPorId(Long id) {
        return null;
    }
}
