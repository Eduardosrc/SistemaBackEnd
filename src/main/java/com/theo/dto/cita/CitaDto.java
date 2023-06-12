package com.theo.dto.cita;

import com.theo.model.Medico;
import com.theo.model.Paciente;
import lombok.Data;

import java.util.Date;

@Data
public class CitaDto {

    private Long id;

    private Medico medico;

    private Paciente paciente;

    private Date fecha;

    private String hora;

    private String descripcion;

    private Boolean estado;

}
