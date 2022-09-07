/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//
/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvKardexTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "k_categoria")
    private String kCategoria;

    @Column(name = "k_producto")
    private String kProducto;

    @Column(name = "k_transaccion")
    private String kTransaccion;

    @Column(name = "k_Fecha")
    private String kFecha;

    @Column(name = "k_factor_conversion")
    private BigDecimal kFactorConversion;

    @Column(name = "k_entradas_cantidad")
    private BigDecimal kEntradasCantidad;

    @Column(name = "k_entradas_costo")
    private BigDecimal kEntradasCosto;

    @Column(name = "k_salidas_cantidad")
    private BigDecimal kSalidasCantidad;

    @Column(name = "k_salidas_costo")
    private BigDecimal kSalidasCosto;

    @Column(name = "k_saldos_cantidad")
    private BigDecimal kSaldosCantidad;

    @Column(name = "k_saldos_costo")
    private BigDecimal kSaldosCosto;

    @Column(name = "k_costo_actual")
    private BigDecimal kCostoActual;

    @Column(name = "k_sector_piscina")
    private String kSectorPiscina;

    @Column(name = "k_numero_sistema")
    private String kNumeroSistema;

    @Column(name = "k_documento_numero")
    private String kDocumentoNumero;

    @Column(name = "k_observaciones")
    private String kObservaciones;

    @Column(name = "k_status")
    private String kStatus;

    @Column(name = "k_bodega")
    private String kBodega;

    public InvKardexTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getkCostoActual() {
        return kCostoActual;
    }

    public void setkCostoActual(BigDecimal kCostoActual) {
        this.kCostoActual = kCostoActual;
    }

    public String getkDocumentoNumero() {
        return kDocumentoNumero;
    }

    public void setkDocumentoNumero(String kDocumentoNumero) {
        this.kDocumentoNumero = kDocumentoNumero;
    }

    public BigDecimal getkEntradasCantidad() {
        return kEntradasCantidad;
    }

    public void setkEntradasCantidad(BigDecimal kEntradasCantidad) {
        this.kEntradasCantidad = kEntradasCantidad;
    }

    public BigDecimal getkEntradasCosto() {
        return kEntradasCosto;
    }

    public void setkEntradasCosto(BigDecimal kEntradasCosto) {
        this.kEntradasCosto = kEntradasCosto;
    }

    public String getkFecha() {
        return kFecha;
    }

    public void setkFecha(String kFecha) {
        this.kFecha = kFecha;
    }

    public String getkNumeroSistema() {
        return kNumeroSistema;
    }

    public void setkNumeroSistema(String kNumeroSistema) {
        this.kNumeroSistema = kNumeroSistema;
    }

    public String getkObservaciones() {
        return kObservaciones;
    }

    public void setkObservaciones(String kObservaciones) {
        this.kObservaciones = kObservaciones;
    }

    public BigDecimal getkSaldosCantidad() {
        return kSaldosCantidad;
    }

    public void setkSaldosCantidad(BigDecimal kSaldosCantidad) {
        this.kSaldosCantidad = kSaldosCantidad;
    }

    public BigDecimal getkSaldosCosto() {
        return kSaldosCosto;
    }

    public void setkSaldosCosto(BigDecimal kSaldosCosto) {
        this.kSaldosCosto = kSaldosCosto;
    }

    public BigDecimal getkSalidasCantidad() {
        return kSalidasCantidad;
    }

    public void setkSalidasCantidad(BigDecimal kSalidasCantidad) {
        this.kSalidasCantidad = kSalidasCantidad;
    }

    public BigDecimal getkSalidasCosto() {
        return kSalidasCosto;
    }

    public void setkSalidasCosto(BigDecimal kSalidasCosto) {
        this.kSalidasCosto = kSalidasCosto;
    }

    public String getkSectorPiscina() {
        return kSectorPiscina;
    }

    public void setkSectorPiscina(String kSectorPiscina) {
        this.kSectorPiscina = kSectorPiscina;
    }

    public String getkTransaccion() {
        return kTransaccion;
    }

    public void setkTransaccion(String kTransaccion) {
        this.kTransaccion = kTransaccion;
    }

    public String getkStatus() {
        return kStatus;
    }

    public void setkStatus(String kStatus) {
        this.kStatus = kStatus;
    }

    public String getkBodega() {
        return kBodega;
    }

    public void setkBodega(String kBodega) {
        this.kBodega = kBodega;
    }

    public String getkProducto() {
        return kProducto;
    }

    public void setkProducto(String kProducto) {
        this.kProducto = kProducto;
    }

    public String getkCategoria() {
        return kCategoria;
    }

    public void setkCategoria(String kCategoria) {
        this.kCategoria = kCategoria;
    }

    public BigDecimal getkFactorConversion() {
        return kFactorConversion;
    }

    public void setkFactorConversion(BigDecimal kFactorConversion) {
        this.kFactorConversion = kFactorConversion;
    }

}
