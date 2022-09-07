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

@Entity
@Table(name = "inv_producto_marca", schema = "inventario")
public class InvProductoMarca implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected InvProductoMarcaPK invProductoMarcaPK;
    @Column(name = "mar_detalle")
    private String marDetalle;
    @Column(name = "mar_abreviado")
    private String marAbreviado;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @Column(name = "mar_incluir_en_facturacion")
    private boolean marIncluirEnFacturacion;
    @Column(name = "mar_replicar")
    private boolean marReplicar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invProductoMarca")
    @JsonIgnore
    private List<InvProducto> invProductoList;

    public InvProductoMarca() {
    }

    public InvProductoMarca(InvProductoMarcaPK invProductoMarcaPK) {
        this.invProductoMarcaPK = invProductoMarcaPK;
    }

    public InvProductoMarca(InvProductoMarcaPK invProductoMarcaPK, String marDetalle, String marAbreviado,
            String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.invProductoMarcaPK = invProductoMarcaPK;
        this.marDetalle = marDetalle;
        this.marAbreviado = marAbreviado;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvProductoMarca(String marEmpresa, String marCodigo) {
        this.invProductoMarcaPK = new InvProductoMarcaPK(marEmpresa, marCodigo);
    }

    public InvProductoMarcaPK getInvProductoMarcaPK() {
        return invProductoMarcaPK;
    }

    public void setInvProductoMarcaPK(InvProductoMarcaPK invProductoMarcaPK) {
        this.invProductoMarcaPK = invProductoMarcaPK;
    }

    public String getMarDetalle() {
        return marDetalle;
    }

    public void setMarDetalle(String marDetalle) {
        this.marDetalle = marDetalle;
    }

    public String getMarAbreviado() {
        return marAbreviado;
    }

    public void setMarAbreviado(String marAbreviado) {
        this.marAbreviado = marAbreviado;
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

    public boolean isMarIncluirEnFacturacion() {
        return marIncluirEnFacturacion;
    }

    public void setMarIncluirEnFacturacion(boolean marIncluirEnFacturacion) {
        this.marIncluirEnFacturacion = marIncluirEnFacturacion;
    }

    public List<InvProducto> getInvProductoList() {
        return invProductoList;
    }

    public void setInvProductoList(List<InvProducto> invProductoList) {
        this.invProductoList = invProductoList;
    }

    public boolean isMarReplicar() {
        return marReplicar;
    }

    public void setMarReplicar(boolean marReplicar) {
        this.marReplicar = marReplicar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invProductoMarcaPK != null ? invProductoMarcaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvProductoMarca)) {
            return false;
        }
        InvProductoMarca other = (InvProductoMarca) object;
        if ((this.invProductoMarcaPK == null && other.invProductoMarcaPK != null)
                || (this.invProductoMarcaPK != null && !this.invProductoMarcaPK.equals(other.invProductoMarcaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvProductoMarca[ invProductoMarcaPK=" + invProductoMarcaPK + " ]";
    }

}
