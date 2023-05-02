package com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "JQ_PLANTILLA_MAIL", catalog = "", schema = "JERARQ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JqPlantillaMail.findAll", query = "SELECT j FROM JqPlantillaMail j"),
    @NamedQuery(name = "JqPlantillaMail.findByPmlId", query = "SELECT j FROM JqPlantillaMail j WHERE j.pmlId = :pmlId"),
    @NamedQuery(name = "JqPlantillaMail.findByPmlAsunto", query = "SELECT j FROM JqPlantillaMail j WHERE j.pmlAsunto = :pmlAsunto"),
    @NamedQuery(name = "JqPlantillaMail.findByPmlCuerpo", query = "SELECT j FROM JqPlantillaMail j WHERE j.pmlCuerpo = :pmlCuerpo"),
    @NamedQuery(name = "JqPlantillaMail.findByPmlSaludo", query = "SELECT j FROM JqPlantillaMail j WHERE j.pmlSaludo = :pmlSaludo"),
    @NamedQuery(name = "JqPlantillaMail.findByPmlFinal", query = "SELECT j FROM JqPlantillaMail j WHERE j.pmlFinal = :pmlFinal")})
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "SP_SEND_EMAIL_JRQ", procedureName = "JERARQ.SP_SEND_EMAIL_JRQ", parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "ASUNTO", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "NOTIFICACION", type = BigDecimal.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "VHUR", type = BigDecimal.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "VHURCKRONO", type = BigDecimal.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "ENCABEZADO", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "IDS", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "BAJAS", type = BigDecimal.class),
                @StoredProcedureParameter(mode = ParameterMode.OUT, name = "SALIDA", type = String.class)}),})
public class JqPlantillaMail implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    //@NotNull
    @Column(name = "PML_ID")
    private BigDecimal pmlId;
    //@Size(max = 100)
    @Column(name = "PML_ASUNTO")
    private String pmlAsunto;
    //@Size(max = 500)
    @Column(name = "PML_CUERPO")
    private String pmlCuerpo;
    //@Size(max = 100)
    @Column(name = "PML_SALUDO")
    private String pmlSaludo;
    //@Size(max = 100)
    @Column(name = "PML_FINAL")
    private String pmlFinal;
    @Lob
    @Column(name = "PML_LOGO")
    private Serializable pmlLogo;

    public JqPlantillaMail() {
    }

    public JqPlantillaMail(BigDecimal pmlId) {
        this.pmlId = pmlId;
    }

    public BigDecimal getPmlId() {
        return pmlId;
    }

    public void setPmlId(BigDecimal pmlId) {
        this.pmlId = pmlId;
    }

    public String getPmlAsunto() {
        return pmlAsunto;
    }

    public void setPmlAsunto(String pmlAsunto) {
        this.pmlAsunto = pmlAsunto;
    }

    public String getPmlCuerpo() {
        return pmlCuerpo;
    }

    public void setPmlCuerpo(String pmlCuerpo) {
        this.pmlCuerpo = pmlCuerpo;
    }

    public String getPmlSaludo() {
        return pmlSaludo;
    }

    public void setPmlSaludo(String pmlSaludo) {
        this.pmlSaludo = pmlSaludo;
    }

    public String getPmlFinal() {
        return pmlFinal;
    }

    public void setPmlFinal(String pmlFinal) {
        this.pmlFinal = pmlFinal;
    }

    public Serializable getPmlLogo() {
        return pmlLogo;
    }

    public void setPmlLogo(Serializable pmlLogo) {
        this.pmlLogo = pmlLogo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pmlId != null ? pmlId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JqPlantillaMail)) {
            return false;
        }
        JqPlantillaMail other = (JqPlantillaMail) object;
        if ((this.pmlId == null && other.pmlId != null) || (this.pmlId != null && !this.pmlId.equals(other.pmlId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.JqPlantillaMail[ pmlId=" + pmlId + " ]";
    }
    
}
