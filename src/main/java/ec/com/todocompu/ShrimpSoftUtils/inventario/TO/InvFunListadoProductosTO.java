/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvFunListadoProductosTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "prd_codigo_principal")
    private String prdCodigoPrincipal;

    @Column(name = "prd_codigo_alterno")
    private String prdCodigoAlterno;

    @Column(name = "prd_codigo_barra")
    private String prdCodigoBarra;

    @Column(name = "prd_nombre")
    private String prdNombre;

    @Column(name = "prd_detalle")
    private String prdDetalle;

    @Column(name = "prd_medida")
    private String prdMedida;

    @Column(name = "prd_marca")
    private String prdMarca;

    @Column(name = "prd_categoria")
    private String prdCategoria;

    @Column(name = "prd_precio1")
    private java.math.BigDecimal prdPrecio1;

    @Column(name = "prd_precio2")
    private java.math.BigDecimal prdPrecio2;

    @Column(name = "prd_precio3")
    private java.math.BigDecimal prdPrecio3;

    @Column(name = "prd_precio4")
    private java.math.BigDecimal prdPrecio4;

    @Column(name = "prd_precio5")
    private java.math.BigDecimal prdPrecio5;

    @Column(name = "prd_minimo")
    private Integer prdMinimo;

    @Column(name = "prd_maximo")
    private Integer prdMaximo;

    @Column(name = "prd_tipo")
    private String prdTipo;

    @Column(name = "prd_cuenta_inventario")
    private String prdCuentaInventario;

    @Column(name = "prd_nombre_inventario")
    private String prdNombreInventario;

    @Column(name = "prd_cuenta_gasto")
    private String prdCuentaGasto;

    @Column(name = "prd_nombre_gasto")
    private String prdNombreGasto;

    @Column(name = "prd_cuenta_venta")
    private String prdCuentaVenta;

    @Column(name = "prd_nombre_venta")
    private String prdNombreVenta;

    @Column(name = "prd_iva")
    private String prdIva;

    @Column(name = "pro_credito_tributario")
    private String prdCreditoTributario;

    @Column(name = "pro_exigir_serie")
    private Boolean prdStockNegativo;

    @Column(name = "prd_inactivo")
    private Boolean prdInactivo;

    @Column(name = "pro_imagenes")
    private Boolean tieneImagenes;

    @Column(name = "pro_ecommerce")
    private Boolean proEcommerce;

    public InvFunListadoProductosTO() {
    }

    public InvFunListadoProductosTO(String prdCodigoPrincipal, String prdCodigoAlterno, String prdCodigoBarra,
            String prdNombre, String prdDetalle, String prdMedida, String prdMarca, String prdCategoria,
            BigDecimal prdPrecio1, BigDecimal prdPrecio2, BigDecimal prdPrecio3, BigDecimal prdPrecio4,
            BigDecimal prdPrecio5, Integer prdMinimo, Integer prdMaximo, String prdTipo, String prdCuentaInventario,
            String prdNombreInventario, String prdCuentaGasto, String prdNombreGasto, String prdCuentaVenta,
            String prdNombreVenta,
            // Boolean prdIva,
            String prdIva, String prdCreditoTributario, Boolean prdStockNegativo, Boolean prdInactivo, Integer id) {
        this.prdCodigoPrincipal = prdCodigoPrincipal;
        this.prdCodigoAlterno = prdCodigoAlterno;
        this.prdCodigoBarra = prdCodigoBarra;
        this.prdNombre = prdNombre;
        this.prdDetalle = prdDetalle;
        this.prdMedida = prdMedida;
        this.prdMarca = prdMarca;
        this.prdCategoria = prdCategoria;
        this.prdPrecio1 = prdPrecio1;
        this.prdPrecio2 = prdPrecio2;
        this.prdPrecio3 = prdPrecio3;
        this.prdPrecio4 = prdPrecio4;
        this.prdPrecio5 = prdPrecio5;
        this.prdMinimo = prdMinimo;
        this.prdMaximo = prdMaximo;
        this.prdTipo = prdTipo;
        this.prdCuentaInventario = prdCuentaInventario;
        this.prdNombreInventario = prdNombreInventario;
        this.prdCuentaGasto = prdCuentaGasto;
        this.prdNombreGasto = prdNombreGasto;
        this.prdCuentaVenta = prdCuentaVenta;
        this.prdNombreVenta = prdNombreVenta;
        this.prdIva = prdIva;
        this.prdCreditoTributario = prdCreditoTributario;
        this.prdStockNegativo = prdStockNegativo;
        this.prdInactivo = prdInactivo;
        this.id = id;
    }

    public String getPrdCategoria() {
        return prdCategoria;
    }

    public void setPrdCategoria(String prdCategoria) {
        this.prdCategoria = prdCategoria;
    }

    public String getPrdCodigoAlterno() {
        return prdCodigoAlterno;
    }

    public void setPrdCodigoAlterno(String prdCodigoAlterno) {
        this.prdCodigoAlterno = prdCodigoAlterno;
    }

    public String getPrdCodigoBarra() {
        return prdCodigoBarra;
    }

    public void setPrdCodigoBarra(String prdCodigoBarra) {
        this.prdCodigoBarra = prdCodigoBarra;
    }

    public String getPrdCodigoPrincipal() {
        return prdCodigoPrincipal;
    }

    public void setPrdCodigoPrincipal(String prdCodigoPrincipal) {
        this.prdCodigoPrincipal = prdCodigoPrincipal;
    }

    public String getPrdCreditoTributario() {
        return prdCreditoTributario;
    }

    public void setPrdCreditoTributario(String prdCreditoTributario) {
        this.prdCreditoTributario = prdCreditoTributario;
    }

    public String getPrdCuentaGasto() {
        return prdCuentaGasto;
    }

    public void setPrdCuentaGasto(String prdCuentaGasto) {
        this.prdCuentaGasto = prdCuentaGasto;
    }

    public String getPrdCuentaInventario() {
        return prdCuentaInventario;
    }

    public void setPrdCuentaInventario(String prdCuentaInventario) {
        this.prdCuentaInventario = prdCuentaInventario;
    }

    public String getPrdCuentaVenta() {
        return prdCuentaVenta;
    }

    public void setPrdCuentaVenta(String prdCuentaVenta) {
        this.prdCuentaVenta = prdCuentaVenta;
    }

    public String getPrdDetalle() {
        return prdDetalle;
    }

    public void setPrdDetalle(String prdDetalle) {
        this.prdDetalle = prdDetalle;
    }

    public Boolean getPrdInactivo() {
        return prdInactivo;
    }

    public void setPrdInactivo(Boolean prdInactivo) {
        this.prdInactivo = prdInactivo;
    }

    // public Boolean getPrdIva() {
    public String getPrdIva() {
        return prdIva;
    }

    // public void setPrdIva(Boolean prdIva) {
    public void setPrdIva(String prdIva) {
        this.prdIva = prdIva;
    }

    public String getPrdMarca() {
        return prdMarca;
    }

    public void setPrdMarca(String prdMarca) {
        this.prdMarca = prdMarca;
    }

    public Integer getPrdMaximo() {
        return prdMaximo;
    }

    public void setPrdMaximo(Integer prdMaximo) {
        this.prdMaximo = prdMaximo;
    }

    public String getPrdMedida() {
        return prdMedida;
    }

    public void setPrdMedida(String prdMedida) {
        this.prdMedida = prdMedida;
    }

    public Integer getPrdMinimo() {
        return prdMinimo;
    }

    public void setPrdMinimo(Integer prdMinimo) {
        this.prdMinimo = prdMinimo;
    }

    public String getPrdNombre() {
        return prdNombre;
    }

    public void setPrdNombre(String prdNombre) {
        this.prdNombre = prdNombre;
    }

    public BigDecimal getPrdPrecio1() {
        return prdPrecio1;
    }

    public void setPrdPrecio1(BigDecimal prdPrecio1) {
        this.prdPrecio1 = prdPrecio1;
    }

    public BigDecimal getPrdPrecio2() {
        return prdPrecio2;
    }

    public void setPrdPrecio2(BigDecimal prdPrecio2) {
        this.prdPrecio2 = prdPrecio2;
    }

    public BigDecimal getPrdPrecio3() {
        return prdPrecio3;
    }

    public void setPrdPrecio3(BigDecimal prdPrecio3) {
        this.prdPrecio3 = prdPrecio3;
    }

    public BigDecimal getPrdPrecio4() {
        return prdPrecio4;
    }

    public void setPrdPrecio4(BigDecimal prdPrecio4) {
        this.prdPrecio4 = prdPrecio4;
    }

    public BigDecimal getPrdPrecio5() {
        return prdPrecio5;
    }

    public void setPrdPrecio5(BigDecimal prdPrecio5) {
        this.prdPrecio5 = prdPrecio5;
    }

    public Boolean getPrdStockNegativo() {
        return prdStockNegativo;
    }

    public void setPrdStockNegativo(Boolean prdStockNegativo) {
        this.prdStockNegativo = prdStockNegativo;
    }

    public String getPrdTipo() {
        return prdTipo;
    }

    public void setPrdTipo(String prdTipo) {
        this.prdTipo = prdTipo;
    }

    public String getPrdNombreGasto() {
        return prdNombreGasto;
    }

    public void setPrdNombreGasto(String prdNombreGasto) {
        this.prdNombreGasto = prdNombreGasto;
    }

    public String getPrdNombreInventario() {
        return prdNombreInventario;
    }

    public void setPrdNombreInventario(String prdNombreInventario) {
        this.prdNombreInventario = prdNombreInventario;
    }

    public String getPrdNombreVenta() {
        return prdNombreVenta;
    }

    public void setPrdNombreVenta(String prdNombreVenta) {
        this.prdNombreVenta = prdNombreVenta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getTieneImagenes() {
        return tieneImagenes;
    }

    public void setTieneImagenes(Boolean tieneImagenes) {
        this.tieneImagenes = tieneImagenes;
    }

    public Boolean getProEcommerce() {
        return proEcommerce;
    }

    public void setProEcommerce(Boolean proEcommerce) {
        this.proEcommerce = proEcommerce;
    }

}
