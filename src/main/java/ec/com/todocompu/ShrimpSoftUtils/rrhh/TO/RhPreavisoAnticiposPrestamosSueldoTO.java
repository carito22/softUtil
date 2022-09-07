/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhPreavisoAnticiposPrestamosSueldoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "pre_tipo_registro")
    private String preTipoRegistro;

    @Id
    @Column(name = "pre_secuencial")
    private String preSecuencial;

    @Column(name = "pre_beneficiario_codigo")
    private String preBeneficiarioCodigo;

    @Column(name = "pre_beneficiario_tipo_id")
    private String preBeneficiarioTipoId;

    @Column(name = "pre_beneficiario_id")
    private String preBeneficiarioNumeroId;

    @Column(name = "pre_beneficiario_nombre")
    private String preBeneficiarioNombre;

    @Column(name = "pre_forma_pago")
    private String preFormaPago;

    @Column(name = "pre_codigo_pais")
    private String preCodigoPais;

    @Column(name = "pre_codigo_banco")
    private String preCodigoBanco;

    @Column(name = "pre_cuenta_tipo")
    private String preCuentaTipo;

    @Column(name = "pre_cuenta_numero")
    private String preCuentaNumero;

    @Column(name = "pre_codigo_moneda")
    private String preCodigoMoneda;

    @Column(name = "pre_total_pagado")
    private String preTotalPagado;

    @Column(name = "pre_total_pagado_numeric")
    private BigDecimal preTotalPagadoNumeric;

    @Column(name = "pre_concepto")
    private String preConcepto;

    @Column(name = "pre_codigo_bancario")
    private String preCodigoBancario;

    @Column(name = "pre_codigo_servicio")
    private String preCodigoServicio;

    @Column(name = "pre_motivo_pago")
    private String preMotivoPago;
    
    @Column(name = "pre_contable")
    private String preContable;

    public RhPreavisoAnticiposPrestamosSueldoTO() {
    }

    public RhPreavisoAnticiposPrestamosSueldoTO(String preTipoRegistro, String preSecuencial,
            String preBeneficiarioCodigo, String preBeneficiarioTipoId, String preBeneficiarioNumeroId,
            String preBeneficiarioNombre, String preFormaPago, String preCodigoPais, String preCodigoBanco,
            String preCuentaTipo, String preCuentaNumero, String preCodigoMoneda, String preTotalPagado,
            String preConcepto, String preCodigoBancario, String preCodigoServicio, String preMotivoPago) {
        this.preTipoRegistro = preTipoRegistro;
        this.preSecuencial = preSecuencial;
        this.preBeneficiarioCodigo = preBeneficiarioCodigo;
        this.preBeneficiarioTipoId = preBeneficiarioTipoId;
        this.preBeneficiarioNumeroId = preBeneficiarioNumeroId;
        this.preBeneficiarioNombre = preBeneficiarioNombre;
        this.preFormaPago = preFormaPago;
        this.preCodigoPais = preCodigoPais;
        this.preCodigoBanco = preCodigoBanco;
        this.preCuentaTipo = preCuentaTipo;
        this.preCuentaNumero = preCuentaNumero;
        this.preCodigoMoneda = preCodigoMoneda;
        this.preTotalPagado = preTotalPagado;
        this.preConcepto = preConcepto;
        this.preCodigoBancario = preCodigoBancario;
        this.preCodigoServicio = preCodigoServicio;
        this.preMotivoPago = preMotivoPago;
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

    public String getPreBeneficiarioCodigo() {
        return preBeneficiarioCodigo;
    }

    public void setPreBeneficiarioCodigo(String preBeneficiarioCodigo) {
        this.preBeneficiarioCodigo = preBeneficiarioCodigo;
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

    public String getPreFormaPago() {
        return preFormaPago;
    }

    public void setPreFormaPago(String preFormaPago) {
        this.preFormaPago = preFormaPago;
    }

    public String getPreCodigoPais() {
        return preCodigoPais;
    }

    public void setPreCodigoPais(String preCodigoPais) {
        this.preCodigoPais = preCodigoPais;
    }

    public String getPreCodigoBanco() {
        return preCodigoBanco;
    }

    public void setPreCodigoBanco(String preCodigoBanco) {
        this.preCodigoBanco = preCodigoBanco;
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

    public String getPreCodigoMoneda() {
        return preCodigoMoneda;
    }

    public void setPreCodigoMoneda(String preCodigoMoneda) {
        this.preCodigoMoneda = preCodigoMoneda;
    }

    public String getPreTotalPagado() {
        return preTotalPagado;
    }

    public void setPreTotalPagado(String preTotalPagado) {
        this.preTotalPagado = preTotalPagado;
    }

    public String getPreConcepto() {
        return preConcepto;
    }

    public void setPreConcepto(String preConcepto) {
        this.preConcepto = preConcepto;
    }

    public String getPreCodigoBancario() {
        return preCodigoBancario;
    }

    public void setPreCodigoBancario(String preCodigoBancario) {
        this.preCodigoBancario = preCodigoBancario;
    }

    public String getPreCodigoServicio() {
        return preCodigoServicio;
    }

    public void setPreCodigoServicio(String preCodigoServicio) {
        this.preCodigoServicio = preCodigoServicio;
    }

    public String getPreMotivoPago() {
        return preMotivoPago;
    }

    public void setPreMotivoPago(String preMotivoPago) {
        this.preMotivoPago = preMotivoPago;
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
