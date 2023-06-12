package com.theo.repository;

import com.theo.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    @Modifying
    @Transactional
    @Query(value = "update Paciente p set p.estado = false where p.id = :id")
    void deletePacienteById(Long id);

}
