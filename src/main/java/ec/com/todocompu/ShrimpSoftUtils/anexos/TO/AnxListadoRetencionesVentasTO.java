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
 * @author Andres Guachisaca
 */
@Entity
public class AnxListadoRetencionesVentasTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ven_fecha")
    private String venFecha;

    @Column(name = "ven_identificacion")
    private String venIdentificacion;

    @Column(name = "ven_nombre")
    private String venNombre;

    @Column(name = "ven_comprobantetipo")
    private String venComprobanteTipo;

    @Column(name = "ven_comprobantenumero")
    private String venComprobanteNumero;

    @Column(name = "ven_comprobanteautorizacion")
    private String venAutorizacion;

    @Column(name = "ven_basenoobjetoiva")
    private BigDecimal venBaseNoObjetoIva;

    @Column(name = "ven_base0")
    private BigDecimal venBase0;

    @Column(name = "ven_baseimponible")
    private BigDecimal venBaseImponible;

    @Column(name = "ven_montoice")
    private BigDecimal venMontoIce;

    @Column(name = "ven_montoiva")
    private BigDecimal venMontoIva;

    @Column(name = "ven_valorretenidoiva")
    private BigDecimal venValorRetenidoIva;

    @Column(name = "ven_valorretenidorenta")
    private BigDecimal venValorRetenidoRenta;

    @Column(name = "ven_retencion_numero")
    private String venRetencion;

    @Column(name = "ven_retencion_autorizacion")
    private String venRetencionAutorizacion;

    @Column(name = "ven_retencion_fecha_emision")
    private String venRetencionFechaEmision;

    public AnxListadoRetencionesVentasTO() {
    }

    public AnxListadoRetencionesVentasTO(String venFecha, String venIdentificacion, String venNombre,
            String venComprobanteTipo, String venComprobanteNumero, String venAutorizacion,
            BigDecimal venBaseNoObjetoIva, BigDecimal venBase0, BigDecimal venBaseImponible, BigDecimal venMontoIce, BigDecimal venMontoIva,
            BigDecimal venValorRetenidoIva, BigDecimal venValorRetenidoRenta, String venRetencion,
            String venRetencionAutorizacion, String venRetencionFechaEmision, Integer id) {
        this.venFecha = venFecha;
        this.venIdentificacion = venIdentificacion;
        this.venNombre = venNombre;
        this.venComprobanteTipo = venComprobanteTipo;
        this.venComprobanteNumero = venComprobanteNumero;
        this.venBaseNoObjetoIva = venBaseNoObjetoIva;

        this.venAutorizacion = venAutorizacion;

        this.venBase0 = venBase0;
        this.venBaseImponible = venBaseImponible;
        this.venMontoIce = venMontoIce;
        this.venMontoIva = venMontoIva;
        this.venValorRetenidoIva = venValorRetenidoIva;
        this.venValorRetenidoRenta = venValorRetenidoRenta;
        this.venRetencion = venRetencion;
        this.venRetencionAutorizacion = venRetencionAutorizacion;
        this.venRetencionFechaEmision = venRetencionFechaEmision;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVenFecha() {
        return venFecha;
    }

    public void setVenFecha(String venFecha) {
        this.venFecha = venFecha;
    }

    public String getVenIdentificacion() {
        return venIdentificacion;
    }

    public void setVenIdentificacion(String venIdentificacion) {
        this.venIdentificacion = venIdentificacion;
    }

    public String getVenNombre() {
        return venNombre;
    }

    public void setVenNombre(String venNombre) {
        this.venNombre = venNombre;
    }

    public String getVenComprobanteTipo() {
        return venComprobanteTipo;
    }

    public void setVenComprobanteTipo(String venComprobanteTipo) {
        this.venComprobanteTipo = venComprobanteTipo;
    }

    public String getVenComprobanteNumero() {
        return venComprobanteNumero;
    }

    public void setVenComprobanteNumero(String venComprobanteNumero) {
        this.venComprobanteNumero = venComprobanteNumero;
    }

    public String getVenAutorizacion() {
        return venAutorizacion;
    }

    public void setVenAutorizacion(String venAutorizacion) {
        this.venAutorizacion = venAutorizacion;
    }

    public BigDecimal getVenBaseNoObjetoIva() {
        return venBaseNoObjetoIva;
    }

    public void setVenBaseNoObjetoIva(BigDecimal venBaseNoObjetoIva) {
        this.venBaseNoObjetoIva = venBaseNoObjetoIva;
    }

    public BigDecimal getVenBase0() {
        return venBase0;
    }

    public void setVenBase0(BigDecimal venBase0) {
        this.venBase0 = venBase0;
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

    public String getVenRetencion() {
        return venRetencion;
    }

    public void setVenRetencion(String venRetencion) {
        this.venRetencion = venRetencion;
    }

    public String getVenRetencionAutorizacion() {
        return venRetencionAutorizacion;
    }

    public void setVenRetencionAutorizacion(String venRetencionAutorizacion) {
        this.venRetencionAutorizacion = venRetencionAutorizacion;
    }

    public String getVenRetencionFechaEmision() {
        return venRetencionFechaEmision;
    }

    public void setVenRetencionFechaEmision(String venRetencionFechaEmision) {
        this.venRetencionFechaEmision = venRetencionFechaEmision;
    }

    public BigDecimal getVenMontoIce() {
        return venMontoIce;
    }

    public void setVenMontoIce(BigDecimal venMontoIce) {
        this.venMontoIce = venMontoIce;
    }

}
