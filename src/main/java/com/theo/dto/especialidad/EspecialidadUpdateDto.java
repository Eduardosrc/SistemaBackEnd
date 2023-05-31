package com.theo.dto.especialidad;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class EspecialidadUpdateDto {

    @NotBlank
    private Long id;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]{2,25}$", message = "Entre 2 y 25 carácteres")
    private String nombre;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]{2,100}$", message = "Entre 2 y 100 carácteres")
    private String descripcion;

    @NotBlank
    private Boolean estado;

}
