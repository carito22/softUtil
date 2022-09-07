/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvComboFormaPagoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "fp_detalle")
    private String fpDetalle;

    @Column(name = "cta_codigo")
    private String ctaCodigo;

    @Column(name = "fp_secuencial")
    private Integer fpSecuencial;

    private Boolean validar;
    @Column(name = "fp_tipo_principal")
    private String fpTipoPrincipal;

    public InvComboFormaPagoTO() {
    }

    public InvComboFormaPagoTO(String fpDetalle, String ctaCodigo, Boolean validar) {
        this.fpDetalle = fpDetalle;
        this.ctaCodigo = ctaCodigo;
        this.validar = validar;
    }

    @Column(name = "cta_codigo")
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

    @Column(name = "validar")
    public Boolean getValidar() {
        return validar;
    }

    public void setValidar(Boolean validar) {
        this.validar = validar;
    }

    @Override
    public String toString() {
        return this.fpDetalle;
    }

    public String getFpTipoPrincipal() {
        return fpTipoPrincipal;
    }

    public void setFpTipoPrincipal(String fpTipoPrincipal) {
        this.fpTipoPrincipal = fpTipoPrincipal;
    }

    public Integer getFpSecuencial() {
        return fpSecuencial;
    }

    public void setFpSecuencial(Integer fpSecuencial) {
        this.fpSecuencial = fpSecuencial;
    }

}
