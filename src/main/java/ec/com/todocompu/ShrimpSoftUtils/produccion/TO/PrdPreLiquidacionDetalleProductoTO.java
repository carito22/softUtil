/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Usuario1
 */
@Entity
public class PrdPreLiquidacionDetalleProductoTO implements Serializable {

    @Id
    private Integer id;
    @Column(name = "pl_numero_sistema")
    private String plNumeroSistema;

    @Column(name = "pl_fecha")
    private Date plFecha;

    @Column(name = "pl_cliente_id")
    private String plClienteId;

    @Column(name = "pl_cliente_razon_social")
    private String plClienteRazonSocial;

    @Column(name = "pl_lote")
    private String plLote;

    @Column(name = "det_producto_codigo")
    private String detProductoCodigo;

    @Column(name = "det_producto_nombre")
    private String detProductoNombre;

    @Column(name = "det_producto_clase")
    private String detProductoClase;

    @Column(name = "det_producto_tipo")
    private String detProductoTipo;

    @Column(name = "det_libras")
    private BigDecimal detLibras;

    @Column(name = "det_precio")
    private BigDecimal detPrecio;

    @Column(name = "pis_sector")
    private String pisSector;

    @Column(name = "pis_numero")
    private String pisNumero;

    @Column(name = "pl_talla_codigo")
    private String plTallaCodigo;

    @Column(name = "pl_talla_detalle")
    private String plTallaDetalle;

    @Column(name = "pl_tipo_codigo")
    private String plTipoCodigo;

    @Column(name = "pl_tipo_detalle")
    private String plTipoDetalle;

    public PrdPreLiquidacionDetalleProductoTO() {
    }

    public PrdPreLiquidacionDetalleProductoTO(Integer id, String plNumeroSistema, Date plFecha, String plClienteId, String plClienteRazonSocial, String plLote,
            String detProductoCodigo, String detProductoNombre, String detProductoClase, String detProductoTipo, BigDecimal detLibras,
            BigDecimal detPrecio, String pisSector, String pisNumero, String plTallaCodigo, String plTallaDetalle, String plTipoCodigo,
            String plTipoDetalle) {
        this.id = id;
        this.plNumeroSistema = plNumeroSistema;
        this.plFecha = plFecha;
        this.plClienteId = plClienteId;
        this.plClienteRazonSocial = plClienteRazonSocial;
        this.plLote = plLote;
        this.detProductoCodigo = detProductoCodigo;
        this.detProductoNombre = detProductoNombre;
        this.detProductoClase = detProductoClase;
        this.detProductoTipo = detProductoTipo;
        this.detLibras = detLibras;
        this.detPrecio = detPrecio;
        this.pisSector = pisSector;
        this.pisNumero = pisNumero;
        this.plTallaCodigo = plTallaCodigo;
        this.plTallaDetalle = plTallaDetalle;
        this.plTipoCodigo = plTipoCodigo;
        this.plTipoDetalle = plTipoDetalle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlNumeroSistema() {
        return plNumeroSistema;
    }

    public void setPlNumeroSistema(String plNumeroSistema) {
        this.plNumeroSistema = plNumeroSistema;
    }

    public Date getPlFecha() {
        return plFecha;
    }

    public void setPlFecha(Date plFecha) {
        this.plFecha = plFecha;
    }

    public String getPlClienteId() {
        return plClienteId;
    }

    public void setPlClienteId(String plClienteId) {
        this.plClienteId = plClienteId;
    }

    public String getPlClienteRazonSocial() {
        return plClienteRazonSocial;
    }

    public void setPlClienteRazonSocial(String plClienteRazonSocial) {
        this.plClienteRazonSocial = plClienteRazonSocial;
    }

    public String getPlLote() {
        return plLote;
    }

    public void setPlLote(String plLote) {
        this.plLote = plLote;
    }

    public String getDetProductoCodigo() {
        return detProductoCodigo;
    }

    public void setDetProductoCodigo(String detProductoCodigo) {
        this.detProductoCodigo = detProductoCodigo;
    }

    public String getDetProductoNombre() {
        return detProductoNombre;
    }

    public void setDetProductoNombre(String detProductoNombre) {
        this.detProductoNombre = detProductoNombre;
    }

    public String getDetProductoClase() {
        return detProductoClase;
    }

    public void setDetProductoClase(String detProductoClase) {
        this.detProductoClase = detProductoClase;
    }

    public String getDetProductoTipo() {
        return detProductoTipo;
    }

    public void setDetProductoTipo(String detProductoTipo) {
        this.detProductoTipo = detProductoTipo;
    }

    public BigDecimal getDetLibras() {
        return detLibras;
    }

    public void setDetLibras(BigDecimal detLibras) {
        this.detLibras = detLibras;
    }

    public BigDecimal getDetPrecio() {
        return detPrecio;
    }

    public void setDetPrecio(BigDecimal detPrecio) {
        this.detPrecio = detPrecio;
    }

    public String getPisSector() {
        return pisSector;
    }

    public void setPisSector(String pisSector) {
        this.pisSector = pisSector;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    public String getPlTallaCodigo() {
        return plTallaCodigo;
    }

    public void setPlTallaCodigo(String plTallaCodigo) {
        this.plTallaCodigo = plTallaCodigo;
    }

    public String getPlTallaDetalle() {
        return plTallaDetalle;
    }

    public void setPlTallaDetalle(String plTallaDetalle) {
        this.plTallaDetalle = plTallaDetalle;
    }

    public String getPlTipoCodigo() {
        return plTipoCodigo;
    }

    public void setPlTipoCodigo(String plTipoCodigo) {
        this.plTipoCodigo = plTipoCodigo;
    }

    public String getPlTipoDetalle() {
        return plTipoDetalle;
    }

    public void setPlTipoDetalle(String plTipoDetalle) {
        this.plTipoDetalle = plTipoDetalle;
    }
    
    @Override
    public String toString() {
        return "PrdPreLiquidacionDetalleProductoTO{" + "id=" + id + ", plNumeroSistema=" + plNumeroSistema + ", plFecha=" + plFecha + ", plClienteId=" + plClienteId + ", plClienteRazonSocial=" + plClienteRazonSocial + ", plLote=" + plLote + ", detProductoCodigo=" + detProductoCodigo + ", detProductoNombre=" + detProductoNombre + ", detProductoClase=" + detProductoClase + ", detProductoTipo=" + detProductoTipo + ", detLibras=" + detLibras + ", detPrecio=" + detPrecio + ", pisSector=" + pisSector + ", pisNumero=" + pisNumero + ", plTallaCodigo=" + plTallaCodigo + ", plTallaDetalle=" + plTallaDetalle + ", plTipoCodigo=" + plTipoCodigo + ", plTipoDetalle=" + plTipoDetalle + '}';
    }
    
}
