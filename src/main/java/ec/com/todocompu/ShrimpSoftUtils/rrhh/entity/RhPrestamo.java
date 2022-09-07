package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContable;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConCuentas;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdSector;

@Entity
@Table(name = "rh_prestamo", schema = "recursoshumanos")
public class RhPrestamo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer preSecuencial;
    private BigDecimal preValor;
    private short preNumeroPagos;
    private String preDocumento;
    private String preObservaciones;
    private boolean preAuxiliar;
    private PrdSector prdSector;
    private ConCuentas conCuentas;
    private ConContable conContable;
    private RhEmpleado rhEmpleado;
    private String motEmpresa;
    private String motDetalle;

    public RhPrestamo() {
    }

    public RhPrestamo(Integer preSecuencial) {
        this.preSecuencial = preSecuencial;
    }

    public RhPrestamo(Integer preSecuencial, BigDecimal preValor, short preNumeroPagos, String preDocumento,
            String preObservaciones, boolean preAuxiliar, PrdSector prdSector, ConCuentas conCuentas,
            ConContable conContable, RhEmpleado rhEmpleado, String motEmpresa, String motDetalle) {
        this.preSecuencial = preSecuencial;
        this.preValor = preValor;
        this.preNumeroPagos = preNumeroPagos;
        this.preDocumento = preDocumento;
        this.preObservaciones = preObservaciones;
        this.preAuxiliar = preAuxiliar;
        this.prdSector = prdSector;
        this.conCuentas = conCuentas;
        this.conContable = conContable;
        this.rhEmpleado = rhEmpleado;
        this.motEmpresa = motEmpresa;
        this.motDetalle = motDetalle;
    }

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "pre_secuencial")
    public Integer getPreSecuencial() {
        return preSecuencial;
    }

    public void setPreSecuencial(Integer preSecuencial) {
        this.preSecuencial = preSecuencial;
    }

    @Column(name = "pre_valor")
    public BigDecimal getPreValor() {
        return preValor;
    }

    public void setPreValor(BigDecimal preValor) {
        this.preValor = preValor;
    }

    @Column(name = "pre_numero_pagos")
    public short getPreNumeroPagos() {
        return preNumeroPagos;
    }

    public void setPreNumeroPagos(short preNumeroPagos) {
        this.preNumeroPagos = preNumeroPagos;
    }

    @Column(name = "pre_documento")
    public String getPreDocumento() {
        return preDocumento;
    }

    public void setPreDocumento(String preDocumento) {
        this.preDocumento = preDocumento;
    }

    @Column(name = "pre_observaciones")
    public String getPreObservaciones() {
        return preObservaciones;
    }

    public void setPreObservaciones(String preObservaciones) {
        this.preObservaciones = preObservaciones;
    }

    @Column(name = "pre_auxiliar")
    public boolean isPreAuxiliar() {
        return preAuxiliar;
    }

    public void setPreAuxiliar(boolean preAuxiliar) {
        this.preAuxiliar = preAuxiliar;
    }

    @Column(name = "mot_empresa")
    public String getMotEmpresa() {
        return motEmpresa;
    }

    public void setMotEmpresa(String motEmpresa) {
        this.motEmpresa = motEmpresa;
    }

    @Column(name = "mot_detalle")
    public String getMotDetalle() {
        return motDetalle;
    }

    public void setMotDetalle(String motDetalle) {
        this.motDetalle = motDetalle;
    }

    @JoinColumns({
        @JoinColumn(name = "sec_empresa", referencedColumnName = "sec_empresa")
        ,
			@JoinColumn(name = "sec_codigo", referencedColumnName = "sec_codigo")})
    @ManyToOne(optional = false)
    public PrdSector getPrdSector() {
        return prdSector;
    }

    public void setPrdSector(PrdSector prdSector) {
        this.prdSector = prdSector;
    }

    @JoinColumns({
        @JoinColumn(name = "cta_empresa", referencedColumnName = "cta_empresa")
        ,
			@JoinColumn(name = "cta_codigo", referencedColumnName = "cta_codigo")})
    @ManyToOne(optional = false)
    public ConCuentas getConCuentas() {
        return conCuentas;
    }

    public void setConCuentas(ConCuentas conCuentas) {
        this.conCuentas = conCuentas;
    }

    @JoinColumns({
        @JoinColumn(name = "con_empresa", referencedColumnName = "con_empresa")
        ,
			@JoinColumn(name = "con_periodo", referencedColumnName = "con_periodo")
        ,
			@JoinColumn(name = "con_tipo", referencedColumnName = "con_tipo")
        ,
			@JoinColumn(name = "con_numero", referencedColumnName = "con_numero")})
    @ManyToOne(optional = false)
    public ConContable getConContable() {
        return conContable;
    }

    public void setConContable(ConContable conContable) {
        this.conContable = conContable;
    }

    @JoinColumns({
        @JoinColumn(name = "emp_empresa", referencedColumnName = "emp_empresa")
        ,
			@JoinColumn(name = "emp_id", referencedColumnName = "emp_id")})
    @ManyToOne(optional = false)
    public RhEmpleado getRhEmpleado() {
        return rhEmpleado;
    }

    public void setRhEmpleado(RhEmpleado rhEmpleado) {
        this.rhEmpleado = rhEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (preSecuencial != null ? preSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof RhPrestamo)) {
            return false;
        }
        RhPrestamo other = (RhPrestamo) object;
        if ((this.preSecuencial == null && other.preSecuencial != null)
                || (this.preSecuencial != null && !this.preSecuencial.equals(other.preSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rrhh.entity.RhPrestamo[ preSecuencial=" + preSecuencial + " ]";
    }
}
