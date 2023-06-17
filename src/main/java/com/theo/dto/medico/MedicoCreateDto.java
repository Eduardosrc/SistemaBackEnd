package com.theo.dto.medico;

import com.theo.model.Especialidad;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class MedicoCreateDto {

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

    private Date fechaContratacion;

    @NotBlank
    @Pattern(regexp = "^[1-9]\\d{8}$", message = "Ingrese un número válido")
    private String telefono;

    @NotBlank
    @Email(message = "Ingrese un correo válido")
    private String correo;

    private Especialidad especialidad;

    private Boolean estado;

}
