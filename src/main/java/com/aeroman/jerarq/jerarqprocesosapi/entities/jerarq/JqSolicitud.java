package com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "JQ_SOLICITUD", catalog = "", schema = "JERARQ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JqSolicitud.findAll", query = "SELECT j FROM JqSolicitud j"),
    @NamedQuery(name = "JqSolicitud.findBySolId", query = "SELECT j FROM JqSolicitud j WHERE j.solId = :solId"),
    @NamedQuery(name = "JqSolicitud.findBySolFechaCrea", query = "SELECT j FROM JqSolicitud j WHERE j.solFechaCrea = :solFechaCrea"),
    @NamedQuery(name = "JqSolicitud.findBySolFechaMod", query = "SELECT j FROM JqSolicitud j WHERE j.solFechaMod = :solFechaMod"),
    @NamedQuery(name = "JqSolicitud.findBySolUsuCrea", query = "SELECT j FROM JqSolicitud j WHERE j.solUsuCrea = :solUsuCrea"),
    @NamedQuery(name = "JqSolicitud.findBySolUsuMod", query = "SELECT j FROM JqSolicitud j WHERE j.solUsuMod = :solUsuMod")})
public class JqSolicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY, generator="SEQ_JQ_SOLICITUD_ID")
    @SequenceGenerator(name="SEQ_JQ_SOLICITUD_ID", sequenceName="SEQ_JQ_SOLICITUD_ID", allocationSize=1)
    //@NotNull
    @Column(name = "SOL_ID")
    private BigDecimal solId;
    @Column(name = "SOL_FECHA_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date solFechaCrea;
    @Column(name = "SOL_FECHA_MOD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date solFechaMod;
    //@Size(max = 20)
    @Column(name = "SOL_USU_CREA")
    private String solUsuCrea;
    //@Size(max = 20)
    @Column(name = "SOL_USU_MOD")
    private String solUsuMod;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solId")
    private List<JqDetalleSolicitud> jqDetalleSolicitudList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "logSolId")
    private List<JqLog> jqLogList;
    @JoinColumn(name = "EST_ID", referencedColumnName = "EST_ID")
    @ManyToOne(optional = false)
    private JqEstado estId;
    @JoinColumn(name = "PER_PERIODO2", referencedColumnName = "PER_ID")
    @ManyToOne
    private JqPeriodoAut perPeriodo2;
    @JoinColumn(name = "PER_PERIODO1", referencedColumnName = "PER_ID")
    @ManyToOne
    private JqPeriodoAut perPeriodo1;

    public JqSolicitud() {
    }

    public JqSolicitud(BigDecimal solId) {
        this.solId = solId;
    }

    public BigDecimal getSolId() {
        return solId;
    }

    public void setSolId(BigDecimal solId) {
        this.solId = solId;
    }

    public Date getSolFechaCrea() {
        return solFechaCrea;
    }

    public void setSolFechaCrea(Date solFechaCrea) {
        this.solFechaCrea = solFechaCrea;
    }

    public Date getSolFechaMod() {
        return solFechaMod;
    }

    public void setSolFechaMod(Date solFechaMod) {
        this.solFechaMod = solFechaMod;
    }

    public String getSolUsuCrea() {
        return solUsuCrea;
    }

    public void setSolUsuCrea(String solUsuCrea) {
        this.solUsuCrea = solUsuCrea;
    }

    public String getSolUsuMod() {
        return solUsuMod;
    }

    public void setSolUsuMod(String solUsuMod) {
        this.solUsuMod = solUsuMod;
    }

    @XmlTransient
    public List<JqDetalleSolicitud> getJqDetalleSolicitudList() {
        return jqDetalleSolicitudList;
    }

    public void setJqDetalleSolicitudList(List<JqDetalleSolicitud> jqDetalleSolicitudList) {
        this.jqDetalleSolicitudList = jqDetalleSolicitudList;
    }

    @XmlTransient
    public List<JqLog> getJqLogList() {
        return jqLogList;
    }

    public void setJqLogList(List<JqLog> jqLogList) {
        this.jqLogList = jqLogList;
    }

    public JqEstado getEstId() {
        return estId;
    }

    public void setEstId(JqEstado estId) {
        this.estId = estId;
    }

    public JqPeriodoAut getPerPeriodo2() {
        return perPeriodo2;
    }

    public void setPerPeriodo2(JqPeriodoAut perPeriodo2) {
        this.perPeriodo2 = perPeriodo2;
    }

    public JqPeriodoAut getPerPeriodo1() {
        return perPeriodo1;
    }

    public void setPerPeriodo1(JqPeriodoAut perPeriodo1) {
        this.perPeriodo1 = perPeriodo1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (solId != null ? solId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JqSolicitud)) {
            return false;
        }
        JqSolicitud other = (JqSolicitud) object;
        if ((this.solId == null && other.solId != null) || (this.solId != null && !this.solId.equals(other.solId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JqSolicitud{" +
                "solId=" + solId.toString() +
                ", solFechaCrea=" + solFechaCrea.toString() +
                ", solFechaMod=" + solFechaMod.toString() +
                ", solUsuCrea='" + solUsuCrea + '\'' +
                ", solUsuMod='" + solUsuMod + '\'' +
                ", jqDetalleSolicitudList=" + jqDetalleSolicitudList +
                ", estId=" + estId +
                ", perPeriodo2=" + perPeriodo2 +
                ", perPeriodo1=" + perPeriodo1 +
                '}';
    }
}
