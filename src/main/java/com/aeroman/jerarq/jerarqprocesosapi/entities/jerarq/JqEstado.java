package com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "JQ_ESTADO", catalog = "", schema = "JERARQ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JqEstado.findAll", query = "SELECT j FROM JqEstado j"),
    @NamedQuery(name = "JqEstado.findByEstId", query = "SELECT j FROM JqEstado j WHERE j.estId = :estId"),
    @NamedQuery(name = "JqEstado.findByEstNombre", query = "SELECT j FROM JqEstado j WHERE j.estNombre = :estNombre"),
    @NamedQuery(name = "JqEstado.findByEstDescripcion", query = "SELECT j FROM JqEstado j WHERE j.estDescripcion = :estDescripcion")})
public class JqEstado implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    //@NotNull
    @Column(name = "EST_ID")
    private BigDecimal estId;
    //@Size(max = 20)
    @Column(name = "EST_NOMBRE")
    private String estNombre;
    //@Size(max = 50)
    @Column(name = "EST_DESCRIPCION")
    private String estDescripcion;
    @OneToMany(mappedBy = "estProc")
    private List<JqLog> jqLogList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estId")
    private List<JqSolicitud> jqSolicitudList;

    public JqEstado() {
    }

    public JqEstado(BigDecimal estId) {
        this.estId = estId;
    }

    public BigDecimal getEstId() {
        return estId;
    }

    public void setEstId(BigDecimal estId) {
        this.estId = estId;
    }

    public String getEstNombre() {
        return estNombre;
    }

    public void setEstNombre(String estNombre) {
        this.estNombre = estNombre;
    }

    public String getEstDescripcion() {
        return estDescripcion;
    }

    public void setEstDescripcion(String estDescripcion) {
        this.estDescripcion = estDescripcion;
    }

    @XmlTransient
    public List<JqLog> getJqLogList() {
        return jqLogList;
    }

    public void setJqLogList(List<JqLog> jqLogList) {
        this.jqLogList = jqLogList;
    }

    @XmlTransient
    public List<JqSolicitud> getJqSolicitudList() {
        return jqSolicitudList;
    }

    public void setJqSolicitudList(List<JqSolicitud> jqSolicitudList) {
        this.jqSolicitudList = jqSolicitudList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estId != null ? estId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JqEstado)) {
            return false;
        }
        JqEstado other = (JqEstado) object;
        if ((this.estId == null && other.estId != null) || (this.estId != null && !this.estId.equals(other.estId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.JqEstado[ estId=" + estId + " ]";
    }
    
}
