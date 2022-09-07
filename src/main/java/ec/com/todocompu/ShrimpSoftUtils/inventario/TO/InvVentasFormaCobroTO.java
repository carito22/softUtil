/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author DEVELOPER3
 */
@Entity
public class InvVentasFormaCobroTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "fc_secuencial")
    private Integer fcSecuencial;

    @Column(name = "fc_detalle")
    private String fcDetalle;

    @Column(name = "fc_tipo_principal")
    private String fcTipoPrincipal;

    @Column(name = "fc_inactivo")
    private Boolean fcInactivo;

    @Column(name = "cta_empresa")
    private String ctaEmpresa;

    @Column(name = "cta_codigo")
    private String ctaCodigo;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    public InvVentasFormaCobroTO() {

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

    public Boolean getFcInactivo() {
        return fcInactivo;
    }

    public void setFcInactivo(Boolean fcInactivo) {
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

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

}
