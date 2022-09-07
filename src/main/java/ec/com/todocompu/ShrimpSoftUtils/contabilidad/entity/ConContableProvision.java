/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "con_contable_provision", schema = "contabilidad")
@NamedQueries({
    @NamedQuery(name = "ConContableProvision.findAll", query = "SELECT c FROM ConContableProvision c")})
public class ConContableProvision implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "prov_secuencial")
    private Integer provSecuencial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prov_actualizar_contable")
    private boolean provActualizarContable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "sec_empresa")
    private String secEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "sec_codigo")
    private String secCodigo;
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
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @JoinColumns({
        @JoinColumn(name = "con_empresa", referencedColumnName = "con_empresa")
        , @JoinColumn(name = "con_periodo", referencedColumnName = "con_periodo")
        , @JoinColumn(name = "con_tipo", referencedColumnName = "con_tipo")
        , @JoinColumn(name = "con_numero", referencedColumnName = "con_numero")})
    @ManyToOne(optional = false)
    private ConContable conContable;

    public ConContableProvision() {
    }

    public ConContableProvision(Integer provSecuencial) {
        this.provSecuencial = provSecuencial;
    }

    public ConContableProvision(Integer provSecuencial, boolean provActualizarContable, String secEmpresa, String secCodigo, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.provSecuencial = provSecuencial;
        this.provActualizarContable = provActualizarContable;
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public Integer getProvSecuencial() {
        return provSecuencial;
    }

    public void setProvSecuencial(Integer provSecuencial) {
        this.provSecuencial = provSecuencial;
    }

    public boolean getProvActualizarContable() {
        return provActualizarContable;
    }

    public void setProvActualizarContable(boolean provActualizarContable) {
        this.provActualizarContable = provActualizarContable;
    }

    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
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

    public ConContable getConContable() {
        return conContable;
    }

    public void setConContable(ConContable conContable) {
        this.conContable = conContable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (provSecuencial != null ? provSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConContableProvision)) {
            return false;
        }
        ConContableProvision other = (ConContableProvision) object;
        if ((this.provSecuencial == null && other.provSecuencial != null) || (this.provSecuencial != null && !this.provSecuencial.equals(other.provSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContableProvision[ provSecuencial=" + provSecuencial + " ]";
    }
    
}
