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
public class InvComprasLiquidacionTO implements Serializable {

    Integer detSecuencia = 0;
    String comEmpresa;
    String comPeriodo;
    String comMotivo;
    String comNumero;
    String liqEmpresa;
    String liqMotivo;
    String liqNumero;
    BigDecimal liqTotal;
    String liqFecha;
    String provLiqCodigo;
    String provLiqEmpresa;
    BigDecimal liqLibras;

    public InvComprasLiquidacionTO() {
    }

    public Integer getDetSecuencia() {
        return detSecuencia;
    }

    public void setDetSecuencia(Integer detSecuencia) {
        this.detSecuencia = detSecuencia;
    }

    public String getComEmpresa() {
        return comEmpresa;
    }

    public void setComEmpresa(String comEmpresa) {
        this.comEmpresa = comEmpresa;
    }

    public String getComPeriodo() {
        return comPeriodo;
    }

    public void setComPeriodo(String comPeriodo) {
        this.comPeriodo = comPeriodo;
    }

    public String getComMotivo() {
        return comMotivo;
    }

    public void setComMotivo(String comMotivo) {
        this.comMotivo = comMotivo;
    }

    public String getComNumero() {
        return comNumero;
    }

    public void setComNumero(String comNumero) {
        this.comNumero = comNumero;
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

    public String getProvLiqCodigo() {
        return provLiqCodigo;
    }

    public void setProvLiqCodigo(String provLiqCodigo) {
        this.provLiqCodigo = provLiqCodigo;
    }

    public String getProvLiqEmpresa() {
        return provLiqEmpresa;
    }

    public void setProvLiqEmpresa(String provLiqEmpresa) {
        this.provLiqEmpresa = provLiqEmpresa;
    }

    public BigDecimal getLiqLibras() {
        return liqLibras;
    }

    public void setLiqLibras(BigDecimal liqLibras) {
        this.liqLibras = liqLibras;
    }

}
