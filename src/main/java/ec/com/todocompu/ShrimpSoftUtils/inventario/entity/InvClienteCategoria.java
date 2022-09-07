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
@Table(name = "inv_cliente_categoria", schema = "inventario")
public class InvClienteCategoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected InvClienteCategoriaPK invClienteCategoriaPK;
    @Column(name = "cc_detalle")
    private String ccDetalle;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invClienteCategoria")
    @JsonIgnore
    private List<InvCliente> invClienteList;
    @Column(name = "cc_retiene")
    private boolean ccRetiene;

    public InvClienteCategoria() {
    }

    public InvClienteCategoria(InvClienteCategoriaPK invClienteCategoriaPK) {
        this.invClienteCategoriaPK = invClienteCategoriaPK;
    }

    public InvClienteCategoria(InvClienteCategoriaPK invClienteCategoriaPK, String ccDetalle) {
        this.invClienteCategoriaPK = invClienteCategoriaPK;
        this.ccDetalle = ccDetalle;
    }

    public InvClienteCategoria(String ccEmpresa, String ccCodigo) {
        this.invClienteCategoriaPK = new InvClienteCategoriaPK(ccEmpresa, ccCodigo);
    }

    public InvClienteCategoriaPK getInvClienteCategoriaPK() {
        return invClienteCategoriaPK;
    }

    public void setInvClienteCategoriaPK(InvClienteCategoriaPK invClienteCategoriaPK) {
        this.invClienteCategoriaPK = invClienteCategoriaPK;
    }

    public String getCcDetalle() {
        return ccDetalle;
    }

    public void setCcDetalle(String ccDetalle) {
        this.ccDetalle = ccDetalle;
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

    public List<InvCliente> getInvClienteList() {
        return invClienteList;
    }

    public void setInvClienteList(List<InvCliente> invClienteList) {
        this.invClienteList = invClienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invClienteCategoriaPK != null ? invClienteCategoriaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof InvClienteCategoria)) {
            return false;
        }
        InvClienteCategoria other = (InvClienteCategoria) object;
        if ((this.invClienteCategoriaPK == null && other.invClienteCategoriaPK != null)
                || (this.invClienteCategoriaPK != null
                && !this.invClienteCategoriaPK.equals(other.invClienteCategoriaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvClienteCategoria[ invClienteCategoriaPK=" + invClienteCategoriaPK + " ]";
    }

    public boolean isCcRetiene() {
        return ccRetiene;
    }

    public void setCcRetiene(boolean ccRetiene) {
        this.ccRetiene = ccRetiene;
    }

}
