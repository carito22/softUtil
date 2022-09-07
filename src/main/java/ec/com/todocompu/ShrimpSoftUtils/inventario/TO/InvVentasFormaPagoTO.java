/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvVentasFormaPagoTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "fc_secuencial")
    private Integer fpSecuencial;

    @Column(name = "fc_detalle")
    private String fpDetalle;

    @Column(name = "fc_tipo_principal")
    private String fpTipoPrincipal;

    @Column(name = "fc_inactivo")
    private Boolean fpInactivo;
    // private String secEmpresa;

    // private String ctaEmpresa;
    @Column(name = "cta_codigo")
    private String ctaCodigo;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    public InvVentasFormaPagoTO() {
    }

    public InvVentasFormaPagoTO(Integer fpSecuencial, String fpDetalle, String fpTipoPrincipal, Boolean fpInactivo, String ctaCodigo, String usrEmpresa, String usrCodigo, String usrFechaInserta) {
        this.fpSecuencial = fpSecuencial;
        this.fpDetalle = fpDetalle;
        this.fpTipoPrincipal = fpTipoPrincipal;
        this.fpInactivo = fpInactivo;
        this.ctaCodigo = ctaCodigo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getCtaCodigo() {
        return ctaCodigo;
    }

    public void setCtaCodigo(String ctaCodigo) {
        this.ctaCodigo = ctaCodigo;
    }

    public String getFpDetalle() {
        return fpDetalle;
    }

    public void setFpDetalle(String fpDetalle) {
        this.fpDetalle = fpDetalle;
    }

    public String getFpTipoPrincipal() {
        return fpTipoPrincipal;
    }

    public void setFpTipoPrincipal(String fpTipoPrincipal) {
        this.fpTipoPrincipal = fpTipoPrincipal;
    }

    public Boolean getFpInactivo() {
        return fpInactivo;
    }

    public void setFpInactivo(Boolean fpInactivo) {
        this.fpInactivo = fpInactivo;
    }

    public Integer getFpSecuencial() {
        return fpSecuencial;
    }

    public void setFpSecuencial(Integer fpSecuencial) {
        this.fpSecuencial = fpSecuencial;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }
}
