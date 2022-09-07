/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdComisionista;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 *
 * @author Usuario1
 */
@Entity
public class PrdLiquidacionConsultaEmpacadoraTO implements Serializable {

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

    @Column(name = "liq_piscina")
    private String liqPiscina;

    @Column(name = "liq_sector")
    private String liqSector;

    @Column(name = "liq_corrida")
    private String liqCorrida;

    @Column(name = "liq_proveedor_codigo")
    private String liqProveedorCodigo;

    @Column(name = "liq_proveedor_nombre")
    private String liqProveedorNombre;

    @Column(name = "liq_gramaje")
    private BigDecimal liqGramaje;

    @Column(name = "liq_proveedor_ruc")
    private String liqProveedorRuc;

    @Column(name = "liq_proveedor_direccion")
    private String liqProveedorDireccion;

    @Column(name = "liq_guia")
    private String liqGuia;

    @Column(name = "liq_comisionista")
    private String liqComisionista;

    @Column(name = "prd_comisionista")
    private String prdComisionista;

    public PrdLiquidacionConsultaEmpacadoraTO() {
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

    public BigDecimal getLiqGramaje() {
        return liqGramaje;
    }

    public void setLiqGramaje(BigDecimal liqGramaje) {
        this.liqGramaje = liqGramaje;
    }

    public String getLiqProveedorRuc() {
        return liqProveedorRuc;
    }

    public void setLiqProveedorRuc(String liqProveedorRuc) {
        this.liqProveedorRuc = liqProveedorRuc;
    }

    public String getLiqProveedorDireccion() {
        return liqProveedorDireccion;
    }

    public void setLiqProveedorDireccion(String liqProveedorDireccion) {
        this.liqProveedorDireccion = liqProveedorDireccion;
    }

    public String getLiqGuia() {
        return liqGuia;
    }

    public void setLiqGuia(String liqGuia) {
        this.liqGuia = liqGuia;
    }

    public String getLiqComisionista() {
        return liqComisionista;
    }

    public void setLiqComisionista(String liqComisionista) {
        this.liqComisionista = liqComisionista;
    }

    public String getPrdComisionista() {
        return prdComisionista;
    }

    public void setPrdComisionista(String prdComisionista) {
        this.prdComisionista = prdComisionista;
    }

    @Override
    public String toString() {
        return "PrdLiquidacionConsultaEmpacadoraTO{" + "liqEmpresa=" + liqEmpresa + ", liqMotivo=" + liqMotivo + ", liqNumero=" + liqNumero + ", liqLote=" + liqLote + ", liqFecha=" + liqFecha + ", liqLibrasEnviadas=" + liqLibrasEnviadas + ", liqLibrasRecibidas=" + liqLibrasRecibidas + ", liqLibrasBasura=" + liqLibrasBasura + ", liqLibrasRetiradas=" + liqLibrasRetiradas + ", liqLibrasNetas=" + liqLibrasNetas + ", liqLibrasEntero=" + liqLibrasEntero + ", liqLibrasCola=" + liqLibrasCola + ", liqLibrasColaProcesadas=" + liqLibrasColaProcesadas + ", liqAnimalesCosechados=" + liqAnimalesCosechados + ", liqTotalMonto=" + liqTotalMonto + ", liqPendiente=" + liqPendiente + ", liqAnulado=" + liqAnulado + ", liqPiscina=" + liqPiscina + ", liqSector=" + liqSector + ", liqCorrida=" + liqCorrida + ", liqProveedorCodigo=" + liqProveedorCodigo + ", liqProveedorNombre=" + liqProveedorNombre + '}';
    }

}
