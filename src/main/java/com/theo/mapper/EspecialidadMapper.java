package com.theo.mapper;

import com.theo.dto.especialidad.EspecialidadCreateDto;
import com.theo.dto.especialidad.EspecialidadDto;
import com.theo.dto.especialidad.EspecialidadUpdateDto;
import com.theo.model.Especialidad;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EspecialidadMapper {

    EspecialidadMapper instancia = Mappers.getMapper(EspecialidadMapper.class);

    List<EspecialidadDto> entityListToEntityDtoList(List<Especialidad> list);

    Especialidad entityDtoToEntity(EspecialidadDto especialidadDto);

    EspecialidadDto entityToEntityDto(Especialidad especialidad);

    EspecialidadDto entityCreateToEntityDto(EspecialidadCreateDto especialidadCreateDto);

    EspecialidadDto entityUpdateToEntityDto(EspecialidadUpdateDto especialidadUpdateDto);

}
