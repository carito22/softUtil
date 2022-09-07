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
public class InvFunConsumosConsolidandoProductosTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ccp_producto")
    private String ccpProducto;

    @Column(name = "ccp_codigo")
    private String ccpCodigo;

    @Column(name = "ccp_medida")
    private String ccpMedida;

    @Column(name = "ccp_cantidad")
    private java.math.BigDecimal ccpCantidad;

    @Column(name = "ccp_porcentaje")
    private java.math.BigDecimal ccpPorcentaje;

    @Column(name = "ccp_costo_total")
    private java.math.BigDecimal ccpCostoTotal;

    public InvFunConsumosConsolidandoProductosTO() {
    }

    public InvFunConsumosConsolidandoProductosTO(String ccpProducto, String ccpCodigo, String ccpMedida,
            BigDecimal ccpCantidad, BigDecimal ccpPorcentaje, Integer id, BigDecimal ccpCostoTotal) {
        this.ccpProducto = ccpProducto;
        this.ccpCodigo = ccpCodigo;
        this.ccpMedida = ccpMedida;
        this.ccpCantidad = ccpCantidad;
        this.ccpPorcentaje = ccpPorcentaje;
        this.ccpCostoTotal = ccpCostoTotal;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getCcpCantidad() {
        return ccpCantidad;
    }

    public void setCcpCantidad(BigDecimal ccpCantidad) {
        this.ccpCantidad = ccpCantidad;
    }

    public String getCcpCodigo() {
        return ccpCodigo;
    }

    public void setCcpCodigo(String ccpCodigo) {
        this.ccpCodigo = ccpCodigo;
    }

    public String getCcpMedida() {
        return ccpMedida;
    }

    public void setCcpMedida(String ccpMedida) {
        this.ccpMedida = ccpMedida;
    }

    public BigDecimal getCcpPorcentaje() {
        return ccpPorcentaje;
    }

    public void setCcpPorcentaje(BigDecimal ccpPorcentaje) {
        this.ccpPorcentaje = ccpPorcentaje;
    }

    public String getCcpProducto() {
        return ccpProducto;
    }

    public void setCcpProducto(String ccpProducto) {
        this.ccpProducto = ccpProducto;
    }

    public BigDecimal getCcpCostoTotal() {
        return ccpCostoTotal;
    }

    public void setCcpCostoTotal(BigDecimal ccpCostoTotal) {
        this.ccpCostoTotal = ccpCostoTotal;
    }
}
