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
@Table(name = "PLA_UBI_UBICACION", catalog = "VHUR_AEROMAN", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaUbiUbicacion.findAll", query = "SELECT p FROM PlaUbiUbicacion p"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiCodcia", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiCodcia = :ubiCodcia"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiCodigo", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiCodigo = :ubiCodigo"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiDescripcion", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiDescripcion = :ubiDescripcion"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiDireccion", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiDireccion = :ubiDireccion"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiCodpai", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiCodpai = :ubiCodpai"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiCoddep", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiCoddep = :ubiCoddep"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiCodmun", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiCodmun = :ubiCodmun"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiPorcentajeCuotaIsss", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiPorcentajeCuotaIsss = :ubiPorcentajeCuotaIsss"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiNoPatronalIsss", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiNoPatronalIsss = :ubiNoPatronalIsss"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiCorrelativoPlanillaIsss", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiCorrelativoPlanillaIsss = :ubiCorrelativoPlanillaIsss"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiTelefono", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiTelefono = :ubiTelefono"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiFax", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiFax = :ubiFax"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiCodContabilizacion", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiCodContabilizacion = :ubiCodContabilizacion"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiPagPorcentIgssPatrono", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiPagPorcentIgssPatrono = :ubiPagPorcentIgssPatrono"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiTechoMaxAnual", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiTechoMaxAnual = :ubiTechoMaxAnual"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiPctSeguroAdicional", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiPctSeguroAdicional = :ubiPctSeguroAdicional"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiFondoMedico", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiFondoMedico = :ubiFondoMedico"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiArchivo", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiArchivo = :ubiArchivo"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiIntecap", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiIntecap = :ubiIntecap"),
    @NamedQuery(name = "PlaUbiUbicacion.findByUbiIrtra", query = "SELECT p FROM PlaUbiUbicacion p WHERE p.ubiIrtra = :ubiIrtra")})
public class PlaUbiUbicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "UBI_CODCIA")
    private int ubiCodcia;
    @Id
    @Basic(optional = false)
    //@NotNull
    @Column(name = "UBI_CODIGO")
    private Short ubiCodigo;
    //@Size(max = 50)
    @Column(name = "UBI_DESCRIPCION")
    private String ubiDescripcion;
    //@Size(max = 100)
    @Column(name = "UBI_DIRECCI\u00d3N")
    private String ubiDireccion;
    @Column(name = "UBI_CODPAI")
    private Short ubiCodpai;
    @Column(name = "UBI_CODDEP")
    private Short ubiCoddep;
    @Column(name = "UBI_CODMUN")
    private Short ubiCodmun;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UBI_PORCENTAJE_CUOTA_ISSS")
    private Float ubiPorcentajeCuotaIsss;
    //@Size(max = 12)
    @Column(name = "UBI_NO_PATRONAL_ISSS")
    private String ubiNoPatronalIsss;
    //@Size(max = 2)
    @Column(name = "UBI_CORRELATIVO_PLANILLA_ISSS")
    private String ubiCorrelativoPlanillaIsss;
    //@Size(max = 9)
    @Column(name = "UBI_TELEFONO")
    private String ubiTelefono;
    //@Size(max = 9)
    @Column(name = "UBI_FAX")
    private String ubiFax;
    //@Size(max = 20)
    @Column(name = "UBI_COD_CONTABILIZACION")
    private String ubiCodContabilizacion;
    @Column(name = "UBI_PAG_PORCENT_IGSS_PATRONO")
    private Float ubiPagPorcentIgssPatrono;
    @Column(name = "UBI_TECHO_MAX_ANUAL")
    private Float ubiTechoMaxAnual;
    @Column(name = "UBI_PCT_SEGURO_ADICIONAL")
    private Float ubiPctSeguroAdicional;
    @Column(name = "UBI_FONDO_MEDICO")
    private Float ubiFondoMedico;
    //@Size(max = 10)
    @Column(name = "UBI_ARCHIVO")
    private String ubiArchivo;
    @Column(name = "UBI_INTECAP")
    private Float ubiIntecap;
    @Column(name = "UBI_IRTRA")
    private Float ubiIrtra;
    @OneToMany(mappedBy = "plzCodubi")
    private List<PlaPlzPlaza> plaPlzPlazaList;

    public PlaUbiUbicacion() {
    }

    public PlaUbiUbicacion(Short ubiCodigo) {
        this.ubiCodigo = ubiCodigo;
    }

    public PlaUbiUbicacion(Short ubiCodigo, int ubiCodcia) {
        this.ubiCodigo = ubiCodigo;
        this.ubiCodcia = ubiCodcia;
    }

    public int getUbiCodcia() {
        return ubiCodcia;
    }

    public void setUbiCodcia(int ubiCodcia) {
        this.ubiCodcia = ubiCodcia;
    }

    public Short getUbiCodigo() {
        return ubiCodigo;
    }

    public void setUbiCodigo(Short ubiCodigo) {
        this.ubiCodigo = ubiCodigo;
    }

    public String getUbiDescripcion() {
        return ubiDescripcion;
    }

    public void setUbiDescripcion(String ubiDescripcion) {
        this.ubiDescripcion = ubiDescripcion;
    }

    public String getUbiDireccion() {
        return ubiDireccion;
    }

    public void setUbiDireccion(String ubiDirección) {
        this.ubiDireccion = ubiDirección;
    }

    public Short getUbiCodpai() {
        return ubiCodpai;
    }

    public void setUbiCodpai(Short ubiCodpai) {
        this.ubiCodpai = ubiCodpai;
    }

    public Short getUbiCoddep() {
        return ubiCoddep;
    }

    public void setUbiCoddep(Short ubiCoddep) {
        this.ubiCoddep = ubiCoddep;
    }

    public Short getUbiCodmun() {
        return ubiCodmun;
    }

    public void setUbiCodmun(Short ubiCodmun) {
        this.ubiCodmun = ubiCodmun;
    }

    public Float getUbiPorcentajeCuotaIsss() {
        return ubiPorcentajeCuotaIsss;
    }

    public void setUbiPorcentajeCuotaIsss(Float ubiPorcentajeCuotaIsss) {
        this.ubiPorcentajeCuotaIsss = ubiPorcentajeCuotaIsss;
    }

    public String getUbiNoPatronalIsss() {
        return ubiNoPatronalIsss;
    }

    public void setUbiNoPatronalIsss(String ubiNoPatronalIsss) {
        this.ubiNoPatronalIsss = ubiNoPatronalIsss;
    }

    public String getUbiCorrelativoPlanillaIsss() {
        return ubiCorrelativoPlanillaIsss;
    }

    public void setUbiCorrelativoPlanillaIsss(String ubiCorrelativoPlanillaIsss) {
        this.ubiCorrelativoPlanillaIsss = ubiCorrelativoPlanillaIsss;
    }

    public String getUbiTelefono() {
        return ubiTelefono;
    }

    public void setUbiTelefono(String ubiTelefono) {
        this.ubiTelefono = ubiTelefono;
    }

    public String getUbiFax() {
        return ubiFax;
    }

    public void setUbiFax(String ubiFax) {
        this.ubiFax = ubiFax;
    }

    public String getUbiCodContabilizacion() {
        return ubiCodContabilizacion;
    }

    public void setUbiCodContabilizacion(String ubiCodContabilizacion) {
        this.ubiCodContabilizacion = ubiCodContabilizacion;
    }

    public Float getUbiPagPorcentIgssPatrono() {
        return ubiPagPorcentIgssPatrono;
    }

    public void setUbiPagPorcentIgssPatrono(Float ubiPagPorcentIgssPatrono) {
        this.ubiPagPorcentIgssPatrono = ubiPagPorcentIgssPatrono;
    }

    public Float getUbiTechoMaxAnual() {
        return ubiTechoMaxAnual;
    }

    public void setUbiTechoMaxAnual(Float ubiTechoMaxAnual) {
        this.ubiTechoMaxAnual = ubiTechoMaxAnual;
    }

    public Float getUbiPctSeguroAdicional() {
        return ubiPctSeguroAdicional;
    }

    public void setUbiPctSeguroAdicional(Float ubiPctSeguroAdicional) {
        this.ubiPctSeguroAdicional = ubiPctSeguroAdicional;
    }

    public Float getUbiFondoMedico() {
        return ubiFondoMedico;
    }

    public void setUbiFondoMedico(Float ubiFondoMedico) {
        this.ubiFondoMedico = ubiFondoMedico;
    }

    public String getUbiArchivo() {
        return ubiArchivo;
    }

    public void setUbiArchivo(String ubiArchivo) {
        this.ubiArchivo = ubiArchivo;
    }

    public Float getUbiIntecap() {
        return ubiIntecap;
    }

    public void setUbiIntecap(Float ubiIntecap) {
        this.ubiIntecap = ubiIntecap;
    }

    public Float getUbiIrtra() {
        return ubiIrtra;
    }

    public void setUbiIrtra(Float ubiIrtra) {
        this.ubiIrtra = ubiIrtra;
    }

    @XmlTransient
    public List<PlaPlzPlaza> getPlaPlzPlazaList() {
        return plaPlzPlazaList;
    }

    public void setPlaPlzPlazaList(List<PlaPlzPlaza> plaPlzPlazaList) {
        this.plaPlzPlazaList = plaPlzPlazaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ubiCodigo != null ? ubiCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaUbiUbicacion)) {
            return false;
        }
        PlaUbiUbicacion other = (PlaUbiUbicacion) object;
        if ((this.ubiCodigo == null && other.ubiCodigo != null) || (this.ubiCodigo != null && !this.ubiCodigo.equals(other.ubiCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.vhur.PlaUbiUbicacion[ ubiCodigo=" + ubiCodigo + " ]";
    }
    
}
