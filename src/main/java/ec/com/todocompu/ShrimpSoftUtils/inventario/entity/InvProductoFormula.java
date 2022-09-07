/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
@Table(name = "inv_producto_formula", schema = "inventario")
public class InvProductoFormula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pr_secuencial")
    private Integer prSecuencial;
    @JoinColumns({
        @JoinColumn(name = "pr_principal_empresa", referencedColumnName = "pro_empresa")
        , @JoinColumn(name = "pr_principal_codigo", referencedColumnName = "pro_codigo_principal")})
    @ManyToOne(optional = false)
    private InvProducto invProducto;
    @JoinColumns({
        @JoinColumn(name = "pr_formula_empresa", referencedColumnName = "pro_empresa")
        , @JoinColumn(name = "pr_formula_codigo", referencedColumnName = "pro_codigo_principal")})
    @ManyToOne(optional = false)
    private InvProducto invProductoFormula;
    @Column(name = "pr_cantidad")
    private BigDecimal prCantidad;

    public InvProductoFormula() {
    }

    public Integer getPrSecuencial() {
        return prSecuencial;
    }

    public void setPrSecuencial(Integer prSecuencial) {
        this.prSecuencial = prSecuencial;
    }

    public InvProducto getInvProducto() {
        return invProducto;
    }

    public void setInvProducto(InvProducto invProducto) {
        this.invProducto = invProducto;
    }

    public InvProducto getInvProductoFormula() {
        return invProductoFormula;
    }

    public void setInvProductoFormula(InvProducto invProductoFormula) {
        this.invProductoFormula = invProductoFormula;
    }

    public BigDecimal getPrCantidad() {
        return prCantidad;
    }

    public void setPrCantidad(BigDecimal prCantidad) {
        this.prCantidad = prCantidad;
    }

}
