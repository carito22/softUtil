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
 * @author User
 */
@Entity
public class PrdLiquidacionConsolidandoClientesTO implements Serializable {

    @Id
    private Integer id;
    @Column(name = "liq_empresa_cliente")
    private String liqEmpresaCliente;
    @Column(name = "liq_codigo_cliente")
    private String liqCodigoCliente;
    @Column(name = "liq_nombre_cliente")
    private String liqNombreCliente;
    @Column(name = "liq_identificacion")
    private String liqIdentificacion;
    @Column(name = "liq_libras_enviadas")
    private BigDecimal liqLibrasEnviadas;
    @Column(name = "liq_libras_recibidas")
    private BigDecimal liqLibrasRecibidas;
    @Column(name = "liq_libras_basura")
    private BigDecimal liqLibrasBasura;
    @Column(name = "liq_libras_retiradas")
    private BigDecimal liqLibrasRetiradas;
    @Column(name = "liq_libras_netas")
    private BigDecimal liqLibrasNetas;
    @Column(name = "liq_libras_entero")
    private BigDecimal liqLibrasEntero;
    @Column(name = "liq_libras_cola")
    private BigDecimal liqLibrasCola;
    @Column(name = "liq_libras_cola_procesadas")
    private BigDecimal liqLibrasColaProcesadas;
    @Column(name = "liq_animales_cosechados")
    private BigDecimal liqAnimalesCosechados;
    @Column(name = "liq_total_monto")
    private BigDecimal liqTotalMonto;

    public PrdLiquidacionConsolidandoClientesTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLiqEmpresaCliente() {
        return liqEmpresaCliente;
    }

    public void setLiqEmpresaCliente(String liqEmpresaCliente) {
        this.liqEmpresaCliente = liqEmpresaCliente;
    }

    public String getLiqCodigoCliente() {
        return liqCodigoCliente;
    }

    public void setLiqCodigoCliente(String liqCodigoCliente) {
        this.liqCodigoCliente = liqCodigoCliente;
    }

    public String getLiqNombreCliente() {
        return liqNombreCliente;
    }

    public void setLiqNombreCliente(String liqNombreCliente) {
        this.liqNombreCliente = liqNombreCliente;
    }

    public String getLiqIdentificacion() {
        return liqIdentificacion;
    }

    public void setLiqIdentificacion(String liqIdentificacion) {
        this.liqIdentificacion = liqIdentificacion;
    }

    public BigDecimal getLiqLibrasEnviadas() {
        return liqLibrasEnviadas;
    }

    public void setLiqLibrasEnviadas(BigDecimal liqLibrasEnviadas) {
        this.liqLibrasEnviadas = liqLibrasEnviadas;
    }

    public BigDecimal getLiqLibrasRecibidas() {
        return liqLibrasRecibidas;
    }

    public void setLiqLibrasRecibidas(BigDecimal liqLibrasRecibidas) {
        this.liqLibrasRecibidas = liqLibrasRecibidas;
    }

    public BigDecimal getLiqLibrasBasura() {
        return liqLibrasBasura;
    }

    public void setLiqLibrasBasura(BigDecimal liqLibrasBasura) {
        this.liqLibrasBasura = liqLibrasBasura;
    }

    public BigDecimal getLiqLibrasRetiradas() {
        return liqLibrasRetiradas;
    }

    public void setLiqLibrasRetiradas(BigDecimal liqLibrasRetiradas) {
        this.liqLibrasRetiradas = liqLibrasRetiradas;
    }

    public BigDecimal getLiqLibrasNetas() {
        return liqLibrasNetas;
    }

    public void setLiqLibrasNetas(BigDecimal liqLibrasNetas) {
        this.liqLibrasNetas = liqLibrasNetas;
    }

    public BigDecimal getLiqLibrasEntero() {
        return liqLibrasEntero;
    }

    public void setLiqLibrasEntero(BigDecimal liqLibrasEntero) {
        this.liqLibrasEntero = liqLibrasEntero;
    }

    public BigDecimal getLiqLibrasCola() {
        return liqLibrasCola;
    }

    public void setLiqLibrasCola(BigDecimal liqLibrasCola) {
        this.liqLibrasCola = liqLibrasCola;
    }

    public BigDecimal getLiqLibrasColaProcesadas() {
        return liqLibrasColaProcesadas;
    }

    public void setLiqLibrasColaProcesadas(BigDecimal liqLibrasColaProcesadas) {
        this.liqLibrasColaProcesadas = liqLibrasColaProcesadas;
    }

    public BigDecimal getLiqAnimalesCosechados() {
        return liqAnimalesCosechados;
    }

    public void setLiqAnimalesCosechados(BigDecimal liqAnimalesCosechados) {
        this.liqAnimalesCosechados = liqAnimalesCosechados;
    }

    public BigDecimal getLiqTotalMonto() {
        return liqTotalMonto;
    }

    public void setLiqTotalMonto(BigDecimal liqTotalMonto) {
        this.liqTotalMonto = liqTotalMonto;
    }

}
