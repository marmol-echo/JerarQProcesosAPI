package com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
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
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "JQ_DETALLE_SOLICITUD", catalog = "", schema = "JERARQ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JqDetalleSolicitud.findAll", query = "SELECT j FROM JqDetalleSolicitud j"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetId", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detId = :detId"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetCod86", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detCod86 = :detCod86"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetCodM4", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detCodM4 = :detCodM4"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetCodVhur", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detCodVhur = :detCodVhur"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetMotivoRechazo", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detMotivoRechazo = :detMotivoRechazo"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetNombreCompleto", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detNombreCompleto = :detNombreCompleto"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetShop", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detShop = :detShop"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetSkill", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detSkill = :detSkill"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetCco", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detCco = :detCco"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetCcoLinea", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detCcoLinea = :detCcoLinea"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetCodJefe", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detCodJefe = :detCodJefe"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetNombreJefe", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detNombreJefe = :detNombreJefe"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetGerencia", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detGerencia = :detGerencia"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetNombrePuesto", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detNombrePuesto = :detNombrePuesto"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetTipoContrato", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detTipoContrato = :detTipoContrato"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetAutorizado", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detAutorizado = :detAutorizado"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetHangar", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detHangar = :detHangar"),
    @NamedQuery(name = "JqDetalleSolicitud.findByDetBahia", query = "SELECT j FROM JqDetalleSolicitud j WHERE j.detBahia = :detBahia")})
public class JqDetalleSolicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SEQ_JQ_DETALLE_ID")
    @SequenceGenerator(name = "SEQ_JQ_DETALLE_ID", sequenceName = "SEQ_JQ_DETALLE_ID", allocationSize = 1)
    //@NotNull
    @Column(name = "DET_ID")
    private BigDecimal detId;
    //@Size(max = 7)
    @Column(name = "DET_COD_86")
    private String detCod86;
    //@Size(max = 7)
    @Column(name = "DET_COD_M4")
    private String detCodM4;
    //@Size(max = 7)
    @Column(name = "DET_COD_VHUR")
    private String detCodVhur;
    //@Size(max = 200)
    @Column(name = "DET_MOTIVO_RECHAZO")
    private String detMotivoRechazo;
    //@Size(max = 100)
    @Column(name = "DET_NOMBRE_COMPLETO")
    private String detNombreCompleto;
    @Column(name = "DET_SHOP")
    private Short detShop;
    //@Size(max = 4)
    @Column(name = "DET_SKILL")
    private String detSkill;
    //@Size(max = 5)
    @Column(name = "DET_CCO")
    private String detCco;
    //@Size(max = 50)
    @Column(name = "DET_CCO_LINEA")
    private String detCcoLinea;
    //@Size(max = 10)
    @Column(name = "DET_COD_JEFE")
    private String detCodJefe;
    //@Size(max = 50)
    @Column(name = "DET_NOMBRE_JEFE")
    private String detNombreJefe;
    //@Size(max = 50)
    @Column(name = "DET_GERENCIA")
    private String detGerencia;
    //@Size(max = 50)
    @Column(name = "DET_NOMBRE_PUESTO")
    private String detNombrePuesto;
    //@Size(max = 20)
    @Column(name = "DET_TIPO_CONTRATO")
    private String detTipoContrato;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "DET_AUTORIZADO")
    private BigInteger detAutorizado;
    //@Size(max = 5)
    @Column(name = "DET_HANGAR")
    private String detHangar;
    //@Size(max = 50)
    @Column(name = "DET_BAHIA")
    private String detBahia;
    @JoinColumn(name = "SOL_ID", referencedColumnName = "SOL_ID")
    @ManyToOne(optional = false)
    private JqSolicitud solId;

    public JqDetalleSolicitud() {
    }

    public JqDetalleSolicitud(BigDecimal detId) {
        this.detId = detId;
    }

    public JqDetalleSolicitud(BigDecimal detId, BigInteger detAutorizado) {
        this.detId = detId;
        this.detAutorizado = detAutorizado;
    }

    public BigDecimal getDetId() {
        return detId;
    }

    public void setDetId(BigDecimal detId) {
        this.detId = detId;
    }

    public String getDetCod86() {
        return detCod86;
    }

    public void setDetCod86(String detCod86) {
        this.detCod86 = detCod86;
    }

    public String getDetCodM4() {
        return detCodM4;
    }

    public void setDetCodM4(String detCodM4) {
        this.detCodM4 = detCodM4;
    }

    public String getDetCodVhur() {
        return detCodVhur;
    }

    public void setDetCodVhur(String detCodVhur) {
        this.detCodVhur = detCodVhur;
    }

    public String getDetMotivoRechazo() {
        return detMotivoRechazo;
    }

    public void setDetMotivoRechazo(String detMotivoRechazo) {
        this.detMotivoRechazo = detMotivoRechazo;
    }

    public String getDetNombreCompleto() {
        return detNombreCompleto;
    }

    public void setDetNombreCompleto(String detNombreCompleto) {
        this.detNombreCompleto = detNombreCompleto;
    }

    public Short getDetShop() {
        return detShop;
    }

    public void setDetShop(Short detShop) {
        this.detShop = detShop;
    }

    public String getDetSkill() {
        return detSkill;
    }

    public void setDetSkill(String detSkill) {
        this.detSkill = detSkill;
    }

    public String getDetCco() {
        return detCco;
    }

    public void setDetCco(String detCco) {
        this.detCco = detCco;
    }

    public String getDetCcoLinea() {
        return detCcoLinea;
    }

    public void setDetCcoLinea(String detCcoLinea) {
        this.detCcoLinea = detCcoLinea;
    }

    public String getDetCodJefe() {
        return detCodJefe;
    }

    public void setDetCodJefe(String detCodJefe) {
        this.detCodJefe = detCodJefe;
    }

    public String getDetNombreJefe() {
        return detNombreJefe;
    }

    public void setDetNombreJefe(String detNombreJefe) {
        this.detNombreJefe = detNombreJefe;
    }

    public String getDetGerencia() {
        return detGerencia;
    }

    public void setDetGerencia(String detGerencia) {
        this.detGerencia = detGerencia;
    }

    public String getDetNombrePuesto() {
        return detNombrePuesto;
    }

    public void setDetNombrePuesto(String detNombrePuesto) {
        this.detNombrePuesto = detNombrePuesto;
    }

    public String getDetTipoContrato() {
        return detTipoContrato;
    }

    public void setDetTipoContrato(String detTipoContrato) {
        this.detTipoContrato = detTipoContrato;
    }

    public BigInteger getDetAutorizado() {
        return detAutorizado;
    }

    public void setDetAutorizado(BigInteger detAutorizado) {
        this.detAutorizado = detAutorizado;
    }

    public String getDetHangar() {
        return detHangar;
    }

    public void setDetHangar(String detHangar) {
        this.detHangar = detHangar;
    }

    public String getDetBahia() {
        return detBahia;
    }

    public void setDetBahia(String detBahia) {
        this.detBahia = detBahia;
    }

    public JqSolicitud getSolId() {
        return solId;
    }

    public void setSolId(JqSolicitud solId) {
        this.solId = solId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detId != null ? detId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Boolean value;
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(obj instanceof JqDetalleSolicitud)) {
            value = false;
        }
        JqDetalleSolicitud other = (JqDetalleSolicitud) obj;
        if (!Objects.equals(this.detCod86, other.detCod86)) {
            value = false;
        } else if (!Objects.equals(this.detCodM4, other.detCodM4)) {
            value = false;
        } else if (!Objects.equals(this.detGerencia, other.detGerencia)) {
            value = false;
        } else if (!Objects.equals(this.detNombreCompleto, other.detNombreCompleto)) {
            value = false;
        } else if (!Objects.equals(this.detNombrePuesto, other.detNombrePuesto)) {
            value = false;
        } else if (!Objects.equals(this.detNombrePuesto, other.detNombrePuesto)) {
            value = false;
        } else if (!Objects.equals(this.detCcoLinea, other.detCcoLinea)) {
            value = false;
        } else if (!Objects.equals(this.detCco, other.detCco)) {
            value = false;
        } else if (!Objects.equals(this.detCodJefe, other.detCodJefe)) {
            value = false;
        } else if (!Objects.equals(this.detNombreJefe, other.detNombreJefe)) {
            value = false;
        } else if (!Objects.equals(this.detBahia, other.detBahia)) {
            value = false;
        } else if (!Objects.equals(this.detHangar, other.detHangar)) {
            value = false;
        } else if(!Objects.equals(this.detShop, other.detShop)) {
            value = false;
        } else if(!Objects.equals(this.detSkill, other.detSkill)) {
            value = false;
        } else {
            value = true;
        }
        return value;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.JqDetalleSolicitud[ detId=" + detId + " ]";
    }

}
