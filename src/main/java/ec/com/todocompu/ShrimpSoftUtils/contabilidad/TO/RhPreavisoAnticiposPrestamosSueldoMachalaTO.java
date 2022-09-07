/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author KevinQuispe
 */
@Entity
public class RhPreavisoAnticiposPrestamosSueldoMachalaTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "pre_tipo_registro")
    private String preTipoRegistro;

    @Id
    @Column(name = "pre_secuencial")
    private String preSecuencial;

    @Column(name = "pre_codigo")
    private String preCodigo;

    @Column(name = "pre_moneda")
    private String preMoneda;

    @Column(name = "pre_total_pagado")
    private String preTotalPagado;

    @Column(name = "pre_total_pagado_numeric")
    private BigDecimal preTotalPagadoNumeric;

    @Column(name = "pre_cuenta")
    private String preCuenta;

    @Column(name = "pre_cuenta_tipo")
    private String preCuentaTipo;

    @Column(name = "pre_cuenta_numero")
    private String preCuentaNumero;

    @Column(name = "pre_referencia")
    private String preReferencia;

    @Column(name = "pre_beneficiario_tipo_id")
    private String preBeneficiarioTipoId;

    @Column(name = "pre_beneficiario_id")
    private String preBeneficiarioNumeroId;

    @Column(name = "pre_beneficiario_nombre")
    private String preBeneficiarioNombre;

    @Column(name = "pre_codigo_banco")
    private String preCodigoBanco;

    @Column(name = "pre_prefijo_empresarial")
    private String prePrefijoEmpresarial;
    
     @Column(name = "pre_contable")
    private String preContable;

    public RhPreavisoAnticiposPrestamosSueldoMachalaTO() {
    }

    public RhPreavisoAnticiposPrestamosSueldoMachalaTO(String preTipoRegistro, String preSecuencial, String preCodigo, String preMoneda, String preTotalPagado, String preCuenta, String preCuentaTipo, String preCuentaNumero, String preReferencia, String preBeneficiarioTipoId, String preBeneficiarioNumeroId, String preBeneficiarioNombre, String preCodigoBanco, String prePrefijoEmpresarial) {
        this.preTipoRegistro = preTipoRegistro;
        this.preSecuencial = preSecuencial;
        this.preCodigo = preCodigo;
        this.preMoneda = preMoneda;
        this.preTotalPagado = preTotalPagado;
        this.preCuenta = preCuenta;
        this.preCuentaTipo = preCuentaTipo;
        this.preCuentaNumero = preCuentaNumero;
        this.preReferencia = preReferencia;
        this.preBeneficiarioTipoId = preBeneficiarioTipoId;
        this.preBeneficiarioNumeroId = preBeneficiarioNumeroId;
        this.preBeneficiarioNombre = preBeneficiarioNombre;
        this.preCodigoBanco = preCodigoBanco;
        this.prePrefijoEmpresarial = prePrefijoEmpresarial;
    }

    public String getPreTipoRegistro() {
        return preTipoRegistro;
    }

    public void setPreTipoRegistro(String preTipoRegistro) {
        this.preTipoRegistro = preTipoRegistro;
    }

    public String getPreSecuencial() {
        return preSecuencial;
    }

    public void setPreSecuencial(String preSecuencial) {
        this.preSecuencial = preSecuencial;
    }

    public String getPreCodigo() {
        return preCodigo;
    }

    public void setPreCodigo(String preCodigo) {
        this.preCodigo = preCodigo;
    }

    public String getPreMoneda() {
        return preMoneda;
    }

    public void setPreMoneda(String preMoneda) {
        this.preMoneda = preMoneda;
    }

    public String getPreTotalPagado() {
        return preTotalPagado;
    }

    public void setPreTotalPagado(String preTotalPagado) {
        this.preTotalPagado = preTotalPagado;
    }

    public String getPreCuenta() {
        return preCuenta;
    }

    public void setPreCuenta(String preCuenta) {
        this.preCuenta = preCuenta;
    }

    public String getPreCuentaTipo() {
        return preCuentaTipo;
    }

    public void setPreCuentaTipo(String preCuentaTipo) {
        this.preCuentaTipo = preCuentaTipo;
    }

    public String getPreCuentaNumero() {
        return preCuentaNumero;
    }

    public void setPreCuentaNumero(String preCuentaNumero) {
        this.preCuentaNumero = preCuentaNumero;
    }

    public String getPreReferencia() {
        return preReferencia;
    }

    public void setPreReferencia(String preReferencia) {
        this.preReferencia = preReferencia;
    }

    public String getPreBeneficiarioTipoId() {
        return preBeneficiarioTipoId;
    }

    public void setPreBeneficiarioTipoId(String preBeneficiarioTipoId) {
        this.preBeneficiarioTipoId = preBeneficiarioTipoId;
    }

    public String getPreBeneficiarioNumeroId() {
        return preBeneficiarioNumeroId;
    }

    public void setPreBeneficiarioNumeroId(String preBeneficiarioNumeroId) {
        this.preBeneficiarioNumeroId = preBeneficiarioNumeroId;
    }

    public String getPreBeneficiarioNombre() {
        return preBeneficiarioNombre;
    }

    public void setPreBeneficiarioNombre(String preBeneficiarioNombre) {
        this.preBeneficiarioNombre = preBeneficiarioNombre;
    }

    public String getPreCodigoBanco() {
        return preCodigoBanco;
    }

    public void setPreCodigoBanco(String preCodigoBanco) {
        this.preCodigoBanco = preCodigoBanco;
    }

    public String getPrePrefijoEmpresarial() {
        return prePrefijoEmpresarial;
    }

    public void setPrePrefijoEmpresarial(String prePrefijoEmpresarial) {
        this.prePrefijoEmpresarial = prePrefijoEmpresarial;
    }

    @Override
    public String toString() {
        return "RhPreavisoAnticiposPrestamosSueldoMachalaTO{" + "preTipoRegistro=" + preTipoRegistro + ", preSecuencial=" + preSecuencial + ", preCodigo=" + preCodigo + ", preMoneda=" + preMoneda + ", preTotalPagado=" + preTotalPagado + ", preCuenta=" + preCuenta + ", preCuentaTipo=" + preCuentaTipo + ", preCuentaNumero=" + preCuentaNumero + ", preReferencia=" + preReferencia + ", preBeneficiarioTipoId=" + preBeneficiarioTipoId + ", preBeneficiarioNumeroId=" + preBeneficiarioNumeroId + ", preBeneficiarioNombre=" + preBeneficiarioNombre + ", preCodigoBanco=" + preCodigoBanco + ", prePrefijoEmpresarial=" + prePrefijoEmpresarial + '}';
    }

    public BigDecimal getPreTotalPagadoNumeric() {
        return preTotalPagadoNumeric;
    }

    public void setPreTotalPagadoNumeric(BigDecimal preTotalPagadoNumeric) {
        this.preTotalPagadoNumeric = preTotalPagadoNumeric;
    }

    public String getPreContable() {
        return preContable;
    }

    public void setPreContable(String preContable) {
        this.preContable = preContable;
    }

}
