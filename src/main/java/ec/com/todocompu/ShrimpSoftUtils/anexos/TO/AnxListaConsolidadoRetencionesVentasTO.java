/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author misayo
 */
@Entity
public class AnxListaConsolidadoRetencionesVentasTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "rvc_identificacion")
    private String rvcIdentificacion;

    @Column(name = "rvc_transaccion")
    private String rvcTransaccion;

    @Column(name = "rvc_extranjero_tipo")
    private String rvcExtranjeroTipo;

    @Column(name = "rvc_cliente")
    private String rvcCliente;

    @Column(name = "rvc_relacionado")
    private String rvcRelacionado;

    @Column(name = "rvc_comprobantetipo")
    private String rvcComprobanteTipo;

    @Column(name = "rvc_numeroretenciones")
    private Integer rvcNumeroRetenciones;

    @Column(name = "rvc_basenoobjetoiva")
    private BigDecimal rvcBaseNoObjetoIva;

    @Column(name = "rvc_base0")
    private BigDecimal rvcBase0;

    @Column(name = "ven_baseimponible")
    private BigDecimal venBaseImponible;

    @Column(name = "ven_montoiva")
    private BigDecimal venMontoIva;

    @Column(name = "ven_montoice")
    private BigDecimal venMontoIce;

    @Column(name = "ven_valorretenidoiva")
    private BigDecimal venValorRetenidoIva;

    @Column(name = "ven_valorretenidorenta")
    private BigDecimal venValorRetenidoRenta;

    @Column(name = "ven_pagado_efectivo")
    private BigDecimal venPagadoEfectivo;

    @Column(name = "ven_pagado_dinero_electronico")
    private BigDecimal venPagadoDineroElectronico;

    @Column(name = "ven_pagado_tarjeta_credito")
    private BigDecimal venPagadoTarjetaCredito;

    @Column(name = "ven_pagado_otros")
    private BigDecimal venPagadoOtro;

    @Column(name = "ven_tipo_emision")
    private String venTipoEmision;

    @Column(name = "rvc_nombre_cliente")
    private String rvcNombreCliente;

    public AnxListaConsolidadoRetencionesVentasTO() {
    }

    public String getRvcExtranjeroTipo() {
        return rvcExtranjeroTipo;
    }

    public void setRvcExtranjeroTipo(String rvcExtranjeroTipo) {
        this.rvcExtranjeroTipo = rvcExtranjeroTipo;
    }

    public String getRvcCliente() {
        return rvcCliente;
    }

    public void setRvcCliente(String rvcCliente) {
        this.rvcCliente = rvcCliente;
    }

    public BigDecimal getVenPagadoEfectivo() {
        return venPagadoEfectivo;
    }

    public void setVenPagadoEfectivo(BigDecimal venPagadoEfectivo) {
        this.venPagadoEfectivo = venPagadoEfectivo;
    }

    public BigDecimal getVenPagadoDineroElectronico() {
        return venPagadoDineroElectronico;
    }

    public void setVenPagadoDineroElectronico(BigDecimal venPagadoDineroElectronico) {
        this.venPagadoDineroElectronico = venPagadoDineroElectronico;
    }

    public BigDecimal getVenPagadoTarjetaCredito() {
        return venPagadoTarjetaCredito;
    }

    public void setVenPagadoTarjetaCredito(BigDecimal venPagadoTarjetaCredito) {
        this.venPagadoTarjetaCredito = venPagadoTarjetaCredito;
    }

    public BigDecimal getVenPagadoOtro() {
        return venPagadoOtro;
    }

    public void setVenPagadoOtro(BigDecimal venPagadoOtro) {
        this.venPagadoOtro = venPagadoOtro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRvcRelacionado() {
        return rvcRelacionado;
    }

    public void setRvcRelacionado(String rvcRelacionado) {
        this.rvcRelacionado = rvcRelacionado;
    }

    public BigDecimal getVenMontoIce() {
        return venMontoIce;
    }

    public void setVenMontoIce(BigDecimal venMontoIce) {
        this.venMontoIce = venMontoIce;
    }

    public BigDecimal getRvcBase0() {
        return rvcBase0;
    }

    public void setRvcBase0(BigDecimal rvcBase0) {
        this.rvcBase0 = rvcBase0;
    }

    public BigDecimal getRvcBaseNoObjetoIva() {
        return rvcBaseNoObjetoIva;
    }

    public void setRvcBaseNoObjetoIva(BigDecimal rvcBaseNoObjetoIva) {
        this.rvcBaseNoObjetoIva = rvcBaseNoObjetoIva;
    }

    public String getRvcComprobanteTipo() {
        return rvcComprobanteTipo;
    }

    public void setRvcComprobanteTipo(String rvcComprobanteTipo) {
        this.rvcComprobanteTipo = rvcComprobanteTipo;
    }

    public String getRvcIdentificacion() {
        return rvcIdentificacion;
    }

    public void setRvcIdentificacion(String rvcIdentificacion) {
        this.rvcIdentificacion = rvcIdentificacion;
    }

    public Integer getRvcNumeroRetenciones() {
        return rvcNumeroRetenciones;
    }

    public void setRvcNumeroRetenciones(Integer rvcNumeroRetenciones) {
        this.rvcNumeroRetenciones = rvcNumeroRetenciones;
    }

    public String getRvcTransaccion() {
        return rvcTransaccion;
    }

    public void setRvcTransaccion(String rvcTransaccion) {
        this.rvcTransaccion = rvcTransaccion;
    }

    public BigDecimal getVenBaseImponible() {
        return venBaseImponible;
    }

    public void setVenBaseImponible(BigDecimal venBaseImponible) {
        this.venBaseImponible = venBaseImponible;
    }

    public BigDecimal getVenMontoIva() {
        return venMontoIva;
    }

    public void setVenMontoIva(BigDecimal venMontoIva) {
        this.venMontoIva = venMontoIva;
    }

    public BigDecimal getVenValorRetenidoIva() {
        return venValorRetenidoIva;
    }

    public void setVenValorRetenidoIva(BigDecimal venValorRetenidoIva) {
        this.venValorRetenidoIva = venValorRetenidoIva;
    }

    public BigDecimal getVenValorRetenidoRenta() {
        return venValorRetenidoRenta;
    }

    public void setVenValorRetenidoRenta(BigDecimal venValorRetenidoRenta) {
        this.venValorRetenidoRenta = venValorRetenidoRenta;
    }

    public String getVenTipoEmision() {
        return venTipoEmision;
    }

    public void setVenTipoEmision(String venTipoEmision) {
        this.venTipoEmision = venTipoEmision;
    }

    public String getRvcNombreCliente() {
        return rvcNombreCliente;
    }

    public void setRvcNombreCliente(String rvcNombreCliente) {
        this.rvcNombreCliente = rvcNombreCliente;
    }

}
