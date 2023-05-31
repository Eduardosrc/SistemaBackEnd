package com.theo.mapper;

import com.theo.dto.cita.CitaCreateDto;
import com.theo.dto.cita.CitaDto;
import com.theo.dto.cita.CitaUpdateDto;
import com.theo.model.Cita;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CitaMapper {

    CitaMapper instancia = Mappers.getMapper(CitaMapper.class);

    List<CitaDto> entityListToEntityDtoList(List<Cita> list);

    Cita entityDtoToEntity(CitaDto citaDto);

    CitaDto entityToEntityDto(Cita cita);

    CitaDto entityCreateToEntityDto(CitaCreateDto citaCreateDto);

    CitaDto entityUpdateToEntityDto(CitaUpdateDto citaUpdateDto);

}
