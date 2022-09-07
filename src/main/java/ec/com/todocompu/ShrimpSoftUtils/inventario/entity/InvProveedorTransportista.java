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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mario
 */
@Entity
@Table(name = "inv_proveedor_transportista", schema = "inventario")
public class InvProveedorTransportista implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pt_secuencial")
    private Integer ptSecuencial;
    @Size(max = 2147483647)
    @Column(name = "pt_transportista_ruc")
    private String ptTransportistaRuc;
    @Size(max = 2147483647)
    @Column(name = "pt_transportista_razon_social")
    private String ptTransportistaRazonSocial;
    @Size(max = 2147483647)
    @Column(name = "pt_transportista_razon_social_verificada")
    private String ptTransportistaRazonSocialVerificada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pt_inactivo")
    private boolean ptInactivo;
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
    @JoinColumns({
        @JoinColumn(name = "prov_empresa", referencedColumnName = "prov_empresa"),
        @JoinColumn(name = "prov_codigo", referencedColumnName = "prov_codigo")})
    @ManyToOne(optional = false)
    private InvProveedor invProveedor;

    public InvProveedorTransportista() {
    }

    public InvProveedorTransportista(Integer ptSecuencial) {
        this.ptSecuencial = ptSecuencial;
    }

    public InvProveedorTransportista(Integer ptSecuencial, boolean ptInactivo, String usrCodigo, Date usrFechaInserta) {
        this.ptSecuencial = ptSecuencial;
        this.ptInactivo = ptInactivo;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public Integer getPtSecuencial() {
        return ptSecuencial;
    }

    public void setPtSecuencial(Integer ptSecuencial) {
        this.ptSecuencial = ptSecuencial;
    }

    public String getPtTransportistaRuc() {
        return ptTransportistaRuc;
    }

    public void setPtTransportistaRuc(String ptTransportistaRuc) {
        this.ptTransportistaRuc = ptTransportistaRuc;
    }

    public String getPtTransportistaRazonSocial() {
        return ptTransportistaRazonSocial;
    }

    public void setPtTransportistaRazonSocial(String ptTransportistaRazonSocial) {
        this.ptTransportistaRazonSocial = ptTransportistaRazonSocial;
    }

    public String getPtTransportistaRazonSocialVerificada() {
        return ptTransportistaRazonSocialVerificada;
    }

    public void setPtTransportistaRazonSocialVerificada(String ptTransportistaRazonSocialVerificada) {
        this.ptTransportistaRazonSocialVerificada = ptTransportistaRazonSocialVerificada;
    }

    public boolean getPtInactivo() {
        return ptInactivo;
    }

    public void setPtInactivo(boolean ptInactivo) {
        this.ptInactivo = ptInactivo;
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

    public InvProveedor getInvProveedor() {
        return invProveedor;
    }

    public void setInvProveedor(InvProveedor invProveedor) {
        this.invProveedor = invProveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ptSecuencial != null ? ptSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvProveedorTransportista)) {
            return false;
        }
        InvProveedorTransportista other = (InvProveedorTransportista) object;
        if ((this.ptSecuencial == null && other.ptSecuencial != null) || (this.ptSecuencial != null && !this.ptSecuencial.equals(other.ptSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProveedorTransportista[ ptSecuencial=" + ptSecuencial + " ]";
    }

}
