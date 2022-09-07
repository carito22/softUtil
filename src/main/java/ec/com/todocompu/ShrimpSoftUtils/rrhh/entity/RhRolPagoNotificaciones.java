/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "rh_rol_pago_notificaciones", schema = "recursoshumanos")
public class RhRolPagoNotificaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rpn_secuencial")
    private Integer rpnSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "rpn_destinatario")
    private String rpnDestinatario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rpn_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rpnFecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "rpn_tipo")
    private String rpnTipo;
    @Size(max = 2147483647)
    @Column(name = "rpn_observacion")
    private String rpnObservacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "rpn_informe")
    private String rpnInforme;
    /*+**************************************************/
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "rpn_contable")
    private String rpnContable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "rpn_empresa")
    private String rpnEmpresa;
    @Column(name = "rpn_empleado")
    private String rpnEmpleado;

    public RhRolPagoNotificaciones() {
    }

    public Integer getRpnSecuencial() {
        return rpnSecuencial;
    }

    public void setRpnSecuencial(Integer rpnSecuencial) {
        this.rpnSecuencial = rpnSecuencial;
    }

    public String getRpnDestinatario() {
        return rpnDestinatario;
    }

    public void setRpnDestinatario(String rpnDestinatario) {
        this.rpnDestinatario = rpnDestinatario;
    }

    public Date getRpnFecha() {
        return rpnFecha;
    }

    public void setRpnFecha(Date rpnFecha) {
        this.rpnFecha = rpnFecha;
    }

    public String getRpnTipo() {
        return rpnTipo;
    }

    public void setRpnTipo(String rpnTipo) {
        this.rpnTipo = rpnTipo;
    }

    public String getRpnObservacion() {
        return rpnObservacion;
    }

    public void setRpnObservacion(String rpnObservacion) {
        this.rpnObservacion = rpnObservacion;
    }

    public String getRpnInforme() {
        return rpnInforme;
    }

    public void setRpnInforme(String rpnInforme) {
        this.rpnInforme = rpnInforme;
    }

    public String getRpnContable() {
        return rpnContable;
    }

    public void setRpnContable(String rpnContable) {
        this.rpnContable = rpnContable;
    }

    public String getRpnEmpresa() {
        return rpnEmpresa;
    }

    public void setRpnEmpresa(String rpnEmpresa) {
        this.rpnEmpresa = rpnEmpresa;
    }

    public String getRpnEmpleado() {
        return rpnEmpleado;
    }

    public void setRpnEmpleado(String rpnEmpleado) {
        this.rpnEmpleado = rpnEmpleado;
    }

}
