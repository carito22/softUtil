package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Basic;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "inv_producto_categoria", schema = "inventario")
public class InvProductoCategoria implements Serializable {

    @JoinColumns({
        @JoinColumn(name = "scat_codigo", referencedColumnName = "scat_codigo")
        , @JoinColumn(name = "scat_empresa", referencedColumnName = "scat_empresa")})
    @ManyToOne(optional = false)
    private InvProductoSubcategoria invProductoSubcategoria;

    @Basic(optional = false)
    @NotNull
    @Column(name = "cat_precio_fijo", nullable = false)
    private boolean catPrecioFijo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cat_activa", nullable = false)
    private boolean catActiva;
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected InvProductoCategoriaPK invProductoCategoriaPK;
    @Column(name = "cat_detalle")
    private String catDetalle;
    @Column(name = "cta_empresa")
    private String ctaEmpresa;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @Column(name = "cat_cuenta_venta")
    private String catCuentaVenta;

    @Column(name = "cat_cuenta_compra")
    private String catCuentaCompra;

    @Column(name = "cat_cuenta_costo_venta")
    private String catCuentaCostoVenta;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invProductoCategoria")
    @JsonIgnore
    private List<InvProducto> invProductoList;
    @NotNull
    @Column(name = "cat_replicar", nullable = false)
    private boolean catReplicar;

    public InvProductoCategoria() {
    }

    public InvProductoCategoria(InvProductoCategoriaPK invProductoCategoriaPK) {
        this.invProductoCategoriaPK = invProductoCategoriaPK;
    }

    public InvProductoCategoria(InvProductoCategoriaPK invProductoCategoriaPK, String catDetalle, String usrEmpresa,
            String usrCodigo, Date usrFechaInserta) {
        this.invProductoCategoriaPK = invProductoCategoriaPK;
        this.catDetalle = catDetalle;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvProductoCategoria(String catEmpresa, String catCodigo) {
        this.invProductoCategoriaPK = new InvProductoCategoriaPK(catEmpresa, catCodigo);
    }

    public InvProductoCategoriaPK getInvProductoCategoriaPK() {
        return invProductoCategoriaPK;
    }

    public void setInvProductoCategoriaPK(InvProductoCategoriaPK invProductoCategoriaPK) {
        this.invProductoCategoriaPK = invProductoCategoriaPK;
    }

    public String getCatDetalle() {
        return catDetalle;
    }

    public void setCatDetalle(String catDetalle) {
        this.catDetalle = catDetalle;
    }

    public boolean getCatPrecioFijo() {
        return catPrecioFijo;
    }

    public void setCatPrecioFijo(boolean catPrecioFijo) {
        this.catPrecioFijo = catPrecioFijo;
    }

    public boolean getCatActiva() {
        return catActiva;
    }

    public void setCatActiva(boolean catActiva) {
        this.catActiva = catActiva;
    }

    public String getCtaEmpresa() {
        return ctaEmpresa;
    }

    public void setCtaEmpresa(String ctaEmpresa) {
        this.ctaEmpresa = ctaEmpresa;
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

    public List<InvProducto> getInvProductoList() {
        return invProductoList;
    }

    public void setInvProductoList(List<InvProducto> invProductoList) {
        this.invProductoList = invProductoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invProductoCategoriaPK != null ? invProductoCategoriaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvProductoCategoria)) {
            return false;
        }
        InvProductoCategoria other = (InvProductoCategoria) object;
        if ((this.invProductoCategoriaPK == null && other.invProductoCategoriaPK != null)
                || (this.invProductoCategoriaPK != null
                && !this.invProductoCategoriaPK.equals(other.invProductoCategoriaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvProductoCategoria[ invProductoCategoriaPK=" + invProductoCategoriaPK + " ]";
    }

    public InvProductoSubcategoria getInvProductoSubcategoria() {
        return invProductoSubcategoria;
    }

    public void setInvProductoSubcategoria(InvProductoSubcategoria invProductoSubcategoria) {
        this.invProductoSubcategoria = invProductoSubcategoria;
    }

    public boolean isCatReplicar() {
        return catReplicar;
    }

    public void setCatReplicar(boolean catReplicar) {
        this.catReplicar = catReplicar;
    }
}
