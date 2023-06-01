package com.theo.dto.cita;

import com.theo.model.Medico;
import com.theo.model.Paciente;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class CitaCreateDto {

    @NotBlank
    private Medico medico;

    @NotBlank
    private Paciente paciente;

    @NotBlank
    private Date fecha;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z ]{2,200}$", message = "Entre 2 y 200 carácteres")
    private String descripcion;

    private Boolean estado;

}
