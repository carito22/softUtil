/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Trabajo
 */
@Entity
public class PrdContabilizarCorridaCostoVentaTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "rc_contable_numero")
    private String rcContableNumero;
    @Column(name = "rc_contable_tipo")
    private String rcContableTipo;
    @Column(name = "rc_contable_periodo")
    private String rcContablePeriodo;
    @Column(name = "rc_costo_total")
    private BigDecimal rcCosto;
    @Column(name = "rc_fecha_venta")
    private String rcFechaVenta;
    @Column(name = "rc_fecha_hasta")
    private String rcFechaHasta;
    @Column(name = "rc_fecha_desde")
    private String rcFechaDesde;
    @Column(name = "rc_corrida")
    private String rcCorridaNumero;
    @Column(name = "rc_piscina")
    private String pisNumero;
    @Column(name = "rc_sector")
    private String secCodigo;
    @Column(name = "rc_empresa")
    private String empCodigo;

    public PrdContabilizarCorridaCostoVentaTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    public String getRcCorridaNumero() {
        return rcCorridaNumero;
    }

    public void setRcCorridaNumero(String rcCorridaNumero) {
        this.rcCorridaNumero = rcCorridaNumero;
    }

    public String getRcFechaDesde() {
        return rcFechaDesde;
    }

    public void setRcFechaDesde(String rcFechaDesde) {
        this.rcFechaDesde = rcFechaDesde;
    }

    public String getRcFechaHasta() {
        return rcFechaHasta;
    }

    public void setRcFechaHasta(String rcFechaHasta) {
        this.rcFechaHasta = rcFechaHasta;
    }

    public String getRcFechaVenta() {
        return rcFechaVenta;
    }

    public void setRcFechaVenta(String rcFechaVenta) {
        this.rcFechaVenta = rcFechaVenta;
    }

    public BigDecimal getRcCosto() {
        return rcCosto;
    }

    public void setRcCosto(BigDecimal rcCosto) {
        this.rcCosto = rcCosto;
    }

    public String getRcContablePeriodo() {
        return rcContablePeriodo;
    }

    public void setRcContablePeriodo(String rcContablePeriodo) {
        this.rcContablePeriodo = rcContablePeriodo;
    }

    public String getRcContableTipo() {
        return rcContableTipo;
    }

    public void setRcContableTipo(String rcContableTipo) {
        this.rcContableTipo = rcContableTipo;
    }

    public String getRcContableNumero() {
        return rcContableNumero;
    }

    public void setRcContableNumero(String rcContableNumero) {
        this.rcContableNumero = rcContableNumero;
    }

}
