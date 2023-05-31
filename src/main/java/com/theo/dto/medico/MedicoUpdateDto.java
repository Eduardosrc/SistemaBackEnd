package com.theo.dto.medico;

import com.theo.model.Especialidad;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class MedicoUpdateDto {

    @NotBlank
    private Long id;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]{2,40}$")
    private String nombres;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]{2,25}$")
    private String apePaterno;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]{2,25}$")
    private String apeMaterno;

    @NotBlank
    private Date fechaNacimiento;

    @NotBlank
    private Date fechaContratacion;

    @NotBlank
    @Pattern(regexp = "^[1-9]\\d{8}$")
    private String telefono;

    @NotBlank
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")
    private String correo;

    @NotBlank
    private Especialidad especialidad;

    @NotBlank
    private Boolean estado;

}
