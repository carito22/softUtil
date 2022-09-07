package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContable;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdSector;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhEmpleado;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhRol;
import ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisPeriodo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RhRolEmpleadoTO extends RhListaEmpleadoLoteTO {

    private static final long serialVersionUID = 1L;

    private String empCodigo;
    private String perCodigo;
    private String tipCodigo;
    private String conNumero;
    private String secCodigo;
    private String empId;
    private String empApellidosNombres;
    private String rolCargo;
    private String rolFechaUltimoSueldo;
    private Date rolDesde;
    private Date rolHasta;
    private BigDecimal rolSueldo;
    private BigDecimal rolLiqFondoReserva;
    private BigDecimal rolLiqXiii;
    private BigDecimal rolLiqXiv;
    private BigDecimal rolLiqVacaciones;
    private BigDecimal rolLiqSalarioDigno;
    private BigDecimal rolLiqBonificacion;
    private BigDecimal rolLiqDesahucio;
    private BigDecimal rolLiqDesahucioIntempestivo;
    private BigDecimal rolPrestamos;
    private String rolFormaPago;
    private String conDetDocumento;
    private String conObservaciones;
    private Boolean porPagar;
    private Boolean liquidacion;
    private String fechaSalida;
    private String motivoSalida;
    private String empFormaPago;
    private Boolean reversar;
    private Boolean grabar;
    RhContableTO rhContableTO;
    private String usrInsertaRol;
    private String nacionalidad;
    private RhComboFormaPagoTO formaPago;
    private SisPeriodo periodo;
    private String numDocumento;
    private String observacion;
    private BigDecimal rolHorasExtrasReales;
    private BigDecimal rolHorasExtrasReales100;
    private BigDecimal prestamo;
    private BigDecimal rolPrestamoQuirografario;
    private BigDecimal rolPrestamoHipotecario;
    private BigDecimal extensionIESS;
    private BigDecimal valorAnteriorPrestamo;
    private boolean isFormaPagoValido;
    private boolean isDiasFaltaValido;
    private boolean isDiasPermisoValido;
    private boolean isChequeValido;
    private boolean isPrestamoValido;
    //Variables propios de RhRol
    private short rolDiasFaltasReales;
    private short rolDiasExtrasReales;
    private Integer rolDiasVacaciones;
    private short rolDiasPermisoMedico;
    private Integer rolSecuencial;
    private boolean rolAuxiliar;
    private PrdSector prdSector;
    private RhEmpleado rhEmpleado;
    private BigDecimal rolBono;
    private BigDecimal rolAnticipo;
    private BigDecimal rolSaldoAnterior;
    private ConContable contableProvision;

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public RhRolEmpleadoTO() {
    }

    public static List<RhRolEmpleadoTO> convertirListaRhRolAListaRhRolEmpleadoTO(List<RhRol> listaRhRoles, List<RhComboFormaPagoTO> listaRhComboFormaPagoTO) {
        List<RhRolEmpleadoTO> listaRhRolEmpleadoTO = new ArrayList<RhRolEmpleadoTO>();
        for (RhRol rhRol : listaRhRoles) {
            RhComboFormaPagoTO rhComboFormaPagoTO = null;
            for (RhComboFormaPagoTO item : listaRhComboFormaPagoTO) {
                if (rhRol.getConCuentas() != null && item.getCtaCodigo().equalsIgnoreCase(rhRol.getConCuentas().getConCuentasPK().getCtaCodigo())) {
                    rhComboFormaPagoTO = item;
                    break;
                }
            }
            listaRhRolEmpleadoTO.add(convertirRhRolARhRolEmpleadoTO(rhRol, rhComboFormaPagoTO));
        }
        return listaRhRolEmpleadoTO;
    }

    public static RhRolEmpleadoTO convertirRhRolARhRolEmpleadoTO(RhRol rhRol, RhComboFormaPagoTO rhComboFormaPagoTO) {
        RhRolEmpleadoTO rhRolEmpleadoTO = new RhRolEmpleadoTO();
        rhRolEmpleadoTO.setPrAfiliado(rhRol.getRhEmpleado().getEmpFechaAfiliacionIess() != null);
        rhRolEmpleadoTO.setPrCargo(rhRol.getRhEmpleado().getEmpCargo());
        rhRolEmpleadoTO.setPrCategoria(rhRol.getRhEmpleado().getRhCategoria().getRhCategoriaPK().getCatNombre());
        rhRolEmpleadoTO.setPrEmpresa(rhRol.getRhEmpleado().getRhEmpleadoPK().getEmpEmpresa());
        if (rhRol.getRhEmpleado().getEmpFechaAfiliacionIess() != null) {
            rhRolEmpleadoTO.setPrFechaIngreso(rhRol.getRhEmpleado().getEmpFechaAfiliacionIess());
        } else {
            rhRolEmpleadoTO.setPrFechaIngreso(rhRol.getRhEmpleado().getEmpFechaPrimerIngreso());
        }
        rhRolEmpleadoTO.setRolHasta(rhRol.getRolHasta());
        rhRolEmpleadoTO.setRolDesde(rhRolEmpleadoTO.getPrFechaIngreso().after(rhRol.getRolDesde()) ? rhRolEmpleadoTO.getPrFechaIngreso() : rhRol.getRolDesde());
        rhRolEmpleadoTO.setPrFechaUltimoSueldo(rhRol.getRhEmpleado().getEmpFechaUltimoSueldo());
        rhRolEmpleadoTO.setPrId(rhRol.getRhEmpleado().getRhEmpleadoPK().getEmpId());
        rhRolEmpleadoTO.setPrNombres(rhRol.getRhEmpleado().getEmpApellidos() + " " + rhRol.getRhEmpleado().getEmpNombres());
        rhRolEmpleadoTO.setPrSaldoAnterior(rhRol.getRhEmpleado().getEmpSaldoAnterior());
        rhRolEmpleadoTO.setPrSaldoAnticipos(rhRol.getRhEmpleado().getEmpSaldoAnticipos());
        rhRolEmpleadoTO.setPrSaldoBonos(rhRol.getRhEmpleado().getEmpSaldoBonos());
        rhRolEmpleadoTO.setPrSaldoCuotas(rhRol.getRhEmpleado().getEmpSaldoCuotas());
        rhRolEmpleadoTO.setPrSaldoPrestamos(rhRol.getRhEmpleado().getEmpSaldoPrestamos());
        rhRolEmpleadoTO.setRolPrestamoHipotecario(rhRol.getRolPrestamoHipotecario());
        rhRolEmpleadoTO.setRolPrestamoQuirografario(rhRol.getRolPrestamoQuirografario());
        rhRolEmpleadoTO.setPrSector(rhRol.getRhEmpleado().getPrdSector().getPrdSectorPK().getSecCodigo());
        rhRolEmpleadoTO.setPrSueldo(rhRol.getRhEmpleado().getEmpSueldoIess());
        rhRolEmpleadoTO.setFormaPago(rhComboFormaPagoTO == null ? new RhComboFormaPagoTO(rhRol.getRolFormaPago(), "000000000000", false) : rhComboFormaPagoTO);
        rhRolEmpleadoTO.setRolDiasExtrasReales(rhRol.getRolDiasExtrasReales());
        rhRolEmpleadoTO.setNumDocumento(rhRol.getRolDocumento());
        rhRolEmpleadoTO.setObservacion(rhRol.getRolObservaciones());
        rhRolEmpleadoTO.setRolHorasExtrasReales(rhRol.getRolHorasExtras());
        rhRolEmpleadoTO.setRolHorasExtrasReales100(rhRol.getRolHorasExtras100());
        rhRolEmpleadoTO.setRolDiasFaltasReales(rhRol.getRolDiasFaltasReales());
        rhRolEmpleadoTO.setRolDiasVacaciones(rhRol.getRolDiasVacaciones());
        rhRolEmpleadoTO.setRolDiasPermisoMedico(rhRol.getRolDiasPermisoMedico());
        rhRolEmpleadoTO.setRolLiqFondoReserva(rhRol.getRolLiqFondoReserva());
        rhRolEmpleadoTO.setRolLiqXiii(rhRol.getRolLiqXiii());
        rhRolEmpleadoTO.setRolLiqXiv(rhRol.getRolLiqXiv());
        rhRolEmpleadoTO.setRolLiqVacaciones(rhRol.getRolLiqVacaciones());
        rhRolEmpleadoTO.setRolLiqSalarioDigno(rhRol.getRolLiqSalarioDigno());
        rhRolEmpleadoTO.setRolLiqBonificacion(rhRol.getRolLiqBonificacion());
        rhRolEmpleadoTO.setRolLiqDesahucio(rhRol.getRolLiqDesahucio());
        rhRolEmpleadoTO.setRolLiqDesahucioIntempestivo(rhRol.getRolLiqDesahucioIntempestivo());
        rhRolEmpleadoTO.setLiquidacion(true);
        rhRolEmpleadoTO.setMotivoSalida("");
        rhRolEmpleadoTO.setIsFormaPagoValido(true);
        rhRolEmpleadoTO.setIsDiasFaltaValido(true);
        rhRolEmpleadoTO.setIsDiasPermisoValido(true);
        rhRolEmpleadoTO.setIsChequeValido(true);
        rhRolEmpleadoTO.setIsPrestamoValido(true);
        rhRolEmpleadoTO.setRolSecuencial(rhRol.getRolSecuencial());
        rhRolEmpleadoTO.setRolAuxiliar(rhRol.isRolAuxiliar());
        rhRolEmpleadoTO.setPrdSector(rhRol.getRhEmpleado().getPrdSector());
        rhRolEmpleadoTO.setRhEmpleado(rhRol.getRhEmpleado());
        rhRolEmpleadoTO.getRhEmpleado().setEmpSaldoPrestamos(rhRolEmpleadoTO.getPrSaldoPrestamos());
        rhRolEmpleadoTO.setPrestamo(rhRol.getRolPrestamos());
        rhRolEmpleadoTO.setRolBono(rhRol.getRolBonos());
        rhRolEmpleadoTO.setRolAnticipo(rhRol.getRolAnticipos());
        rhRolEmpleadoTO.setRolSaldoAnterior(rhRol.getRolSaldoAnterior());
        rhRolEmpleadoTO.setContableProvision(rhRol.getConContableProvision());
        return rhRolEmpleadoTO;
    }

    public RhRolEmpleadoTO(String empCodigo, String perCodigo, String tipCodigo, String conNumero, String secCodigo,
            String empId, String empApellidosNombres, String rolCargo, String rolFechaUltimoSueldo, Date rolDesde,
            Date rolHasta, short rolDiasFaltasReales, short rolDiasExtrasReales, short rolDiasPermisoMedico,
            BigDecimal rolSueldo, BigDecimal rolLiqFondoReserva, BigDecimal rolLiqXiii, BigDecimal rolLiqXiv,
            BigDecimal rolLiqVacaciones, BigDecimal rolLiqSalarioDigno, BigDecimal rolLiqBonificacion,
            BigDecimal rolLiqDesahucio, BigDecimal rolLiqDesahucioIntempestivo, BigDecimal rolPrestamos,
            String rolFormaPago, String conDetDocumento, String conObservaciones, Boolean porPagar, Boolean liquidacion,
            String fechaSalida, String motivoSalida, String empFormaPago, Boolean reversar, Boolean grabar,
            String usrInsertaRol, String nacionalidad) {
        this.empCodigo = empCodigo;
        this.perCodigo = perCodigo;
        this.tipCodigo = tipCodigo;
        this.conNumero = conNumero;
        this.secCodigo = secCodigo;
        this.empId = empId;
        this.empApellidosNombres = empApellidosNombres;
        this.rolCargo = rolCargo;
        this.rolFechaUltimoSueldo = rolFechaUltimoSueldo;
        this.rolDesde = rolDesde;
        this.rolHasta = rolHasta;
        this.rolDiasFaltasReales = rolDiasFaltasReales;
        this.rolDiasExtrasReales = rolDiasExtrasReales;
        this.rolDiasPermisoMedico = rolDiasPermisoMedico;
        this.rolSueldo = rolSueldo;
        this.rolLiqFondoReserva = rolLiqFondoReserva;
        this.rolLiqXiii = rolLiqXiii;
        this.rolLiqXiv = rolLiqXiv;
        this.rolLiqVacaciones = rolLiqVacaciones;
        this.rolLiqSalarioDigno = rolLiqSalarioDigno;
        this.rolLiqBonificacion = rolLiqBonificacion;
        this.rolLiqDesahucio = rolLiqDesahucio;
        this.rolLiqDesahucioIntempestivo = rolLiqDesahucioIntempestivo;
        this.rolPrestamos = rolPrestamos;
        this.rolFormaPago = rolFormaPago;
        this.conDetDocumento = conDetDocumento;
        this.conObservaciones = conObservaciones;
        this.porPagar = porPagar;
        this.liquidacion = liquidacion;
        this.fechaSalida = fechaSalida;
        this.motivoSalida = motivoSalida;
        this.empFormaPago = empFormaPago;
        this.reversar = reversar;
        this.grabar = grabar;
        this.usrInsertaRol = usrInsertaRol;
        this.nacionalidad = nacionalidad;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getPerCodigo() {
        return perCodigo;
    }

    public void setPerCodigo(String perCodigo) {
        this.perCodigo = perCodigo;
    }

    public String getTipCodigo() {
        return tipCodigo;
    }

    public void setTipCodigo(String tipCodigo) {
        this.tipCodigo = tipCodigo;
    }

    public String getConNumero() {
        return conNumero;
    }

    public void setConNumero(String conNumero) {
        this.conNumero = conNumero;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpApellidosNombres() {
        return empApellidosNombres;
    }

    public void setEmpApellidosNombres(String empApellidosNombres) {
        this.empApellidosNombres = empApellidosNombres;
    }

    public String getRolCargo() {
        return rolCargo;
    }

    public void setRolCargo(String rolCargo) {
        this.rolCargo = rolCargo;
    }

    public String getRolFechaUltimoSueldo() {
        return rolFechaUltimoSueldo;
    }

    public void setRolFechaUltimoSueldo(String rolFechaUltimoSueldo) {
        this.rolFechaUltimoSueldo = rolFechaUltimoSueldo;
    }

    public Date getRolDesde() {
        return rolDesde;
    }

    public void setRolDesde(Date rolDesde) {
        this.rolDesde = rolDesde;
    }

    public Date getRolHasta() {
        return rolHasta;
    }

    public void setRolHasta(Date rolHasta) {
        this.rolHasta = rolHasta;
    }

    public short getRolDiasFaltasReales() {
        return rolDiasFaltasReales;
    }

    public void setRolDiasFaltasReales(short rolDiasFaltasReales) {
        this.rolDiasFaltasReales = rolDiasFaltasReales;
    }

    public short getRolDiasExtrasReales() {
        return rolDiasExtrasReales;
    }

    public void setRolDiasExtrasReales(short rolDiasExtrasReales) {
        this.rolDiasExtrasReales = rolDiasExtrasReales;
    }

    public short getRolDiasPermisoMedico() {
        return rolDiasPermisoMedico;
    }

    public void setRolDiasPermisoMedico(short rolDiasPermisoMedico) {
        this.rolDiasPermisoMedico = rolDiasPermisoMedico;
    }

    public Integer getRolDiasVacaciones() {
        return rolDiasVacaciones;
    }

    public void setRolDiasVacaciones(Integer rolDiasVacaciones) {
        this.rolDiasVacaciones = rolDiasVacaciones;
    }

    public BigDecimal getRolSueldo() {
        return rolSueldo;
    }

    public void setRolSueldo(BigDecimal rolSueldo) {
        this.rolSueldo = rolSueldo;
    }

    public BigDecimal getRolLiqFondoReserva() {
        return rolLiqFondoReserva;
    }

    public void setRolLiqFondoReserva(BigDecimal rolLiqFondoReserva) {
        this.rolLiqFondoReserva = rolLiqFondoReserva;
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

    public BigDecimal getRolLiqVacaciones() {
        return rolLiqVacaciones;
    }

    public void setRolLiqVacaciones(BigDecimal rolLiqVacaciones) {
        this.rolLiqVacaciones = rolLiqVacaciones;
    }

    public BigDecimal getRolLiqSalarioDigno() {
        return rolLiqSalarioDigno;
    }

    public void setRolLiqSalarioDigno(BigDecimal rolLiqSalarioDigno) {
        this.rolLiqSalarioDigno = rolLiqSalarioDigno;
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

    public BigDecimal getRolPrestamos() {
        return rolPrestamos;
    }

    public void setRolPrestamos(BigDecimal rolPrestamos) {
        this.rolPrestamos = rolPrestamos;
    }

    public String getRolFormaPago() {
        return rolFormaPago;
    }

    public void setRolFormaPago(String rolFormaPago) {
        this.rolFormaPago = rolFormaPago;
    }

    public String getConDetDocumento() {
        return conDetDocumento;
    }

    public void setConDetDocumento(String conDetDocumento) {
        this.conDetDocumento = conDetDocumento;
    }

    public String getConObservaciones() {
        return conObservaciones;
    }

    public void setConObservaciones(String conObservaciones) {
        this.conObservaciones = conObservaciones;
    }

    public Boolean getPorPagar() {
        return porPagar;
    }

    public void setPorPagar(Boolean porPagar) {
        this.porPagar = porPagar;
    }

    public Boolean getLiquidacion() {
        return liquidacion;
    }

    public void setLiquidacion(Boolean liquidacion) {
        this.liquidacion = liquidacion;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getMotivoSalida() {
        return motivoSalida;
    }

    public void setMotivoSalida(String motivoSalida) {
        this.motivoSalida = motivoSalida;
    }

    public String getEmpFormaPago() {
        return empFormaPago;
    }

    public void setEmpFormaPago(String empFormaPago) {
        this.empFormaPago = empFormaPago;
    }

    public Boolean getReversar() {
        return reversar;
    }

    public void setReversar(Boolean reversar) {
        this.reversar = reversar;
    }

    public Boolean getGrabar() {
        return grabar;
    }

    public void setGrabar(Boolean grabar) {
        this.grabar = grabar;
    }

    public RhContableTO getRhContableTO() {
        return rhContableTO;
    }

    public void setRhContableTO(RhContableTO rhContableTO) {
        this.rhContableTO = rhContableTO;
    }

    public String getUsrInsertaRol() {
        return usrInsertaRol;
    }

    public void setUsrInsertaRol(String usrInsertaRol) {
        this.usrInsertaRol = usrInsertaRol;
    }

    public RhComboFormaPagoTO getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(RhComboFormaPagoTO formaPago) {
        this.formaPago = formaPago;
    }

    public SisPeriodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(SisPeriodo periodo) {
        this.periodo = periodo;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getRolHorasExtrasReales() {
        return rolHorasExtrasReales;
    }

    public void setRolHorasExtrasReales(BigDecimal rolHorasExtrasReales) {
        this.rolHorasExtrasReales = rolHorasExtrasReales;
    }

    public BigDecimal getRolHorasExtrasReales100() {
        return rolHorasExtrasReales100;
    }

    public void setRolHorasExtrasReales100(BigDecimal rolHorasExtrasReales100) {
        this.rolHorasExtrasReales100 = rolHorasExtrasReales100;
    }

    public BigDecimal getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(BigDecimal prestamo) {
        this.prestamo = prestamo;
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

    public BigDecimal getExtensionIESS() {
        return extensionIESS;
    }

    public void setExtensionIESS(BigDecimal extensionIESS) {
        this.extensionIESS = extensionIESS;
    }

    public BigDecimal getValorAnteriorPrestamo() {
        return valorAnteriorPrestamo;
    }

    public void setValorAnteriorPrestamo(BigDecimal valorAnteriorPrestamo) {
        this.valorAnteriorPrestamo = valorAnteriorPrestamo;
    }

    public boolean isIsFormaPagoValido() {
        return isFormaPagoValido;
    }

    public void setIsFormaPagoValido(boolean isFormaPagoValido) {
        this.isFormaPagoValido = isFormaPagoValido;
    }

    public boolean isIsDiasFaltaValido() {
        return isDiasFaltaValido;
    }

    public void setIsDiasFaltaValido(boolean isDiasFaltaValido) {
        this.isDiasFaltaValido = isDiasFaltaValido;
    }

    public boolean isIsDiasPermisoValido() {
        return isDiasPermisoValido;
    }

    public void setIsDiasPermisoValido(boolean isDiasPermisoValido) {
        this.isDiasPermisoValido = isDiasPermisoValido;
    }

    public boolean isIsChequeValido() {
        return isChequeValido;
    }

    public void setIsChequeValido(boolean isChequeValido) {
        this.isChequeValido = isChequeValido;
    }

    public boolean isIsPrestamoValido() {
        return isPrestamoValido;
    }

    public void setIsPrestamoValido(boolean isPrestamoValido) {
        this.isPrestamoValido = isPrestamoValido;
    }

    public Integer getRolSecuencial() {
        return rolSecuencial;
    }

    public void setRolSecuencial(Integer rolSecuencial) {
        this.rolSecuencial = rolSecuencial;
    }

    public boolean isRolAuxiliar() {
        return rolAuxiliar;
    }

    public void setRolAuxiliar(boolean rolAuxiliar) {
        this.rolAuxiliar = rolAuxiliar;
    }

    public PrdSector getPrdSector() {
        return prdSector;
    }

    public void setPrdSector(PrdSector prdSector) {
        this.prdSector = prdSector;
    }

    public RhEmpleado getRhEmpleado() {
        return rhEmpleado;
    }

    public void setRhEmpleado(RhEmpleado rhEmpleado) {
        this.rhEmpleado = rhEmpleado;
    }

    public BigDecimal getRolBono() {
        return rolBono;
    }

    public void setRolBono(BigDecimal rolBono) {
        this.rolBono = rolBono;
    }

    public BigDecimal getRolAnticipo() {
        return rolAnticipo;
    }

    public void setRolAnticipo(BigDecimal rolAnticipo) {
        this.rolAnticipo = rolAnticipo;
    }

    public BigDecimal getRolSaldoAnterior() {
        return rolSaldoAnterior;
    }

    public void setRolSaldoAnterior(BigDecimal rolSaldoAnterior) {
        this.rolSaldoAnterior = rolSaldoAnterior;
    }

    public ConContable getContableProvision() {
        return contableProvision;
    }

    public void setContableProvision(ConContable contableProvision) {
        this.contableProvision = contableProvision;
    }

}
