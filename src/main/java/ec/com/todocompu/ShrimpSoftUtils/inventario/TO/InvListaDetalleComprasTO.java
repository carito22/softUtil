/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdEquipoControl;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvListaDetalleComprasTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "cd_secuencial")
    private Integer secuencial;

    @Column(name = "cd_secuencial_orden_compra")
    private Integer cdSecuencialOrdenCompra;

    @Column(name = "cd_bodega_codigo")
    private String codigoBodega;

    @Column(name = "cd_pendiente")
    private Boolean pendiente;

    @Column(name = "cd_producto_codigo")
    private String codigoProducto;

    @Column(name = "cd_producto_nombre")
    private String nombreProducto;

    @Column(name = "cd_cantidad")
    private BigDecimal cantidadProducto;

    @Column(name = "cd_medida")
    private String medidaDetalle;

    @Column(name = "cd_precio")
    private BigDecimal precioProducto;

    @Column(name = "cd_parcial")
    private BigDecimal parcialProducto;

    @Column(name = "cd_descuento_porcentaje")
    private BigDecimal porcentajeDescuento;

    @Column(name = "cd_descuento_valor")
    private BigDecimal detalleDescuento;

    @Column(name = "cd_subtotal")
    private BigDecimal detalleSubtotal;

    @Column(name = "cd_sector")
    private String codigoCP;

    @Column(name = "cd_piscina")
    private String codigoCC;

    @Column(name = "cd_iva")
    private String gravaIva;

    @Column(name = "cd_valor_ultima_compra")
    private BigDecimal valorUltimaCompra;

    @Column(name = "Lvd_cantidad_caja")
    private BigDecimal detCantidadCaja;

    @Column(name = "Lvd_empaque")
    private String detEmpaque;

    @Column(name = "Lvd_presentacion_unidad")
    private String detPresentacionUnidad;

    @Column(name = "Lvd_presentacion_caja")
    private String detPresentacionCaja;

    // det_otros_impuestos
    @Column(name = "cd_otros_impuestos")
    private BigDecimal detOtrosImpuestos;

    @Column(name = "cd_ice")
    private BigDecimal detIce;

    @Column(name = "lvd_precio1")
    private BigDecimal detPrecio1;

    @Column(name = "lvd_precio2")
    private BigDecimal detPrecio2;

    @Column(name = "lvd_precio3")
    private BigDecimal detPrecio3;

    @Column(name = "lvd_precio4")
    private BigDecimal detPrecio4;

    @Column(name = "lvd_precio5")
    private BigDecimal detPrecio5;

    @Transient
    private List<InvComprasDetalleSeriesTO> invComprasDetalleSeriesListTO;

    @Transient
    private boolean serieOCupada;

    @Column(name = "cd_observaciones")
    private String cdObservaciones;

    @Transient
    private String detCreditoTributario;
    
    @Transient
    private BigDecimal factorConversion;

    @JoinColumns({
        @JoinColumn(name = "ec_empresa", referencedColumnName = "ec_empresa")
        ,
        @JoinColumn(name = "ec_codigo", referencedColumnName = "ec_codigo")})
    @ManyToOne(optional = true)
    private PrdEquipoControl prdEquipoControl;

    public InvListaDetalleComprasTO() {
    }

    public InvListaDetalleComprasTO(Integer id, Integer secuencial, String codigoBodega, Boolean pendiente,
            String codigoProducto, String nombreProducto, BigDecimal cantidadProducto, String medidaDetalle,
            BigDecimal precioProducto, BigDecimal parcialProducto, BigDecimal porcentajeDescuento,
            BigDecimal detalleDescuento, BigDecimal detalleSubtotal, String codigoCP, String codigoCC, String gravaIva,
            BigDecimal valorUltimaCompra, BigDecimal detCantidadCaja, String detEmpaque, String detPresentacionUnidad,
            String detPresentacionCaja, BigDecimal detOtrosImpuestos, BigDecimal detIce, BigDecimal detPrecio1,
            BigDecimal detPrecio2, BigDecimal detPrecio3, BigDecimal detPrecio4, BigDecimal detPrecio5) {
        this.id = id;
        this.secuencial = secuencial;
        this.codigoBodega = codigoBodega;
        this.pendiente = pendiente;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.medidaDetalle = medidaDetalle;
        this.precioProducto = precioProducto;
        this.parcialProducto = parcialProducto;
        this.porcentajeDescuento = porcentajeDescuento;
        this.detalleDescuento = detalleDescuento;
        this.detalleSubtotal = detalleSubtotal;
        this.codigoCP = codigoCP;
        this.codigoCC = codigoCC;
        this.gravaIva = gravaIva;
        this.valorUltimaCompra = valorUltimaCompra;
        this.detCantidadCaja = detCantidadCaja;
        this.detEmpaque = detEmpaque;
        this.detPresentacionUnidad = detPresentacionUnidad;
        this.detPresentacionCaja = detPresentacionCaja;
        this.detOtrosImpuestos = detOtrosImpuestos;
        this.detIce = detIce;
        this.detPrecio1 = detPrecio1;
        this.detPrecio2 = detPrecio2;
        this.detPrecio3 = detPrecio3;
        this.detPrecio4 = detPrecio4;
        this.detPrecio5 = detPrecio5;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSecuencial() {
        return secuencial;
    }

    public void setSecuencial(Integer secuencial) {
        this.secuencial = secuencial;
    }

    public String getCodigoBodega() {
        return codigoBodega;
    }

    public void setCodigoBodega(String codigoBodega) {
        this.codigoBodega = codigoBodega;
    }

    public Boolean getPendiente() {
        return pendiente;
    }

    public void setPendiente(Boolean pendiente) {
        this.pendiente = pendiente;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public BigDecimal getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(BigDecimal cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getMedidaDetalle() {
        return medidaDetalle;
    }

    public void setMedidaDetalle(String medidaDetalle) {
        this.medidaDetalle = medidaDetalle;
    }

    public BigDecimal getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(BigDecimal precioProducto) {
        this.precioProducto = precioProducto;
    }

    public BigDecimal getParcialProducto() {
        return parcialProducto;
    }

    public void setParcialProducto(BigDecimal parcialProducto) {
        this.parcialProducto = parcialProducto;
    }

    public BigDecimal getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(BigDecimal porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public BigDecimal getDetalleDescuento() {
        return detalleDescuento;
    }

    public void setDetalleDescuento(BigDecimal detalleDescuento) {
        this.detalleDescuento = detalleDescuento;
    }

    public BigDecimal getDetalleSubtotal() {
        return detalleSubtotal;
    }

    public void setDetalleSubtotal(BigDecimal detalleSubtotal) {
        this.detalleSubtotal = detalleSubtotal;
    }

    public String getCodigoCP() {
        return codigoCP;
    }

    public void setCodigoCP(String codigoCP) {
        this.codigoCP = codigoCP;
    }

    public String getCodigoCC() {
        return codigoCC;
    }

    public void setCodigoCC(String codigoCC) {
        this.codigoCC = codigoCC;
    }

    public String getGravaIva() {
        return gravaIva;
    }

    public void setGravaIva(String gravaIva) {
        this.gravaIva = gravaIva;
    }

    public BigDecimal getValorUltimaCompra() {
        return valorUltimaCompra;
    }

    public void setValorUltimaCompra(BigDecimal valorUltimaCompra) {
        this.valorUltimaCompra = valorUltimaCompra;
    }

    public BigDecimal getDetCantidadCaja() {
        return detCantidadCaja;
    }

    public void setDetCantidadCaja(BigDecimal detCantidadCaja) {
        this.detCantidadCaja = detCantidadCaja;
    }

    public String getDetEmpaque() {
        return detEmpaque;
    }

    public void setDetEmpaque(String detEmpaque) {
        this.detEmpaque = detEmpaque;
    }

    public String getDetPresentacionUnidad() {
        return detPresentacionUnidad;
    }

    public void setDetPresentacionUnidad(String detPresentacionUnidad) {
        this.detPresentacionUnidad = detPresentacionUnidad;
    }

    public String getDetPresentacionCaja() {
        return detPresentacionCaja;
    }

    public void setDetPresentacionCaja(String detPresentacionCaja) {
        this.detPresentacionCaja = detPresentacionCaja;
    }

    public BigDecimal getDetOtrosImpuestos() {
        return detOtrosImpuestos;
    }

    public void setDetOtrosImpuestos(BigDecimal detOtrosImpuestos) {
        this.detOtrosImpuestos = detOtrosImpuestos;
    }

    public BigDecimal getDetIce() {
        return detIce;
    }

    public void setDetIce(BigDecimal detIce) {
        this.detIce = detIce;
    }

    public BigDecimal getDetPrecio1() {
        return detPrecio1;
    }

    public void setDetPrecio1(BigDecimal detPrecio1) {
        this.detPrecio1 = detPrecio1;
    }

    public BigDecimal getDetPrecio2() {
        return detPrecio2;
    }

    public void setDetPrecio2(BigDecimal detPrecio2) {
        this.detPrecio2 = detPrecio2;
    }

    public BigDecimal getDetPrecio3() {
        return detPrecio3;
    }

    public void setDetPrecio3(BigDecimal detPrecio3) {
        this.detPrecio3 = detPrecio3;
    }

    public BigDecimal getDetPrecio4() {
        return detPrecio4;
    }

    public void setDetPrecio4(BigDecimal detPrecio4) {
        this.detPrecio4 = detPrecio4;
    }

    public BigDecimal getDetPrecio5() {
        return detPrecio5;
    }

    public void setDetPrecio5(BigDecimal detPrecio5) {
        this.detPrecio5 = detPrecio5;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public List<InvComprasDetalleSeriesTO> getInvComprasDetalleSeriesListTO() {
        return invComprasDetalleSeriesListTO;
    }

    public void setInvComprasDetalleSeriesListTO(List<InvComprasDetalleSeriesTO> invComprasDetalleSeriesListTO) {
        this.invComprasDetalleSeriesListTO = invComprasDetalleSeriesListTO;
    }

    public boolean isSerieOCupada() {
        return serieOCupada;
    }

    public void setSerieOCupada(boolean serieOCupada) {
        this.serieOCupada = serieOCupada;
    }

    public Integer getCdSecuencialOrdenCompra() {
        return cdSecuencialOrdenCompra;
    }

    public void setCdSecuencialOrdenCompra(Integer cdSecuencialOrdenCompra) {
        this.cdSecuencialOrdenCompra = cdSecuencialOrdenCompra;
    }

    public String getCdObservaciones() {
        return cdObservaciones;
    }

    public void setCdObservaciones(String cdObservaciones) {
        this.cdObservaciones = cdObservaciones;
    }

    public String getDetCreditoTributario() {
        return detCreditoTributario;
    }

    public void setDetCreditoTributario(String detCreditoTributario) {
        this.detCreditoTributario = detCreditoTributario;
    }

    public PrdEquipoControl getPrdEquipoControl() {
        return prdEquipoControl;
    }

    public void setPrdEquipoControl(PrdEquipoControl prdEquipoControl) {
        this.prdEquipoControl = prdEquipoControl;
    }

    public BigDecimal getFactorConversion() {
        return factorConversion;
    }

    public void setFactorConversion(BigDecimal factorConversion) {
        this.factorConversion = factorConversion;
    }

}
