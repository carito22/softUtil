/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. getAdministrarTarea
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
public class RhPreavisoAnticiposPrestamosSueldoGuayaquilTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "pre_secuencial")
    private String preSecuencial;

    @Column(name = "pre_valor")
    private String preValor;

    @Column(name = "pre_valor_numeric")
    private BigDecimal preTotalPagado;

    @Column(name = "pre_motivo")
    private String preMotivo;

    @Column(name = "pre_tipo_nota")
    private String preTipoNota;

    @Column(name = "pre_agencia")
    private String preAgencia;

    @Column(name = "pre_codigo_pago_interbancario")
    private String preCodigoPagoInterbancario;

    @Column(name = "pre_cuenta_titular_nombre")
    private String preCuentaTitularNombre;

    @Column(name = "pre_motivo_nuevo")
    private String preMotivoNuevo;

    @Column(name = "pre_beneficiario_cuenta_tipo")
    private String preCuentaTipo;

    @Column(name = "pre_beneficiario_cuenta_nombre")
    private String preBeneficiarioCuentaNombre;

    @Column(name = "pre_beneficiario_cuenta_numero")
    private String preCuentaNumero;

    @Column(name = "pre_beneficiario_telefono")
    private String preBeneficiarioTelefono;

    @Column(name = "pre_beneficiario_correo")
    private String preBeneficiarioCorreo;

    @Column(name = "pre_beneficiario_tipo_id")
    private String preBeneficiarioTipoId;

    @Column(name = "pre_beneficiario_id")
    private String preBeneficiarioNumeroId;

    @Column(name = "pre_cuenta_nombre")
    private String preCuentaNombre;

    @Column(name = "pre_banco_codigo")
    private String preBancoCodigo;
    
    @Column(name = "pre_contable")
    private String preContable;

    public RhPreavisoAnticiposPrestamosSueldoGuayaquilTO() {
    }

    public String getPreBeneficiarioCuentaNombre() {
        return preBeneficiarioCuentaNombre;
    }

    public void setPreBeneficiarioCuentaNombre(String preBeneficiarioCuentaNombre) {
        this.preBeneficiarioCuentaNombre = preBeneficiarioCuentaNombre;
    }

    public String getPreBancoCodigo() {
        return preBancoCodigo;
    }

    public void setPreBancoCodigo(String preBancoCodigo) {
        this.preBancoCodigo = preBancoCodigo;
    }

    public String getPreCodigoPagoInterbancario() {
        return preCodigoPagoInterbancario;
    }

    public void setPreCodigoPagoInterbancario(String preCodigoPagoInterbancario) {
        this.preCodigoPagoInterbancario = preCodigoPagoInterbancario;
    }

    public String getPreCuentaTitularNombre() {
        return preCuentaTitularNombre;
    }

    public void setPreCuentaTitularNombre(String preCuentaTitularNombre) {
        this.preCuentaTitularNombre = preCuentaTitularNombre;
    }

    public String getPreMotivoNuevo() {
        return preMotivoNuevo;
    }

    public void setPreMotivoNuevo(String preMotivoNuevo) {
        this.preMotivoNuevo = preMotivoNuevo;
    }

    public String getPreSecuencial() {
        return preSecuencial;
    }

    public void setPreSecuencial(String preSecuencial) {
        this.preSecuencial = preSecuencial;
    }

    public String getPreValor() {
        return preValor;
    }

    public void setPreValor(String preValor) {
        this.preValor = preValor;
    }

    public String getPreMotivo() {
        return preMotivo;
    }

    public void setPreMotivo(String preMotivo) {
        this.preMotivo = preMotivo;
    }

    public String getPreTipoNota() {
        return preTipoNota;
    }

    public void setPreTipoNota(String preTipoNota) {
        this.preTipoNota = preTipoNota;
    }

    public String getPreAgencia() {
        return preAgencia;
    }

    public void setPreAgencia(String preAgencia) {
        this.preAgencia = preAgencia;
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

    public String getPreCuentaNombre() {
        return preCuentaNombre;
    }

    public void setPreCuentaNombre(String preCuentaNombre) {
        this.preCuentaNombre = preCuentaNombre;
    }

    public String getPreBeneficiarioTelefono() {
        return preBeneficiarioTelefono;
    }

    public void setPreBeneficiarioTelefono(String preBeneficiarioTelefono) {
        this.preBeneficiarioTelefono = preBeneficiarioTelefono;
    }

    public String getPreBeneficiarioCorreo() {
        return preBeneficiarioCorreo;
    }

    public void setPreBeneficiarioCorreo(String preBeneficiarioCorreo) {
        this.preBeneficiarioCorreo = preBeneficiarioCorreo;
    }

    public BigDecimal getPreTotalPagado() {
        return preTotalPagado;
    }

    public void setPreTotalPagado(BigDecimal preTotalPagado) {
        this.preTotalPagado = preTotalPagado;
    }

    public String getPreContable() {
        return preContable;
    }

    public void setPreContable(String preContable) {
        this.preContable = preContable;
    }

}
