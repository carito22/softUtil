/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author CarolValdiviezo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class AnxListaLiquidacionComprasPendientesTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "comp_periodo")
    private String compPeriodo;

    @Column(name = "comp_motivo")
    private String compMotivo;

    @Column(name = "comp_numero")
    private String compNumero;

    @Column(name = "comp_documento_tipo")
    private String compDocumentoTipo;

    @Column(name = "comp_documento_numero")
    private String compDocumentoNumero;

    @Column(name = "comp_fecha")
    private String compFecha;

    @Column(name = "prov_codigo")
    private String provCodigo;

    @Column(name = "prov_razon_social")
    private String provRazonSocial;

    @Column(name = "comp_base0")
    private java.math.BigDecimal compBase0;

    @Column(name = "comp_base_imponible")
    private java.math.BigDecimal compBaseImponible;

    @Column(name = "comp_monto_iva")
    private java.math.BigDecimal compMontoIva;

    @Column(name = "comp_total")
    private java.math.BigDecimal compTotal;

    @Column(name = "comp_ambiente")
    private String compAmbiente;

    @Column(name = "auxiliar")
    private boolean estado;

    public AnxListaLiquidacionComprasPendientesTO() {
    }

    public AnxListaLiquidacionComprasPendientesTO(Integer id, String compPeriodo, String compMotivo, String compNumero, String compDocumentoTipo, String compDocumentoNumero, String compFecha, String provCodigo, String provRazonSocial, BigDecimal compBase0, BigDecimal compBaseImponible, BigDecimal compMontoIva, BigDecimal compTotal, String compAmbiente, boolean estado) {
        this.id = id;
        this.compPeriodo = compPeriodo;
        this.compMotivo = compMotivo;
        this.compNumero = compNumero;
        this.compDocumentoTipo = compDocumentoTipo;
        this.compDocumentoNumero = compDocumentoNumero;
        this.compFecha = compFecha;
        this.provCodigo = provCodigo;
        this.provRazonSocial = provRazonSocial;
        this.compBase0 = compBase0;
        this.compBaseImponible = compBaseImponible;
        this.compMontoIva = compMontoIva;
        this.compTotal = compTotal;
        this.compAmbiente = compAmbiente;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompPeriodo() {
        return compPeriodo;
    }

    public void setCompPeriodo(String compPeriodo) {
        this.compPeriodo = compPeriodo;
    }

    public String getCompMotivo() {
        return compMotivo;
    }

    public void setCompMotivo(String compMotivo) {
        this.compMotivo = compMotivo;
    }

    public String getCompNumero() {
        return compNumero;
    }

    public void setCompNumero(String compNumero) {
        this.compNumero = compNumero;
    }

    public String getCompDocumentoTipo() {
        return compDocumentoTipo;
    }

    public void setCompDocumentoTipo(String compDocumentoTipo) {
        this.compDocumentoTipo = compDocumentoTipo;
    }

    public String getCompDocumentoNumero() {
        return compDocumentoNumero;
    }

    public void setCompDocumentoNumero(String compDocumentoNumero) {
        this.compDocumentoNumero = compDocumentoNumero;
    }

    public String getCompFecha() {
        return compFecha;
    }

    public void setCompFecha(String compFecha) {
        this.compFecha = compFecha;
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
    }

    public String getProvRazonSocial() {
        return provRazonSocial;
    }

    public void setProvRazonSocial(String provRazonSocial) {
        this.provRazonSocial = provRazonSocial;
    }

    public BigDecimal getCompBase0() {
        return compBase0;
    }

    public void setCompBase0(BigDecimal compBase0) {
        this.compBase0 = compBase0;
    }

    public BigDecimal getCompBaseImponible() {
        return compBaseImponible;
    }

    public void setCompBaseImponible(BigDecimal compBaseImponible) {
        this.compBaseImponible = compBaseImponible;
    }

    public BigDecimal getCompMontoIva() {
        return compMontoIva;
    }

    public void setCompMontoIva(BigDecimal compMontoIva) {
        this.compMontoIva = compMontoIva;
    }

    public BigDecimal getCompTotal() {
        return compTotal;
    }

    public void setCompTotal(BigDecimal compTotal) {
        this.compTotal = compTotal;
    }

    public String getCompAmbiente() {
        return compAmbiente;
    }

    public void setCompAmbiente(String compAmbiente) {
        this.compAmbiente = compAmbiente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
