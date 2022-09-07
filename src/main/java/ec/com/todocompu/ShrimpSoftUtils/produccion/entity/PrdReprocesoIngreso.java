/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvBodega;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProducto;
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
 * @author Trabajo
 */
@Entity
@Table(name = "prd_reproceso_ingreso", schema = "produccion")
public class PrdReprocesoIngreso implements Serializable {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "rep_secuencial")
    private Integer repSecuencial;
    @Column(name = "rep_orden")
    private int repOrden;
    @Column(name = "rep_cantidad")
    private BigDecimal repCantidad;
    @Column(name = "rep_porcentaje")
    private BigDecimal repPorcentaje;
    @Column(name = "rep_precio")
    private BigDecimal repPrecio;
    @JoinColumns({
        @JoinColumn(name = "bod_empresa", referencedColumnName = "bod_empresa")
        ,@JoinColumn(name = "bod_codigo", referencedColumnName = "bod_codigo")})
    @ManyToOne(optional = false)
    private InvBodega invBodega;
    @Column(name = "sec_empresa")
    private String secEmpresa;
    @Column(name = "sec_codigo")
    private String secCodigo;
    @Column(name = "pis_empresa")
    private String pisEmpresa;
    @Column(name = "pis_sector")
    private String pisSector;
    @Column(name = "pis_numero")
    private String pisNumero;
    @JoinColumns({
        @JoinColumn(name = "rep_empresa", referencedColumnName = "rep_empresa")
        ,@JoinColumn(name = "rep_periodo", referencedColumnName = "rep_periodo")
        ,@JoinColumn(name = "rep_motivo", referencedColumnName = "rep_motivo")
        ,@JoinColumn(name = "rep_numero", referencedColumnName = "rep_numero")})
    @ManyToOne(optional = false)
    private PrdReproceso prdReproceso;
    @JoinColumns({
        @JoinColumn(name = "pro_empresa", referencedColumnName = "pro_empresa")
        ,@JoinColumn(name = "pro_codigo_principal", referencedColumnName = "pro_codigo_principal")})
    @ManyToOne(optional = false)
    private InvProducto invProducto;

    public PrdReprocesoIngreso() {
    }

    public Integer getRepSecuencial() {
        return repSecuencial;
    }

    public void setRepSecuencial(Integer repSecuencial) {
        this.repSecuencial = repSecuencial;
    }

    public int getRepOrden() {
        return repOrden;
    }

    public void setRepOrden(int repOrden) {
        this.repOrden = repOrden;
    }

    public BigDecimal getRepCantidad() {
        return repCantidad;
    }

    public void setRepCantidad(BigDecimal repCantidad) {
        this.repCantidad = repCantidad;
    }

    public BigDecimal getRepPorcentaje() {
        return repPorcentaje;
    }

    public void setRepPorcentaje(BigDecimal repPorcentaje) {
        this.repPorcentaje = repPorcentaje;
    }

    public BigDecimal getRepPrecio() {
        return repPrecio;
    }

    public void setRepPrecio(BigDecimal repPrecio) {
        this.repPrecio = repPrecio;
    }

    public InvBodega getInvBodega() {
        return invBodega;
    }

    public void setInvBodega(InvBodega invBodega) {
        this.invBodega = invBodega;
    }

    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getPisEmpresa() {
        return pisEmpresa;
    }

    public void setPisEmpresa(String pisEmpresa) {
        this.pisEmpresa = pisEmpresa;
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

    public PrdReproceso getPrdReproceso() {
        return prdReproceso;
    }

    public void setPrdReproceso(PrdReproceso prdReproceso) {
        this.prdReproceso = prdReproceso;
    }

    public InvProducto getInvProducto() {
        return invProducto;
    }

    public void setInvProducto(InvProducto invProducto) {
        this.invProducto = invProducto;
    }

}
