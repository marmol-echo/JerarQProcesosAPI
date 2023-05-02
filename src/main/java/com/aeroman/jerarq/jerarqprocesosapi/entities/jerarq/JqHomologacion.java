package com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "JQ_HOMOLOGACION", catalog = "", schema = "JERARQ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JqHomologacion.findAll", query = "SELECT j FROM JqHomologacion j"),
    @NamedQuery(name = "JqHomologacion.findByHmlId", query = "SELECT j FROM JqHomologacion j WHERE j.hmlId = :hmlId"),
    @NamedQuery(name = "JqHomologacion.findByHmlVhur", query = "SELECT j FROM JqHomologacion j WHERE j.hmlVhur = :hmlVhur"),
    @NamedQuery(name = "JqHomologacion.findByHmlHangar", query = "SELECT j FROM JqHomologacion j WHERE j.hmlHangar = :hmlHangar"),
    @NamedQuery(name = "JqHomologacion.findByHml12136", query = "SELECT j FROM JqHomologacion j WHERE j.hml12136 = :hml12136"),
    @NamedQuery(name = "JqHomologacion.findByHml12800", query = "SELECT j FROM JqHomologacion j WHERE j.hml12800 = :hml12800")})
public class JqHomologacion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    //@NotNull
    @Column(name = "HML_ID")
    private BigDecimal hmlId;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 10)
    @Column(name = "HML_VHUR")
    private String hmlVhur;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 10)
    @Column(name = "HML_HANGAR")
    private String hmlHangar;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 3)
    @Column(name = "HML_12136")
    private String hml12136;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 3)
    @Column(name = "HML_12800")
    private String hml12800;

    public JqHomologacion() {
    }

    public JqHomologacion(BigDecimal hmlId) {
        this.hmlId = hmlId;
    }

    public JqHomologacion(BigDecimal hmlId, String hmlVhur, String hmlHangar, String hml12136, String hml12800) {
        this.hmlId = hmlId;
        this.hmlVhur = hmlVhur;
        this.hmlHangar = hmlHangar;
        this.hml12136 = hml12136;
        this.hml12800 = hml12800;
    }

    public BigDecimal getHmlId() {
        return hmlId;
    }

    public void setHmlId(BigDecimal hmlId) {
        this.hmlId = hmlId;
    }

    public String getHmlVhur() {
        return hmlVhur;
    }

    public void setHmlVhur(String hmlVhur) {
        this.hmlVhur = hmlVhur;
    }

    public String getHmlHangar() {
        return hmlHangar;
    }

    public void setHmlHangar(String hmlHangar) {
        this.hmlHangar = hmlHangar;
    }

    public String getHml12136() {
        return hml12136;
    }

    public void setHml12136(String hml12136) {
        this.hml12136 = hml12136;
    }

    public String getHml12800() {
        return hml12800;
    }

    public void setHml12800(String hml12800) {
        this.hml12800 = hml12800;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hmlId != null ? hmlId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JqHomologacion)) {
            return false;
        }
        JqHomologacion other = (JqHomologacion) object;
        if ((this.hmlId == null && other.hmlId != null) || (this.hmlId != null && !this.hmlId.equals(other.hmlId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.JqHomologacion[ hmlId=" + hmlId + " ]";
    }
    
}
