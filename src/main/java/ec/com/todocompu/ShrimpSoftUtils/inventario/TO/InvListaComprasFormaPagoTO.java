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
public class InvListaComprasFormaPagoTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "fp_secuencial")
    private Integer fpSecuencial;

    @Column(name = "fp_detalle")
    private String fpDetalle;

    @Column(name = "fp_inactivo")
    private Boolean fpInactivo;

    @Column(name = "sec_codigo")
    private String secCodigo;

    @Column(name = "cta_codigo")
    private String ctaCodigo;

    @Column(name = "fp_tipo_principal")
    private String fpTipoPrincipal;

    public InvListaComprasFormaPagoTO() {
    }

    public InvListaComprasFormaPagoTO(Integer fpSecuencial, String fpDetalle, Boolean fpInactivo, String secCodigo,
            String ctaCodigo) {
        this.fpSecuencial = fpSecuencial;
        this.fpDetalle = fpDetalle;
        this.fpInactivo = fpInactivo;
        this.secCodigo = secCodigo;
        this.ctaCodigo = ctaCodigo;
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

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getFpTipoPrincipal() {
        return fpTipoPrincipal;
    }

    public void setFpTipoPrincipal(String fpTipoPrincipal) {
        this.fpTipoPrincipal = fpTipoPrincipal;
    }

}
