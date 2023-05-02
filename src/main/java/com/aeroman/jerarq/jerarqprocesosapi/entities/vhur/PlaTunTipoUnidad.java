/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aeroman.jerarq.jerarqprocesosapi.entities.vhur;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author molin
 */
@Entity
@Table(name = "PLA_TUN_TIPO_UNIDAD", catalog = "VHUR_AEROMAN", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaTunTipoUnidad.findAll", query = "SELECT p FROM PlaTunTipoUnidad p"),
    @NamedQuery(name = "PlaTunTipoUnidad.findByTunCodigo", query = "SELECT p FROM PlaTunTipoUnidad p WHERE p.tunCodigo = :tunCodigo"),
    @NamedQuery(name = "PlaTunTipoUnidad.findByTunDescripcion", query = "SELECT p FROM PlaTunTipoUnidad p WHERE p.tunDescripcion = :tunDescripcion"),
    @NamedQuery(name = "PlaTunTipoUnidad.findByTunCodgrc", query = "SELECT p FROM PlaTunTipoUnidad p WHERE p.tunCodgrc = :tunCodgrc")})
public class PlaTunTipoUnidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    //@NotNull
    @Column(name = "TUN_CODIGO")
    private Short tunCodigo;
    //@Size(max = 100)
    @Column(name = "TUN_DESCRIPCION")
    private String tunDescripcion;
    @Column(name = "TUN_CODGRC")
    private Integer tunCodgrc;
    @OneToMany(mappedBy = "uniCodtun")
    private List<PlaUniUnidad> plaUniUnidadList;

    public PlaTunTipoUnidad() {
    }

    public PlaTunTipoUnidad(Short tunCodigo) {
        this.tunCodigo = tunCodigo;
    }

    public Short getTunCodigo() {
        return tunCodigo;
    }

    public void setTunCodigo(Short tunCodigo) {
        this.tunCodigo = tunCodigo;
    }

    public String getTunDescripcion() {
        return tunDescripcion;
    }

    public void setTunDescripcion(String tunDescripcion) {
        this.tunDescripcion = tunDescripcion;
    }

    public Integer getTunCodgrc() {
        return tunCodgrc;
    }

    public void setTunCodgrc(Integer tunCodgrc) {
        this.tunCodgrc = tunCodgrc;
    }

    @XmlTransient
    public List<PlaUniUnidad> getPlaUniUnidadList() {
        return plaUniUnidadList;
    }

    public void setPlaUniUnidadList(List<PlaUniUnidad> plaUniUnidadList) {
        this.plaUniUnidadList = plaUniUnidadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tunCodigo != null ? tunCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaTunTipoUnidad)) {
            return false;
        }
        PlaTunTipoUnidad other = (PlaTunTipoUnidad) object;
        if ((this.tunCodigo == null && other.tunCodigo != null) || (this.tunCodigo != null && !this.tunCodigo.equals(other.tunCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.vhur.PlaTunTipoUnidad[ tunCodigo=" + tunCodigo + " ]";
    }
    
}
