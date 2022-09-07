package ec.com.todocompu.ShrimpSoftUtils.rrhh.report;

import java.io.Serializable;
import java.math.BigDecimal;

import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaDetalleRolesTO;

public class ReportesRol implements Serializable {

    private static final long serialVersionUID = 1L;
    private String comprobante;
    private String cedula;
    private String nombres;
    private String fecha;
    private String fechaFinLabores;
    private String rolCargo;
    private String rolDesde;// fecha
    private String rolHasta;// fecha
    private Integer rolDiasLaboradosReales;
    private Integer rolDiasFaltasReales;
    private Integer rolDiasExtrasReales;
    private Integer rolDiasDescansoReales;
    private Integer rolDiasPagadosReales;
    private Integer rolDiasPermisoMedico;
    private Integer rolDiasVacaciones;
    private BigDecimal empSueldo;
    private boolean empAcumulaFondoReserva;
    private BigDecimal rolSaldoAnterior;
    private BigDecimal rolIngresos;
    private BigDecimal rolBonos;
    private BigDecimal rolHorasExtras;
    private BigDecimal rolHorasExtras100;
    private BigDecimal rolHorasExtrasExtraordinarias100;
    private BigDecimal rolSaldoHorasExtras50;
    private BigDecimal rolSaldoHorasExtras100;
    private BigDecimal rolSaldoHorasExtrasExtraordinarias100;
    private BigDecimal rolBonosnd;
    private BigDecimal rolBonosFijo;
    private BigDecimal rolBonosFijoNd;
    private BigDecimal rolOtrosIngresos;
    private BigDecimal rolOtrosIngresosNd;
    private BigDecimal rolXiiiSueldo;
    private BigDecimal rolXivSueldo;
    private BigDecimal rolFondoReserva;
    private BigDecimal totalIngresos;
    private BigDecimal rolDescuento;
    private BigDecimal rolLiqXiii;
    private BigDecimal rolLiqXiv;
    private BigDecimal rolLiqVacaciones;
    private BigDecimal rolLiqSalarioDigno;
    private BigDecimal rolLiqDesahucio;
    private BigDecimal rolLiqDesahucioIntempestivo;
    private BigDecimal rolLiqBonificacion;
    private BigDecimal rolAnticipos;
    private BigDecimal rolPrestamos;
    private BigDecimal empDescuentoPermisoMedico;
    private BigDecimal empDescuentoVacaciones;
    private BigDecimal rolIngresoVacaciones;
    private BigDecimal rolIess;
    private BigDecimal rolIessExtension;
    private BigDecimal rolPrestamoQuirografario;
    private BigDecimal rolPrestamoHipotecario;
    private BigDecimal rolRetencionFuente;
    private String sedConcepto;
    private String sedDetalle;
    private String sedCp;
    private String sedCc;
    private String sedFecha;
    private BigDecimal sedValor;
    private String sedObservaciones;
    private String formaPago;
    private String referencia;
    private BigDecimal valor;
    private String nacionalidad;
    private String nomSector;
    private String lrpObservaciones;
    private String rolMotivoSalida;
    private boolean rolImpuestoRentaModificado;
    private String empresa;
    private String empCorreoElectronico;

    public ReportesRol() {
    }

    public ReportesRol(String comprobante, String cedula, String nombres, String fecha, String rolCargo,
            String rolDesde, String rolHasta, Integer rolDiasLaboradosReales, Integer rolDiasFaltasReales,
            Integer rolDiasExtrasReales, Integer rolDiasDescansoReales, Integer rolDiasPagadosReales,
            Integer rolDiasPermisoMedico, Integer rolDiasVacaciones, BigDecimal empSueldo, boolean empAcumulaFondoReserva,
            BigDecimal rolSaldoAnterior, BigDecimal rolIngresos,
            BigDecimal rolHorasExtras, BigDecimal rolHorasExtras100, BigDecimal rolHorasExtrasExtraordinarias100,
            BigDecimal rolSaldoHorasExtras50, BigDecimal rolSaldoHorasExtras100, BigDecimal rolSaldoHorasExtrasExtraordinarias100,
            BigDecimal rolBonos, BigDecimal rolBonosnd,
            BigDecimal rolBonosFijo, BigDecimal rolBonosFijoNd, BigDecimal rolOtrosIngresos,
            BigDecimal rolOtrosIngresosNd, BigDecimal rolXiiiSueldo, BigDecimal rolXivSueldo, BigDecimal rolFondoReserva, BigDecimal totalIngresos,
            BigDecimal rolDescuento, BigDecimal rolLiqXiii, BigDecimal rolLiqXiv, BigDecimal rolLiqVacaciones,
            BigDecimal rolLiqSalarioDigno, BigDecimal rolLiqDesahucio, BigDecimal rolLiqDesahucioIntempestivo,
            BigDecimal rolLiqBonificacion, BigDecimal rolAnticipos, BigDecimal rolPrestamos,
            BigDecimal empDescuentoPermisoMedico, BigDecimal empDescuentoVacaciones, BigDecimal rolIess, BigDecimal rolIessExtension, BigDecimal rolPrestamoQuirografario, BigDecimal rolPrestamoHipotecario, BigDecimal rolRetencionFuente, String sedConcepto,
            String sedDetalle, String sedCp, String sedCc, String sedFecha, BigDecimal sedValor,
            String sedObservaciones, String formaPago, String referencia, BigDecimal valor, String nacionalidad, boolean rolImpuestoRentaModificado) {
        this.comprobante = comprobante;
        this.cedula = cedula;
        this.nombres = nombres;
        this.fecha = fecha;
        this.rolCargo = rolCargo;
        this.rolDesde = rolDesde;
        this.rolHasta = rolHasta;
        this.rolDiasLaboradosReales = rolDiasLaboradosReales;
        this.rolDiasFaltasReales = rolDiasFaltasReales;
        this.rolDiasExtrasReales = rolDiasExtrasReales;
        this.rolDiasDescansoReales = rolDiasDescansoReales;
        this.rolDiasPagadosReales = rolDiasPagadosReales;
        this.rolDiasPermisoMedico = rolDiasPermisoMedico;
        this.rolDiasVacaciones = rolDiasVacaciones;
        this.empSueldo = empSueldo;
        this.empAcumulaFondoReserva = empAcumulaFondoReserva;
        this.rolSaldoAnterior = rolSaldoAnterior;
        this.rolIngresos = rolIngresos;
        this.rolHorasExtras = rolHorasExtras == null ? BigDecimal.ZERO : rolHorasExtras;
        this.rolHorasExtras100 = rolHorasExtras100 == null ? BigDecimal.ZERO : rolHorasExtras100;
        this.rolHorasExtrasExtraordinarias100 = rolHorasExtrasExtraordinarias100 == null ? BigDecimal.ZERO : rolHorasExtrasExtraordinarias100;
        this.rolSaldoHorasExtras50 = rolSaldoHorasExtras50 == null ? BigDecimal.ZERO : rolSaldoHorasExtras50;
        this.rolSaldoHorasExtras100 = rolSaldoHorasExtras100 == null ? BigDecimal.ZERO : rolSaldoHorasExtras100;
        this.rolSaldoHorasExtrasExtraordinarias100 = rolSaldoHorasExtrasExtraordinarias100 == null ? BigDecimal.ZERO : rolSaldoHorasExtrasExtraordinarias100;
        this.rolBonos = rolBonos;
        this.rolBonosnd = rolBonosnd;
        this.rolBonosFijo = rolBonosFijo;
        this.rolBonosFijoNd = rolBonosFijoNd;
        this.rolOtrosIngresos = rolOtrosIngresos;
        this.rolOtrosIngresosNd = rolOtrosIngresosNd;
        this.rolXiiiSueldo = rolXiiiSueldo;
        this.rolXivSueldo = rolXivSueldo;
        this.rolFondoReserva = rolFondoReserva;
        this.totalIngresos = totalIngresos;
        this.rolDescuento = rolDescuento;
        this.rolLiqXiii = rolLiqXiii;
        this.rolLiqXiv = rolLiqXiv;
        this.rolLiqVacaciones = rolLiqVacaciones;
        this.rolLiqSalarioDigno = rolLiqSalarioDigno;
        this.rolLiqDesahucio = rolLiqDesahucio;
        this.rolLiqDesahucioIntempestivo = rolLiqDesahucioIntempestivo;
        this.rolLiqBonificacion = rolLiqBonificacion;
        this.rolAnticipos = rolAnticipos;
        this.rolPrestamos = rolPrestamos;
        this.empDescuentoPermisoMedico = empDescuentoPermisoMedico;
        this.empDescuentoVacaciones = empDescuentoVacaciones;
        this.rolIess = rolIess;
        this.rolIessExtension = rolIessExtension;
        this.rolPrestamoQuirografario = rolPrestamoQuirografario;
        this.rolPrestamoHipotecario = rolPrestamoHipotecario;
        this.rolRetencionFuente = rolRetencionFuente;
        this.sedConcepto = sedConcepto;
        this.sedDetalle = sedDetalle;
        this.sedCp = sedCp;
        this.sedCc = sedCc;
        this.sedFecha = sedFecha;
        this.sedValor = sedValor;
        this.sedObservaciones = sedObservaciones;
        this.formaPago = formaPago;
        this.referencia = referencia;
        this.valor = valor;
        this.nacionalidad = nacionalidad;
        this.rolImpuestoRentaModificado = rolImpuestoRentaModificado;
    }

    public ReportesRol(RhListaDetalleRolesTO rolDetalle, String sedConcepto, String sedDetalle, String sedCp,
            String sedCc, String sedFecha, BigDecimal sedValor, String sedObservaciones, String nomSector) {
        this.comprobante = rolDetalle.getLrpContable();
        this.cedula = rolDetalle.getLrpId();
        this.nombres = rolDetalle.getLrpNombres();
        this.fecha = rolDetalle.getLrpHasta();
        this.rolCargo = rolDetalle.getLrpCargo();
        this.rolDesde = rolDetalle.getLrpDesde();
        this.rolHasta = rolDetalle.getLrpHasta();
        this.rolDiasLaboradosReales = rolDetalle.getLrpDl();
        this.rolDiasFaltasReales = rolDetalle.getLrpDf();
        this.rolDiasExtrasReales = rolDetalle.getLrpDe();
        this.rolDiasDescansoReales = rolDetalle.getLrpDd();
        this.rolDiasPagadosReales = rolDetalle.getLrpDp();
        this.rolDiasPermisoMedico = rolDetalle.getLrpDpm();
        this.rolDiasVacaciones = rolDetalle.getLrpDvac();
        this.empSueldo = rolDetalle.getLrpSueldo();
        this.empAcumulaFondoReserva = rolDetalle.getLrpAcumulaFondoReserva() == null ? false
                : rolDetalle.getLrpAcumulaFondoReserva();
        this.rolSaldoAnterior = rolDetalle.getLrpSaldo();
        this.rolIngresos = rolDetalle.getLrpIngresos();
        this.rolHorasExtras = rolDetalle.getLrpHorasExtras() == null ? BigDecimal.ZERO : rolDetalle.getLrpHorasExtras();
        this.rolHorasExtras100 = rolDetalle.getLrpHorasExtras100() == null ? BigDecimal.ZERO : rolDetalle.getLrpHorasExtras100();
        this.rolHorasExtrasExtraordinarias100 = rolDetalle.getLrpHorasExtrasExtraordinarias100() == null ? BigDecimal.ZERO : rolDetalle.getLrpHorasExtrasExtraordinarias100();
        this.rolSaldoHorasExtras50 = rolDetalle.getLrpSaldoHorasExtras50() == null ? BigDecimal.ZERO : rolDetalle.getLrpSaldoHorasExtras50();
        this.rolSaldoHorasExtras100 = rolDetalle.getLrpSaldoHorasExtras100() == null ? BigDecimal.ZERO : rolDetalle.getLrpSaldoHorasExtras100();
        this.rolSaldoHorasExtrasExtraordinarias100 = rolDetalle.getLrpSaldoHorasExtrasExtraordinarias100() == null ? BigDecimal.ZERO : rolDetalle.getLrpSaldoHorasExtrasExtraordinarias100();
        this.rolBonos = rolDetalle.getLrpBonos();
        this.rolBonosnd = rolDetalle.getLrpBonosnd();
        this.rolBonosFijo = rolDetalle.getLrpBonosFijo();
        this.rolBonosFijoNd = rolDetalle.getLrpBonosFijoNd();
        this.rolOtrosIngresos = rolDetalle.getLrpOtrosIngresos();
        this.rolOtrosIngresosNd = rolDetalle.getLrpOtrosIngresosNd();
        this.rolXiiiSueldo = rolDetalle.getLrpXiiiSueldo();
        this.rolXivSueldo = rolDetalle.getLrpXivSueldo();
        this.rolFondoReserva = rolDetalle.getLrpFondoReserva();
        this.totalIngresos = rolDetalle.getLrpTotalIngresos();
        this.rolDescuento = rolDetalle.getLrpDescuentos();
        this.rolLiqXiii = rolDetalle.getLrpLiquidacionXiii();
        this.rolLiqXiv = rolDetalle.getLrpLiquidacionXiv();
        this.rolLiqVacaciones = rolDetalle.getLrpLiquidacionVacaciones();
        this.rolLiqSalarioDigno = rolDetalle.getLrpLiquidacionSalarioDigno();
        this.rolLiqDesahucio = rolDetalle.getLrpLiquidacionDesahucio();
        this.rolLiqDesahucioIntempestivo = rolDetalle.getLrpLiquidacionDesahucioIntempestivo();
        this.rolLiqBonificacion = rolDetalle.getLrpLiquidacionBonificacion();
        this.rolAnticipos = rolDetalle.getLrpAnticipos();
        this.rolPrestamos = rolDetalle.getLrpPrestamos();
        this.empDescuentoPermisoMedico = rolDetalle.getLrpDescuentoPermisoMedico();
        this.empDescuentoVacaciones = rolDetalle.getLrpDescuentoVacaciones();
        this.rolIngresoVacaciones = rolDetalle.getLrpIngresoVacaciones();
        this.rolIess = rolDetalle.getLrpIess();
        this.rolIessExtension = rolDetalle.getLrpIessExtension();
        this.rolPrestamoQuirografario = rolDetalle.getLrpPrestamoQuirografario();
        this.rolPrestamoHipotecario = rolDetalle.getLrpPrestamoHipotecario();
        this.rolRetencionFuente = rolDetalle.getLrpRetencion();
        this.sedConcepto = sedConcepto;
        this.sedDetalle = sedDetalle;
        this.sedCp = sedCp;
        this.sedCc = sedCc;
        this.sedFecha = sedFecha;
        this.sedValor = sedValor;
        this.sedObservaciones = sedObservaciones;
        this.formaPago = rolDetalle.getLrpFormaPago();
        this.referencia = rolDetalle.getLrpDocumento();
        this.valor = rolDetalle.getLrpTotal();
        this.nacionalidad = rolDetalle.getNacionalidad();
        this.lrpObservaciones = rolDetalle.getLrpObservaciones();
        this.nomSector = nomSector;
        this.rolImpuestoRentaModificado = rolDetalle.isLrpImpuestoRentaModificado();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public boolean isEmpAcumulaFondoReserva() {
        return empAcumulaFondoReserva;
    }

    public void setEmpAcumulaFondoReserva(boolean empAcumulaFondoReserva) {
        this.empAcumulaFondoReserva = empAcumulaFondoReserva;
    }

    public BigDecimal getEmpDescuentoPermisoMedico() {
        return empDescuentoPermisoMedico;
    }

    public void setEmpDescuentoPermisoMedico(BigDecimal empDescuentoPermisoMedico) {
        this.empDescuentoPermisoMedico = empDescuentoPermisoMedico;
    }

    public BigDecimal getEmpSueldo() {
        return empSueldo;
    }

    public void setEmpSueldo(BigDecimal empSueldo) {
        this.empSueldo = empSueldo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public BigDecimal getRolAnticipos() {
        return rolAnticipos;
    }

    public void setRolAnticipos(BigDecimal rolAnticipos) {
        this.rolAnticipos = rolAnticipos;
    }

    public BigDecimal getRolHorasExtras() {
        return rolHorasExtras;
    }

    public void setRolHorasExtras(BigDecimal rolHorasExtras) {
        this.rolHorasExtras = rolHorasExtras;
    }

    public BigDecimal getRolHorasExtras100() {
        return rolHorasExtras100;
    }

    public void setRolHorasExtras100(BigDecimal rolHorasExtras100) {
        this.rolHorasExtras100 = rolHorasExtras100;
    }

    public BigDecimal getRolBonos() {
        return rolBonos;
    }

    public void setRolBonos(BigDecimal rolBonos) {
        this.rolBonos = rolBonos;
    }

    public BigDecimal getRolBonosFijo() {
        return rolBonosFijo;
    }

    public void setRolBonosFijo(BigDecimal rolBonosFijo) {
        this.rolBonosFijo = rolBonosFijo;
    }

    public BigDecimal getRolBonosFijoNd() {
        return rolBonosFijoNd;
    }

    public void setRolBonosFijoNd(BigDecimal rolBonosFijoNd) {
        this.rolBonosFijoNd = rolBonosFijoNd;
    }

    public BigDecimal getRolBonosnd() {
        return rolBonosnd;
    }

    public void setRolBonosnd(BigDecimal rolBonosnd) {
        this.rolBonosnd = rolBonosnd;
    }

    public String getRolCargo() {
        return rolCargo;
    }

    public void setRolCargo(String rolCargo) {
        this.rolCargo = rolCargo;
    }

    public BigDecimal getRolDescuento() {
        return rolDescuento;
    }

    public void setRolDescuento(BigDecimal rolDescuento) {
        this.rolDescuento = rolDescuento;
    }

    public String getRolDesde() {
        return rolDesde;
    }

    public void setRolDesde(String rolDesde) {
        this.rolDesde = rolDesde;
    }

    public Integer getRolDiasDescansoReales() {
        return rolDiasDescansoReales;
    }

    public void setRolDiasDescansoReales(Integer rolDiasDescansoReales) {
        this.rolDiasDescansoReales = rolDiasDescansoReales;
    }

    public Integer getRolDiasExtrasReales() {
        return rolDiasExtrasReales;
    }

    public void setRolDiasExtrasReales(Integer rolDiasExtrasReales) {
        this.rolDiasExtrasReales = rolDiasExtrasReales;
    }

    public Integer getRolDiasFaltasReales() {
        return rolDiasFaltasReales;
    }

    public void setRolDiasFaltasReales(Integer rolDiasFaltasReales) {
        this.rolDiasFaltasReales = rolDiasFaltasReales;
    }

    public Integer getRolDiasLaboradosReales() {
        return rolDiasLaboradosReales;
    }

    public void setRolDiasLaboradosReales(Integer rolDiasLaboradosReales) {
        this.rolDiasLaboradosReales = rolDiasLaboradosReales;
    }

    public Integer getRolDiasPagadosReales() {
        return rolDiasPagadosReales;
    }

    public void setRolDiasPagadosReales(Integer rolDiasPagadosReales) {
        this.rolDiasPagadosReales = rolDiasPagadosReales;
    }

    public Integer getRolDiasPermisoMedico() {
        return rolDiasPermisoMedico;
    }

    public void setRolDiasPermisoMedico(Integer rolDiasPermisoMedico) {
        this.rolDiasPermisoMedico = rolDiasPermisoMedico;
    }

    public BigDecimal getRolXiiiSueldo() {
        return rolXiiiSueldo;
    }

    public void setRolXiiiSueldo(BigDecimal rolXiiiSueldo) {
        this.rolXiiiSueldo = rolXiiiSueldo;
    }

    public BigDecimal getRolXivSueldo() {
        return rolXivSueldo;
    }

    public void setRolXivSueldo(BigDecimal rolXivSueldo) {
        this.rolXivSueldo = rolXivSueldo;
    }

    public BigDecimal getRolFondoReserva() {
        return rolFondoReserva;
    }

    public void setRolFondoReserva(BigDecimal rolFondoReserva) {
        this.rolFondoReserva = rolFondoReserva;
    }

    public String getRolHasta() {
        return rolHasta;
    }

    public void setRolHasta(String rolHasta) {
        this.rolHasta = rolHasta;
    }

    public BigDecimal getRolIess() {
        return rolIess;
    }

    public void setRolIess(BigDecimal rolIess) {
        this.rolIess = rolIess;
    }

    public BigDecimal getRolIessExtension() {
        return rolIessExtension;
    }

    public void setRolIessExtension(BigDecimal rolIessExtension) {
        this.rolIessExtension = rolIessExtension;
    }

    public BigDecimal getRolPrestamoQuirografario() {
        return rolPrestamoQuirografario;
    }

    public void setRolPrestamoQuirografario(BigDecimal rolPrestamoQuirografario) {
        this.rolPrestamoQuirografario = rolPrestamoQuirografario;
    }

    public BigDecimal getRolPrestamoHipotecario() {
        return rolPrestamoHipotecario;
    }

    public void setRolPrestamoHipotecario(BigDecimal rolPrestamoHipotecario) {
        this.rolPrestamoHipotecario = rolPrestamoHipotecario;
    }

    public BigDecimal getRolIngresos() {
        return rolIngresos;
    }

    public void setRolIngresos(BigDecimal rolIngresos) {
        this.rolIngresos = rolIngresos;
    }

    public BigDecimal getRolLiqBonificacion() {
        return rolLiqBonificacion;
    }

    public void setRolLiqBonificacion(BigDecimal rolLiqBonificacion) {
        this.rolLiqBonificacion = rolLiqBonificacion;
    }

    public BigDecimal getRolLiqDesahucio() {
        return rolLiqDesahucio;
    }

    public void setRolLiqDesahucio(BigDecimal rolLiqDesahucio) {
        this.rolLiqDesahucio = rolLiqDesahucio;
    }

    public BigDecimal getRolLiqDesahucioIntempestivo() {
        return rolLiqDesahucioIntempestivo;
    }

    public void setRolLiqDesahucioIntempestivo(BigDecimal rolLiqDesahucioIntempestivo) {
        this.rolLiqDesahucioIntempestivo = rolLiqDesahucioIntempestivo;
    }

    public BigDecimal getRolLiqSalarioDigno() {
        return rolLiqSalarioDigno;
    }

    public void setRolLiqSalarioDigno(BigDecimal rolLiqSalarioDigno) {
        this.rolLiqSalarioDigno = rolLiqSalarioDigno;
    }

    public BigDecimal getRolLiqVacaciones() {
        return rolLiqVacaciones;
    }

    public void setRolLiqVacaciones(BigDecimal rolLiqVacaciones) {
        this.rolLiqVacaciones = rolLiqVacaciones;
    }

    public BigDecimal getRolLiqXiii() {
        return rolLiqXiii;
    }

    public void setRolLiqXiii(BigDecimal rolLiqXiii) {
        this.rolLiqXiii = rolLiqXiii;
    }

    public BigDecimal getRolLiqXiv() {
        return rolLiqXiv;
    }

    public void setRolLiqXiv(BigDecimal rolLiqXiv) {
        this.rolLiqXiv = rolLiqXiv;
    }

    public BigDecimal getRolOtrosIngresos() {
        return rolOtrosIngresos;
    }

    public void setRolOtrosIngresos(BigDecimal rolOtrosIngresos) {
        this.rolOtrosIngresos = rolOtrosIngresos;
    }

    public BigDecimal getRolOtrosIngresosNd() {
        return rolOtrosIngresosNd;
    }

    public void setRolOtrosIngresosNd(BigDecimal rolOtrosIngresosNd) {
        this.rolOtrosIngresosNd = rolOtrosIngresosNd;
    }

    public BigDecimal getRolPrestamos() {
        return rolPrestamos;
    }

    public void setRolPrestamos(BigDecimal rolPrestamos) {
        this.rolPrestamos = rolPrestamos;
    }

    public BigDecimal getRolRetencionFuente() {
        return rolRetencionFuente;
    }

    public void setRolRetencionFuente(BigDecimal rolRetencionFuente) {
        this.rolRetencionFuente = rolRetencionFuente;
    }

    public BigDecimal getRolSaldoAnterior() {
        return rolSaldoAnterior;
    }

    public void setRolSaldoAnterior(BigDecimal rolSaldoAnterior) {
        this.rolSaldoAnterior = rolSaldoAnterior;
    }

    public String getSedCc() {
        return sedCc;
    }

    public void setSedCc(String sedCc) {
        this.sedCc = sedCc;
    }

    public String getSedConcepto() {
        return sedConcepto;
    }

    public void setSedConcepto(String sedConcepto) {
        this.sedConcepto = sedConcepto;
    }

    public String getSedCp() {
        return sedCp;
    }

    public void setSedCp(String sedCp) {
        this.sedCp = sedCp;
    }

    public String getSedDetalle() {
        return sedDetalle;
    }

    public void setSedDetalle(String sedDetalle) {
        this.sedDetalle = sedDetalle;
    }

    public String getSedFecha() {
        return sedFecha;
    }

    public void setSedFecha(String sedFecha) {
        this.sedFecha = sedFecha;
    }

    public String getSedObservaciones() {
        return sedObservaciones;
    }

    public void setSedObservaciones(String sedObservaciones) {
        this.sedObservaciones = sedObservaciones;
    }

    public BigDecimal getSedValor() {
        return sedValor;
    }

    public void setSedValor(BigDecimal sedValor) {
        this.sedValor = sedValor;
    }

    public BigDecimal getTotalIngresos() {
        return totalIngresos;
    }

    public void setTotalIngresos(BigDecimal totalIngresos) {
        this.totalIngresos = totalIngresos;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getNomSector() {
        return nomSector;
    }

    public void setNomSector(String nomSector) {
        this.nomSector = nomSector;
    }

    public BigDecimal getRolHorasExtrasExtraordinarias100() {
        return rolHorasExtrasExtraordinarias100;
    }

    public void setRolHorasExtrasExtraordinarias100(BigDecimal rolHorasExtrasExtraordinarias100) {
        this.rolHorasExtrasExtraordinarias100 = rolHorasExtrasExtraordinarias100;
    }

    public BigDecimal getRolSaldoHorasExtras50() {
        return rolSaldoHorasExtras50;
    }

    public void setRolSaldoHorasExtras50(BigDecimal rolSaldoHorasExtras50) {
        this.rolSaldoHorasExtras50 = rolSaldoHorasExtras50;
    }

    public BigDecimal getRolSaldoHorasExtras100() {
        return rolSaldoHorasExtras100;
    }

    public void setRolSaldoHorasExtras100(BigDecimal rolSaldoHorasExtras100) {
        this.rolSaldoHorasExtras100 = rolSaldoHorasExtras100;
    }

    public BigDecimal getRolSaldoHorasExtrasExtraordinarias100() {
        return rolSaldoHorasExtrasExtraordinarias100;
    }

    public void setRolSaldoHorasExtrasExtraordinarias100(BigDecimal rolSaldoHorasExtrasExtraordinarias100) {
        this.rolSaldoHorasExtrasExtraordinarias100 = rolSaldoHorasExtrasExtraordinarias100;
    }

    public String getLrpObservaciones() {
        return lrpObservaciones;
    }

    public void setLrpObservaciones(String lrpObservaciones) {
        this.lrpObservaciones = lrpObservaciones;
    }

    public boolean isRolImpuestoRentaModificado() {
        return rolImpuestoRentaModificado;
    }

    public void setRolImpuestoRentaModificado(boolean rolImpuestoRentaModificado) {
        this.rolImpuestoRentaModificado = rolImpuestoRentaModificado;
    }

    public Integer getRolDiasVacaciones() {
        return rolDiasVacaciones;
    }

    public void setRolDiasVacaciones(Integer rolDiasVacaciones) {
        this.rolDiasVacaciones = rolDiasVacaciones;
    }

    public BigDecimal getEmpDescuentoVacaciones() {
        return empDescuentoVacaciones;
    }

    public void setEmpDescuentoVacaciones(BigDecimal empDescuentoVacaciones) {
        this.empDescuentoVacaciones = empDescuentoVacaciones;
    }

    public String getRolMotivoSalida() {
        return rolMotivoSalida;
    }

    public void setRolMotivoSalida(String rolMotivoSalida) {
        this.rolMotivoSalida = rolMotivoSalida;
    }

    public String getFechaFinLabores() {
        return fechaFinLabores;
    }

    public void setFechaFinLabores(String fechaFinLabores) {
        this.fechaFinLabores = fechaFinLabores;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpCorreoElectronico() {
        return empCorreoElectronico;
    }

    public void setEmpCorreoElectronico(String empCorreoElectronico) {
        this.empCorreoElectronico = empCorreoElectronico;
    }

    public BigDecimal getRolIngresoVacaciones() {
        return rolIngresoVacaciones;
    }

    public void setRolIngresoVacaciones(BigDecimal rolIngresoVacaciones) {
        this.rolIngresoVacaciones = rolIngresoVacaciones;
    }

}
