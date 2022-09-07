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
 * @author Developer0
 */
@Entity
@Table(name = "inv_cliente_grupo_empresarial", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvClienteGrupoEmpresarial.findAll", query = "SELECT i FROM InvClienteGrupoEmpresarial i")})
public class InvClienteGrupoEmpresarial implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvClienteGrupoEmpresarialPK invClienteGrupoEmpresarialPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ge_nombre")
    private String geNombre;
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

    public InvClienteGrupoEmpresarial() {
    }

    public InvClienteGrupoEmpresarial(InvClienteGrupoEmpresarialPK invClienteGrupoEmpresarialPK) {
        this.invClienteGrupoEmpresarialPK = invClienteGrupoEmpresarialPK;
    }

    public InvClienteGrupoEmpresarial(InvClienteGrupoEmpresarialPK invClienteGrupoEmpresarialPK, String geNombre, String usrCodigo, Date usrFechaInserta) {
        this.invClienteGrupoEmpresarialPK = invClienteGrupoEmpresarialPK;
        this.geNombre = geNombre;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvClienteGrupoEmpresarial(String geEmpresa, String geCodigo) {
        this.invClienteGrupoEmpresarialPK = new InvClienteGrupoEmpresarialPK(geEmpresa, geCodigo);
    }

    public InvClienteGrupoEmpresarialPK getInvClienteGrupoEmpresarialPK() {
        return invClienteGrupoEmpresarialPK;
    }

    public void setInvClienteGrupoEmpresarialPK(InvClienteGrupoEmpresarialPK invClienteGrupoEmpresarialPK) {
        this.invClienteGrupoEmpresarialPK = invClienteGrupoEmpresarialPK;
    }

    public String getGeNombre() {
        return geNombre;
    }

    public void setGeNombre(String geNombre) {
        this.geNombre = geNombre;
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
        hash += (invClienteGrupoEmpresarialPK != null ? invClienteGrupoEmpresarialPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvClienteGrupoEmpresarial)) {
            return false;
        }
        InvClienteGrupoEmpresarial other = (InvClienteGrupoEmpresarial) object;
        if ((this.invClienteGrupoEmpresarialPK == null && other.invClienteGrupoEmpresarialPK != null) || (this.invClienteGrupoEmpresarialPK != null && !this.invClienteGrupoEmpresarialPK.equals(other.invClienteGrupoEmpresarialPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvClienteGrupoEmpresarial[ invClienteGrupoEmpresarialPK=" + invClienteGrupoEmpresarialPK + " ]";
    }

    }
