/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhListaFormaPagoBeneficioSocialTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "cta_codigo")
    private String ctaCodigo;
    @Id
    @Column(name = "fp_secuencial")
    private Integer fpSecuencial;

    @Column(name = "fp_detalle")
    private String fpDetalle;

    @Column(name = "fp_codigo_ministerial")
    private String fpCodigoMinisterial;

    @Column(name = "sec_codigo")
    private String secCodigo;

    @Column(name = "fp_inactivo")
    private Boolean fpInactivo;

    public RhListaFormaPagoBeneficioSocialTO() {
    }

    public RhListaFormaPagoBeneficioSocialTO(String ctaCodigo, Integer fpSecuencial, String fpDetalle,
            String fpCodigoMinisterial, String secCodigo, Boolean fpInactivo) {
        this.ctaCodigo = ctaCodigo;
        this.fpSecuencial = fpSecuencial;
        this.fpDetalle = fpDetalle;
        this.fpCodigoMinisterial = fpCodigoMinisterial;
        this.secCodigo = secCodigo;
        this.fpInactivo = fpInactivo;
    }

    public String getCtaCodigo() {
        return ctaCodigo;
    }

    public void setCtaCodigo(String ctaCodigo) {
        this.ctaCodigo = ctaCodigo;
    }

    public String getFpCodigoMinisterial() {
        return fpCodigoMinisterial;
    }

    public void setFpCodigoMinisterial(String fpCodigoMinisterial) {
        this.fpCodigoMinisterial = fpCodigoMinisterial;
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

}
