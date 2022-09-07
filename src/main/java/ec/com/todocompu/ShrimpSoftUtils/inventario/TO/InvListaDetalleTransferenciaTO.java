/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvListaDetalleTransferenciaTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ltd_secuencial")
    private Integer detSecuencial;

    @Column(name = "ltd_bodega_origen")
    private String bodOrigenCodigo;

    @Column(name = "ltd_bodega_destino")
    private String bodDestinoCodigo;

    @Column(name = "ltd_producto_codigo")
    private String proCodigoPrincipal;

    @Column(name = "ltd_producto_nombre")
    private String proNombre;

    @Column(name = "ltd_cantidad")
    private java.math.BigDecimal detCantidad;

    @Column(name = "ltd_medida")
    private String medDetalle;

    @Column(name = "ltd_costo_promedio")
    private java.math.BigDecimal detCostoPromedio;

    @Column(name = "ltd_precio1")
    private java.math.BigDecimal detPrecio1;

    @Column(name = "ltd_cp_origen")
    private String cpOrigen;

    @Column(name = "ltd_cp_destino")
    private String cpDestino;

    @Column(name = "ltd_cantidad_caja")
    private java.math.BigDecimal cantidadCaja;

    @Column(name = "ltd_empaque")
    private String empaque;

    @Column(name = "ltd_presentacion_unidad")
    private String presentacionUnidad;

    @Column(name = "ltd_presentacion_caja")
    private String presentacionCaja;

    @Transient
    private List<InvTransferenciaDetalleSeriesTO> invTransferenciaDetalleSeriesListTO;

    @Column(name = "ltd_piscina")
    private String piscina;

    public InvListaDetalleTransferenciaTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBodDestinoCodigo() {
        return bodDestinoCodigo;
    }

    public void setBodDestinoCodigo(String bodDestinoCodigo) {
        this.bodDestinoCodigo = bodDestinoCodigo;
    }

    public String getBodOrigenCodigo() {
        return bodOrigenCodigo;
    }

    public void setBodOrigenCodigo(String bodOrigenCodigo) {
        this.bodOrigenCodigo = bodOrigenCodigo;
    }

    public BigDecimal getCantidadCaja() {
        return cantidadCaja;
    }

    public void setCantidadCaja(BigDecimal cantidadCaja) {
        this.cantidadCaja = cantidadCaja;
    }

    public String getCpDestino() {
        return cpDestino;
    }

    public void setCpDestino(String cpDestino) {
        this.cpDestino = cpDestino;
    }

    public String getCpOrigen() {
        return cpOrigen;
    }

    public void setCpOrigen(String cpOrigen) {
        this.cpOrigen = cpOrigen;
    }

    public BigDecimal getDetCantidad() {
        return detCantidad;
    }

    public void setDetCantidad(BigDecimal detCantidad) {
        this.detCantidad = detCantidad;
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public String getEmpaque() {
        return empaque;
    }

    public void setEmpaque(String empaque) {
        this.empaque = empaque;
    }

    public String getMedDetalle() {
        return medDetalle;
    }

    public void setMedDetalle(String medDetalle) {
        this.medDetalle = medDetalle;
    }

    public String getPresentacionCaja() {
        return presentacionCaja;
    }

    public void setPresentacionCaja(String presentacionCaja) {
        this.presentacionCaja = presentacionCaja;
    }

    public String getPresentacionUnidad() {
        return presentacionUnidad;
    }

    public void setPresentacionUnidad(String presentacionUnidad) {
        this.presentacionUnidad = presentacionUnidad;
    }

    public String getProCodigoPrincipal() {
        return proCodigoPrincipal;
    }

    public void setProCodigoPrincipal(String proCodigoPrincipal) {
        this.proCodigoPrincipal = proCodigoPrincipal;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    public BigDecimal getDetCostoPromedio() {
        return detCostoPromedio;
    }

    public void setDetCostoPromedio(BigDecimal detCostoPromedio) {
        this.detCostoPromedio = detCostoPromedio;
    }

    public BigDecimal getDetPrecio1() {
        return detPrecio1;
    }

    public void setDetPrecio1(BigDecimal detPrecio1) {
        this.detPrecio1 = detPrecio1;
    }

    public List<InvTransferenciaDetalleSeriesTO> getInvTransferenciaDetalleSeriesListTO() {
        return invTransferenciaDetalleSeriesListTO;
    }

    public void setInvTransferenciaDetalleSeriesListTO(List<InvTransferenciaDetalleSeriesTO> invTransferenciaDetalleSeriesListTO) {
        this.invTransferenciaDetalleSeriesListTO = invTransferenciaDetalleSeriesListTO;
    }

    public String getPiscina() {
        return piscina;
    }

    public void setPiscina(String piscina) {
        this.piscina = piscina;
    }

}
