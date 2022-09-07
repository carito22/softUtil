package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class InvProductoDAOTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "pro_empresa")
    private String proEmpresa;

    @Column(name = "pro_codigo_principal")
    private String proCodigoPrincipal;

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
    private BigDecimal proCantidad1;

    @Column(name = "pro_cantidad2")
    private BigDecimal proCantidad2;

    @Column(name = "pro_cantidad3")
    private BigDecimal proCantidad3;

    @Column(name = "pro_cantidad4")
    private BigDecimal proCantidad4;

    @Column(name = "pro_cantidad5")
    private BigDecimal proCantidad5;

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

    @Column(name = "pro_descuento1")
    private BigDecimal proDescuento1;

    @Column(name = "pro_descuento2")
    private BigDecimal proDescuento2;

    @Column(name = "pro_descuento3")
    private BigDecimal proDescuento3;

    @Column(name = "pro_descuento4")
    private BigDecimal proDescueno4;

    @Column(name = "pro_descuento5")
    private BigDecimal proDescuento5;

    @Column(name = "pro_margen_utilidad1")
    private BigDecimal proMargenUtilidad1;

    @Column(name = "pro_margen_utilidad2")
    private BigDecimal proMargenUtilidad2;

    @Column(name = "pro_margen_utilidad3")
    private BigDecimal proMargenUtilidad3;

    @Column(name = "pro_margen_utilidad4")
    private BigDecimal proMargenUtilidad4;

    @Column(name = "pro_margen_utilidad5")
    private BigDecimal proMargenUtilidad5;

    @Column(name = "pro_minimo")
    private Integer proMinimo;

    @Column(name = "pro_maximo")
    private Integer proMaximo;

    @Column(name = "pro_iva")
    private String proIva;

    @Column(name = "pro_credito_tributario")
    private String proCreditoTributario;

    @Column(name = "pro_exigir_serie")
    private Boolean proExigirSerie;

    @Column(name = "pro_inactivo")
    private Boolean proInactivo;

    @Column(name = "pro_cuenta_inventario")
    private String proCuentaInventario;

    @Column(name = "pro_cuenta_gasto")
    private String proCuentaGasto;

    @Column(name = "pro_cuenta_venta")
    private String proCuentaVenta;

    // categoria
    @Column(name = "cat_codigo")
    private String catCodigo;

    @Column(name = "cat_detalle")
    private String catDetalle;

    @Column(name = "cat_precio_fijo")
    private Boolean catPrecioFijo;

    @Column(name = "cat_activa")
    private Boolean catActiva;
    // marca
    @Column(name = "mar_codigo")
    private String marCodigo;

    @Column(name = "mar_detalle")
    private String marDetalle;

    @Column(name = "mar_abreviado")
    private String marAbreviado;

    // presentacion unidad
    @Column(name = "presu_codigo")
    private String presuCodigo;

    @Column(name = "presu_detalle")
    private String presuDetalle;

    @Column(name = "presu_abreviado")
    private String presuAbreviado;

    // presentacion caja
    @Column(name = "presc_codigo")
    private String prescCodigo;

    @Column(name = "presc_detalle")
    private String prescDetalle;

    @Column(name = "presc_abreviado")
    private String prescAbreviado;

    // tipo producto
    @Column(name = "tip_codigo")
    private String tipCodigo;

    @Column(name = "tip_tipo")
    private String tipTipo;

    @Column(name = "tip_detalle")
    private String tipDetalle;

    @Column(name = "tip_activo")
    private Boolean tipActivo;
    // medida
    @Column(name = "med_codigo")
    private String medCodigo;

    @Column(name = "med_detalle")
    private String medDetalle;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    // @Column(name = "med_detalle")
    private BigDecimal proFactorCajaSacoBulto;

    // @Column(name = "med_detalle")
    private String conCodigo;

    // @Column(name = "med_detalle")
    private String susCodigo;

    @Transient
    private Boolean existeProductoEnSistema;

    public InvProductoDAOTO() {
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

    public Boolean getCatActiva() {
        return catActiva;
    }

    public void setCatActiva(Boolean catActiva) {
        this.catActiva = catActiva;
    }

    public String getCatCodigo() {
        return catCodigo;
    }

    public void setCatCodigo(String catCodigo) {
        this.catCodigo = catCodigo;
    }

    public String getCatDetalle() {
        return catDetalle;
    }

    public void setCatDetalle(String catDetalle) {
        this.catDetalle = catDetalle;
    }

    public Boolean getCatPrecioFijo() {
        return catPrecioFijo;
    }

    public void setCatPrecioFijo(Boolean catPrecioFijo) {
        this.catPrecioFijo = catPrecioFijo;
    }

    public String getMarAbreviado() {
        return marAbreviado;
    }

    public void setMarAbreviado(String marAbreviado) {
        this.marAbreviado = marAbreviado;
    }

    public String getMarCodigo() {
        return marCodigo;
    }

    public void setMarCodigo(String marCodigo) {
        this.marCodigo = marCodigo;
    }

    public String getMarDetalle() {
        return marDetalle;
    }

    public void setMarDetalle(String marDetalle) {
        this.marDetalle = marDetalle;
    }

    public String getMedCodigo() {
        return medCodigo;
    }

    public void setMedCodigo(String medCodigo) {
        this.medCodigo = medCodigo;
    }

    public String getMedDetalle() {
        return medDetalle;
    }

    public void setMedDetalle(String medDetalle) {
        this.medDetalle = medDetalle;
    }

    public String getPrescAbreviado() {
        return prescAbreviado;
    }

    public void setPrescAbreviado(String prescAbreviado) {
        this.prescAbreviado = prescAbreviado;
    }

    public String getPrescCodigo() {
        return prescCodigo;
    }

    public void setPrescCodigo(String prescCodigo) {
        this.prescCodigo = prescCodigo;
    }

    public String getPrescDetalle() {
        return prescDetalle;
    }

    public void setPrescDetalle(String prescDetalle) {
        this.prescDetalle = prescDetalle;
    }

    public String getPresuAbreviado() {
        return presuAbreviado;
    }

    public void setPresuAbreviado(String presuAbreviado) {
        this.presuAbreviado = presuAbreviado;
    }

    public String getPresuCodigo() {
        return presuCodigo;
    }

    public void setPresuCodigo(String presuCodigo) {
        this.presuCodigo = presuCodigo;
    }

    public String getPresuDetalle() {
        return presuDetalle;
    }

    public void setPresuDetalle(String presuDetalle) {
        this.presuDetalle = presuDetalle;
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

    public String getProCodigoPrincipal() {
        return proCodigoPrincipal;
    }

    public void setProCodigoPrincipal(String proCodigoPrincipal) {
        this.proCodigoPrincipal = proCodigoPrincipal;
    }

    public String getProCreditoTributario() {
        return proCreditoTributario;
    }

    public void setProCreditoTributario(String proCreditoTributario) {
        this.proCreditoTributario = proCreditoTributario;
    }

    public String getProCuentaGasto() {
        return proCuentaGasto;
    }

    public void setProCuentaGasto(String proCuentaGasto) {
        this.proCuentaGasto = proCuentaGasto;
    }

    public String getProCuentaInventario() {
        return proCuentaInventario;
    }

    public void setProCuentaInventario(String proCuentaInventario) {
        this.proCuentaInventario = proCuentaInventario;
    }

    public String getProCuentaVenta() {
        return proCuentaVenta;
    }

    public void setProCuentaVenta(String proCuentaVenta) {
        this.proCuentaVenta = proCuentaVenta;
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
        return proDescueno4;
    }

    public void setProDescuento4(BigDecimal proDescuento4) {
        this.proDescueno4 = proDescuento4;
    }

    public BigDecimal getProDescuento5() {
        return proDescuento5;
    }

    public void setProDescuento5(BigDecimal proDescuento5) {
        this.proDescuento5 = proDescuento5;
    }

    public String getProDetalle() {
        return proDetalle;
    }

    public void setProDetalle(String proDetalle) {
        this.proDetalle = proDetalle;
    }

    public String getProEmpaque() {
        return proEmpaque;
    }

    public void setProEmpaque(String proEmpaque) {
        this.proEmpaque = proEmpaque;
    }

    public String getProEmpresa() {
        return proEmpresa;
    }

    public void setProEmpresa(String proEmpresa) {
        this.proEmpresa = proEmpresa;
    }

    public Boolean getProInactivo() {
        return proInactivo;
    }

    public void setProInactivo(Boolean proInactivo) {
        this.proInactivo = proInactivo;
    }

    public String getProIva() {
        return proIva;
    }

    public void setProIva(String proIva) {
        this.proIva = proIva;
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

    public Integer getProMaximo() {
        return proMaximo;
    }

    public void setProMaximo(Integer proMaximo) {
        this.proMaximo = proMaximo;
    }

    public Integer getProMinimo() {
        return proMinimo;
    }

    public void setProMinimo(Integer proMinimo) {
        this.proMinimo = proMinimo;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
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

    public Boolean getProExigirSerie() {
        return proExigirSerie;
    }

    public void setProExigirSerie(Boolean proExigirSerie) {
        this.proExigirSerie = proExigirSerie;
    }

    public Boolean getTipActivo() {
        return tipActivo;
    }

    public void setTipActivo(Boolean tipActivo) {
        this.tipActivo = tipActivo;
    }

    public String getTipCodigo() {
        return tipCodigo;
    }

    public void setTipCodigo(String tipCodigo) {
        this.tipCodigo = tipCodigo;
    }

    public String getTipDetalle() {
        return tipDetalle;
    }

    public void setTipDetalle(String tipDetalle) {
        this.tipDetalle = tipDetalle;
    }

    public String getTipTipo() {
        return tipTipo;
    }

    public void setTipTipo(String tipTipo) {
        this.tipTipo = tipTipo;
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

    public BigDecimal getProDescueno4() {
        return proDescueno4;
    }

    public void setProDescueno4(BigDecimal proDescueno4) {
        this.proDescueno4 = proDescueno4;
    }

    public Boolean getExisteProductoEnSistema() {
        return existeProductoEnSistema;
    }

    public void setExisteProductoEnSistema(Boolean existeProductoEnSistema) {
        this.existeProductoEnSistema = existeProductoEnSistema;
    }

}
