/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author CarolValdiviezo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class InvConsultaCompraTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "comp_status")
    private String compStatus;

    @Column(name = "comp_documento_numero")
    private String compDocumentoNumero;

    @Column(name = "comp_documento_tipo")
    private String compDocumentoTipo;

    @Column(name = "comp_fecha")
    private String compFecha;

    @Column(name = "comp_proveedor_codigo")
    private String provCodigo;

    @Column(name = "comp_proveedor_razon_social")
    private String provRazonSocial;

    @Column(name = "comp_base0")
    private BigDecimal compBase0;

    @Column(name = "comp_baseimponible")
    private BigDecimal compBaseImponible;

    @Column(name = "comp_montoiva")
    private BigDecimal compMontoIva;

    @Column(name = "comp_total")
    private BigDecimal compTotal;

    @Column(name = "comp_forma_pago")
    private String compFormaPago;

    @Column(name = "comp_observaciones")
    private String compObservaciones;

    @Column(name = "comp_contable")
    private String conContable;

    @Column(name = "comp_usuario_aprueba_pago")
    private String compUsuarioApruebaPago;

    @Column(name = "comp_datos_adjuntos")
    private boolean compDatosAdjuntos;

    @Column(name = "comp_motivo")
    private String compMotivo;

    @Column(name = "comp_periodo")
    private String compPeriodo;

    @Column(name = "comp_numero")
    private String compNumero;

    @Column(name = "pk_compras")
    private String pkCompras;

    public InvConsultaCompraTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompStatus() {
        return compStatus;
    }

    public void setCompStatus(String compStatus) {
        this.compStatus = compStatus;
    }

    public String getCompDocumentoNumero() {
        return compDocumentoNumero;
    }

    public void setCompDocumentoNumero(String compDocumentoNumero) {
        this.compDocumentoNumero = compDocumentoNumero;
    }

    public String getCompDocumentoTipo() {
        return compDocumentoTipo;
    }

    public void setCompDocumentoTipo(String compDocumentoTipo) {
        this.compDocumentoTipo = compDocumentoTipo;
    }

    public String getCompFecha() {
        return compFecha;
    }

    public void setCompFecha(String compFecha) {
        this.compFecha = compFecha;
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
    }

    public String getProvRazonSocial() {
        return provRazonSocial;
    }

    public void setProvRazonSocial(String provRazonSocial) {
        this.provRazonSocial = provRazonSocial;
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

    public BigDecimal getCompMontoIva() {
        return compMontoIva;
    }

    public void setCompMontoIva(BigDecimal compMontoIva) {
        this.compMontoIva = compMontoIva;
    }

    public BigDecimal getCompTotal() {
        return compTotal;
    }

    public void setCompTotal(BigDecimal compTotal) {
        this.compTotal = compTotal;
    }

    public String getCompFormaPago() {
        return compFormaPago;
    }

    public void setCompFormaPago(String compFormaPago) {
        this.compFormaPago = compFormaPago;
    }

    public String getCompObservaciones() {
        return compObservaciones;
    }

    public void setCompObservaciones(String compObservaciones) {
        this.compObservaciones = compObservaciones;
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

    public boolean isCompDatosAdjuntos() {
        return compDatosAdjuntos;
    }

    public void setCompDatosAdjuntos(boolean compDatosAdjuntos) {
        this.compDatosAdjuntos = compDatosAdjuntos;
    }

    public String getCompMotivo() {
        return compMotivo;
    }

    public void setCompMotivo(String compMotivo) {
        this.compMotivo = compMotivo;
    }

    public String getCompPeriodo() {
        return compPeriodo;
    }

    public void setCompPeriodo(String compPeriodo) {
        this.compPeriodo = compPeriodo;
    }

    public String getCompNumero() {
        return compNumero;
    }

    public void setCompNumero(String compNumero) {
        this.compNumero = compNumero;
    }
    
     public String getPkCompras() {
        return pkCompras;
    }

    public void setPkCompras(String pkCompras) {
        this.pkCompras = pkCompras;
    }

}
