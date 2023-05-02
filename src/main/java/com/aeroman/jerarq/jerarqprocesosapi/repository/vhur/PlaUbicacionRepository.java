package com.aeroman.jerarq.jerarqprocesosapi.repository.vhur;

import com.aeroman.jerarq.jerarqprocesosapi.entities.vhur.PlaUbiUbicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlaUbicacionRepository extends JpaRepository<PlaUbiUbicacion, Short> {

    @Query("SELECT u from PlaEmpEmpleado e INNER JOIN PlaPlzPlaza p " +
            "ON (p.plzCodcia = e.empCodcia AND p.plzCodigo = e.empCodplz) " +
            "INNER JOIN PlaUbiUbicacion u ON (u.ubiCodigo = p.plzCodubi.ubiCodigo) " +
            "WHERE e.empEstado = 'A' AND e.empCodigoAnterior = ?1")
    public List<PlaUbiUbicacion> validarBahia(String codigo);

    public Optional<PlaUbiUbicacion> findByUbiCodigo(Short codigo);
    public Optional<PlaUbiUbicacion> findByUbiDescripcion(String desc);

    /*
    * Validar bahia:

SELECT UBI.UBI_CODIGO, UBI.UBI_DESCRIPCION FROM PLA_EMP_EMPLEADO EMP
INNER JOIN PLA_PLZ_PLAZA PLZ ON PLZ.PLZ_CODCIA = EMP.EMP_CODCIA AND PLZ.PLZ_CODIGO = EMP.EMP_CODPLZ
INNER JOIN PLA_UBI_UBICACION UBI ON UBI.UBI_CODIGO = PLZ.PLZ_CODUBI
WHERE EMP.EMP_ESTADO = ‘A’ AND EMP.EMP_CODIGO_ANTERIOR = ‘ [1] ’

*/
}
