package com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "JQ_LOG", catalog = "", schema = "JERARQ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JqLog.findAll", query = "SELECT j FROM JqLog j"),
    @NamedQuery(name = "JqLog.findByLogId", query = "SELECT j FROM JqLog j WHERE j.logId = :logId"),
    @NamedQuery(name = "JqLog.findByLogFechaProc", query = "SELECT j FROM JqLog j WHERE j.logFechaProc = :logFechaProc"),
    @NamedQuery(name = "JqLog.findByLogObservaciones", query = "SELECT j FROM JqLog j WHERE j.logObservaciones = :logObservaciones"),
    @NamedQuery(name = "JqLog.findByLogUsu", query = "SELECT j FROM JqLog j WHERE j.logUsu = :logUsu"),
    @NamedQuery(name = "JqLog.findByLogMotivoFalla", query = "SELECT j FROM JqLog j WHERE j.logMotivoFalla = :logMotivoFalla")})
public class JqLog implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY, generator="SEQ_JQ_LOG_ID")
    @SequenceGenerator(name="SEQ_JQ_LOG_ID", sequenceName="SEQ_JQ_LOG_ID", allocationSize=1)
    //@NotNull
    @Column(name = "LOG_ID")
    private BigDecimal logId;
    @Column(name = "LOG_FECHA_PROC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logFechaProc;
    //@Size(max = 100)
    @Column(name = "LOG_OBSERVACIONES")
    private String logObservaciones;
    //@Size(max = 20)
    @Column(name = "LOG_USU")
    private String logUsu;
    //@Size(max = 100)
    @Column(name = "LOG_MOTIVO_FALLA")
    private String logMotivoFalla;
    @JoinColumn(name = "EST_PROC", referencedColumnName = "EST_ID")
    @ManyToOne
    private JqEstado estProc;
    @JoinColumn(name = "LOG_SOL_ID", referencedColumnName = "SOL_ID")
    @ManyToOne(optional = false)
    private JqSolicitud logSolId;

    public JqLog() {
    }

    public JqLog(BigDecimal logId) {
        this.logId = logId;
    }

    public BigDecimal getLogId() {
        return logId;
    }

    public void setLogId(BigDecimal logId) {
        this.logId = logId;
    }

    public Date getLogFechaProc() {
        return logFechaProc;
    }

    public void setLogFechaProc(Date logFechaProc) {
        this.logFechaProc = logFechaProc;
    }

    public String getLogObservaciones() {
        return logObservaciones;
    }

    public void setLogObservaciones(String logObservaciones) {
        this.logObservaciones = logObservaciones;
    }

    public String getLogUsu() {
        return logUsu;
    }

    public void setLogUsu(String logUsu) {
        this.logUsu = logUsu;
    }

    public String getLogMotivoFalla() {
        return logMotivoFalla;
    }

    public void setLogMotivoFalla(String logMotivoFalla) {
        this.logMotivoFalla = logMotivoFalla;
    }

    public JqEstado getEstProc() {
        return estProc;
    }

    public void setEstProc(JqEstado estProc) {
        this.estProc = estProc;
    }

    public JqSolicitud getLogSolId() {
        return logSolId;
    }

    public void setLogSolId(JqSolicitud logSolId) {
        this.logSolId = logSolId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logId != null ? logId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JqLog)) {
            return false;
        }
        JqLog other = (JqLog) object;
        if ((this.logId == null && other.logId != null) || (this.logId != null && !this.logId.equals(other.logId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.JqLog[ logId=" + logId + " ]";
    }
    
}
