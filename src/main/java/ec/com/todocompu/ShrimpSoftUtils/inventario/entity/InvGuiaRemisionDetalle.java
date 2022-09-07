/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
@Table(name = "inv_guia_remision_detalle", schema = "inventario")
public class InvGuiaRemisionDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "det_secuencial")
    private Integer detSecuencial;

    @JoinColumns({
        @JoinColumn(name = "guia_empresa", referencedColumnName = "guia_empresa")
        ,@JoinColumn(name = "guia_periodo", referencedColumnName = "guia_periodo")
        ,@JoinColumn(name = "guia_numero", referencedColumnName = "guia_numero")})
    @ManyToOne(optional = false)
    private InvGuiaRemision invGuiaRemision;

    @Column(name = "det_orden")
    private int detOrden;

    @Column(name = "det_cantidad")
    private BigDecimal detCantidad;

    @Column(name = "pro_nombre")
    private String nombreProducto;

    @JoinColumns({
        @JoinColumn(name = "pro_empresa", referencedColumnName = "pro_empresa")
        ,@JoinColumn(name = "pro_codigo_principal", referencedColumnName = "pro_codigo_principal")})
    @ManyToOne(optional = false)
    private InvProducto invProducto;

    public InvGuiaRemisionDetalle() {
    }

    public InvGuiaRemisionDetalle(Integer detSecuencial, InvGuiaRemision invGuiaRemision, int detOrden, BigDecimal detCantidad, String nombreProducto, InvProducto invProducto) {
        this.detSecuencial = detSecuencial;
        this.invGuiaRemision = invGuiaRemision;
        this.detOrden = detOrden;
        this.detCantidad = detCantidad;
        this.nombreProducto = nombreProducto;
        this.invProducto = invProducto;
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvGuiaRemision getInvGuiaRemision() {
        return invGuiaRemision;
    }

    public void setInvGuiaRemision(InvGuiaRemision invGuiaRemision) {
        this.invGuiaRemision = invGuiaRemision;
    }

    public int getDetOrden() {
        return detOrden;
    }

    public void setDetOrden(int detOrden) {
        this.detOrden = detOrden;
    }

    public BigDecimal getDetCantidad() {
        return detCantidad;
    }

    public void setDetCantidad(BigDecimal detCantidad) {
        this.detCantidad = detCantidad;
    }

    public InvProducto getInvProducto() {
        return invProducto;
    }

    public void setInvProducto(InvProducto invProducto) {
        this.invProducto = invProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

}
