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
public class PrdLiquidacionConsultaTO implements Serializable {

    @Id
    private Integer id;

    @Column(name = "liq_empresa")
    private String liqEmpresa;

    @Column(name = "liq_motivo")
    private String liqMotivo;

    @Column(name = "liq_numero")
    private String liqNumero;

    @Column(name = "liq_lote")
    private String liqLote;

    @Column(name = "liq_fecha")
    private String liqFecha;

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

    @Column(name = "liq_pendiente")
    private String liqPendiente;

    @Column(name = "liq_anulado")
    private String liqAnulado;

    @Column(name = "liq_cliente_codigo")
    private String liqClienteCodigo;

    @Column(name = "liq_piscina")
    private String liqPiscina;

    @Column(name = "liq_sector")
    private String liqSector;

    @Column(name = "liq_cliente_nombre")
    private String liqClienteNombre;

    @Column(name = "liq_corrida")
    private String liqCorrida;

    @Column(name = "liq_proveedor_codigo")
    private String liqProveedorCodigo;

    @Column(name = "liq_proveedor_nombre")
    private String liqProveedorNombre;

    public PrdLiquidacionConsultaTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getLiqLote() {
        return liqLote;
    }

    public void setLiqLote(String liqLote) {
        this.liqLote = liqLote;
    }

    public String getLiqFecha() {
        return liqFecha;
    }

    public void setLiqFecha(String liqFecha) {
        this.liqFecha = liqFecha;
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

    public String getLiqPendiente() {
        return liqPendiente;
    }

    public void setLiqPendiente(String liqPendiente) {
        this.liqPendiente = liqPendiente;
    }

    public String getLiqAnulado() {
        return liqAnulado;
    }

    public void setLiqAnulado(String liqAnulado) {
        this.liqAnulado = liqAnulado;
    }

    public String getLiqClienteCodigo() {
        return liqClienteCodigo;
    }

    public void setLiqClienteCodigo(String liqClienteCodigo) {
        this.liqClienteCodigo = liqClienteCodigo;
    }

    public String getLiqPiscina() {
        return liqPiscina;
    }

    public void setLiqPiscina(String liqPiscina) {
        this.liqPiscina = liqPiscina;
    }

    public String getLiqSector() {
        return liqSector;
    }

    public void setLiqSector(String liqSector) {
        this.liqSector = liqSector;
    }

    public String getLiqClienteNombre() {
        return liqClienteNombre;
    }

    public void setLiqClienteNombre(String liqClienteNombre) {
        this.liqClienteNombre = liqClienteNombre;
    }

    public String getLiqCorrida() {
        return liqCorrida;
    }

    public void setLiqCorrida(String liqCorrida) {
        this.liqCorrida = liqCorrida;
    }

    public String getLiqProveedorCodigo() {
        return liqProveedorCodigo;
    }

    public void setLiqProveedorCodigo(String liqProveedorCodigo) {
        this.liqProveedorCodigo = liqProveedorCodigo;
    }

    public String getLiqProveedorNombre() {
        return liqProveedorNombre;
    }

    public void setLiqProveedorNombre(String liqProveedorNombre) {
        this.liqProveedorNombre = liqProveedorNombre;
    }

    @Override
    public String toString() {
        return "PrdLiquidacionConsultaTO{" + "liqEmpresa=" + liqEmpresa + ", liqMotivo=" + liqMotivo + ", liqNumero=" + liqNumero + ", liqLote=" + liqLote + ", liqFecha=" + liqFecha + ", liqLibrasEnviadas=" + liqLibrasEnviadas + ", liqLibrasRecibidas=" + liqLibrasRecibidas + ", liqLibrasBasura=" + liqLibrasBasura + ", liqLibrasRetiradas=" + liqLibrasRetiradas + ", liqLibrasNetas=" + liqLibrasNetas + ", liqLibrasEntero=" + liqLibrasEntero + ", liqLibrasCola=" + liqLibrasCola + ", liqLibrasColaProcesadas=" + liqLibrasColaProcesadas + ", liqAnimalesCosechados=" + liqAnimalesCosechados + ", liqTotalMonto=" + liqTotalMonto + ", liqPendiente=" + liqPendiente + ", liqAnulado=" + liqAnulado + ", liqClienteCodigo=" + liqClienteCodigo + ", liqPiscina=" + liqPiscina + ", liqSector=" + liqSector + ", liqClienteNombre=" + liqClienteNombre + ", liqCorrida=" + liqCorrida + ", liqProveedorCodigo=" + liqProveedorCodigo + ", liqProveedorNombre=" + liqProveedorNombre + '}';
    }

}
