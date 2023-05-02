/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aeroman.jerarq.jerarqprocesosapi.entities.vhur;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author molin
 */
@Entity
@Table(catalog = "VHUR_AEROMAN", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dtproperties.findAll", query = "SELECT d FROM Dtproperties d"),
    @NamedQuery(name = "Dtproperties.findById", query = "SELECT d FROM Dtproperties d WHERE d.dtpropertiesPK.id = :id"),
    @NamedQuery(name = "Dtproperties.findByObjectid", query = "SELECT d FROM Dtproperties d WHERE d.objectid = :objectid"),
    @NamedQuery(name = "Dtproperties.findByProperty", query = "SELECT d FROM Dtproperties d WHERE d.dtpropertiesPK.property = :property"),
    @NamedQuery(name = "Dtproperties.findByValue", query = "SELECT d FROM Dtproperties d WHERE d.value = :value"),
    @NamedQuery(name = "Dtproperties.findByVersion", query = "SELECT d FROM Dtproperties d WHERE d.version = :version"),
    @NamedQuery(name = "Dtproperties.findByUvalue", query = "SELECT d FROM Dtproperties d WHERE d.uvalue = :uvalue")})
public class Dtproperties implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DtpropertiesPK dtpropertiesPK;
    private Integer objectid;
    //@Size(max = 255)
    private String value;
    @Lob
    private Serializable lvalue;
    @Basic(optional = false)
    //@NotNull
    private int version;
    //@Size(max = 255)
    private String uvalue;

    public Dtproperties() {
    }

    public Dtproperties(DtpropertiesPK dtpropertiesPK) {
        this.dtpropertiesPK = dtpropertiesPK;
    }

    public Dtproperties(DtpropertiesPK dtpropertiesPK, int version) {
        this.dtpropertiesPK = dtpropertiesPK;
        this.version = version;
    }

    public Dtproperties(int id, String property) {
        this.dtpropertiesPK = new DtpropertiesPK(id, property);
    }

    public DtpropertiesPK getDtpropertiesPK() {
        return dtpropertiesPK;
    }

    public void setDtpropertiesPK(DtpropertiesPK dtpropertiesPK) {
        this.dtpropertiesPK = dtpropertiesPK;
    }

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Serializable getLvalue() {
        return lvalue;
    }

    public void setLvalue(Serializable lvalue) {
        this.lvalue = lvalue;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getUvalue() {
        return uvalue;
    }

    public void setUvalue(String uvalue) {
        this.uvalue = uvalue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtpropertiesPK != null ? dtpropertiesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dtproperties)) {
            return false;
        }
        Dtproperties other = (Dtproperties) object;
        if ((this.dtpropertiesPK == null && other.dtpropertiesPK != null) || (this.dtpropertiesPK != null && !this.dtpropertiesPK.equals(other.dtpropertiesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.vhur.Dtproperties[ dtpropertiesPK=" + dtpropertiesPK + " ]";
    }
    
}
