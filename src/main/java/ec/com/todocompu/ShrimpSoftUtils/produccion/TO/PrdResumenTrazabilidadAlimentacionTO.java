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
 * @author VALDIVIEZO
 */
@Entity
public class PrdResumenTrazabilidadAlimentacionTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "rc_sector")
    private String rcSector;
    @Column(name = "rc_piscina")
    private String rcPiscina;
    @Column(name = "rc_corrida")
    private String rcCorrida;
    @Column(name = "rc_hectareaje")
    private BigDecimal rcHectareaje;
    @Column(name = "rc_fecha_desde")
    private String rcFechaDesde;
    @Column(name = "rc_fecha_siembra")
    private String rcFechaSiembra;
    @Column(name = "rc_fecha_pesca")
    private String rcFechaPesca;
    @Column(name = "rc_fecha_hasta")
    private String rcFechaHasta;
    @Column(name = "rc_balanceado_codigo")
    private String rcBalanceadoCodigo;
    @Column(name = "rc_balanceado_cantidad")
    private BigDecimal rcBalanceadoCantidad;
    @Column(name = "rc_balanceado_costo")
    private BigDecimal rcBalanceadoCosto;
    @Column(name = "rc_balanceado_transferido_codigo")
    private String rcBalanceadoTransferidoCodigo;
    @Column(name = "rc_balanceado_transferido_cantidad")
    private BigDecimal rcBalanceadoTransferidoCantidad;
    @Column(name = "rc_balanceado_transferido_costo")
    private BigDecimal rcBalanceadoTransferidoCosto;

    public PrdResumenTrazabilidadAlimentacionTO() {
    }

    public PrdResumenTrazabilidadAlimentacionTO(Integer id, String rcSector, String rcPiscina, String rcCorrida, BigDecimal rcHectareaje, String rcFechaDesde, String rcFechaSiembra, String rcFechaPesca, String rcFechaHasta, String rcBalanceadoCodigo, BigDecimal rcBalanceadoCantidad, BigDecimal rcBalanceadoCosto, String rcBalanceadoTransferidoCodigo, BigDecimal rcBalanceadoTransferidoCantidad, BigDecimal rcBalanceadoTransferidoCosto) {
        this.id = id;
        this.rcSector = rcSector;
        this.rcPiscina = rcPiscina;
        this.rcCorrida = rcCorrida;
        this.rcHectareaje = rcHectareaje;
        this.rcFechaDesde = rcFechaDesde;
        this.rcFechaSiembra = rcFechaSiembra;
        this.rcFechaPesca = rcFechaPesca;
        this.rcFechaHasta = rcFechaHasta;
        this.rcBalanceadoCodigo = rcBalanceadoCodigo;
        this.rcBalanceadoCantidad = rcBalanceadoCantidad;
        this.rcBalanceadoCosto = rcBalanceadoCosto;
        this.rcBalanceadoTransferidoCodigo = rcBalanceadoTransferidoCodigo;
        this.rcBalanceadoTransferidoCantidad = rcBalanceadoTransferidoCantidad;
        this.rcBalanceadoTransferidoCosto = rcBalanceadoTransferidoCosto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRcSector() {
        return rcSector;
    }

    public void setRcSector(String rcSector) {
        this.rcSector = rcSector;
    }

    public String getRcPiscina() {
        return rcPiscina;
    }

    public void setRcPiscina(String rcPiscina) {
        this.rcPiscina = rcPiscina;
    }

    public String getRcCorrida() {
        return rcCorrida;
    }

    public void setRcCorrida(String rcCorrida) {
        this.rcCorrida = rcCorrida;
    }

    public BigDecimal getRcHectareaje() {
        return rcHectareaje;
    }

    public void setRcHectareaje(BigDecimal rcHectareaje) {
        this.rcHectareaje = rcHectareaje;
    }

    public String getRcFechaDesde() {
        return rcFechaDesde;
    }

    public void setRcFechaDesde(String rcFechaDesde) {
        this.rcFechaDesde = rcFechaDesde;
    }

    public String getRcFechaSiembra() {
        return rcFechaSiembra;
    }

    public void setRcFechaSiembra(String rcFechaSiembra) {
        this.rcFechaSiembra = rcFechaSiembra;
    }

    public String getRcFechaPesca() {
        return rcFechaPesca;
    }

    public void setRcFechaPesca(String rcFechaPesca) {
        this.rcFechaPesca = rcFechaPesca;
    }

    public String getRcFechaHasta() {
        return rcFechaHasta;
    }

    public void setRcFechaHasta(String rcFechaHasta) {
        this.rcFechaHasta = rcFechaHasta;
    }

    public String getRcBalanceadoCodigo() {
        return rcBalanceadoCodigo;
    }

    public void setRcBalanceadoCodigo(String rcBalanceadoCodigo) {
        this.rcBalanceadoCodigo = rcBalanceadoCodigo;
    }

    public BigDecimal getRcBalanceadoCantidad() {
        return rcBalanceadoCantidad;
    }

    public void setRcBalanceadoCantidad(BigDecimal rcBalanceadoCantidad) {
        this.rcBalanceadoCantidad = rcBalanceadoCantidad;
    }

    public BigDecimal getRcBalanceadoCosto() {
        return rcBalanceadoCosto;
    }

    public void setRcBalanceadoCosto(BigDecimal rcBalanceadoCosto) {
        this.rcBalanceadoCosto = rcBalanceadoCosto;
    }

    public String getRcBalanceadoTransferidoCodigo() {
        return rcBalanceadoTransferidoCodigo;
    }

    public void setRcBalanceadoTransferidoCodigo(String rcBalanceadoTransferidoCodigo) {
        this.rcBalanceadoTransferidoCodigo = rcBalanceadoTransferidoCodigo;
    }

    public BigDecimal getRcBalanceadoTransferidoCantidad() {
        return rcBalanceadoTransferidoCantidad;
    }

    public void setRcBalanceadoTransferidoCantidad(BigDecimal rcBalanceadoTransferidoCantidad) {
        this.rcBalanceadoTransferidoCantidad = rcBalanceadoTransferidoCantidad;
    }

    public BigDecimal getRcBalanceadoTransferidoCosto() {
        return rcBalanceadoTransferidoCosto;
    }

    public void setRcBalanceadoTransferidoCosto(BigDecimal rcBalanceadoTransferidoCosto) {
        this.rcBalanceadoTransferidoCosto = rcBalanceadoTransferidoCosto;
    }

}
