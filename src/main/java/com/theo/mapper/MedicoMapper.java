package com.theo.mapper;

import com.theo.dto.medico.MedicoCreateDto;
import com.theo.dto.medico.MedicoDto;
import com.theo.dto.medico.MedicoUpdateDto;
import com.theo.model.Medico;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MedicoMapper {

    MedicoMapper instancia = Mappers.getMapper(MedicoMapper.class);

    List<MedicoDto> entityListToEntityDtoList(List<Medico> list);

    Medico entityDtoToEntity(MedicoDto medicoDto);

    MedicoDto entityToEntityDto(Medico medico);

    MedicoDto entityCreateToEntityDto(MedicoCreateDto medicoCreateDto);

    MedicoDto entityUpdateToEntityDto(MedicoUpdateDto medicoUpdateDto);

}
