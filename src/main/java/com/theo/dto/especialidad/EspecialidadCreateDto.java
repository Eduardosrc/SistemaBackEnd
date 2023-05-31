package com.theo.dto.especialidad;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class EspecialidadCreateDto {

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]{2,25}$")
    private String nombre;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]{2,100}$")
    private String descripcion;

    @NotBlank
    private Boolean estado;

}
