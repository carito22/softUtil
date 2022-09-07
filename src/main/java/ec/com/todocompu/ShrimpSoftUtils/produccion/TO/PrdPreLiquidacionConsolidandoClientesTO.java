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
public class PrdPreLiquidacionConsolidandoClientesTO implements Serializable {

    @Id
    private Integer id;
    @Column(name = "plc_empresa_cliente")
    private String plcEmpresaCliente;
    @Column(name = "plc_codigo_cliente")
    private String plcCodigoCliente;
    @Column(name = "plc_nombre_cliente")
    private String plcNombreCliente;
    @Column(name = "plc_identificacion")
    private String plcIdentificacion;
    @Column(name = "plc_libras_enviadas")
    private BigDecimal plcLibrasEnviadas;
    @Column(name = "plc_libras_recibidas")
    private BigDecimal plcLibrasRecibidas;
    @Column(name = "plc_libras_basura")
    private BigDecimal plcLibrasBasura;
    @Column(name = "plc_libras_retiradas")
    private BigDecimal plcLibrasRetiradas;
    @Column(name = "plc_libras_netas")
    private BigDecimal plcLibrasNetas;
    @Column(name = "plc_libras_entero")
    private BigDecimal plcLibrasEntero;
    @Column(name = "plc_libras_cola")
    private BigDecimal plcLibrasCola;
    @Column(name = "plc_libras_cola_procesadas")
    private BigDecimal plcLibrasColaProcesadas;
    @Column(name = "plc_animales_cosechados")
    private BigDecimal plcAnimalesCosechados;
    @Column(name = "plc_total_monto")
    private BigDecimal plcTotalMonto;

    public PrdPreLiquidacionConsolidandoClientesTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlcEmpresaCliente() {
        return plcEmpresaCliente;
    }

    public void setPlcEmpresaCliente(String plcEmpresaCliente) {
        this.plcEmpresaCliente = plcEmpresaCliente;
    }

    public String getPlcCodigoCliente() {
        return plcCodigoCliente;
    }

    public void setPlcCodigoCliente(String plcCodigoCliente) {
        this.plcCodigoCliente = plcCodigoCliente;
    }

    public String getPlcNombreCliente() {
        return plcNombreCliente;
    }

    public void setPlcNombreCliente(String plcNombreCliente) {
        this.plcNombreCliente = plcNombreCliente;
    }

    public String getPlcIdentificacion() {
        return plcIdentificacion;
    }

    public void setPlcIdentificacion(String plcIdentificacion) {
        this.plcIdentificacion = plcIdentificacion;
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

    public BigDecimal getPlcLibrasBasura() {
        return plcLibrasBasura;
    }

    public void setPlcLibrasBasura(BigDecimal plcLibrasBasura) {
        this.plcLibrasBasura = plcLibrasBasura;
    }

    public BigDecimal getPlcLibrasRetiradas() {
        return plcLibrasRetiradas;
    }

    public void setPlcLibrasRetiradas(BigDecimal plcLibrasRetiradas) {
        this.plcLibrasRetiradas = plcLibrasRetiradas;
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

    public BigDecimal getPlcLibrasCola() {
        return plcLibrasCola;
    }

    public void setPlcLibrasCola(BigDecimal plcLibrasCola) {
        this.plcLibrasCola = plcLibrasCola;
    }

    public BigDecimal getPlcLibrasColaProcesadas() {
        return plcLibrasColaProcesadas;
    }

    public void setPlcLibrasColaProcesadas(BigDecimal plcLibrasColaProcesadas) {
        this.plcLibrasColaProcesadas = plcLibrasColaProcesadas;
    }

    public BigDecimal getPlcAnimalesCosechados() {
        return plcAnimalesCosechados;
    }

    public void setPlcAnimalesCosechados(BigDecimal plcAnimalesCosechados) {
        this.plcAnimalesCosechados = plcAnimalesCosechados;
    }

    public BigDecimal getPlcTotalMonto() {
        return plcTotalMonto;
    }

    public void setPlcTotalMonto(BigDecimal plcTotalMonto) {
        this.plcTotalMonto = plcTotalMonto;
    }

}
