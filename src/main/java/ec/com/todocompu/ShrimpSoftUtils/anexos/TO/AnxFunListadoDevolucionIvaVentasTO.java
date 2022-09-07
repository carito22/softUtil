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
public class AnxFunListadoDevolucionIvaVentasTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ven_identificacion")
    private String venIdentificacion;

    @Column(name = "ven_nombre")
    private String venNombre;

    @Column(name = "ven_comprobante_tipo")
    private String venComprobanteTipo;

    @Column(name = "ven_comprobante_serie")
    private String venComprobanteSerie;

    @Column(name = "ven_comprobante_secuencia")
    private String venComprobanteSecuencia;

    @Column(name = "ven_comprobante_autorizacion_fisica")
    private String venAutorizacionFisica;

    @Column(name = "ven_fecha")
    private String venFecha;

    @Column(name = "ven_comprobante_autorizacion_electronica")
    private String venAutorizacionElectronica;

    @Column(name = "ven_total")
    private BigDecimal venTotal;

    public AnxFunListadoDevolucionIvaVentasTO() {
    }

    public AnxFunListadoDevolucionIvaVentasTO(Integer id, String venIdentificacion, String venNombre, String venComprobanteTipo, String venComprobanteSerie, String venComprobanteSecuencia, String venAutorizacionFisica, String venFecha, String venAutorizacionElectronica, BigDecimal venTotal) {
        this.id = id;
        this.venIdentificacion = venIdentificacion;
        this.venNombre = venNombre;
        this.venComprobanteTipo = venComprobanteTipo;
        this.venComprobanteSerie = venComprobanteSerie;
        this.venComprobanteSecuencia = venComprobanteSecuencia;
        this.venAutorizacionFisica = venAutorizacionFisica;
        this.venFecha = venFecha;
        this.venAutorizacionElectronica = venAutorizacionElectronica;
        this.venTotal = venTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getVenComprobanteSerie() {
        return venComprobanteSerie;
    }

    public void setVenComprobanteSerie(String venComprobanteSerie) {
        this.venComprobanteSerie = venComprobanteSerie;
    }

    public String getVenComprobanteSecuencia() {
        return venComprobanteSecuencia;
    }

    public void setVenComprobanteSecuencia(String venComprobanteSecuencia) {
        this.venComprobanteSecuencia = venComprobanteSecuencia;
    }

    public String getVenAutorizacionFisica() {
        return venAutorizacionFisica;
    }

    public void setVenAutorizacionFisica(String venAutorizacionFisica) {
        this.venAutorizacionFisica = venAutorizacionFisica;
    }

    public String getVenAutorizacionElectronica() {
        return venAutorizacionElectronica;
    }

    public void setVenAutorizacionElectronica(String venAutorizacionElectronica) {
        this.venAutorizacionElectronica = venAutorizacionElectronica;
    }

    public BigDecimal getVenTotal() {
        return venTotal;
    }

    public void setVenTotal(BigDecimal venTotal) {
        this.venTotal = venTotal;
    }

    public String getVenFecha() {
        return venFecha;
    }

    public void setVenFecha(String venFecha) {
        this.venFecha = venFecha;
    }

}
