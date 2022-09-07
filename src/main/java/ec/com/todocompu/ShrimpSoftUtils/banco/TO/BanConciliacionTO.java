/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class BanConciliacionTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "conc_empresa")
    private String concEmpresa;

    @Column(name = "conc_cuenta_contable")
    private String concCuentaContable;

    @Column(name = "conc_codigo")
    private String concCodigo;

    @Column(name = "conc_hasta")
    private String concHasta;

    @Column(name = "conc_saldo_estado_cuenta")
    private java.math.BigDecimal concSaldoEstadoCuenta;

    @Column(name = "conc_cheques_girados_y_no_cobrados")
    private java.math.BigDecimal concChequesGiradosYNoCobrados;

    @Column(name = "conc_depositos_en_transito")
    private java.math.BigDecimal concDepositosEnTransito;

    @Column(name = "conc_pendiente")
    private boolean concPendiente;

    @Column(name = "cta_empresa")
    private String ctaEmpresa;

    @Column(name = "cta_cuenta_contable")
    private String ctaCuentaContable;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    public BanConciliacionTO() {
    }

    public BanConciliacionTO(String concEmpresa, String concCuentaContable, String concCodigo, String concHasta,
            BigDecimal concSaldoEstadoCuenta, BigDecimal concChequesGiradosYNoCobrados,
            BigDecimal concDepositosEnTransito, boolean concPendiente, String usrCodigo, String usrFechaInserta) {
        this.concEmpresa = concEmpresa;
        this.concCuentaContable = concCuentaContable;
        this.concCodigo = concCodigo;
        this.concHasta = concHasta;
        this.concSaldoEstadoCuenta = concSaldoEstadoCuenta;
        this.concChequesGiradosYNoCobrados = concChequesGiradosYNoCobrados;
        this.concDepositosEnTransito = concDepositosEnTransito;
        this.concPendiente = concPendiente;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public BigDecimal getConcChequesGiradosYNoCobrados() {
        return concChequesGiradosYNoCobrados;
    }

    public void setConcChequesGiradosYNoCobrados(BigDecimal concChequesGiradosYNoCobrados) {
        this.concChequesGiradosYNoCobrados = concChequesGiradosYNoCobrados;
    }

    public String getConcCodigo() {
        return concCodigo;
    }

    public void setConcCodigo(String concCodigo) {
        this.concCodigo = concCodigo;
    }

    public String getConcCuentaContable() {
        return concCuentaContable;
    }

    public void setConcCuentaContable(String concCuentaContable) {
        this.concCuentaContable = concCuentaContable;
    }

    public BigDecimal getConcDepositosEnTransito() {
        return concDepositosEnTransito;
    }

    public void setConcDepositosEnTransito(BigDecimal concDepositosEnTransito) {
        this.concDepositosEnTransito = concDepositosEnTransito;
    }

    public String getConcEmpresa() {
        return concEmpresa;
    }

    public void setConcEmpresa(String concEmpresa) {
        this.concEmpresa = concEmpresa;
    }

    public String getConcHasta() {
        return concHasta;
    }

    public void setConcHasta(String concHasta) {
        this.concHasta = concHasta;
    }

    public boolean isConcPendiente() {
        return concPendiente;
    }

    public void setConcPendiente(boolean concPendiente) {
        this.concPendiente = concPendiente;
    }

    public BigDecimal getConcSaldoEstadoCuenta() {
        return concSaldoEstadoCuenta;
    }

    public void setConcSaldoEstadoCuenta(BigDecimal concSaldoEstadoCuenta) {
        this.concSaldoEstadoCuenta = concSaldoEstadoCuenta;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getCtaEmpresa() {
        return ctaEmpresa;
    }

    public void setCtaEmpresa(String ctaEmpresa) {
        this.ctaEmpresa = ctaEmpresa;
    }

    public String getCtaCuentaContable() {
        return ctaCuentaContable;
    }

    public void setCtaCuentaContable(String ctaCuentaContable) {
        this.ctaCuentaContable = ctaCuentaContable;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

}
