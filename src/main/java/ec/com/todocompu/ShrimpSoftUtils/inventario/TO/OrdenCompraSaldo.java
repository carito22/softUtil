/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author User
 */
@Entity
public class OrdenCompraSaldo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "oc_sector")
    private String ocSector;

    @Column(name = "oc_motivo")
    private String ocMotivo;

    @Column(name = "oc_numero")
    private String ocNumero;

    @Column(name = "oc_fecha_emision")
    private Date ocFechaEmision;

    @Column(name = "oc_cliente_codigo")
    private String ocClienteCodigo;

    @Column(name = "oc_cliente_razon_social")
    private String ocClienteRazonSocial;

    @Column(name = "oc_producto_codigo")
    private String ocProductoCodigo;

    @Column(name = "oc_producto_nombre")
    private String ocProductoNombre;

    @Column(name = "oc_saldo")
    private BigDecimal ocSaldo;

    @Column(name = "oc_medida")
    private String ocMedida;

    @Column(name = "oc_producto_iva")
    private String ocProductoIva;

    @Column(name = "oc_cantidad")
    private BigDecimal ocCantidad;

    @Column(name = "oc_precio")
    private BigDecimal ocPrecio;

    @Column(name = "pk_orden_compra_detalle")
    private Integer pkOrdenCompraDetalle;

    public OrdenCompraSaldo() {

    }

    public OrdenCompraSaldo(Integer id, String ocSector, String ocMotivo, String ocNumero, Date ocFechaEmision, String ocClienteCodigo, String ocClienteRazonSocial, String ocProductoCodigo, String ocProductoNombre, BigDecimal ocSaldo, String ocMedida) {
        this.id = id;
        this.ocSector = ocSector;
        this.ocMotivo = ocMotivo;
        this.ocNumero = ocNumero;
        this.ocFechaEmision = ocFechaEmision;
        this.ocClienteCodigo = ocClienteCodigo;
        this.ocClienteRazonSocial = ocClienteRazonSocial;
        this.ocProductoCodigo = ocProductoCodigo;
        this.ocProductoNombre = ocProductoNombre;
        this.ocSaldo = ocSaldo;
        this.ocMedida = ocMedida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOcSector() {
        return ocSector;
    }

    public void setOcSector(String ocSector) {
        this.ocSector = ocSector;
    }

    public String getOcMotivo() {
        return ocMotivo;
    }

    public void setOcMotivo(String ocMotivo) {
        this.ocMotivo = ocMotivo;
    }

    public String getOcNumero() {
        return ocNumero;
    }

    public void setOcNumero(String ocNumero) {
        this.ocNumero = ocNumero;
    }

    public Date getOcFechaEmision() {
        return ocFechaEmision;
    }

    public void setOcFechaEmision(Date ocFechaEmision) {
        this.ocFechaEmision = ocFechaEmision;
    }

    public String getOcClienteCodigo() {
        return ocClienteCodigo;
    }

    public void setOcClienteCodigo(String ocClienteCodigo) {
        this.ocClienteCodigo = ocClienteCodigo;
    }

    public String getOcClienteRazonSocial() {
        return ocClienteRazonSocial;
    }

    public void setOcClienteRazonSocial(String ocClienteRazonSocial) {
        this.ocClienteRazonSocial = ocClienteRazonSocial;
    }

    public String getOcProductoCodigo() {
        return ocProductoCodigo;
    }

    public void setOcProductoCodigo(String ocProductoCodigo) {
        this.ocProductoCodigo = ocProductoCodigo;
    }

    public String getOcProductoNombre() {
        return ocProductoNombre;
    }

    public void setOcProductoNombre(String ocProductoNombre) {
        this.ocProductoNombre = ocProductoNombre;
    }

    public BigDecimal getOcSaldo() {
        return ocSaldo;
    }

    public void setOcSaldo(BigDecimal ocSaldo) {
        this.ocSaldo = ocSaldo;
    }

    public String getOcMedida() {
        return ocMedida;
    }

    public void setOcMedida(String ocMedida) {
        this.ocMedida = ocMedida;
    }

    public String getOcProductoIva() {
        return ocProductoIva;
    }

    public void setOcProductoIva(String ocProductoIva) {
        this.ocProductoIva = ocProductoIva;
    }

    public BigDecimal getOcCantidad() {
        return ocCantidad;
    }

    public void setOcCantidad(BigDecimal ocCantidad) {
        this.ocCantidad = ocCantidad;
    }

    public BigDecimal getOcPrecio() {
        return ocPrecio;
    }

    public void setOcPrecio(BigDecimal ocPrecio) {
        this.ocPrecio = ocPrecio;
    }

    public Integer getPkOrdenCompraDetalle() {
        return pkOrdenCompraDetalle;
    }

    public void setPkOrdenCompraDetalle(Integer pkOrdenCompraDetalle) {
        this.pkOrdenCompraDetalle = pkOrdenCompraDetalle;
    }

}
