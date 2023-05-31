package com.theo.dto.medico;

import com.theo.model.Especialidad;
import lombok.Data;

import java.util.Date;

@Data
public class MedicoDto {

    private Long id;

    private String nombres;

    private String apePaterno;

    private String apeMaterno;

    private Date fechaNacimiento;

    private Date fechaContratacion;

    private String telefono;

    private String correo;

    private Especialidad especialidad;

}
