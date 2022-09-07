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
 * @author DEVELOPER
 */
@Entity
@Table(name = "inv_pedidos_orden_compra_notificaciones", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvPedidosOrdenCompraNotificaciones.findAll", query = "SELECT i FROM InvPedidosOrdenCompraNotificaciones i")})
public class InvPedidosOrdenCompraNotificaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ocn_secuencial")
    private Integer ocnSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ocn_destinatario")
    private String ocnDestinatario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ocn_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ocnFecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ocn_tipo")
    private String ocnTipo;
    @Size(max = 2147483647)
    @Column(name = "ocn_observacion")
    private String ocnObservacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ocn_informe")
    private String ocnInforme;
    /*+**************************************************/
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "oc_empresa")
    private String ocEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "oc_sector")
    private String ocSector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "oc_motivo")
    private String ocMotivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "oc_numero")
    private String ocNumero;

    public InvPedidosOrdenCompraNotificaciones() {
    }

    public InvPedidosOrdenCompraNotificaciones(Integer ocnSecuencial) {
        this.ocnSecuencial = ocnSecuencial;
    }

    public InvPedidosOrdenCompraNotificaciones(Integer ocnSecuencial, String ocnDestinatario, Date ocnFecha, String ocnTipo, String ocnInforme) {
        this.ocnSecuencial = ocnSecuencial;
        this.ocnDestinatario = ocnDestinatario;
        this.ocnFecha = ocnFecha;
        this.ocnTipo = ocnTipo;
        this.ocnInforme = ocnInforme;
    }

    public Integer getOcnSecuencial() {
        return ocnSecuencial;
    }

    public void setOcnSecuencial(Integer ocnSecuencial) {
        this.ocnSecuencial = ocnSecuencial;
    }

    public String getOcnDestinatario() {
        return ocnDestinatario;
    }

    public void setOcnDestinatario(String ocnDestinatario) {
        this.ocnDestinatario = ocnDestinatario;
    }

    public Date getOcnFecha() {
        return ocnFecha;
    }

    public void setOcnFecha(Date ocnFecha) {
        this.ocnFecha = ocnFecha;
    }

    public String getOcnTipo() {
        return ocnTipo;
    }

    public void setOcnTipo(String ocnTipo) {
        this.ocnTipo = ocnTipo;
    }

    public String getOcnObservacion() {
        return ocnObservacion;
    }

    public void setOcnObservacion(String ocnObservacion) {
        this.ocnObservacion = ocnObservacion;
    }

    public String getOcnInforme() {
        return ocnInforme;
    }

    public void setOcnInforme(String ocnInforme) {
        this.ocnInforme = ocnInforme;
    }

    public String getOcEmpresa() {
        return ocEmpresa;
    }

    public void setOcEmpresa(String ocEmpresa) {
        this.ocEmpresa = ocEmpresa;
    }

    public String getOcSector() {
        return ocSector;
    }

    public void setOcSector(String ocSector) {
        this.ocSector = ocSector;
    }

    public String getOcMotivo() {
        return ocMotivo;
    }

    public void setOcMotivo(String ocMotivo) {
        this.ocMotivo = ocMotivo;
    }

    public String getOcNumero() {
        return ocNumero;
    }

    public void setOcNumero(String ocNumero) {
        this.ocNumero = ocNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocnSecuencial != null ? ocnSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvPedidosOrdenCompraNotificaciones)) {
            return false;
        }
        InvPedidosOrdenCompraNotificaciones other = (InvPedidosOrdenCompraNotificaciones) object;
        if ((this.ocnSecuencial == null && other.ocnSecuencial != null) || (this.ocnSecuencial != null && !this.ocnSecuencial.equals(other.ocnSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosOrdenCompraNotificaciones[ ocnSecuencial=" + ocnSecuencial + " ]";
    }
    
}
