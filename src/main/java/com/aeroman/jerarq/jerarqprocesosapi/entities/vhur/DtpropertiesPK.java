/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aeroman.jerarq.jerarqprocesosapi.entities.vhur;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;

/**
 *
 * @author molin
 */
@Embeddable
public class DtpropertiesPK implements Serializable {

    @Basic(optional = false)
    private int id;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 64)
    private String property;

    public DtpropertiesPK() {
    }

    public DtpropertiesPK(int id, String property) {
        this.id = id;
        this.property = property;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (property != null ? property.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DtpropertiesPK)) {
            return false;
        }
        DtpropertiesPK other = (DtpropertiesPK) object;
        if (this.id != other.id) {
            return false;
        }
        if ((this.property == null && other.property != null) || (this.property != null && !this.property.equals(other.property))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.vhur.DtpropertiesPK[ id=" + id + ", property=" + property + " ]";
    }
    
}
