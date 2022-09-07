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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "inv_ventas_forma_cobro", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvVentasFormaCobro.findAll", query = "SELECT i FROM InvVentasFormaCobro i")})
public class InvVentasFormaCobro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fc_secuencial")
    private Integer fcSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "fc_detalle")
    private String fcDetalle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "fc_tipo_principal")
    private String fcTipoPrincipal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fc_inactivo")
    private boolean fcInactivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cta_empresa")
    private String ctaEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cta_codigo")
    private String ctaCodigo;
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

    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;

    public InvVentasFormaCobro() {
    }

    public InvVentasFormaCobro(Integer fcSecuencial) {
        this.fcSecuencial = fcSecuencial;
    }

    public InvVentasFormaCobro(Integer fcSecuencial, String fcDetalle, String fcTipoPrincipal, boolean fcInactivo, String ctaEmpresa, String ctaCodigo, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.fcSecuencial = fcSecuencial;
        this.fcDetalle = fcDetalle;
        this.fcTipoPrincipal = fcTipoPrincipal;
        this.fcInactivo = fcInactivo;
        this.ctaEmpresa = ctaEmpresa;
        this.ctaCodigo = ctaCodigo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public Integer getFcSecuencial() {
        return fcSecuencial;
    }

    public void setFcSecuencial(Integer fcSecuencial) {
        this.fcSecuencial = fcSecuencial;
    }

    public String getFcDetalle() {
        return fcDetalle;
    }

    public void setFcDetalle(String fcDetalle) {
        this.fcDetalle = fcDetalle;
    }

    public String getFcTipoPrincipal() {
        return fcTipoPrincipal;
    }

    public void setFcTipoPrincipal(String fcTipoPrincipal) {
        this.fcTipoPrincipal = fcTipoPrincipal;
    }

    public boolean getFcInactivo() {
        return fcInactivo;
    }

    public void setFcInactivo(boolean fcInactivo) {
        this.fcInactivo = fcInactivo;
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
        hash += (fcSecuencial != null ? fcSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvVentasFormaCobro)) {
            return false;
        }
        InvVentasFormaCobro other = (InvVentasFormaCobro) object;
        if ((this.fcSecuencial == null && other.fcSecuencial != null) || (this.fcSecuencial != null && !this.fcSecuencial.equals(other.fcSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvVentasFormaCobro[ fcSecuencial=" + fcSecuencial + " ]";
    }

}
