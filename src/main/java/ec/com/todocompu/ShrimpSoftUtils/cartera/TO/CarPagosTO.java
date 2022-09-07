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
public class CarPagosTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "con_apellidos_nombres")
    private String conApellidosNombres;

    @Column(name = "pag_periodo")
    private String pagPeriodo;

    @Column(name = "pag_tipo")
    private String pagTipo;

    @Column(name = "pag_numero")
    private String pagNumero;

    @Column(name = "pag_reversado")
    private Boolean pagReversado;

    @Column(name = "pag_saldo_anterior")
    private BigDecimal pagSaldoAnterior;

    @Column(name = "pag_valor")
    private BigDecimal pagValor;

    @Column(name = "pag_saldo_actual")
    private BigDecimal pagSaldoActual;

    private String pagFecha;// EJB contable
    private String pagObservaciones;// EJB contable

    @Column(name = "prov_codigo")
    private String provCodigo;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    @Column(name = "pag_codigo_transaccional")
    private String pagCodigoTransaccional;

    public CarPagosTO() {
    }

    public Boolean getPagReversado() {
        return pagReversado;
    }

    public CarPagosTO(String conApellidosNombres, String pagPeriodo, String pagTipo, String pagNumero,
            Boolean pagReversado, BigDecimal pagSaldoAnterior, BigDecimal pagValor, BigDecimal pagSaldoActual,
            String pagFecha, String pagObservaciones, String provCodigo, String usrEmpresa, String usrCodigo,
            String usrFechaInserta) {
        this.conApellidosNombres = conApellidosNombres;
        this.pagPeriodo = pagPeriodo;
        this.pagTipo = pagTipo;
        this.pagNumero = pagNumero;
        this.pagReversado = pagReversado;
        this.pagSaldoAnterior = pagSaldoAnterior;
        this.pagValor = pagValor;
        this.pagSaldoActual = pagSaldoActual;
        this.pagFecha = pagFecha;
        this.pagObservaciones = pagObservaciones;
        this.provCodigo = provCodigo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public BigDecimal getPagSaldoAnterior() {
        return pagSaldoAnterior;
    }

    public void setPagSaldoAnterior(BigDecimal pagSaldoAnterior) {
        this.pagSaldoAnterior = pagSaldoAnterior;
    }

    public BigDecimal getPagValor() {
        return pagValor;
    }

    public void setPagValor(BigDecimal pagValor) {
        this.pagValor = pagValor;
    }

    public BigDecimal getPagSaldoActual() {
        return pagSaldoActual;
    }

    public void setPagSaldoActual(BigDecimal pagSaldoActual) {
        this.pagSaldoActual = pagSaldoActual;
    }

    public void setPagReversado(Boolean pagReversado) {
        this.pagReversado = pagReversado;
    }

    public String getConApellidosNombres() {
        return conApellidosNombres;
    }

    public void setConApellidosNombres(String conApellidosNombres) {
        this.conApellidosNombres = conApellidosNombres;
    }

    public String getPagFecha() {
        return pagFecha;
    }

    public void setPagFecha(String pagFecha) {
        this.pagFecha = pagFecha;
    }

    public String getPagNumero() {
        return pagNumero;
    }

    public void setPagNumero(String pagNumero) {
        this.pagNumero = pagNumero;
    }

    public String getPagObservaciones() {
        return pagObservaciones;
    }

    public void setPagObservaciones(String pagObservaciones) {
        this.pagObservaciones = pagObservaciones;
    }

    public String getPagPeriodo() {
        return pagPeriodo;
    }

    public void setPagPeriodo(String pagPeriodo) {
        this.pagPeriodo = pagPeriodo;
    }

    public String getPagTipo() {
        return pagTipo;
    }

    public void setPagTipo(String pagTipo) {
        this.pagTipo = pagTipo;
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
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

    public String getPagCodigoTransaccional() {
        return pagCodigoTransaccional;
    }

    public void setPagCodigoTransaccional(String pagCodigoTransaccional) {
        this.pagCodigoTransaccional = pagCodigoTransaccional;
    }

}
