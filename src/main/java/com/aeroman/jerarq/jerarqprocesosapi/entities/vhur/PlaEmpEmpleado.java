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
@Table(name = "PLA_EMP_EMPLEADO", catalog = "VHUR_AEROMAN", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaEmpEmpleado.findAll", query = "SELECT p FROM PlaEmpEmpleado p"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodcia", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodcia = :empCodcia"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodigo", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodigo = :empCodigo"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpLetraIndice", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empLetraIndice = :empLetraIndice"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpPrimerApe", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empPrimerApe = :empPrimerApe"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpSegundoApe", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empSegundoApe = :empSegundoApe"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpApellidoCas", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empApellidoCas = :empApellidoCas"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpPrimerNom", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empPrimerNom = :empPrimerNom"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpSegundoNom", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empSegundoNom = :empSegundoNom"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodtip", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodtip = :empCodtip"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpDireccion", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empDireccion = :empDireccion"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodpai", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodpai = :empCodpai"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCoddep", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCoddep = :empCoddep"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodmun", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodmun = :empCodmun"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpTelefono", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empTelefono = :empTelefono"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpLugarNac", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empLugarNac = :empLugarNac"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpNacionalidad", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empNacionalidad = :empNacionalidad"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechaNac", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechaNac = :empFechaNac"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpSexo", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empSexo = :empSexo"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpProfesion", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empProfesion = :empProfesion"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpEstado", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empEstado = :empEstado"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpEstadoCivil", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empEstadoCivil = :empEstadoCivil"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechaIngreso", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechaIngreso = :empFechaIngreso"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechaRetiro", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechaRetiro = :empFechaRetiro"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodmrt", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodmrt = :empCodmrt"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpSalPromedio", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empSalPromedio = :empSalPromedio"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpUsuarioCrea", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empUsuarioCrea = :empUsuarioCrea"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechaCrea", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechaCrea = :empFechaCrea"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpUsuarioMod", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empUsuarioMod = :empUsuarioMod"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechaMod", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechaMod = :empFechaMod"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodjor", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodjor = :empCodjor"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodtpl", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodtpl = :empCodtpl"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCalSalPromedio", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCalSalPromedio = :empCalSalPromedio"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodmunNac", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodmunNac = :empCodmunNac"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodigoPostal", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodigoPostal = :empCodigoPostal"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodicrBanco", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodicrBanco = :empCodicrBanco"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpBonificacion", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empBonificacion = :empBonificacion"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCuentaBanco", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCuentaBanco = :empCuentaBanco"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpViaticos", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empViaticos = :empViaticos"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpSalarioHora", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empSalarioHora = :empSalarioHora"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpTipoContrato", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empTipoContrato = :empTipoContrato"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpTipoCtaBanco", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empTipoCtaBanco = :empTipoCtaBanco"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFormaPago", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFormaPago = :empFormaPago"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodigoAnterior", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodigoAnterior = :empCodigoAnterior"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodplz", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodplz = :empCodplz"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpExpSalario", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empExpSalario = :empExpSalario"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpSalario", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empSalario = :empSalario"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpContratoInicio", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empContratoInicio = :empContratoInicio"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpContratoFin", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empContratoFin = :empContratoFin"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpUltimoSalario", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empUltimoSalario = :empUltimoSalario"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechaUltimoIncremento", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechaUltimoIncremento = :empFechaUltimoIncremento"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCoddepNac", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCoddepNac = :empCoddepNac"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpEdad", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empEdad = :empEdad"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechaIngresoCorp", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechaIngresoCorp = :empFechaIngresoCorp"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechaUltimaLiq", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechaUltimaLiq = :empFechaUltimaLiq"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpUbiPlaza", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empUbiPlaza = :empUbiPlaza"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechaCalVac", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechaCalVac = :empFechaCalVac"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechaUltActDatos", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechaUltActDatos = :empFechaUltActDatos"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechaUltInvest", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechaUltInvest = :empFechaUltInvest"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpNumeroCaso", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empNumeroCaso = :empNumeroCaso"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpBononoafecto", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empBononoafecto = :empBononoafecto"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCatSeguromed", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCatSeguromed = :empCatSeguromed"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpTotaldev", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empTotaldev = :empTotaldev"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechaUltLiq", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechaUltLiq = :empFechaUltLiq"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpUltimoBononoafecto", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empUltimoBononoafecto = :empUltimoBononoafecto"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpUltimaBonificacion", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empUltimaBonificacion = :empUltimaBonificacion"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpEmail", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empEmail = :empEmail"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpEmailInterno", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empEmailInterno = :empEmailInterno"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFoto", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFoto = :empFoto"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodcem", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodcem = :empCodcem"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpColonia", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empColonia = :empColonia"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpAvenida", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empAvenida = :empAvenida"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpNumRequisicion", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empNumRequisicion = :empNumRequisicion"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpJustificacion", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empJustificacion = :empJustificacion"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCelular", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCelular = :empCelular"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpBeeper", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empBeeper = :empBeeper"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechaPrograJubi", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechaPrograJubi = :empFechaPrograJubi"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechaJubilacion", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechaJubilacion = :empFechaJubilacion"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpAntiguedadCorp", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empAntiguedadCorp = :empAntiguedadCorp"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpAntiguedadEmpresa", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empAntiguedadEmpresa = :empAntiguedadEmpresa"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpSalarioDolares", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empSalarioDolares = :empSalarioDolares"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCuentaEnDolares", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCuentaEnDolares = :empCuentaEnDolares"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpTipoCuentaDolares", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empTipoCuentaDolares = :empTipoCuentaDolares"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodicrDolares", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodicrDolares = :empCodicrDolares"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpArchivo", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empArchivo = :empArchivo"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodplzTemp", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodplzTemp = :empCodplzTemp"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechafinTemp", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechafinTemp = :empFechafinTemp"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCasa", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCasa = :empCasa"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpReferencia", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empReferencia = :empReferencia"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCuentaCoddep", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCuentaCoddep = :empCuentaCoddep"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCuentaCodmun", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCuentaCodmun = :empCuentaCodmun"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpPagaRentaPat", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empPagaRentaPat = :empPagaRentaPat"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpTieneAnticipo", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empTieneAnticipo = :empTieneAnticipo"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpEmpresaOrigen", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empEmpresaOrigen = :empEmpresaOrigen"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpMotivoRetiro", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empMotivoRetiro = :empMotivoRetiro"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCausaRetiro", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCausaRetiro = :empCausaRetiro"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCargoRetiro", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCargoRetiro = :empCargoRetiro"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodigoBasis", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodigoBasis = :empCodigoBasis"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodcmr", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodcmr = :empCodcmr"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodjor2", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodjor2 = :empCodjor2"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpNombreApellido", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empNombreApellido = :empNombreApellido"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpApellidosNombres", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empApellidosNombres = :empApellidosNombres"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpNombresApellidos", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empNombresApellidos = :empNombresApellidos"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodigoRep", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodigoRep = :empCodigoRep"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpPrueba", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empPrueba = :empPrueba"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCuentaContable", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCuentaContable = :empCuentaContable"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpNumHorasXMes", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empNumHorasXMes = :empNumHorasXMes"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpIndigena", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empIndigena = :empIndigena"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpfechaultimoincrementoBonificacion", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empfechaultimoincrementoBonificacion = :empfechaultimoincrementoBonificacion"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFechaUltimoIncBoniNoafecta", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFechaUltimoIncBoniNoafecta = :empFechaUltimoIncBoniNoafecta"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpTercerNom", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empTercerNom = :empTercerNom"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodigoM4", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodigoM4 = :empCodigoM4"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodpaiAlter", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodpaiAlter = :empCodpaiAlter"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCoddepAlter", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCoddepAlter = :empCoddepAlter"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodmunAlter", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodmunAlter = :empCodmunAlter"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpColoniaAlter", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empColoniaAlter = :empColoniaAlter"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpAvenidaAlter", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empAvenidaAlter = :empAvenidaAlter"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpDireccionAlter", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empDireccionAlter = :empDireccionAlter"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodigoAnterior2", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodigoAnterior2 = :empCodigoAnterior2"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpExtensionMilenium", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empExtensionMilenium = :empExtensionMilenium"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpGastosRepresentacion", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empGastosRepresentacion = :empGastosRepresentacion"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpCodigoTmp", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empCodigoTmp = :empCodigoTmp"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpSalarioHoraExtranjero", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empSalarioHoraExtranjero = :empSalarioHoraExtranjero"),
    @NamedQuery(name = "PlaEmpEmpleado.findByEmpFecVacuna", query = "SELECT p FROM PlaEmpEmpleado p WHERE p.empFecVacuna = :empFecVacuna")})
public class PlaEmpEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "EMP_CODCIA")
    private int empCodcia;
    @Id
    @Basic(optional = false)
    //@NotNull
    @Column(name = "EMP_CODIGO")
    private Integer empCodigo;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 1)
    @Column(name = "EMP_LETRA_INDICE")
    private String empLetraIndice;
    //@Size(max = 20)
    @Column(name = "EMP_PRIMER_APE")
    private String empPrimerApe;
    //@Size(max = 20)
    @Column(name = "EMP_SEGUNDO_APE")
    private String empSegundoApe;
    //@Size(max = 20)
    @Column(name = "EMP_APELLIDO_CAS")
    private String empApellidoCas;
    //@Size(max = 20)
    @Column(name = "EMP_PRIMER_NOM")
    private String empPrimerNom;
    //@Size(max = 20)
    @Column(name = "EMP_SEGUNDO_NOM")
    private String empSegundoNom;
    @Column(name = "EMP_CODTIP")
    private Short empCodtip;
    //@Size(max = 150)
    @Column(name = "EMP_DIRECCION")
    private String empDireccion;
    @Column(name = "EMP_CODPAI")
    private Short empCodpai;
    @Column(name = "EMP_CODDEP")
    private Short empCoddep;
    @Column(name = "EMP_CODMUN")
    private Short empCodmun;
    //@Size(max = 45)
    @Column(name = "EMP_TELEFONO")
    private String empTelefono;
    @Column(name = "EMP_LUGAR_NAC")
    private Short empLugarNac;
    @Column(name = "EMP_NACIONALIDAD")
    private Short empNacionalidad;
    @Column(name = "EMP_FECHA_NAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaNac;
    //@Size(max = 1)
    @Column(name = "EMP_SEXO")
    private String empSexo;
    //@Size(max = 40)
    @Column(name = "EMP_PROFESION")
    private String empProfesion;
    //@Size(max = 1)
    @Column(name = "EMP_ESTADO")
    private String empEstado;
    //@Size(max = 1)
    @Column(name = "EMP_ESTADO_CIVIL")
    private String empEstadoCivil;
    @Column(name = "EMP_FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaIngreso;
    @Column(name = "EMP_FECHA_RETIRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaRetiro;
    @Column(name = "EMP_CODMRT")
    private Short empCodmrt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "EMP_SAL_PROMEDIO")
    private BigDecimal empSalPromedio;
    //@Size(max = 50)
    @Column(name = "EMP_USUARIO_CREA")
    private String empUsuarioCrea;
    @Column(name = "EMP_FECHA_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaCrea;
    //@Size(max = 50)
    @Column(name = "EMP_USUARIO_MOD")
    private String empUsuarioMod;
    @Column(name = "EMP_FECHA_MOD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaMod;
    @Column(name = "EMP_CODJOR")
    private Short empCodjor;
    @Column(name = "EMP_CODTPL")
    private Short empCodtpl;
    //@Size(max = 1)
    @Column(name = "EMP_CAL_SAL_PROMEDIO")
    private String empCalSalPromedio;
    @Column(name = "EMP_CODMUN_NAC")
    private Short empCodmunNac;
    //@Size(max = 10)
    @Column(name = "EMP_CODIGO_POSTAL")
    private String empCodigoPostal;
    @Column(name = "EMP_CODICR_BANCO")
    private Short empCodicrBanco;
    @Column(name = "EMP_BONIFICACION")
    private BigDecimal empBonificacion;
    //@Size(max = 20)
    @Column(name = "EMP_CUENTA_BANCO")
    private String empCuentaBanco;
    @Column(name = "EMP_VIATICOS")
    private BigDecimal empViaticos;
    @Column(name = "EMP_SALARIO_HORA")
    private BigDecimal empSalarioHora;
    @Column(name = "EMP_TIPO_CONTRATO")
    private Short empTipoContrato;
    //@Size(max = 1)
    @Column(name = "EMP_TIPO_CTA_BANCO")
    private String empTipoCtaBanco;
    //@Size(max = 1)
    @Column(name = "EMP_FORMA_PAGO")
    private String empFormaPago;
    //@Size(max = 10)
    @Column(name = "EMP_CODIGO_ANTERIOR")
    private String empCodigoAnterior;
    @Column(name = "EMP_CODPLZ")
    private Integer empCodplz;
    //@Size(max = 1)
    @Column(name = "EMP_EXP_SALARIO")
    private String empExpSalario;
    @Column(name = "EMP_SALARIO")
    private BigDecimal empSalario;
    @Column(name = "EMP_CONTRATO_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empContratoInicio;
    @Column(name = "EMP_CONTRATO_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empContratoFin;
    @Column(name = "EMP_ULTIMO_SALARIO")
    private BigDecimal empUltimoSalario;
    @Column(name = "EMP_FECHA_ULTIMO_INCREMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaUltimoIncremento;
    @Column(name = "EMP_CODDEP_NAC")
    private Short empCoddepNac;
    @Column(name = "EMP_EDAD")
    private Short empEdad;
    @Column(name = "EMP_FECHA_INGRESO_CORP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaIngresoCorp;
    @Column(name = "EMP_FECHA_ULTIMA_LIQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaUltimaLiq;
    @Column(name = "EMP_UBI_PLAZA")
    private Integer empUbiPlaza;
    @Column(name = "EMP_FECHA_CAL_VAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaCalVac;
    @Column(name = "EMP_FECHA_ULT_ACT_DATOS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaUltActDatos;
    @Column(name = "EMP_FECHA_ULT_INVEST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaUltInvest;
    //@Size(max = 15)
    @Column(name = "EMP_NUMERO_CASO")
    private String empNumeroCaso;
    @Column(name = "EMP_BONONOAFECTO")
    private BigDecimal empBononoafecto;
    @Column(name = "EMP_CAT_SEGUROMED")
    private Integer empCatSeguromed;
    @Column(name = "EMP_TOTALDEV")
    private BigDecimal empTotaldev;
    @Column(name = "EMP_FECHA_ULT_LIQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaUltLiq;
    @Column(name = "EMP_ULTIMO_BONONOAFECTO")
    private BigDecimal empUltimoBononoafecto;
    @Column(name = "EMP_ULTIMA_BONIFICACION")
    private BigDecimal empUltimaBonificacion;
    //@Size(max = 100)
    @Column(name = "EMP_EMAIL")
    private String empEmail;
    //@Size(max = 100)
    @Column(name = "EMP_EMAIL_INTERNO")
    private String empEmailInterno;
    //@Size(max = 100)
    @Column(name = "EMP_FOTO")
    private String empFoto;
    @Column(name = "EMP_CODCEM")
    private Integer empCodcem;
    //@Size(max = 50)
    @Column(name = "EMP_COLONIA")
    private String empColonia;
    //@Size(max = 50)
    @Column(name = "EMP_AVENIDA")
    private String empAvenida;
    @Column(name = "EMP_NUM_REQUISICION")
    private Integer empNumRequisicion;
    //@Size(max = 200)
    @Column(name = "EMP_JUSTIFICACION")
    private String empJustificacion;
    //@Size(max = 45)
    @Column(name = "EMP_CELULAR")
    private String empCelular;
    //@Size(max = 45)
    @Column(name = "EMP_BEEPER")
    private String empBeeper;
    @Column(name = "EMP_FECHA_PROGRA_JUBI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaPrograJubi;
    @Column(name = "EMP_FECHA_JUBILACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaJubilacion;
    @Column(name = "EMP_ANTIGUEDAD_CORP")
    private Short empAntiguedadCorp;
    @Column(name = "EMP_ANTIGUEDAD_EMPRESA")
    private Short empAntiguedadEmpresa;
    @Column(name = "EMP_SALARIO_DOLARES")
    private BigDecimal empSalarioDolares;
    //@Size(max = 20)
    @Column(name = "EMP_CUENTA_EN_DOLARES")
    private String empCuentaEnDolares;
    //@Size(max = 1)
    @Column(name = "EMP_TIPO_CUENTA_DOLARES")
    private String empTipoCuentaDolares;
    @Column(name = "EMP_CODICR_DOLARES")
    private Short empCodicrDolares;
    //@Size(max = 2)
    @Column(name = "EMP_ARCHIVO")
    private String empArchivo;
    @Column(name = "EMP_CODPLZ_TEMP")
    private Integer empCodplzTemp;
    @Column(name = "EMP_FECHAFIN_TEMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechafinTemp;
    //@Size(max = 10)
    @Column(name = "EMP_CASA")
    private String empCasa;
    //@Size(max = 50)
    @Column(name = "EMP_REFERENCIA")
    private String empReferencia;
    @Column(name = "EMP_CUENTA_CODDEP")
    private Short empCuentaCoddep;
    @Column(name = "EMP_CUENTA_CODMUN")
    private Short empCuentaCodmun;
    //@Size(max = 1)
    @Column(name = "EMP_PAGA_RENTA_PAT")
    private String empPagaRentaPat;
    //@Size(max = 1)
    @Column(name = "EMP_TIENE_ANTICIPO")
    private String empTieneAnticipo;
    //@Size(max = 10)
    @Column(name = "EMP_EMPRESA_ORIGEN")
    private String empEmpresaOrigen;
    //@Size(max = 150)
    @Column(name = "EMP_MOTIVO_RETIRO")
    private String empMotivoRetiro;
    //@Size(max = 150)
    @Column(name = "EMP_CAUSA_RETIRO")
    private String empCausaRetiro;
    //@Size(max = 150)
    @Column(name = "EMP_CARGO_RETIRO")
    private String empCargoRetiro;
    //@Size(max = 10)
    @Column(name = "EMP_CODIGO_BASIS")
    private String empCodigoBasis;
    @Column(name = "EMP_CODCMR")
    private Integer empCodcmr;
    @Column(name = "EMP_CODJOR2")
    private Short empCodjor2;
    //@Size(max = 129)
    @Column(name = "EMP_NOMBRE_APELLIDO")
    private String empNombreApellido;
    //@Size(max = 129)
    @Column(name = "EMP_APELLIDOS_NOMBRES")
    private String empApellidosNombres;
    //@Size(max = 128)
    @Column(name = "EMP_NOMBRES_APELLIDOS")
    private String empNombresApellidos;
    //@Size(max = 5)
    @Column(name = "EMP_CODIGO_REP")
    private String empCodigoRep;
    //@Size(max = 50)
    @Column(name = "EMP_PRUEBA")
    private String empPrueba;
    //@Size(max = 25)
    @Column(name = "EMP_CUENTA_CONTABLE")
    private String empCuentaContable;
    @Column(name = "emp_num_horas_x_mes")
    private Float empNumHorasXMes;
    @Column(name = "emp_indigena")
    private Character empIndigena;
    @Column(name = "emp_fecha_ultimo_incremento_Bonificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empfechaultimoincrementoBonificacion;
    @Column(name = "emp_fecha_ultimo_inc_boni_noafecta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaUltimoIncBoniNoafecta;
    //@Size(max = 20)
    @Column(name = "EMP_TERCER_NOM")
    private String empTercerNom;
    //@Size(max = 6)
    @Column(name = "EMP_CODIGO_M4")
    private String empCodigoM4;
    @Column(name = "EMP_CODPAI_ALTER")
    private Short empCodpaiAlter;
    @Column(name = "EMP_CODDEP_ALTER")
    private Short empCoddepAlter;
    @Column(name = "EMP_CODMUN_ALTER")
    private Short empCodmunAlter;
    //@Size(max = 50)
    @Column(name = "EMP_COLONIA_ALTER")
    private String empColoniaAlter;
    //@Size(max = 50)
    @Column(name = "EMP_AVENIDA_ALTER")
    private String empAvenidaAlter;
    //@Size(max = 150)
    @Column(name = "EMP_DIRECCION_ALTER")
    private String empDireccionAlter;
    //@Size(max = 10)
    @Column(name = "EMP_CODIGO_ANTERIOR2")
    private String empCodigoAnterior2;
    //@Size(max = 45)
    @Column(name = "emp_extension_milenium")
    private String empExtensionMilenium;
    @Column(name = "emp_gastos_representacion")
    private BigDecimal empGastosRepresentacion;
    @Column(name = "EMP_CODIGO_TMP")
    private Integer empCodigoTmp;
    @Column(name = "EMP_SALARIO_HORA_EXTRANJERO")
    private BigDecimal empSalarioHoraExtranjero;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 100)
    @Column(name = "emp_fec_vacuna")
    private String empFecVacuna;

    public PlaEmpEmpleado() {
    }

    public PlaEmpEmpleado(Integer empCodigo) {
        this.empCodigo = empCodigo;
    }

    public PlaEmpEmpleado(Integer empCodigo, int empCodcia, String empLetraIndice, String empFecVacuna) {
        this.empCodigo = empCodigo;
        this.empCodcia = empCodcia;
        this.empLetraIndice = empLetraIndice;
        this.empFecVacuna = empFecVacuna;
    }

    public int getEmpCodcia() {
        return empCodcia;
    }

    public void setEmpCodcia(int empCodcia) {
        this.empCodcia = empCodcia;
    }

    public Integer getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(Integer empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getEmpLetraIndice() {
        return empLetraIndice;
    }

    public void setEmpLetraIndice(String empLetraIndice) {
        this.empLetraIndice = empLetraIndice;
    }

    public String getEmpPrimerApe() {
        return empPrimerApe;
    }

    public void setEmpPrimerApe(String empPrimerApe) {
        this.empPrimerApe = empPrimerApe;
    }

    public String getEmpSegundoApe() {
        return empSegundoApe;
    }

    public void setEmpSegundoApe(String empSegundoApe) {
        this.empSegundoApe = empSegundoApe;
    }

    public String getEmpApellidoCas() {
        return empApellidoCas;
    }

    public void setEmpApellidoCas(String empApellidoCas) {
        this.empApellidoCas = empApellidoCas;
    }

    public String getEmpPrimerNom() {
        return empPrimerNom;
    }

    public void setEmpPrimerNom(String empPrimerNom) {
        this.empPrimerNom = empPrimerNom;
    }

    public String getEmpSegundoNom() {
        return empSegundoNom;
    }

    public void setEmpSegundoNom(String empSegundoNom) {
        this.empSegundoNom = empSegundoNom;
    }

    public Short getEmpCodtip() {
        return empCodtip;
    }

    public void setEmpCodtip(Short empCodtip) {
        this.empCodtip = empCodtip;
    }

    public String getEmpDireccion() {
        return empDireccion;
    }

    public void setEmpDireccion(String empDireccion) {
        this.empDireccion = empDireccion;
    }

    public Short getEmpCodpai() {
        return empCodpai;
    }

    public void setEmpCodpai(Short empCodpai) {
        this.empCodpai = empCodpai;
    }

    public Short getEmpCoddep() {
        return empCoddep;
    }

    public void setEmpCoddep(Short empCoddep) {
        this.empCoddep = empCoddep;
    }

    public Short getEmpCodmun() {
        return empCodmun;
    }

    public void setEmpCodmun(Short empCodmun) {
        this.empCodmun = empCodmun;
    }

    public String getEmpTelefono() {
        return empTelefono;
    }

    public void setEmpTelefono(String empTelefono) {
        this.empTelefono = empTelefono;
    }

    public Short getEmpLugarNac() {
        return empLugarNac;
    }

    public void setEmpLugarNac(Short empLugarNac) {
        this.empLugarNac = empLugarNac;
    }

    public Short getEmpNacionalidad() {
        return empNacionalidad;
    }

    public void setEmpNacionalidad(Short empNacionalidad) {
        this.empNacionalidad = empNacionalidad;
    }

    public Date getEmpFechaNac() {
        return empFechaNac;
    }

    public void setEmpFechaNac(Date empFechaNac) {
        this.empFechaNac = empFechaNac;
    }

    public String getEmpSexo() {
        return empSexo;
    }

    public void setEmpSexo(String empSexo) {
        this.empSexo = empSexo;
    }

    public String getEmpProfesion() {
        return empProfesion;
    }

    public void setEmpProfesion(String empProfesion) {
        this.empProfesion = empProfesion;
    }

    public String getEmpEstado() {
        return empEstado;
    }

    public void setEmpEstado(String empEstado) {
        this.empEstado = empEstado;
    }

    public String getEmpEstadoCivil() {
        return empEstadoCivil;
    }

    public void setEmpEstadoCivil(String empEstadoCivil) {
        this.empEstadoCivil = empEstadoCivil;
    }

    public Date getEmpFechaIngreso() {
        return empFechaIngreso;
    }

    public void setEmpFechaIngreso(Date empFechaIngreso) {
        this.empFechaIngreso = empFechaIngreso;
    }

    public Date getEmpFechaRetiro() {
        return empFechaRetiro;
    }

    public void setEmpFechaRetiro(Date empFechaRetiro) {
        this.empFechaRetiro = empFechaRetiro;
    }

    public Short getEmpCodmrt() {
        return empCodmrt;
    }

    public void setEmpCodmrt(Short empCodmrt) {
        this.empCodmrt = empCodmrt;
    }

    public BigDecimal getEmpSalPromedio() {
        return empSalPromedio;
    }

    public void setEmpSalPromedio(BigDecimal empSalPromedio) {
        this.empSalPromedio = empSalPromedio;
    }

    public String getEmpUsuarioCrea() {
        return empUsuarioCrea;
    }

    public void setEmpUsuarioCrea(String empUsuarioCrea) {
        this.empUsuarioCrea = empUsuarioCrea;
    }

    public Date getEmpFechaCrea() {
        return empFechaCrea;
    }

    public void setEmpFechaCrea(Date empFechaCrea) {
        this.empFechaCrea = empFechaCrea;
    }

    public String getEmpUsuarioMod() {
        return empUsuarioMod;
    }

    public void setEmpUsuarioMod(String empUsuarioMod) {
        this.empUsuarioMod = empUsuarioMod;
    }

    public Date getEmpFechaMod() {
        return empFechaMod;
    }

    public void setEmpFechaMod(Date empFechaMod) {
        this.empFechaMod = empFechaMod;
    }

    public Short getEmpCodjor() {
        return empCodjor;
    }

    public void setEmpCodjor(Short empCodjor) {
        this.empCodjor = empCodjor;
    }

    public Short getEmpCodtpl() {
        return empCodtpl;
    }

    public void setEmpCodtpl(Short empCodtpl) {
        this.empCodtpl = empCodtpl;
    }

    public String getEmpCalSalPromedio() {
        return empCalSalPromedio;
    }

    public void setEmpCalSalPromedio(String empCalSalPromedio) {
        this.empCalSalPromedio = empCalSalPromedio;
    }

    public Short getEmpCodmunNac() {
        return empCodmunNac;
    }

    public void setEmpCodmunNac(Short empCodmunNac) {
        this.empCodmunNac = empCodmunNac;
    }

    public String getEmpCodigoPostal() {
        return empCodigoPostal;
    }

    public void setEmpCodigoPostal(String empCodigoPostal) {
        this.empCodigoPostal = empCodigoPostal;
    }

    public Short getEmpCodicrBanco() {
        return empCodicrBanco;
    }

    public void setEmpCodicrBanco(Short empCodicrBanco) {
        this.empCodicrBanco = empCodicrBanco;
    }

    public BigDecimal getEmpBonificacion() {
        return empBonificacion;
    }

    public void setEmpBonificacion(BigDecimal empBonificacion) {
        this.empBonificacion = empBonificacion;
    }

    public String getEmpCuentaBanco() {
        return empCuentaBanco;
    }

    public void setEmpCuentaBanco(String empCuentaBanco) {
        this.empCuentaBanco = empCuentaBanco;
    }

    public BigDecimal getEmpViaticos() {
        return empViaticos;
    }

    public void setEmpViaticos(BigDecimal empViaticos) {
        this.empViaticos = empViaticos;
    }

    public BigDecimal getEmpSalarioHora() {
        return empSalarioHora;
    }

    public void setEmpSalarioHora(BigDecimal empSalarioHora) {
        this.empSalarioHora = empSalarioHora;
    }

    public Short getEmpTipoContrato() {
        return empTipoContrato;
    }

    public void setEmpTipoContrato(Short empTipoContrato) {
        this.empTipoContrato = empTipoContrato;
    }

    public String getEmpTipoCtaBanco() {
        return empTipoCtaBanco;
    }

    public void setEmpTipoCtaBanco(String empTipoCtaBanco) {
        this.empTipoCtaBanco = empTipoCtaBanco;
    }

    public String getEmpFormaPago() {
        return empFormaPago;
    }

    public void setEmpFormaPago(String empFormaPago) {
        this.empFormaPago = empFormaPago;
    }

    public String getEmpCodigoAnterior() {
        return empCodigoAnterior;
    }

    public void setEmpCodigoAnterior(String empCodigoAnterior) {
        this.empCodigoAnterior = empCodigoAnterior;
    }

    public Integer getEmpCodplz() {
        return empCodplz;
    }

    public void setEmpCodplz(Integer empCodplz) {
        this.empCodplz = empCodplz;
    }

    public String getEmpExpSalario() {
        return empExpSalario;
    }

    public void setEmpExpSalario(String empExpSalario) {
        this.empExpSalario = empExpSalario;
    }

    public BigDecimal getEmpSalario() {
        return empSalario;
    }

    public void setEmpSalario(BigDecimal empSalario) {
        this.empSalario = empSalario;
    }

    public Date getEmpContratoInicio() {
        return empContratoInicio;
    }

    public void setEmpContratoInicio(Date empContratoInicio) {
        this.empContratoInicio = empContratoInicio;
    }

    public Date getEmpContratoFin() {
        return empContratoFin;
    }

    public void setEmpContratoFin(Date empContratoFin) {
        this.empContratoFin = empContratoFin;
    }

    public BigDecimal getEmpUltimoSalario() {
        return empUltimoSalario;
    }

    public void setEmpUltimoSalario(BigDecimal empUltimoSalario) {
        this.empUltimoSalario = empUltimoSalario;
    }

    public Date getEmpFechaUltimoIncremento() {
        return empFechaUltimoIncremento;
    }

    public void setEmpFechaUltimoIncremento(Date empFechaUltimoIncremento) {
        this.empFechaUltimoIncremento = empFechaUltimoIncremento;
    }

    public Short getEmpCoddepNac() {
        return empCoddepNac;
    }

    public void setEmpCoddepNac(Short empCoddepNac) {
        this.empCoddepNac = empCoddepNac;
    }

    public Short getEmpEdad() {
        return empEdad;
    }

    public void setEmpEdad(Short empEdad) {
        this.empEdad = empEdad;
    }

    public Date getEmpFechaIngresoCorp() {
        return empFechaIngresoCorp;
    }

    public void setEmpFechaIngresoCorp(Date empFechaIngresoCorp) {
        this.empFechaIngresoCorp = empFechaIngresoCorp;
    }

    public Date getEmpFechaUltimaLiq() {
        return empFechaUltimaLiq;
    }

    public void setEmpFechaUltimaLiq(Date empFechaUltimaLiq) {
        this.empFechaUltimaLiq = empFechaUltimaLiq;
    }

    public Integer getEmpUbiPlaza() {
        return empUbiPlaza;
    }

    public void setEmpUbiPlaza(Integer empUbiPlaza) {
        this.empUbiPlaza = empUbiPlaza;
    }

    public Date getEmpFechaCalVac() {
        return empFechaCalVac;
    }

    public void setEmpFechaCalVac(Date empFechaCalVac) {
        this.empFechaCalVac = empFechaCalVac;
    }

    public Date getEmpFechaUltActDatos() {
        return empFechaUltActDatos;
    }

    public void setEmpFechaUltActDatos(Date empFechaUltActDatos) {
        this.empFechaUltActDatos = empFechaUltActDatos;
    }

    public Date getEmpFechaUltInvest() {
        return empFechaUltInvest;
    }

    public void setEmpFechaUltInvest(Date empFechaUltInvest) {
        this.empFechaUltInvest = empFechaUltInvest;
    }

    public String getEmpNumeroCaso() {
        return empNumeroCaso;
    }

    public void setEmpNumeroCaso(String empNumeroCaso) {
        this.empNumeroCaso = empNumeroCaso;
    }

    public BigDecimal getEmpBononoafecto() {
        return empBononoafecto;
    }

    public void setEmpBononoafecto(BigDecimal empBononoafecto) {
        this.empBononoafecto = empBononoafecto;
    }

    public Integer getEmpCatSeguromed() {
        return empCatSeguromed;
    }

    public void setEmpCatSeguromed(Integer empCatSeguromed) {
        this.empCatSeguromed = empCatSeguromed;
    }

    public BigDecimal getEmpTotaldev() {
        return empTotaldev;
    }

    public void setEmpTotaldev(BigDecimal empTotaldev) {
        this.empTotaldev = empTotaldev;
    }

    public Date getEmpFechaUltLiq() {
        return empFechaUltLiq;
    }

    public void setEmpFechaUltLiq(Date empFechaUltLiq) {
        this.empFechaUltLiq = empFechaUltLiq;
    }

    public BigDecimal getEmpUltimoBononoafecto() {
        return empUltimoBononoafecto;
    }

    public void setEmpUltimoBononoafecto(BigDecimal empUltimoBononoafecto) {
        this.empUltimoBononoafecto = empUltimoBononoafecto;
    }

    public BigDecimal getEmpUltimaBonificacion() {
        return empUltimaBonificacion;
    }

    public void setEmpUltimaBonificacion(BigDecimal empUltimaBonificacion) {
        this.empUltimaBonificacion = empUltimaBonificacion;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpEmailInterno() {
        return empEmailInterno;
    }

    public void setEmpEmailInterno(String empEmailInterno) {
        this.empEmailInterno = empEmailInterno;
    }

    public String getEmpFoto() {
        return empFoto;
    }

    public void setEmpFoto(String empFoto) {
        this.empFoto = empFoto;
    }

    public Integer getEmpCodcem() {
        return empCodcem;
    }

    public void setEmpCodcem(Integer empCodcem) {
        this.empCodcem = empCodcem;
    }

    public String getEmpColonia() {
        return empColonia;
    }

    public void setEmpColonia(String empColonia) {
        this.empColonia = empColonia;
    }

    public String getEmpAvenida() {
        return empAvenida;
    }

    public void setEmpAvenida(String empAvenida) {
        this.empAvenida = empAvenida;
    }

    public Integer getEmpNumRequisicion() {
        return empNumRequisicion;
    }

    public void setEmpNumRequisicion(Integer empNumRequisicion) {
        this.empNumRequisicion = empNumRequisicion;
    }

    public String getEmpJustificacion() {
        return empJustificacion;
    }

    public void setEmpJustificacion(String empJustificacion) {
        this.empJustificacion = empJustificacion;
    }

    public String getEmpCelular() {
        return empCelular;
    }

    public void setEmpCelular(String empCelular) {
        this.empCelular = empCelular;
    }

    public String getEmpBeeper() {
        return empBeeper;
    }

    public void setEmpBeeper(String empBeeper) {
        this.empBeeper = empBeeper;
    }

    public Date getEmpFechaPrograJubi() {
        return empFechaPrograJubi;
    }

    public void setEmpFechaPrograJubi(Date empFechaPrograJubi) {
        this.empFechaPrograJubi = empFechaPrograJubi;
    }

    public Date getEmpFechaJubilacion() {
        return empFechaJubilacion;
    }

    public void setEmpFechaJubilacion(Date empFechaJubilacion) {
        this.empFechaJubilacion = empFechaJubilacion;
    }

    public Short getEmpAntiguedadCorp() {
        return empAntiguedadCorp;
    }

    public void setEmpAntiguedadCorp(Short empAntiguedadCorp) {
        this.empAntiguedadCorp = empAntiguedadCorp;
    }

    public Short getEmpAntiguedadEmpresa() {
        return empAntiguedadEmpresa;
    }

    public void setEmpAntiguedadEmpresa(Short empAntiguedadEmpresa) {
        this.empAntiguedadEmpresa = empAntiguedadEmpresa;
    }

    public BigDecimal getEmpSalarioDolares() {
        return empSalarioDolares;
    }

    public void setEmpSalarioDolares(BigDecimal empSalarioDolares) {
        this.empSalarioDolares = empSalarioDolares;
    }

    public String getEmpCuentaEnDolares() {
        return empCuentaEnDolares;
    }

    public void setEmpCuentaEnDolares(String empCuentaEnDolares) {
        this.empCuentaEnDolares = empCuentaEnDolares;
    }

    public String getEmpTipoCuentaDolares() {
        return empTipoCuentaDolares;
    }

    public void setEmpTipoCuentaDolares(String empTipoCuentaDolares) {
        this.empTipoCuentaDolares = empTipoCuentaDolares;
    }

    public Short getEmpCodicrDolares() {
        return empCodicrDolares;
    }

    public void setEmpCodicrDolares(Short empCodicrDolares) {
        this.empCodicrDolares = empCodicrDolares;
    }

    public String getEmpArchivo() {
        return empArchivo;
    }

    public void setEmpArchivo(String empArchivo) {
        this.empArchivo = empArchivo;
    }

    public Integer getEmpCodplzTemp() {
        return empCodplzTemp;
    }

    public void setEmpCodplzTemp(Integer empCodplzTemp) {
        this.empCodplzTemp = empCodplzTemp;
    }

    public Date getEmpFechafinTemp() {
        return empFechafinTemp;
    }

    public void setEmpFechafinTemp(Date empFechafinTemp) {
        this.empFechafinTemp = empFechafinTemp;
    }

    public String getEmpCasa() {
        return empCasa;
    }

    public void setEmpCasa(String empCasa) {
        this.empCasa = empCasa;
    }

    public String getEmpReferencia() {
        return empReferencia;
    }

    public void setEmpReferencia(String empReferencia) {
        this.empReferencia = empReferencia;
    }

    public Short getEmpCuentaCoddep() {
        return empCuentaCoddep;
    }

    public void setEmpCuentaCoddep(Short empCuentaCoddep) {
        this.empCuentaCoddep = empCuentaCoddep;
    }

    public Short getEmpCuentaCodmun() {
        return empCuentaCodmun;
    }

    public void setEmpCuentaCodmun(Short empCuentaCodmun) {
        this.empCuentaCodmun = empCuentaCodmun;
    }

    public String getEmpPagaRentaPat() {
        return empPagaRentaPat;
    }

    public void setEmpPagaRentaPat(String empPagaRentaPat) {
        this.empPagaRentaPat = empPagaRentaPat;
    }

    public String getEmpTieneAnticipo() {
        return empTieneAnticipo;
    }

    public void setEmpTieneAnticipo(String empTieneAnticipo) {
        this.empTieneAnticipo = empTieneAnticipo;
    }

    public String getEmpEmpresaOrigen() {
        return empEmpresaOrigen;
    }

    public void setEmpEmpresaOrigen(String empEmpresaOrigen) {
        this.empEmpresaOrigen = empEmpresaOrigen;
    }

    public String getEmpMotivoRetiro() {
        return empMotivoRetiro;
    }

    public void setEmpMotivoRetiro(String empMotivoRetiro) {
        this.empMotivoRetiro = empMotivoRetiro;
    }

    public String getEmpCausaRetiro() {
        return empCausaRetiro;
    }

    public void setEmpCausaRetiro(String empCausaRetiro) {
        this.empCausaRetiro = empCausaRetiro;
    }

    public String getEmpCargoRetiro() {
        return empCargoRetiro;
    }

    public void setEmpCargoRetiro(String empCargoRetiro) {
        this.empCargoRetiro = empCargoRetiro;
    }

    public String getEmpCodigoBasis() {
        return empCodigoBasis;
    }

    public void setEmpCodigoBasis(String empCodigoBasis) {
        this.empCodigoBasis = empCodigoBasis;
    }

    public Integer getEmpCodcmr() {
        return empCodcmr;
    }

    public void setEmpCodcmr(Integer empCodcmr) {
        this.empCodcmr = empCodcmr;
    }

    public Short getEmpCodjor2() {
        return empCodjor2;
    }

    public void setEmpCodjor2(Short empCodjor2) {
        this.empCodjor2 = empCodjor2;
    }

    public String getEmpNombreApellido() {
        return empNombreApellido;
    }

    public void setEmpNombreApellido(String empNombreApellido) {
        this.empNombreApellido = empNombreApellido;
    }

    public String getEmpApellidosNombres() {
        return empApellidosNombres;
    }

    public void setEmpApellidosNombres(String empApellidosNombres) {
        this.empApellidosNombres = empApellidosNombres;
    }

    public String getEmpNombresApellidos() {
        return empNombresApellidos;
    }

    public void setEmpNombresApellidos(String empNombresApellidos) {
        this.empNombresApellidos = empNombresApellidos;
    }

    public String getEmpCodigoRep() {
        return empCodigoRep;
    }

    public void setEmpCodigoRep(String empCodigoRep) {
        this.empCodigoRep = empCodigoRep;
    }

    public String getEmpPrueba() {
        return empPrueba;
    }

    public void setEmpPrueba(String empPrueba) {
        this.empPrueba = empPrueba;
    }

    public String getEmpCuentaContable() {
        return empCuentaContable;
    }

    public void setEmpCuentaContable(String empCuentaContable) {
        this.empCuentaContable = empCuentaContable;
    }

    public Float getEmpNumHorasXMes() {
        return empNumHorasXMes;
    }

    public void setEmpNumHorasXMes(Float empNumHorasXMes) {
        this.empNumHorasXMes = empNumHorasXMes;
    }

    public Character getEmpIndigena() {
        return empIndigena;
    }

    public void setEmpIndigena(Character empIndigena) {
        this.empIndigena = empIndigena;
    }

    public Date getEmpfechaultimoincrementoBonificacion() {
        return empfechaultimoincrementoBonificacion;
    }

    public void setEmpfechaultimoincrementoBonificacion(Date empfechaultimoincrementoBonificacion) {
        this.empfechaultimoincrementoBonificacion = empfechaultimoincrementoBonificacion;
    }

    public Date getEmpFechaUltimoIncBoniNoafecta() {
        return empFechaUltimoIncBoniNoafecta;
    }

    public void setEmpFechaUltimoIncBoniNoafecta(Date empFechaUltimoIncBoniNoafecta) {
        this.empFechaUltimoIncBoniNoafecta = empFechaUltimoIncBoniNoafecta;
    }

    public String getEmpTercerNom() {
        return empTercerNom;
    }

    public void setEmpTercerNom(String empTercerNom) {
        this.empTercerNom = empTercerNom;
    }

    public String getEmpCodigoM4() {
        return empCodigoM4;
    }

    public void setEmpCodigoM4(String empCodigoM4) {
        this.empCodigoM4 = empCodigoM4;
    }

    public Short getEmpCodpaiAlter() {
        return empCodpaiAlter;
    }

    public void setEmpCodpaiAlter(Short empCodpaiAlter) {
        this.empCodpaiAlter = empCodpaiAlter;
    }

    public Short getEmpCoddepAlter() {
        return empCoddepAlter;
    }

    public void setEmpCoddepAlter(Short empCoddepAlter) {
        this.empCoddepAlter = empCoddepAlter;
    }

    public Short getEmpCodmunAlter() {
        return empCodmunAlter;
    }

    public void setEmpCodmunAlter(Short empCodmunAlter) {
        this.empCodmunAlter = empCodmunAlter;
    }

    public String getEmpColoniaAlter() {
        return empColoniaAlter;
    }

    public void setEmpColoniaAlter(String empColoniaAlter) {
        this.empColoniaAlter = empColoniaAlter;
    }

    public String getEmpAvenidaAlter() {
        return empAvenidaAlter;
    }

    public void setEmpAvenidaAlter(String empAvenidaAlter) {
        this.empAvenidaAlter = empAvenidaAlter;
    }

    public String getEmpDireccionAlter() {
        return empDireccionAlter;
    }

    public void setEmpDireccionAlter(String empDireccionAlter) {
        this.empDireccionAlter = empDireccionAlter;
    }

    public String getEmpCodigoAnterior2() {
        return empCodigoAnterior2;
    }

    public void setEmpCodigoAnterior2(String empCodigoAnterior2) {
        this.empCodigoAnterior2 = empCodigoAnterior2;
    }

    public String getEmpExtensionMilenium() {
        return empExtensionMilenium;
    }

    public void setEmpExtensionMilenium(String empExtensionMilenium) {
        this.empExtensionMilenium = empExtensionMilenium;
    }

    public BigDecimal getEmpGastosRepresentacion() {
        return empGastosRepresentacion;
    }

    public void setEmpGastosRepresentacion(BigDecimal empGastosRepresentacion) {
        this.empGastosRepresentacion = empGastosRepresentacion;
    }

    public Integer getEmpCodigoTmp() {
        return empCodigoTmp;
    }

    public void setEmpCodigoTmp(Integer empCodigoTmp) {
        this.empCodigoTmp = empCodigoTmp;
    }

    public BigDecimal getEmpSalarioHoraExtranjero() {
        return empSalarioHoraExtranjero;
    }

    public void setEmpSalarioHoraExtranjero(BigDecimal empSalarioHoraExtranjero) {
        this.empSalarioHoraExtranjero = empSalarioHoraExtranjero;
    }

    public String getEmpFecVacuna() {
        return empFecVacuna;
    }

    public void setEmpFecVacuna(String empFecVacuna) {
        this.empFecVacuna = empFecVacuna;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empCodigo != null ? empCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaEmpEmpleado)) {
            return false;
        }
        PlaEmpEmpleado other = (PlaEmpEmpleado) object;
        if ((this.empCodigo == null && other.empCodigo != null) || (this.empCodigo != null && !this.empCodigo.equals(other.empCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeroman.jerarq.entities.vhur.PlaEmpEmpleado[ empCodigo=" + empCodigo + " ]";
    }
    
}
