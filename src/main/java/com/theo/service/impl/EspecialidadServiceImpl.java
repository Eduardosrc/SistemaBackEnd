package com.theo.service.impl;

import com.theo.dto.especialidad.EspecialidadCreateDto;
import com.theo.dto.especialidad.EspecialidadDto;
import com.theo.dto.especialidad.EspecialidadUpdateDto;
import com.theo.mapper.EspecialidadMapper;
import com.theo.model.Especialidad;
import com.theo.repository.EspecialidadRepository;
import com.theo.service.EspecialidadService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EspecialidadServiceImpl implements EspecialidadService {

    EspecialidadRepository repo;

    @Override
    public List<EspecialidadDto> listarTodas() {
        return EspecialidadMapper.instancia.entityListToEntityDtoList(repo.findAll());
    }

    @Override
    public EspecialidadDto buscarPorId(Long id) {
        Optional<Especialidad> especialidad = repo.findById(id);
        if(especialidad.isPresent()){
            return EspecialidadMapper.instancia.entityToEntityDto(especialidad.get());
        }else{
            return null;
        }
    }

    @Override
    public EspecialidadDto registrar(EspecialidadCreateDto especialidadCreateDto) {
        EspecialidadDto especialidadDto = EspecialidadMapper.instancia.entityCreateToEntityDto(especialidadCreateDto);
        Especialidad response = repo.save(EspecialidadMapper.instancia.entityDtoToEntity(especialidadDto));
        return EspecialidadMapper.instancia.entityToEntityDto(response);
    }

    @Override
    public EspecialidadDto actualizar(EspecialidadUpdateDto especialidadUpdateDto) {
        EspecialidadDto especialidadDto = EspecialidadMapper.instancia.entityUpdateToEntityDto(especialidadUpdateDto);
        Especialidad response = repo.save(EspecialidadMapper.instancia.entityDtoToEntity(especialidadDto));
        return EspecialidadMapper.instancia.entityToEntityDto(response);
    }

    @Override
    public EspecialidadDto eliminarPorId(Long id) {
        return null;
    }
}
