package com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq;

import java.io.Serializable;
import java.math.BigDecimal;
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

@Entity
@Table(name = "JQ_RESPONSABILIDAD", catalog = "", schema = "JERARQ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JqResponsabilidad.findAll", query = "SELECT j FROM JqResponsabilidad j"),
    @NamedQuery(name = "JqResponsabilidad.findByResId", query = "SELECT j FROM JqResponsabilidad j WHERE j.resId = :resId"),
    @NamedQuery(name = "JqResponsabilidad.findByResTipo", query = "SELECT j FROM JqResponsabilidad j WHERE j.resTipo = :resTipo"),
    @NamedQuery(name = "JqResponsabilidad.findByResDescripcion", query = "SELECT j FROM JqResponsabilidad j WHERE j.resDescripcion = :resDescripcion")})
public class JqResponsabilidad implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    //@NotNull
    @Column(name = "RES_ID")
    private BigDecimal resId;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 50)
    @Column(name = "RES_TIPO")
    private String resTipo;
    //@Size(max = 100)
    @Column(name = "RES_DESCRIPCION")
    private String resDescripcion;
    @OneToMany(mappedBy = "resId")
    private List<JqUser> jqUserList;

    public JqResponsabilidad() {
    }

    public JqResponsabilidad(BigDecimal resId) {
        this.resId = resId;
    }

    public JqResponsabilidad(BigDecimal resId, String resTipo) {
        this.resId = resId;
        this.resTipo = resTipo;
    }

    public BigDecimal getResId() {
        return resId;
    }

    public void setResId(BigDecimal resId) {
        this.resId = resId;
    }

    public String getResTipo() {
        return resTipo;
    }

    public void setResTipo(String resTipo) {
        this.resTipo = resTipo;
    }

    public String getResDescripcion() {
        return resDescripcion;
    }

    public void setResDescripcion(String resDescripcion) {
        this.resDescripcion = resDescripcion;
    }

    @XmlTransient
    public List<JqUser> getJqUserList() {
        return jqUserList;
    }

    public void setJqUserList(List<JqUser> jqUserList) {
        this.jqUserList = jqUserList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (resId != null ? resId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JqResponsabilidad)) {
            return false;
        }
        JqResponsabilidad other = (JqResponsabilidad) object;
        if ((this.resId == null && other.resId != null) || (this.resId != null && !this.resId.equals(other.resId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.JqResponsabilidad[ resId=" + resId + " ]";
    }
    
}
