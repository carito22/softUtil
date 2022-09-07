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
 * @author Usuario1
 */
@Entity
public class PrdPreLiquidacionesDetalleTO implements Serializable{
    
    @Id
    private Integer id;

    @Column(name = "plc_numero")
    private String plcNumero;

    @Column(name = "plc_fecha")
    private String plcFecha;

    @Column(name = "plc_cliente")
    private String plcCliente;

    @Column(name = "plc_lote")
    private String plcLote;

    @Column(name = "plc_corrida")
    private String plcCorrida;

    @Column(name = "plc_libras_enviadas")
    private BigDecimal plcLibrasEnviadas;

    @Column(name = "plc_libras_recibidas")
    private BigDecimal plcLibrasRecibidas;

    @Column(name = "plc_diferencia")
    private BigDecimal plcDiferencia;

    @Column(name = "plc_libras_basura")
    private BigDecimal plcLibrasBasura;

    @Column(name = "plc_libras_netas")
    private BigDecimal plcLibrasNetas;

    @Column(name = "plc_libras_entero")
    private BigDecimal plcLibrasEntero;

    @Column(name = "plc_rendimiento")
    private BigDecimal plcRendimiento;

    @Column(name = "plc_20/30")
    private BigDecimal plc20_30;

    @Column(name = "plc_30/40")
    private BigDecimal plc30_40;

    @Column(name = "plc_40/50")
    private BigDecimal plc40_50;

    @Column(name = "plc_50/60")
    private BigDecimal plc50_60;

    @Column(name = "plc_60/70")
    private BigDecimal plc60_70;

    @Column(name = "plc_otras_tallas")
    private BigDecimal plcOtrasTallas;

    @Column(name = "plc_total_monto")
    private BigDecimal plcTotalMonto;

    @Column(name = "plc_precio_libra_promedio")
    private BigDecimal plcPrecioLibraPromedio;

    @Column(name = "plc_mes")
    private String plcMes;
    
    public PrdPreLiquidacionesDetalleTO(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlcNumero() {
        return plcNumero;
    }

    public void setPlcNumero(String plcNumero) {
        this.plcNumero = plcNumero;
    }

    public String getPlcFecha() {
        return plcFecha;
    }

    public void setPlcFecha(String plcFecha) {
        this.plcFecha = plcFecha;
    }

    public String getPlcCliente() {
        return plcCliente;
    }

    public void setPlcCliente(String plcCliente) {
        this.plcCliente = plcCliente;
    }

    public String getPlcLote() {
        return plcLote;
    }

    public void setPlcLote(String plcLote) {
        this.plcLote = plcLote;
    }

    public String getPlcCorrida() {
        return plcCorrida;
    }

    public void setPlcCorrida(String plcCorrida) {
        this.plcCorrida = plcCorrida;
    }

    public BigDecimal getPlcLibrasEnviadas() {
        return plcLibrasEnviadas;
    }

    public void setPlcLibrasEnviadas(BigDecimal plcLibrasEnviadas) {
        this.plcLibrasEnviadas = plcLibrasEnviadas;
    }

    public BigDecimal getPlcLibrasRecibidas() {
        return plcLibrasRecibidas;
    }

    public void setPlcLibrasRecibidas(BigDecimal plcLibrasRecibidas) {
        this.plcLibrasRecibidas = plcLibrasRecibidas;
    }

    public BigDecimal getPlcDiferencia() {
        return plcDiferencia;
    }

    public void setPlcDiferencia(BigDecimal plcDiferencia) {
        this.plcDiferencia = plcDiferencia;
    }

    public BigDecimal getPlcLibrasBasura() {
        return plcLibrasBasura;
    }

    public void setPlcLibrasBasura(BigDecimal plcLibrasBasura) {
        this.plcLibrasBasura = plcLibrasBasura;
    }

    public BigDecimal getPlcLibrasNetas() {
        return plcLibrasNetas;
    }

    public void setPlcLibrasNetas(BigDecimal plcLibrasNetas) {
        this.plcLibrasNetas = plcLibrasNetas;
    }

    public BigDecimal getPlcLibrasEntero() {
        return plcLibrasEntero;
    }

    public void setPlcLibrasEntero(BigDecimal plcLibrasEntero) {
        this.plcLibrasEntero = plcLibrasEntero;
    }

    public BigDecimal getPlcRendimiento() {
        return plcRendimiento;
    }

    public void setPlcRendimiento(BigDecimal plcRendimiento) {
        this.plcRendimiento = plcRendimiento;
    }

    public BigDecimal getPlc20_30() {
        return plc20_30;
    }

    public void setPlc20_30(BigDecimal plc20_30) {
        this.plc20_30 = plc20_30;
    }

    public BigDecimal getPlc30_40() {
        return plc30_40;
    }

    public void setPlc30_40(BigDecimal plc30_40) {
        this.plc30_40 = plc30_40;
    }

    public BigDecimal getPlc40_50() {
        return plc40_50;
    }

    public void setPlc40_50(BigDecimal plc40_50) {
        this.plc40_50 = plc40_50;
    }

    public BigDecimal getPlc50_60() {
        return plc50_60;
    }

    public void setPlc50_60(BigDecimal plc50_60) {
        this.plc50_60 = plc50_60;
    }

    public BigDecimal getPlc60_70() {
        return plc60_70;
    }

    public void setPlc60_70(BigDecimal plc60_70) {
        this.plc60_70 = plc60_70;
    }

    public BigDecimal getPlcOtrasTallas() {
        return plcOtrasTallas;
    }

    public void setPlcOtrasTallas(BigDecimal plcOtrasTallas) {
        this.plcOtrasTallas = plcOtrasTallas;
    }

    public BigDecimal getPlcTotalMonto() {
        return plcTotalMonto;
    }

    public void setPlcTotalMonto(BigDecimal plcTotalMonto) {
        this.plcTotalMonto = plcTotalMonto;
    }

    public BigDecimal getPlcPrecioLibraPromedio() {
        return plcPrecioLibraPromedio;
    }

    public void setPlcPrecioLibraPromedio(BigDecimal plcPrecioLibraPromedio) {
        this.plcPrecioLibraPromedio = plcPrecioLibraPromedio;
    }

    public String getPlcMes() {
        return plcMes;
    }

    public void setPlcMes(String plcMes) {
        this.plcMes = plcMes;
    }
    
    
    
}
