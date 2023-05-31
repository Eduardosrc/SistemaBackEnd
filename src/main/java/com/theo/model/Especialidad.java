package com.theo.model;

import lombok.Data;

import javax.persistence.*;

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

    @Column(length = 200)
    private String descripcion;

    private Boolean estado;

}
