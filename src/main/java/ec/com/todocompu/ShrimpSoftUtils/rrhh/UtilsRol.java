package ec.com.todocompu.ShrimpSoftUtils.rrhh;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import ec.com.todocompu.ShrimpSoftUtils.UtilsDate;
import ec.com.todocompu.ShrimpSoftUtils.UtilsValidacion;
import ec.com.todocompu.ShrimpSoftUtils.delegate.RRHHDelegate;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhRolSaldoEmpleadoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhEmpleado;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhParametros;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhRelacionTrabajo;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhRol;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisInfoTO;
import java.util.Date;

public class UtilsRol {

    public static String generarRhRol(RhRol rhRol, SisInfoTO sisInfoTO) {
        boolean debeActualizar = rhRol.getRolSecuencial() == null || rhRol.isEmpActualizar();
        BigDecimal cero = BigDecimal.ZERO;
        String estadoCtaRhIess = "";
        RhEmpleado empleado;
        if (debeActualizar) {
            empleado = rhRol.getRhEmpleado();
            esNuevoODeboActualizarValores(rhRol, empleado);
        } else {
            empleado = completarDatosDelEmpleadoAPartirDelRol(rhRol);
            rhRol.setCatEmpresa(rhRol.getCatEmpresa());
            rhRol.setCatNombre(rhRol.getCatNombre());
        }
        if (empleado.getEmpRelacionTrabajo() == null || empleado.getEmpRelacionTrabajo().getRtCodigo() == null) {
            return "FNo existen relación trabajo para el empleado: " + empleado.getEmpNombres() + " " + empleado.getEmpApellidos();
        }
        RhParametros rhParametros = RRHHDelegate.getInstance().obtenerRhParametrosPorCodigoRelacionTrabajo(
                UtilsDate.fechaFormatoString(rhRol.getRolHasta(), "dd-MM-yyyy"), empleado.getEmpRelacionTrabajo().getRtCodigo(), sisInfoTO);
        if (rhParametros == null) {
            return "FNo existen parámetros para la empresa: " + sisInfoTO.getEmpresa();
        }
        rhRol.setEmpSalarioNeto(empleado.getEmpSalarioNeto());
        rhRol.setEmpCancelarXiiiSueldoMensualmente(empleado.getEmpCancelarXiiiSueldoMensualmente());
        rhRol.setEmpCancelarXivSueldoMensualmente(empleado.getEmpCancelarXivSueldoMensualmente());
        rhRol.setEmpBonoFijo(empleado.getEmpBonoFijo());
        rhRol.setEmpBonoFijoNd(empleado.getEmpBonoFijoNd());
        rhRol.setEmpOtrosIngresos(empleado.getEmpOtrosIngresos());
        rhRol.setEmpOtrosIngresosNd(empleado.getEmpOtrosIngresosNd());
        rhRol.setRolOtrosIngresos(empleado.getEmpOtrosIngresos());
        rhRol.setRolOtrosIngresosNd(empleado.getEmpOtrosIngresosNd());
        rhRol.setEmpCancelarFondoReservaMensualmente(empleado.getEmpCancelarFondoReservaMensualmente());
        rhRol.setRolBonos(empleado.getEmpSaldoBonos());
        rhRol.setRolBonosnd(empleado.getEmpSaldoBonosNd());
        rhRol.setRolAnticipos(empleado.getEmpSaldoAnticipos());
        rhRol.setRolSaldoHorasExtras50(empleado.getEmpSaldoHorasExtras50());
        rhRol.setRolSaldoHorasExtras100(empleado.getEmpSaldoHorasExtras100());
        rhRol.setRolSaldoHorasExtrasExtraordinarias100(empleado.getEmpSaldoHorasExtrasExtraordinarias100());
        rhRol.setRolSaldoAnterior(empleado.getEmpSaldoAnterior());
        rhRol.setEmpDiasLaborados((short) empleado.getEmpDiasTrabajados());
        rhRol.setEmpDiasDescanso((short) empleado.getEmpDiasDescanso());
        rhRol.setEmpSueldo(empleado.getEmpSueldoIess());
        rhRol.setPrdSector(empleado.getPrdSector());

        BigDecimal fondoReservaOriginal = rhRol.getRolFondoReserva();
        rhRol.setRolFondoReserva(cero);
        rhRol.setRolXiii(cero);
        rhRol.setRolXiv(cero);
        rhRol.setRolVacaciones(cero);
        rhRol.setRolDesahucio(cero);

        //rhRol.setRolRetencionFuente(cero);
        rhRol.setRolIess(cero);
        rhRol.setRolAportePatronal(cero);
        rhRol.setRolIece(cero);
        rhRol.setRolSecap(cero);

        int primerosDias = UtilsValidacion.obtenerDiasAAMMDD(rhRol.getRolDesde(), "");
        int ultimosDias = UtilsValidacion.obtenerDiasAAMMDD("", rhRol.getRolHasta());

        int diasLaborados = 30 - primerosDias - ultimosDias;

        if (UtilsRol.esLiquidacion(rhRol)) {
            diasLaborados = 1;
        }

        if ((primerosDias == 0 && ultimosDias != 0) || (primerosDias != 0 && ultimosDias != 0)) {
            diasLaborados = UtilsValidacion.obtenerDiasAAMMDD(rhRol.getRolHasta(), rhRol.getRolDesde()) + 1;
        }

        if (empleado.getEmpFormaPago().equals("MENSUAL")) {
            rhRol.setRolDiasLaboradosReales((short) (diasLaborados - rhRol.getRolDiasFaltasReales()));
            rhRol.setRolDiasDescansoReales((short) 0);
        }
        if (empleado.getEmpFormaPago().equals("DIARIO")) {
            rhRol.setRolDiasLaboradosReales((short) (diasLaborados - rhRol.getRolDiasFaltasReales()));
            rhRol.setRolDiasDescansoReales(
                    (short) Math.round((rhRol.getRolDiasLaboradosReales() * rhRol.getEmpDiasDescanso())
                            / (float) rhRol.getEmpDiasLaborados()));
        }
        rhRol.setRolDiasPagadosReales((short) (rhRol.getRolDiasLaboradosReales() + rhRol.getRolDiasDescansoReales()));

        if (empleado.getEmpFormaPago().equals("MENSUAL")) {
            BigDecimal sueldoDIV30 = rhRol.getEmpSueldo().divide(new BigDecimal(rhRol.getEmpDiasLaborados()), 9, RoundingMode.HALF_UP);
            BigDecimal suedoXdiasLab = sueldoDIV30.multiply(new BigDecimal(rhRol.getRolDiasLaboradosReales()));
            rhRol.setRolIngresos(suedoXdiasLab.setScale(2, RoundingMode.HALF_UP));
        }
        if (empleado.getEmpFormaPago().equals("DIARIO")) {
            BigDecimal sueldoDIV30 = rhRol.getEmpSueldo().divide(new BigDecimal(rhRol.getEmpDiasLaborados() + rhRol.getEmpDiasDescanso()), 9, RoundingMode.HALF_UP);
            BigDecimal suedoXdiasLab = sueldoDIV30.multiply(new BigDecimal(rhRol.getRolDiasLaboradosReales()));
            rhRol.setRolIngresos(suedoXdiasLab.setScale(2, RoundingMode.HALF_UP));
        }

        if (rhRol.getRolIngresoVacaciones() == null) {
            rhRol.setRolIngresoVacaciones(cero);
        }
        rhRol.setRolTotal(
                redondeoBigDecimal(
                        rhRol.getRolIngresos()
                                .add(empleado.getEmpSaldoBonos()
                                        .add(empleado.getEmpSaldoBonosNd()
                                                .add(empleado.getEmpSaldoAnterior())
                                                .subtract(empleado.getEmpSaldoAnticipos())
                                                .subtract(rhRol.getRolPrestamoQuirografario())
                                                .subtract(rhRol.getRolPrestamoHipotecario())
                                                .subtract(rhRol.getRolPrestamos())
                                        )
                                )
                )
        );

        rhRol.setRolTotal(redondeoBigDecimal(rhRol.getRolTotal()
                .add(rhRol.getRolLiqFondoReserva().add(rhRol.getRolLiqXiii()).add(rhRol.getRolLiqXiv())
                        .add(rhRol.getRolLiqVacaciones()).add(rhRol.getRolLiqSalarioDigno())
                        .add(rhRol.getRolLiqBonificacion()).add(rhRol.getRolLiqDesahucio())
                        .add(rhRol.getRolLiqDesahucioIntempestivo()))));
        rhRol.setRolTotal(redondeoBigDecimal(rhRol.getRolTotal().subtract(rhRol.getRolDescuentoPermisoMedico())));

        rhRol.setRolBonoFijo(redondeoBigDecimal(
                (empleado.getEmpBonoFijo().multiply(BigDecimal.valueOf(rhRol.getRolDiasLaboradosReales())))
                        .divide(BigDecimal.valueOf(empleado.getEmpDiasTrabajados()), 9, RoundingMode.HALF_UP)));
        rhRol.setRolBonoFijoNd(redondeoBigDecimal(
                (empleado.getEmpBonoFijoNd().multiply(BigDecimal.valueOf(rhRol.getRolDiasLaboradosReales())))
                        .divide(BigDecimal.valueOf(empleado.getEmpDiasTrabajados()), 9, RoundingMode.HALF_UP)));
        rhRol.setRolOtrosIngresos(redondeoBigDecimal(
                (empleado.getEmpOtrosIngresos().multiply(BigDecimal.valueOf(rhRol.getRolDiasLaboradosReales())))
                        .divide(BigDecimal.valueOf(empleado.getEmpDiasTrabajados()), 9, RoundingMode.HALF_UP)));
        rhRol.setRolOtrosIngresosNd(redondeoBigDecimal(
                (empleado.getEmpOtrosIngresosNd().multiply(BigDecimal.valueOf(rhRol.getRolDiasLaboradosReales())))
                        .divide(BigDecimal.valueOf(empleado.getEmpDiasTrabajados()), 9, RoundingMode.HALF_UP)));

        BigDecimal valorBaseImponible = rhRol.getRolOtrosIngresos().add(rhRol.getRolIngresos()
                .add(rhRol.getRolBonoFijo()).add(rhRol.getRolBonos())
                .add(rhRol.getRolHorasExtras()).add(rhRol.getRolHorasExtras100()).add(rhRol.getRolHorasExtrasExtraordinarias100())
                .add(rhRol.getRolSaldoHorasExtras50()).add(rhRol.getRolSaldoHorasExtras100()).add(rhRol.getRolSaldoHorasExtrasExtraordinarias100())
        );

        BigDecimal aporteIndividual = BigDecimal.ZERO;
        BigDecimal aporteIndividualExtendido = BigDecimal.ZERO;

        aporteIndividual = rhParametros.getParIessPorcentajeAporteIndividual();
        aporteIndividualExtendido = empleado.getEmpExtensionCoberturaIess() ? rhParametros.getParIessPorcentajeAporteExtendido() : aporteIndividualExtendido;

        rhRol.setRolFondoReserva(redondeoBigDecimal(valorBaseImponible.multiply(new BigDecimal("8.33")).divide(new BigDecimal(100), 9, RoundingMode.HALF_UP)));
        if (rhParametros.getParDerechoXiiiSueldo()) {
            rhRol.setRolXiii(redondeoBigDecimal(valorBaseImponible.divide(new BigDecimal(12), 9, RoundingMode.HALF_UP)));
        }
        if (rhParametros.getParDerechoXivSueldo()) {
            rhRol.setRolXiv(redondeoBigDecimal(rhParametros.getParSalarioMinimoVital().divide(new BigDecimal(12), 9, RoundingMode.HALF_UP)));
            BigDecimal valorQ = (rhRol.getRolIngresos().multiply(new BigDecimal(100))).divide(rhRol.getEmpSueldo(), 9, RoundingMode.HALF_UP);
            rhRol.setRolXiv(redondeoBigDecimal((rhRol.getRolXiv().multiply(valorQ)).divide(new BigDecimal(100), 9, RoundingMode.HALF_UP)));
        }
        rhRol.setRolVacaciones(redondeoBigDecimal(valorBaseImponible.divide(new BigDecimal(24), 9, RoundingMode.HALF_UP)));
        rhRol.setRolDesahucio(redondeoBigDecimal(valorBaseImponible.divide(new BigDecimal(4), 9, RoundingMode.HALF_UP).divide(new BigDecimal(12), 9, RoundingMode.HALF_UP)));

        BigDecimal valorIess = redondeoBigDecimal(
                valorBaseImponible.multiply(aporteIndividual.divide(new BigDecimal(100), 9, RoundingMode.HALF_UP)));
        BigDecimal valorIessExtendido = redondeoBigDecimal(
                valorBaseImponible.multiply(aporteIndividualExtendido.divide(new BigDecimal(100), 9, RoundingMode.HALF_UP)));
        BigDecimal valorAportePatronal = redondeoBigDecimal(valorBaseImponible.multiply(rhParametros
                .getParIessPorcentajeAportePatronal().divide(new BigDecimal(100), 9, RoundingMode.HALF_UP)));
        BigDecimal valorIece = redondeoBigDecimal(valorBaseImponible.multiply(
                rhParametros.getParIessPorcentajeIece().divide(new BigDecimal(100), 9, RoundingMode.HALF_UP)));
        BigDecimal valorSecap = redondeoBigDecimal(valorBaseImponible.multiply(
                rhParametros.getParIessPorcentajeSecap().divide(new BigDecimal(100), 9, RoundingMode.HALF_UP)));

        BigDecimal valorImpuestoRenta;
        if ((debeActualizar && !rhRol.isRolImpuestoRentaModificado())) {
            if (!empleado.getEmpRetencion() || empleado.getEmpFechaAfiliacionIess() == null) {
                valorImpuestoRenta = cero;
            } else {
                BigDecimal ingresoExento = (rhRol.getRolXiii() == null ? BigDecimal.ZERO : rhRol.getRolXiii())
                        .add(rhRol.getRolXiv() == null ? BigDecimal.ZERO : rhRol.getRolXiv())
                        .add(rhRol.getRolFondoReserva() == null ? BigDecimal.ZERO : rhRol.getRolFondoReserva());
                valorImpuestoRenta = RRHHDelegate.getInstance().getRhValorImpuestoRenta(
                        rhRol.getRhEmpleado().getRhEmpleadoPK().getEmpEmpresa(),
                        rhRol.getRhEmpleado().getRhEmpleadoPK().getEmpId(),
                        UtilsDate.fechaFormatoString(rhRol.getRolHasta(), "dd-MM-yyyy"), diasLaborados,
                        rhRol.getRolIngresos().add(rhRol.getRolBonoFijo()).add(rhRol.getRolOtrosIngresos()),
                        rhRol.getRolBonos()
                                .add(rhRol.getRolHorasExtras()).add(rhRol.getRolHorasExtras100()).add(rhRol.getRolHorasExtrasExtraordinarias100())
                                .add(rhRol.getRolSaldoHorasExtras50()).add(rhRol.getRolSaldoHorasExtras100()).add(rhRol.getRolSaldoHorasExtrasExtraordinarias100()
                                .add(rhRol.getRolRecargoJornadaNocturna() == null ? BigDecimal.ZERO : rhRol.getRolRecargoJornadaNocturna())),
                        ingresoExento,
                        sisInfoTO);
                if (valorImpuestoRenta == null) {
                    valorImpuestoRenta = cero;
                }
            }
        } else {
            valorImpuestoRenta = rhRol.getRolRetencionFuente();
        }
        if (UtilsRol.esLiquidacion(rhRol)) {
            valorImpuestoRenta = cero;
        }

        if ((debeActualizar && !rhRol.isRolImpuestoRentaModificado()) || !rhRol.isRolImpuestoRentaModificado()) {
            rhRol.setRolTotal(redondeoBigDecimal(rhRol.getRolTotal().subtract(valorImpuestoRenta)));
        } else {
            rhRol.setRolTotal(redondeoBigDecimal(rhRol.getRolTotal().subtract(rhRol.getRolRetencionFuente())));
        }
        if (empleado.getEmpFechaAfiliacionIess() == null) {
            valorIess = BigDecimal.ZERO;
            valorIessExtendido = BigDecimal.ZERO;
            rhRol.setRolIess(valorIess);
            rhRol.setRolIessExtension(valorIessExtendido);
            rhRol.setRolFondoReserva(BigDecimal.ZERO);
        } else {
            rhRol.setRolIess(valorIess);
            rhRol.setRolIessExtension(valorIessExtendido);

            //fondo reserva proporcional
            int diasPeriodoAnterior = 0;
            if (empleado.getEmpFechaPrimeraSalida() != null) {
                boolean diaCompensacion = tieneDiaBisiesto(empleado.getEmpFechaPrimerIngreso(), empleado.getEmpFechaPrimeraSalida());
                diasPeriodoAnterior = UtilsValidacion.obtenerDiasAAMMDD(empleado.getEmpFechaPrimeraSalida(), empleado.getEmpFechaPrimerIngreso()) + (diaCompensacion ? 0 : 1);
            }
            boolean diaCompensacion = tieneDiaBisiesto(empleado.getEmpFechaAfiliacionIess(), rhRol.getRolHasta());
            // diasParciales sirve para saber si antes del rol ya tiene cumplido el año y por ende ya goza de FONDO DE RESERVA, la idea es que esta variable impida que se calcule este beneficio de forma proporcional
            Integer diasParciales = (UtilsValidacion.obtenerDiasAAMMDD(rhRol.getRolDesde(), empleado.getEmpFechaAfiliacionIess())) + (diaCompensacion ? 0 : 1) + diasPeriodoAnterior;
            Integer diasTotales = (UtilsValidacion.obtenerDiasAAMMDD(rhRol.getRolHasta(), empleado.getEmpFechaAfiliacionIess())) + (diaCompensacion ? 0 : 1) + diasPeriodoAnterior;
            if (diasTotales < 365) {
                rhRol.setRolFondoReserva(BigDecimal.ZERO);
            } else if (rhRol.getRolFondoReserva().compareTo(BigDecimal.ZERO) > 0 && diasParciales < 365 && diasTotales < 395) {
                rhRol.setRolFondoReserva(rhRol.getRolFondoReserva().divide(new BigDecimal(rhRol.getRolDiasLaboradosReales()), 4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(diasTotales - 365)));
                rhRol.setRolFondoReserva(rhRol.getRolFondoReserva().divide(BigDecimal.ONE, 2, RoundingMode.HALF_UP));
            }
            if (!debeActualizar) {//me aseguré de que no se usarar para sumas previamente
                rhRol.setRolFondoReserva(fondoReservaOriginal);
            }
            //fin de calcular fondo reserva proporcional
        }

        if (Double.valueOf((valorIess).toString()) > 0) {
            if (empleado.getRhCategoria().getCtaAportepersonal() != null) {
                estadoCtaRhIess = "IESS";
            }
        }

        if (debeActualizar) {
            rhRol.setRolRetencionFuente(valorImpuestoRenta);
        }
        rhRol.setRolAportePatronal(valorAportePatronal);
        rhRol.setRolIece(valorIece);
        rhRol.setRolSecap(valorSecap);
        rhRol.setRolBonos(rhRol.getRolBonos());

        rhRol.setRolTotal(rhRol.getRolTotal()
                .add(rhRol.getRolHorasExtras()).add(rhRol.getRolHorasExtras100()).add(rhRol.getRolHorasExtrasExtraordinarias100())
                .add(rhRol.getRolSaldoHorasExtras50()).add(rhRol.getRolSaldoHorasExtras100()).add(rhRol.getRolSaldoHorasExtrasExtraordinarias100())
        );
        if (empleado.getEmpCancelarXiiiSueldoMensualmente()) {
            rhRol.setRolTotal(redondeoBigDecimal(rhRol.getRolTotal().add(rhRol.getRolXiii())));
        }
        if (empleado.getEmpCancelarXivSueldoMensualmente()) {
            rhRol.setRolTotal(redondeoBigDecimal(rhRol.getRolTotal().add(rhRol.getRolXiv())));
        }
        if (empleado.getEmpCancelarFondoReservaMensualmente()) {
            rhRol.setRolTotal(redondeoBigDecimal(rhRol.getRolTotal().add(rhRol.getRolFondoReserva())));
        }
        rhRol.setRolTotal(redondeoBigDecimal(rhRol.getRolTotal().add(rhRol.getRolBonoFijo())
                .add(rhRol.getRolBonoFijoNd()).add(rhRol.getRolOtrosIngresos()).add(rhRol.getRolOtrosIngresosNd())));
        if (estadoCtaRhIess.equals("IESS")) {
            rhRol.setRolTotal(redondeoBigDecimal(
                    empleado.getEmpSalarioNeto() ? rhRol.getRolTotal() : rhRol.getRolTotal().subtract(valorIess.add(valorIessExtendido))));
        }
        if (rhRol.isEmpSalarioNeto()) {
            rhRol.setRolTotal(redondeoBigDecimal(rhRol.getRolTotal().subtract(valorIessExtendido)));
        }

        rhRol.setRolDiasLaboradosReales(
                new Short(String.valueOf(rhRol.getRolDiasFaltasReales() + rhRol.getRolDiasLaboradosReales())));

        return "T";
    }

    public static void esNuevoODeboActualizarValores(RhRol rhRol, RhEmpleado empleado) {
        RhRolSaldoEmpleadoTO saldoEmpleado = RRHHDelegate.getInstance().obtenerRhRolSaldoEmpleadoTO(
                empleado.getRhEmpleadoPK().getEmpEmpresa(), empleado.getRhEmpleadoPK().getEmpId(),
                UtilsDate.fechaFormatoString(rhRol.getRolDesde(), "yyyy-MM-dd"), UtilsDate.fechaFormatoString(rhRol.getRolHasta(), "yyyy-MM-dd"), null);
        if (saldoEmpleado != null) {
            empleado.setEmpSaldoAnterior(saldoEmpleado.getSaldoAnterior());
            empleado.setEmpSaldoHorasExtras50(saldoEmpleado.getSaldoSaldoHorasExtras50());
            empleado.setEmpSaldoHorasExtras100(saldoEmpleado.getSaldoSaldoHorasExtras100());
            empleado.setEmpSaldoBonos(saldoEmpleado.getSaldoBono());
            empleado.setEmpSaldoPrestamos(saldoEmpleado.getSaldoPrestamo());
            empleado.setEmpSaldoBonosNd(saldoEmpleado.getSaldoBonond());
            empleado.setEmpSaldoAnticipos(saldoEmpleado.getSaldoAnticipo());
            empleado.setEmpSaldoHorasExtrasExtraordinarias100(saldoEmpleado.getSaldoSaldoHorasExtrasExtraordinarias100());
        }
        rhRol.setRolRelacionTrabajo(empleado.getEmpRelacionTrabajo() != null ? empleado.getEmpRelacionTrabajo().getRtCodigo() : null);
        rhRol.setCatEmpresa(empleado.getRhCategoria().getRhCategoriaPK().getCatEmpresa());
        rhRol.setCatNombre(empleado.getRhCategoria().getRhCategoriaPK().getCatNombre());
    }

    public static RhEmpleado completarDatosDelEmpleadoAPartirDelRol(RhRol rol) {
        RhEmpleado empleado = rol.getRhEmpleado();
        empleado.setEmpSalarioNeto(rol.isEmpSalarioNeto());
        empleado.setEmpCancelarXiiiSueldoMensualmente(rol.isEmpCancelarXiiiSueldoMensualmente());
        empleado.setEmpCancelarXivSueldoMensualmente(rol.isEmpCancelarXivSueldoMensualmente());
        empleado.setEmpBonoFijo(rol.getEmpBonoFijo());
        empleado.setEmpBonoFijoNd(rol.getEmpBonoFijoNd());
        empleado.setEmpOtrosIngresos(rol.getRolOtrosIngresos());
        empleado.setEmpOtrosIngresosNd(rol.getRolOtrosIngresosNd());
        empleado.setEmpCancelarFondoReservaMensualmente(rol.isEmpCancelarFondoReservaMensualmente());
        empleado.setEmpSaldoBonos(rol.getRolBonos());
        empleado.setEmpSaldoBonosNd(rol.getRolBonosnd());
        empleado.setEmpSaldoAnticipos(rol.getRolAnticipos());
        empleado.setEmpSaldoHorasExtras50(rol.getRolSaldoHorasExtras50());
        empleado.setEmpSaldoHorasExtras100(rol.getRolSaldoHorasExtras100());
        empleado.setEmpSaldoHorasExtrasExtraordinarias100(rol.getRolSaldoHorasExtrasExtraordinarias100());
        empleado.setEmpSaldoAnterior(rol.getRolSaldoAnterior());
        empleado.setEmpDiasTrabajados((short) rol.getEmpDiasLaborados());
        empleado.setEmpDiasDescanso((short) rol.getEmpDiasDescanso());
        empleado.setEmpSueldoIess(rol.getEmpSueldo());
        empleado.setEmpCargo(rol.getEmpCargo());
        empleado.setPrdSector(rol.getPrdSector());
        empleado.setEmpRelacionTrabajo(new RhRelacionTrabajo(rol.getRolRelacionTrabajo()));
        return empleado;
    }

    public static boolean esLiquidacion(RhRol rol) {
        BigDecimal liquidacion = rol.getRolLiqBonificacion()
                .add(rol.getRolLiqDesahucio())
                .add(rol.getRolLiqDesahucioIntempestivo())
                .add(rol.getRolLiqFondoReserva())
                .add(rol.getRolLiqSalarioDigno())
                .add(rol.getRolLiqVacaciones())
                .add(rol.getRolLiqXiii())
                .add(rol.getRolLiqXiv());
        if (liquidacion.compareTo(BigDecimal.ZERO) != 0) {
            return true;
        }
        return false;
    }

    private static BigDecimal redondeoBigDecimal(BigDecimal d) {
        DecimalFormat formato = new DecimalFormat("#.##");
        DecimalFormatSymbols dfs = formato.getDecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        formato.setDecimalFormatSymbols(dfs);
        return BigDecimal.valueOf(Double.valueOf(formato.format(d)));
    }

    public static boolean tieneDiaBisiesto(Date desde, Date hasta) {
        if (desde != null) {
            int anioDesde = desde.getYear();
            Date tempDesde = new Date();
            tempDesde.setYear(anioDesde);
            tempDesde.setMonth(1);
            tempDesde.setDate(29);
            if (tempDesde.getMonth() == 1 && tempDesde.after(desde) && hasta != null && tempDesde.before(hasta)) {
                return true;
            }
        }

        if (hasta != null) {
            int anioHasta = hasta.getYear();
            Date tempHasta = new Date();
            tempHasta.setYear(anioHasta);
            tempHasta.setMonth(1);
            tempHasta.setDate(29);
            if (tempHasta.getMonth() == 1 && desde != null && tempHasta.after(desde) && tempHasta.before(hasta)) {
                return true;
            }
        }

        return false;
    }

}
