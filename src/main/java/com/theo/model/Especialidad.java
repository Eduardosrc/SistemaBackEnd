package com.theo.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "tb_especialidad")
@Data
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especialidad")
    private Long id;

    @Column(length = 25)
    private String nombre;

    @Column(length = 100)
    private String descripcion;

    private Boolean estado;

}
