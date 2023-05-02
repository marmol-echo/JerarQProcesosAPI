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
@Table(name = "JQ_USER", catalog = "", schema = "JERARQ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JqUser.findAll", query = "SELECT j FROM JqUser j"),
    @NamedQuery(name = "JqUser.findByUsrId", query = "SELECT j FROM JqUser j WHERE j.usrId = :usrId"),
    @NamedQuery(name = "JqUser.findByUsrEmail", query = "SELECT j FROM JqUser j WHERE j.usrEmail = :usrEmail"),
    @NamedQuery(name = "JqUser.findByUsrNombre", query = "SELECT j FROM JqUser j WHERE j.usrNombre = :usrNombre"),
    @NamedQuery(name = "JqUser.findByUsrUsuCrea", query = "SELECT j FROM JqUser j WHERE j.usrUsuCrea = :usrUsuCrea"),
    @NamedQuery(name = "JqUser.findByUsrUsuMod", query = "SELECT j FROM JqUser j WHERE j.usrUsuMod = :usrUsuMod"),
    @NamedQuery(name = "JqUser.findByUsrFechaCrea", query = "SELECT j FROM JqUser j WHERE j.usrFechaCrea = :usrFechaCrea"),
    @NamedQuery(name = "JqUser.findByUsrFechaMod", query = "SELECT j FROM JqUser j WHERE j.usrFechaMod = :usrFechaMod")})
public class JqUser implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
     @GeneratedValue(strategy=GenerationType.IDENTITY, generator="SEQ_JQ_USER_ID")
    @SequenceGenerator(name="SEQ_JQ_USER_ID", sequenceName="SEQ_JQ_USER_ID", allocationSize=1)
    //@NotNull
    @Column(name = "USR_ID")
    private BigDecimal usrId;
    //@Size(max = 50)
    @Column(name = "USR_EMAIL")
    private String usrEmail;
    //@Size(max = 50)
    @Column(name = "USR_NOMBRE")
    private String usrNombre;
    //@Size(max = 20)
    @Column(name = "USR_USU_CREA")
    private String usrUsuCrea;
    //@Size(max = 20)
    @Column(name = "USR_USU_MOD")
    private String usrUsuMod;
    @Column(name = "USR_FECHA_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaCrea;
    @Column(name = "USR_FECHA_MOD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaMod;
    @JoinColumn(name = "RES_ID", referencedColumnName = "RES_ID")
    @ManyToOne
    private JqResponsabilidad resId;

    public JqUser() {
    }

    public JqUser(BigDecimal usrId) {
        this.usrId = usrId;
    }

    public BigDecimal getUsrId() {
        return usrId;
    }

    public void setUsrId(BigDecimal usrId) {
        this.usrId = usrId;
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }

    public String getUsrNombre() {
        return usrNombre;
    }

    public void setUsrNombre(String usrNombre) {
        this.usrNombre = usrNombre;
    }

    public String getUsrUsuCrea() {
        return usrUsuCrea;
    }

    public void setUsrUsuCrea(String usrUsuCrea) {
        this.usrUsuCrea = usrUsuCrea;
    }

    public String getUsrUsuMod() {
        return usrUsuMod;
    }

    public void setUsrUsuMod(String usrUsuMod) {
        this.usrUsuMod = usrUsuMod;
    }

    public Date getUsrFechaCrea() {
        return usrFechaCrea;
    }

    public void setUsrFechaCrea(Date usrFechaCrea) {
        this.usrFechaCrea = usrFechaCrea;
    }

    public Date getUsrFechaMod() {
        return usrFechaMod;
    }

    public void setUsrFechaMod(Date usrFechaMod) {
        this.usrFechaMod = usrFechaMod;
    }

    public JqResponsabilidad getResId() {
        return resId;
    }

    public void setResId(JqResponsabilidad resId) {
        this.resId = resId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JqUser)) {
            return false;
        }
        JqUser other = (JqUser) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.JqUser[ usrId=" + usrId + " ]";
    }
    
}
