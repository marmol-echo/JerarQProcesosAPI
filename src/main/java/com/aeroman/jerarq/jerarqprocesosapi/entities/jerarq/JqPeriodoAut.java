package com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "JQ_PERIODO_AUT", catalog = "", schema = "JERARQ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JqPeriodoAut.findAll", query = "SELECT j FROM JqPeriodoAut j"),
    @NamedQuery(name = "JqPeriodoAut.findByPerId", query = "SELECT j FROM JqPeriodoAut j WHERE j.perId = :perId"),
    @NamedQuery(name = "JqPeriodoAut.findByPerFechaInicio", query = "SELECT j FROM JqPeriodoAut j WHERE j.perFechaInicio = :perFechaInicio"),
    @NamedQuery(name = "JqPeriodoAut.findByPerFechaFin", query = "SELECT j FROM JqPeriodoAut j WHERE j.perFechaFin = :perFechaFin")})
public class JqPeriodoAut implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    //@NotNull
    @Column(name = "PER_ID")
    private BigDecimal perId;
    @Column(name = "PER_FECHA_INICIO")
    private BigInteger perFechaInicio;
    @Column(name = "PER_FECHA_FIN")
    private BigInteger perFechaFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perId")
    private List<JqSubperiodo> jqSubperiodoList;
    @OneToMany(mappedBy = "perPeriodo2")
    private List<JqSolicitud> jqSolicitudList;
    @OneToMany(mappedBy = "perPeriodo1")
    private List<JqSolicitud> jqSolicitudList1;

    public JqPeriodoAut() {
    }

    public JqPeriodoAut(BigDecimal perId) {
        this.perId = perId;
    }

    public BigDecimal getPerId() {
        return perId;
    }

    public void setPerId(BigDecimal perId) {
        this.perId = perId;
    }

    public BigInteger getPerFechaInicio() {
        return perFechaInicio;
    }

    public void setPerFechaInicio(BigInteger perFechaInicio) {
        this.perFechaInicio = perFechaInicio;
    }

    public BigInteger getPerFechaFin() {
        return perFechaFin;
    }

    public void setPerFechaFin(BigInteger perFechaFin) {
        this.perFechaFin = perFechaFin;
    }

    @XmlTransient
    public List<JqSubperiodo> getJqSubperiodoList() {
        return jqSubperiodoList;
    }

    public void setJqSubperiodoList(List<JqSubperiodo> jqSubperiodoList) {
        this.jqSubperiodoList = jqSubperiodoList;
    }

    @XmlTransient
    public List<JqSolicitud> getJqSolicitudList() {
        return jqSolicitudList;
    }

    public void setJqSolicitudList(List<JqSolicitud> jqSolicitudList) {
        this.jqSolicitudList = jqSolicitudList;
    }

    @XmlTransient
    public List<JqSolicitud> getJqSolicitudList1() {
        return jqSolicitudList1;
    }

    public void setJqSolicitudList1(List<JqSolicitud> jqSolicitudList1) {
        this.jqSolicitudList1 = jqSolicitudList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perId != null ? perId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JqPeriodoAut)) {
            return false;
        }
        JqPeriodoAut other = (JqPeriodoAut) object;
        if ((this.perId == null && other.perId != null) || (this.perId != null && !this.perId.equals(other.perId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.JqPeriodoAut[ perId=" + perId + " ]";
    }
    
}
