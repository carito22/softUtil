/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class CarComboPagosCobrosFormaTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "fp_secuencial")
    private Integer fpSecuencial;

    @Column(name = "fp_detalle")
    private String fpDetalle;

    @Column(name = "cta_codigo")
    @Basic(optional = true)
    private String ctaCodigo;

    @Column(name = "validar")
    @Basic(optional = true)
    private Boolean validar;

    @Column(name = "post_fechados")
    // @Basic(optional = true)
    private Boolean postFechados;

    @Column(name = "numeracion")
    private String numeracion;

    public CarComboPagosCobrosFormaTO() {
    }

    public CarComboPagosCobrosFormaTO(Integer fpSecuencial, String fpDetalle, String ctaCodigo, Boolean validar,
            Boolean postFechados) {
        this.fpSecuencial = fpSecuencial;
        this.fpDetalle = fpDetalle;
        this.ctaCodigo = ctaCodigo;
        this.validar = validar;
        this.postFechados = postFechados;
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

    public Integer getFpSecuencial() {
        return fpSecuencial;
    }

    public void setFpSecuencial(Integer fpSecuencial) {
        this.fpSecuencial = fpSecuencial;
    }

    public Boolean getValidar() {
        return validar;
    }

    public void setValidar(Boolean validar) {
        this.validar = validar;
    }

    public Boolean getPostFechados() {
        return postFechados;
    }

    public void setPostFechados(Boolean postFechados) {
        this.postFechados = postFechados;
    }

    @Override
    public String toString() {
        return this.fpDetalle;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }
    
}
