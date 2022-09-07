/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SisEmpresaTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "emp_codigo")
    private String empCodigo;
    @Column(name = "emp_ruc")
    private String empRuc;
    @Column(name = "emp_nombre")
    private String empNombre;
    @Column(name = "emp_razon_social")
    private String empRazonSocial;
    @Column(name = "emp_direccion")
    private String empDireccion;
    @Column(name = "emp_ciudad")
    private String empCiudad;
    @Column(name = "emp_pais")
    private String empPais;
    @Column(name = "emp_telefono")
    private String empTelefono;
    @Column(name = "emp_celular")
    private String empCelular;
    @Column(name = "emp_email")
    private String empEmail;
    @Column(name = "emp_clave")
    private String empClave;
    @Column(name = "par_resolucion_contribuyente_especial")
    private String emResolucionContribuyenteEspecial;
    @Column(name = "par_obligado_llevar_contabilidad")
    private Boolean emObligadoLlevarContabilidad;
    @Column(name = "par_gerente")
    private String empGerente;
    @Column(name = "par_gerente_tipo_id")
    private Character empTipoIdGerente;
    @Column(name = "par_gerente_id")
    private String empIdGerente;
    @Column(name = "par_contador")
    private String empContador;
    @Column(name = "par_contador_ruc")
    private String empRucContador;
    @Column(name = "emp_activa")
    private Boolean empActiva;
    @Column(name = "usr_codigo")
    private String usrInsertaUsuario;
    @Column(name = "usr_fecha_inserta_empresa")
    private Date usrFechaInsertaUsuario;
    @Column(name = "par_actividad")
    private String parActividad;
    @Column(name = "par_escoger_precio_por")
    private String parEscogerPrecioPor;
    @Column(name = "par_financiero")
    private String parFinanciero;
    @Column(name = "par_financiero_id")
    private String parFinancieroId;
    @Column(name = "par_columnas_estados_financieros")
    private short parColumnasEstadosFinancieros;
    @Column(name = "par_obligado_emitir_documentos_electronicos")
    private Boolean parObligadoEmitirDocumentosElectronicos;
    @Column(name = "par_obligado_registrar_liquidacion_pesca")
    private Boolean parObligadoRegistrarLiquidacionPesca;
    @Column(name = "par_codigo_dinardap")
    private String parCodigoDinardap;
    @Column(name = "par_obligado_aprobar_pagos")
    private boolean parObligadoAprobarPagos;
    @Column(name = "par_contribuyente_regimen_microempresa")
    private boolean parContribuyenteRegimenMicroempresa;
    @Column(name = "par_agente_retencion")
    private String parAgenteRetencion;
    @Column(name = "is_exportadora")
    private Boolean isExportador;

    public SisEmpresaTO() {
    }

    public SisEmpresaTO(String empCodigo, String empRuc, String empNombre, String empRazonSocial, String empDireccion, String empCiudad, String empPais, String empTelefono, String empCelular, String empEmail, String empClave, String emResolucionContribuyenteEspecial, Boolean emObligadoLlevarContabilidad, String empGerente, Character empTipoIdGerente, String empIdGerente, String empContador, String empRucContador, Boolean empActiva, String usrInsertaUsuario, Date usrFechaInsertaUsuario, String parActividad, String parEscogerPrecioPor, String parFinanciero, String parFinancieroId, short parColumnasEstadosFinancieros, String parCodigoDinardap) {
        this.empCodigo = empCodigo;
        this.empRuc = empRuc;
        this.empNombre = empNombre;
        this.empRazonSocial = empRazonSocial;
        this.empDireccion = empDireccion;
        this.empCiudad = empCiudad;
        this.empPais = empPais;
        this.empTelefono = empTelefono;
        this.empCelular = empCelular;
        this.empEmail = empEmail;
        this.empClave = empClave;
        this.emResolucionContribuyenteEspecial = emResolucionContribuyenteEspecial;
        this.emObligadoLlevarContabilidad = emObligadoLlevarContabilidad;
        this.empGerente = empGerente;
        this.empTipoIdGerente = empTipoIdGerente;
        this.empIdGerente = empIdGerente;
        this.empContador = empContador;
        this.empRucContador = empRucContador;
        this.empActiva = empActiva;
        this.usrInsertaUsuario = usrInsertaUsuario;
        this.usrFechaInsertaUsuario = usrFechaInsertaUsuario;
        this.parActividad = parActividad;
        this.parEscogerPrecioPor = parEscogerPrecioPor;
        this.parFinanciero = parFinanciero;
        this.parFinancieroId = parFinancieroId;
        this.parColumnasEstadosFinancieros = parColumnasEstadosFinancieros;
        this.parCodigoDinardap = parCodigoDinardap;
    }

    public String getParCodigoDinardap() {
        return parCodigoDinardap;
    }

    public void setParCodigoDinardap(String parCodigoDinardap) {
        this.parCodigoDinardap = parCodigoDinardap;
    }

    public short getParColumnasEstadosFinancieros() {
        return parColumnasEstadosFinancieros;
    }

    public void setParColumnasEstadosFinancieros(short parColumnasEstadosFinancieros) {
        this.parColumnasEstadosFinancieros = parColumnasEstadosFinancieros;
    }

    public String getParFinanciero() {
        return parFinanciero;
    }

    public void setParFinanciero(String parFinanciero) {
        this.parFinanciero = parFinanciero;
    }

    public String getParFinancieroId() {
        return parFinancieroId;
    }

    public void setParFinancieroId(String parFinancieroId) {
        this.parFinancieroId = parFinancieroId;
    }

    public Boolean getEmObligadoLlevarContabilidad() {
        return emObligadoLlevarContabilidad;
    }

    public void setEmObligadoLlevarContabilidad(Boolean emObligadoLlevarContabilidad) {
        this.emObligadoLlevarContabilidad = emObligadoLlevarContabilidad;
    }

    public String getEmResolucionContribuyenteEspecial() {
        return emResolucionContribuyenteEspecial;
    }

    public void setEmResolucionContribuyenteEspecial(String emResolucionContribuyenteEspecial) {
        this.emResolucionContribuyenteEspecial = emResolucionContribuyenteEspecial;
    }

    public Boolean getEmpActiva() {
        return empActiva;
    }

    public void setEmpActiva(Boolean empActiva) {
        this.empActiva = empActiva;
    }

    public String getEmpPais() {
        return empPais;
    }

    public void setEmpPais(String empPais) {
        this.empPais = empPais;
    }

    public String getEmpCiudad() {
        return empCiudad;
    }

    public void setEmpCiudad(String empCiudad) {
        this.empCiudad = empCiudad;
    }

    public String getEmpClave() {
        return empClave;
    }

    public void setEmpClave(String empClave) {
        this.empClave = empClave;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getEmpContador() {
        return empContador;
    }

    public void setEmpContador(String empContador) {
        this.empContador = empContador;
    }

    public String getEmpDireccion() {
        return empDireccion;
    }

    public void setEmpDireccion(String empDireccion) {
        this.empDireccion = empDireccion;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpCelular() {
        return empCelular;
    }

    public void setEmpCelular(String empCelular) {
        this.empCelular = empCelular;
    }

    public String getEmpGerente() {
        return empGerente;
    }

    public void setEmpGerente(String empGerente) {
        this.empGerente = empGerente;
    }

    public String getEmpIdGerente() {
        return empIdGerente;
    }

    public void setEmpIdGerente(String empIdGerente) {
        this.empIdGerente = empIdGerente;
    }

    public String getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    public String getEmpRazonSocial() {
        return empRazonSocial;
    }

    public void setEmpRazonSocial(String empRazonSocial) {
        this.empRazonSocial = empRazonSocial;
    }

    public String getEmpRuc() {
        return empRuc;
    }

    public void setEmpRuc(String empRuc) {
        this.empRuc = empRuc;
    }

    public String getEmpRucContador() {
        return empRucContador;
    }

    public void setEmpRucContador(String empRucContador) {
        this.empRucContador = empRucContador;
    }

    public String getEmpTelefono() {
        return empTelefono;
    }

    public void setEmpTelefono(String empTelefono) {
        this.empTelefono = empTelefono;
    }

    public Character getEmpTipoIdGerente() {
        return empTipoIdGerente;
    }

    public void setEmpTipoIdGerente(Character empTipoIdGerente) {
        this.empTipoIdGerente = empTipoIdGerente;
    }

    public String getParActividad() {
        return parActividad;
    }

    public void setParActividad(String parActividad) {
        this.parActividad = parActividad;
    }

    public String getParEscogerPrecioPor() {
        return parEscogerPrecioPor;
    }

    public void setParEscogerPrecioPor(String parEscogerPrecioPor) {
        this.parEscogerPrecioPor = parEscogerPrecioPor;
    }

    public Date getUsrFechaInsertaUsuario() {
        return usrFechaInsertaUsuario;
    }

    public void setUsrFechaInsertaUsuario(Date usrFechaInsertaUsuario) {
        this.usrFechaInsertaUsuario = usrFechaInsertaUsuario;
    }

    public String getUsrInsertaUsuario() {
        return usrInsertaUsuario;
    }

    public void setUsrInsertaUsuario(String usrInsertaUsuario) {
        this.usrInsertaUsuario = usrInsertaUsuario;
    }

    @Override
    public String toString() {
        return this.empNombre;
    }

    public Boolean getParObligadoEmitirDocumentosElectronicos() {
        return parObligadoEmitirDocumentosElectronicos;
    }

    public void setParObligadoEmitirDocumentosElectronicos(Boolean parObligadoEmitirDocumentosElectronicos) {
        this.parObligadoEmitirDocumentosElectronicos = parObligadoEmitirDocumentosElectronicos;
    }

    public Boolean getParObligadoRegistrarLiquidacionPesca() {
        return parObligadoRegistrarLiquidacionPesca;
    }

    public void setParObligadoRegistrarLiquidacionPesca(Boolean parObligadoRegistrarLiquidacionPesca) {
        this.parObligadoRegistrarLiquidacionPesca = parObligadoRegistrarLiquidacionPesca;
    }

    public boolean getParObligadoAprobarPagos() {
        return parObligadoAprobarPagos;
    }

    public void setParObligadoAprobarPagos(boolean parObligadoAprobarPagos) {
        this.parObligadoAprobarPagos = parObligadoAprobarPagos;
    }

    public boolean isParContribuyenteRegimenMicroempresa() {
        return parContribuyenteRegimenMicroempresa;
    }

    public void setParContribuyenteRegimenMicroempresa(boolean parContribuyenteRegimenMicroempresa) {
        this.parContribuyenteRegimenMicroempresa = parContribuyenteRegimenMicroempresa;
    }

    public String getParAgenteRetencion() {
        return parAgenteRetencion;
    }

    public void setParAgenteRetencion(String parAgenteRetencion) {
        this.parAgenteRetencion = parAgenteRetencion;
    }

    public Boolean getIsExportador() {
        return isExportador;
    }

    public void setIsExportador(Boolean isExportador) {
        this.isExportador = isExportador;
    }

}
