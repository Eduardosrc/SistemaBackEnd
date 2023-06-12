package com.theo.repository;

import com.theo.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    @Modifying
    @Transactional
    @Query(value = "update Medico m set m.estado = false where m.id = :id")
    void deleteMedicoById(Long id);

}
