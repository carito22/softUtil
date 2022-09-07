/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author DEVELOPER
 */
@Entity
@Table(name = "inv_producto_subcategoria", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvProductoSubcategoria.findAll", query = "SELECT i FROM InvProductoSubcategoria i")})
public class InvProductoSubcategoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvProductoSubcategoriaPK invProductoSubcategoriaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "scat_detalle")
    private String scatDetalle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usr_fecha_inserta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;

    public InvProductoSubcategoria() {
    }

    public InvProductoSubcategoria(InvProductoSubcategoriaPK invProductoSubcategoriaPK) {
        this.invProductoSubcategoriaPK = invProductoSubcategoriaPK;
    }

    public InvProductoSubcategoria(InvProductoSubcategoriaPK invProductoSubcategoriaPK, String scatDetalle, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.invProductoSubcategoriaPK = invProductoSubcategoriaPK;
        this.scatDetalle = scatDetalle;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvProductoSubcategoria(String scatEmpresa, String scatCodigo) {
        this.invProductoSubcategoriaPK = new InvProductoSubcategoriaPK(scatEmpresa, scatCodigo);
    }

    public InvProductoSubcategoriaPK getInvProductoSubcategoriaPK() {
        return invProductoSubcategoriaPK;
    }

    public void setInvProductoSubcategoriaPK(InvProductoSubcategoriaPK invProductoSubcategoriaPK) {
        this.invProductoSubcategoriaPK = invProductoSubcategoriaPK;
    }

    public String getScatDetalle() {
        return scatDetalle;
    }

    public void setScatDetalle(String scatDetalle) {
        this.scatDetalle = scatDetalle;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invProductoSubcategoriaPK != null ? invProductoSubcategoriaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvProductoSubcategoria)) {
            return false;
        }
        InvProductoSubcategoria other = (InvProductoSubcategoria) object;
        if ((this.invProductoSubcategoriaPK == null && other.invProductoSubcategoriaPK != null) || (this.invProductoSubcategoriaPK != null && !this.invProductoSubcategoriaPK.equals(other.invProductoSubcategoriaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProductoSubcategoria[ invProductoSubcategoriaPK=" + invProductoSubcategoriaPK + " ]";
    }
    
}
