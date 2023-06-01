package com.theo.dto.especialidad;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class EspecialidadUpdateDto {

    private Long id;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z ]{2,25}$", message = "Entre 2 y 25 carácteres")
    private String nombre;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z ]{2,200}$", message = "Entre 2 y 200 carácteres")
    private String descripcion;

    private Boolean estado;

}
