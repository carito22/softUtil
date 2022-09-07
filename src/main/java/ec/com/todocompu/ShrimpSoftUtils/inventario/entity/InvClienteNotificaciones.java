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
 * @author CarolValdiviezo
 */
@Entity
@Table(name = "inv_cliente_notificaciones", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvClienteNotificaciones.findAll", query = "SELECT a FROM InvClienteNotificaciones a")})
public class InvClienteNotificaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "e_secuencial")
    private Integer eSecuencial;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "e_destinatario")
    private String eDestinatario;

    @Basic(optional = false)
    @NotNull
    @Column(name = "e_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eFecha;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "e_tipo")
    private String eTipo;

    @Size(min = 1, max = 2147483647)
    @Column(name = "e_observacion")
    private String eObservacion;

    @Basic(optional = false)
    @NotNull
    @Column(name = "e_informe")
    private String eInforme;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cli_codigo")
    private String cliCodigo;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cli_empresa")
    private String cliEmpresa;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "asunto")
    private String asunto;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "motivo")
    private String motivo;

    public InvClienteNotificaciones() {
    }

    public Integer geteSecuencial() {
        return eSecuencial;
    }

    public void seteSecuencial(Integer eSecuencial) {
        this.eSecuencial = eSecuencial;
    }

    public String geteDestinatario() {
        return eDestinatario;
    }

    public void seteDestinatario(String eDestinatario) {
        this.eDestinatario = eDestinatario;
    }

    public Date geteFecha() {
        return eFecha;
    }

    public void seteFecha(Date eFecha) {
        this.eFecha = eFecha;
    }

    public String geteTipo() {
        return eTipo;
    }

    public void seteTipo(String eTipo) {
        this.eTipo = eTipo;
    }

    public String geteObservacion() {
        return eObservacion;
    }

    public void seteObservacion(String eObservacion) {
        this.eObservacion = eObservacion;
    }

    public String geteInforme() {
        return eInforme;
    }

    public void seteInforme(String eInforme) {
        this.eInforme = eInforme;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliEmpresa() {
        return cliEmpresa;
    }

    public void setCliEmpresa(String cliEmpresa) {
        this.cliEmpresa = cliEmpresa;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

}
