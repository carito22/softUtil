/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * @author Developer0
 */
@Entity
@Table(name = "inv_ventas_reembolso", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvVentasReembolso.findAll", query = "SELECT i FROM InvVentasReembolso i")})
public class InvVentasReembolso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "reemb_secuencial")
    private Integer reembSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "reemb_documento_tipo")
    private String reembDocumentoTipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 17)
    @Column(name = "reemb_documento_numero")
    private String reembDocumentoNumero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reemb_fecha_emision")
    @Temporal(TemporalType.DATE)
    private Date reembFechaEmision;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "reemb_autorizacion")
    private String reembAutorizacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "reemb_base_cero")
    private BigDecimal reembBaseCero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reemb_base_gravable")
    private BigDecimal reembBaseGravable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reemb_montoiva")
    private BigDecimal reembMontoiva;
    @JoinColumns({
        @JoinColumn(name = "prov_empresa", referencedColumnName = "prov_empresa")
        , @JoinColumn(name = "prov_codigo", referencedColumnName = "prov_codigo")})
    @ManyToOne(optional = false)
    private InvProveedor invProveedor;
    @JoinColumns({
        @JoinColumn(name = "vta_empresa", referencedColumnName = "vta_empresa")
        , @JoinColumn(name = "vta_periodo", referencedColumnName = "vta_periodo")
        , @JoinColumn(name = "vta_motivo", referencedColumnName = "vta_motivo")
        , @JoinColumn(name = "vta_numero", referencedColumnName = "vta_numero")})
    @ManyToOne(optional = false)
    private InvVentas invVentas;

    public InvVentasReembolso() {
    }

    public InvVentasReembolso(Integer reembSecuencial) {
        this.reembSecuencial = reembSecuencial;
    }

    public InvVentasReembolso(Integer reembSecuencial, String reembDocumentoTipo, String reembDocumentoNumero, Date reembFechaEmision, String reembAutorizacion, BigDecimal reembBaseCero, BigDecimal reembBaseGravable, BigDecimal reembMontoiva) {
        this.reembSecuencial = reembSecuencial;
        this.reembDocumentoTipo = reembDocumentoTipo;
        this.reembDocumentoNumero = reembDocumentoNumero;
        this.reembFechaEmision = reembFechaEmision;
        this.reembAutorizacion = reembAutorizacion;
        this.reembBaseCero = reembBaseCero;
        this.reembBaseGravable = reembBaseGravable;
        this.reembMontoiva = reembMontoiva;
    }

    public Integer getReembSecuencial() {
        return reembSecuencial;
    }

    public void setReembSecuencial(Integer reembSecuencial) {
        this.reembSecuencial = reembSecuencial;
    }

    public String getReembDocumentoTipo() {
        return reembDocumentoTipo;
    }

    public void setReembDocumentoTipo(String reembDocumentoTipo) {
        this.reembDocumentoTipo = reembDocumentoTipo;
    }

    public String getReembDocumentoNumero() {
        return reembDocumentoNumero;
    }

    public void setReembDocumentoNumero(String reembDocumentoNumero) {
        this.reembDocumentoNumero = reembDocumentoNumero;
    }

    public Date getReembFechaEmision() {
        return reembFechaEmision;
    }

    public void setReembFechaEmision(Date reembFechaEmision) {
        this.reembFechaEmision = reembFechaEmision;
    }

    public String getReembAutorizacion() {
        return reembAutorizacion;
    }

    public void setReembAutorizacion(String reembAutorizacion) {
        this.reembAutorizacion = reembAutorizacion;
    }

    public BigDecimal getReembBaseCero() {
        return reembBaseCero;
    }

    public void setReembBaseCero(BigDecimal reembBaseCero) {
        this.reembBaseCero = reembBaseCero;
    }

    public BigDecimal getReembBaseGravable() {
        return reembBaseGravable;
    }

    public void setReembBaseGravable(BigDecimal reembBaseGravable) {
        this.reembBaseGravable = reembBaseGravable;
    }

    public BigDecimal getReembMontoiva() {
        return reembMontoiva;
    }

    public void setReembMontoiva(BigDecimal reembMontoiva) {
        this.reembMontoiva = reembMontoiva;
    }

    public InvProveedor getInvProveedor() {
        return invProveedor;
    }

    public void setInvProveedor(InvProveedor invProveedor) {
        this.invProveedor = invProveedor;
    }

    public InvVentas getInvVentas() {
        return invVentas;
    }

    public void setInvVentas(InvVentas invVentas) {
        this.invVentas = invVentas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reembSecuencial != null ? reembSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvVentasReembolso)) {
            return false;
        }
        InvVentasReembolso other = (InvVentasReembolso) object;
        if ((this.reembSecuencial == null && other.reembSecuencial != null) || (this.reembSecuencial != null && !this.reembSecuencial.equals(other.reembSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvVentasReembolso[ reembSecuencial=" + reembSecuencial + " ]";
    }
    
}
