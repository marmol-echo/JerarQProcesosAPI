/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aeroman.jerarq.jerarqprocesosapi.entities.vhur;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author molin
 */
@Embeddable
public class PlaCppCentrosporplazaPK implements Serializable {

    //@Basic(optional = false)
    //@NotNull
    //@Column(name = "CPP_CODPLZ")
    private int cppCodplz;
    //@Basic(optional = false)
    //@NotNull
    //@Column(name = "CPP_CEN_COSTO")
    private short cppCenCosto;
    //@Basic(optional = false)
    //@NotNull
    //@Column(name = "CPP_PORCENTAJE")
    private float cppPorcentaje;

    public PlaCppCentrosporplazaPK() {
    }

    public PlaCppCentrosporplazaPK(int cppCodplz, short cppCenCosto, float cppPorcentaje) {
        this.cppCodplz = cppCodplz;
        this.cppCenCosto = cppCenCosto;
        this.cppPorcentaje = cppPorcentaje;
    }

    public int getCppCodplz() {
        return cppCodplz;
    }

    public void setCppCodplz(int cppCodplz) {
        this.cppCodplz = cppCodplz;
    }

    public short getCppCenCosto() {
        return cppCenCosto;
    }

    public void setCppCenCosto(short cppCenCosto) {
        this.cppCenCosto = cppCenCosto;
    }

    public float getCppPorcentaje() {
        return cppPorcentaje;
    }

    public void setCppPorcentaje(float cppPorcentaje) {
        this.cppPorcentaje = cppPorcentaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cppCodplz;
        hash += (int) cppCenCosto;
        hash += (int) cppPorcentaje;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaCppCentrosporplazaPK)) {
            return false;
        }
        PlaCppCentrosporplazaPK other = (PlaCppCentrosporplazaPK) object;
        if (this.cppCodplz != other.cppCodplz) {
            return false;
        }
        if (this.cppCenCosto != other.cppCenCosto) {
            return false;
        }
        if (this.cppPorcentaje != other.cppPorcentaje) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.vhur.PlaCppCentrosporplazaPK[ cppCodplz=" + cppCodplz + ", cppCenCosto=" + cppCenCosto + ", cppPorcentaje=" + cppPorcentaje + " ]";
    }
    
}
