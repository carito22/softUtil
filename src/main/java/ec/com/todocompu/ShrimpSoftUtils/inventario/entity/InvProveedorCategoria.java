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
@Table(name = "inv_proveedor_categoria", schema = "inventario")
public class InvProveedorCategoria implements Serializable {

    @Column(name = "pc_aplica_retencion_iva")
    private boolean pcAplicaRetencionIva;
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected InvProveedorCategoriaPK invProveedorCategoriaPK;
    @Column(name = "pc_detalle")
    private String pcDetalle;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invProveedorCategoria")
    @JsonIgnore
    private List<InvProveedor> invProveedorList;

    public InvProveedorCategoria() {
    }

    public InvProveedorCategoria(InvProveedorCategoriaPK invProveedorCategoriaPK) {
        this.invProveedorCategoriaPK = invProveedorCategoriaPK;
    }

    public InvProveedorCategoria(InvProveedorCategoriaPK invProveedorCategoriaPK, String pcDetalle) {
        this.invProveedorCategoriaPK = invProveedorCategoriaPK;
        this.pcDetalle = pcDetalle;
    }

    public InvProveedorCategoria(String pcEmpresa, String pcCodigo) {
        this.invProveedorCategoriaPK = new InvProveedorCategoriaPK(pcEmpresa, pcCodigo);
    }

    public InvProveedorCategoriaPK getInvProveedorCategoriaPK() {
        return invProveedorCategoriaPK;
    }

    public void setInvProveedorCategoriaPK(InvProveedorCategoriaPK invProveedorCategoriaPK) {
        this.invProveedorCategoriaPK = invProveedorCategoriaPK;
    }

    public String getPcDetalle() {
        return pcDetalle;
    }

    public void setPcDetalle(String pcDetalle) {
        this.pcDetalle = pcDetalle;
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

    public List<InvProveedor> getInvProveedorList() {
        return invProveedorList;
    }

    public void setInvProveedorList(List<InvProveedor> invProveedorList) {
        this.invProveedorList = invProveedorList;
    }
    
    public boolean getPcAplicaRetencionIva() {
        return pcAplicaRetencionIva;
    }

    public void setPcAplicaRetencionIva(boolean pcAplicaRetencionIva) {
        this.pcAplicaRetencionIva = pcAplicaRetencionIva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invProveedorCategoriaPK != null ? invProveedorCategoriaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvProveedorCategoria)) {
            return false;
        }
        InvProveedorCategoria other = (InvProveedorCategoria) object;
        if ((this.invProveedorCategoriaPK == null && other.invProveedorCategoriaPK != null)
                || (this.invProveedorCategoriaPK != null
                && !this.invProveedorCategoriaPK.equals(other.invProveedorCategoriaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvProveedorCategoria[ invProveedorCategoriaPK=" + invProveedorCategoriaPK + " ]";
    }


}
