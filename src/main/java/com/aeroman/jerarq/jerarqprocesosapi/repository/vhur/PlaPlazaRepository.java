package com.aeroman.jerarq.jerarqprocesosapi.repository.vhur;

import com.aeroman.jerarq.jerarqprocesosapi.entities.vhur.PlaPlzPlaza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlaPlazaRepository extends JpaRepository<PlaPlzPlaza,Integer> {

    Optional<PlaPlzPlaza> findByPlzCodigo(Integer codigo);

    @Query("SELECT e FROM PlaEmpEmpleado e WHERE e.empCodcia = ?1 AND e.empCodplz = ?2")
    public Optional<PlaPlzPlaza> findByCodAe(Integer codcia, Integer codplz);

    @Query("SELECT p from PlaEmpEmpleado e INNER JOIN PlaPlzPlaza p " +
            "ON (p.plzCodcia = e.empCodcia AND p.plzCodigo = e.empCodplz) " +
            "WHERE e.empEstado = 'A' AND e.empCodigoAnterior = ?1")
    public List<PlaPlzPlaza> validarPuesto(String codigo);

    /*Validar puesto:
USE VHUR_AEROMAN
GO

SELECT PLZ.PLZ_CODIGO, PLZ_NOMBRE FROM PLA_EMP_EMPLEADO EMP
INNER JOIN PLA_PLZ_PLAZA PLZ ON PLZ.PLZ_CODCIA = EMP.EMP_CODCIA AND PLZ.PLZ_CODIGO = EMP.EMP_CODPLZ
WHERE EMP.EMP_ESTADO = ‘A’ AND EMP.EMP_CODIGO_ANTERIOR = ‘ [1] '
*/

}
