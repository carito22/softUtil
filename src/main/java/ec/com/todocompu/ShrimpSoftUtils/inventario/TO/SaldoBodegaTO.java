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
public class SaldoBodegaTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "sb_bodega")
    private String sbBodega;

    @Column(name = "sb_producto_codigo")
    private String sbProducto;

    @Column(name = "sb_producto_nombre")
    private String sbNombre;

    @Column(name = "sb_producto_cuenta")
    private String sbProductoCuenta;

    @Column(name = "sb_medida")
    private String sbMedida;

    @Column(name = "sb_stock")
    private java.math.BigDecimal sbStock;

    @Column(name = "sb_costo")
    private java.math.BigDecimal sbCosto;

    @Column(name = "sb_total")
    private java.math.BigDecimal sbTotal;

    @Column(name = "sb_exigir_serie")
    private Boolean sbExigirSerie;

    @Column(name = "sb_serie")
    private String sbSerie;
    
    @Column(name = "sb_cajetas")
    private java.math.BigDecimal sbCajetas;

    public SaldoBodegaTO() {

    }

    public SaldoBodegaTO(String sbBodega, String sbProducto, String sbNombre, String sbMedida,
            java.math.BigDecimal sbStock, java.math.BigDecimal sbCosto, java.math.BigDecimal sbTotal, Integer id) {
        this.sbBodega = sbBodega;
        this.sbProducto = sbProducto;
        this.sbNombre = sbNombre;
        this.sbMedida = sbMedida;
        this.sbStock = sbStock;
        this.sbCosto = sbCosto;
        this.sbTotal = sbTotal;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSbBodega() {
        return sbBodega;
    }

    public void setSbBodega(String sbBodega) {
        this.sbBodega = sbBodega;
    }

    public java.math.BigDecimal getSbCosto() {
        return sbCosto;
    }

    public void setSbCosto(java.math.BigDecimal sbCosto) {
        this.sbCosto = sbCosto;
    }

    public String getSbMedida() {
        return sbMedida;
    }

    public void setSbMedida(String sbMedida) {
        this.sbMedida = sbMedida;
    }

    public String getSbNombre() {
        return sbNombre;
    }

    public void setSbNombre(String sbNombre) {
        this.sbNombre = sbNombre;
    }

    public String getSbProducto() {
        return sbProducto;
    }

    public void setSbProducto(String sbProducto) {
        this.sbProducto = sbProducto;
    }

    public java.math.BigDecimal getSbStock() {
        return sbStock;
    }

    public void setSbStock(java.math.BigDecimal sbStock) {
        this.sbStock = sbStock;
    }

    public java.math.BigDecimal getSbTotal() {
        return sbTotal;
    }

    public void setSbTotal(java.math.BigDecimal sbTotal) {
        this.sbTotal = sbTotal;
    }

    public String getSbProductoCuenta() {
        return sbProductoCuenta;
    }

    public void setSbProductoCuenta(String sbProductoCuenta) {
        this.sbProductoCuenta = sbProductoCuenta;
    }

    public Boolean isSbExigirSerie() {
        return sbExigirSerie;
    }

    public void setSbExigirSerie(Boolean sbExigirSerie) {
        this.sbExigirSerie = sbExigirSerie;
    }

    public String getSbSerie() {
        return sbSerie;
    }

    public void setSbSerie(String sbSerie) {
        this.sbSerie = sbSerie;
    }

    public BigDecimal getSbCajetas() {
        return sbCajetas;
    }

    public void setSbCajetas(BigDecimal sbCajetas) {
        this.sbCajetas = sbCajetas;
    }

}
