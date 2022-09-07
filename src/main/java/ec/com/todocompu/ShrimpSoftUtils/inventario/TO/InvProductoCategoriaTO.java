/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvProductoCategoriaTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "cat_empresa")
    private String catEmpresa;

    @Id
    @Column(name = "cat_codigo")
    private String catCodigo;

    @Column(name = "cat_detalle")
    private String catDetalle;

    @Column(name = "cat_precio_fijo")
    private boolean catPrecioFijo;

    @Column(name = "cat_activa")
    private boolean catActiva;

    @Column(name = "cc_empresa")
    private String ctaEmpresa;

    @Column(name = "scat_empresa")
    private String scatEmpresa;

    @Column(name = "scat_codigo")
    private String scatCodigo;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    @Column(name = "cat_cuenta_venta")
    private String catCuentaVenta;

    @Column(name = "cat_cuenta_compra")
    private String catCuentaCompra;

    @Column(name = "cat_cuenta_costo_venta")
    private String catCuentaCostoVenta;

    @Column(name = "cat_replicar")
    private boolean catReplicar;

    public InvProductoCategoriaTO() {
    }

    public InvProductoCategoriaTO(String catEmpresa, String catCodigo, String catDetalle, boolean catPrecioFijo, boolean catActiva, String ctaEmpresa, String scatEmpresa, String scatCodigo, String usrEmpresa, String usrCodigo, String usrFechaInserta) {
        this.catEmpresa = catEmpresa;
        this.catCodigo = catCodigo;
        this.catDetalle = catDetalle;
        this.catPrecioFijo = catPrecioFijo;
        this.catActiva = catActiva;
        this.ctaEmpresa = ctaEmpresa;
        this.scatEmpresa = scatEmpresa;
        this.scatCodigo = scatCodigo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvProductoCategoriaTO(String catEmpresa, String catCodigo, String catDetalle, boolean catPrecioFijo,
            boolean catActiva, String CtaEmpresa, String usrEmpresa, String usrCodigo,
            String usrFechaInserta) {
        this.catEmpresa = catEmpresa;
        this.catCodigo = catCodigo;
        this.catDetalle = catDetalle;
        this.catPrecioFijo = catPrecioFijo;
        this.catActiva = catActiva;
        this.ctaEmpresa = CtaEmpresa;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getCtaEmpresa() {
        return ctaEmpresa;
    }

    public void setCtaEmpresa(String CtaEmpresa) {
        this.ctaEmpresa = CtaEmpresa;
    }

    public boolean isCatActiva() {
        return catActiva;
    }

    public void setCatActiva(boolean catActiva) {
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

    public String getCatEmpresa() {
        return catEmpresa;
    }

    public void setCatEmpresa(String catEmpresa) {
        this.catEmpresa = catEmpresa;
    }

    public boolean isCatPrecioFijo() {
        return catPrecioFijo;
    }

    public void setCatPrecioFijo(boolean catPrecioFijo) {
        this.catPrecioFijo = catPrecioFijo;
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

    public String getScatEmpresa() {
        return scatEmpresa;
    }

    public void setScatEmpresa(String scatEmpresa) {
        this.scatEmpresa = scatEmpresa;
    }

    public String getScatCodigo() {
        return scatCodigo;
    }

    public void setScatCodigo(String scatCodigo) {
        this.scatCodigo = scatCodigo;
    }

    public String getCatCuentaVenta() {
        return catCuentaVenta;
    }

    public void setCatCuentaVenta(String catCuentaVenta) {
        this.catCuentaVenta = catCuentaVenta;
    }

    public String getCatCuentaCompra() {
        return catCuentaCompra;
    }

    public void setCatCuentaCompra(String catCuentaCompra) {
        this.catCuentaCompra = catCuentaCompra;
    }

    public String getCatCuentaCostoVenta() {
        return catCuentaCostoVenta;
    }

    public void setCatCuentaCostoVenta(String catCuentaCostoVenta) {
        this.catCuentaCostoVenta = catCuentaCostoVenta;
    }

    public boolean isCatReplicar() {
        return catReplicar;
    }

    public void setCatReplicar(boolean catReplicar) {
        this.catReplicar = catReplicar;
    }
}
