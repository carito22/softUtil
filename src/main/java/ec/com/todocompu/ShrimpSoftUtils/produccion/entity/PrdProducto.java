package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "prd_producto", schema = "produccion")
public class PrdProducto implements Serializable {

    private static final long serialVersionUID = 1L;

    protected PrdProductoPK prdLiquidacionProductoPK;
    private String prodDetalle;
    private String prodTipo;
    private char prodClase;
    private boolean prodInactivo;
    private String usrEmpresa;
    private String usrCodigo;
    private Date usrFechaInserta;
    private BigDecimal prodDescuento;

    public PrdProducto() {
    }

    public PrdProducto(PrdProductoPK prdLiquidacionProductoPK) {
        this.prdLiquidacionProductoPK = prdLiquidacionProductoPK;
    }

    public PrdProducto(PrdProductoPK prdLiquidacionProductoPK, String prodDetalle, String prodTipo, char prodClase,
            boolean prodInactivo, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.prdLiquidacionProductoPK = prdLiquidacionProductoPK;
        this.prodDetalle = prodDetalle;
        this.prodTipo = prodTipo;
        this.prodClase = prodClase;
        this.prodInactivo = prodInactivo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public PrdProducto(String prodEmpresa, String prodCodigo) {
        this.prdLiquidacionProductoPK = new PrdProductoPK(prodEmpresa, prodCodigo);
    }

    @EmbeddedId
    public PrdProductoPK getPrdLiquidacionProductoPK() {
        return prdLiquidacionProductoPK;
    }

    public void setPrdLiquidacionProductoPK(PrdProductoPK prdLiquidacionProductoPK) {
        this.prdLiquidacionProductoPK = prdLiquidacionProductoPK;
    }

    @Column(name = "prod_detalle")
    public String getProdDetalle() {
        return prodDetalle;
    }

    public void setProdDetalle(String prodDetalle) {
        this.prodDetalle = prodDetalle;
    }

    @Column(name = "prod_tipo")
    public String getProdTipo() {
        return prodTipo;
    }

    public void setProdTipo(String prodTipo) {
        this.prodTipo = prodTipo;
    }

    @Column(name = "prod_clase")
    public char getProdClase() {
        return prodClase;
    }

    public void setProdClase(char prodClase) {
        this.prodClase = prodClase;
    }

    @Column(name = "prod_inactivo")
    public boolean getProdInactivo() {
        return prodInactivo;
    }

    public void setProdInactivo(boolean prodInactivo) {
        this.prodInactivo = prodInactivo;
    }

    @Column(name = "usr_empresa")
    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    @Column(name = "usr_codigo")
    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    @Column(name = "usr_fecha_inserta")
    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    @Column(name = "prod_descuento")
    public BigDecimal getProdDescuento() {
        return prodDescuento;
    }

    public void setProdDescuento(BigDecimal prodDescuento) {
        this.prodDescuento = prodDescuento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdLiquidacionProductoPK != null ? prdLiquidacionProductoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PrdProducto)) {
            return false;
        }
        PrdProducto other = (PrdProducto) object;
        if ((this.prdLiquidacionProductoPK == null && other.prdLiquidacionProductoPK != null)
                || (this.prdLiquidacionProductoPK != null
                && !this.prdLiquidacionProductoPK.equals(other.prdLiquidacionProductoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "produccion.entity.PrdLiquidacionProducto[ prdLiquidacionProductoPK=" + prdLiquidacionProductoPK + " ]";
    }

}
