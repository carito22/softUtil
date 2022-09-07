/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvListaConsultaVentaTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "vta_status")
    private String vtaStatus;

    @Column(name = "vta_documento_tipo")
    private String vtaDocumentoTipo;

    @Column(name = "vta_documento_numero")
    private String vtaDocumentoNumero;

    @Column(name = "vta_fecha")
    private String vtaFecha;

    @Column(name = "vta_cliente_codigo")
    private String cliCodigo;

    @Column(name = "vta_cliente_id")
    private String cliId;

    @Column(name = "vta_cliente_nombre")
    private String cliNombre;

    @Column(name = "vta_subtotal_base0")
    private BigDecimal vtaBase0;

    @Column(name = "vta_subtotal_baseimponible")
    private BigDecimal vtaBaseImponible;

    @Column(name = "vta_montoiva")
    private BigDecimal vtaMontoIva;

    @Column(name = "vta_total")
    private BigDecimal vtaTotal;

    @Column(name = "vta_forma_pago")
    private String vtaFormaPago;

    @Column(name = "vta_observaciones")
    private String vtaObservaciones;

    @Column(name = "vta_numero")
    private String vtaNumero;

    @Column(name = "vta_contable")
    private String conNumero;

    @Column(name = "vta_datos_adjuntos")
    private boolean vtaDatosAdjuntos;

    public InvListaConsultaVentaTO() {
    }

    public InvListaConsultaVentaTO(String vtaStatus, String vtaDocumentoNumero, String vtaFecha, String cliCodigo,
            String cliNombre, BigDecimal vtaBase0, BigDecimal vtaBaseImponible, BigDecimal vtaMontoIva,
            BigDecimal vtaTotal, String vtaFormaPago, String vtaObservaciones, String vtaNumero, String conNumero,
            Integer id) {
        this.vtaStatus = vtaStatus;
        this.vtaDocumentoNumero = vtaDocumentoNumero;
        this.vtaFecha = vtaFecha;
        this.cliCodigo = cliCodigo;
        this.cliNombre = cliNombre;
        this.vtaBase0 = vtaBase0;
        this.vtaBaseImponible = vtaBaseImponible;
        this.vtaMontoIva = vtaMontoIva;
        this.vtaTotal = vtaTotal;
        this.vtaFormaPago = vtaFormaPago;
        this.vtaObservaciones = vtaObservaciones;
        this.vtaNumero = vtaNumero;
        this.conNumero = conNumero;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public String getConNumero() {
        return conNumero;
    }

    public void setConNumero(String conNumero) {
        this.conNumero = conNumero;
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

    public String getVtaDocumentoNumero() {
        return vtaDocumentoNumero;
    }

    public void setVtaDocumentoNumero(String vtaDocumentoNumero) {
        this.vtaDocumentoNumero = vtaDocumentoNumero;
    }

    public String getVtaFecha() {
        return vtaFecha;
    }

    public void setVtaFecha(String vtaFecha) {
        this.vtaFecha = vtaFecha;
    }

    public String getVtaFormaPago() {
        return vtaFormaPago;
    }

    public void setVtaFormaPago(String vtaFormaPago) {
        this.vtaFormaPago = vtaFormaPago;
    }

    public BigDecimal getVtaMontoIva() {
        return vtaMontoIva;
    }

    public void setVtaMontoIva(BigDecimal vtaMontoIva) {
        this.vtaMontoIva = vtaMontoIva;
    }

    public String getVtaNumero() {
        return vtaNumero;
    }

    public void setVtaNumero(String vtaNumero) {
        this.vtaNumero = vtaNumero;
    }

    public String getVtaObservaciones() {
        return vtaObservaciones;
    }

    public void setVtaObservaciones(String vtaObservaciones) {
        this.vtaObservaciones = vtaObservaciones;
    }

    public String getVtaStatus() {
        return vtaStatus;
    }

    public void setVtaStatus(String vtaStatus) {
        this.vtaStatus = vtaStatus;
    }

    public BigDecimal getVtaTotal() {
        return vtaTotal;
    }

    public void setVtaTotal(BigDecimal vtaTotal) {
        this.vtaTotal = vtaTotal;
    }

    public String getVtaDocumentoTipo() {
        return vtaDocumentoTipo;
    }

    public void setVtaDocumentoTipo(String vtaDocumentoTipo) {
        this.vtaDocumentoTipo = vtaDocumentoTipo;
    }

    public String getCliId() {
        return cliId;
    }

    public void setCliId(String cliId) {
        this.cliId = cliId;
    }

    public boolean isVtaDatosAdjuntos() {
        return vtaDatosAdjuntos;
    }

    public void setVtaDatosAdjuntos(boolean vtaDatosAdjuntos) {
        this.vtaDatosAdjuntos = vtaDatosAdjuntos;
    }

}
