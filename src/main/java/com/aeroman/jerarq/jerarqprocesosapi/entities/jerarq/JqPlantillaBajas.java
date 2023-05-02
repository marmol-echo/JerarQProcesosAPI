package com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author molin
 */
@Entity
@Table(name = "JQ_PLANTILLA_BAJAS", catalog = "", schema = "JERARQ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JqPlantillaBajas.findAll", query = "SELECT j FROM JqPlantillaBajas j"),
    @NamedQuery(name = "JqPlantillaBajas.findByBajId", query = "SELECT j FROM JqPlantillaBajas j WHERE j.bajId = :bajId"),
    @NamedQuery(name = "JqPlantillaBajas.findByBajCod86", query = "SELECT j FROM JqPlantillaBajas j WHERE j.bajCod86 = :bajCod86"),
    @NamedQuery(name = "JqPlantillaBajas.findByBajCodm4", query = "SELECT j FROM JqPlantillaBajas j WHERE j.bajCodm4 = :bajCodm4"),
    @NamedQuery(name = "JqPlantillaBajas.findByBajNombreCompleto", query = "SELECT j FROM JqPlantillaBajas j WHERE j.bajNombreCompleto = :bajNombreCompleto"),
    @NamedQuery(name = "JqPlantillaBajas.findByBajNombrePlaza", query = "SELECT j FROM JqPlantillaBajas j WHERE j.bajNombrePlaza = :bajNombrePlaza")})
public class JqPlantillaBajas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY, generator="SEQ_JQ_PLANTILLA_BAJAS")
    @SequenceGenerator(name="SEQ_JQ_PLANTILLA_BAJAS", sequenceName="SEQ_JQ_PLANTILLA_BAJAS", allocationSize=1)
    @Basic(optional = false)
    @Column(name = "BAJ_ID")
    private BigDecimal bajId;
    @Column(name = "BAJ_COD86")
    private String bajCod86;
    @Column(name = "BAJ_CODM4")
    private String bajCodm4;
    @Column(name = "BAJ_NOMBRE_COMPLETO")
    private String bajNombreCompleto;
    @Column(name = "BAJ_NOMBRE_PLAZA")
    private String bajNombrePlaza;

    public JqPlantillaBajas() {}

    public JqPlantillaBajas(BigDecimal bajId) {
        this.bajId = bajId;
    }

    public JqPlantillaBajas(String bajCod86, String bajCodm4, String bajNombreCompleto, String bajNombrePlaza) {
        this.bajCod86 = bajCod86;
        this.bajCodm4 = bajCodm4;
        this.bajNombreCompleto = bajNombreCompleto;
        this.bajNombrePlaza = bajNombrePlaza;
    }

    public BigDecimal getBajId() {
        return bajId;
    }

    public void setBajId(BigDecimal bajId) {
        this.bajId = bajId;
    }

    public String getBajCod86() {
        return bajCod86;
    }

    public void setBajCod86(String bajCod86) {
        this.bajCod86 = bajCod86;
    }

    public String getBajCodm4() {
        return bajCodm4;
    }

    public void setBajCodm4(String bajCodm4) {
        this.bajCodm4 = bajCodm4;
    }

    public String getBajNombreCompleto() {
        return bajNombreCompleto;
    }

    public void setBajNombreCompleto(String bajNombreCompleto) {
        this.bajNombreCompleto = bajNombreCompleto;
    }

    public String getBajNombrePlaza() {
        return bajNombrePlaza;
    }

    public void setBajNombrePlaza(String bajNombrePlaza) {
        this.bajNombrePlaza = bajNombrePlaza;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bajId != null ? bajId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JqPlantillaBajas)) {
            return false;
        }
        JqPlantillaBajas other = (JqPlantillaBajas) object;
        if ((this.bajId == null && other.bajId != null) || (this.bajId != null && !this.bajId.equals(other.bajId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.jerarqprocesobajasapi.entities.jerarq.JqPlantillaBajas[ bajId=" + bajId + " ]";
    }
    
}
