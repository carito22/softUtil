/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
public class AnxListaVentaExportacionTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "exp_cliente_id_tipo")
    private String expClienteIdTipo;
    @Column(name = "exp_cliente_id_numero")
    private String expClienteIdNumero;
    @Column(name = "exp_cliente_relacionado")
    private String expClienteRelacionado;
    @Column(name = "exp_cliente_tipo")
    private String expClienteTipo;
    @Column(name = "exp_cliente_razon_social")
    private String expClienteRazonSocial;
    @Column(name = "exp_tipo_regimen_fiscal")
    private String expTipoRegimenFiscal;
    @Column(name = "exp_regimen_general")
    private String expRegimenGeneral;
    @Column(name = "exp_paraiso_fiscal")
    private String expParaisoFiscal;
    @Column(name = "exp_regimen_fiscal_preferente")
    private String expRegimenFiscalPreferente;
    @Column(name = "exp_pais_efectua_exportacion")
    private String expPaisEfectuaExportacion;
    @Column(name = "exp_fecha_exportacion")
    private String expFechaExportacion;
    @Column(name = "exp_valor_fob_exterior")
    private BigDecimal expValorFobExterior;
    @Column(name = "exp_valor_fob_local")
    private BigDecimal expValorFobLocal;
    @Column(name = "exp_tipo_exportacion")
    private String expTipoExportacion;
    @Column(name = "exp_refrendo_documento_transporte")
    private String expRefrendoDocumentoTransporte;
    @Column(name = "exp_refrendo_distrito")
    private String expRefrendoDistrito;
    @Column(name = "exp_refrendo_anio")
    private String expRefrendoAnio;
    @Column(name = "exp_refrendo_regimen")
    private String expRefrendoRegimen;
    @Column(name = "exp_refrendo_correlativo")
    private String expRefrendoCorrelativo;
    @Column(name = "exp_tipo_ingreso_exterior")
    private String expTipoIngresoExterior;
    @Column(name = "exp_impuesto_pagado_exterior")
    private BigDecimal expImpuestoPagadoExterior;
    @Column(name = "exp_observaciones")
    private String expObservaciones;
    @Column(name = "vta_empresa")
    private String vtaEmpresa;
    @Column(name = "vta_periodo")
    private String vtaPeriodo;
    @Column(name = "vta_motivo")
    private String vtaMotivo;
    @Column(name = "vta_numero")
    private String vtaNumero;
    @Column(name = "vta_documento_numero")
    private String vtaDocumentoNumero;
    @Column(name = "vta_documento_autorizacion")
    private String vtaDocumentoAutorizacion;
    @Column(name = "vta_fecha_emision")
    private Date vtaFechaEmision;
    @Column(name = "vta_documento_tipo")
    private String vtaDocumentoTipo;

    public AnxListaVentaExportacionTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpClienteIdTipo() {
        return expClienteIdTipo;
    }

    public void setExpClienteIdTipo(String expClienteIdTipo) {
        this.expClienteIdTipo = expClienteIdTipo;
    }

    public String getExpClienteIdNumero() {
        return expClienteIdNumero;
    }

    public void setExpClienteIdNumero(String expClienteIdNumero) {
        this.expClienteIdNumero = expClienteIdNumero;
    }

    public String getExpClienteRelacionado() {
        return expClienteRelacionado;
    }

    public void setExpClienteRelacionado(String expClienteRelacionado) {
        this.expClienteRelacionado = expClienteRelacionado;
    }

    public String getExpClienteTipo() {
        return expClienteTipo;
    }

    public void setExpClienteTipo(String expClienteTipo) {
        this.expClienteTipo = expClienteTipo;
    }

    public String getExpClienteRazonSocial() {
        return expClienteRazonSocial;
    }

    public void setExpClienteRazonSocial(String expClienteRazonSocial) {
        this.expClienteRazonSocial = expClienteRazonSocial;
    }

    public String getExpTipoRegimenFiscal() {
        return expTipoRegimenFiscal;
    }

    public void setExpTipoRegimenFiscal(String expTipoRegimenFiscal) {
        this.expTipoRegimenFiscal = expTipoRegimenFiscal;
    }

    public String getExpRegimenGeneral() {
        return expRegimenGeneral;
    }

    public void setExpRegimenGeneral(String expRegimenGeneral) {
        this.expRegimenGeneral = expRegimenGeneral;
    }

    public String getExpParaisoFiscal() {
        return expParaisoFiscal;
    }

    public void setExpParaisoFiscal(String expParaisoFiscal) {
        this.expParaisoFiscal = expParaisoFiscal;
    }

    public String getExpRegimenFiscalPreferente() {
        return expRegimenFiscalPreferente;
    }

    public void setExpRegimenFiscalPreferente(String expRegimenFiscalPreferente) {
        this.expRegimenFiscalPreferente = expRegimenFiscalPreferente;
    }

    public String getExpPaisEfectuaExportacion() {
        return expPaisEfectuaExportacion;
    }

    public void setExpPaisEfectuaExportacion(String expPaisEfectuaExportacion) {
        this.expPaisEfectuaExportacion = expPaisEfectuaExportacion;
    }

    public String getExpFechaExportacion() {
        return expFechaExportacion;
    }

    public void setExpFechaExportacion(String expFechaExportacion) {
        this.expFechaExportacion = expFechaExportacion;
    }

    public BigDecimal getExpValorFobExterior() {
        return expValorFobExterior;
    }

    public void setExpValorFobExterior(BigDecimal expValorFobExterior) {
        this.expValorFobExterior = expValorFobExterior;
    }

    public BigDecimal getExpValorFobLocal() {
        return expValorFobLocal;
    }

    public void setExpValorFobLocal(BigDecimal expValorFobLocal) {
        this.expValorFobLocal = expValorFobLocal;
    }

    public String getExpTipoExportacion() {
        return expTipoExportacion;
    }

    public void setExpTipoExportacion(String expTipoExportacion) {
        this.expTipoExportacion = expTipoExportacion;
    }

    public String getExpRefrendoDocumentoTransporte() {
        return expRefrendoDocumentoTransporte;
    }

    public void setExpRefrendoDocumentoTransporte(String expRefrendoDocumentoTransporte) {
        this.expRefrendoDocumentoTransporte = expRefrendoDocumentoTransporte;
    }

    public String getExpRefrendoDistrito() {
        return expRefrendoDistrito;
    }

    public void setExpRefrendoDistrito(String expRefrendoDistrito) {
        this.expRefrendoDistrito = expRefrendoDistrito;
    }

    public String getExpRefrendoAnio() {
        return expRefrendoAnio;
    }

    public void setExpRefrendoAnio(String expRefrendoAnio) {
        this.expRefrendoAnio = expRefrendoAnio;
    }

    public String getExpRefrendoRegimen() {
        return expRefrendoRegimen;
    }

    public void setExpRefrendoRegimen(String expRefrendoRegimen) {
        this.expRefrendoRegimen = expRefrendoRegimen;
    }

    public String getExpRefrendoCorrelativo() {
        return expRefrendoCorrelativo;
    }

    public void setExpRefrendoCorrelativo(String expRefrendoCorrelativo) {
        this.expRefrendoCorrelativo = expRefrendoCorrelativo;
    }

    public String getExpTipoIngresoExterior() {
        return expTipoIngresoExterior;
    }

    public void setExpTipoIngresoExterior(String expTipoIngresoExterior) {
        this.expTipoIngresoExterior = expTipoIngresoExterior;
    }

    public BigDecimal getExpImpuestoPagadoExterior() {
        return expImpuestoPagadoExterior;
    }

    public void setExpImpuestoPagadoExterior(BigDecimal expImpuestoPagadoExterior) {
        this.expImpuestoPagadoExterior = expImpuestoPagadoExterior;
    }

    public String getExpObservaciones() {
        return expObservaciones;
    }

    public void setExpObservaciones(String expObservaciones) {
        this.expObservaciones = expObservaciones;
    }

    public String getVtaEmpresa() {
        return vtaEmpresa;
    }

    public void setVtaEmpresa(String vtaEmpresa) {
        this.vtaEmpresa = vtaEmpresa;
    }

    public String getVtaPeriodo() {
        return vtaPeriodo;
    }

    public void setVtaPeriodo(String vtaPeriodo) {
        this.vtaPeriodo = vtaPeriodo;
    }

    public String getVtaMotivo() {
        return vtaMotivo;
    }

    public void setVtaMotivo(String vtaMotivo) {
        this.vtaMotivo = vtaMotivo;
    }

    public String getVtaNumero() {
        return vtaNumero;
    }

    public void setVtaNumero(String vtaNumero) {
        this.vtaNumero = vtaNumero;
    }

    public String getVtaDocumentoNumero() {
        return vtaDocumentoNumero;
    }

    public void setVtaDocumentoNumero(String vtaDocumentoNumero) {
        this.vtaDocumentoNumero = vtaDocumentoNumero;
    }

    public String getVtaDocumentoAutorizacion() {
        return vtaDocumentoAutorizacion;
    }

    public void setVtaDocumentoAutorizacion(String vtaDocumentoAutorizacion) {
        this.vtaDocumentoAutorizacion = vtaDocumentoAutorizacion;
    }

    public Date getVtaFechaEmision() {
        return vtaFechaEmision;
    }

    public void setVtaFechaEmision(Date vtaFechaEmision) {
        this.vtaFechaEmision = vtaFechaEmision;
    }

    public String getVtaDocumentoTipo() {
        return vtaDocumentoTipo;
    }

    public void setVtaDocumentoTipo(String vtaDocumentoTipo) {
        this.vtaDocumentoTipo = vtaDocumentoTipo;
    }

}
