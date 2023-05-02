/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aeroman.jerarq.jerarqprocesosapi.entities.vhur;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author molin
 */
@Entity
@Table(name = "PLA_PLZ_PLAZA", catalog = "VHUR_AEROMAN", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaPlzPlaza.findAll", query = "SELECT p FROM PlaPlzPlaza p"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzCodcia", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzCodcia = :plzCodcia"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzCodigo", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzCodigo = :plzCodigo"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzNombre", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzNombre = :plzNombre"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzNombreIng", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzNombreIng = :plzNombreIng"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzCodpue", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzCodpue = :plzCodpue"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzEstado", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzEstado = :plzEstado"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzFechaSupre", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzFechaSupre = :plzFechaSupre"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzCenCosto", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzCenCosto = :plzCenCosto"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzCodcpu", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzCodcpu = :plzCodcpu"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzDadCodigo", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzDadCodigo = :plzDadCodigo"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzFechaCongelada", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzFechaCongelada = :plzFechaCongelada"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzPresupuestada", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzPresupuestada = :plzPresupuestada"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzIndefinida", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzIndefinida = :plzIndefinida"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzFechaini", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzFechaini = :plzFechaini"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzFechafin", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzFechafin = :plzFechafin"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzCentro", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzCentro = :plzCentro"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzFueboletinada", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzFueboletinada = :plzFueboletinada"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzJornada", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzJornada = :plzJornada"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzValor", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzValor = :plzValor"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzCodune", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzCodune = :plzCodune"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzCodpyt", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzCodpyt = :plzCodpyt"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzCoddir", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzCoddir = :plzCoddir"),
    @NamedQuery(name = "PlaPlzPlaza.findByPlzCodtpa", query = "SELECT p FROM PlaPlzPlaza p WHERE p.plzCodtpa = :plzCodtpa")})
public class PlaPlzPlaza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "PLZ_CODCIA")
    private int plzCodcia;
    @Id
    @Basic(optional = false)
    //@NotNull
    @Column(name = "PLZ_CODIGO")
    private Integer plzCodigo;
    //@Size(max = 80)
    @Column(name = "PLZ_NOMBRE")
    private String plzNombre;
    //@Size(max = 80)
    @Column(name = "PLZ_NOMBRE_ING")
    private String plzNombreIng;
    @Column(name = "PLZ_CODPUE")
    private Integer plzCodpue;
    //@Size(max = 1)
    @Column(name = "PLZ_ESTADO")
    private String plzEstado;
    @Column(name = "PLZ_FECHA_SUPRE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date plzFechaSupre;
    @Column(name = "PLZ_CEN_COSTO")
    private Short plzCenCosto;
    @Column(name = "PLZ_CODCPU")
    private Short plzCodcpu;
    @Column(name = "PLZ_DAD_CODIGO")
    private Integer plzDadCodigo;
    @Column(name = "PLZ_FECHA_CONGELADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date plzFechaCongelada;
    @Column(name = "PLZ_PRESUPUESTADA")
    private Boolean plzPresupuestada;
    @Column(name = "PLZ_INDEFINIDA")
    private Boolean plzIndefinida;
    @Column(name = "PLZ_FECHAINI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date plzFechaini;
    @Column(name = "PLZ_FECHAFIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date plzFechafin;
    //@Size(max = 20)
    @Column(name = "PLZ_CENTRO")
    private String plzCentro;
    @Column(name = "PLZ_FUEBOLETINADA")
    private Boolean plzFueboletinada;
    //@Size(max = 1)
    @Column(name = "PLZ_JORNADA")
    private String plzJornada;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PLZ_VALOR")
    private BigDecimal plzValor;
    //@Size(max = 2)
    @Column(name = "PLZ_CODUNE")
    private String plzCodune;
    //@Size(max = 3)
    @Column(name = "PLZ_CODPYT")
    private String plzCodpyt;
    //@Size(max = 3)
    @Column(name = "plz_coddir")
    private String plzCoddir;
    @Column(name = "PLZ_CODTPA")
    private Integer plzCodtpa;
    @JoinColumn(name = "PLZ_CODUBI", referencedColumnName = "UBI_CODIGO")
    @ManyToOne
    private PlaUbiUbicacion plzCodubi;
    @JoinColumn(name = "PLZ_CODUNI", referencedColumnName = "UNI_CODIGO")
    @ManyToOne
    private PlaUniUnidad plzCoduni;

    public PlaPlzPlaza() {
    }

    public PlaPlzPlaza(Integer plzCodigo) {
        this.plzCodigo = plzCodigo;
    }

    public PlaPlzPlaza(Integer plzCodigo, int plzCodcia) {
        this.plzCodigo = plzCodigo;
        this.plzCodcia = plzCodcia;
    }

    public int getPlzCodcia() {
        return plzCodcia;
    }

    public void setPlzCodcia(int plzCodcia) {
        this.plzCodcia = plzCodcia;
    }

    public Integer getPlzCodigo() {
        return plzCodigo;
    }

    public void setPlzCodigo(Integer plzCodigo) {
        this.plzCodigo = plzCodigo;
    }

    public String getPlzNombre() {
        return plzNombre;
    }

    public void setPlzNombre(String plzNombre) {
        this.plzNombre = plzNombre;
    }

    public String getPlzNombreIng() {
        return plzNombreIng;
    }

    public void setPlzNombreIng(String plzNombreIng) {
        this.plzNombreIng = plzNombreIng;
    }

    public Integer getPlzCodpue() {
        return plzCodpue;
    }

    public void setPlzCodpue(Integer plzCodpue) {
        this.plzCodpue = plzCodpue;
    }

    public String getPlzEstado() {
        return plzEstado;
    }

    public void setPlzEstado(String plzEstado) {
        this.plzEstado = plzEstado;
    }

    public Date getPlzFechaSupre() {
        return plzFechaSupre;
    }

    public void setPlzFechaSupre(Date plzFechaSupre) {
        this.plzFechaSupre = plzFechaSupre;
    }

    public Short getPlzCenCosto() {
        return plzCenCosto;
    }

    public void setPlzCenCosto(Short plzCenCosto) {
        this.plzCenCosto = plzCenCosto;
    }

    public Short getPlzCodcpu() {
        return plzCodcpu;
    }

    public void setPlzCodcpu(Short plzCodcpu) {
        this.plzCodcpu = plzCodcpu;
    }

    public Integer getPlzDadCodigo() {
        return plzDadCodigo;
    }

    public void setPlzDadCodigo(Integer plzDadCodigo) {
        this.plzDadCodigo = plzDadCodigo;
    }

    public Date getPlzFechaCongelada() {
        return plzFechaCongelada;
    }

    public void setPlzFechaCongelada(Date plzFechaCongelada) {
        this.plzFechaCongelada = plzFechaCongelada;
    }

    public Boolean getPlzPresupuestada() {
        return plzPresupuestada;
    }

    public void setPlzPresupuestada(Boolean plzPresupuestada) {
        this.plzPresupuestada = plzPresupuestada;
    }

    public Boolean getPlzIndefinida() {
        return plzIndefinida;
    }

    public void setPlzIndefinida(Boolean plzIndefinida) {
        this.plzIndefinida = plzIndefinida;
    }

    public Date getPlzFechaini() {
        return plzFechaini;
    }

    public void setPlzFechaini(Date plzFechaini) {
        this.plzFechaini = plzFechaini;
    }

    public Date getPlzFechafin() {
        return plzFechafin;
    }

    public void setPlzFechafin(Date plzFechafin) {
        this.plzFechafin = plzFechafin;
    }

    public String getPlzCentro() {
        return plzCentro;
    }

    public void setPlzCentro(String plzCentro) {
        this.plzCentro = plzCentro;
    }

    public Boolean getPlzFueboletinada() {
        return plzFueboletinada;
    }

    public void setPlzFueboletinada(Boolean plzFueboletinada) {
        this.plzFueboletinada = plzFueboletinada;
    }

    public String getPlzJornada() {
        return plzJornada;
    }

    public void setPlzJornada(String plzJornada) {
        this.plzJornada = plzJornada;
    }

    public BigDecimal getPlzValor() {
        return plzValor;
    }

    public void setPlzValor(BigDecimal plzValor) {
        this.plzValor = plzValor;
    }

    public String getPlzCodune() {
        return plzCodune;
    }

    public void setPlzCodune(String plzCodune) {
        this.plzCodune = plzCodune;
    }

    public String getPlzCodpyt() {
        return plzCodpyt;
    }

    public void setPlzCodpyt(String plzCodpyt) {
        this.plzCodpyt = plzCodpyt;
    }

    public String getPlzCoddir() {
        return plzCoddir;
    }

    public void setPlzCoddir(String plzCoddir) {
        this.plzCoddir = plzCoddir;
    }

    public Integer getPlzCodtpa() {
        return plzCodtpa;
    }

    public void setPlzCodtpa(Integer plzCodtpa) {
        this.plzCodtpa = plzCodtpa;
    }

    public PlaUbiUbicacion getPlzCodubi() {
        return plzCodubi;
    }

    public void setPlzCodubi(PlaUbiUbicacion plzCodubi) {
        this.plzCodubi = plzCodubi;
    }

    public PlaUniUnidad getPlzCoduni() {
        return plzCoduni;
    }

    public void setPlzCoduni(PlaUniUnidad plzCoduni) {
        this.plzCoduni = plzCoduni;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plzCodigo != null ? plzCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaPlzPlaza)) {
            return false;
        }
        PlaPlzPlaza other = (PlaPlzPlaza) object;
        if ((this.plzCodigo == null && other.plzCodigo != null) || (this.plzCodigo != null && !this.plzCodigo.equals(other.plzCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.vhur.PlaPlzPlaza[ plzCodigo=" + plzCodigo + " ]";
    }
    
}
