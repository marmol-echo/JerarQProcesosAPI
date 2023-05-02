package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.vhur.PlaEmpEmpleado;
import com.aeroman.jerarq.jerarqprocesosapi.repository.vhur.PlaEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaEmpleadoServiceImpl implements PlaEmpleadoService {

    @Autowired
    private PlaEmpleadoRepository empleadoRepository;

    private List<PlaEmpEmpleado> lista;

    @Override
    public PlaEmpEmpleado findEmpleado(String codigo) {
        return empleadoRepository.findByEmpCodigoEstado(codigo).orElse(null);
    }

    @Override
    public List<PlaEmpEmpleado> validarEmpleado(String cod86, String codM4) {
        return empleadoRepository.validarEmp(cod86, Integer.valueOf(codM4));
    }

    @Override
    public List<PlaEmpEmpleado> getRetirados() {
        return empleadoRepository.findRetirados();
    }

    @Override
    public List<PlaEmpEmpleado> getActivosPorCodigo(String codigo) {
        try {
            return empleadoRepository.validarEmp(codigo.trim());
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Boolean esEmpleadoActivo(String codigo) {
        lista = this.getActivosPorCodigo(codigo);
        if(lista == null)
            return null;
        if(lista.isEmpty())
            return false;
        else
            return true;
    }
}
