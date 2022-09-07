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
public class AnxTalonResumenVentaTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ven_comprobante")
    private String venComprobante;

    @Column(name = "ven_establecimiento") //////////// ven_establecimiento
    private String venEstablecimiento;

    @Column(name = "ven_punto_de_emision") ////////////// ven_punto_emision
    private String venPuntoEmision;
    
    @Column(name = "ven_cantidad_comprobantes") ////////////// ven_punto_emision
    private Integer venCantidadComprobantes;

    @Column(name = "ven_basenoobjetoiva")
    private java.math.BigDecimal venBaseNoObjetoIva;

    @Column(name = "ven_base0")
    private java.math.BigDecimal venBase0;

    @Column(name = "ven_baseimponible")
    private java.math.BigDecimal venBaseImponible;

    @Column(name = "ven_montoice")
    private java.math.BigDecimal venMontoIce;

    @Column(name = "ven_montoiva")
    private java.math.BigDecimal venMotoIva;

    @Column(name = "ven_valorretenidoiva")
    private java.math.BigDecimal venValorRetenidoIva;

    @Column(name = "ven_valorretenidorenta")
    private java.math.BigDecimal venValorRetenidoRenta;

    public AnxTalonResumenVentaTO() {
    }

    public AnxTalonResumenVentaTO(String venComprobante, String venEstablecimiento, String venPuntoEmision,
            BigDecimal venBaseNoObjetoIva, BigDecimal venBase0, BigDecimal venBaseImponible, BigDecimal venMontoIce, BigDecimal venMotoIva,
            BigDecimal venValorRetenidoIva, BigDecimal venValorRetenidoRenta, Integer id) {
        this.venComprobante = venComprobante;
        this.venEstablecimiento = venEstablecimiento;
        this.venPuntoEmision = venPuntoEmision;
        this.venBaseNoObjetoIva = venBaseNoObjetoIva;
        this.venBase0 = venBase0;
        this.venBaseImponible = venBaseImponible;
        this.venMontoIce = venMontoIce;
        this.venMotoIva = venMotoIva;
        this.venValorRetenidoIva = venValorRetenidoIva;
        this.venValorRetenidoRenta = venValorRetenidoRenta;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public BigDecimal getVenBaseNoObjetoIva() {
        return venBaseNoObjetoIva;
    }

    public void setVenBaseNoObjetoIva(BigDecimal venBaseNoObjetoIva) {
        this.venBaseNoObjetoIva = venBaseNoObjetoIva;
    }

    public String getVenComprobante() {
        return venComprobante;
    }

    public void setVenComprobante(String venComprobante) {
        this.venComprobante = venComprobante;
    }

    public String getVenEstablecimiento() {
        return venEstablecimiento;
    }

    public void setVenEstablecimiento(String venEstablecimiento) {
        this.venEstablecimiento = venEstablecimiento;
    }

    public BigDecimal getVenMotoIva() {
        return venMotoIva;
    }

    public void setVenMotoIva(BigDecimal venMotoIva) {
        this.venMotoIva = venMotoIva;
    }

    public String getVenPuntoEmision() {
        return venPuntoEmision;
    }

    public void setVenPuntoEmision(String venPuntoEmision) {
        this.venPuntoEmision = venPuntoEmision;
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

    public BigDecimal getVenMontoIce() {
        return venMontoIce;
    }

    public void setVenMontoIce(BigDecimal venMontoIce) {
        this.venMontoIce = venMontoIce;
    }

    public Integer getVenCantidadComprobantes() {
        return venCantidadComprobantes;
    }

    public void setVenCantidadComprobantes(Integer venCantidadComprobantes) {
        this.venCantidadComprobantes = venCantidadComprobantes;
    }

}
