package com.theo.repository;

import com.theo.model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface CitaRepository extends JpaRepository<Cita, Long> {

    @Modifying
    @Transactional
    @Query(value = "update Cita c set c.estado = false where c.id = :id")
    void deleteCitaById(Long id);

}
