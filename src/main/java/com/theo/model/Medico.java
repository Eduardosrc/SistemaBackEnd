package com.theo.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_medico")
@Data
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medico")
    private Long id;

    @Column(length = 40)
    private String nombres;

    @Column(name = "ape_paterno", length = 25)
    private String apePaterno;

    @Column(name = "ape_materno", length = 25)
    private String apeMaterno;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fec_nacimiento")
    private Date fechaNacimiento;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fec_contratacion")
    private Date fechaContratacion;

    @Column(length = 9)
    private String telefono;

    @Column(length = 50)
    private String correo;

    @ManyToOne
    @JoinColumn(name = "id_especialidad")
    private Especialidad especialidad;

    private Boolean estado;

}
