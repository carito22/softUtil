package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvVentasTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String vtaEmpresa;
    private String vtaPeriodo;
    private String vtaMotivo;
    private String vtaNumero;
    private String vtaDocumentoTipo;
    private String vtaDocumentoNumero;
    private String vtaFecha;
    private String vtaFechaVencimiento;
    private BigDecimal vtaIvaVigente;
    private String vtaObservaciones;
    private String vtaInformacionAdicional;
    private Boolean vtaPendiente = false;
    private Boolean vtaRevisado = false;
    private Boolean vtaAnulado = false;
    private String vtaFormaPago;
    private String cliEmpresa;
    private String cliCodigo;

    private String vtaListaDePrecios;
    private boolean vtaReembolso = false;
    private String fcBanco;
    private String fcCuenta;
    private String fcCheque;
    private String fcLote;
    private String fcTitular;
    private Integer fcSecuencial;

    private BigDecimal vtaRecargoBase0;
    private BigDecimal vtaRecargoBaseImponible;

    private BigDecimal vtaBase0;
    private BigDecimal vtaBaseImponible;
    private BigDecimal vtaBaseNoObjeto;
    private BigDecimal vtaBaseExenta;

    private BigDecimal vtaDescuentoBase0;
    private BigDecimal vtaDescuentoBaseImponible;
    private BigDecimal vtaDescuentoBaseNoObjeto;
    private BigDecimal vtaDescuentoBaseExenta;

    private BigDecimal vtaSubtotalBase0;
    private BigDecimal vtaSubtotalBaseImponible;
    private BigDecimal vtaSubtotalBaseNoObjeto;
    private BigDecimal vtaSubtotalBaseExenta;
    private BigDecimal vtaMontoIva;
    private BigDecimal vtaTotal;
    private BigDecimal vtaPagadoEfectivo;
    private BigDecimal vtaPagadoDineroElectronico;
    private BigDecimal vtaPagadoTarjetaCredito;
    private BigDecimal vtaPagadoOtro;

    private String bodEmpresa;
    private String bodCodigo;
    private String secEmpresa;
    private String secCodigo;
    private String ctaEmpresa;
    private String ctaCodigo;
    private String conEmpresa;
    private String conPeriodo;
    private String conTipo;
    private String conNumero;
    private String usrEmpresa;
    private String usrCodigo;
    private String usrFechaInserta;
    private String usrModifica;
    private String usrFechaModifica;
    private String usrComentario;

    private String profEmpresa;
    private String profPeriodo;
    private String profMotivo;
    private String profNumero;

    private Integer vtaRecurrente;
    private boolean vtaConsignacion = false;

    private String vtaVendedor;
    private String cliCodigoEstablecimiento;
    private BigDecimal vtaMontoIce;
    private String vtaCodigoTransaccional;

    private String fechaUltimaValidacionSri;
    private boolean vtaNegociable = false;

    public InvVentasTO() {
    }

    public InvVentasTO(String vtaEmpresa, String vtaPeriodo, String vtaMotivo, String vtaNumero, String vtaDocumentoTipo, String vtaDocumentoNumero,
            String vtaFecha, String vtaFechaVencimiento, BigDecimal vtaIvaVigente, String vtaObservaciones, String vtaInformacionAdicional, Boolean vtaPendiente,
            Boolean vtaRevisado, Boolean vtaAnulado, String vtaFormaPago, String cliEmpresa, String cliCodigo, String vtaListaDePrecios, boolean vtaReembolso,
            String fcBanco, String fcCuenta, String fcCheque, String fcLote, String fcTitular, Integer fcSecuencial, BigDecimal vtaRecargoBase0,
            BigDecimal vtaRecargoBaseImponible, BigDecimal vtaBase0, BigDecimal vtaBaseImponible, BigDecimal vtaBaseNoObjeto, BigDecimal vtaBaseExenta,
            BigDecimal vtaDescuentoBase0, BigDecimal vtaDescuentoBaseImponible, BigDecimal vtaDescuentoBaseNoObjeto, BigDecimal vtaDescuentoBaseExenta,
            BigDecimal vtaSubtotalBase0, BigDecimal vtaSubtotalBaseImponible, BigDecimal vtaSubtotalBaseNoObjeto, BigDecimal vtaSubtotalBaseExenta,
            BigDecimal vtaMontoIva, BigDecimal vtaTotal, BigDecimal vtaPagadoEfectivo, BigDecimal vtaPagadoDineroElectronico, BigDecimal vtaPagadoTarjetaCredito,
            BigDecimal vtaPagadoOtro, String bodEmpresa, String bodCodigo, String secEmpresa, String secCodigo, String ctaEmpresa, String ctaCodigo, String conEmpresa,
            String conPeriodo, String conTipo, String conNumero, String usrEmpresa, String usrCodigo, String usrFechaInserta, String usrModifica, String usrFechaModifica,
            String usrComentario, String profEmpresa, String profPeriodo, String profMotivo, String profNumero, String vtaVendedor) {
        this.vtaEmpresa = vtaEmpresa;
        this.vtaPeriodo = vtaPeriodo;
        this.vtaMotivo = vtaMotivo;
        this.vtaNumero = vtaNumero;
        this.vtaDocumentoTipo = vtaDocumentoTipo;
        this.vtaDocumentoNumero = vtaDocumentoNumero;
        this.vtaFecha = vtaFecha;
        this.vtaFechaVencimiento = vtaFechaVencimiento;
        this.vtaIvaVigente = vtaIvaVigente;
        this.vtaObservaciones = vtaObservaciones;
        this.vtaInformacionAdicional = vtaInformacionAdicional;
        this.vtaPendiente = vtaPendiente;
        this.vtaRevisado = vtaRevisado;
        this.vtaAnulado = vtaAnulado;
        this.vtaFormaPago = vtaFormaPago;
        this.cliEmpresa = cliEmpresa;
        this.cliCodigo = cliCodigo;
        this.vtaListaDePrecios = vtaListaDePrecios;
        this.vtaReembolso = vtaReembolso;
        this.fcBanco = fcBanco;
        this.fcCuenta = fcCuenta;
        this.fcCheque = fcCheque;
        this.fcLote = fcLote;
        this.fcTitular = fcTitular;
        this.fcSecuencial = fcSecuencial;
        this.vtaRecargoBase0 = vtaRecargoBase0;
        this.vtaRecargoBaseImponible = vtaRecargoBaseImponible;
        this.vtaBase0 = vtaBase0;
        this.vtaBaseImponible = vtaBaseImponible;
        this.vtaBaseNoObjeto = vtaBaseNoObjeto;
        this.vtaBaseExenta = vtaBaseExenta;
        this.vtaDescuentoBase0 = vtaDescuentoBase0;
        this.vtaDescuentoBaseImponible = vtaDescuentoBaseImponible;
        this.vtaDescuentoBaseNoObjeto = vtaDescuentoBaseNoObjeto;
        this.vtaDescuentoBaseExenta = vtaDescuentoBaseExenta;
        this.vtaSubtotalBase0 = vtaSubtotalBase0;
        this.vtaSubtotalBaseImponible = vtaSubtotalBaseImponible;
        this.vtaSubtotalBaseNoObjeto = vtaSubtotalBaseNoObjeto;
        this.vtaSubtotalBaseExenta = vtaSubtotalBaseExenta;
        this.vtaMontoIva = vtaMontoIva;
        this.vtaTotal = vtaTotal;
        this.vtaPagadoEfectivo = vtaPagadoEfectivo;
        this.vtaPagadoDineroElectronico = vtaPagadoDineroElectronico;
        this.vtaPagadoTarjetaCredito = vtaPagadoTarjetaCredito;
        this.vtaPagadoOtro = vtaPagadoOtro;
        this.bodEmpresa = bodEmpresa;
        this.bodCodigo = bodCodigo;
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.ctaEmpresa = ctaEmpresa;
        this.ctaCodigo = ctaCodigo;
        this.conEmpresa = conEmpresa;
        this.conPeriodo = conPeriodo;
        this.conTipo = conTipo;
        this.conNumero = conNumero;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.usrModifica = usrModifica;
        this.usrFechaModifica = usrFechaModifica;
        this.usrComentario = usrComentario;
        this.profEmpresa = profEmpresa;
        this.profPeriodo = profPeriodo;
        this.profMotivo = profMotivo;
        this.profNumero = profNumero;
        this.vtaVendedor = vtaVendedor;
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

    public String getVtaDocumentoTipo() {
        return vtaDocumentoTipo;
    }

    public void setVtaDocumentoTipo(String vtaDocumentoTipo) {
        this.vtaDocumentoTipo = vtaDocumentoTipo;
    }

    public String getVtaFecha() {
        return vtaFecha;
    }

    public void setVtaFecha(String vtaFecha) {
        this.vtaFecha = vtaFecha;
    }

    public String getVtaFechaVencimiento() {
        return vtaFechaVencimiento;
    }

    public void setVtaFechaVencimiento(String vtaFechaVencimiento) {
        this.vtaFechaVencimiento = vtaFechaVencimiento;
    }

    public BigDecimal getVtaIvaVigente() {
        return vtaIvaVigente;
    }

    public void setVtaIvaVigente(BigDecimal vtaIvaVigente) {
        this.vtaIvaVigente = vtaIvaVigente;
    }

    public String getVtaObservaciones() {
        return vtaObservaciones;
    }

    public void setVtaObservaciones(String vtaObservaciones) {
        this.vtaObservaciones = vtaObservaciones;
    }

    public String getVtaInformacionAdicional() {
        return vtaInformacionAdicional;
    }

    public void setVtaInformacionAdicional(String vtaInformacionAdicional) {
        this.vtaInformacionAdicional = vtaInformacionAdicional;
    }

    public Boolean getVtaPendiente() {
        return vtaPendiente;
    }

    public void setVtaPendiente(Boolean vtaPendiente) {
        this.vtaPendiente = vtaPendiente;
    }

    public Boolean getVtaRevisado() {
        return vtaRevisado;
    }

    public void setVtaRevisado(Boolean vtaRevisado) {
        this.vtaRevisado = vtaRevisado;
    }

    public Boolean getVtaAnulado() {
        return vtaAnulado;
    }

    public void setVtaAnulado(Boolean vtaAnulado) {
        this.vtaAnulado = vtaAnulado;
    }

    public String getVtaFormaPago() {
        return vtaFormaPago;
    }

    public void setVtaFormaPago(String vtaFormaPago) {
        this.vtaFormaPago = vtaFormaPago;
    }

    public String getCliEmpresa() {
        return cliEmpresa;
    }

    public void setCliEmpresa(String cliEmpresa) {
        this.cliEmpresa = cliEmpresa;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public BigDecimal getVtaRecargoBase0() {
        return vtaRecargoBase0;
    }

    public void setVtaRecargoBase0(BigDecimal vtaRecargoBase0) {
        this.vtaRecargoBase0 = vtaRecargoBase0;
    }

    public BigDecimal getVtaRecargoBaseImponible() {
        return vtaRecargoBaseImponible;
    }

    public void setVtaRecargoBaseImponible(BigDecimal vtaRecargoBaseImponible) {
        this.vtaRecargoBaseImponible = vtaRecargoBaseImponible;
    }

    public BigDecimal getVtaBase0() {
        return vtaBase0;
    }

    public void setVtaBase0(BigDecimal vtaBase0) {
        this.vtaBase0 = vtaBase0;
    }

    public BigDecimal getVtaBaseImponible() {
        return vtaBaseImponible;
    }

    public void setVtaBaseImponible(BigDecimal vtaBaseImponible) {
        this.vtaBaseImponible = vtaBaseImponible;
    }

    public BigDecimal getVtaBaseNoObjeto() {
        return vtaBaseNoObjeto;
    }

    public void setVtaBaseNoObjeto(BigDecimal vtaBaseNoObjeto) {
        this.vtaBaseNoObjeto = vtaBaseNoObjeto;
    }

    public BigDecimal getVtaBaseExenta() {
        return vtaBaseExenta;
    }

    public void setVtaBaseExenta(BigDecimal vtaBaseExenta) {
        this.vtaBaseExenta = vtaBaseExenta;
    }

    public BigDecimal getVtaDescuentoBase0() {
        return vtaDescuentoBase0;
    }

    public void setVtaDescuentoBase0(BigDecimal vtaDescuentoBase0) {
        this.vtaDescuentoBase0 = vtaDescuentoBase0;
    }

    public BigDecimal getVtaDescuentoBaseImponible() {
        return vtaDescuentoBaseImponible;
    }

    public void setVtaDescuentoBaseImponible(BigDecimal vtaDescuentoBaseImponible) {
        this.vtaDescuentoBaseImponible = vtaDescuentoBaseImponible;
    }

    public BigDecimal getVtaDescuentoBaseNoObjeto() {
        return vtaDescuentoBaseNoObjeto;
    }

    public void setVtaDescuentoBaseNoObjeto(BigDecimal vtaDescuentoBaseNoObjeto) {
        this.vtaDescuentoBaseNoObjeto = vtaDescuentoBaseNoObjeto;
    }

    public BigDecimal getVtaDescuentoBaseExenta() {
        return vtaDescuentoBaseExenta;
    }

    public void setVtaDescuentoBaseExenta(BigDecimal vtaDescuentoBaseExenta) {
        this.vtaDescuentoBaseExenta = vtaDescuentoBaseExenta;
    }

    public BigDecimal getVtaSubtotalBase0() {
        return vtaSubtotalBase0;
    }

    public void setVtaSubtotalBase0(BigDecimal vtaSubtotalBase0) {
        this.vtaSubtotalBase0 = vtaSubtotalBase0;
    }

    public BigDecimal getVtaSubtotalBaseImponible() {
        return vtaSubtotalBaseImponible;
    }

    public void setVtaSubtotalBaseImponible(BigDecimal vtaSubtotalBaseImponible) {
        this.vtaSubtotalBaseImponible = vtaSubtotalBaseImponible;
    }

    public BigDecimal getVtaSubtotalBaseNoObjeto() {
        return vtaSubtotalBaseNoObjeto;
    }

    public void setVtaSubtotalBaseNoObjeto(BigDecimal vtaSubtotalBaseNoObjeto) {
        this.vtaSubtotalBaseNoObjeto = vtaSubtotalBaseNoObjeto;
    }

    public BigDecimal getVtaSubtotalBaseExenta() {
        return vtaSubtotalBaseExenta;
    }

    public void setVtaSubtotalBaseExenta(BigDecimal vtaSubtotalBaseExenta) {
        this.vtaSubtotalBaseExenta = vtaSubtotalBaseExenta;
    }

    public BigDecimal getVtaMontoIva() {
        return vtaMontoIva;
    }

    public void setVtaMontoIva(BigDecimal vtaMontoIva) {
        this.vtaMontoIva = vtaMontoIva;
    }

    public BigDecimal getVtaTotal() {
        return vtaTotal;
    }

    public void setVtaTotal(BigDecimal vtaTotal) {
        this.vtaTotal = vtaTotal;
    }

    public BigDecimal getVtaPagadoEfectivo() {
        return vtaPagadoEfectivo;
    }

    public void setVtaPagadoEfectivo(BigDecimal vtaPagadoEfectivo) {
        this.vtaPagadoEfectivo = vtaPagadoEfectivo;
    }

    public BigDecimal getVtaPagadoDineroElectronico() {
        return vtaPagadoDineroElectronico;
    }

    public void setVtaPagadoDineroElectronico(BigDecimal vtaPagadoDineroElectronico) {
        this.vtaPagadoDineroElectronico = vtaPagadoDineroElectronico;
    }

    public BigDecimal getVtaPagadoTarjetaCredito() {
        return vtaPagadoTarjetaCredito;
    }

    public void setVtaPagadoTarjetaCredito(BigDecimal vtaPagadoTarjetaCredito) {
        this.vtaPagadoTarjetaCredito = vtaPagadoTarjetaCredito;
    }

    public BigDecimal getVtaPagadoOtro() {
        return vtaPagadoOtro;
    }

    public void setVtaPagadoOtro(BigDecimal vtaPagadoOtro) {
        this.vtaPagadoOtro = vtaPagadoOtro;
    }

    public String getBodEmpresa() {
        return bodEmpresa;
    }

    public void setBodEmpresa(String bodEmpresa) {
        this.bodEmpresa = bodEmpresa;
    }

    public String getBodCodigo() {
        return bodCodigo;
    }

    public void setBodCodigo(String bodCodigo) {
        this.bodCodigo = bodCodigo;
    }

    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getCtaEmpresa() {
        return ctaEmpresa;
    }

    public void setCtaEmpresa(String ctaEmpresa) {
        this.ctaEmpresa = ctaEmpresa;
    }

    public String getCtaCodigo() {
        return ctaCodigo;
    }

    public void setCtaCodigo(String ctaCodigo) {
        this.ctaCodigo = ctaCodigo;
    }

    public String getConEmpresa() {
        return conEmpresa;
    }

    public void setConEmpresa(String conEmpresa) {
        this.conEmpresa = conEmpresa;
    }

    public String getConPeriodo() {
        return conPeriodo;
    }

    public void setConPeriodo(String conPeriodo) {
        this.conPeriodo = conPeriodo;
    }

    public String getConTipo() {
        return conTipo;
    }

    public void setConTipo(String conTipo) {
        this.conTipo = conTipo;
    }

    public String getConNumero() {
        return conNumero;
    }

    public void setConNumero(String conNumero) {
        this.conNumero = conNumero;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getUsrModifica() {
        return usrModifica;
    }

    public void setUsrModifica(String usrModifica) {
        this.usrModifica = usrModifica;
    }

    public String getUsrFechaModifica() {
        return usrFechaModifica;
    }

    public void setUsrFechaModifica(String usrFechaModifica) {
        this.usrFechaModifica = usrFechaModifica;
    }

    public String getUsrComentario() {
        return usrComentario;
    }

    public void setUsrComentario(String usrComentario) {
        this.usrComentario = usrComentario;
    }

    public String getVtaListaDePrecios() {
        return vtaListaDePrecios;
    }

    public void setVtaListaDePrecios(String vtaListaDePrecios) {
        this.vtaListaDePrecios = vtaListaDePrecios;
    }

    public boolean isVtaReembolso() {
        return vtaReembolso;
    }

    public void setVtaReembolso(boolean vtaReembolso) {
        this.vtaReembolso = vtaReembolso;
    }

    public String getFcBanco() {
        return fcBanco;
    }

    public void setFcBanco(String fcBanco) {
        this.fcBanco = fcBanco;
    }

    public String getFcCuenta() {
        return fcCuenta;
    }

    public void setFcCuenta(String fcCuenta) {
        this.fcCuenta = fcCuenta;
    }

    public String getFcCheque() {
        return fcCheque;
    }

    public void setFcCheque(String fcCheque) {
        this.fcCheque = fcCheque;
    }

    public String getFcLote() {
        return fcLote;
    }

    public void setFcLote(String fcLote) {
        this.fcLote = fcLote;
    }

    public String getFcTitular() {
        return fcTitular;
    }

    public void setFcTitular(String fcTitular) {
        this.fcTitular = fcTitular;
    }

    public Integer getFcSecuencial() {
        return fcSecuencial;
    }

    public void setFcSecuencial(Integer fcSecuencial) {
        this.fcSecuencial = fcSecuencial;
    }

    public String getProfEmpresa() {
        return profEmpresa;
    }

    public void setProfEmpresa(String profEmpresa) {
        this.profEmpresa = profEmpresa;
    }

    public String getProfPeriodo() {
        return profPeriodo;
    }

    public void setProfPeriodo(String profPeriodo) {
        this.profPeriodo = profPeriodo;
    }

    public String getProfMotivo() {
        return profMotivo;
    }

    public void setProfMotivo(String profMotivo) {
        this.profMotivo = profMotivo;
    }

    public String getProfNumero() {
        return profNumero;
    }

    public void setProfNumero(String profNumero) {
        this.profNumero = profNumero;
    }

    public String getVtaDocumentoNumero() {
        return vtaDocumentoNumero;
    }

    public void setVtaDocumentoNumero(String vtaDocumentoNumero) {
        this.vtaDocumentoNumero = vtaDocumentoNumero;
    }

    public Integer getVtaRecurrente() {
        return vtaRecurrente;
    }

    public void setVtaRecurrente(Integer vtaRecurrente) {
        this.vtaRecurrente = vtaRecurrente;
    }

    public String getVtaVendedor() {
        return vtaVendedor;
    }

    public void setVtaVendedor(String vtaVendedor) {
        this.vtaVendedor = vtaVendedor;
    }

    public boolean isVtaConsignacion() {
        return vtaConsignacion;
    }

    public void setVtaConsignacion(boolean vtaConsignacion) {
        this.vtaConsignacion = vtaConsignacion;
    }

    public String getCliCodigoEstablecimiento() {
        return cliCodigoEstablecimiento;
    }

    public void setCliCodigoEstablecimiento(String cliCodigoEstablecimiento) {
        this.cliCodigoEstablecimiento = cliCodigoEstablecimiento;
    }

    public BigDecimal getVtaMontoIce() {
        return vtaMontoIce;
    }

    public void setVtaMontoIce(BigDecimal vtaMontoIce) {
        this.vtaMontoIce = vtaMontoIce;
    }

    public String getVtaCodigoTransaccional() {
        return vtaCodigoTransaccional;
    }

    public void setVtaCodigoTransaccional(String vtaCodigoTransaccional) {
        this.vtaCodigoTransaccional = vtaCodigoTransaccional;
    }

    public String getFechaUltimaValidacionSri() {
        return fechaUltimaValidacionSri;
    }

    public void setFechaUltimaValidacionSri(String fechaUltimaValidacionSri) {
        this.fechaUltimaValidacionSri = fechaUltimaValidacionSri;
    }

    public boolean isVtaNegociable() {
        return vtaNegociable;
    }

    public void setVtaNegociable(boolean vtaNegociable) {
        this.vtaNegociable = vtaNegociable;
    }

    @Override
    public String toString() {
        return this.vtaEmpresa + " " + this.vtaPeriodo + " " + this.vtaMotivo + " " + this.vtaNumero + " "
                + this.vtaDocumentoTipo + " " + this.vtaDocumentoNumero + " "
                + this.vtaFecha + " " + this.vtaFechaVencimiento + " " + this.vtaIvaVigente + " "
                + this.vtaObservaciones + " " + this.vtaPendiente + " " + this.vtaRevisado + " " + this.vtaAnulado + " "
                + this.vtaFormaPago + " " + this.vtaBase0 + " " + this.vtaBaseImponible + " " + this.vtaDescuentoBase0
                + " " + this.vtaMontoIva + " " + this.vtaTotal + " " + this.cliEmpresa + " " + this.cliCodigo + " "
                + this.secEmpresa + " " + this.secCodigo + " " + this.conEmpresa + " " + this.conPeriodo + " "
                + this.conTipo + " " + this.conNumero + " " + this.usrEmpresa + " " + this.usrCodigo + " "
                + this.usrFechaInserta;
    }
}
