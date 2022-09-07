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
public class InvFunComprasTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "comp_numero_sistema")
    private String compNumeroSistema;

    @Column(name = "comp_fecha")
    private String compFecha;

    @Column(name = "comp_proveedor_ruc")
    private String compProveedorRuc;

    @Column(name = "comp_proveedor_nombre")
    private String compProveedorNombre;

    @Column(name = "comp_documento_tipo")
    private String compDocumentoTipo;

    @Column(name = "comp_documento_numero")
    private String compDocumentoNumero;

    @Column(name = "comp_documento_autorizacion")
    private String compDocumentoAutorizacion;

    @Column(name = "comp_base0")
    private java.math.BigDecimal compBase0;

    @Column(name = "comp_baseimponible")
    private java.math.BigDecimal compBaseImponible;

    @Column(name = "comp_ice")
    private java.math.BigDecimal compIce;

    @Column(name = "comp_monto_iva")
    private java.math.BigDecimal compMontoIva;

    @Column(name = "comp_total")
    private java.math.BigDecimal compTotal;

    @Column(name = "comp_forma_pago")
    private String compFormaPago;

    @Column(name = "comp_observaciones")
    private String compObservaciones;

    @Column(name = "comp_pendiente")
    private Boolean compPendiente;

    @Column(name = "comp_anulado")
    private Boolean compAnulado;

    @Column(name = "con_contable")
    private String conContable;

    @Column(name = "comp_usuario_aprueba_pago")
    private String compUsuarioApruebaPago;

    public InvFunComprasTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getCompAnulado() {
        return compAnulado;
    }

    public void setCompAnulado(Boolean compAnulado) {
        this.compAnulado = compAnulado;
    }

    public BigDecimal getCompBase0() {
        return compBase0;
    }

    public void setCompBase0(BigDecimal compBase0) {
        this.compBase0 = compBase0;
    }

    public BigDecimal getCompBaseImponible() {
        return compBaseImponible;
    }

    public void setCompBaseImponible(BigDecimal compBaseImponible) {
        this.compBaseImponible = compBaseImponible;
    }

    public BigDecimal getCompIce() {
        return compIce;
    }

    public void setCompIce(BigDecimal compIce) {
        this.compIce = compIce;
    }

    public String getCompDocumentoNumero() {
        return compDocumentoNumero;
    }

    public void setCompDocumentoNumero(String compDocumentoNumero) {
        this.compDocumentoNumero = compDocumentoNumero;
    }

    public String getCompFecha() {
        return compFecha;
    }

    public void setCompFecha(String compFecha) {
        this.compFecha = compFecha;
    }

    public String getCompFormaPago() {
        return compFormaPago;
    }

    public void setCompFormaPago(String compFormaPago) {
        this.compFormaPago = compFormaPago;
    }

    public BigDecimal getCompMontoIva() {
        return compMontoIva;
    }

    public void setCompMontoIva(BigDecimal compMontoIva) {
        this.compMontoIva = compMontoIva;
    }

    public String getCompNumeroSistema() {
        return compNumeroSistema;
    }

    public void setCompNumeroSistema(String compNumeroSistema) {
        this.compNumeroSistema = compNumeroSistema;
    }

    public String getCompObservaciones() {
        return compObservaciones;
    }

    public void setCompObservaciones(String compObservaciones) {
        this.compObservaciones = compObservaciones;
    }

    public Boolean getCompPendiente() {
        return compPendiente;
    }

    public void setCompPendiente(Boolean compPendiente) {
        this.compPendiente = compPendiente;
    }

    public String getCompProveedorRuc() {
        return compProveedorRuc;
    }

    public void setCompProveedorRuc(String compProveedorRuc) {
        this.compProveedorRuc = compProveedorRuc;
    }

    public String getCompProveedorNombre() {
        return compProveedorNombre;
    }

    public void setCompProveedorNombre(String compProveedorNombre) {
        this.compProveedorNombre = compProveedorNombre;
    }

    public String getCompDocumentoTipo() {
        return compDocumentoTipo;
    }

    public void setCompDocumentoTipo(String compDocumentoTipo) {
        this.compDocumentoTipo = compDocumentoTipo;
    }

    public String getCompDocumentoAutorizacion() {
        return compDocumentoAutorizacion;
    }

    public void setCompDocumentoAutorizacion(String compDocumentoAutorizacion) {
        this.compDocumentoAutorizacion = compDocumentoAutorizacion;
    }

    public BigDecimal getCompTotal() {
        return compTotal;
    }

    public void setCompTotal(BigDecimal compTotal) {
        this.compTotal = compTotal;
    }

    public String getConContable() {
        return conContable;
    }

    public void setConContable(String conContable) {
        this.conContable = conContable;
    }

    public String getCompUsuarioApruebaPago() {
        return compUsuarioApruebaPago;
    }

    public void setCompUsuarioApruebaPago(String compUsuarioApruebaPago) {
        this.compUsuarioApruebaPago = compUsuarioApruebaPago;
    }

}
