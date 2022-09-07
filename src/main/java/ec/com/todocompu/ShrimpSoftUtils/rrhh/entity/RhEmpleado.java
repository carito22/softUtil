package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdSector;

@Entity
@Table(name = "rh_empleado", schema = "recursoshumanos")
public class RhEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;

    protected RhEmpleadoPK rhEmpleadoPK;
    private char empTipoId;
    private String empResidenciaTipo;
    private String empResidenciaPais;
    private String empConvenio;
    private String empApellidos;
    private String empNombres;
    private Character empGenero;
    private Date empFechaNacimiento;
    private String empEstadoCivil;
    private int empCargasFamiliares;
    private String empProvincia;
    private String empCanton;
    private String empLugarNacimiento;
    private String empDomicilio;
    private String empNumero;
    private String empTelefono;
    private String empCorreoElectronico;
    private Date empFechaPrimerIngreso;
    private Date empFechaPrimeraSalida;
    private Date empFechaUltimoIngreso;
    private Date empFechaUltimaSalida;
    private String empMotivoSalida;
    private Date empFechaAfiliacionIess;
    private String empCodigoAfiliacionIess;
    private String empCodigoCargo;
    private String empCargo;
    private BigDecimal empSueldoIess;
    private String empFormaPago;
    private int empDiasTrabajados;
    private int empDiasDescanso;
    private BigDecimal empBonoFijo;
    private BigDecimal empBonoFijoNd;
    private BigDecimal empOtrosIngresos;
    private BigDecimal empOtrosIngresosNd;
    private boolean empExtensionCoberturaIess;
    private boolean empCancelarXiiiSueldoMensualmente;
    private boolean empCancelarXivSueldoMensualmente;
    private boolean empCancelarFondoReservaMensualmente;
    private boolean empRetencion;
    private BigDecimal empEducacion;
    private BigDecimal empAlimentacion;
    private BigDecimal empSalud;
    private BigDecimal empVivienda;
    private BigDecimal empVestuario;
    private BigDecimal empRebajaDiscapacidad;
    private BigDecimal empRebajaTerceraEdad;
    private BigDecimal empSueldoOtraCompania;
    private BigDecimal empOtrasDeducciones;
    private BigDecimal empOtrasRebajas;
    private BigDecimal empUtilidades;
    private String empObservaciones;
    private String empDiscapacidadTipo;
    private Short empDiscapacidadPorcentaje;
    private Character empDiscapacidadIdTipo;
    private String empDiscapacidadIdNumero;
    private String empBanco;
    private String empCuentaTipo;
    private String empCuentaNumero;
    private boolean empSalarioNeto;
    private boolean empInactivo;
    private BigDecimal empSaldoAnterior;
    private BigDecimal empSaldoAnticipos;
    private BigDecimal empSaldoBonos;
    private BigDecimal empSaldoBonosNd;
    private BigDecimal empSaldoPrestamos;
    private int empSaldoCuotas;
    private Date empFechaUltimoSueldo;
    private PrdSector prdSector;
    private RhCategoria rhCategoria;
    private String usrEmpresa;
    private String usrCodigo;
    private Timestamp usrFechaInserta;
    private List<RhRol> rhRolList;
    private List<RhEmpleadoDescuentosFijos> rhEmpleadoDescuentosFijosList;
    private List<RhXiiiSueldo> rhXiiiSueldoList;
    private List<RhPrestamo> rhPrestamoList;
    private List<RhVacaciones> rhVacacionesList;
    private List<RhBono> rhBonoList;
    private List<RhXivSueldo> rhXivSueldoList;
    private List<RhAnticipo> rhAnticipoList;
    private List<RhUtilidades> rhUtilidadesList;
    private List<RhSalarioDigno> rhSalarioDignoList;
    private BigDecimal empAnticipoQuincena;
    private BigDecimal empPrestamoQuirografario;
    private BigDecimal empPrestamoHipotecario;
    private BigDecimal empSaldoHorasExtras50;
    private BigDecimal empSaldoHorasExtras100;
    private BigDecimal empSaldoHorasExtrasExtraordinarias100;
    private RhRelacionTrabajo empRelacionTrabajo;
    private String empDescripcion;
    private BigDecimal empTurismo;
    private BigDecimal empPensionesAlimenticias;
    private BigDecimal empDescuentoPrestamos;

    private boolean empMaternidad;
    private boolean empLactancia;
    private Date empFechaDesdeLactancia;
    private Date empFechaHastaLactancia;

    public RhEmpleado() {
    }

    public RhEmpleado(RhEmpleadoPK rhEmpleadoPK) {
        this.rhEmpleadoPK = rhEmpleadoPK;
    }

    public RhEmpleado(RhEmpleadoPK rhEmpleadoPK, char empTipoId, String empResidenciaTipo, String empResidenciaPais,
            String empConvenio, String empApellidos, String empNombres, Character empGenero, Date empFechaNacimiento,
            String empEstadoCivil, int empCargasFamiliares, String empProvincia, String empCanton,
            String empLugarNacimiento, String empDomicilio, String empNumero, String empTelefono,
            String empCorreoElectronico, Date empFechaPrimerIngreso, Date empFechaPrimeraSalida,
            Date empFechaUltimoIngreso, Date empFechaUltimaSalida, String empMotivoSalida, Date empFechaAfiliacionIess,
            String empCodigoAfiliacionIess, String empCodigoCargo, String empCargo, BigDecimal empSueldoIess,
            String empFormaPago, int empDiasTrabajados, int empDiasDescanso, BigDecimal empBonoFijo,
            BigDecimal empBonoFijoNd, BigDecimal empOtrosIngresos, BigDecimal empOtrosIngresosNd,
            boolean empExtensionCoberturaIess, boolean empCancelarXiiiSueldoMensualmente,
            boolean empCancelarXivSueldoMensualmente, boolean empCancelarFondoReservaMensualmente, boolean empRetencion,
            BigDecimal empEducacion, BigDecimal empAlimentacion, BigDecimal empSalud, BigDecimal empVivienda,
            BigDecimal empVestuario, BigDecimal empRebajaDiscapacidad, BigDecimal empRebajaTerceraEdad,
            BigDecimal empSueldoOtraCompania, BigDecimal empOtrasDeducciones, BigDecimal empOtrasRebajas,
            BigDecimal empUtilidades, String empObservaciones, String empDiscapacidadTipo,
            Short empDiscapacidadPorcentaje, Character empDiscapacidadIdTipo, String empDiscapacidadIdNumero,
            String empBanco, String empCuentaTipo, String empCuentaNumero, boolean empSalarioNeto, boolean empInactivo,
            BigDecimal empSaldoAnterior, BigDecimal empSaldoAnticipos, BigDecimal empSaldoBonos,
            BigDecimal empSaldoBonosNd, BigDecimal empSaldoPrestamos, int empSaldoCuotas, Date empFechaUltimoSueldo,
            PrdSector prdSector, RhCategoria rhCategoria, String usrEmpresa, String usrCodigo,
            Timestamp usrFechaInserta, BigDecimal empTurismo, BigDecimal empPensionesAlimenticias, BigDecimal empDescuentoPrestamos) {
        this.rhEmpleadoPK = rhEmpleadoPK;
        this.empTipoId = empTipoId;
        this.empResidenciaTipo = empResidenciaTipo;
        this.empResidenciaPais = empResidenciaPais;
        this.empConvenio = empConvenio;
        this.empApellidos = empApellidos;
        this.empNombres = empNombres;
        this.empGenero = empGenero;
        this.empFechaNacimiento = empFechaNacimiento;
        this.empEstadoCivil = empEstadoCivil;
        this.empCargasFamiliares = empCargasFamiliares;
        this.empProvincia = empProvincia;
        this.empCanton = empCanton;
        this.empLugarNacimiento = empLugarNacimiento;
        this.empDomicilio = empDomicilio;
        this.empNumero = empNumero;
        this.empTelefono = empTelefono;
        this.empCorreoElectronico = empCorreoElectronico;
        this.empFechaPrimerIngreso = empFechaPrimerIngreso;
        this.empFechaPrimeraSalida = empFechaPrimeraSalida;
        this.empFechaUltimoIngreso = empFechaUltimoIngreso;
        this.empFechaUltimaSalida = empFechaUltimaSalida;
        this.empMotivoSalida = empMotivoSalida;
        this.empFechaAfiliacionIess = empFechaAfiliacionIess;
        this.empCodigoAfiliacionIess = empCodigoAfiliacionIess;
        this.empCodigoCargo = empCodigoCargo;
        this.empCargo = empCargo;
        this.empSueldoIess = empSueldoIess;
        this.empFormaPago = empFormaPago;
        this.empDiasTrabajados = empDiasTrabajados;
        this.empDiasDescanso = empDiasDescanso;
        this.empBonoFijo = empBonoFijo;
        this.empBonoFijoNd = empBonoFijoNd;
        this.empOtrosIngresos = empOtrosIngresos;
        this.empOtrosIngresosNd = empOtrosIngresosNd;
        this.empExtensionCoberturaIess = empExtensionCoberturaIess;
        this.empCancelarXiiiSueldoMensualmente = empCancelarXiiiSueldoMensualmente;
        this.empCancelarXivSueldoMensualmente = empCancelarXivSueldoMensualmente;
        this.empCancelarFondoReservaMensualmente = empCancelarFondoReservaMensualmente;
        this.empRetencion = empRetencion;
        this.empEducacion = empEducacion;
        this.empAlimentacion = empAlimentacion;
        this.empSalud = empSalud;
        this.empVivienda = empVivienda;
        this.empVestuario = empVestuario;
        this.empRebajaDiscapacidad = empRebajaDiscapacidad;
        this.empRebajaTerceraEdad = empRebajaTerceraEdad;
        this.empSueldoOtraCompania = empSueldoOtraCompania;
        this.empOtrasDeducciones = empOtrasDeducciones;
        this.empOtrasRebajas = empOtrasRebajas;
        this.empUtilidades = empUtilidades;
        this.empObservaciones = empObservaciones;
        this.empDiscapacidadTipo = empDiscapacidadTipo;
        this.empDiscapacidadPorcentaje = empDiscapacidadPorcentaje;
        this.empDiscapacidadIdTipo = empDiscapacidadIdTipo;
        this.empDiscapacidadIdNumero = empDiscapacidadIdNumero;
        this.empBanco = empBanco;
        this.empCuentaTipo = empCuentaTipo;
        this.empCuentaNumero = empCuentaNumero;
        this.empSalarioNeto = empSalarioNeto;
        this.empInactivo = empInactivo;
        this.empSaldoAnterior = empSaldoAnterior;
        this.empSaldoAnticipos = empSaldoAnticipos;
        this.empSaldoBonos = empSaldoBonos;
        this.empSaldoBonosNd = empSaldoBonosNd;
        this.empSaldoPrestamos = empSaldoPrestamos;
        this.empSaldoCuotas = empSaldoCuotas;
        this.empFechaUltimoSueldo = empFechaUltimoSueldo;
        this.prdSector = prdSector;
        this.rhCategoria = rhCategoria;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.empTurismo = empTurismo;
        this.empPensionesAlimenticias = empPensionesAlimenticias;
        this.empDescuentoPrestamos = empDescuentoPrestamos;
    }

    public RhEmpleado(String empEmpresa, String empId) {
        this.rhEmpleadoPK = new RhEmpleadoPK(empEmpresa, empId);
    }

    @EmbeddedId
    public RhEmpleadoPK getRhEmpleadoPK() {
        return rhEmpleadoPK;
    }

    public void setRhEmpleadoPK(RhEmpleadoPK rhEmpleadoPK) {
        this.rhEmpleadoPK = rhEmpleadoPK;
    }

    @Column(name = "emp_tipo_id")
    public char getEmpTipoId() {
        return empTipoId;
    }

    public void setEmpTipoId(char empTipoId) {
        this.empTipoId = empTipoId;
    }

    @Column(name = "emp_residencia_tipo")
    public String getEmpResidenciaTipo() {
        return empResidenciaTipo;
    }

    public void setEmpResidenciaTipo(String empResidenciaTipo) {
        this.empResidenciaTipo = empResidenciaTipo;
    }

    @Column(name = "emp_residencia_pais")
    public String getEmpResidenciaPais() {
        return empResidenciaPais;
    }

    public void setEmpResidenciaPais(String empResidenciaPais) {
        this.empResidenciaPais = empResidenciaPais;
    }

    @Column(name = "emp_convenio")
    public String getEmpConvenio() {
        return empConvenio;
    }

    public void setEmpConvenio(String empConvenio) {
        this.empConvenio = empConvenio;
    }

    @Column(name = "emp_apellidos")
    public String getEmpApellidos() {
        return empApellidos;
    }

    public void setEmpApellidos(String empApellidos) {
        this.empApellidos = empApellidos;
    }

    @Column(name = "emp_nombres")
    public String getEmpNombres() {
        return empNombres;
    }

    public void setEmpNombres(String empNombres) {
        this.empNombres = empNombres;
    }

    @Column(name = "emp_genero")
    public Character getEmpGenero() {
        return empGenero;
    }

    public void setEmpGenero(Character empGenero) {
        this.empGenero = empGenero;
    }

    @Column(name = "emp_fecha_nacimiento")
    public Date getEmpFechaNacimiento() {
        return empFechaNacimiento;
    }

    public void setEmpFechaNacimiento(Date empFechaNacimiento) {
        this.empFechaNacimiento = empFechaNacimiento;
    }

    @Column(name = "emp_estado_civil")
    public String getEmpEstadoCivil() {
        return empEstadoCivil;
    }

    public void setEmpEstadoCivil(String empEstadoCivil) {
        this.empEstadoCivil = empEstadoCivil;
    }

    @Column(name = "emp_cargas_familiares")
    public int getEmpCargasFamiliares() {
        return empCargasFamiliares;
    }

    public void setEmpCargasFamiliares(int empCargasFamiliares) {
        this.empCargasFamiliares = empCargasFamiliares;
    }

    @Column(name = "emp_provincia")
    public String getEmpProvincia() {
        return empProvincia;
    }

    public void setEmpProvincia(String empProvincia) {
        this.empProvincia = empProvincia;
    }

    @Column(name = "emp_canton")
    public String getEmpCanton() {
        return empCanton;
    }

    public void setEmpCanton(String empCanton) {
        this.empCanton = empCanton;
    }

    @Column(name = "emp_lugar_nacimiento")
    public String getEmpLugarNacimiento() {
        return empLugarNacimiento;
    }

    public void setEmpLugarNacimiento(String empLugarNacimiento) {
        this.empLugarNacimiento = empLugarNacimiento;
    }

    @Column(name = "emp_domicilio")
    public String getEmpDomicilio() {
        return empDomicilio;
    }

    public void setEmpDomicilio(String empDomicilio) {
        this.empDomicilio = empDomicilio;
    }

    @Column(name = "emp_numero")
    public String getEmpNumero() {
        return empNumero;
    }

    public void setEmpNumero(String empNumero) {
        this.empNumero = empNumero;
    }

    @Column(name = "emp_telefono")
    public String getEmpTelefono() {
        return empTelefono;
    }

    public void setEmpTelefono(String empTelefono) {
        this.empTelefono = empTelefono;
    }

    @Column(name = "emp_correo_electronico")
    public String getEmpCorreoElectronico() {
        return empCorreoElectronico;
    }

    public void setEmpCorreoElectronico(String empCorreoElectronico) {
        this.empCorreoElectronico = empCorreoElectronico;
    }

    @Column(name = "emp_fecha_primer_ingreso")
    public Date getEmpFechaPrimerIngreso() {
        return empFechaPrimerIngreso;
    }

    public void setEmpFechaPrimerIngreso(Date empFechaPrimerIngreso) {
        this.empFechaPrimerIngreso = empFechaPrimerIngreso;
    }

    @Column(name = "emp_fecha_primera_salida")
    public Date getEmpFechaPrimeraSalida() {
        return empFechaPrimeraSalida;
    }

    public void setEmpFechaPrimeraSalida(Date empFechaPrimeraSalida) {
        this.empFechaPrimeraSalida = empFechaPrimeraSalida;
    }

    @Column(name = "emp_fecha_ultimo_ingreso")
    public Date getEmpFechaUltimoIngreso() {
        return empFechaUltimoIngreso;
    }

    public void setEmpFechaUltimoIngreso(Date empFechaUltimoIngreso) {
        this.empFechaUltimoIngreso = empFechaUltimoIngreso;
    }

    @Column(name = "emp_fecha_ultima_salida")
    public Date getEmpFechaUltimaSalida() {
        return empFechaUltimaSalida;
    }

    public void setEmpFechaUltimaSalida(Date empFechaUltimaSalida) {
        this.empFechaUltimaSalida = empFechaUltimaSalida;
    }

    @Column(name = "emp_motivo_salida")
    public String getEmpMotivoSalida() {
        return empMotivoSalida;
    }

    public void setEmpMotivoSalida(String empMotivoSalida) {
        this.empMotivoSalida = empMotivoSalida;
    }

    @Column(name = "emp_fecha_afiliacion_iess")
    public Date getEmpFechaAfiliacionIess() {
        return empFechaAfiliacionIess;
    }

    public void setEmpFechaAfiliacionIess(Date empFechaAfiliacionIess) {
        this.empFechaAfiliacionIess = empFechaAfiliacionIess;
    }

    @Column(name = "emp_codigo_afiliacion_iess")
    public String getEmpCodigoAfiliacionIess() {
        return empCodigoAfiliacionIess;
    }

    public void setEmpCodigoAfiliacionIess(String empCodigoAfiliacionIess) {
        this.empCodigoAfiliacionIess = empCodigoAfiliacionIess;
    }

    @Column(name = "emp_codigo_cargo")
    public String getEmpCodigoCargo() {
        return empCodigoCargo;
    }

    public void setEmpCodigoCargo(String empCodigoCargo) {
        this.empCodigoCargo = empCodigoCargo;
    }

    @Column(name = "emp_cargo")
    public String getEmpCargo() {
        return empCargo;
    }

    public void setEmpCargo(String empCargo) {
        this.empCargo = empCargo;
    }

    @Column(name = "emp_sueldo_iess")
    public BigDecimal getEmpSueldoIess() {
        return empSueldoIess;
    }

    public void setEmpSueldoIess(BigDecimal empSueldoIess) {
        this.empSueldoIess = empSueldoIess;
    }

    @Column(name = "emp_forma_pago")
    public String getEmpFormaPago() {
        return empFormaPago;
    }

    public void setEmpFormaPago(String empFormaPago) {
        this.empFormaPago = empFormaPago;
    }

    @Column(name = "emp_dias_trabajados")
    public int getEmpDiasTrabajados() {
        return empDiasTrabajados;
    }

    public void setEmpDiasTrabajados(int empDiasTrabajados) {
        this.empDiasTrabajados = empDiasTrabajados;
    }

    @Column(name = "emp_dias_descanso")
    public int getEmpDiasDescanso() {
        return empDiasDescanso;
    }

    public void setEmpDiasDescanso(int empDiasDescanso) {
        this.empDiasDescanso = empDiasDescanso;
    }

    @Column(name = "emp_bono_fijo")
    public BigDecimal getEmpBonoFijo() {
        return empBonoFijo;
    }

    public void setEmpBonoFijo(BigDecimal empBonoFijo) {
        this.empBonoFijo = empBonoFijo;
    }

    @Column(name = "emp_bono_fijo_nd")
    public BigDecimal getEmpBonoFijoNd() {
        return empBonoFijoNd;
    }

    public void setEmpBonoFijoNd(BigDecimal empBonoFijoNd) {
        this.empBonoFijoNd = empBonoFijoNd;
    }

    @Column(name = "emp_otros_ingresos")
    public BigDecimal getEmpOtrosIngresos() {
        return empOtrosIngresos;
    }

    public void setEmpOtrosIngresos(BigDecimal empOtrosIngresos) {
        this.empOtrosIngresos = empOtrosIngresos;
    }

    @Column(name = "emp_otros_ingresos_nd")
    public BigDecimal getEmpOtrosIngresosNd() {
        return empOtrosIngresosNd;
    }

    public void setEmpOtrosIngresosNd(BigDecimal empOtrosIngresosNd) {
        this.empOtrosIngresosNd = empOtrosIngresosNd;
    }

    @Column(name = "emp_extension_cobertura_iess")
    public boolean getEmpExtensionCoberturaIess() {
        return empExtensionCoberturaIess;
    }

    public void setEmpExtensionCoberturaIess(boolean empExtensionCoberturaIess) {
        this.empExtensionCoberturaIess = empExtensionCoberturaIess;
    }

    @Column(name = "emp_cancelar_xiii_sueldo_mensualmente")
    public boolean getEmpCancelarXiiiSueldoMensualmente() {
        return empCancelarXiiiSueldoMensualmente;
    }

    public void setEmpCancelarXiiiSueldoMensualmente(boolean empCancelarXiiiSueldoMensualmente) {
        this.empCancelarXiiiSueldoMensualmente = empCancelarXiiiSueldoMensualmente;
    }

    @Column(name = "emp_cancelar_xiv_sueldo_mensualmente")
    public boolean getEmpCancelarXivSueldoMensualmente() {
        return empCancelarXivSueldoMensualmente;
    }

    public void setEmpCancelarXivSueldoMensualmente(boolean empCancelarXivSueldoMensualmente) {
        this.empCancelarXivSueldoMensualmente = empCancelarXivSueldoMensualmente;
    }

    @Column(name = "emp_cancelar_fondo_reserva_mensualmente")
    public boolean getEmpCancelarFondoReservaMensualmente() {
        return empCancelarFondoReservaMensualmente;
    }

    public void setEmpCancelarFondoReservaMensualmente(boolean empCancelarFondoReservaMensualmente) {
        this.empCancelarFondoReservaMensualmente = empCancelarFondoReservaMensualmente;
    }

    @Column(name = "emp_retencion")
    public boolean getEmpRetencion() {
        return empRetencion;
    }

    public void setEmpRetencion(boolean empRetencion) {
        this.empRetencion = empRetencion;
    }

    @Column(name = "emp_educacion")
    public BigDecimal getEmpEducacion() {
        return empEducacion;
    }

    public void setEmpEducacion(BigDecimal empEducacion) {
        this.empEducacion = empEducacion;
    }

    @Column(name = "emp_alimentacion")
    public BigDecimal getEmpAlimentacion() {
        return empAlimentacion;
    }

    public void setEmpAlimentacion(BigDecimal empAlimentacion) {
        this.empAlimentacion = empAlimentacion;
    }

    @Column(name = "emp_salud")
    public BigDecimal getEmpSalud() {
        return empSalud;
    }

    public void setEmpSalud(BigDecimal empSalud) {
        this.empSalud = empSalud;
    }

    @Column(name = "emp_vivienda")
    public BigDecimal getEmpVivienda() {
        return empVivienda;
    }

    public void setEmpVivienda(BigDecimal empVivienda) {
        this.empVivienda = empVivienda;
    }

    @Column(name = "emp_vestuario")
    public BigDecimal getEmpVestuario() {
        return empVestuario;
    }

    public void setEmpVestuario(BigDecimal empVestuario) {
        this.empVestuario = empVestuario;
    }

    @Column(name = "emp_rebaja_discapacidad")
    public BigDecimal getEmpRebajaDiscapacidad() {
        return empRebajaDiscapacidad;
    }

    public void setEmpRebajaDiscapacidad(BigDecimal empRebajaDiscapacidad) {
        this.empRebajaDiscapacidad = empRebajaDiscapacidad;
    }

    @Column(name = "emp_rebaja_tercera_edad")
    public BigDecimal getEmpRebajaTerceraEdad() {
        return empRebajaTerceraEdad;
    }

    public void setEmpRebajaTerceraEdad(BigDecimal empRebajaTerceraEdad) {
        this.empRebajaTerceraEdad = empRebajaTerceraEdad;
    }

    @Column(name = "emp_sueldo_otra_compania")
    public BigDecimal getEmpSueldoOtraCompania() {
        return empSueldoOtraCompania;
    }

    public void setEmpSueldoOtraCompania(BigDecimal empSueldoOtraCompania) {
        this.empSueldoOtraCompania = empSueldoOtraCompania;
    }

    @Column(name = "emp_otras_deducciones")
    public BigDecimal getEmpOtrasDeducciones() {
        return empOtrasDeducciones;
    }

    public void setEmpOtrasDeducciones(BigDecimal empOtrasDeducciones) {
        this.empOtrasDeducciones = empOtrasDeducciones;
    }

    @Column(name = "emp_otras_rebajas")
    public BigDecimal getEmpOtrasRebajas() {
        return empOtrasRebajas;
    }

    public void setEmpOtrasRebajas(BigDecimal empOtrasRebajas) {
        this.empOtrasRebajas = empOtrasRebajas;
    }

    @Column(name = "emp_utilidades")
    public BigDecimal getEmpUtilidades() {
        return empUtilidades;
    }

    public void setEmpUtilidades(BigDecimal empUtilidades) {
        this.empUtilidades = empUtilidades;
    }

    @Column(name = "emp_observaciones")
    public String getEmpObservaciones() {
        return empObservaciones;
    }

    public void setEmpObservaciones(String empObservaciones) {
        this.empObservaciones = empObservaciones;
    }

    @Column(name = "emp_discapacidad_tipo")
    public String getEmpDiscapacidadTipo() {
        return empDiscapacidadTipo;
    }

    public void setEmpDiscapacidadTipo(String empDiscapacidadTipo) {
        this.empDiscapacidadTipo = empDiscapacidadTipo;
    }

    @Column(name = "emp_discapacidad_porcentaje")
    public Short getEmpDiscapacidadPorcentaje() {
        return empDiscapacidadPorcentaje;
    }

    public void setEmpDiscapacidadPorcentaje(Short empDiscapacidadPorcentaje) {
        this.empDiscapacidadPorcentaje = empDiscapacidadPorcentaje;
    }

    @Column(name = "emp_discapacidad_id_tipo")
    public Character getEmpDiscapacidadIdTipo() {
        return empDiscapacidadIdTipo;
    }

    public void setEmpDiscapacidadIdTipo(Character empDiscapacidadIdTipo) {
        this.empDiscapacidadIdTipo = empDiscapacidadIdTipo;
    }

    @Column(name = "emp_discapacidad_id_numero")
    public String getEmpDiscapacidadIdNumero() {
        return empDiscapacidadIdNumero;
    }

    public void setEmpDiscapacidadIdNumero(String empDiscapacidadIdNumero) {
        this.empDiscapacidadIdNumero = empDiscapacidadIdNumero;
    }

    @Column(name = "emp_banco")
    public String getEmpBanco() {
        return empBanco;
    }

    public void setEmpBanco(String empBanco) {
        this.empBanco = empBanco;
    }

    @Column(name = "emp_cuenta_tipo")
    public String getEmpCuentaTipo() {
        return empCuentaTipo;
    }

    public void setEmpCuentaTipo(String empCuentaTipo) {
        this.empCuentaTipo = empCuentaTipo;
    }

    @Column(name = "emp_cuenta_numero")
    public String getEmpCuentaNumero() {
        return empCuentaNumero;
    }

    public void setEmpCuentaNumero(String empCuentaNumero) {
        this.empCuentaNumero = empCuentaNumero;
    }

    @Column(name = "emp_salario_neto")
    public boolean getEmpSalarioNeto() {
        return empSalarioNeto;
    }

    public void setEmpSalarioNeto(boolean empSalarioNeto) {
        this.empSalarioNeto = empSalarioNeto;
    }

    @Column(name = "emp_inactivo")
    public boolean getEmpInactivo() {
        return empInactivo;
    }

    public void setEmpInactivo(boolean empInactivo) {
        this.empInactivo = empInactivo;
    }

    @Column(name = "emp_saldo_anterior", updatable = false)
    public BigDecimal getEmpSaldoAnterior() {
        return empSaldoAnterior;
    }

    public void setEmpSaldoAnterior(BigDecimal empSaldoAnterior) {
        this.empSaldoAnterior = empSaldoAnterior;
    }

    @Column(name = "emp_saldo_anticipos", updatable = false)
    public BigDecimal getEmpSaldoAnticipos() {
        return empSaldoAnticipos;
    }

    public void setEmpSaldoAnticipos(BigDecimal empSaldoAnticipos) {
        this.empSaldoAnticipos = empSaldoAnticipos;
    }

    @Column(name = "emp_saldo_bonos", updatable = false)
    public BigDecimal getEmpSaldoBonos() {
        return empSaldoBonos;
    }

    public void setEmpSaldoBonos(BigDecimal empSaldoBonos) {
        this.empSaldoBonos = empSaldoBonos;
    }

    @Column(name = "emp_saldo_bonos_nd", updatable = false)
    public BigDecimal getEmpSaldoBonosNd() {
        return empSaldoBonosNd;
    }

    public void setEmpSaldoBonosNd(BigDecimal empSaldoBonosNd) {
        this.empSaldoBonosNd = empSaldoBonosNd;
    }

    @Column(name = "emp_saldo_prestamos", updatable = false)
    public BigDecimal getEmpSaldoPrestamos() {
        return empSaldoPrestamos;
    }

    public void setEmpSaldoPrestamos(BigDecimal empSaldoPrestamos) {
        this.empSaldoPrestamos = empSaldoPrestamos;
    }

    @Column(name = "emp_saldo_cuotas", updatable = false)
    public int getEmpSaldoCuotas() {
        return empSaldoCuotas;
    }

    public void setEmpSaldoCuotas(int empSaldoCuotas) {
        this.empSaldoCuotas = empSaldoCuotas;
    }

    @Column(name = "emp_fecha_ultimo_sueldo", updatable = false)
    public Date getEmpFechaUltimoSueldo() {
        return empFechaUltimoSueldo;
    }

    public void setEmpFechaUltimoSueldo(Date empFechaUltimoSueldo) {
        this.empFechaUltimoSueldo = empFechaUltimoSueldo;
    }

    @JoinColumns({
        @JoinColumn(name = "sec_empresa", referencedColumnName = "sec_empresa")
        ,
			@JoinColumn(name = "sec_codigo", referencedColumnName = "sec_codigo")})
    @ManyToOne(optional = false)
    public PrdSector getPrdSector() {
        return prdSector;
    }

    public void setPrdSector(PrdSector prdSector) {
        this.prdSector = prdSector;
    }

    @JoinColumns({
        @JoinColumn(name = "cat_empresa", referencedColumnName = "cat_empresa")
        ,
			@JoinColumn(name = "cat_nombre", referencedColumnName = "cat_nombre")})
    @ManyToOne(optional = false)
    public RhCategoria getRhCategoria() {
        return rhCategoria;
    }

    public void setRhCategoria(RhCategoria rhCategoria) {
        this.rhCategoria = rhCategoria;
    }

    @Column(name = "usr_empresa")
    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    @Column(name = "usr_codigo")
    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    public Timestamp getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Timestamp usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rhEmpleado")
    @JsonIgnore
    public List<RhRol> getRhRolList() {
        return rhRolList;
    }

    public void setRhRolList(List<RhRol> rhRolList) {
        this.rhRolList = rhRolList;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rhEmpleado")
    @JsonIgnore
    public List<RhEmpleadoDescuentosFijos> getRhEmpleadoDescuentosFijosList() {
        return rhEmpleadoDescuentosFijosList;
    }

    public void setRhEmpleadoDescuentosFijosList(List<RhEmpleadoDescuentosFijos> rhEmpleadoDescuentosFijosList) {
        this.rhEmpleadoDescuentosFijosList = rhEmpleadoDescuentosFijosList;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rhEmpleado")
    @JsonIgnore
    public List<RhXiiiSueldo> getRhXiiiSueldoList() {
        return rhXiiiSueldoList;
    }

    public void setRhXiiiSueldoList(List<RhXiiiSueldo> rhXiiiSueldoList) {
        this.rhXiiiSueldoList = rhXiiiSueldoList;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rhEmpleado")
    @JsonIgnore
    public List<RhPrestamo> getRhPrestamoList() {
        return rhPrestamoList;
    }

    public void setRhPrestamoList(List<RhPrestamo> rhPrestamoList) {
        this.rhPrestamoList = rhPrestamoList;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rhEmpleado")
    @JsonIgnore
    public List<RhVacaciones> getRhVacacionesList() {
        return rhVacacionesList;
    }

    public void setRhVacacionesList(List<RhVacaciones> rhVacacionesList) {
        this.rhVacacionesList = rhVacacionesList;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rhEmpleado")
    @JsonIgnore
    public List<RhBono> getRhBonoList() {
        return rhBonoList;
    }

    public void setRhBonoList(List<RhBono> rhBonoList) {
        this.rhBonoList = rhBonoList;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rhEmpleado")
    @JsonIgnore
    public List<RhXivSueldo> getRhXivSueldoList() {
        return rhXivSueldoList;
    }

    public void setRhXivSueldoList(List<RhXivSueldo> rhXivSueldoList) {
        this.rhXivSueldoList = rhXivSueldoList;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rhEmpleado")
    @JsonIgnore
    public List<RhAnticipo> getRhAnticipoList() {
        return rhAnticipoList;
    }

    public void setRhAnticipoList(List<RhAnticipo> rhAnticipoList) {
        this.rhAnticipoList = rhAnticipoList;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rhEmpleado")
    @JsonIgnore
    public List<RhUtilidades> getRhUtilidadesList() {
        return rhUtilidadesList;
    }

    public void setRhUtilidadesList(List<RhUtilidades> rhUtilidadesList) {
        this.rhUtilidadesList = rhUtilidadesList;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rhEmpleado")
    @JsonIgnore
    public List<RhSalarioDigno> getRhSalarioDignoList() {
        return rhSalarioDignoList;
    }

    public void setRhSalarioDignoList(List<RhSalarioDigno> rhSalarioDignoList) {
        this.rhSalarioDignoList = rhSalarioDignoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rhEmpleadoPK != null ? rhEmpleadoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof RhEmpleado)) {
            return false;
        }
        RhEmpleado other = (RhEmpleado) object;
        if ((this.rhEmpleadoPK == null && other.rhEmpleadoPK != null)
                || (this.rhEmpleadoPK != null && !this.rhEmpleadoPK.equals(other.rhEmpleadoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rrhh.entity.RhEmpleado[ rhEmpleadoPK=" + rhEmpleadoPK + " ]";
    }

    @Column(name = "emp_anticipo_quincena")
    public BigDecimal getEmpAnticipoQuincena() {
        return empAnticipoQuincena;
    }

    public void setEmpAnticipoQuincena(BigDecimal empAnticipoQuincena) {
        this.empAnticipoQuincena = empAnticipoQuincena;
    }

    @Column(name = "emp_prestamo_quirografario")
    public BigDecimal getEmpPrestamoQuirografario() {
        return empPrestamoQuirografario;
    }

    public void setEmpPrestamoQuirografario(BigDecimal empPrestamoQuirografario) {
        this.empPrestamoQuirografario = empPrestamoQuirografario;
    }

    @Column(name = "emp_prestamo_hipotecario")
    public BigDecimal getEmpPrestamoHipotecario() {
        return empPrestamoHipotecario;
    }

    public void setEmpPrestamoHipotecario(BigDecimal empPrestamoHipotecario) {
        this.empPrestamoHipotecario = empPrestamoHipotecario;
    }

    @Column(name = "emp_saldo_horas_extras_50")
    public BigDecimal getEmpSaldoHorasExtras50() {
        return empSaldoHorasExtras50;
    }

    public void setEmpSaldoHorasExtras50(BigDecimal empSaldoHorasExtras50) {
        this.empSaldoHorasExtras50 = empSaldoHorasExtras50;
    }

    @Column(name = "emp_saldo_horas_extras_100")
    public BigDecimal getEmpSaldoHorasExtras100() {
        return empSaldoHorasExtras100;
    }

    public void setEmpSaldoHorasExtras100(BigDecimal empSaldoHorasExtras100) {
        this.empSaldoHorasExtras100 = empSaldoHorasExtras100;
    }

    @Column(name = "emp_saldo_horas_extras_extraordinarias_100")
    public BigDecimal getEmpSaldoHorasExtrasExtraordinarias100() {
        return empSaldoHorasExtrasExtraordinarias100;
    }

    public void setEmpSaldoHorasExtrasExtraordinarias100(BigDecimal empSaldoHorasExtrasExtraordinarias100) {
        this.empSaldoHorasExtrasExtraordinarias100 = empSaldoHorasExtrasExtraordinarias100;
    }

    @JoinColumn(name = "emp_relacion_trabajo", referencedColumnName = "rt_codigo")
    @ManyToOne
    public RhRelacionTrabajo getEmpRelacionTrabajo() {
        return empRelacionTrabajo;
    }

    public void setEmpRelacionTrabajo(RhRelacionTrabajo empRelacionTrabajo) {
        this.empRelacionTrabajo = empRelacionTrabajo;
    }

    @Column(name = "emp_descripcion")
    public String getEmpDescripcion() {
        return empDescripcion;
    }

    public void setEmpDescripcion(String empDescripcion) {
        this.empDescripcion = empDescripcion;
    }

    @Column(name = "emp_turismo")
    public BigDecimal getEmpTurismo() {
        return empTurismo;
    }

    public void setEmpTurismo(BigDecimal empTurismo) {
        this.empTurismo = empTurismo;
    }

    @Column(name = "emp_pensiones_alimenticias")
    public BigDecimal getEmpPensionesAlimenticias() {
        return empPensionesAlimenticias;
    }

    public void setEmpPensionesAlimenticias(BigDecimal empPensionesAlimenticias) {
        this.empPensionesAlimenticias = empPensionesAlimenticias;
    }

    @Column(name = "emp_descuento_prestamos")
    public BigDecimal getEmpDescuentoPrestamos() {
        return empDescuentoPrestamos;
    }

    public void setEmpDescuentoPrestamos(BigDecimal empDescuentoPrestamos) {
        this.empDescuentoPrestamos = empDescuentoPrestamos;
    }

    @Column(name = "emp_maternidad")
    public boolean isEmpMaternidad() {
        return empMaternidad;
    }

    public void setEmpMaternidad(boolean empMaternidad) {
        this.empMaternidad = empMaternidad;
    }

    @Column(name = "emp_lactancia")
    public boolean isEmpLactancia() {
        return empLactancia;
    }

    public void setEmpLactancia(boolean empLactancia) {
        this.empLactancia = empLactancia;
    }

    @Column(name = "emp_fecha_desde_lactancia")
    public Date getEmpFechaDesdeLactancia() {
        return empFechaDesdeLactancia;
    }

    public void setEmpFechaDesdeLactancia(Date empFechaDesdeLactancia) {
        this.empFechaDesdeLactancia = empFechaDesdeLactancia;
    }

    @Column(name = "emp_fecha_hasta_lactancia")
    public Date getEmpFechaHastaLactancia() {
        return empFechaHastaLactancia;
    }

    public void setEmpFechaHastaLactancia(Date empFechaHastaLactancia) {
        this.empFechaHastaLactancia = empFechaHastaLactancia;
    }

}
