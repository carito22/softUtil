package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdEquipoControl;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "inv_compras_detalle", schema = "inventario")
public class InvComprasDetalle implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "det_secuencial")
    private Integer detSecuencial;
    @Column(name = "det_orden")
    private int detOrden;
    @Column(name = "det_pendiente")
    private boolean detPendiente;
    @Column(name = "det_confirmado")
    private boolean detConfirmado;
    @Column(name = "det_cantidad")
    private BigDecimal detCantidad;
    @Column(name = "det_precio")
    private BigDecimal detPrecio;
    @Column(name = "det_porcentaje_descuento")
    private BigDecimal detPorcentajeDescuento;

    @Column(name = "det_ice")
    private BigDecimal detIce;

    @Column(name = "det_otros_impuestos")
    private BigDecimal detOtrosImpuestos;
    @Column(name = "det_valor_promedio", insertable = false, updatable = false)
    private BigDecimal detValorPromedio;
    @Column(name = "det_valor_ultima_compra", insertable = false, updatable = false)
    private BigDecimal detValorUltimaCompra;
    @Column(name = "det_saldo", insertable = false, updatable = false)
    private BigDecimal detSaldo;
    @Column(name = "pro_credito_tributario")
    private String proCreditoTributario;
    ///////////////////
    @Column(name = "pro_precio1")
    private BigDecimal proPrecio1;
    @Column(name = "pro_precio2")
    private BigDecimal proPrecio2;
    @Column(name = "pro_precio3")
    private BigDecimal proPrecio3;
    @Column(name = "pro_precio4")
    private BigDecimal proPrecio4;
    @Column(name = "pro_precio5")
    private BigDecimal proPrecio5;
    /////////
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
    @JoinColumns({
        @JoinColumn(name = "pro_empresa", referencedColumnName = "pro_empresa")
        ,@JoinColumn(name = "pro_codigo_principal", referencedColumnName = "pro_codigo_principal")})
    @ManyToOne(optional = false)
    private InvProducto invProducto;
    @JoinColumns({
        @JoinColumn(name = "comp_empresa", referencedColumnName = "comp_empresa")
        ,@JoinColumn(name = "comp_periodo", referencedColumnName = "comp_periodo")
        ,@JoinColumn(name = "comp_motivo", referencedColumnName = "comp_motivo")
        ,@JoinColumn(name = "comp_numero", referencedColumnName = "comp_numero")})
    @ManyToOne(optional = false)
    private InvCompras invCompras;
    @JoinColumns({
        @JoinColumn(name = "bod_empresa", referencedColumnName = "bod_empresa")
        ,@JoinColumn(name = "bod_codigo", referencedColumnName = "bod_codigo")})
    @ManyToOne(optional = false)
    private InvBodega invBodega;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detSecuencialCompra")
    private List<InvComprasDetalleSeries> invComprasDetalleSeriesList;

    @JoinColumn(name = "det_secuencial_orden_compra", referencedColumnName = "det_secuencial_orden_compra")
    @ManyToOne(optional = true)
    private InvPedidosOrdenCompraDetalle invPedidosOrdenCompraDetalle;
    @Column(name = "det_observaciones")
    private String detObservaciones;

    @JoinColumns({
        @JoinColumn(name = "ec_empresa", referencedColumnName = "ec_empresa")
        ,
        @JoinColumn(name = "ec_codigo", referencedColumnName = "ec_codigo")})
    @ManyToOne(optional = true)
    private PrdEquipoControl prdEquipoControl;

    public InvComprasDetalle() {
    }

    public InvComprasDetalle(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvComprasDetalle(Integer detSecuencial, int detOrden, boolean detPendiente, boolean detConfirmado, String proCreditoTributario) {
        this.detSecuencial = detSecuencial;
        this.detOrden = detOrden;
        this.detPendiente = detPendiente;
        this.detConfirmado = detConfirmado;
        this.proCreditoTributario = proCreditoTributario;
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public int getDetOrden() {
        return detOrden;
    }

    public void setDetOrden(int detOrden) {
        this.detOrden = detOrden;
    }

    public boolean getDetPendiente() {
        return detPendiente;
    }

    public void setDetPendiente(boolean detPendiente) {
        this.detPendiente = detPendiente;
    }

    public boolean getDetConfirmado() {
        return detConfirmado;
    }

    public void setDetConfirmado(boolean detConfirmado) {
        this.detConfirmado = detConfirmado;
    }

    public BigDecimal getDetCantidad() {
        return detCantidad;
    }

    public void setDetCantidad(BigDecimal detCantidad) {
        this.detCantidad = detCantidad;
    }

    public BigDecimal getDetPrecio() {
        return detPrecio;
    }

    public void setDetPrecio(BigDecimal detPrecio) {
        this.detPrecio = detPrecio;
    }

    public BigDecimal getDetPorcentajeDescuento() {
        return detPorcentajeDescuento;
    }

    public void setDetPorcentajeDescuento(BigDecimal detPorcentajeDescuento) {
        this.detPorcentajeDescuento = detPorcentajeDescuento;
    }

    public BigDecimal getDetOtrosImpuestos() {
        return detOtrosImpuestos;
    }

    public void setDetOtrosImpuestos(BigDecimal detOtrosImpuestos) {
        this.detOtrosImpuestos = detOtrosImpuestos;
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

    public BigDecimal getDetSaldo() {
        return detSaldo;
    }

    public void setDetSaldo(BigDecimal detSaldo) {
        this.detSaldo = detSaldo;
    }

    public BigDecimal getDetIce() {
        return detIce;
    }

    public void setDetIce(BigDecimal detIce) {
        this.detIce = detIce;
    }

    public BigDecimal getProPrecio1() {
        return proPrecio1;
    }

    public void setProPrecio1(BigDecimal proPrecio1) {
        this.proPrecio1 = proPrecio1;
    }

    public BigDecimal getProPrecio2() {
        return proPrecio2;
    }

    public void setProPrecio2(BigDecimal proPrecio2) {
        this.proPrecio2 = proPrecio2;
    }

    public BigDecimal getProPrecio3() {
        return proPrecio3;
    }

    public void setProPrecio3(BigDecimal proPrecio3) {
        this.proPrecio3 = proPrecio3;
    }

    public BigDecimal getProPrecio4() {
        return proPrecio4;
    }

    public void setProPrecio4(BigDecimal proPrecio4) {
        this.proPrecio4 = proPrecio4;
    }

    public BigDecimal getProPrecio5() {
        return proPrecio5;
    }

    public void setProPrecio5(BigDecimal proPrecio5) {
        this.proPrecio5 = proPrecio5;
    }

    public String getProCreditoTributario() {
        return proCreditoTributario;
    }

    public void setProCreditoTributario(String proCreditoTributario) {
        this.proCreditoTributario = proCreditoTributario;
    }

    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getPisEmpresa() {
        return pisEmpresa;
    }

    public void setPisEmpresa(String pisEmpresa) {
        this.pisEmpresa = pisEmpresa;
    }

    public String getPisSector() {
        return pisSector;
    }

    public void setPisSector(String pisSector) {
        this.pisSector = pisSector;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    public InvProducto getInvProducto() {
        return invProducto;
    }

    public void setInvProducto(InvProducto invProducto) {
        this.invProducto = invProducto;
    }

    public InvCompras getInvCompras() {
        return invCompras;
    }

    public void setInvCompras(InvCompras invCompras) {
        this.invCompras = invCompras;
    }

    public InvBodega getInvBodega() {
        return invBodega;
    }

    public void setInvBodega(InvBodega invBodega) {
        this.invBodega = invBodega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detSecuencial != null ? detSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvComprasDetalle)) {
            return false;
        }
        InvComprasDetalle other = (InvComprasDetalle) object;
        if ((this.detSecuencial == null && other.detSecuencial != null)
                || (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvComprasDetalle[ detSecuencial=" + detSecuencial + " ]";
    }

    public List<InvComprasDetalleSeries> getInvComprasDetalleSeriesList() {
        return invComprasDetalleSeriesList;
    }

    public void setInvComprasDetalleSeriesList(List<InvComprasDetalleSeries> invComprasDetalleSeriesList) {
        this.invComprasDetalleSeriesList = invComprasDetalleSeriesList;
    }

    public InvPedidosOrdenCompraDetalle getInvPedidosOrdenCompraDetalle() {
        return invPedidosOrdenCompraDetalle;
    }

    public void setInvPedidosOrdenCompraDetalle(InvPedidosOrdenCompraDetalle invPedidosOrdenCompraDetalle) {
        this.invPedidosOrdenCompraDetalle = invPedidosOrdenCompraDetalle;
    }

    public String getDetObservaciones() {
        return detObservaciones;
    }

    public void setDetObservaciones(String detObservaciones) {
        this.detObservaciones = detObservaciones;
    }

    public PrdEquipoControl getPrdEquipoControl() {
        return prdEquipoControl;
    }

    public void setPrdEquipoControl(PrdEquipoControl prdEquipoControl) {
        this.prdEquipoControl = prdEquipoControl;
    }

}
