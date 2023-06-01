package com.theo.dto.cita;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.theo.model.Medico;
import com.theo.model.Paciente;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class CitaUpdateDto {

    private Long id;

    private Medico medico;

    private Paciente paciente;

    private Date fecha;

    @Pattern(regexp = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$", message = "Ingrese una hora válida")
    private String hora;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z ]{2,200}$", message = "Entre 2 y 200 carácteres")
    private String descripcion;

    private Boolean estado;

}
