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
public class PrdPreLiquidacionConsultaTO implements Serializable{
    
    @Id
    private Integer id;

    @Column(name = "plc_empresa")
    private String plcEmpresa;

    @Column(name = "plc_motivo")
    private String plcMotivo;

    @Column(name = "plc_numero")
    private String plcNumero;

    @Column(name = "plc_lote")
    private String plcLote;

    @Column(name = "plc_fecha")
    private String plcFecha;

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

    @Column(name = "plc_pendiente")
    private String plcPendiente;

    @Column(name = "plc_anulado")
    private String plcAnulado;

    @Column(name = "plc_cliente_codigo")
    private String plcClienteCodigo;

    @Column(name = "plc_piscina")
    private String plcPiscina;

    @Column(name = "plc_sector")
    private String plcSector;

    @Column(name = "plc_cliente_nombre")
    private String plcClienteNombre;

    @Column(name = "plc_corrida")
    private String plcCorrida;

    @Column(name = "plc_proveedor_codigo")
    private String plcProveedorCodigo;

    @Column(name = "plc_proveedor_nombre")
    private String plcProveedorNombre;

    public PrdPreLiquidacionConsultaTO(){
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlcEmpresa() {
        return plcEmpresa;
    }

    public void setPlcEmpresa(String plcEmpresa) {
        this.plcEmpresa = plcEmpresa;
    }

    public String getPlcMotivo() {
        return plcMotivo;
    }

    public void setPlcMotivo(String plcMotivo) {
        this.plcMotivo = plcMotivo;
    }

    public String getPlcNumero() {
        return plcNumero;
    }

    public void setPlcNumero(String plcNumero) {
        this.plcNumero = plcNumero;
    }

    public String getPlcLote() {
        return plcLote;
    }

    public void setPlcLote(String plcLote) {
        this.plcLote = plcLote;
    }

    public String getPlcFecha() {
        return plcFecha;
    }

    public void setPlcFecha(String plcFecha) {
        this.plcFecha = plcFecha;
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

    public String getPlcPendiente() {
        return plcPendiente;
    }

    public void setPlcPendiente(String plcPendiente) {
        this.plcPendiente = plcPendiente;
    }

    public String getPlcAnulado() {
        return plcAnulado;
    }

    public void setPlcAnulado(String plcAnulado) {
        this.plcAnulado = plcAnulado;
    }

    public String getPlcClienteCodigo() {
        return plcClienteCodigo;
    }

    public void setPlcClienteCodigo(String plcClienteCodigo) {
        this.plcClienteCodigo = plcClienteCodigo;
    }

    public String getPlcPiscina() {
        return plcPiscina;
    }

    public void setPlcPiscina(String plcPiscina) {
        this.plcPiscina = plcPiscina;
    }

    public String getPlcSector() {
        return plcSector;
    }

    public void setPlcSector(String plcSector) {
        this.plcSector = plcSector;
    }

    public String getPlcClienteNombre() {
        return plcClienteNombre;
    }

    public void setPlcClienteNombre(String plcClienteNombre) {
        this.plcClienteNombre = plcClienteNombre;
    }

    public String getPlcCorrida() {
        return plcCorrida;
    }

    public void setPlcCorrida(String plcCorrida) {
        this.plcCorrida = plcCorrida;
    }

    public String getPlcProveedorCodigo() {
        return plcProveedorCodigo;
    }

    public void setPlcProveedorCodigo(String plcProveedorCodigo) {
        this.plcProveedorCodigo = plcProveedorCodigo;
    }

    public String getPlcProveedorNombre() {
        return plcProveedorNombre;
    }

    public void setPlcProveedorNombre(String plcProveedorNombre) {
        this.plcProveedorNombre = plcProveedorNombre;
    }
    
     @Override
    public String toString() {
        return "PrdPreLiquidacionConsultaTO{" + "plcEmpresa=" + plcEmpresa + ", plcMotivo=" + plcMotivo + ", plcNumero=" + plcNumero + ", plcLote=" + plcLote + ", plcFecha=" + plcFecha + ", plcLibrasEnviadas=" + plcLibrasEnviadas + ", plcLibrasRecibidas=" + plcLibrasRecibidas + ", plcLibrasBasura=" + plcLibrasBasura + ", plcLibrasRetiradas=" + plcLibrasRetiradas + ", plcLibrasNetas=" + plcLibrasNetas + ", plcLibrasEntero=" + plcLibrasEntero + ", plcLibrasCola=" + plcLibrasCola + ", plcLibrasColaProcesadas=" + plcLibrasColaProcesadas + ", plcAnimalesCosechados=" + plcAnimalesCosechados + ", plcTotalMonto=" + plcTotalMonto + ", plcPendiente=" + plcPendiente + ", plcAnulado=" + plcAnulado + ", plcClienteCodigo=" + plcClienteCodigo + ", plcPiscina=" + plcPiscina + ", plcSector=" + plcSector + ", plcClienteNombre=" + plcClienteNombre + ", plcCorrida=" + plcCorrida + ", plcProveedorCodigo=" + plcProveedorCodigo + ", plcProveedorNombre=" + plcProveedorNombre + '}';
    }
}
