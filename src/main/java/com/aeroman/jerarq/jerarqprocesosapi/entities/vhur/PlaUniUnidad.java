/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aeroman.jerarq.jerarqprocesosapi.entities.vhur;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author molin
 */
@Entity
@Table(name = "PLA_UNI_UNIDAD", catalog = "VHUR_AEROMAN", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaUniUnidad.findAll", query = "SELECT p FROM PlaUniUnidad p"),
    @NamedQuery(name = "PlaUniUnidad.findByUniCodgrc", query = "SELECT p FROM PlaUniUnidad p WHERE p.uniCodgrc = :uniCodgrc"),
    @NamedQuery(name = "PlaUniUnidad.findByUniCodcia", query = "SELECT p FROM PlaUniUnidad p WHERE p.uniCodcia = :uniCodcia"),
    @NamedQuery(name = "PlaUniUnidad.findByUniCodigo", query = "SELECT p FROM PlaUniUnidad p WHERE p.uniCodigo = :uniCodigo"),
    @NamedQuery(name = "PlaUniUnidad.findByUniNombre", query = "SELECT p FROM PlaUniUnidad p WHERE p.uniNombre = :uniNombre"),
    @NamedQuery(name = "PlaUniUnidad.findByUniDadCodigo", query = "SELECT p FROM PlaUniUnidad p WHERE p.uniDadCodigo = :uniDadCodigo"),
    @NamedQuery(name = "PlaUniUnidad.findByUniBroCodigo", query = "SELECT p FROM PlaUniUnidad p WHERE p.uniBroCodigo = :uniBroCodigo"),
    @NamedQuery(name = "PlaUniUnidad.findByUniCodarf", query = "SELECT p FROM PlaUniUnidad p WHERE p.uniCodarf = :uniCodarf"),
    @NamedQuery(name = "PlaUniUnidad.findByUniNivel", query = "SELECT p FROM PlaUniUnidad p WHERE p.uniNivel = :uniNivel"),
    @NamedQuery(name = "PlaUniUnidad.findByUniCodplz", query = "SELECT p FROM PlaUniUnidad p WHERE p.uniCodplz = :uniCodplz"),
    @NamedQuery(name = "PlaUniUnidad.findByUniStaff", query = "SELECT p FROM PlaUniUnidad p WHERE p.uniStaff = :uniStaff"),
    @NamedQuery(name = "PlaUniUnidad.findByUniCodpai", query = "SELECT p FROM PlaUniUnidad p WHERE p.uniCodpai = :uniCodpai"),
    @NamedQuery(name = "PlaUniUnidad.findByUniNombreIng", query = "SELECT p FROM PlaUniUnidad p WHERE p.uniNombreIng = :uniNombreIng")})
public class PlaUniUnidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "UNI_CODGRC")
    private int uniCodgrc;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "UNI_CODCIA")
    private int uniCodcia;
    @Id
    @Basic(optional = false)
    //@NotNull
    @Column(name = "UNI_CODIGO")
    private Integer uniCodigo;
    //@Size(max = 80)
    @Column(name = "UNI_NOMBRE")
    private String uniNombre;
    @Column(name = "UNI_DAD_CODIGO")
    private Integer uniDadCodigo;
    @Column(name = "UNI_BRO_CODIGO")
    private Integer uniBroCodigo;
    @Column(name = "UNI_CODARF")
    private Short uniCodarf;
    //@Size(max = 1)
    @Column(name = "UNI_NIVEL")
    private String uniNivel;
    @Column(name = "UNI_CODPLZ")
    private Integer uniCodplz;
    //@Size(max = 1)
    @Column(name = "UNI_STAFF")
    private String uniStaff;
    @Column(name = "UNI_CODPAI")
    private Short uniCodpai;
    //@Size(max = 80)
    @Column(name = "UNI_NOMBRE_ING")
    private String uniNombreIng;
    @OneToMany(mappedBy = "plzCoduni")
    private List<PlaPlzPlaza> plaPlzPlazaList;
    @JoinColumn(name = "UNI_CODTUN", referencedColumnName = "TUN_CODIGO")
    @ManyToOne
    private PlaTunTipoUnidad uniCodtun;

    public PlaUniUnidad() {
    }

    public PlaUniUnidad(Integer uniCodigo) {
        this.uniCodigo = uniCodigo;
    }

    public PlaUniUnidad(Integer uniCodigo, int uniCodgrc, int uniCodcia) {
        this.uniCodigo = uniCodigo;
        this.uniCodgrc = uniCodgrc;
        this.uniCodcia = uniCodcia;
    }

    public int getUniCodgrc() {
        return uniCodgrc;
    }

    public void setUniCodgrc(int uniCodgrc) {
        this.uniCodgrc = uniCodgrc;
    }

    public int getUniCodcia() {
        return uniCodcia;
    }

    public void setUniCodcia(int uniCodcia) {
        this.uniCodcia = uniCodcia;
    }

    public Integer getUniCodigo() {
        return uniCodigo;
    }

    public void setUniCodigo(Integer uniCodigo) {
        this.uniCodigo = uniCodigo;
    }

    public String getUniNombre() {
        return uniNombre;
    }

    public void setUniNombre(String uniNombre) {
        this.uniNombre = uniNombre;
    }

    public Integer getUniDadCodigo() {
        return uniDadCodigo;
    }

    public void setUniDadCodigo(Integer uniDadCodigo) {
        this.uniDadCodigo = uniDadCodigo;
    }

    public Integer getUniBroCodigo() {
        return uniBroCodigo;
    }

    public void setUniBroCodigo(Integer uniBroCodigo) {
        this.uniBroCodigo = uniBroCodigo;
    }

    public Short getUniCodarf() {
        return uniCodarf;
    }

    public void setUniCodarf(Short uniCodarf) {
        this.uniCodarf = uniCodarf;
    }

    public String getUniNivel() {
        return uniNivel;
    }

    public void setUniNivel(String uniNivel) {
        this.uniNivel = uniNivel;
    }

    public Integer getUniCodplz() {
        return uniCodplz;
    }

    public void setUniCodplz(Integer uniCodplz) {
        this.uniCodplz = uniCodplz;
    }

    public String getUniStaff() {
        return uniStaff;
    }

    public void setUniStaff(String uniStaff) {
        this.uniStaff = uniStaff;
    }

    public Short getUniCodpai() {
        return uniCodpai;
    }

    public void setUniCodpai(Short uniCodpai) {
        this.uniCodpai = uniCodpai;
    }

    public String getUniNombreIng() {
        return uniNombreIng;
    }

    public void setUniNombreIng(String uniNombreIng) {
        this.uniNombreIng = uniNombreIng;
    }

    @XmlTransient
    public List<PlaPlzPlaza> getPlaPlzPlazaList() {
        return plaPlzPlazaList;
    }

    public void setPlaPlzPlazaList(List<PlaPlzPlaza> plaPlzPlazaList) {
        this.plaPlzPlazaList = plaPlzPlazaList;
    }

    public PlaTunTipoUnidad getUniCodtun() {
        return uniCodtun;
    }

    public void setUniCodtun(PlaTunTipoUnidad uniCodtun) {
        this.uniCodtun = uniCodtun;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uniCodigo != null ? uniCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaUniUnidad)) {
            return false;
        }
        PlaUniUnidad other = (PlaUniUnidad) object;
        if ((this.uniCodigo == null && other.uniCodigo != null) || (this.uniCodigo != null && !this.uniCodigo.equals(other.uniCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.vhur.PlaUniUnidad[ uniCodigo=" + uniCodigo + " ]";
    }
    
}
