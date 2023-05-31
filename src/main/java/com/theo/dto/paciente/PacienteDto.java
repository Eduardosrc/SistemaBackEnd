package com.theo.dto.paciente;

import lombok.Data;

import java.util.Date;

@Data
public class PacienteDto {

    private Long id;

    private String nombres;

    private String apePaterno;

    private String apeMaterno;

    private Date fechaNacimiento;

    private String telefono;

    private String correo;

}
