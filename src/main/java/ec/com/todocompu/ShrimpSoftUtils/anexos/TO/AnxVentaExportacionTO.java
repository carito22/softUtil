/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.math.BigDecimal;

/**
 *
 * @author CarolValdiviezo
 */
public class AnxVentaExportacionTO {

    private Integer expSecuencial;
    private String expTipoRegimenFiscal;//ok
    private String expRegimenGeneral;//ok
    private String expParaisoFiscal;//ok
    private String expRegimenFiscalPreferente;//ok
    private String expPaisEfectuaExportacion;//ok
    private String expFechaExportacion;//ok
    private boolean expIngresoExteriorFueGravado;
    private BigDecimal expValorFobExterior;//ok
    private BigDecimal expValorFobLocal;
    private String expTipoExportacion;//ok
    private String expRefrendoDocumentoTransporte;//ok
    private String expRefrendoDistrito;//ok
    private String expRefrendoAnio;//ok
    private String expRefrendoRegimen;//ok
    private String expRefrendoCorrelativo;//ok
    private String expTipoIngresoExterior;//ok
    private BigDecimal expImpuestoPagadoExterior;//ok
    private String vtaEmpresa;
    private String vtaPeriodo;
    private String vtaMotivo;
    private String vtaNumero;
    private String expObservaciones;
    private String expNumeroFue;
    private BigDecimal expVerificador;
    private String expFactura;
    private String expLugar;
    private String expPuertoEmbarque;
    private String expPuertoDestino;
    private String expPaisDestino;
    private BigDecimal expFlete;
    private BigDecimal expSeguro;
    private BigDecimal expGastosAduaneros;
    private BigDecimal expTransporteOtros;

    public AnxVentaExportacionTO() {
    }

    public Integer getExpSecuencial() {
        return expSecuencial;
    }

    public void setExpSecuencial(Integer expSecuencial) {
        this.expSecuencial = expSecuencial;
    }

    public boolean isExpIngresoExteriorFueGravado() {
        return expIngresoExteriorFueGravado;
    }

    public void setExpIngresoExteriorFueGravado(boolean expIngresoExteriorFueGravado) {
        this.expIngresoExteriorFueGravado = expIngresoExteriorFueGravado;
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

    public String getExpObservaciones() {
        return expObservaciones;
    }

    public void setExpObservaciones(String expObservaciones) {
        this.expObservaciones = expObservaciones;
    }

    public String getExpNumeroFue() {
        return expNumeroFue;
    }

    public void setExpNumeroFue(String expNumeroFue) {
        this.expNumeroFue = expNumeroFue;
    }

    public BigDecimal getExpVerificador() {
        return expVerificador;
    }

    public void setExpVerificador(BigDecimal expVerificador) {
        this.expVerificador = expVerificador;
    }

    public String getExpFactura() {
        return expFactura;
    }

    public void setExpFactura(String expFactura) {
        this.expFactura = expFactura;
    }

    public String getExpLugar() {
        return expLugar;
    }

    public void setExpLugar(String expLugar) {
        this.expLugar = expLugar;
    }

    public String getExpPuertoEmbarque() {
        return expPuertoEmbarque;
    }

    public void setExpPuertoEmbarque(String expPuertoEmbarque) {
        this.expPuertoEmbarque = expPuertoEmbarque;
    }

    public String getExpPuertoDestino() {
        return expPuertoDestino;
    }

    public void setExpPuertoDestino(String expPuertoDestino) {
        this.expPuertoDestino = expPuertoDestino;
    }

    public String getExpPaisDestino() {
        return expPaisDestino;
    }

    public void setExpPaisDestino(String expPaisDestino) {
        this.expPaisDestino = expPaisDestino;
    }

    public BigDecimal getExpFlete() {
        return expFlete;
    }

    public void setExpFlete(BigDecimal expFlete) {
        this.expFlete = expFlete;
    }

    public BigDecimal getExpSeguro() {
        return expSeguro;
    }

    public void setExpSeguro(BigDecimal expSeguro) {
        this.expSeguro = expSeguro;
    }

    public BigDecimal getExpGastosAduaneros() {
        return expGastosAduaneros;
    }

    public void setExpGastosAduaneros(BigDecimal expGastosAduaneros) {
        this.expGastosAduaneros = expGastosAduaneros;
    }

    public BigDecimal getExpTransporteOtros() {
        return expTransporteOtros;
    }

    public void setExpTransporteOtros(BigDecimal expTransporteOtros) {
        this.expTransporteOtros = expTransporteOtros;
    }

}
