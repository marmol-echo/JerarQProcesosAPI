/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aeroman.jerarq.jerarqprocesosapi.entities.vhur;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author molin
 */
@Entity
@Table(name = "PLA_CCO_CEN_COSTO", catalog = "VHUR_AEROMAN", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaCcoCenCosto.findAll", query = "SELECT p FROM PlaCcoCenCosto p"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoCodgrc", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoCodgrc = :ccoCodgrc"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoCodcia", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoCodcia = :ccoCodcia"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoCodigo", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoCodigo = :ccoCodigo"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoDescripcion", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoDescripcion = :ccoDescripcion"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoValorHora", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoValorHora = :ccoValorHora"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoTipo", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoTipo = :ccoTipo"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoNomenclaturaContable", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoNomenclaturaContable = :ccoNomenclaturaContable"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoCodarf", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoCodarf = :ccoCodarf"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoGerencia", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoGerencia = :ccoGerencia"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoCodlin", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoCodlin = :ccoCodlin"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoCtaContable", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoCtaContable = :ccoCtaContable"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoCodempresa", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoCodempresa = :ccoCodempresa"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoSubCtaContable", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoSubCtaContable = :ccoSubCtaContable"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoCodccp", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoCodccp = :ccoCodccp"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoLocalizacion", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoLocalizacion = :ccoLocalizacion"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoEstado", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoEstado = :ccoEstado"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoCodpyt", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoCodpyt = :ccoCodpyt"),
    @NamedQuery(name = "PlaCcoCenCosto.findByCcoCodune", query = "SELECT p FROM PlaCcoCenCosto p WHERE p.ccoCodune = :ccoCodune")})
public class PlaCcoCenCosto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "CCO_CODGRC")
    private Integer ccoCodgrc;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "CCO_CODCIA")
    private int ccoCodcia;
    @Id
    @Basic(optional = false)
    //NotNull
    @Column(name = "CCO_CODIGO")
    private Short ccoCodigo;
    //@Size(max = 100)
    @Column(name = "CCO_DESCRIPCION")
    private String ccoDescripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CCO_VALOR_HORA")
    private Float ccoValorHora;
    //@Size(max = 1)
    @Column(name = "CCO_TIPO")
    private String ccoTipo;
    //@Size(max = 20)
    @Column(name = "CCO_NOMENCLATURA_CONTABLE")
    private String ccoNomenclaturaContable;
    @Column(name = "CCO_CODARF")
    private Short ccoCodarf;
    //@Size(max = 100)
    @Column(name = "CCO_GERENCIA")
    private String ccoGerencia;
    @Column(name = "CCO_CODLIN")
    private Integer ccoCodlin;
    //@Size(max = 20)
    @Column(name = "CCO_CTA_CONTABLE")
    private String ccoCtaContable;
    //@Size(max = 3)
    @Column(name = "CCO_CODEMPRESA")
    private String ccoCodempresa;
    //@Size(max = 3)
    @Column(name = "CCO_SUB_CTA_CONTABLE")
    private String ccoSubCtaContable;
    @Column(name = "CCO_CODCCP")
    private Integer ccoCodccp;
    //@Size(max = 3)
    @Column(name = "CCO_LOCALIZACION")
    private String ccoLocalizacion;
    @Column(name = "CCO_ESTADO")
    private Character ccoEstado;
    //@Size(max = 3)
    @Column(name = "CCO_CODPYT")
    private String ccoCodpyt;
    //@Size(max = 2)
    @Column(name = "CCO_CODUNE")
    private String ccoCodune;

    public PlaCcoCenCosto() {
    }

    public PlaCcoCenCosto(Short ccoCodigo) {
        this.ccoCodigo = ccoCodigo;
    }

    public PlaCcoCenCosto(Short ccoCodigo, int ccoCodcia) {
        this.ccoCodigo = ccoCodigo;
        this.ccoCodcia = ccoCodcia;
    }

    public Integer getCcoCodgrc() {
        return ccoCodgrc;
    }

    public void setCcoCodgrc(Integer ccoCodgrc) {
        this.ccoCodgrc = ccoCodgrc;
    }

    public int getCcoCodcia() {
        return ccoCodcia;
    }

    public void setCcoCodcia(int ccoCodcia) {
        this.ccoCodcia = ccoCodcia;
    }

    public Short getCcoCodigo() {
        return ccoCodigo;
    }

    public void setCcoCodigo(Short ccoCodigo) {
        this.ccoCodigo = ccoCodigo;
    }

    public String getCcoDescripcion() {
        return ccoDescripcion;
    }

    public void setCcoDescripcion(String ccoDescripcion) {
        this.ccoDescripcion = ccoDescripcion;
    }

    public Float getCcoValorHora() {
        return ccoValorHora;
    }

    public void setCcoValorHora(Float ccoValorHora) {
        this.ccoValorHora = ccoValorHora;
    }

    public String getCcoTipo() {
        return ccoTipo;
    }

    public void setCcoTipo(String ccoTipo) {
        this.ccoTipo = ccoTipo;
    }

    public String getCcoNomenclaturaContable() {
        return ccoNomenclaturaContable;
    }

    public void setCcoNomenclaturaContable(String ccoNomenclaturaContable) {
        this.ccoNomenclaturaContable = ccoNomenclaturaContable;
    }

    public Short getCcoCodarf() {
        return ccoCodarf;
    }

    public void setCcoCodarf(Short ccoCodarf) {
        this.ccoCodarf = ccoCodarf;
    }

    public String getCcoGerencia() {
        return ccoGerencia;
    }

    public void setCcoGerencia(String ccoGerencia) {
        this.ccoGerencia = ccoGerencia;
    }

    public Integer getCcoCodlin() {
        return ccoCodlin;
    }

    public void setCcoCodlin(Integer ccoCodlin) {
        this.ccoCodlin = ccoCodlin;
    }

    public String getCcoCtaContable() {
        return ccoCtaContable;
    }

    public void setCcoCtaContable(String ccoCtaContable) {
        this.ccoCtaContable = ccoCtaContable;
    }

    public String getCcoCodempresa() {
        return ccoCodempresa;
    }

    public void setCcoCodempresa(String ccoCodempresa) {
        this.ccoCodempresa = ccoCodempresa;
    }

    public String getCcoSubCtaContable() {
        return ccoSubCtaContable;
    }

    public void setCcoSubCtaContable(String ccoSubCtaContable) {
        this.ccoSubCtaContable = ccoSubCtaContable;
    }

    public Integer getCcoCodccp() {
        return ccoCodccp;
    }

    public void setCcoCodccp(Integer ccoCodccp) {
        this.ccoCodccp = ccoCodccp;
    }

    public String getCcoLocalizacion() {
        return ccoLocalizacion;
    }

    public void setCcoLocalizacion(String ccoLocalizacion) {
        this.ccoLocalizacion = ccoLocalizacion;
    }

    public Character getCcoEstado() {
        return ccoEstado;
    }

    public void setCcoEstado(Character ccoEstado) {
        this.ccoEstado = ccoEstado;
    }

    public String getCcoCodpyt() {
        return ccoCodpyt;
    }

    public void setCcoCodpyt(String ccoCodpyt) {
        this.ccoCodpyt = ccoCodpyt;
    }

    public String getCcoCodune() {
        return ccoCodune;
    }

    public void setCcoCodune(String ccoCodune) {
        this.ccoCodune = ccoCodune;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ccoCodigo != null ? ccoCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaCcoCenCosto)) {
            return false;
        }
        PlaCcoCenCosto other = (PlaCcoCenCosto) object;
        if ((this.ccoCodigo == null && other.ccoCodigo != null) || (this.ccoCodigo != null && !this.ccoCodigo.equals(other.ccoCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.vhur.PlaCcoCenCosto[ ccoCodigo=" + ccoCodigo + " ]";
    }
    
}
