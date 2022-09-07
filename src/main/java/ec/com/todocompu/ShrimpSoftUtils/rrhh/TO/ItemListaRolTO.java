/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhRol;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author User
 */
public class ItemListaRolTO {

    private RhRol rhRol;
    private String rolDesdeTexto;
    private String rolHastaTexto;
    private BigDecimal rolImpuestoRenta;
    private BigDecimal rolPermisoMedico;
    private BigDecimal rolVacaciones;
    private BigDecimal rolDescFondoReserva;
    private BigDecimal rolLiqXiiiSueldo;
    private BigDecimal rolLiqXivSueldo;
    private BigDecimal rolValorPrestamos;
    //private BigDecimal rolIessExtension;
    private BigDecimal totalPagar;
    private BigDecimal totalIngresos;
    private BigDecimal totalDescuentos;
    private BigDecimal totalLiquidacion;
    private List<RhListaRolSaldoEmpleadoDetalladoTO> detalle;
    private String mensaje;

    public ItemListaRolTO() {
    }

    public String getRolDesdeTexto() {
        return rolDesdeTexto;
    }

    public void setRolDesdeTexto(String rolDesdeTexto) {
        this.rolDesdeTexto = rolDesdeTexto;
    }

    public String getRolHastaTexto() {
        return rolHastaTexto;
    }

    public void setRolHastaTexto(String rolHastaTexto) {
        this.rolHastaTexto = rolHastaTexto;
    }

    public BigDecimal getRolImpuestoRenta() {
        return rolImpuestoRenta;
    }

    public void setRolImpuestoRenta(BigDecimal rolImpuestoRenta) {
        this.rolImpuestoRenta = rolImpuestoRenta;
    }

    public BigDecimal getRolPermisoMedico() {
        return rolPermisoMedico;
    }

    public void setRolPermisoMedico(BigDecimal rolPermisoMedico) {
        this.rolPermisoMedico = rolPermisoMedico;
    }

    public BigDecimal getRolDescFondoReserva() {
        return rolDescFondoReserva;
    }

    public void setRolDescFondoReserva(BigDecimal rolDescFondoReserva) {
        this.rolDescFondoReserva = rolDescFondoReserva;
    }

    public BigDecimal getRolLiqXiiiSueldo() {
        return rolLiqXiiiSueldo;
    }

    public void setRolLiqXiiiSueldo(BigDecimal rolLiqXiiiSueldo) {
        this.rolLiqXiiiSueldo = rolLiqXiiiSueldo;
    }

    public BigDecimal getRolLiqXivSueldo() {
        return rolLiqXivSueldo;
    }

    public void setRolLiqXivSueldo(BigDecimal rolLiqXivSueldo) {
        this.rolLiqXivSueldo = rolLiqXivSueldo;
    }

    public BigDecimal getRolValorPrestamos() {
        return rolValorPrestamos;
    }

    public void setRolValorPrestamos(BigDecimal rolValorPrestamos) {
        this.rolValorPrestamos = rolValorPrestamos;
    }

    public BigDecimal getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(BigDecimal totalPagar) {
        this.totalPagar = totalPagar;
    }

    public BigDecimal getTotalIngresos() {
        return totalIngresos;
    }

    public void setTotalIngresos(BigDecimal totalIngresos) {
        this.totalIngresos = totalIngresos;
    }

    public BigDecimal getTotalDescuentos() {
        return totalDescuentos;
    }

    public void setTotalDescuentos(BigDecimal totalDescuentos) {
        this.totalDescuentos = totalDescuentos;
    }

    public BigDecimal getTotalLiquidacion() {
        return totalLiquidacion;
    }

    public void setTotalLiquidacion(BigDecimal totalLiquidacion) {
        this.totalLiquidacion = totalLiquidacion;
    }

    public List<RhListaRolSaldoEmpleadoDetalladoTO> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<RhListaRolSaldoEmpleadoDetalladoTO> detalle) {
        this.detalle = detalle;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public RhRol getRhRol() {
        return rhRol;
    }

    public void setRhRol(RhRol rhRol) {
        this.rhRol = rhRol;
    }

    public BigDecimal getRolVacaciones() {
        return rolVacaciones;
    }

    public void setRolVacaciones(BigDecimal rolVacaciones) {
        this.rolVacaciones = rolVacaciones;
    }

}
