package ec.com.todocompu.ShrimpSoftUtils.rrhh;

import java.util.ArrayList;
import java.util.List;

import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaDetalleRolesTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaEmpleadoTO;
import java.math.BigDecimal;

public class UtilsEmpleado {

    private static List<RhListaEmpleadoTO> listEmpleados = new ArrayList<RhListaEmpleadoTO>();

    public static void convertirValoresItemDetalleVaciosACero(RhListaDetalleRolesTO itemDetalle) {
        BigDecimal cero = new BigDecimal("0.00");
        if (itemDetalle.getLrpBonos() == null) {
            itemDetalle.setLrpBonos(cero);
        }
        if (itemDetalle.getLrpHorasExtras() == null) {
            itemDetalle.setLrpHorasExtras(cero);
        }
        if (itemDetalle.getLrpHorasExtras100() == null) {
            itemDetalle.setLrpHorasExtras100(cero);
        }
        if (itemDetalle.getLrpHorasExtrasExtraordinarias100() == null) {
            itemDetalle.setLrpHorasExtrasExtraordinarias100(cero);
        }
        if (itemDetalle.getLrpSaldoHorasExtras50() == null) {
            itemDetalle.setLrpSaldoHorasExtras50(cero);
        }
        if (itemDetalle.getLrpSaldoHorasExtras100() == null) {
            itemDetalle.setLrpSaldoHorasExtras100(cero);
        }
        if (itemDetalle.getLrpSaldoHorasExtrasExtraordinarias100() == null) {
            itemDetalle.setLrpSaldoHorasExtrasExtraordinarias100(cero);
        }
        if (itemDetalle.getLrpDl() == null) {
            itemDetalle.setLrpDl(0);
        }
        if (itemDetalle.getLrpDf() == null) {
            itemDetalle.setLrpDf(0);
        }
        if (itemDetalle.getLrpDd() == null) {
            itemDetalle.setLrpDd(0);
        }
        if (itemDetalle.getLrpDp() == null) {
            itemDetalle.setLrpDp(0);
        }
        if (itemDetalle.getLrpDpm() == null) {
            itemDetalle.setLrpDpm(0);
        }
        if (itemDetalle.getLrpSaldo() == null) {
            itemDetalle.setLrpSaldo(cero);
        }
        if (itemDetalle.getLrpIngresos() == null) {
            itemDetalle.setLrpIngresos(cero);
        }
        if (itemDetalle.getLrpBonosFijo() == null) {
            itemDetalle.setLrpBonosFijo(cero);
        }
        if (itemDetalle.getLrpFondoReserva() == null) {
            itemDetalle.setLrpFondoReserva(cero);
        }
        if (itemDetalle.getLrpTotalIngresos() == null) {
            itemDetalle.setLrpTotalIngresos(cero);
        }
        if (itemDetalle.getLrpAnticipos() == null) {
            itemDetalle.setLrpAnticipos(cero);
        }
        if (itemDetalle.getLrpIess() == null) {
            itemDetalle.setLrpIess(cero);
        }
        if (itemDetalle.getLrpPrestamos() == null) {
            itemDetalle.setLrpPrestamos(cero);
        }
        if (itemDetalle.getLrpRetencion() == null) {
            itemDetalle.setLrpRetencion(cero);
        }
        if (itemDetalle.getLrpPrestamoQuirografario() == null) {
            itemDetalle.setLrpPrestamoQuirografario(cero);
        }
        if (itemDetalle.getLrpDescuentos() == null) {
            itemDetalle.setLrpDescuentos(cero);
        }
        if (itemDetalle.getLrpDescuentoPermisoMedico() == null) {
            itemDetalle.setLrpDescuentoPermisoMedico(cero);
        }
        if (itemDetalle.getLrpDescuentoVacaciones() == null) {
            itemDetalle.setLrpDescuentoVacaciones(cero);
        }
        if (itemDetalle.isLrpImpuestoRentaModificado() == null) {
            itemDetalle.setLrpImpuestoRentaModificado(Boolean.FALSE);
        }
    }

}
