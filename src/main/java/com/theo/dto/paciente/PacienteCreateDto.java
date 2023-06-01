package com.theo.dto.paciente;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class PacienteCreateDto {

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z ]{2,40}$", message = "Entre 2 y 40 carácteres")
    private String nombres;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]{2,25}$", message = "Entre 2 y 25 carácteres")
    private String apePaterno;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]{2,25}$", message = "Entre 2 y 25 carácteres")
    private String apeMaterno;

    private Date fechaNacimiento;

    @NotBlank
    @Pattern(regexp = "^[1-9]\\d{8}$", message = "Ingrese un número válido")
    private String telefono;

    @NotBlank
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", message = "Ingrese un correo válido")
    private String correo;

    private Boolean estado;

}
