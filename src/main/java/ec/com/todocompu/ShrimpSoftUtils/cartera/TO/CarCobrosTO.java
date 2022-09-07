/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

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
public class CarCobrosTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String conApellidosNombres;

    @Column(name = "cob_periodo")
    private String cobPeriodo;

    @Column(name = "cob_tipo")
    private String cobTipo;

    @Column(name = "cob_numero")
    private String cobNumero;

    @Column(name = "cob_reversado")
    private Boolean cobReversado;

    @Column(name = "cob_saldo_anterior")
    private BigDecimal cobSaldoAnterior;

    @Column(name = "cob_valor")
    private BigDecimal cobValor;

    @Column(name = "cob_saldo_actual")
    private BigDecimal cobSaldoActual;

    @Column(name = "cob_fecha")
    private String cobFecha;// EJB contable

    @Column(name = "cob_observaciones")
    private String cobObservaciones;// EJB contable

    @Column(name = "cli_codigo")
    private String cliCodigo;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    @Column(name = "cob_codigo_transaccional")
    private String cobCodigoTransaccional;

    public CarCobrosTO() {
    }

    public CarCobrosTO(String conApellidosNombres, String cobPeriodo, String cobTipo, String cobNumero,
            Boolean cobReversado, BigDecimal cobSaldoAnterior, BigDecimal cobValor, BigDecimal cobSaldoActual,
            String cobFecha, String cobObservaciones, String cliCodigo, String usrEmpresa, String usrCodigo,
            String usrFechaInserta) {
        this.conApellidosNombres = conApellidosNombres;
        this.cobPeriodo = cobPeriodo;
        this.cobTipo = cobTipo;
        this.cobNumero = cobNumero;
        this.cobReversado = cobReversado;
        this.cobSaldoAnterior = cobSaldoAnterior;
        this.cobValor = cobValor;
        this.cobSaldoActual = cobSaldoActual;
        this.cobFecha = cobFecha;
        this.cobObservaciones = cobObservaciones;
        this.cliCodigo = cliCodigo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public BigDecimal getCobSaldoAnterior() {
        return cobSaldoAnterior;
    }

    public void setCobSaldoAnterior(BigDecimal cobSaldoAnterior) {
        this.cobSaldoAnterior = cobSaldoAnterior;
    }

    public BigDecimal getCobValor() {
        return cobValor;
    }

    public void setCobValor(BigDecimal cobValor) {
        this.cobValor = cobValor;
    }

    public BigDecimal getCobSaldoActual() {
        return cobSaldoActual;
    }

    public void setCobSaldoActual(BigDecimal cobSaldoActual) {
        this.cobSaldoActual = cobSaldoActual;
    }

    public Boolean getCobReversado() {
        return cobReversado;
    }

    public void setCobReversado(Boolean cobReversado) {
        this.cobReversado = cobReversado;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCobFecha() {
        return cobFecha;
    }

    public void setCobFecha(String cobFecha) {
        this.cobFecha = cobFecha;
    }

    public String getCobNumero() {
        return cobNumero;
    }

    public void setCobNumero(String cobNumero) {
        this.cobNumero = cobNumero;
    }

    public String getCobObservaciones() {
        return cobObservaciones;
    }

    public void setCobObservaciones(String cobObservaciones) {
        this.cobObservaciones = cobObservaciones;
    }

    public String getCobPeriodo() {
        return cobPeriodo;
    }

    public void setCobPeriodo(String cobPeriodo) {
        this.cobPeriodo = cobPeriodo;
    }

    public String getCobTipo() {
        return cobTipo;
    }

    public void setCobTipo(String cobTipo) {
        this.cobTipo = cobTipo;
    }

    public String getConApellidosNombres() {
        return conApellidosNombres;
    }

    public void setConApellidosNombres(String conApellidosNombres) {
        this.conApellidosNombres = conApellidosNombres;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getCobCodigoTransaccional() {
        return cobCodigoTransaccional;
    }

    public void setCobCodigoTransaccional(String cobCodigoTransaccional) {
        this.cobCodigoTransaccional = cobCodigoTransaccional;
    }

}
