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
public class RhPrestamoTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "emp_codigo")
    private String empCodigo;

    @Column(name = "per_codigo")
    private String perCodigo;

    @Column(name = "tip_codigo")
    private String tipCodigo;

    @Column(name = "con_numero")
    private String conNumero;

    @Column(name = "emp_apellidos_nombres")
    private String empApellidosNombres;

    @Column(name = "pre_fecha")
    private String preFecha;

    @Column(name = "con_det_documento")
    private String conDetDocumento;

    @Column(name = "con_observaciones")
    private String conObservaciones;

    @Column(name = "sec_codigo")
    private String secCodigo;

    @Id
    @Column(name = "emp_id")
    private String empId;

    @Column(name = "reversar")
    private Boolean reversar;

    @Column(name = "usr_inserta_prestamo")
    private String usrInsertaPrestamo;

    @Column(name = "pre_formas_pago")
    private String preFormasPago;

    @Column(name = "pre_numero_pagos")
    private Integer preNumeroPagos;

    @Column(name = "pre_valor")
    private BigDecimal preValor;

    @Column(name = "pre_secuencial")
    private Integer preSecuencial;

    public RhPrestamoTO() {
    }

    public RhPrestamoTO(String empCodigo, String perCodigo, String tipCodigo, String conNumero, String secCodigo,
            String empId, String empApellidosNombres, String preFecha, Integer preNumeroPagos, BigDecimal preValor,
            String preFormasPago, String conDetDocumento, String conObservaciones, Boolean reversar,
            String usrInsertaPrestamo, Integer preSecuencial) {
        this.empCodigo = empCodigo;
        this.perCodigo = perCodigo;
        this.tipCodigo = tipCodigo;
        this.conNumero = conNumero;
        this.secCodigo = secCodigo;
        this.empId = empId;
        this.empApellidosNombres = empApellidosNombres;
        this.preFecha = preFecha;
        this.preNumeroPagos = preNumeroPagos;
        this.preValor = preValor;
        this.preFormasPago = preFormasPago;
        this.conDetDocumento = conDetDocumento;
        this.conObservaciones = conObservaciones;
        this.reversar = reversar;
        this.usrInsertaPrestamo = usrInsertaPrestamo;
        this.preSecuencial = preSecuencial;
    }

    public String getConDetDocumento() {
        return conDetDocumento;
    }

    public void setConDetDocumento(String conDetDocumento) {
        this.conDetDocumento = conDetDocumento;
    }

    public String getConNumero() {
        return conNumero;
    }

    public void setConNumero(String conNumero) {
        this.conNumero = conNumero;
    }

    public String getConObservaciones() {
        return conObservaciones;
    }

    public void setConObservaciones(String conObservaciones) {
        this.conObservaciones = conObservaciones;
    }

    public String getEmpApellidosNombres() {
        return empApellidosNombres;
    }

    public void setEmpApellidosNombres(String empApellidosNombres) {
        this.empApellidosNombres = empApellidosNombres;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getPerCodigo() {
        return perCodigo;
    }

    public void setPerCodigo(String perCodigo) {
        this.perCodigo = perCodigo;
    }

    public String getPreFecha() {
        return preFecha;
    }

    public void setPreFecha(String preFecha) {
        this.preFecha = preFecha;
    }

    public String getPreFormasPago() {
        return preFormasPago;
    }

    public void setPreFormasPago(String preFormasPago) {
        this.preFormasPago = preFormasPago;
    }

    public Integer getPreNumeroPagos() {
        return preNumeroPagos;
    }

    public void setPreNumeroPagos(Integer preNumeroPagos) {
        this.preNumeroPagos = preNumeroPagos;
    }

    public Integer getPreSecuencial() {
        return preSecuencial;
    }

    public void setPreSecuencial(Integer preSecuencial) {
        this.preSecuencial = preSecuencial;
    }

    public BigDecimal getPreValor() {
        return preValor;
    }

    public void setPreValor(BigDecimal preValor) {
        this.preValor = preValor;
    }

    public Boolean getReversar() {
        return reversar;
    }

    public void setReversar(Boolean reversar) {
        this.reversar = reversar;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getTipCodigo() {
        return tipCodigo;
    }

    public void setTipCodigo(String tipCodigo) {
        this.tipCodigo = tipCodigo;
    }

    public String getUsrInsertaPrestamo() {
        return usrInsertaPrestamo;
    }

    public void setUsrInsertaPrestamo(String usrInsertaPrestamo) {
        this.usrInsertaPrestamo = usrInsertaPrestamo;
    }

}
