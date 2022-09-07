package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.Basic;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "inv_producto", schema = "inventario")
public class InvProducto implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_costo_referencial1")
    private BigDecimal proCostoReferencial1 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_costo_referencial2")
    private BigDecimal proCostoReferencial2 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_costo_referencial3")
    private BigDecimal proCostoReferencial3 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_costo_referencial4")
    private BigDecimal proCostoReferencial4 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_costo_referencial5")
    private BigDecimal proCostoReferencial5 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_cantidad6")
    private BigDecimal proCantidad6 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_cantidad7")
    private BigDecimal proCantidad7 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_cantidad8")
    private BigDecimal proCantidad8 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_cantidad9")
    private BigDecimal proCantidad9 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_cantidad10")
    private BigDecimal proCantidad10 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_cantidad11")
    private BigDecimal proCantidad11 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_cantidad12")
    private BigDecimal proCantidad12 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_cantidad13")
    private BigDecimal proCantidad13 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_cantidad14")
    private BigDecimal proCantidad14 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_cantidad15")
    private BigDecimal proCantidad15 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_cantidad16")
    private BigDecimal proCantidad16 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_precio6")
    private BigDecimal proPrecio6 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_precio7")
    private BigDecimal proPrecio7 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_precio8")
    private BigDecimal proPrecio8 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_precio9")
    private BigDecimal proPrecio9 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_precio10")
    private BigDecimal proPrecio10 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_precio11")
    private BigDecimal proPrecio11 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_precio12")
    private BigDecimal proPrecio12 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_precio13")
    private BigDecimal proPrecio13 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_precio14")
    private BigDecimal proPrecio14 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_precio15")
    private BigDecimal proPrecio15 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_precio16")
    private BigDecimal proPrecio16 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_descuento6")
    private BigDecimal proDescuento6 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_descuento7")
    private BigDecimal proDescuento7 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_descuento8")
    private BigDecimal proDescuento8 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_descuento9")
    private BigDecimal proDescuento9 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_descuento10")
    private BigDecimal proDescuento10 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_descuento11")
    private BigDecimal proDescuento11 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_descuento12")
    private BigDecimal proDescuento12 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_descuento13")
    private BigDecimal proDescuento13 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_descuento14")
    private BigDecimal proDescuento14 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_descuento15")
    private BigDecimal proDescuento15 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_descuento16")
    private BigDecimal proDescuento16 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_margen_utilidad6")
    private BigDecimal proMargenUtilidad6 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_margen_utilidad7")
    private BigDecimal proMargenUtilidad7 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_margen_utilidad8")
    private BigDecimal proMargenUtilidad8 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_margen_utilidad9")
    private BigDecimal proMargenUtilidad9 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_margen_utilidad10")
    private BigDecimal proMargenUtilidad10 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_margen_utilidad11")
    private BigDecimal proMargenUtilidad11 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_margen_utilidad12")
    private BigDecimal proMargenUtilidad12 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_margen_utilidad13")
    private BigDecimal proMargenUtilidad13 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_margen_utilidad14")
    private BigDecimal proMargenUtilidad14 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_margen_utilidad15")
    private BigDecimal proMargenUtilidad15 = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pro_margen_utilidad16")
    private BigDecimal proMargenUtilidad16 = BigDecimal.ZERO;

    @Column(name = "pro_minimo")
    private int proMinimo;
    @Column(name = "pro_maximo")
    private int proMaximo;
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected InvProductoPK invProductoPK;
    @Column(name = "pro_codigo_alterno")
    private String proCodigoAlterno;
    @Column(name = "pro_codigo_barra")
    private String proCodigoBarra;
    @Column(name = "pro_codigo_barra2")
    private String proCodigoBarra2;
    @Column(name = "pro_codigo_barra3")
    private String proCodigoBarra3;
    @Column(name = "pro_codigo_barra4")
    private String proCodigoBarra4;
    @Column(name = "pro_codigo_barra5")
    private String proCodigoBarra5;
    @Column(name = "pro_empaque")
    private String proEmpaque;
    @Column(name = "pro_nombre")
    private String proNombre;
    @Column(name = "pro_detalle")
    private String proDetalle;
    @Column(name = "pro_cantidad1")
    private BigDecimal proCantidad1 = BigDecimal.ZERO;
    @Column(name = "pro_cantidad2")
    private BigDecimal proCantidad2 = BigDecimal.ZERO;
    @Column(name = "pro_cantidad3")
    private BigDecimal proCantidad3 = BigDecimal.ZERO;
    @Column(name = "pro_cantidad4")
    private BigDecimal proCantidad4 = BigDecimal.ZERO;
    @Column(name = "pro_cantidad5")
    private BigDecimal proCantidad5 = BigDecimal.ZERO;
    @Column(name = "pro_precio1")
    private BigDecimal proPrecio1 = BigDecimal.ZERO;
    @Column(name = "pro_precio2")
    private BigDecimal proPrecio2 = BigDecimal.ZERO;
    @Column(name = "pro_precio3")
    private BigDecimal proPrecio3 = BigDecimal.ZERO;
    @Column(name = "pro_precio4")
    private BigDecimal proPrecio4 = BigDecimal.ZERO;
    @Column(name = "pro_precio5")
    private BigDecimal proPrecio5 = BigDecimal.ZERO;
    @Column(name = "pro_descuento1")
    private BigDecimal proDescuento1 = BigDecimal.ZERO;
    @Column(name = "pro_descuento2")
    private BigDecimal proDescuento2 = BigDecimal.ZERO;
    @Column(name = "pro_descuento3")
    private BigDecimal proDescuento3 = BigDecimal.ZERO;
    @Column(name = "pro_descuento4")
    private BigDecimal proDescuento4 = BigDecimal.ZERO;
    @Column(name = "pro_descuento5")
    private BigDecimal proDescuento5 = BigDecimal.ZERO;
    @Column(name = "pro_margen_utilidad1")
    private BigDecimal proMargenUtilidad1 = BigDecimal.ZERO;
    @Column(name = "pro_margen_utilidad2")
    private BigDecimal proMargenUtilidad2 = BigDecimal.ZERO;
    @Column(name = "pro_margen_utilidad3")
    private BigDecimal proMargenUtilidad3 = BigDecimal.ZERO;
    @Column(name = "pro_margen_utilidad4")
    private BigDecimal proMargenUtilidad4 = BigDecimal.ZERO;
    @Column(name = "pro_margen_utilidad5")
    private BigDecimal proMargenUtilidad5 = BigDecimal.ZERO;
    @Column(name = "pro_iva")
    private String proIva;
    @Column(name = "pro_ice")
    private String proIce;
    @Column(name = "pro_credito_tributario")
    private String proCreditoTributario;
    @Column(name = "pro_exigir_serie")
    private boolean proExigirSerie;
    @Column(name = "pro_inactivo")
    private boolean proInactivo;
    @Column(name = "pro_cuenta_empresa")
    private String proCuentaEmpresa;
    @Column(name = "pro_cuenta_inventario")
    private String proCuentaInventario;
    @Column(name = "pro_cuenta_gasto")
    private String proCuentaGasto;
    @Column(name = "pro_cuenta_venta")
    private String proCuentaVenta;
    @Column(name = "con_codigo")
    private String conCodigo;
    @Column(name = "sus_codigo")
    private String susCodigo;
    @Column(name = "pro_factor_caja_saco_bulto")
    private BigDecimal proFactorCajaSacoBulto = BigDecimal.ZERO;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @JoinColumns({
        @JoinColumn(name = "tip_empresa", referencedColumnName = "tip_empresa")
        ,
        @JoinColumn(name = "tip_codigo", referencedColumnName = "tip_codigo")})
    @ManyToOne(optional = false)
    private InvProductoTipo invProductoTipo;
    @JoinColumns({
        @JoinColumn(name = "presu_empresa", referencedColumnName = "presu_empresa")
        ,
        @JoinColumn(name = "presu_codigo", referencedColumnName = "presu_codigo")})
    @ManyToOne(optional = true)
    private InvProductoPresentacionUnidades invProductoPresentacionUnidades;
    @JoinColumns({
        @JoinColumn(name = "presc_empresa", referencedColumnName = "presc_empresa")
        ,
        @JoinColumn(name = "presc_codigo", referencedColumnName = "presc_codigo")})
    @ManyToOne(optional = true)
    private InvProductoPresentacionCajas invProductoPresentacionCajas;
    @JoinColumns({
        @JoinColumn(name = "med_empresa", referencedColumnName = "med_empresa")
        ,
        @JoinColumn(name = "med_codigo", referencedColumnName = "med_codigo")})
    @ManyToOne(optional = false)
    private InvProductoMedida invProductoMedida;
    @JoinColumns({
        @JoinColumn(name = "mar_empresa", referencedColumnName = "mar_empresa")
        ,
        @JoinColumn(name = "mar_codigo", referencedColumnName = "mar_codigo")})
    @ManyToOne(optional = true)
    private InvProductoMarca invProductoMarca;
    @JoinColumns({
        @JoinColumn(name = "cat_empresa", referencedColumnName = "cat_empresa")
        ,
        @JoinColumn(name = "cat_codigo", referencedColumnName = "cat_codigo")})
    @ManyToOne(optional = false)
    private InvProductoCategoria invProductoCategoria;

    @Column(name = "pro_especificaciones")
    private String proEspecificaciones;

    @Column(name = "pro_replicar")
    private boolean proReplicar;

    @Column(name = "pro_ecommerce")
    private boolean proEcommerce;

    @Column(name = "pro_incluir_webshop")
    private Integer proIncluirWebshop;

    @Transient
    private String proCuentaCostoAutomatico;

    @Column(name = "pro_cuenta_venta_exterior")
    private String proCuentaVentaExterior;
    
    @Column(name = "pro_cuenta_transferencia_ipp")
    private String proCuentaTransferenciaIpp;

    public InvProducto() {
    }

    public InvProducto(InvProductoPK invProductoPK) {
        this.invProductoPK = invProductoPK;
    }

    public InvProducto(InvProductoPK invProductoPK, String proNombre, BigDecimal proCantidad1, BigDecimal proCantidad2,
            BigDecimal proCantidad3, BigDecimal proCantidad4, BigDecimal proCantidad5, BigDecimal proPrecio1,
            BigDecimal proPrecio2, BigDecimal proPrecio3, BigDecimal proPrecio4, BigDecimal proPrecio5,
            BigDecimal proDescuento1, BigDecimal proDescuento2, BigDecimal proDescuento3, BigDecimal proDescuento4,
            BigDecimal proDescuento5, BigDecimal proMargenUtilidad1, BigDecimal proMargenUtilidad2,
            BigDecimal proMargenUtilidad3, BigDecimal proMargenUtilidad4, BigDecimal proMargenUtilidad5, String proIva,
            String proCreditoTributario, boolean proExigirSerie, boolean proInactivo, String usrEmpresa,
            String usrCodigo, Date usrFechaInserta) {
        this.invProductoPK = invProductoPK;
        this.proNombre = proNombre;
        this.proCantidad1 = proCantidad1;
        this.proCantidad2 = proCantidad2;
        this.proCantidad3 = proCantidad3;
        this.proCantidad4 = proCantidad4;
        this.proCantidad5 = proCantidad5;
        this.proPrecio1 = proPrecio1;
        this.proPrecio2 = proPrecio2;
        this.proPrecio3 = proPrecio3;
        this.proPrecio4 = proPrecio4;
        this.proPrecio5 = proPrecio5;
        this.proDescuento1 = proDescuento1;
        this.proDescuento2 = proDescuento2;
        this.proDescuento3 = proDescuento3;
        this.proDescuento4 = proDescuento4;
        this.proDescuento5 = proDescuento5;
        this.proMargenUtilidad1 = proMargenUtilidad1;
        this.proMargenUtilidad2 = proMargenUtilidad2;
        this.proMargenUtilidad3 = proMargenUtilidad3;
        this.proMargenUtilidad4 = proMargenUtilidad4;
        this.proMargenUtilidad5 = proMargenUtilidad5;
        this.proIva = proIva;
        this.proCreditoTributario = proCreditoTributario;
        this.proExigirSerie = proExigirSerie;
        this.proInactivo = proInactivo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvProducto(String proEmpresa, String proCodigoPrincipal) {
        this.invProductoPK = new InvProductoPK(proEmpresa, proCodigoPrincipal);
    }

    public InvProductoPK getInvProductoPK() {
        return invProductoPK;
    }

    public void setInvProductoPK(InvProductoPK invProductoPK) {
        this.invProductoPK = invProductoPK;
    }

    public String getProCodigoAlterno() {
        return proCodigoAlterno;
    }

    public void setProCodigoAlterno(String proCodigoAlterno) {
        this.proCodigoAlterno = proCodigoAlterno;
    }

    public String getProCodigoBarra() {
        return proCodigoBarra;
    }

    public void setProCodigoBarra(String proCodigoBarra) {
        this.proCodigoBarra = proCodigoBarra;
    }

    public String getProCodigoBarra2() {
        return proCodigoBarra2;
    }

    public void setProCodigoBarra2(String proCodigoBarra2) {
        this.proCodigoBarra2 = proCodigoBarra2;
    }

    public String getProCodigoBarra3() {
        return proCodigoBarra3;
    }

    public void setProCodigoBarra3(String proCodigoBarra3) {
        this.proCodigoBarra3 = proCodigoBarra3;
    }

    public String getProCodigoBarra4() {
        return proCodigoBarra4;
    }

    public void setProCodigoBarra4(String proCodigoBarra4) {
        this.proCodigoBarra4 = proCodigoBarra4;
    }

    public String getProCodigoBarra5() {
        return proCodigoBarra5;
    }

    public void setProCodigoBarra5(String proCodigoBarra5) {
        this.proCodigoBarra5 = proCodigoBarra5;
    }

    public String getProEmpaque() {
        return proEmpaque;
    }

    public void setProEmpaque(String proEmpaque) {
        this.proEmpaque = proEmpaque;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    public String getProDetalle() {
        return proDetalle;
    }

    public void setProDetalle(String proDetalle) {
        this.proDetalle = proDetalle;
    }

    public BigDecimal getProCantidad1() {
        return proCantidad1;
    }

    public void setProCantidad1(BigDecimal proCantidad1) {
        this.proCantidad1 = proCantidad1;
    }

    public BigDecimal getProCantidad2() {
        return proCantidad2;
    }

    public void setProCantidad2(BigDecimal proCantidad2) {
        this.proCantidad2 = proCantidad2;
    }

    public BigDecimal getProCantidad3() {
        return proCantidad3;
    }

    public void setProCantidad3(BigDecimal proCantidad3) {
        this.proCantidad3 = proCantidad3;
    }

    public BigDecimal getProCantidad4() {
        return proCantidad4;
    }

    public void setProCantidad4(BigDecimal proCantidad4) {
        this.proCantidad4 = proCantidad4;
    }

    public BigDecimal getProCantidad5() {
        return proCantidad5;
    }

    public void setProCantidad5(BigDecimal proCantidad5) {
        this.proCantidad5 = proCantidad5;
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

    public BigDecimal getProDescuento1() {
        return proDescuento1;
    }

    public void setProDescuento1(BigDecimal proDescuento1) {
        this.proDescuento1 = proDescuento1;
    }

    public BigDecimal getProDescuento2() {
        return proDescuento2;
    }

    public void setProDescuento2(BigDecimal proDescuento2) {
        this.proDescuento2 = proDescuento2;
    }

    public BigDecimal getProDescuento3() {
        return proDescuento3;
    }

    public void setProDescuento3(BigDecimal proDescuento3) {
        this.proDescuento3 = proDescuento3;
    }

    public BigDecimal getProDescuento4() {
        return proDescuento4;
    }

    public void setProDescuento4(BigDecimal proDescuento4) {
        this.proDescuento4 = proDescuento4;
    }

    public BigDecimal getProDescuento5() {
        return proDescuento5;
    }

    public void setProDescuento5(BigDecimal proDescuento5) {
        this.proDescuento5 = proDescuento5;
    }

    public BigDecimal getProMargenUtilidad1() {
        return proMargenUtilidad1;
    }

    public void setProMargenUtilidad1(BigDecimal proMargenUtilidad1) {
        this.proMargenUtilidad1 = proMargenUtilidad1;
    }

    public BigDecimal getProMargenUtilidad2() {
        return proMargenUtilidad2;
    }

    public void setProMargenUtilidad2(BigDecimal proMargenUtilidad2) {
        this.proMargenUtilidad2 = proMargenUtilidad2;
    }

    public BigDecimal getProMargenUtilidad3() {
        return proMargenUtilidad3;
    }

    public void setProMargenUtilidad3(BigDecimal proMargenUtilidad3) {
        this.proMargenUtilidad3 = proMargenUtilidad3;
    }

    public BigDecimal getProMargenUtilidad4() {
        return proMargenUtilidad4;
    }

    public void setProMargenUtilidad4(BigDecimal proMargenUtilidad4) {
        this.proMargenUtilidad4 = proMargenUtilidad4;
    }

    public BigDecimal getProMargenUtilidad5() {
        return proMargenUtilidad5;
    }

    public void setProMargenUtilidad5(BigDecimal proMargenUtilidad5) {
        this.proMargenUtilidad5 = proMargenUtilidad5;
    }

    public String getProIva() {
        return proIva;
    }

    public void setProIva(String proIva) {
        this.proIva = proIva;
    }

    public String getProCreditoTributario() {
        return proCreditoTributario;
    }

    public void setProCreditoTributario(String proCreditoTributario) {
        this.proCreditoTributario = proCreditoTributario;
    }

    public boolean isProExigirSerie() {
        return proExigirSerie;
    }

    public void setProExigirSerie(boolean proExigirSerie) {
        this.proExigirSerie = proExigirSerie;
    }

    public boolean getProInactivo() {
        return proInactivo;
    }

    public void setProInactivo(boolean proInactivo) {
        this.proInactivo = proInactivo;
    }

    public String getProCuentaEmpresa() {
        return proCuentaEmpresa;
    }

    public void setProCuentaEmpresa(String proCuentaEmpresa) {
        this.proCuentaEmpresa = proCuentaEmpresa;
    }

    public String getProCuentaInventario() {
        return proCuentaInventario;
    }

    public void setProCuentaInventario(String proCuentaInventario) {
        this.proCuentaInventario = proCuentaInventario;
    }

    public String getProCuentaGasto() {
        return proCuentaGasto;
    }

    public void setProCuentaGasto(String proCuentaGasto) {
        this.proCuentaGasto = proCuentaGasto;
    }

    public String getProCuentaVenta() {
        return proCuentaVenta;
    }

    public void setProCuentaVenta(String proCuentaVenta) {
        this.proCuentaVenta = proCuentaVenta;
    }

    public String getConCodigo() {
        return conCodigo;
    }

    public void setConCodigo(String conCodigo) {
        this.conCodigo = conCodigo;
    }

    public String getSusCodigo() {
        return susCodigo;
    }

    public void setSusCodigo(String susCodigo) {
        this.susCodigo = susCodigo;
    }

    public BigDecimal getProFactorCajaSacoBulto() {
        return proFactorCajaSacoBulto;
    }

    public void setProFactorCajaSacoBulto(BigDecimal proFactorCajaSacoBulto) {
        this.proFactorCajaSacoBulto = proFactorCajaSacoBulto;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvProductoTipo getInvProductoTipo() {
        return invProductoTipo;
    }

    public void setInvProductoTipo(InvProductoTipo invProductoTipo) {
        this.invProductoTipo = invProductoTipo;
    }

    public InvProductoPresentacionUnidades getInvProductoPresentacionUnidades() {
        return invProductoPresentacionUnidades;
    }

    public void setInvProductoPresentacionUnidades(InvProductoPresentacionUnidades invProductoPresentacionUnidades) {
        this.invProductoPresentacionUnidades = invProductoPresentacionUnidades;
    }

    public InvProductoPresentacionCajas getInvProductoPresentacionCajas() {
        return invProductoPresentacionCajas;
    }

    public void setInvProductoPresentacionCajas(InvProductoPresentacionCajas invProductoPresentacionCajas) {
        this.invProductoPresentacionCajas = invProductoPresentacionCajas;
    }

    public InvProductoMedida getInvProductoMedida() {
        return invProductoMedida;
    }

    public void setInvProductoMedida(InvProductoMedida invProductoMedida) {
        this.invProductoMedida = invProductoMedida;
    }

    public InvProductoMarca getInvProductoMarca() {
        return invProductoMarca;
    }

    public void setInvProductoMarca(InvProductoMarca invProductoMarca) {
        this.invProductoMarca = invProductoMarca;
    }

    public InvProductoCategoria getInvProductoCategoria() {
        return invProductoCategoria;
    }

    public void setInvProductoCategoria(InvProductoCategoria invProductoCategoria) {
        this.invProductoCategoria = invProductoCategoria;
    }

    public int getProMinimo() {
        return proMinimo;
    }

    public void setProMinimo(int proMinimo) {
        this.proMinimo = proMinimo;
    }

    public int getProMaximo() {
        return proMaximo;
    }

    public void setProMaximo(int proMaximo) {
        this.proMaximo = proMaximo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invProductoPK != null ? invProductoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvProducto)) {
            return false;
        }
        InvProducto other = (InvProducto) object;
        if ((this.invProductoPK == null && other.invProductoPK != null)
                || (this.invProductoPK != null && !this.invProductoPK.equals(other.invProductoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvProducto[ invProductoPK=" + invProductoPK + " ]";
    }

    public BigDecimal getProCostoReferencial1() {
        return proCostoReferencial1;
    }

    public void setProCostoReferencial1(BigDecimal proCostoReferencial1) {
        this.proCostoReferencial1 = proCostoReferencial1;
    }

    public BigDecimal getProCostoReferencial2() {
        return proCostoReferencial2;
    }

    public void setProCostoReferencial2(BigDecimal proCostoReferencial2) {
        this.proCostoReferencial2 = proCostoReferencial2;
    }

    public BigDecimal getProCostoReferencial3() {
        return proCostoReferencial3;
    }

    public void setProCostoReferencial3(BigDecimal proCostoReferencial3) {
        this.proCostoReferencial3 = proCostoReferencial3;
    }

    public BigDecimal getProCantidad6() {
        return proCantidad6;
    }

    public void setProCantidad6(BigDecimal proCantidad6) {
        this.proCantidad6 = proCantidad6;
    }

    public BigDecimal getProCantidad7() {
        return proCantidad7;
    }

    public void setProCantidad7(BigDecimal proCantidad7) {
        this.proCantidad7 = proCantidad7;
    }

    public BigDecimal getProCantidad8() {
        return proCantidad8;
    }

    public void setProCantidad8(BigDecimal proCantidad8) {
        this.proCantidad8 = proCantidad8;
    }

    public BigDecimal getProCantidad9() {
        return proCantidad9;
    }

    public void setProCantidad9(BigDecimal proCantidad9) {
        this.proCantidad9 = proCantidad9;
    }

    public BigDecimal getProCantidad10() {
        return proCantidad10;
    }

    public void setProCantidad10(BigDecimal proCantidad10) {
        this.proCantidad10 = proCantidad10;
    }

    public BigDecimal getProCantidad11() {
        return proCantidad11;
    }

    public void setProCantidad11(BigDecimal proCantidad11) {
        this.proCantidad11 = proCantidad11;
    }

    public BigDecimal getProCantidad12() {
        return proCantidad12;
    }

    public void setProCantidad12(BigDecimal proCantidad12) {
        this.proCantidad12 = proCantidad12;
    }

    public BigDecimal getProCantidad13() {
        return proCantidad13;
    }

    public void setProCantidad13(BigDecimal proCantidad13) {
        this.proCantidad13 = proCantidad13;
    }

    public BigDecimal getProCantidad14() {
        return proCantidad14;
    }

    public void setProCantidad14(BigDecimal proCantidad14) {
        this.proCantidad14 = proCantidad14;
    }

    public BigDecimal getProCantidad15() {
        return proCantidad15;
    }

    public void setProCantidad15(BigDecimal proCantidad15) {
        this.proCantidad15 = proCantidad15;
    }

    public BigDecimal getProCantidad16() {
        return proCantidad16;
    }

    public void setProCantidad16(BigDecimal proCantidad16) {
        this.proCantidad16 = proCantidad16;
    }

    public BigDecimal getProPrecio6() {
        return proPrecio6;
    }

    public void setProPrecio6(BigDecimal proPrecio6) {
        this.proPrecio6 = proPrecio6;
    }

    public BigDecimal getProPrecio7() {
        return proPrecio7;
    }

    public void setProPrecio7(BigDecimal proPrecio7) {
        this.proPrecio7 = proPrecio7;
    }

    public BigDecimal getProPrecio8() {
        return proPrecio8;
    }

    public void setProPrecio8(BigDecimal proPrecio8) {
        this.proPrecio8 = proPrecio8;
    }

    public BigDecimal getProPrecio9() {
        return proPrecio9;
    }

    public void setProPrecio9(BigDecimal proPrecio9) {
        this.proPrecio9 = proPrecio9;
    }

    public BigDecimal getProPrecio10() {
        return proPrecio10;
    }

    public void setProPrecio10(BigDecimal proPrecio10) {
        this.proPrecio10 = proPrecio10;
    }

    public BigDecimal getProPrecio11() {
        return proPrecio11;
    }

    public void setProPrecio11(BigDecimal proPrecio11) {
        this.proPrecio11 = proPrecio11;
    }

    public BigDecimal getProPrecio12() {
        return proPrecio12;
    }

    public void setProPrecio12(BigDecimal proPrecio12) {
        this.proPrecio12 = proPrecio12;
    }

    public BigDecimal getProPrecio13() {
        return proPrecio13;
    }

    public void setProPrecio13(BigDecimal proPrecio13) {
        this.proPrecio13 = proPrecio13;
    }

    public BigDecimal getProPrecio14() {
        return proPrecio14;
    }

    public void setProPrecio14(BigDecimal proPrecio14) {
        this.proPrecio14 = proPrecio14;
    }

    public BigDecimal getProPrecio15() {
        return proPrecio15;
    }

    public void setProPrecio15(BigDecimal proPrecio15) {
        this.proPrecio15 = proPrecio15;
    }

    public BigDecimal getProPrecio16() {
        return proPrecio16;
    }

    public void setProPrecio16(BigDecimal proPrecio16) {
        this.proPrecio16 = proPrecio16;
    }

    public BigDecimal getProDescuento6() {
        return proDescuento6;
    }

    public void setProDescuento6(BigDecimal proDescuento6) {
        this.proDescuento6 = proDescuento6;
    }

    public BigDecimal getProDescuento7() {
        return proDescuento7;
    }

    public void setProDescuento7(BigDecimal proDescuento7) {
        this.proDescuento7 = proDescuento7;
    }

    public BigDecimal getProDescuento8() {
        return proDescuento8;
    }

    public void setProDescuento8(BigDecimal proDescuento8) {
        this.proDescuento8 = proDescuento8;
    }

    public BigDecimal getProDescuento9() {
        return proDescuento9;
    }

    public void setProDescuento9(BigDecimal proDescuento9) {
        this.proDescuento9 = proDescuento9;
    }

    public BigDecimal getProDescuento10() {
        return proDescuento10;
    }

    public void setProDescuento10(BigDecimal proDescuento10) {
        this.proDescuento10 = proDescuento10;
    }

    public BigDecimal getProDescuento11() {
        return proDescuento11;
    }

    public void setProDescuento11(BigDecimal proDescuento11) {
        this.proDescuento11 = proDescuento11;
    }

    public BigDecimal getProDescuento12() {
        return proDescuento12;
    }

    public void setProDescuento12(BigDecimal proDescuento12) {
        this.proDescuento12 = proDescuento12;
    }

    public BigDecimal getProDescuento13() {
        return proDescuento13;
    }

    public void setProDescuento13(BigDecimal proDescuento13) {
        this.proDescuento13 = proDescuento13;
    }

    public BigDecimal getProDescuento14() {
        return proDescuento14;
    }

    public void setProDescuento14(BigDecimal proDescuento14) {
        this.proDescuento14 = proDescuento14;
    }

    public BigDecimal getProDescuento15() {
        return proDescuento15;
    }

    public void setProDescuento15(BigDecimal proDescuento15) {
        this.proDescuento15 = proDescuento15;
    }

    public BigDecimal getProDescuento16() {
        return proDescuento16;
    }

    public void setProDescuento16(BigDecimal proDescuento16) {
        this.proDescuento16 = proDescuento16;
    }

    public BigDecimal getProMargenUtilidad6() {
        return proMargenUtilidad6;
    }

    public void setProMargenUtilidad6(BigDecimal proMargenUtilidad6) {
        this.proMargenUtilidad6 = proMargenUtilidad6;
    }

    public BigDecimal getProMargenUtilidad7() {
        return proMargenUtilidad7;
    }

    public void setProMargenUtilidad7(BigDecimal proMargenUtilidad7) {
        this.proMargenUtilidad7 = proMargenUtilidad7;
    }

    public BigDecimal getProMargenUtilidad8() {
        return proMargenUtilidad8;
    }

    public void setProMargenUtilidad8(BigDecimal proMargenUtilidad8) {
        this.proMargenUtilidad8 = proMargenUtilidad8;
    }

    public BigDecimal getProMargenUtilidad9() {
        return proMargenUtilidad9;
    }

    public void setProMargenUtilidad9(BigDecimal proMargenUtilidad9) {
        this.proMargenUtilidad9 = proMargenUtilidad9;
    }

    public BigDecimal getProMargenUtilidad10() {
        return proMargenUtilidad10;
    }

    public void setProMargenUtilidad10(BigDecimal proMargenUtilidad10) {
        this.proMargenUtilidad10 = proMargenUtilidad10;
    }

    public BigDecimal getProMargenUtilidad11() {
        return proMargenUtilidad11;
    }

    public void setProMargenUtilidad11(BigDecimal proMargenUtilidad11) {
        this.proMargenUtilidad11 = proMargenUtilidad11;
    }

    public BigDecimal getProMargenUtilidad12() {
        return proMargenUtilidad12;
    }

    public void setProMargenUtilidad12(BigDecimal proMargenUtilidad12) {
        this.proMargenUtilidad12 = proMargenUtilidad12;
    }

    public BigDecimal getProMargenUtilidad13() {
        return proMargenUtilidad13;
    }

    public void setProMargenUtilidad13(BigDecimal proMargenUtilidad13) {
        this.proMargenUtilidad13 = proMargenUtilidad13;
    }

    public BigDecimal getProMargenUtilidad14() {
        return proMargenUtilidad14;
    }

    public void setProMargenUtilidad14(BigDecimal proMargenUtilidad14) {
        this.proMargenUtilidad14 = proMargenUtilidad14;
    }

    public BigDecimal getProMargenUtilidad15() {
        return proMargenUtilidad15;
    }

    public void setProMargenUtilidad15(BigDecimal proMargenUtilidad15) {
        this.proMargenUtilidad15 = proMargenUtilidad15;
    }

    public BigDecimal getProMargenUtilidad16() {
        return proMargenUtilidad16;
    }

    public void setProMargenUtilidad16(BigDecimal proMargenUtilidad16) {
        this.proMargenUtilidad16 = proMargenUtilidad16;
    }

    public BigDecimal getProCostoReferencial4() {
        return proCostoReferencial4;
    }

    public void setProCostoReferencial4(BigDecimal proCostoReferencial4) {
        this.proCostoReferencial4 = proCostoReferencial4;
    }

    public BigDecimal getProCostoReferencial5() {
        return proCostoReferencial5;
    }

    public void setProCostoReferencial5(BigDecimal proCostoReferencial5) {
        this.proCostoReferencial5 = proCostoReferencial5;
    }

    public String getProEspecificaciones() {
        return proEspecificaciones;
    }

    public void setProEspecificaciones(String proEspecificaciones) {
        this.proEspecificaciones = proEspecificaciones;
    }

    public boolean isProReplicar() {
        return proReplicar;
    }

    public void setProReplicar(boolean proReplicar) {
        this.proReplicar = proReplicar;
    }

    public boolean isProEcommerce() {
        return proEcommerce;
    }

    public void setProEcommerce(boolean proEcommerce) {
        this.proEcommerce = proEcommerce;
    }

    public String getProIce() {
        return proIce;
    }

    public void setProIce(String proIce) {
        this.proIce = proIce;
    }

    public Integer getProIncluirWebshop() {
        return proIncluirWebshop;
    }

    public void setProIncluirWebshop(Integer proIncluirWebshop) {
        this.proIncluirWebshop = proIncluirWebshop;
    }

    public String getProCuentaCostoAutomatico() {
        return proCuentaCostoAutomatico;
    }

    public void setProCuentaCostoAutomatico(String proCuentaCostoAutomatico) {
        this.proCuentaCostoAutomatico = proCuentaCostoAutomatico;
    }

    public String getProCuentaVentaExterior() {
        return proCuentaVentaExterior;
    }

    public void setProCuentaVentaExterior(String proCuentaVentaExterior) {
        this.proCuentaVentaExterior = proCuentaVentaExterior;
    }

    public String getProCuentaTransferenciaIpp() {
        return proCuentaTransferenciaIpp;
    }

    public void setProCuentaTransferenciaIpp(String proCuentaTransferenciaIpp) {
        this.proCuentaTransferenciaIpp = proCuentaTransferenciaIpp;
    }

}
