package com.theo.mapper;

import com.theo.dto.paciente.PacienteCreateDto;
import com.theo.dto.paciente.PacienteDto;
import com.theo.dto.paciente.PacienteUpdateDto;
import com.theo.model.Paciente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PacienteMapper {

    PacienteMapper instancia = Mappers.getMapper(PacienteMapper.class);

    List<PacienteDto> entityListToEntityDtoList(List<Paciente> list);

    Paciente entityDtoToEntity(PacienteDto pacienteDto);

    PacienteDto entityToEntityDto(Paciente paciente);

    PacienteDto entityCreateToEntityDto(PacienteCreateDto pacienteCreateDto);

    PacienteDto entityUpdateToEntityDto(PacienteUpdateDto pacienteUpdateDto);

}
