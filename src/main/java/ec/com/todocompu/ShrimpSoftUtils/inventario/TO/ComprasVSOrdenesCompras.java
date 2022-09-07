/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author User
 */
@Entity
public class ComprasVSOrdenesCompras implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "oc_sector")
    private String ocSector;

    @Column(name = "oc_motivo")
    private String ocMotivo;

    @Column(name = "oc_numero")
    private String ocNumero;

    @Column(name = "oc_fecha_emision")
    private Date ocFechaEmision;

    @Column(name = "oc_fecha_hora_entrega")
    private Timestamp ocFechaHoraEntrega;

    @Column(name = "prov_codigo")
    private String provCodigo;

    @Column(name = "prov_razon_social")
    private String provRazonSocial;

    @Column(name = "oc_contacto_nombre")
    private String ocContactoNombre;

    @Column(name = "oc_lugar_entrega")
    private String ocLugarEntrega;

    @Column(name = "cli_codigo")
    private String cliCodigo;

    @Column(name = "cli_razon_social")
    private String cliRazonSocial;

    @Column(name = "pk_pedido")
    private String pkPedido;

    @Column(name = "compras_importadas")
    private boolean comprasImportadas;

    @Column(name = "oc_monto_total")
    private BigDecimal ocMontoTotal;

    @Column(name = "oc_valor_retencion")
    private BigDecimal ocValorRetencion;

    public ComprasVSOrdenesCompras() {

    }

    public ComprasVSOrdenesCompras(Integer id, String ocSector, String ocMotivo, String ocNumero, Date ocFechaEmision, Timestamp ocFechaHoraEntrega, String provCodigo) {
        this.id = id;
        this.ocSector = ocSector;
        this.ocMotivo = ocMotivo;
        this.ocNumero = ocNumero;
        this.ocFechaEmision = ocFechaEmision;
        this.ocFechaHoraEntrega = ocFechaHoraEntrega;
        this.provCodigo = provCodigo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOcSector() {
        return ocSector;
    }

    public void setOcSector(String ocSector) {
        this.ocSector = ocSector;
    }

    public String getOcMotivo() {
        return ocMotivo;
    }

    public void setOcMotivo(String ocMotivo) {
        this.ocMotivo = ocMotivo;
    }

    public String getOcNumero() {
        return ocNumero;
    }

    public void setOcNumero(String ocNumero) {
        this.ocNumero = ocNumero;
    }

    public Date getOcFechaEmision() {
        return ocFechaEmision;
    }

    public void setOcFechaEmision(Date ocFechaEmision) {
        this.ocFechaEmision = ocFechaEmision;
    }

    public Timestamp getOcFechaHoraEntrega() {
        return ocFechaHoraEntrega;
    }

    public void setOcFechaHoraEntrega(Timestamp ocFechaHoraEntrega) {
        this.ocFechaHoraEntrega = ocFechaHoraEntrega;
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

    public String getOcContactoNombre() {
        return ocContactoNombre;
    }

    public void setOcContactoNombre(String ocContactoNombre) {
        this.ocContactoNombre = ocContactoNombre;
    }

    public String getOcLugarEntrega() {
        return ocLugarEntrega;
    }

    public void setOcLugarEntrega(String ocLugarEntrega) {
        this.ocLugarEntrega = ocLugarEntrega;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliRazonSocial() {
        return cliRazonSocial;
    }

    public void setCliRazonSocial(String cliRazonSocial) {
        this.cliRazonSocial = cliRazonSocial;
    }

    public String getPkPedido() {
        return pkPedido;
    }

    public void setPkPedido(String pkPedido) {
        this.pkPedido = pkPedido;
    }

    public boolean isComprasImportadas() {
        return comprasImportadas;
    }

    public void setComprasImportadas(boolean comprasImportadas) {
        this.comprasImportadas = comprasImportadas;
    }

    public BigDecimal getOcMontoTotal() {
        return ocMontoTotal;
    }

    public void setOcMontoTotal(BigDecimal ocMontoTotal) {
        this.ocMontoTotal = ocMontoTotal;
    }

    public BigDecimal getOcValorRetencion() {
        return ocValorRetencion;
    }

    public void setOcValorRetencion(BigDecimal ocValorRetencion) {
        this.ocValorRetencion = ocValorRetencion;
    }

}
