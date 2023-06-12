package com.theo.service.impl;

import com.theo.dto.medico.MedicoCreateDto;
import com.theo.dto.medico.MedicoDto;
import com.theo.dto.medico.MedicoUpdateDto;
import com.theo.mapper.MedicoMapper;
import com.theo.model.Medico;
import com.theo.repository.MedicoRepository;
import com.theo.service.MedicoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MedicoServiceImpl implements MedicoService {

    MedicoRepository repo;

    @Override
    public List<MedicoDto> listarTodos() {
        return MedicoMapper.instancia.entityListToEntityDtoList(repo.findAll());
    }

    @Override
    public MedicoDto buscarPorId(Long id) {
        Optional<Medico> medico = repo.findById(id);
        if(medico.isPresent()){
            return MedicoMapper.instancia.entityToEntityDto(medico.get());
        }else{
            return null;
        }
    }

    @Override
    public MedicoDto registrar(MedicoCreateDto medicoCreateDto) {
        medicoCreateDto.setEstado(true);
        MedicoDto medicoDto = MedicoMapper.instancia.entityCreateToEntityDto(medicoCreateDto);
        Medico response = repo.save(MedicoMapper.instancia.entityDtoToEntity(medicoDto));
        return MedicoMapper.instancia.entityToEntityDto(response);
    }

    @Override
    public MedicoDto actualizar(MedicoUpdateDto medicoUpdateDto) {
        MedicoDto medicoDto = MedicoMapper.instancia.entityUpdateToEntityDto(medicoUpdateDto);
        Medico response = repo.save(MedicoMapper.instancia.entityDtoToEntity(medicoDto));
        return MedicoMapper.instancia.entityToEntityDto(response);
    }

    @Override
    public MedicoDto eliminarPorId(Long id) {
        Optional<Medico> medico = repo.findById(id);
        if(medico.isPresent()){
            repo.deleteMedicoById(id);
            return MedicoMapper.instancia.entityToEntityDto(medico.get());
        }else{
            return null;
        }
    }
}
