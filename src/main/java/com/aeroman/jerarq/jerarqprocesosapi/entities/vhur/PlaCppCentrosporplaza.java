/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aeroman.jerarq.jerarqprocesosapi.entities.vhur;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author molin
 */
@Entity @IdClass(PlaCppCentrosporplazaPK.class)
@Table(name = "PLA_CPP_CENTROSPORPLAZA", catalog = "VHUR_AEROMAN", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaCppCentrosporplaza.findAll", query = "SELECT p FROM PlaCppCentrosporplaza p"),
    @NamedQuery(name = "PlaCppCentrosporplaza.findByCppCodcia", query = "SELECT p FROM PlaCppCentrosporplaza p WHERE p.cppCodcia = :cppCodcia")})
public class PlaCppCentrosporplaza implements Serializable {

    private static final long serialVersionUID = 1L;
    //@EmbeddedId
    //protected PlaCppCentrosporplazaPK plaCppCentrosporplazaPK;
    @Id
    @Basic(optional = false)
    //@NotNull
    @Column(name = "CPP_CODPLZ")
    private int cppCodplz;
    @Id
    @Basic(optional = false)
    //@NotNull
    @Column(name = "CPP_CEN_COSTO")
    private short cppCenCosto;
    @Id
    @Basic(optional = false)
    //@NotNull
    @Column(name = "CPP_PORCENTAJE")
    private float cppPorcentaje;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "CPP_CODCIA")
    private int cppCodcia;

    public PlaCppCentrosporplaza() {}

    public PlaCppCentrosporplaza(int cppCodplz, short cppCenCosto, float cppPorcentaje) {
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

    public int getCppCodcia() {
        return cppCodcia;
    }

    public void setCppCodcia(int cppCodcia) {
        this.cppCodcia = cppCodcia;
    }

    @Override
    public String toString() {
        return "PlaCppCentrosporplaza{" +
                "cppCodplz=" + cppCodplz +
                ", cppCenCosto=" + cppCenCosto +
                ", cppPorcentaje=" + cppPorcentaje +
                ", cppCodcia=" + cppCodcia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaCppCentrosporplaza that = (PlaCppCentrosporplaza) o;
        return cppCodplz == that.cppCodplz && cppCenCosto == that.cppCenCosto &&
                Float.compare(that.cppPorcentaje, cppPorcentaje) == 0 && cppCodcia == that.cppCodcia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cppCodplz, cppCenCosto, cppPorcentaje, cppCodcia);
    }
}
