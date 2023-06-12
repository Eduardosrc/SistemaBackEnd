package com.theo.repository;

import com.theo.model.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface EspecialidadRepository extends JpaRepository<Especialidad, Long> {

    @Modifying
    @Transactional
    @Query(value = "update Especialidad e set e.estado = false where e.id = :id")
    void deleteEspecialidadById(Long id);

}
