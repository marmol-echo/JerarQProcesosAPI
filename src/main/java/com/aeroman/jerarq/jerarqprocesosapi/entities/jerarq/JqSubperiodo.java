package com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "JQ_SUBPERIODO", catalog = "", schema = "JERARQ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JqSubperiodo.findAll", query = "SELECT j FROM JqSubperiodo j"),
    @NamedQuery(name = "JqSubperiodo.findBySubId", query = "SELECT j FROM JqSubperiodo j WHERE j.subId = :subId"),
    @NamedQuery(name = "JqSubperiodo.findBySubFechaInicio", query = "SELECT j FROM JqSubperiodo j WHERE j.subFechaInicio = :subFechaInicio"),
    @NamedQuery(name = "JqSubperiodo.findBySubFechaFin", query = "SELECT j FROM JqSubperiodo j WHERE j.subFechaFin = :subFechaFin")})
public class JqSubperiodo implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    //@NotNull
    @Column(name = "SUB_ID")
    private BigDecimal subId;
    @Column(name = "SUB_FECHA_INICIO")
    private BigInteger subFechaInicio;
    @Column(name = "SUB_FECHA_FIN")
    private BigInteger subFechaFin;
    @JoinColumn(name = "PER_ID", referencedColumnName = "PER_ID")
    @ManyToOne(optional = false)
    private JqPeriodoAut perId;

    public JqSubperiodo() {
    }

    public JqSubperiodo(BigDecimal subId) {
        this.subId = subId;
    }

    public BigDecimal getSubId() {
        return subId;
    }

    public void setSubId(BigDecimal subId) {
        this.subId = subId;
    }

    public BigInteger getSubFechaInicio() {
        return subFechaInicio;
    }

    public void setSubFechaInicio(BigInteger subFechaInicio) {
        this.subFechaInicio = subFechaInicio;
    }

    public BigInteger getSubFechaFin() {
        return subFechaFin;
    }

    public void setSubFechaFin(BigInteger subFechaFin) {
        this.subFechaFin = subFechaFin;
    }

    public JqPeriodoAut getPerId() {
        return perId;
    }

    public void setPerId(JqPeriodoAut perId) {
        this.perId = perId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subId != null ? subId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JqSubperiodo)) {
            return false;
        }
        JqSubperiodo other = (JqSubperiodo) object;
        if ((this.subId == null && other.subId != null) || (this.subId != null && !this.subId.equals(other.subId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.JqSubperiodo[ subId=" + subId + " ]";
    }
    
}
