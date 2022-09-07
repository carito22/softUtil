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

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhEmpleadoTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "emp_empresa")
    private String empCodigo;

    @Column(name = "emp_residencia_tipo")
    private String empResidenciaTipo;

    @Column(name = "emp_residencia_pais")
    private String empResidenciaPais;

    @Column(name = "emp_convenio")
    private String empConvenio;

    @Column(name = "emp_tipo_id")
    private Character empTipoId;

    @Id
    @Column(name = "emp_id")
    private String empId;

    @Column(name = "emp_apellidos")
    private String empApellidos;

    @Column(name = "emp_nombres")
    private String empNombres;

    @Column(name = "emp_genero")
    private Character empGenero;

    @Column(name = "emp_lugar_nacimiento")
    private String empLugarNacimiento;

    @Column(name = "emp_fecha_nacimiento")
    private String empFechaNacimiento;

    @Column(name = "emp_estado_civil")
    private String empEstadoCivil;

    @Column(name = "emp_cargas_familiares")
    private Integer empCargasFamiliares;

    @Column(name = "emp_provincia")
    private String empProvincia;

    @Column(name = "emp_canton")
    private String empCanton;

    @Column(name = "emp_domicilio")
    private String empDomicilio;

    @Column(name = "emp_numero")
    private String empNumero;

    @Column(name = "emp_telefono")
    private String empTelefono;

    @Column(name = "emp_correo_electronico")
    private String empEmail;

    @Column(name = "sec_codigo")
    private String secCodigo;

    @Column(name = "emp_fecha_primer_ingreso")
    private String empFechaPrimerIngreso;

    @Column(name = "emp_fecha_primera_salida")
    private String empFechaPrimeraSalida;

    @Column(name = "emp_fecha_ultimo_ingreso")
    private String empFechaUltimoIngreso;

    @Column(name = "emp_fecha_ultima_salida")
    private String empFechaUltimaSalida;

    @Column(name = "emp_motivo_salida")
    private String empMotivoSalida;

    @Column(name = "emp_fecha_afiliacion_iess")
    private String empFechaAfiliacionIess;

    @Column(name = "emp_codigo_afiliacion_iess")
    private String empCodigoAfiliacionIess;

    @Column(name = "emp_codigo_cargo")
    private String empCodigoCargo;

    @Column(name = "emp_cargo")
    private String empCargo;

    @Column(name = "emp_sueldo_iess")
    private BigDecimal empSueldoIess;

    @Column(name = "emp_forma_pago")
    private String empFormaPago;

    @Column(name = "emp_dias_trabajados")
    private Integer empDiasTrabajados;

    @Column(name = "emp_dias_descanso")
    private Integer empDiasDescanso;

    @Column(name = "emp_bono_fijo")
    private BigDecimal empBonoFijo;

    @Column(name = "emp_bono_fijo_nd")
    private BigDecimal empBonoFijoNd;

    @Column(name = "emp_cancelar_xiii_sueldo_mensualmente")
    private Boolean empCancelarXiiiSueldoMensualmente;

    @Column(name = "emp_cancelar_xiv_sueldo_mensualmente")
    private Boolean empCancelarXivSueldoMensualmente;

    @Column(name = "emp_cancelar_fondo_reserva_mensualmente")
    private Boolean empCancelarFondoReservaMensualmente;

    @Column(name = "emp_retencion")
    private Boolean empRetencion;

    @Column(name = "emp_educacion")
    private BigDecimal empEducacion;

    @Column(name = "emp_alimentacion")
    private BigDecimal empAlimentacion;

    @Column(name = "emp_salario_neto")
    private Boolean empSalarioNeto;

    @Column(name = "emp_salud")
    private BigDecimal empSalud;

    @Column(name = "emp_vivienda")
    private BigDecimal empVivienda;

    @Column(name = "emp_vestuario")
    private BigDecimal empVestuario;

    @Column(name = "emp_rebaja_discapacidad")
    private BigDecimal empRebajaDiscapacidad;

    @Column(name = "emp_rebaja_tercera_edad")
    private BigDecimal empRebajaTerceraEdad;

    @Column(name = "emp_sueldo_otra_compania")
    private BigDecimal empSueldoOtraCompania;

    @Column(name = "emp_otras_deducciones")
    private BigDecimal empOtrasDeducciones;

    @Column(name = "emp_otras_rebajas")
    private BigDecimal empOtrasRebajas;

    @Column(name = "emp_utilidades")
    private BigDecimal empUtilidades;

    @Column(name = "emp_otros_ingresos")
    private BigDecimal empOtrosIngresos;

    @Column(name = "emp_otros_ingresos_nd")
    private BigDecimal empOtrosIngresosNd;

    @Column(name = "emp_extension_cobertura_iess")
    private Boolean empExtensionCoberturaIess;

    @Column(name = "emp_observaciones")
    private String empObservaciones;

    @Column(name = "emp_discapacidad_tipo")
    private String empDiscapacidadTipo;

    @Column(name = "emp_discapacidad_porcentaje")
    private Short empDiscapacidadPorcentaje;

    @Column(name = "emp_discapacidad_id_tipo")
    private Character empDiscapacidadIdTipo;

    @Column(name = "emp_discapacidad_id_numero")
    private String empDiscapacidadIdNumero;

    @Column(name = "emp_banco")
    private String empBanco;

    @Column(name = "emp_relacion_trabajo")
    private String empRelacionTrabajo;

    @Column(name = "emp_cuenta_tipo")
    private String empCuentaTipo;

    @Column(name = "emp_cuenta_numero")
    private String empCuentaNumero;

    @Column(name = "emp_inactivo")
    private Boolean empInactivo;//

    @Column(name = "emp_saldo_anterior")
    private BigDecimal empSaldoAnterior;

    @Column(name = "emp_saldo_anticipos")
    private BigDecimal empSaldoAnticipos;

    @Column(name = "emp_saldo_bonos")
    private BigDecimal empSaldoBonos;

    @Column(name = "emp_saldo_bonos_nd")
    private BigDecimal empSaldoBonosNd;

    @Column(name = "emp_saldo_prestamos")
    private BigDecimal empSaldoPrestamos;

    @Column(name = "emp_saldo_cuotas")
    private Integer empSaldoCuotas;

    @Column(name = "emp_fecha_ultimo_sueldo")
    private String empFechaUltimoSueldo;

    // emp_saldo_anticipos, emp_saldo_bonos, emp_saldo_prestamos,
    // emp_saldo_cuotas, emp_fecha_ultimo_sueldo
    @Column(name = "cat_nombre")
    private String catNombre;

    @Column(name = "usr_codigo")
    private String usrInsertaEmpleado;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInsertaEmpleado;

    @Column(name = "emp_anticipo_quincena")
    private BigDecimal empAnticipoQuincena;

    @Column(name = "emp_prestamo_quirografario")
    private BigDecimal empPrestamoQuirografario;

    @Column(name = "emp_prestamo_hipotecario")
    private BigDecimal empPrestamoHipotecario;

    @Column(name = "emp_saldo_horas_extras_50")
    private BigDecimal empSaldoHorasExtras50;

    @Column(name = "emp_saldo_horas_extras_100")
    private BigDecimal empSaldoHorasExtras100;

    @Column(name = "emp_saldo_horas_extras_extraordinarias_100")
    private BigDecimal empSaldoHorasExtrasExtraordinarias100;

    @Column(name = "emp_descripcion")
    private String empDescripcion;

    @Column(name = "emp_maternidad")
    private boolean empMaternidad;
    @Column(name = "emp_lactancia")
    private boolean empLactancia;
    @Column(name = "emp_fecha_desde_lactancia")
    private String empFechaDesdeLactancia;
    @Column(name = "emp_fecha_hasta_lactancia")
    private String empFechaHastaLactancia;

    public RhEmpleadoTO() {
    }

    public RhEmpleadoTO(String empCodigo, String empResidenciaTipo, String empResidenciaPais, String empConvenio,
            Character empTipoId, String empId, String empApellidos, String empNombres, Character empGenero,
            String empLugarNacimiento, String empFechaNacimiento, String empEstadoCivil, Integer empCargasFamiliares,
            String empProvincia, String empCanton, String empDomicilio, String empNumero, String empTelefono,
            String empEmail, String secCodigo, String empFechaPrimerIngreso, String empFechaPrimeraSalida,
            String empFechaUltimoIngreso, String empFechaUltimaSalida, String empMotivoSalida,
            String empFechaAfiliacionIess, String empCodigoAfiliacionIess, String empCodigoCargo, String empCargo,
            BigDecimal empSueldoIess, String empFormaPago, Integer empDiasTrabajados, Integer empDiasDescanso,
            BigDecimal empBonoFijo, BigDecimal empBonoFijoNd, Boolean empCancelarXiiiSueldoMensualmente,
            Boolean empCancelarXivSueldoMensualmente, Boolean empCancelarFondoReservaMensualmente, Boolean empRetencion,
            BigDecimal empEducacion, BigDecimal empAlimentacion, Boolean empSalarioNeto, BigDecimal empSalud,
            BigDecimal empVivienda, BigDecimal empVestuario, BigDecimal empRebajaDiscapacidad,
            BigDecimal empRebajaTerceraEdad, BigDecimal empSueldoOtraCompania, BigDecimal empOtrasDeducciones,
            BigDecimal empOtrasRebajas, BigDecimal empUtilidades, BigDecimal empOtrosIngresos,
            BigDecimal empOtrosIngresosNd, Boolean empExtensionCoberturaIess, String empObservaciones,
            String empDiscapacidadTipo, Short empDiscapacidadPorcentaje, Character empDiscapacidadIdTipo,
            String empDiscapacidadIdNumero, String empBanco, String empCuentaTipo, String empCuentaNumero,
            Boolean empInactivo, BigDecimal empSaldoAnterior, BigDecimal empSaldoAnticipos, BigDecimal empSaldoBonos,
            BigDecimal empSaldoBonosNd, BigDecimal empSaldoPrestamos, Integer empSaldoCuotas,
            String empFechaUltimoSueldo, String catNombre, String usrInsertaEmpleado, String usrFechaInsertaEmpleado, String relacionTrabajo) {
        this.empCodigo = empCodigo;
        this.empResidenciaTipo = empResidenciaTipo;
        this.empResidenciaPais = empResidenciaPais;
        this.empConvenio = empConvenio;
        this.empTipoId = empTipoId;
        this.empId = empId;
        this.empApellidos = empApellidos;
        this.empNombres = empNombres;
        this.empGenero = empGenero;
        this.empLugarNacimiento = empLugarNacimiento;
        this.empFechaNacimiento = empFechaNacimiento;
        this.empEstadoCivil = empEstadoCivil;
        this.empCargasFamiliares = empCargasFamiliares;
        this.empProvincia = empProvincia;
        this.empCanton = empCanton;
        this.empDomicilio = empDomicilio;
        this.empNumero = empNumero;
        this.empTelefono = empTelefono;
        this.empEmail = empEmail;
        this.secCodigo = secCodigo;
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
        this.empCancelarXiiiSueldoMensualmente = empCancelarXiiiSueldoMensualmente;
        this.empCancelarXivSueldoMensualmente = empCancelarXivSueldoMensualmente;
        this.empCancelarFondoReservaMensualmente = empCancelarFondoReservaMensualmente;
        this.empRetencion = empRetencion;
        this.empEducacion = empEducacion;
        this.empAlimentacion = empAlimentacion;
        this.empSalarioNeto = empSalarioNeto;
        this.empSalud = empSalud;
        this.empVivienda = empVivienda;
        this.empVestuario = empVestuario;
        this.empRebajaDiscapacidad = empRebajaDiscapacidad;
        this.empRebajaTerceraEdad = empRebajaTerceraEdad;
        this.empSueldoOtraCompania = empSueldoOtraCompania;
        this.empOtrasDeducciones = empOtrasDeducciones;
        this.empOtrasRebajas = empOtrasRebajas;
        this.empUtilidades = empUtilidades;
        this.empOtrosIngresos = empOtrosIngresos;
        this.empOtrosIngresosNd = empOtrosIngresosNd;
        this.empExtensionCoberturaIess = empExtensionCoberturaIess;
        this.empObservaciones = empObservaciones;
        this.empDiscapacidadTipo = empDiscapacidadTipo;
        this.empDiscapacidadPorcentaje = empDiscapacidadPorcentaje;
        this.empDiscapacidadIdTipo = empDiscapacidadIdTipo;
        this.empDiscapacidadIdNumero = empDiscapacidadIdNumero;
        this.empBanco = empBanco;
        this.empCuentaTipo = empCuentaTipo;
        this.empCuentaNumero = empCuentaNumero;
        this.empInactivo = empInactivo;
        this.empSaldoAnterior = empSaldoAnterior;
        this.empSaldoAnticipos = empSaldoAnticipos;
        this.empSaldoBonos = empSaldoBonos;
        this.empSaldoBonosNd = empSaldoBonosNd;
        this.empSaldoPrestamos = empSaldoPrestamos;
        this.empSaldoCuotas = empSaldoCuotas;
        this.empFechaUltimoSueldo = empFechaUltimoSueldo;
        this.catNombre = catNombre;
        this.usrInsertaEmpleado = usrInsertaEmpleado;
        this.usrFechaInsertaEmpleado = usrFechaInsertaEmpleado;
        this.empRelacionTrabajo = relacionTrabajo;
    }

    public BigDecimal getEmpSaldoAnterior() {
        return empSaldoAnterior;
    }

    public void setEmpSaldoAnterior(BigDecimal empSaldoAnterior) {
        this.empSaldoAnterior = empSaldoAnterior;
    }

    public BigDecimal getEmpSaldoBonosNd() {
        return empSaldoBonosNd;
    }

    public void setEmpSaldoBonosNd(BigDecimal empSaldoBonosNd) {
        this.empSaldoBonosNd = empSaldoBonosNd;
    }

    public BigDecimal getEmpSaldoAnticipos() {
        return empSaldoAnticipos;
    }

    public void setEmpSaldoAnticipos(BigDecimal empSaldoAnticipos) {
        this.empSaldoAnticipos = empSaldoAnticipos;
    }

    public BigDecimal getEmpSaldoBonos() {
        return empSaldoBonos;
    }

    public void setEmpSaldoBonos(BigDecimal empSaldoBonos) {
        this.empSaldoBonos = empSaldoBonos;
    }

    public BigDecimal getEmpSaldoPrestamos() {
        return empSaldoPrestamos;
    }

    public void setEmpSaldoPrestamos(BigDecimal empSaldoPrestamos) {
        this.empSaldoPrestamos = empSaldoPrestamos;
    }

    public Integer getEmpSaldoCuotas() {
        return empSaldoCuotas;
    }

    public void setEmpSaldoCuotas(Integer empSaldoCuotas) {
        this.empSaldoCuotas = empSaldoCuotas;
    }

    public String getEmpFechaUltimoSueldo() {
        return empFechaUltimoSueldo;
    }

    public void setEmpFechaUltimoSueldo(String empFechaUltimoSueldo) {
        this.empFechaUltimoSueldo = empFechaUltimoSueldo;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public Boolean getEmpSalarioNeto() {
        return empSalarioNeto;
    }

    public void setEmpSalarioNeto(Boolean empSalarioNeto) {
        this.empSalarioNeto = empSalarioNeto;
    }

    public String getCatNombre() {
        return catNombre;
    }

    public void setCatNombre(String catNombre) {
        this.catNombre = catNombre;
    }

    public BigDecimal getEmpAlimentacion() {
        return empAlimentacion;
    }

    public void setEmpAlimentacion(BigDecimal empAlimentacion) {
        this.empAlimentacion = empAlimentacion;
    }

    public String getEmpApellidos() {
        return empApellidos;
    }

    public void setEmpApellidos(String empApellidos) {
        this.empApellidos = empApellidos;
    }

    public String getEmpBanco() {
        return empBanco;
    }

    public void setEmpBanco(String empBanco) {
        this.empBanco = empBanco;
    }

    public BigDecimal getEmpBonoFijo() {
        return empBonoFijo;
    }

    public void setEmpBonoFijo(BigDecimal empBonoFijo) {
        this.empBonoFijo = empBonoFijo;
    }

    public BigDecimal getEmpBonoFijoNd() {
        return empBonoFijoNd;
    }

    public void setEmpBonoFijoNd(BigDecimal empBonoFijoNd) {
        this.empBonoFijoNd = empBonoFijoNd;
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

    public String getEmpCanton() {
        return empCanton;
    }

    public void setEmpCanton(String empCanton) {
        this.empCanton = empCanton;
    }

    public Integer getEmpCargasFamiliares() {
        return empCargasFamiliares;
    }

    public void setEmpCargasFamiliares(Integer empCargasFamiliares) {
        this.empCargasFamiliares = empCargasFamiliares;
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

    public String getEmpCodigoAfiliacionIess() {
        return empCodigoAfiliacionIess;
    }

    public void setEmpCodigoAfiliacionIess(String empCodigoAfiliacionIess) {
        this.empCodigoAfiliacionIess = empCodigoAfiliacionIess;
    }

    public String getEmpCodigoCargo() {
        return empCodigoCargo;
    }

    public void setEmpCodigoCargo(String empCodigoCargo) {
        this.empCodigoCargo = empCodigoCargo;
    }

    public String getEmpConvenio() {
        return empConvenio;
    }

    public void setEmpConvenio(String empConvenio) {
        this.empConvenio = empConvenio;
    }

    public String getEmpCuentaNumero() {
        return empCuentaNumero;
    }

    public void setEmpCuentaNumero(String empCuentaNumero) {
        this.empCuentaNumero = empCuentaNumero;
    }

    public String getEmpCuentaTipo() {
        return empCuentaTipo;
    }

    public void setEmpCuentaTipo(String empCuentaTipo) {
        this.empCuentaTipo = empCuentaTipo;
    }

    public Integer getEmpDiasDescanso() {
        return empDiasDescanso;
    }

    public void setEmpDiasDescanso(Integer empDiasDescanso) {
        this.empDiasDescanso = empDiasDescanso;
    }

    public Integer getEmpDiasTrabajados() {
        return empDiasTrabajados;
    }

    public void setEmpDiasTrabajados(Integer empDiasTrabajados) {
        this.empDiasTrabajados = empDiasTrabajados;
    }

    public String getEmpDiscapacidadIdNumero() {
        return empDiscapacidadIdNumero;
    }

    public void setEmpDiscapacidadIdNumero(String empDiscapacidadIdNumero) {
        this.empDiscapacidadIdNumero = empDiscapacidadIdNumero;
    }

    public Character getEmpDiscapacidadIdTipo() {
        return empDiscapacidadIdTipo;
    }

    public void setEmpDiscapacidadIdTipo(Character empDiscapacidadIdTipo) {
        this.empDiscapacidadIdTipo = empDiscapacidadIdTipo;
    }

    public Short getEmpDiscapacidadPorcentaje() {
        return empDiscapacidadPorcentaje;
    }

    public void setEmpDiscapacidadPorcentaje(Short empDiscapacidadPorcentaje) {
        this.empDiscapacidadPorcentaje = empDiscapacidadPorcentaje;
    }

    public String getEmpDiscapacidadTipo() {
        return empDiscapacidadTipo;
    }

    public void setEmpDiscapacidadTipo(String empDiscapacidadTipo) {
        this.empDiscapacidadTipo = empDiscapacidadTipo;
    }

    public String getEmpDomicilio() {
        return empDomicilio;
    }

    public void setEmpDomicilio(String empDomicilio) {
        this.empDomicilio = empDomicilio;
    }

    public BigDecimal getEmpEducacion() {
        return empEducacion;
    }

    public void setEmpEducacion(BigDecimal empEducacion) {
        this.empEducacion = empEducacion;
    }

    public String getEmpEstadoCivil() {
        return empEstadoCivil;
    }

    public void setEmpEstadoCivil(String empEstadoCivil) {
        this.empEstadoCivil = empEstadoCivil;
    }

    public Boolean getEmpExtensionCoberturaIess() {
        return empExtensionCoberturaIess;
    }

    public void setEmpExtensionCoberturaIess(Boolean empExtensionCoberturaIess) {
        this.empExtensionCoberturaIess = empExtensionCoberturaIess;
    }

    public String getEmpFechaAfiliacionIess() {
        return empFechaAfiliacionIess;
    }

    public void setEmpFechaAfiliacionIess(String empFechaAfiliacionIess) {
        this.empFechaAfiliacionIess = empFechaAfiliacionIess;
    }

    public String getEmpFechaNacimiento() {
        return empFechaNacimiento;
    }

    public void setEmpFechaNacimiento(String empFechaNacimiento) {
        this.empFechaNacimiento = empFechaNacimiento;
    }

    public String getEmpFechaPrimerIngreso() {
        return empFechaPrimerIngreso;
    }

    public void setEmpFechaPrimerIngreso(String empFechaPrimerIngreso) {
        this.empFechaPrimerIngreso = empFechaPrimerIngreso;
    }

    public String getEmpFechaPrimeraSalida() {
        return empFechaPrimeraSalida;
    }

    public void setEmpFechaPrimeraSalida(String empFechaPrimeraSalida) {
        this.empFechaPrimeraSalida = empFechaPrimeraSalida;
    }

    public String getEmpFechaUltimaSalida() {
        return empFechaUltimaSalida;
    }

    public void setEmpFechaUltimaSalida(String empFechaUltimaSalida) {
        this.empFechaUltimaSalida = empFechaUltimaSalida;
    }

    public String getEmpFechaUltimoIngreso() {
        return empFechaUltimoIngreso;
    }

    public void setEmpFechaUltimoIngreso(String empFechaUltimoIngreso) {
        this.empFechaUltimoIngreso = empFechaUltimoIngreso;
    }

    public String getEmpFormaPago() {
        return empFormaPago;
    }

    public void setEmpFormaPago(String empFormaPago) {
        this.empFormaPago = empFormaPago;
    }

    public Character getEmpGenero() {
        return empGenero;
    }

    public void setEmpGenero(Character empGenero) {
        this.empGenero = empGenero;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Boolean getEmpInactivo() {
        return empInactivo;
    }

    public void setEmpInactivo(Boolean empInactivo) {
        this.empInactivo = empInactivo;
    }

    public String getEmpLugarNacimiento() {
        return empLugarNacimiento;
    }

    public void setEmpLugarNacimiento(String empLugarNacimiento) {
        this.empLugarNacimiento = empLugarNacimiento;
    }

    public String getEmpMotivoSalida() {
        return empMotivoSalida;
    }

    public void setEmpMotivoSalida(String empMotivoSalida) {
        this.empMotivoSalida = empMotivoSalida;
    }

    public String getEmpNombres() {
        return empNombres;
    }

    public void setEmpNombres(String empNombres) {
        this.empNombres = empNombres;
    }

    public String getEmpNumero() {
        return empNumero;
    }

    public void setEmpNumero(String empNumero) {
        this.empNumero = empNumero;
    }

    public String getEmpObservaciones() {
        return empObservaciones;
    }

    public void setEmpObservaciones(String empObservaciones) {
        this.empObservaciones = empObservaciones;
    }

    public BigDecimal getEmpOtrasDeducciones() {
        return empOtrasDeducciones;
    }

    public void setEmpOtrasDeducciones(BigDecimal empOtrasDeducciones) {
        this.empOtrasDeducciones = empOtrasDeducciones;
    }

    public BigDecimal getEmpOtrasRebajas() {
        return empOtrasRebajas;
    }

    public void setEmpOtrasRebajas(BigDecimal empOtrasRebajas) {
        this.empOtrasRebajas = empOtrasRebajas;
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

    public String getEmpProvincia() {
        return empProvincia;
    }

    public void setEmpProvincia(String empProvincia) {
        this.empProvincia = empProvincia;
    }

    public BigDecimal getEmpRebajaDiscapacidad() {
        return empRebajaDiscapacidad;
    }

    public void setEmpRebajaDiscapacidad(BigDecimal empRebajaDiscapacidad) {
        this.empRebajaDiscapacidad = empRebajaDiscapacidad;
    }

    public BigDecimal getEmpRebajaTerceraEdad() {
        return empRebajaTerceraEdad;
    }

    public void setEmpRebajaTerceraEdad(BigDecimal empRebajaTerceraEdad) {
        this.empRebajaTerceraEdad = empRebajaTerceraEdad;
    }

    public String getEmpResidenciaPais() {
        return empResidenciaPais;
    }

    public void setEmpResidenciaPais(String empResidenciaPais) {
        this.empResidenciaPais = empResidenciaPais;
    }

    public String getEmpResidenciaTipo() {
        return empResidenciaTipo;
    }

    public void setEmpResidenciaTipo(String empResidenciaTipo) {
        this.empResidenciaTipo = empResidenciaTipo;
    }

    public Boolean getEmpRetencion() {
        return empRetencion;
    }

    public void setEmpRetencion(Boolean empRetencion) {
        this.empRetencion = empRetencion;
    }

    public BigDecimal getEmpSalud() {
        return empSalud;
    }

    public void setEmpSalud(BigDecimal empSalud) {
        this.empSalud = empSalud;
    }

    public BigDecimal getEmpSueldoIess() {
        return empSueldoIess;
    }

    public void setEmpSueldoIess(BigDecimal empSueldoIess) {
        this.empSueldoIess = empSueldoIess;
    }

    public BigDecimal getEmpSueldoOtraCompania() {
        return empSueldoOtraCompania;
    }

    public void setEmpSueldoOtraCompania(BigDecimal empSueldoOtraCompania) {
        this.empSueldoOtraCompania = empSueldoOtraCompania;
    }

    public String getEmpTelefono() {
        return empTelefono;
    }

    public void setEmpTelefono(String empTelefono) {
        this.empTelefono = empTelefono;
    }

    public Character getEmpTipoId() {
        return empTipoId;
    }

    public void setEmpTipoId(Character empTipoId) {
        this.empTipoId = empTipoId;
    }

    public BigDecimal getEmpUtilidades() {
        return empUtilidades;
    }

    public void setEmpUtilidades(BigDecimal empUtilidades) {
        this.empUtilidades = empUtilidades;
    }

    public BigDecimal getEmpVestuario() {
        return empVestuario;
    }

    public void setEmpVestuario(BigDecimal empVestuario) {
        this.empVestuario = empVestuario;
    }

    public BigDecimal getEmpVivienda() {
        return empVivienda;
    }

    public void setEmpVivienda(BigDecimal empVivienda) {
        this.empVivienda = empVivienda;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getUsrFechaInsertaEmpleado() {
        return usrFechaInsertaEmpleado;
    }

    public void setUsrFechaInsertaEmpleado(String usrFechaInsertaEmpleado) {
        this.usrFechaInsertaEmpleado = usrFechaInsertaEmpleado;
    }

    public String getUsrInsertaEmpleado() {
        return usrInsertaEmpleado;
    }

    public void setUsrInsertaEmpleado(String usrInsertaEmpleado) {
        this.usrInsertaEmpleado = usrInsertaEmpleado;
    }

    public BigDecimal getEmpAnticipoQuincena() {
        return empAnticipoQuincena;
    }

    public void setEmpAnticipoQuincena(BigDecimal empAnticipoQuincena) {
        this.empAnticipoQuincena = empAnticipoQuincena;
    }

    public BigDecimal getEmpPrestamoQuirografario() {
        return empPrestamoQuirografario;
    }

    public void setEmpPrestamoQuirografario(BigDecimal empPrestamoQuirografario) {
        this.empPrestamoQuirografario = empPrestamoQuirografario;
    }

    public BigDecimal getEmpPrestamoHipotecario() {
        return empPrestamoHipotecario;
    }

    public void setEmpPrestamoHipotecario(BigDecimal empPrestamoHipotecario) {
        this.empPrestamoHipotecario = empPrestamoHipotecario;
    }

    public BigDecimal getEmpSaldoHorasExtras50() {
        return empSaldoHorasExtras50;
    }

    public void setEmpSaldoHorasExtras50(BigDecimal empSaldoHorasExtras50) {
        this.empSaldoHorasExtras50 = empSaldoHorasExtras50;
    }

    public BigDecimal getEmpSaldoHorasExtras100() {
        return empSaldoHorasExtras100;
    }

    public void setEmpSaldoHorasExtras100(BigDecimal empSaldoHorasExtras100) {
        this.empSaldoHorasExtras100 = empSaldoHorasExtras100;
    }

    public BigDecimal getEmpSaldoHorasExtrasExtraordinarias100() {
        return empSaldoHorasExtrasExtraordinarias100;
    }

    public void setEmpSaldoHorasExtrasExtraordinarias100(BigDecimal empSaldoHorasExtrasExtraordinarias100) {
        this.empSaldoHorasExtrasExtraordinarias100 = empSaldoHorasExtrasExtraordinarias100;
    }

    public String getEmpRelacionTrabajo() {
        return empRelacionTrabajo;
    }

    public void setEmpRelacionTrabajo(String empRelacionTrabajo) {
        this.empRelacionTrabajo = empRelacionTrabajo;
    }

    public String getEmpDescripcion() {
        return empDescripcion;
    }

    public void setEmpDescripcion(String empDescripcion) {
        this.empDescripcion = empDescripcion;
    }

    public boolean isEmpMaternidad() {
        return empMaternidad;
    }

    public void setEmpMaternidad(boolean empMaternidad) {
        this.empMaternidad = empMaternidad;
    }

    public boolean isEmpLactancia() {
        return empLactancia;
    }

    public void setEmpLactancia(boolean empLactancia) {
        this.empLactancia = empLactancia;
    }

    public String getEmpFechaDesdeLactancia() {
        return empFechaDesdeLactancia;
    }

    public void setEmpFechaDesdeLactancia(String empFechaDesdeLactancia) {
        this.empFechaDesdeLactancia = empFechaDesdeLactancia;
    }

    public String getEmpFechaHastaLactancia() {
        return empFechaHastaLactancia;
    }

    public void setEmpFechaHastaLactancia(String empFechaHastaLactancia) {
        this.empFechaHastaLactancia = empFechaHastaLactancia;
    }

}
