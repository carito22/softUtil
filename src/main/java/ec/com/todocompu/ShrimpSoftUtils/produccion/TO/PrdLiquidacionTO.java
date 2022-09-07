/*
 * To change this template, choose Tools | Templates
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
 * @author Carlos Ajila
 */
@Entity
public class PrdLiquidacionTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
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
    private boolean liqPendiente;

    @Column(name = "liq_anulado")
    private boolean liqAnulado;

    @Column(name = "cli_empresa")
    private String cliEmpresa;

    @Column(name = "cli_codigo")
    private String cliCodigo;

    @Column(name = "pis_empresa")
    private String pisEmpresa;

    @Column(name = "pis_sector")
    private String pisSector;

    @Column(name = "pis_numero")
    private String pisNumero;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    @Column(name = "prov_codigo")
    private String provCodigo;

    @Column(name = "prov_empresa")
    private String provEmpresa;

    public PrdLiquidacionTO() {
    }

    public PrdLiquidacionTO(String liqEmpresa, String liqMotivo, String liqNumero, String liqLote, String liqFecha,
            BigDecimal liqLibrasEnviadas, BigDecimal liqLibrasRecibidas, BigDecimal liqLibrasBasura,
            BigDecimal liqLibrasRetiradas, BigDecimal liqLibrasNetas, BigDecimal liqLibrasEntero,
            BigDecimal liqLibrasCola, BigDecimal liqLibrasColaProcesadas, BigDecimal liqAnimalesCosechados,
            BigDecimal liqTotalMonto, boolean liqPendiente, boolean liqAnulado, String cliEmpresa, String cliCodigo,
            String pisEmpresa, String pisSector, String pisNumero, String usrEmpresa, String usrCodigo,
            String usrFechaInserta, String provCodigo, String provEmpresa) {
        this.liqEmpresa = liqEmpresa;
        this.liqMotivo = liqMotivo;
        this.liqNumero = liqNumero;
        this.liqLote = liqLote;
        this.liqFecha = liqFecha;
        this.liqLibrasEnviadas = liqLibrasEnviadas;
        this.liqLibrasRecibidas = liqLibrasRecibidas;
        this.liqLibrasBasura = liqLibrasBasura;
        this.liqLibrasRetiradas = liqLibrasRetiradas;
        this.liqLibrasNetas = liqLibrasNetas;
        this.liqLibrasEntero = liqLibrasEntero;
        this.liqLibrasCola = liqLibrasCola;
        this.liqLibrasColaProcesadas = liqLibrasColaProcesadas;
        this.liqAnimalesCosechados = liqAnimalesCosechados;
        this.liqTotalMonto = liqTotalMonto;
        this.liqPendiente = liqPendiente;
        this.liqAnulado = liqAnulado;
        this.cliEmpresa = cliEmpresa;
        this.cliCodigo = cliCodigo;
        this.pisEmpresa = pisEmpresa;
        this.pisSector = pisSector;
        this.pisNumero = pisNumero;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.provCodigo = provCodigo;
        this.provEmpresa = provEmpresa;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliEmpresa() {
        return cliEmpresa;
    }

    public void setCliEmpresa(String cliEmpresa) {
        this.cliEmpresa = cliEmpresa;
    }

    public BigDecimal getLiqAnimalesCosechados() {
        return liqAnimalesCosechados;
    }

    public void setLiqAnimalesCosechados(BigDecimal liqAnimalesCosechados) {
        this.liqAnimalesCosechados = liqAnimalesCosechados;
    }

    public boolean isLiqAnulado() {
        return liqAnulado;
    }

    public void setLiqAnulado(boolean liqAnulado) {
        this.liqAnulado = liqAnulado;
    }

    public String getLiqEmpresa() {
        return liqEmpresa;
    }

    public void setLiqEmpresa(String liqEmpresa) {
        this.liqEmpresa = liqEmpresa;
    }

    public String getLiqFecha() {
        return liqFecha;
    }

    public void setLiqFecha(String liqFecha) {
        this.liqFecha = liqFecha;
    }

    public BigDecimal getLiqLibrasBasura() {
        return liqLibrasBasura;
    }

    public void setLiqLibrasBasura(BigDecimal liqLibrasBasura) {
        this.liqLibrasBasura = liqLibrasBasura;
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

    public BigDecimal getLiqLibrasEntero() {
        return liqLibrasEntero;
    }

    public void setLiqLibrasEntero(BigDecimal liqLibrasEntero) {
        this.liqLibrasEntero = liqLibrasEntero;
    }

    public BigDecimal getLiqLibrasEnviadas() {
        return liqLibrasEnviadas;
    }

    public void setLiqLibrasEnviadas(BigDecimal liqLibrasEnviadas) {
        this.liqLibrasEnviadas = liqLibrasEnviadas;
    }

    public BigDecimal getLiqLibrasNetas() {
        return liqLibrasNetas;
    }

    public void setLiqLibrasNetas(BigDecimal liqLibrasNetas) {
        this.liqLibrasNetas = liqLibrasNetas;
    }

    public BigDecimal getLiqLibrasRecibidas() {
        return liqLibrasRecibidas;
    }

    public void setLiqLibrasRecibidas(BigDecimal liqLibrasRecibidas) {
        this.liqLibrasRecibidas = liqLibrasRecibidas;
    }

    public BigDecimal getLiqLibrasRetiradas() {
        return liqLibrasRetiradas;
    }

    public void setLiqLibrasRetiradas(BigDecimal liqLibrasRetiradas) {
        this.liqLibrasRetiradas = liqLibrasRetiradas;
    }

    public String getLiqLote() {
        return liqLote;
    }

    public void setLiqLote(String liqLote) {
        this.liqLote = liqLote;
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

    public boolean isLiqPendiente() {
        return liqPendiente;
    }

    public void setLiqPendiente(boolean liqPendiente) {
        this.liqPendiente = liqPendiente;
    }

    public BigDecimal getLiqTotalMonto() {
        return liqTotalMonto;
    }

    public void setLiqTotalMonto(BigDecimal liqTotalMonto) {
        this.liqTotalMonto = liqTotalMonto;
    }

    public String getPisEmpresa() {
        return pisEmpresa;
    }

    public void setPisEmpresa(String pisEmpresa) {
        this.pisEmpresa = pisEmpresa;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    public String getPisSector() {
        return pisSector;
    }

    public void setPisSector(String pisSector) {
        this.pisSector = pisSector;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
    }

    public String getProvEmpresa() {
        return provEmpresa;
    }

    public void setProvEmpresa(String provEmpresa) {
        this.provEmpresa = provEmpresa;
    }

}
