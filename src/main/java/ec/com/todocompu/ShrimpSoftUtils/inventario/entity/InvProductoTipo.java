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
import javax.validation.constraints.Size;

@Entity
@Table(name = "inv_producto_tipo", schema = "inventario")
public class InvProductoTipo implements Serializable {

    @Size(max = 2147483647)
    @Column(name = "cta_empresa")
    private String ctaEmpresa;
    @Size(max = 2147483647)
    @Column(name = "cta_codigo")
    private String ctaCodigo;
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected InvProductoTipoPK invProductoTipoPK;
    @Column(name = "tip_detalle")
    private String tipDetalle;
    @Column(name = "tip_tipo")
    private String tipTipo;
    @Column(name = "tip_activo")
    private boolean tipActivo;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "invProductoTipo")
    @JsonIgnore
    private List<InvProducto> invProductoList;
    @Column(name = "tip_replicar")
    private boolean tipReplicar;

    public InvProductoTipo() {
    }

    public InvProductoTipo(InvProductoTipoPK invProductoTipoPK) {
        this.invProductoTipoPK = invProductoTipoPK;
    }

    public InvProductoTipo(InvProductoTipoPK invProductoTipoPK, String tipDetalle, String tipTipo, boolean tipActivo,
            String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.invProductoTipoPK = invProductoTipoPK;
        this.tipDetalle = tipDetalle;
        this.tipTipo = tipTipo;
        this.tipActivo = tipActivo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvProductoTipo(String tipEmpresa, String tipCodigo) {
        this.invProductoTipoPK = new InvProductoTipoPK(tipEmpresa, tipCodigo);
    }

    public InvProductoTipoPK getInvProductoTipoPK() {
        return invProductoTipoPK;
    }

    public void setInvProductoTipoPK(InvProductoTipoPK invProductoTipoPK) {
        this.invProductoTipoPK = invProductoTipoPK;
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

    public boolean getTipActivo() {
        return tipActivo;
    }

    public void setTipActivo(boolean tipActivo) {
        this.tipActivo = tipActivo;
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

    public List<InvProducto> getInvProductoList() {
        return invProductoList;
    }

    public void setInvProductoList(List<InvProducto> invProductoList) {
        this.invProductoList = invProductoList;
    }

    public boolean isTipReplicar() {
        return tipReplicar;
    }

    public void setTipReplicar(boolean tipReplicar) {
        this.tipReplicar = tipReplicar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invProductoTipoPK != null ? invProductoTipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvProductoTipo)) {
            return false;
        }
        InvProductoTipo other = (InvProductoTipo) object;
        if ((this.invProductoTipoPK == null && other.invProductoTipoPK != null)
                || (this.invProductoTipoPK != null && !this.invProductoTipoPK.equals(other.invProductoTipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvProductoTipo[ invProductoTipoPK=" + invProductoTipoPK + " ]";
    }

    public String getCtaEmpresa() {
        return ctaEmpresa;
    }

    public void setCtaEmpresa(String ctaEmpresa) {
        this.ctaEmpresa = ctaEmpresa;
    }

    public String getCtaCodigo() {
        return ctaCodigo;
    }

    public void setCtaCodigo(String ctaCodigo) {
        this.ctaCodigo = ctaCodigo;
    }

}
