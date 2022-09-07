/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdEquipoControl;
import java.math.BigDecimal;
import java.math.BigInteger;
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
public class InvComprasDetalleTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "det_secuencial")
    private Integer detSecuencia;

    @Column(name = "det_orden")
    private Integer detOrden;

    @Column(name = "det_pendiente")
    private Boolean detPendiente = true;

    @Column(name = "det_confirmado")
    private Boolean detConfirmado;

    @Column(name = "det_cantidad")
    private BigDecimal detCantidad = new BigDecimal(BigInteger.ZERO);

    @Column(name = "det_precio")
    private BigDecimal detPrecio = new BigDecimal(BigInteger.ZERO);

    @Column(name = "det_porcentaje_descuento")
    private BigDecimal detPorcentajeDescuento = new BigDecimal(BigInteger.ZERO);

    @Column(name = "det_otros_impuestos")
    private BigDecimal detOtrosImpuestos = new BigDecimal(BigInteger.ZERO);

    @Column(name = "det_valor_promedio")
    private BigDecimal detValorPromedio = new BigDecimal(BigInteger.ZERO);

    @Column(name = "det_valor_ultima_compra")
    private BigDecimal detValorUltimaCompra = new BigDecimal(BigInteger.ZERO);

    @Column(name = "det_saldo")
    private BigDecimal detSaldo;

    @Column(name = "bod_empresa")
    private String bodEmpresa;

    @Column(name = "bod_codigo")
    private String bodCodigo;

    @Column(name = "pro_empresa")
    private String proEmpresa;

    @Column(name = "pro_codigo_principal")
    private String proCodigoPrincipal;

    @Column(name = "sec_empresa")
    private String secEmpresa;

    @Column(name = "sec_codigo")
    private String secCodigo;

    @Column(name = "pis_empresa")
    private String pisEmpresa;

    @Column(name = "pis_sector")
    private String pisSector;

    @Column(name = "pis_numero")
    private String pisNumero;

    @Column(name = "comp_empresa")
    private String comEmpresa;

    @Column(name = "comp_periodo")
    private String comPeriodo;

    @Column(name = "comp_motivo")
    private String comMotivo;

    @Column(name = "comp_numero")
    private String comNumero;

    @Column(name = "pro_estado_iva")
    private String proEstadoIva;

    @Column(name = "pro_tipo")
    private String proTipo;

    @Column(name = "det_ice")
    private BigDecimal detIce = new BigDecimal(BigInteger.ZERO);

    @Column(name = "det_precio1")
    private BigDecimal detPrecio1 = new BigDecimal(BigInteger.ZERO);

    @Column(name = "det_precio2")
    private BigDecimal detPrecio2 = new BigDecimal(BigInteger.ZERO);

    @Column(name = "det_precio3")
    private BigDecimal detPrecio3 = new BigDecimal(BigInteger.ZERO);

    @Column(name = "det_precio4")
    private BigDecimal detPrecio4 = new BigDecimal(BigInteger.ZERO);

    @Column(name = "det_precio5")
    private BigDecimal detPrecio5 = new BigDecimal(BigInteger.ZERO);

    @Column(name = "det_secuencial_orden_compra")
    private Integer detSecuencialOrdenCompra;

    @Column(name = "det_observaciones")
    private String detObservaciones;

    @JoinColumns({
        @JoinColumn(name = "ec_empresa", referencedColumnName = "ec_empresa")
        ,
	@JoinColumn(name = "ec_codigo", referencedColumnName = "ec_codigo")})
    @ManyToOne(optional = true)
    private PrdEquipoControl prdEquipoControl;

    @Transient
    private List<InvComprasDetalleSeriesTO> invComprasDetalleSeriesListTO;
    @Transient
    private String detCreditoTributario;
    @Transient
    private String pisNumeroLiq;
    @Transient
    private String sectorLiq;
    @Transient
    private String proCodigoPrincipalCopia;
    @Transient
    BigDecimal saldoActual;
    @Transient
    private String nombreProducto;
    @Transient
    private String medidaDetalle;
    @Transient
    private BigDecimal parcialProducto;
    @Transient
    private boolean exigirSerie;
    @Transient
    private BigDecimal parcialInicial;

    @Transient
    private String tallaCodigo;

    public InvComprasDetalleTO() {
    }

    public InvComprasDetalleTO(Integer detSecuencia, Integer detOrden, Boolean detPendiente, Boolean detConfirmado,
            BigDecimal detCantidad, BigDecimal detPrecio, BigDecimal detPorcentajeDescuento,
            BigDecimal detOtrosImpuestos, BigDecimal detValorPromedio, BigDecimal detValorUltimaCompra,
            BigDecimal detSaldo, String bodEmpresa, String bodCodigo, String proEmpresa, String proCodigoPrincipal,
            String secEmpresa, String secCodigo, String pisEmpresa, String pisSector, String pisNumero,
            String comEmpresa, String comPeriodo, String comMotivo, String comNumero, String proEstadoIva,
            String proTipo, BigDecimal detIce, BigDecimal detPrecio1, BigDecimal detPrecio2, BigDecimal detPrecio3,
            BigDecimal detPrecio4, BigDecimal detPrecio5) {

        this.detSecuencia = detSecuencia;
        this.detOrden = detOrden;
        this.detPendiente = detPendiente;
        this.detConfirmado = detConfirmado;
        this.detCantidad = detCantidad;
        this.detPrecio = detPrecio;
        this.detPorcentajeDescuento = detPorcentajeDescuento;
        this.detOtrosImpuestos = detOtrosImpuestos;
        this.detValorPromedio = detValorPromedio;
        this.detValorUltimaCompra = detValorUltimaCompra;
        this.detSaldo = detSaldo;
        this.bodEmpresa = bodEmpresa;
        this.bodCodigo = bodCodigo;
        this.proEmpresa = proEmpresa;
        this.proCodigoPrincipal = proCodigoPrincipal;
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.pisEmpresa = pisEmpresa;
        this.pisSector = pisSector;
        this.pisNumero = pisNumero;
        this.comEmpresa = comEmpresa;
        this.comPeriodo = comPeriodo;
        this.comMotivo = comMotivo;
        this.comNumero = comNumero;
        this.proEstadoIva = proEstadoIva;
        this.proTipo = proTipo;
        this.detIce = detIce;
        this.detPrecio1 = detPrecio1;
        this.detPrecio2 = detPrecio2;
        this.detPrecio3 = detPrecio3;
        this.detPrecio4 = detPrecio4;
        this.detPrecio5 = detPrecio5;
    }

    public List<InvComprasDetalleSeriesTO> getInvComprasDetalleSeriesListTO() {
        return invComprasDetalleSeriesListTO;
    }

    public void setInvComprasDetalleSeriesListTO(List<InvComprasDetalleSeriesTO> invComprasDetalleSeriesListTO) {
        this.invComprasDetalleSeriesListTO = invComprasDetalleSeriesListTO;
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

    public String getProEstadoIva() {
        return proEstadoIva;
    }

    public void setProEstadoIva(String proEstadoIva) {
        this.proEstadoIva = proEstadoIva;
    }

    public String getProTipo() {
        return proTipo;
    }

    public void setProTipo(String proTipo) {
        this.proTipo = proTipo;
    }

    public String getBodCodigo() {
        return bodCodigo;
    }

    public void setBodCodigo(String bodCodigo) {
        this.bodCodigo = bodCodigo;
    }

    public String getBodEmpresa() {
        return bodEmpresa;
    }

    public void setBodEmpresa(String bodEmpresa) {
        this.bodEmpresa = bodEmpresa;
    }

    public String getComEmpresa() {
        return comEmpresa;
    }

    public void setComEmpresa(String comEmpresa) {
        this.comEmpresa = comEmpresa;
    }

    public String getComMotivo() {
        return comMotivo;
    }

    public void setComMotivo(String comMotivo) {
        this.comMotivo = comMotivo;
    }

    public String getComNumero() {
        return comNumero;
    }

    public void setComNumero(String comNumero) {
        this.comNumero = comNumero;
    }

    public String getComPeriodo() {
        return comPeriodo;
    }

    public void setComPeriodo(String comPeriodo) {
        this.comPeriodo = comPeriodo;
    }

    public BigDecimal getDetCantidad() {
        return detCantidad;
    }

    public void setDetCantidad(BigDecimal detCantidad) {
        this.detCantidad = detCantidad;
    }

    public Boolean getDetConfirmado() {
        return detConfirmado;
    }

    public void setDetConfirmado(Boolean detConfirmado) {
        this.detConfirmado = detConfirmado;
    }

    public Integer getDetOrden() {
        return detOrden;
    }

    public void setDetOrden(Integer detOrden) {
        this.detOrden = detOrden;
    }

    public BigDecimal getDetOtrosImpuestos() {
        return detOtrosImpuestos;
    }

    public void setDetOtrosImpuestos(BigDecimal detOtrosImpuestos) {
        this.detOtrosImpuestos = detOtrosImpuestos;
    }

    public Boolean getDetPendiente() {
        return detPendiente;
    }

    public void setDetPendiente(Boolean detPendiente) {
        this.detPendiente = detPendiente;
    }

    public BigDecimal getDetPorcentajeDescuento() {
        return detPorcentajeDescuento;
    }

    public void setDetPorcentajeDescuento(BigDecimal detPorcentajeDescuento) {
        this.detPorcentajeDescuento = detPorcentajeDescuento;
    }

    public BigDecimal getDetPrecio() {
        return detPrecio;
    }

    public void setDetPrecio(BigDecimal detPrecio) {
        this.detPrecio = detPrecio;
    }

    public BigDecimal getDetSaldo() {
        return detSaldo;
    }

    public void setDetSaldo(BigDecimal detSaldo) {
        this.detSaldo = detSaldo;
    }

    public Integer getDetSecuencia() {
        return detSecuencia;
    }

    public void setDetSecuencia(Integer detSecuencia) {
        this.detSecuencia = detSecuencia;
    }

    public BigDecimal getDetValorPromedio() {
        return detValorPromedio;
    }

    public void setDetValorPromedio(BigDecimal detValorPromedio) {
        this.detValorPromedio = detValorPromedio;
    }

    public BigDecimal getDetValorUltimaCompra() {
        return detValorUltimaCompra;
    }

    public void setDetValorUltimaCompra(BigDecimal detValorUltimaCompra) {
        this.detValorUltimaCompra = detValorUltimaCompra;
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

    public String getProCodigoPrincipal() {
        return proCodigoPrincipal;
    }

    public void setProCodigoPrincipal(String proCodigoPrincipal) {
        this.proCodigoPrincipal = proCodigoPrincipal;
    }

    public String getProEmpresa() {
        return proEmpresa;
    }

    public void setProEmpresa(String proEmpresa) {
        this.proEmpresa = proEmpresa;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
    }

    public Integer getDetSecuencialOrdenCompra() {
        return detSecuencialOrdenCompra;
    }

    public void setDetSecuencialOrdenCompra(Integer detSecuencialOrdenCompra) {
        this.detSecuencialOrdenCompra = detSecuencialOrdenCompra;
    }

    public String getDetObservaciones() {
        return detObservaciones;
    }

    public void setDetObservaciones(String detObservaciones) {
        this.detObservaciones = detObservaciones;
    }

    public String getDetCreditoTributario() {
        return detCreditoTributario;
    }

    public void setDetCreditoTributario(String detCreditoTributario) {
        this.detCreditoTributario = detCreditoTributario;
    }

    public String getPisNumeroLiq() {
        return pisNumeroLiq;
    }

    public void setPisNumeroLiq(String pisNumeroLiq) {
        this.pisNumeroLiq = pisNumeroLiq;
    }

    public String getSectorLiq() {
        return sectorLiq;
    }

    public void setSectorLiq(String sectorLiq) {
        this.sectorLiq = sectorLiq;
    }

    public BigDecimal getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(BigDecimal saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMedidaDetalle() {
        return medidaDetalle;
    }

    public void setMedidaDetalle(String medidaDetalle) {
        this.medidaDetalle = medidaDetalle;
    }

    public BigDecimal getParcialProducto() {
        return parcialProducto;
    }

    public void setParcialProducto(BigDecimal parcialProducto) {
        this.parcialProducto = parcialProducto;
    }

    public String getProCodigoPrincipalCopia() {
        return proCodigoPrincipalCopia;
    }

    public void setProCodigoPrincipalCopia(String proCodigoPrincipalCopia) {
        this.proCodigoPrincipalCopia = proCodigoPrincipalCopia;
    }

    public boolean isExigirSerie() {
        return exigirSerie;
    }

    public void setExigirSerie(boolean exigirSerie) {
        this.exigirSerie = exigirSerie;
    }

    public BigDecimal getParcialInicial() {
        return parcialInicial;
    }

    public void setParcialInicial(BigDecimal parcialInicial) {
        this.parcialInicial = parcialInicial;
    }

    public String getTallaCodigo() {
        return tallaCodigo;
    }

    public void setTallaCodigo(String tallaCodigo) {
        this.tallaCodigo = tallaCodigo;
    }

    public PrdEquipoControl getPrdEquipoControl() {
        return prdEquipoControl;
    }

    public void setPrdEquipoControl(PrdEquipoControl prdEquipoControl) {
        this.prdEquipoControl = prdEquipoControl;
    }

}
