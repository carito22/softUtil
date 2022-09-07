package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhRolTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "emp_codigo")
	private String empCodigo;

	@Column(name = "per_codigo")
	private String perCodigo;

	@Column(name = "tip_codigo")
	private String tipCodigo;

	@Column(name = "con_numero")
	private String conNumero;

	@Column(name = "sec_codigo")
	private String secCodigo;

	@Column(name = "emp_id")
	private String empId;

	@Column(name = "emp_cargo")
	private String empCargo;

	@Column(name = "rol_fecha_ultimo_sueldo")
	private String rolFechaUltimoSueldo;

	@Column(name = "rol_desde")
	private String rolDesde;// fecha

	@Column(name = "rol_hasta")
	private String rolHasta;// fecha

	@Column(name = "rol_dias_laborados_reales")
	private Integer rolDiasLaboradosReales;

	@Column(name = "rol_dias_faltas_reales")
	private Integer rolDiasFaltasReales;

	@Column(name = "rol_dias_extras_reales")
	private BigDecimal rolDiasExtrasReales;

	@Column(name = "rol_dias_descanso_reales")
	private Integer rolDiasDescansoReales;

	@Column(name = "rol_dias_pagados_reales")
	private Integer rolDiasPagadosReales;

	@Column(name = "rol_dias_permiso_medico")
	private Integer rolDiasPermisoMedico;

	@Column(name = "emp_sueldo")
	private BigDecimal empSueldo;

	@Column(name = "emp_dias_laborados")
	private Integer empDiasLaborados;

	@Column(name = "emp_dias_descanso")
	private Integer empDiasDescanso;

	@Column(name = "emp_cancelar_xiii_sueldo_mensualmente")
	private Boolean empCancelarXiiiSueldoMensualmente;

	@Column(name = "emp_cancelar_xiv_sueldo_mensualmente")
	private Boolean empCancelarXivSueldoMensualmente;

	@Column(name = "emp_cancelar_fondo_reserva_mensualmente")
	private Boolean empCancelarFondoReservaMensualmente;

	// @Column(name = "emp_dias_laborados")
	private BigDecimal empDescuentoPermisoMedico;

	@Column(name = "rol_saldo_anterior")
	private BigDecimal rolSaldoAnterior;

	@Column(name = "rol_ingresos")
	private BigDecimal rolIngresos;

	@Column(name = "rol_horas_extras")
	private BigDecimal rolHorasExtras;
	
        @Column(name = "rol_horas_extras_100")
	private BigDecimal rolHorasExtras100;
	
        @Column(name = "rol_bonos")
	private BigDecimal rolBonos;

	@Column(name = "rol_bonosnd")
	private BigDecimal rolBonosnd;

	@Column(name = "rol_viaticos")
	private BigDecimal rolViaticos;

	@Column(name = "rol_liq_fondo_reserva")
	private BigDecimal rolLiqFondoReserva;

	@Column(name = "rol_liq_xiii")
	private BigDecimal rolLiqXiii;

	@Column(name = "rol_liq_xiv")
	private BigDecimal rolLiqXiv;

	@Column(name = "rol_liq_vacaciones")
	private BigDecimal rolLiqVacaciones;

	@Column(name = "rol_liq_salario_digno")
	private BigDecimal rolLiqSalarioDigno;

	@Column(name = "rol_liq_bonificacion")
	private BigDecimal rolLiqBonificacion;// rol_liq_bonificacion

	@Column(name = "rol_liq_desahucio")
	private BigDecimal rolLiqDesahucio;

	@Column(name = "rol_liq_desahucio_intempestivo")
	private BigDecimal rolLiqDesahucioIntempestivo;

	@Column(name = "rol_anticipos")
	private BigDecimal rolAnticipos;

	@Column(name = "rol_prestamos")
	private BigDecimal rolPrestamos;

	@Column(name = "rol_prestamo_quirografario")
	private BigDecimal rolPrestamoQuirografario;

	@Column(name = "rol_prestamo_hipotecario")
	private BigDecimal rolPrestamoHipotecario;

	@Column(name = "rol_iess")
	private BigDecimal rolIess;
	
        @Column(name = "rol_iess_extension")
	private BigDecimal rolIessExtension;

	@Column(name = "rol_retencion_fuente")
	private BigDecimal rolRetencionFuente;

	@Column(name = "rol_descuento_permiso_medico")
	private BigDecimal rolDescuentoPermisoMedico;

	@Column(name = "rol_total")
	private BigDecimal rolTotal;

	@Column(name = "rol_forma_pago")
	private String rolFormaPago;

	@Column(name = "rol_aporte_patronal")
	private BigDecimal rolAportePatronal;

	@Column(name = "rol_iece")
	private BigDecimal rolIece;

	@Column(name = "rol_secap")
	private BigDecimal rolSecap;

	@Column(name = "rol_xiii")
	private BigDecimal rolXiii;

	@Column(name = "rol_xiv")
	private BigDecimal rolXiv;

	@Column(name = "rol_fondo_reserva")
	private BigDecimal rolFondoReserva;

	@Column(name = "rol_vacaciones")
	private BigDecimal rolVacaciones;

	@Column(name = "rol_desahucio")
	private BigDecimal rolDesahucio;

	@Column(name = "con_provision_empresa")
	private String rolProvisionEmpresa;

	@Column(name = "con_provision_periodo")
	private String rolProvisionPeriodo;

	@Column(name = "con_provision_tipo")
	private String rolProvisionTipo;

	@Column(name = "con_provision_numero")
	private String rolProvisionNumero;

	@Column(name = "rol_bono_fijo")
	private BigDecimal rolBonosFijo;

	@Column(name = "rol_bono_fijo_nd")
	private BigDecimal rolBonosFijoNd;

	@Column(name = "emp_bono_fijo")
	private BigDecimal empBonosFijo;

	@Column(name = "emp_bono_fijo_nd")
	private BigDecimal empBonosFijoNd;

	@Column(name = "rol_secuencial")
	private Integer rolSecuencial;

	// @Column(name = "con_provision_periodo")
	private Boolean reversar;
	private Boolean porPagar;
	// informacion
	@Column(name = "emp_forma_pago")
	private String empFormaPago;

	@Column(name = "emp_afiliado")
	private Boolean empAfiliado;

	@Column(name = "emp_retencion")
	private Boolean empRetencion;

	@Column(name = "emp_fondo_reserva")
	private Boolean empFondoReserva;

	@Column(name = "emp_salario_neto")
	private Boolean empSalarioNeto;

	@Column(name = "emp_fecha_afiliacion_iess")
	private String empFechaAfiliacionIess;

	@Column(name = "emp_primer_ingreso")
	private String empPrimerIngreso;

	@Column(name = "emp_primera_salida")
	private String empPrimeraSalida;

	@Column(name = "emp_ultimo_ingreso")
	private String empUltimoIngreso;

	@Column(name = "emp_ultima_salida")
	private String empUltimaSalida;

	@Column(name = "emp_otros_ingresos")
	private BigDecimal empOtrosIngresos;

	@Column(name = "emp_otros_ingresos_nd")
	private BigDecimal empOtrosIngresosNd;

	@Column(name = "rol_otros_ingresos")
	private BigDecimal rolOtrosIngresos;

	@Column(name = "rol_otros_ingresos_nd")
	private BigDecimal rolOtrosIngresosNd;

	public RhRolTO() {
	}

	public BigDecimal getRolLiqBonificacion() {
		return rolLiqBonificacion;
	}

	public void setRolLiqBonificacion(BigDecimal rolLiqBonificacion) {
		this.rolLiqBonificacion = rolLiqBonificacion;
	}

	public Boolean getEmpSalarioNeto() {
		return empSalarioNeto;
	}

	public void setEmpSalarioNeto(Boolean empSalarioNeto) {
		this.empSalarioNeto = empSalarioNeto;
	}

	public String getConNumero() {
		return conNumero;
	}

	public void setConNumero(String conNumero) {
		this.conNumero = conNumero;
	}

	public Boolean getEmpAfiliado() {
		return empAfiliado;
	}

	public void setEmpAfiliado(Boolean empAfiliado) {
		this.empAfiliado = empAfiliado;
	}

	public BigDecimal getEmpBonosFijo() {
		return empBonosFijo;
	}

	public void setEmpBonosFijo(BigDecimal empBonosFijo) {
		this.empBonosFijo = empBonosFijo;
	}

	public BigDecimal getEmpBonosFijoNd() {
		return empBonosFijoNd;
	}

	public void setEmpBonosFijoNd(BigDecimal empBonosFijoNd) {
		this.empBonosFijoNd = empBonosFijoNd;
	}

	public Boolean getEmpCancelarFondoReservaMensualmente() {
		return empCancelarFondoReservaMensualmente;
	}

	public void setEmpCancelarFondoReservaMensualmente(Boolean empCancelarFondoReservaMensualmente) {
		this.empCancelarFondoReservaMensualmente = empCancelarFondoReservaMensualmente;
	}

	public Boolean getEmpCancelarXiiiSueldoMensualmente() {
		return empCancelarXiiiSueldoMensualmente;
	}

	public void setEmpCancelarXiiiSueldoMensualmente(Boolean empCancelarXiiiSueldoMensualmente) {
		this.empCancelarXiiiSueldoMensualmente = empCancelarXiiiSueldoMensualmente;
	}

	public Boolean getEmpCancelarXivSueldoMensualmente() {
		return empCancelarXivSueldoMensualmente;
	}

	public void setEmpCancelarXivSueldoMensualmente(Boolean empCancelarXivSueldoMensualmente) {
		this.empCancelarXivSueldoMensualmente = empCancelarXivSueldoMensualmente;
	}

	public String getEmpCargo() {
		return empCargo;
	}

	public void setEmpCargo(String empCargo) {
		this.empCargo = empCargo;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public BigDecimal getEmpDescuentoPermisoMedico() {
		return empDescuentoPermisoMedico;
	}

	public void setEmpDescuentoPermisoMedico(BigDecimal empDescuentoPermisoMedico) {
		this.empDescuentoPermisoMedico = empDescuentoPermisoMedico;
	}

	public Integer getEmpDiasDescanso() {
		return empDiasDescanso;
	}

	public void setEmpDiasDescanso(Integer empDiasDescanso) {
		this.empDiasDescanso = empDiasDescanso;
	}

	public Integer getEmpDiasLaborados() {
		return empDiasLaborados;
	}

	public void setEmpDiasLaborados(Integer empDiasLaborados) {
		this.empDiasLaborados = empDiasLaborados;
	}

	public String getEmpFechaAfiliacionIess() {
		return empFechaAfiliacionIess;
	}

	public void setEmpFechaAfiliacionIess(String empFechaAfiliacionIess) {
		this.empFechaAfiliacionIess = empFechaAfiliacionIess;
	}

	public Boolean getEmpFondoReserva() {
		return empFondoReserva;
	}

	public void setEmpFondoReserva(Boolean empFondoReserva) {
		this.empFondoReserva = empFondoReserva;
	}

	public String getEmpFormaPago() {
		return empFormaPago;
	}

	public void setEmpFormaPago(String empFormaPago) {
		this.empFormaPago = empFormaPago;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpPrimerIngreso() {
		return empPrimerIngreso;
	}

	public void setEmpPrimerIngreso(String empPrimerIngreso) {
		this.empPrimerIngreso = empPrimerIngreso;
	}

	public String getEmpPrimeraSalida() {
		return empPrimeraSalida;
	}

	public void setEmpPrimeraSalida(String empPrimeraSalida) {
		this.empPrimeraSalida = empPrimeraSalida;
	}

	public Boolean getEmpRetencion() {
		return empRetencion;
	}

	public void setEmpRetencion(Boolean empRetencion) {
		this.empRetencion = empRetencion;
	}

	public BigDecimal getEmpSueldo() {
		return empSueldo;
	}

	public void setEmpSueldo(BigDecimal empSueldo) {
		this.empSueldo = empSueldo;
	}

	public String getEmpUltimaSalida() {
		return empUltimaSalida;
	}

	public void setEmpUltimaSalida(String empUltimaSalida) {
		this.empUltimaSalida = empUltimaSalida;
	}

	public String getEmpUltimoIngreso() {
		return empUltimoIngreso;
	}

	public void setEmpUltimoIngreso(String empUltimoIngreso) {
		this.empUltimoIngreso = empUltimoIngreso;
	}

	public String getPerCodigo() {
		return perCodigo;
	}

	public void setPerCodigo(String perCodigo) {
		this.perCodigo = perCodigo;
	}

	public BigDecimal getRolAnticipos() {
		return rolAnticipos;
	}

	public void setRolAnticipos(BigDecimal rolAnticipos) {
		this.rolAnticipos = rolAnticipos;
	}

	public BigDecimal getRolAportePatronal() {
		return rolAportePatronal;
	}

	public void setRolAportePatronal(BigDecimal rolAportePatronal) {
		this.rolAportePatronal = rolAportePatronal;
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

	public BigDecimal getRolDesahucio() {
		return rolDesahucio;
	}

	public void setRolDesahucio(BigDecimal rolDesahucio) {
		this.rolDesahucio = rolDesahucio;
	}

	public BigDecimal getRolDescuentoPermisoMedico() {
		return rolDescuentoPermisoMedico;
	}

	public void setRolDescuentoPermisoMedico(BigDecimal rolDescuentoPermisoMedico) {
		this.rolDescuentoPermisoMedico = rolDescuentoPermisoMedico;
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

	public BigDecimal getRolDiasExtrasReales() {
		return rolDiasExtrasReales;
	}

	public void setRolDiasExtrasReales(BigDecimal rolDiasExtrasReales) {
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

	public String getRolFechaUltimoSueldo() {
		return rolFechaUltimoSueldo;
	}

	public void setRolFechaUltimoSueldo(String rolFechaUltimoSueldo) {
		this.rolFechaUltimoSueldo = rolFechaUltimoSueldo;
	}

	public BigDecimal getRolFondoReserva() {
		return rolFondoReserva;
	}

	public void setRolFondoReserva(BigDecimal rolFondoReserva) {
		this.rolFondoReserva = rolFondoReserva;
	}

	public String getRolFormaPago() {
		return rolFormaPago;
	}

	public void setRolFormaPago(String rolFormaPago) {
		this.rolFormaPago = rolFormaPago;
	}

	public String getRolHasta() {
		return rolHasta;
	}

	public void setRolHasta(String rolHasta) {
		this.rolHasta = rolHasta;
	}

	public BigDecimal getRolIece() {
		return rolIece;
	}

	public void setRolIece(BigDecimal rolIece) {
		this.rolIece = rolIece;
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

	public BigDecimal getRolIngresos() {
		return rolIngresos;
	}

	public void setRolIngresos(BigDecimal rolIngresos) {
		this.rolIngresos = rolIngresos;
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

	public BigDecimal getRolLiqFondoReserva() {
		return rolLiqFondoReserva;
	}

	public void setRolLiqFondoReserva(BigDecimal rolLiqFondoReserva) {
		this.rolLiqFondoReserva = rolLiqFondoReserva;
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

	public BigDecimal getRolPrestamos() {
		return rolPrestamos;
	}

	public void setRolPrestamos(BigDecimal rolPrestamos) {
		this.rolPrestamos = rolPrestamos;
	}

	public String getRolProvisionEmpresa() {
		return rolProvisionEmpresa;
	}

	public void setRolProvisionEmpresa(String rolProvisionEmpresa) {
		this.rolProvisionEmpresa = rolProvisionEmpresa;
	}

	public String getRolProvisionNumero() {
		return rolProvisionNumero;
	}

	public void setRolProvisionNumero(String rolProvisionNumero) {
		this.rolProvisionNumero = rolProvisionNumero;
	}

	public String getRolProvisionPeriodo() {
		return rolProvisionPeriodo;
	}

	public void setRolProvisionPeriodo(String rolProvisionPeriodo) {
		this.rolProvisionPeriodo = rolProvisionPeriodo;
	}

	public String getRolProvisionTipo() {
		return rolProvisionTipo;
	}

	public void setRolProvisionTipo(String rolProvisionTipo) {
		this.rolProvisionTipo = rolProvisionTipo;
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

	public BigDecimal getRolSecap() {
		return rolSecap;
	}

	public void setRolSecap(BigDecimal rolSecap) {
		this.rolSecap = rolSecap;
	}

	public Integer getRolSecuencial() {
		return rolSecuencial;
	}

	public void setRolSecuencial(Integer rolSecuencial) {
		this.rolSecuencial = rolSecuencial;
	}

	public BigDecimal getRolTotal() {
		return rolTotal;
	}

	public void setRolTotal(BigDecimal rolTotal) {
		this.rolTotal = rolTotal;
	}

	public BigDecimal getRolVacaciones() {
		return rolVacaciones;
	}

	public void setRolVacaciones(BigDecimal rolVacaciones) {
		this.rolVacaciones = rolVacaciones;
	}

	public BigDecimal getRolViaticos() {
		return rolViaticos;
	}

	public void setRolViaticos(BigDecimal rolViaticos) {
		this.rolViaticos = rolViaticos;
	}

	public BigDecimal getRolXiii() {
		return rolXiii;
	}

	public void setRolXiii(BigDecimal rolXiii) {
		this.rolXiii = rolXiii;
	}

	public BigDecimal getRolXiv() {
		return rolXiv;
	}

	public void setRolXiv(BigDecimal rolXiv) {
		this.rolXiv = rolXiv;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public String getTipCodigo() {
		return tipCodigo;
	}

	public void setTipCodigo(String tipCodigo) {
		this.tipCodigo = tipCodigo;
	}

	public Boolean getReversar() {
		return reversar;
	}

	public void setReversar(Boolean reversar) {
		this.reversar = reversar;
	}

	public BigDecimal getEmpOtrosIngresos() {
		return empOtrosIngresos;
	}

	public void setEmpOtrosIngresos(BigDecimal empOtrosIngresos) {
		this.empOtrosIngresos = empOtrosIngresos;
	}

	public BigDecimal getEmpOtrosIngresosNd() {
		return empOtrosIngresosNd;
	}

	public void setEmpOtrosIngresosNd(BigDecimal empOtrosIngresosNd) {
		this.empOtrosIngresosNd = empOtrosIngresosNd;
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

	public Boolean getPorPagar() {
		return porPagar;
	}

	public void setPorPagar(Boolean porPagar) {
		this.porPagar = porPagar;
	}

}