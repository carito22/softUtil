package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhListaDetalleRolesTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "lrp_id")
    private String lrpId;
    @Column(name = "lrp_nombres")
    private String lrpNombres;
    @Column(name = "lrp_cargo")
    private String lrpCargo;
    @Column(name = "lrp_desde")
    private String lrpDesde;
    @Column(name = "lrp_hasta")
    private String lrpHasta;
    @Column(name = "lrp_sueldo")
    private BigDecimal lrpSueldo;
    @Column(name = "lrp_dl")
    private Integer lrpDl;
    @Column(name = "lrp_df")
    private Integer lrpDf;
    @Column(name = "lrp_de")
    private Integer lrpDe;
    @Column(name = "lrp_dd")
    private Integer lrpDd;
    @Column(name = "lrp_dpm")
    private Integer lrpDpm;
    @Column(name = "lrp_dvac")
    private Integer lrpDvac;
    @Column(name = "lrp_dp")
    private Integer lrpDp;
    @Column(name = "lrp_saldo")
    private BigDecimal lrpSaldo;
    @Column(name = "lrp_ingresos")
    private BigDecimal lrpIngresos;
    @Column(name = "lrp_horas_extras")
    private BigDecimal lrpHorasExtras;
    @Column(name = "lrp_horas_extras_100")
    private BigDecimal lrpHorasExtras100;
    @Column(name = "lrp_horas_extras_extraordinarias_100")
    private BigDecimal lrpHorasExtrasExtraordinarias100;
    @Column(name = "lrp_saldo_horas_extras_50")
    private BigDecimal lrpSaldoHorasExtras50;
    @Column(name = "lrp_saldo_horas_extras_100")
    private BigDecimal lrpSaldoHorasExtras100;
    @Column(name = "lrp_saldo_horas_extras_extraordinarias_100")
    private BigDecimal lrpSaldoHorasExtrasExtraordinarias100;
    @Column(name = "lrp_bonos")
    private BigDecimal lrpBonos;
    @Column(name = "lrp_bonosnd")
    private BigDecimal lrpBonosnd;
    @Column(name = "lrp_bono_fijo")
    private BigDecimal lrpBonosFijo;
    @Column(name = "lrp_bono_fijo_nd")
    private BigDecimal lrpBonosFijoNd;
    @Column(name = "lrp_otros_ingresos")
    private BigDecimal lrpOtrosIngresos;
    @Column(name = "lrp_otros_ingresos_nd")
    private BigDecimal lrpOtrosIngresosNd;
    @Column(name = "lrp_xiii_sueldo")
    private BigDecimal lrpXiiiSueldo;
    @Column(name = "lrp_xiv_sueldo")
    private BigDecimal lrpXivSueldo;
    @Column(name = "lrp_fondo_reserva")
    private BigDecimal lrpFondoReserva;
    @Column(name = "lrp_cancelar_fondo_reserva") ///////////////
    private Boolean lrpAcumulaFondoReserva;
    @Column(name = "lrp_liquidacion_xiii")
    private BigDecimal lrpLiquidacionXiii;
    @Column(name = "lrp_liquidacion_xiv")
    private BigDecimal lrpLiquidacionXiv;
    @Column(name = "lrp_liquidacion_vacaciones")
    private BigDecimal lrpLiquidacionVacaciones;
    @Column(name = "lrp_liquidacion_salario_digno")
    private BigDecimal lrpLiquidacionSalarioDigno;
    @Column(name = "lrp_liquidacion_desahucio")
    private BigDecimal lrpLiquidacionDesahucio;
    @Column(name = "lrp_liquidacion_desahucio_intempestivo")
    private BigDecimal lrpLiquidacionDesahucioIntempestivo;
    @Column(name = "lrp_liquidacion_bonificacion")
    private BigDecimal lrpLiquidacionBonificacion;
    @Column(name = "lrp_liquidacion")
    private BigDecimal lrpLiquidacion;
    @Column(name = "lrp_total_ingresos")
    private BigDecimal lrpTotalIngresos;
    @Column(name = "lrp_anticipos")
    private BigDecimal lrpAnticipos;
    @Column(name = "lrp_prestamos")
    private BigDecimal lrpPrestamos;
    @Column(name = "lrp_iess")
    private BigDecimal lrpIess;
    @Column(name = "lrp_iess_extension")
    private BigDecimal lrpIessExtension;
    @Column(name = "lrp_prestamo_quirografario")
    private BigDecimal lrpPrestamoQuirografario;
    @Column(name = "lrp_prestamo_hipotecario")
    private BigDecimal lrpPrestamoHipotecario;
    @Column(name = "lrp_retencion")
    private BigDecimal lrpRetencion;
    @Column(name = "lrp_descuento_permiso_medico")
    private BigDecimal lrpDescuentoPermisoMedico;
    @Column(name = "lrp_descuento_vacaciones")
    private BigDecimal lrpDescuentoVacaciones;
    @Column(name = "lrp_ingreso_vacaciones")
    private BigDecimal lrpIngresoVacaciones;
    @Column(name = "lrp_descuentos")
    private BigDecimal lrpDescuentos;
    @Column(name = "lrp_total")
    private BigDecimal lrpTotal;
    @Column(name = "lrp_pendiente")
    private Boolean lrpPendiente;
    @Column(name = "lrp_reversado")
    private Boolean lrpReversado;
    @Column(name = "lrp_anulado")
    private Boolean lrpAnulado;
    @Column(name = "lrp_forma_pago")
    private String lrpFormaPago;
    @Column(name = "lrp_documento")
    private String lrpDocumento;
    @Column(name = "lrp_contable")
    private String lrpContable;
    @Column(name = "lrp_observaciones")
    private String lrpObservaciones;
    @Column(name = "lrp_nacionalidad")
    private String nacionalidad;
    @Column(name = "lrp_impuesto_renta_modificado")
    private Boolean lrpImpuestoRentaModificado;
    @Column(name = "lrp_recargo_jornada_nocturna")
    private BigDecimal lrpRecargoJornadaNocturna;

    public RhListaDetalleRolesTO() {
    }

    public BigDecimal getLrpHorasExtras() {
        return lrpHorasExtras;
    }

    public void setLrpHorasExtras(BigDecimal lrpHorasExtras) {
        this.lrpHorasExtras = lrpHorasExtras;
    }

    public BigDecimal getLrpHorasExtras100() {
        return lrpHorasExtras100;
    }

    public void setLrpHorasExtras100(BigDecimal lrpHorasExtras100) {
        this.lrpHorasExtras100 = lrpHorasExtras100;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getLrpAcumulaFondoReserva() {
        return lrpAcumulaFondoReserva;
    }

    public void setLrpAcumulaFondoReserva(Boolean lrpAcumulaFondoReserva) {
        this.lrpAcumulaFondoReserva = lrpAcumulaFondoReserva;
    }

    public BigDecimal getLrpAnticipos() {
        return lrpAnticipos;
    }

    public void setLrpAnticipos(BigDecimal lrpAnticipos) {
        this.lrpAnticipos = lrpAnticipos;
    }

    public BigDecimal getLrpBonos() {
        return lrpBonos;
    }

    public void setLrpBonos(BigDecimal lrpBonos) {
        this.lrpBonos = lrpBonos;
    }

    public BigDecimal getLrpBonosFijo() {
        return lrpBonosFijo;
    }

    public void setLrpBonosFijo(BigDecimal lrpBonosFijo) {
        this.lrpBonosFijo = lrpBonosFijo;
    }

    public BigDecimal getLrpBonosFijoNd() {
        return lrpBonosFijoNd;
    }

    public void setLrpBonosFijoNd(BigDecimal lrpBonosFijoNd) {
        this.lrpBonosFijoNd = lrpBonosFijoNd;
    }

    public BigDecimal getLrpBonosnd() {
        return lrpBonosnd;
    }

    public void setLrpBonosnd(BigDecimal lrpBonosnd) {
        this.lrpBonosnd = lrpBonosnd;
    }

    public String getLrpCargo() {
        return lrpCargo;
    }

    public void setLrpCargo(String lrpCargo) {
        this.lrpCargo = lrpCargo;
    }

    public String getLrpContable() {
        return lrpContable;
    }

    public void setLrpContable(String lrpContable) {
        this.lrpContable = lrpContable;
    }

    public Integer getLrpDd() {
        return lrpDd;
    }

    public void setLrpDd(Integer lrpDd) {
        this.lrpDd = lrpDd;
    }

    public Integer getLrpDe() {
        return lrpDe;
    }

    public void setLrpDe(Integer lrpDe) {
        this.lrpDe = lrpDe;
    }

    public BigDecimal getLrpDescuentoPermisoMedico() {
        return lrpDescuentoPermisoMedico;
    }

    public void setLrpDescuentoPermisoMedico(BigDecimal lrpDescuentoPermisoMedico) {
        this.lrpDescuentoPermisoMedico = lrpDescuentoPermisoMedico;
    }

    public BigDecimal getLrpDescuentoVacaciones() {
        return lrpDescuentoVacaciones;
    }

    public void setLrpDescuentoVacaciones(BigDecimal lrpDescuentoVacaciones) {
        this.lrpDescuentoVacaciones = lrpDescuentoVacaciones;
    }

    public BigDecimal getLrpDescuentos() {
        return lrpDescuentos;
    }

    public void setLrpDescuentos(BigDecimal lrpDescuentos) {
        this.lrpDescuentos = lrpDescuentos;
    }

    public String getLrpDesde() {
        return lrpDesde;
    }

    public void setLrpDesde(String lrpDesde) {
        this.lrpDesde = lrpDesde;
    }

    public Integer getLrpDf() {
        return lrpDf;
    }

    public void setLrpDf(Integer lrpDf) {
        this.lrpDf = lrpDf;
    }

    public Integer getLrpDl() {
        return lrpDl;
    }

    public void setLrpDl(Integer lrpDl) {
        this.lrpDl = lrpDl;
    }

    public String getLrpDocumento() {
        return lrpDocumento;
    }

    public void setLrpDocumento(String lrpDocumento) {
        this.lrpDocumento = lrpDocumento;
    }

    public Integer getLrpDp() {
        return lrpDp;
    }

    public void setLrpDp(Integer lrpDp) {
        this.lrpDp = lrpDp;
    }

    public Integer getLrpDpm() {
        return lrpDpm;
    }

    public void setLrpDpm(Integer lrpDpm) {
        this.lrpDpm = lrpDpm;
    }

    public Integer getLrpDvac() {
        return lrpDvac;
    }

    public void setLrpDvac(Integer lrpDvac) {
        this.lrpDvac = lrpDvac;
    }

    public BigDecimal getLrpXiiiSueldo() {
        return lrpXiiiSueldo;
    }

    public void setLrpXiiiSueldo(BigDecimal lrpXiiiSueldo) {
        this.lrpXiiiSueldo = lrpXiiiSueldo;
    }

    public BigDecimal getLrpXivSueldo() {
        return lrpXivSueldo;
    }

    public void setLrpXivSueldo(BigDecimal lrpXivSueldo) {
        this.lrpXivSueldo = lrpXivSueldo;
    }

    public BigDecimal getLrpFondoReserva() {
        return lrpFondoReserva;
    }

    public void setLrpFondoReserva(BigDecimal lrpFondoReserva) {
        this.lrpFondoReserva = lrpFondoReserva;
    }

    public String getLrpFormaPago() {
        return lrpFormaPago;
    }

    public void setLrpFormaPago(String lrpFormaPago) {
        this.lrpFormaPago = lrpFormaPago;
    }

    public String getLrpHasta() {
        return lrpHasta;
    }

    public void setLrpHasta(String lrpHasta) {
        this.lrpHasta = lrpHasta;
    }

    public String getLrpId() {
        return lrpId;
    }

    public void setLrpId(String lrpId) {
        this.lrpId = lrpId;
    }

    public BigDecimal getLrpIess() {
        return lrpIess;
    }

    public void setLrpIess(BigDecimal lrpIess) {
        this.lrpIess = lrpIess;
    }

    public BigDecimal getLrpIessExtension() {
        return lrpIessExtension;
    }

    public void setLrpIessExtension(BigDecimal lrpIessExtension) {
        this.lrpIessExtension = lrpIessExtension;
    }

    public BigDecimal getLrpPrestamoQuirografario() {
        return lrpPrestamoQuirografario;
    }

    public void setLrpPrestamoQuirografario(BigDecimal lrpPrestamoQuirografario) {
        this.lrpPrestamoQuirografario = lrpPrestamoQuirografario;
    }

    public BigDecimal getLrpPrestamoHipotecario() {
        return lrpPrestamoHipotecario;
    }

    public void setLrpPrestamoHipotecario(BigDecimal lrpPrestamoHipotecario) {
        this.lrpPrestamoHipotecario = lrpPrestamoHipotecario;
    }

    public BigDecimal getLrpIngresos() {
        return lrpIngresos;
    }

    public void setLrpIngresos(BigDecimal lrpIngresos) {
        this.lrpIngresos = lrpIngresos;
    }

    public BigDecimal getLrpLiquidacion() {
        return lrpLiquidacion;
    }

    public void setLrpLiquidacion(BigDecimal lrpLiquidacion) {
        this.lrpLiquidacion = lrpLiquidacion;
    }

    public BigDecimal getLrpLiquidacionBonificacion() {
        return lrpLiquidacionBonificacion;
    }

    public void setLrpLiquidacionBonificacion(BigDecimal lrpLiquidacionBonificacion) {
        this.lrpLiquidacionBonificacion = lrpLiquidacionBonificacion;
    }

    public BigDecimal getLrpLiquidacionDesahucio() {
        return lrpLiquidacionDesahucio;
    }

    public void setLrpLiquidacionDesahucio(BigDecimal lrpLiquidacionDesahucio) {
        this.lrpLiquidacionDesahucio = lrpLiquidacionDesahucio;
    }

    public BigDecimal getLrpLiquidacionDesahucioIntempestivo() {
        return lrpLiquidacionDesahucioIntempestivo;
    }

    public void setLrpLiquidacionDesahucioIntempestivo(BigDecimal lrpLiquidacionDesahucioIntempestivo) {
        this.lrpLiquidacionDesahucioIntempestivo = lrpLiquidacionDesahucioIntempestivo;
    }

    public BigDecimal getLrpLiquidacionSalarioDigno() {
        return lrpLiquidacionSalarioDigno;
    }

    public void setLrpLiquidacionSalarioDigno(BigDecimal lrpLiquidacionSalarioDigno) {
        this.lrpLiquidacionSalarioDigno = lrpLiquidacionSalarioDigno;
    }

    public BigDecimal getLrpLiquidacionVacaciones() {
        return lrpLiquidacionVacaciones;
    }

    public void setLrpLiquidacionVacaciones(BigDecimal lrpLiquidacionVacaciones) {
        this.lrpLiquidacionVacaciones = lrpLiquidacionVacaciones;
    }

    public BigDecimal getLrpLiquidacionXiii() {
        return lrpLiquidacionXiii;
    }

    public void setLrpLiquidacionXiii(BigDecimal lrpLiquidacionXiii) {
        this.lrpLiquidacionXiii = lrpLiquidacionXiii;
    }

    public BigDecimal getLrpLiquidacionXiv() {
        return lrpLiquidacionXiv;
    }

    public void setLrpLiquidacionXiv(BigDecimal lrpLiquidacionXiv) {
        this.lrpLiquidacionXiv = lrpLiquidacionXiv;
    }

    public String getLrpNombres() {
        return lrpNombres;
    }

    public void setLrpNombres(String lrpNombres) {
        this.lrpNombres = lrpNombres;
    }

    public String getLrpObservaciones() {
        return lrpObservaciones;
    }

    public void setLrpObservaciones(String lrpObservaciones) {
        this.lrpObservaciones = lrpObservaciones;
    }

    public BigDecimal getLrpOtrosIngresos() {
        return lrpOtrosIngresos;
    }

    public void setLrpOtrosIngresos(BigDecimal lrpOtrosIngresos) {
        this.lrpOtrosIngresos = lrpOtrosIngresos;
    }

    public BigDecimal getLrpOtrosIngresosNd() {
        return lrpOtrosIngresosNd;
    }

    public void setLrpOtrosIngresosNd(BigDecimal lrpOtrosIngresosNd) {
        this.lrpOtrosIngresosNd = lrpOtrosIngresosNd;
    }

    public BigDecimal getLrpPrestamos() {
        return lrpPrestamos;
    }

    public void setLrpPrestamos(BigDecimal lrpPrestamos) {
        this.lrpPrestamos = lrpPrestamos;
    }

    public BigDecimal getLrpRetencion() {
        return lrpRetencion;
    }

    public void setLrpRetencion(BigDecimal lrpRetencion) {
        this.lrpRetencion = lrpRetencion;
    }

    public BigDecimal getLrpSaldo() {
        return lrpSaldo;
    }

    public void setLrpSaldo(BigDecimal lrpSaldo) {
        this.lrpSaldo = lrpSaldo;
    }

    public BigDecimal getLrpSueldo() {
        return lrpSueldo;
    }

    public void setLrpSueldo(BigDecimal lrpSueldo) {
        this.lrpSueldo = lrpSueldo;
    }

    public BigDecimal getLrpTotal() {
        return lrpTotal;
    }

    public void setLrpTotal(BigDecimal lrpTotal) {
        this.lrpTotal = lrpTotal;
    }

    public BigDecimal getLrpTotalIngresos() {
        return lrpTotalIngresos;
    }

    public void setLrpTotalIngresos(BigDecimal lrpTotalIngresos) {
        this.lrpTotalIngresos = lrpTotalIngresos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Boolean getLrpPendiente() {
        return lrpPendiente;
    }

    public void setLrpPendiente(Boolean lrpPendiente) {
        this.lrpPendiente = lrpPendiente;
    }

    public Boolean getLrpReversado() {
        return lrpReversado;
    }

    public void setLrpReversado(Boolean lrpReversado) {
        this.lrpReversado = lrpReversado;
    }

    public Boolean getLrpAnulado() {
        return lrpAnulado;
    }

    public void setLrpAnulado(Boolean lrpAnulado) {
        this.lrpAnulado = lrpAnulado;
    }

    public BigDecimal getLrpHorasExtrasExtraordinarias100() {
        return lrpHorasExtrasExtraordinarias100;
    }

    public void setLrpHorasExtrasExtraordinarias100(BigDecimal lrpHorasExtrasExtraordinarias100) {
        this.lrpHorasExtrasExtraordinarias100 = lrpHorasExtrasExtraordinarias100;
    }

    public BigDecimal getLrpSaldoHorasExtras50() {
        return lrpSaldoHorasExtras50;
    }

    public void setLrpSaldoHorasExtras50(BigDecimal lrpSaldoHorasExtras50) {
        this.lrpSaldoHorasExtras50 = lrpSaldoHorasExtras50;
    }

    public BigDecimal getLrpSaldoHorasExtras100() {
        return lrpSaldoHorasExtras100;
    }

    public void setLrpSaldoHorasExtras100(BigDecimal lrpSaldoHorasExtras100) {
        this.lrpSaldoHorasExtras100 = lrpSaldoHorasExtras100;
    }

    public BigDecimal getLrpSaldoHorasExtrasExtraordinarias100() {
        return lrpSaldoHorasExtrasExtraordinarias100;
    }

    public void setLrpSaldoHorasExtrasExtraordinarias100(BigDecimal lrpSaldoHorasExtrasExtraordinarias100) {
        this.lrpSaldoHorasExtrasExtraordinarias100 = lrpSaldoHorasExtrasExtraordinarias100;
    }

    public Boolean isLrpImpuestoRentaModificado() {
        return lrpImpuestoRentaModificado;
    }

    public void setLrpImpuestoRentaModificado(Boolean lrpImpuestoRentaModificado) {
        this.lrpImpuestoRentaModificado = lrpImpuestoRentaModificado;
    }

    public BigDecimal getLrpIngresoVacaciones() {
        return lrpIngresoVacaciones;
    }

    public void setLrpIngresoVacaciones(BigDecimal lrpIngresoVacaciones) {
        this.lrpIngresoVacaciones = lrpIngresoVacaciones;
    }

    public BigDecimal getLrpRecargoJornadaNocturna() {
        return lrpRecargoJornadaNocturna;
    }

    public void setLrpRecargoJornadaNocturna(BigDecimal lrpRecargoJornadaNocturna) {
        this.lrpRecargoJornadaNocturna = lrpRecargoJornadaNocturna;
    }

}
