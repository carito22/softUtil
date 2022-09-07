/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvCliente;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
 * @author VALDIVIEZO
 */
@Entity
@Table(name = "sis_promesa_pago", schema = "sistemaweb")
public class SisPromesaPago {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pro_secuencial")
    private Integer proSecuencial;
    @JoinColumns({
        @JoinColumn(name = "cli_empresa", referencedColumnName = "cli_empresa")
        , @JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo")})
    @ManyToOne(optional = false)
    private InvCliente invCliente;
    @Column(name = "pro_fecha_pago")
    private Date proFechaPago;
    @Column(name = "pro_observacion")
    private String proObservacion;
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

    public SisPromesaPago() {
    }

    public SisPromesaPago(Integer proSecuencial) {
        this.proSecuencial = proSecuencial;
    }

    public SisPromesaPago(Integer proSecuencial, InvCliente invCliente, Date proFechaPago, String proObservacion, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.proSecuencial = proSecuencial;
        this.invCliente = invCliente;
        this.proFechaPago = proFechaPago;
        this.proObservacion = proObservacion;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public Integer getProSecuencial() {
        return proSecuencial;
    }

    public void setProSecuencial(Integer proSecuencial) {
        this.proSecuencial = proSecuencial;
    }

    public InvCliente getInvCliente() {
        return invCliente;
    }

    public void setInvCliente(InvCliente invCliente) {
        this.invCliente = invCliente;
    }

    public Date getProFechaPago() {
        return proFechaPago;
    }

    public void setProFechaPago(Date proFechaPago) {
        this.proFechaPago = proFechaPago;
    }

    public String getProObservacion() {
        return proObservacion;
    }

    public void setProObservacion(String proObservacion) {
        this.proObservacion = proObservacion;
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

}
