/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class ConFunContablesVerificacionesTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "vc_id")
    private Integer id;
    @Column(name = "vc_periodo")
    private String vcPeriodo;
    @Column(name = "vc_tipo")
    private String vcTipo;
    @Column(name = "vc_numero")
    private String vcNumero;
    @Column(name = "vc_fecha")
    private String vcFecha;
    @Column(name = "vc_reversado")
    private Boolean vcReversado;
    @Column(name = "vc_pendiente")
    private Boolean vcPendiente;
    @Column(name = "vc_bloqueado")
    private Boolean vcBloqueado;
    @Column(name = "vc_anulado")
    private Boolean vcAnulado;
    @Column(name = "vc_debitos")
    private java.math.BigDecimal vcDebitos;
    @Column(name = "vc_creditos")
    private java.math.BigDecimal vcCreditos;
    @Column(name = "vc_observaciones")
    private String vcObservaciones;
    @Column(name = "vc_referencia")
    private String vcReferencia;

    public ConFunContablesVerificacionesTO() {
    }

    public ConFunContablesVerificacionesTO(String vcPeriodo, String vcTipo, String vcNumero, String vcFecha,
            Boolean vcPendiente, Boolean vcBloqueado, Boolean vcAnulado, BigDecimal vcDebitos, BigDecimal vcCreditos,
            String vcObservaciones, Integer id) {
        this.vcPeriodo = vcPeriodo;
        this.vcTipo = vcTipo;
        this.vcNumero = vcNumero;
        this.vcFecha = vcFecha;
        this.vcPendiente = vcPendiente;
        this.vcBloqueado = vcBloqueado;
        this.vcAnulado = vcAnulado;
        this.vcDebitos = vcDebitos;
        this.vcCreditos = vcCreditos;
        this.vcObservaciones = vcObservaciones;
        this.id = id;
    }

    public String getVcReferencia() {
        return vcReferencia;
    }

    public void setVcReferencia(String vcReferencia) {
        this.vcReferencia = vcReferencia;
    }

    public Boolean getVcReversado() {
        return vcReversado;
    }

    public void setVcReversado(Boolean vcReversado) {
        this.vcReversado = vcReversado;
    }

    public Boolean getVcAnulado() {
        return vcAnulado;
    }

    public void setVcAnulado(Boolean vcAnulado) {
        this.vcAnulado = vcAnulado;
    }

    public Boolean getVcBloqueado() {
        return vcBloqueado;
    }

    public void setVcBloqueado(Boolean vcBloqueado) {
        this.vcBloqueado = vcBloqueado;
    }

    public BigDecimal getVcCreditos() {
        return vcCreditos;
    }

    public void setVcCreditos(BigDecimal vcCreditos) {
        this.vcCreditos = vcCreditos;
    }

    public BigDecimal getVcDebitos() {
        return vcDebitos;
    }

    public void setVcDebitos(BigDecimal vcDebitos) {
        this.vcDebitos = vcDebitos;
    }

    public String getVcFecha() {
        return vcFecha;
    }

    public void setVcFecha(String vcFecha) {
        this.vcFecha = vcFecha;
    }

    public String getVcNumero() {
        return vcNumero;
    }

    public void setVcNumero(String vcNumero) {
        this.vcNumero = vcNumero;
    }

    public String getVcObservaciones() {
        return vcObservaciones;
    }

    public void setVcObservaciones(String vcObservaciones) {
        this.vcObservaciones = vcObservaciones;
    }

    public Boolean getVcPendiente() {
        return vcPendiente;
    }

    public void setVcPendiente(Boolean vcPendiente) {
        this.vcPendiente = vcPendiente;
    }

    public String getVcPeriodo() {
        return vcPeriodo;
    }

    public void setVcPeriodo(String vcPeriodo) {
        this.vcPeriodo = vcPeriodo;
    }

    public String getVcTipo() {
        return vcTipo;
    }

    public void setVcTipo(String vcTipo) {
        this.vcTipo = vcTipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
