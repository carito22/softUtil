/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author CarolValdiviezo
 */
public class InvVentasLiquidacionTO implements Serializable {

    Integer detSecuencia = 0;
    String vtaEmpresa;
    String vtaPeriodo;
    String vtaMotivo;
    String vtaNumero;
    String liqEmpresa;
    String liqMotivo;
    String liqNumero;
    BigDecimal liqTotal;
    String liqFecha;

    public InvVentasLiquidacionTO() {
    }

    public Integer getDetSecuencia() {
        return detSecuencia;
    }

    public void setDetSecuencia(Integer detSecuencia) {
        this.detSecuencia = detSecuencia;
    }

    public String getVtaEmpresa() {
        return vtaEmpresa;
    }

    public void setVtaEmpresa(String vtaEmpresa) {
        this.vtaEmpresa = vtaEmpresa;
    }

    public String getVtaPeriodo() {
        return vtaPeriodo;
    }

    public void setVtaPeriodo(String vtaPeriodo) {
        this.vtaPeriodo = vtaPeriodo;
    }

    public String getVtaMotivo() {
        return vtaMotivo;
    }

    public void setVtaMotivo(String vtaMotivo) {
        this.vtaMotivo = vtaMotivo;
    }

    public String getVtaNumero() {
        return vtaNumero;
    }

    public void setVtaNumero(String vtaNumero) {
        this.vtaNumero = vtaNumero;
    }

    public String getLiqEmpresa() {
        return liqEmpresa;
    }

    public void setLiqEmpresa(String liqEmpresa) {
        this.liqEmpresa = liqEmpresa;
    }

    public String getLiqMotivo() {
        return liqMotivo;
    }

    public void setLiqMotivo(String liqMotivo) {
        this.liqMotivo = liqMotivo;
    }

    public String getLiqNumero() {
        return liqNumero;
    }

    public void setLiqNumero(String liqNumero) {
        this.liqNumero = liqNumero;
    }

    public BigDecimal getLiqTotal() {
        return liqTotal;
    }

    public void setLiqTotal(BigDecimal liqTotal) {
        this.liqTotal = liqTotal;
    }

    public String getLiqFecha() {
        return liqFecha;
    }

    public void setLiqFecha(String liqFecha) {
        this.liqFecha = liqFecha;
    }

}
