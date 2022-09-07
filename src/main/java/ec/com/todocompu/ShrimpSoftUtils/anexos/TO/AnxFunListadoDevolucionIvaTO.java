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
public class AnxFunListadoDevolucionIvaTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "act_sustento_tributario")
    private String actSustentoTributario;

    @Column(name = "act_fecha")
    private String actFecha;

    @Column(name = "act_proveedor_nombre")
    private String actProveedorNombre;

    @Column(name = "act_proveedor_id_tipo")
    private Character actProveedorIdTipo;

    @Column(name = "act_proveedor_id_numero")
    private String actProveedorIdNumero;

    @Column(name = "act_documento_tipo")
    private String actDocumentoTipo;

    @Column(name = "act_documento_numero")
    private String actDocumentoNumero;

    @Column(name = "act_autorizacion")
    private String actAutorizacion;

    @Column(name = "act_autorizacion_electronica")
    private String actAutorizacionElectronica;

    @Column(name = "act_base0")
    private java.math.BigDecimal actBase0;

    @Column(name = "act_base_imponible")
    private java.math.BigDecimal actBaseImponible;

    @Column(name = "act_ice")
    private java.math.BigDecimal actIce;

    @Column(name = "act_iva")
    private java.math.BigDecimal actIva;

    @Column(name = "act_total")
    private java.math.BigDecimal actTotal;

    @Column(name = "act_clave_acceso_retencion")
    private String actClaveAccesoRetencion;

    @Column(name = "act_necesita_soporte")
    private String actNecesitaSoporte;

    @Column(name = "act_secuencia")
    private String actSecuencia;

    public AnxFunListadoDevolucionIvaTO() {
    }

    public AnxFunListadoDevolucionIvaTO(Integer id, String actSustentoTributario, String actFecha, String actProveedorNombre, Character actProveedorIdTipo, String actProveedorIdNumero, String actDocumentoTipo, String actDocumentoNumero, String actAutorizacion, String actAutorizacionElectronica, BigDecimal actBase0, BigDecimal actBaseImponible, BigDecimal actIce, BigDecimal actIva, BigDecimal actTotal, String actClaveAccesoRetencion, String actNecesitaSoporte, String actSecuencia) {
        this.actSustentoTributario = actSustentoTributario;
        this.actFecha = actFecha;
        this.actProveedorNombre = actProveedorNombre;
        this.actProveedorIdTipo = actProveedorIdTipo;
        this.actProveedorIdNumero = actProveedorIdNumero;
        this.actDocumentoTipo = actDocumentoTipo;
        this.actDocumentoNumero = actDocumentoNumero;
        this.actAutorizacion = actAutorizacion;
        this.actAutorizacionElectronica = actAutorizacionElectronica;
        this.actBase0 = actBase0;
        this.actBaseImponible = actBaseImponible;
        this.actIce = actIce;
        this.actIva = actIva;
        this.actTotal = actTotal;
        this.actClaveAccesoRetencion = actClaveAccesoRetencion;
        this.actNecesitaSoporte = actNecesitaSoporte;
        this.actSecuencia = actSecuencia;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActSustentoTributario() {
        return actSustentoTributario;
    }

    public void setActSustentoTributario(String actSustentoTributario) {
        this.actSustentoTributario = actSustentoTributario;
    }

    public String getActFecha() {
        return actFecha;
    }

    public void setActFecha(String actFecha) {
        this.actFecha = actFecha;
    }

    public String getActProveedorNombre() {
        return actProveedorNombre;
    }

    public void setActProveedorNombre(String actProveedorNombre) {
        this.actProveedorNombre = actProveedorNombre;
    }

    public Character getActProveedorIdTipo() {
        return actProveedorIdTipo;
    }

    public void setActProveedorIdTipo(Character actProveedorIdTipo) {
        this.actProveedorIdTipo = actProveedorIdTipo;
    }

    public String getActProveedorIdNumero() {
        return actProveedorIdNumero;
    }

    public void setActProveedorIdNumero(String actProveedorIdNumero) {
        this.actProveedorIdNumero = actProveedorIdNumero;
    }

    public String getActDocumentoTipo() {
        return actDocumentoTipo;
    }

    public void setActDocumentoTipo(String actDocumentoTipo) {
        this.actDocumentoTipo = actDocumentoTipo;
    }

    public String getActDocumentoNumero() {
        return actDocumentoNumero;
    }

    public void setActDocumentoNumero(String actDocumentoNumero) {
        this.actDocumentoNumero = actDocumentoNumero;
    }

    public String getActAutorizacion() {
        return actAutorizacion;
    }

    public void setActAutorizacion(String actAutorizacion) {
        this.actAutorizacion = actAutorizacion;
    }

    public String getActAutorizacionElectronica() {
        return actAutorizacionElectronica;
    }

    public void setActAutorizacionElectronica(String actAutorizacionElectronica) {
        this.actAutorizacionElectronica = actAutorizacionElectronica;
    }

    public BigDecimal getActBase0() {
        return actBase0;
    }

    public void setActBase0(BigDecimal actBase0) {
        this.actBase0 = actBase0;
    }

    public BigDecimal getActBaseImponible() {
        return actBaseImponible;
    }

    public void setActBaseImponible(BigDecimal actBaseImponible) {
        this.actBaseImponible = actBaseImponible;
    }

    public BigDecimal getActIce() {
        return actIce;
    }

    public void setActIce(BigDecimal actIce) {
        this.actIce = actIce;
    }

    public BigDecimal getActIva() {
        return actIva;
    }

    public void setActIva(BigDecimal actIva) {
        this.actIva = actIva;
    }

    public BigDecimal getActTotal() {
        return actTotal;
    }

    public void setActTotal(BigDecimal actTotal) {
        this.actTotal = actTotal;
    }

    public String getActClaveAccesoRetencion() {
        return actClaveAccesoRetencion;
    }

    public void setActClaveAccesoRetencion(String actClaveAccesoRetencion) {
        this.actClaveAccesoRetencion = actClaveAccesoRetencion;
    }

    public String getActNecesitaSoporte() {
        return actNecesitaSoporte;
    }

    public void setActNecesitaSoporte(String actNecesitaSoporte) {
        this.actNecesitaSoporte = actNecesitaSoporte;
    }

    public String getActSecuencia() {
        return actSecuencia;
    }

    public void setActSecuencia(String actSecuencia) {
        this.actSecuencia = actSecuencia;
    }

}
