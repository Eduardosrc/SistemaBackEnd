package com.theo.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Table(name = "tb_paciente")
@Data
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
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

    @Column(length = 8)
    private String telefono;

    @Column(length = 50)
    private String correo;

    private Boolean estado;

}
