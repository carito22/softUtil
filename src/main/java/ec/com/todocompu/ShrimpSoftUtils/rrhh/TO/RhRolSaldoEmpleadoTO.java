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
import javax.persistence.Transient;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhRolSaldoEmpleadoTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "saldo_anterior")
    private BigDecimal saldoAnterior;

    @Column(name = "saldo_anticipo")
    private BigDecimal saldoAnticipo;

    @Column(name = "saldo_prestamo")
    private BigDecimal saldoPrestamo;

    @Column(name = "saldo_bonos")
    private BigDecimal saldoBono;

    @Column(name = "saldo_bonosnd")
    private BigDecimal saldoBonond;

    @Column(name = "saldo_saldo_horas_extras_50")
    private BigDecimal saldoSaldoHorasExtras50;

    @Column(name = "saldo_saldo_horas_extras_100")
    private BigDecimal saldoSaldoHorasExtras100;

    @Column(name = "saldo_saldo_horas_extras_extraordinarias_100")
    private BigDecimal saldoSaldoHorasExtrasExtraordinarias100;
    
    @Column(name = "saldo_xiii_sueldo")
    private BigDecimal saldoXiiiSueldo;

    @Column(name = "saldo_xiv_sueldo")
    private BigDecimal saldoXivSueldo;

    @Column(name = "saldo_vacaciones")
    private BigDecimal saldoVacaciones;

    @Transient
    private String rolFechaUltimoSueldo;

    public RhRolSaldoEmpleadoTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(BigDecimal saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public BigDecimal getSaldoAnticipo() {
        return saldoAnticipo;
    }

    public void setSaldoAnticipo(BigDecimal saldoAnticipo) {
        this.saldoAnticipo = saldoAnticipo;
    }

    public BigDecimal getSaldoBono() {
        return saldoBono;
    }

    public void setSaldoBono(BigDecimal saldoBono) {
        this.saldoBono = saldoBono;
    }

    public BigDecimal getSaldoBonond() {
        return saldoBonond;
    }

    public void setSaldoBonond(BigDecimal saldoBonond) {
        this.saldoBonond = saldoBonond;
    }

    public BigDecimal getSaldoPrestamo() {
        return saldoPrestamo;
    }

    public void setSaldoPrestamo(BigDecimal saldoPrestamo) {
        this.saldoPrestamo = saldoPrestamo;
    }

    public BigDecimal getSaldoSaldoHorasExtras50() {
        return saldoSaldoHorasExtras50;
    }

    public void setSaldoSaldoHorasExtras50(BigDecimal saldoSaldoHorasExtras50) {
        this.saldoSaldoHorasExtras50 = saldoSaldoHorasExtras50;
    }

    public BigDecimal getSaldoSaldoHorasExtras100() {
        return saldoSaldoHorasExtras100;
    }

    public void setSaldoSaldoHorasExtras100(BigDecimal saldoSaldoHorasExtras100) {
        this.saldoSaldoHorasExtras100 = saldoSaldoHorasExtras100;
    }

    public BigDecimal getSaldoSaldoHorasExtrasExtraordinarias100() {
        return saldoSaldoHorasExtrasExtraordinarias100;
    }

    public void setSaldoSaldoHorasExtrasExtraordinarias100(BigDecimal saldoSaldoHorasExtrasExtraordinarias100) {
        this.saldoSaldoHorasExtrasExtraordinarias100 = saldoSaldoHorasExtrasExtraordinarias100;
    }

    public String getRolFechaUltimoSueldo() {
        return rolFechaUltimoSueldo;
    }

    public void setRolFechaUltimoSueldo(String rolFechaUltimoSueldo) {
        this.rolFechaUltimoSueldo = rolFechaUltimoSueldo;
    }

    public BigDecimal getSaldoXiiiSueldo() {
        return saldoXiiiSueldo;
    }

    public void setSaldoXiiiSueldo(BigDecimal saldoXiiiSueldo) {
        this.saldoXiiiSueldo = saldoXiiiSueldo;
    }

    public BigDecimal getSaldoXivSueldo() {
        return saldoXivSueldo;
    }

    public void setSaldoXivSueldo(BigDecimal saldoXivSueldo) {
        this.saldoXivSueldo = saldoXivSueldo;
    }

    public BigDecimal getSaldoVacaciones() {
        return saldoVacaciones;
    }

    public void setSaldoVacaciones(BigDecimal saldoVacaciones) {
        this.saldoVacaciones = saldoVacaciones;
    }

}
