/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhHorasExtrasTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "emp_empresa")
    private String empEmpresa;

    @Id
    @Column(name = "he_secuencial")
    private Integer horasExtrasSecuencial;

    @Column(name = "he_concepto")
    private String horasExtrasConcepto;

    @Column(name = "he_cantidad")
    private Integer horasExtrasCantidad;

    @Column(name = "he_precio")
    private BigDecimal horasExtrasPrecio;

    @Column(name = "he_valor")
    private BigDecimal horasExtrasValor;

    @Column(name = "he_observacion")
    private String horasExtrasObservacion;

    @Column(name = "he_reversado")
    private Boolean reversar;

    @Column(name = "emp_id")
    private String empId;

    @Column(name = "sec_codigo")
    private String secCodigo;

    @Column(name = "pis_numero")
    private String pisNumero;

    public RhHorasExtrasTO() {
    }

    public String getEmpEmpresa() {
        return empEmpresa;
    }

    public void setEmpEmpresa(String empEmpresa) {
        this.empEmpresa = empEmpresa;
    }

    public Integer getHorasExtrasSecuencial() {
        return horasExtrasSecuencial;
    }

    public void setHorasExtrasSecuencial(Integer horasExtrasSecuencial) {
        this.horasExtrasSecuencial = horasExtrasSecuencial;
    }

    public String getHorasExtrasConcepto() {
        return horasExtrasConcepto;
    }

    public void setHorasExtrasConcepto(String horasExtrasConcepto) {
        this.horasExtrasConcepto = horasExtrasConcepto;
    }

    public Integer getHorasExtrasCantidad() {
        return horasExtrasCantidad;
    }

    public void setHorasExtrasCantidad(Integer horasExtrasCantidad) {
        this.horasExtrasCantidad = horasExtrasCantidad;
    }

    public BigDecimal getHorasExtrasPrecio() {
        return horasExtrasPrecio;
    }

    public void setHorasExtrasPrecio(BigDecimal horasExtrasPrecio) {
        this.horasExtrasPrecio = horasExtrasPrecio;
    }

    public BigDecimal getHorasExtrasValor() {
        return horasExtrasValor;
    }

    public void setHorasExtrasValor(BigDecimal horasExtrasValor) {
        this.horasExtrasValor = horasExtrasValor;
    }

    public String getHorasExtrasObservacion() {
        return horasExtrasObservacion;
    }

    public void setHorasExtrasObservacion(String horasExtrasObservacion) {
        this.horasExtrasObservacion = horasExtrasObservacion;
    }

    public Boolean getReversar() {
        return reversar;
    }

    public void setReversar(Boolean reversar) {
        this.reversar = reversar;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

}
