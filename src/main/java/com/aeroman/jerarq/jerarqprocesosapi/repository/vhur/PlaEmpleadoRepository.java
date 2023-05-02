package com.aeroman.jerarq.jerarqprocesosapi.repository.vhur;

import com.aeroman.jerarq.jerarqprocesosapi.entities.vhur.PlaEmpEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlaEmpleadoRepository extends JpaRepository<PlaEmpEmpleado,Integer> {

    @Query("SELECT e from PlaEmpEmpleado e where e.empEstado = 'A' " +
            "AND e.empCodigoAnterior = ?1")
    public Optional<PlaEmpEmpleado> findByEmpCodigoEstado(String codigo);

    @Query("SELECT e from PlaEmpEmpleado e where e.empEstado = 'A' " +
            "AND e.empCodigoAnterior = ?1 AND e.empCodigo = ?2")
    public List<PlaEmpEmpleado> validarEmp(String cod86, Integer codM4);

    @Query("SELECT e from PlaEmpEmpleado e where e.empEstado = 'R' AND e.empFechaRetiro = CAST(GETDATE() as date)")
    public List<PlaEmpEmpleado> findRetirados();

    @Query("SELECT e from PlaEmpEmpleado  e where e.empEstado = 'A' AND e.empCodigoAnterior = ?1")
    public List<PlaEmpEmpleado> validarEmp(String codigo);

}
