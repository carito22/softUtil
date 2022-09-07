package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhFunListadoEmpleadosTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "emp_tipo_id")
    private Character empTipoId;

    @Column(name = "emp_id")
    private String empId;

    @Column(name = "emp_nacionalidad")
    private String empNacionalidad;

    @Column(name = "emp_apellidos")
    private String empApellidos;

    @Column(name = "emp_nombres")
    private String empNombres;

    @Column(name = "emp_genero")
    private Character empGenero;

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

    @Column(name = "emp_ciudad")
    private String empLugarNacimiento;

    @Column(name = "emp_domicilio")
    private String empDomicilio;

    @Column(name = "emp_numero")
    private String empNumero;

    @Column(name = "emp_telefono")
    private String empTelefono;

    @Column(name = "sec_codigo")
    private String secCodigo;

    @Column(name = "cat_nombre")
    private String catNombre;

    @Column(name = "emp_fecha_primer_ingreso")
    private String empFechaPrimerIngreso;

    @Column(name = "emp_fecha_primera_salida")
    private String empFechaPrimeraSalida;

    @Column(name = "emp_fecha_ultimo_ingreso")
    private String empFechaUltimoIngreso;

    @Column(name = "emp_fecha_ultima_salida")
    private String empFechaUltimaSalida;

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

    @Column(name = "emp_sueldo_real")
    private BigDecimal empSueldoReal;

    @Column(name = "emp_bono_fijo")
    private BigDecimal empBonoFijo;

    @Column(name = "emp_bono_fijo_nd")
    private BigDecimal empBonoFijoNd;

    @Column(name = "emp_otros_ingresos")
    private BigDecimal empOtrosIngresos;

    @Column(name = "emp_otros_ingresos_nd")
    private BigDecimal empOtrosIngresosNd;

    @Column(name = "emp_acumula_fondo_reserva")
    private Boolean empAcumulaFondoReserva;

    @Column(name = "emp_retencion")
    private Boolean empRetencion;

    @Column(name = "emp_educacion")
    private BigDecimal empEducacion;

    @Column(name = "emp_alimentacion")
    private BigDecimal empAlimentacion;

    @Column(name = "emp_salud")
    private BigDecimal empSalud;

    @Column(name = "emp_vivienda")
    private BigDecimal empVivienda;

    @Column(name = "emp_vestuario")
    private BigDecimal empVestuario;

    @Column(name = "emp_sueldo_otra_compania")
    private BigDecimal empSueldoOtraCompania;

    @Column(name = "emp_utilidades")
    private BigDecimal empUtilidades;

    @Column(name = "emp_banco") //
    private String empBanco;

    @Column(name = "emp_cuenta_numero")
    private String empCuentaNumero;

    @Column(name = "emp_observaciones")
    private String empObservaciones;

    @Column(name = "emp_inactivo")
    private Boolean empInactivo;

    @Column(name = "emp_acumula_xiii_sueldo")
    private Boolean empAcumulaXiiiSueldo;

    @Column(name = "emp_acumula_xiv_sueldo")
    private Boolean empAcumulaXivSueldo;

    @Column(name = "emp_correo_electronico")
    private String empCorreoElectronico;

    @Column(name = "emp_maternidad")
    private Boolean empMaternidad;
    @Column(name = "emp_lactancia")
    private Boolean empLactancia;
    @Column(name = "emp_fecha_desde_lactancia")
    private String empFechaDesdeLactancia;
    @Column(name = "emp_fecha_hasta_lactancia")
    private String empFechaHastaLactancia;
    @Column(name = "emp_salario_neto")
    private boolean empSalarioNeto;
    @Column(name = "emp_discapacidad_tipo")
    private String empDiscapacidadTipo;
    @Column(name = "emp_discapacidad_porcentaje")
    private Short empDiscapacidadPorcentaje;

    public RhFunListadoEmpleadosTO() {
    }

    public RhFunListadoEmpleadosTO(Integer id, Character empTipoId, String empId, String empNacionalidad,
            String empApellidos, String empNombres, Character empGenero, String empFechaNacimiento,
            String empEstadoCivil, Integer empCargasFamiliares, String empProvincia, String empCanton,
            String empLugarNacimiento, String empDomicilio, String empNumero, String empTelefono, String secCodigo,
            String catNombre, String empFechaPrimerIngreso, String empFechaPrimeraSalida, String empFechaUltimoIngreso,
            String empFechaUltimaSalida, String empFechaAfiliacionIess, String empCodigoAfiliacionIess,
            String empCodigoCargo, String empCargo, BigDecimal empSueldoIess, String empFormaPago,
            Integer empDiasTrabajados, Integer empDiasDescanso, BigDecimal empSueldoReal, BigDecimal empBonoFijo,
            BigDecimal empBonoFijoNd, BigDecimal empOtrosIngresos, BigDecimal empOtrosIngresosNd,
            Boolean empAcumulaFondoReserva, Boolean empRetencion, BigDecimal empEducacion, BigDecimal empAlimentacion,
            BigDecimal empSalud, BigDecimal empVivienda, BigDecimal empVestuario, BigDecimal empSueldoOtraCompania,
            BigDecimal empUtilidades, String empBanco, String empCuentaNumero, String empObservaciones,
            Boolean empInactivo, Boolean empAcumulaXiiiSueldo, Boolean empAcumulaXivSueldo) {
        this.id = id;
        this.empTipoId = empTipoId;
        this.empId = empId;
        this.empNacionalidad = empNacionalidad;
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
        this.secCodigo = secCodigo;
        this.catNombre = catNombre;
        this.empFechaPrimerIngreso = empFechaPrimerIngreso;
        this.empFechaPrimeraSalida = empFechaPrimeraSalida;
        this.empFechaUltimoIngreso = empFechaUltimoIngreso;
        this.empFechaUltimaSalida = empFechaUltimaSalida;
        this.empFechaAfiliacionIess = empFechaAfiliacionIess;
        this.empCodigoAfiliacionIess = empCodigoAfiliacionIess;
        this.empCodigoCargo = empCodigoCargo;
        this.empCargo = empCargo;
        this.empSueldoIess = empSueldoIess;
        this.empFormaPago = empFormaPago;
        this.empDiasTrabajados = empDiasTrabajados;
        this.empDiasDescanso = empDiasDescanso;
        this.empSueldoReal = empSueldoReal;
        this.empBonoFijo = empBonoFijo;
        this.empBonoFijoNd = empBonoFijoNd;
        this.empOtrosIngresos = empOtrosIngresos;
        this.empOtrosIngresosNd = empOtrosIngresosNd;
        this.empAcumulaFondoReserva = empAcumulaFondoReserva;
        this.empRetencion = empRetencion;
        this.empEducacion = empEducacion;
        this.empAlimentacion = empAlimentacion;
        this.empSalud = empSalud;
        this.empVivienda = empVivienda;
        this.empVestuario = empVestuario;
        this.empSueldoOtraCompania = empSueldoOtraCompania;
        this.empUtilidades = empUtilidades;
        this.empBanco = empBanco;
        this.empCuentaNumero = empCuentaNumero;
        this.empObservaciones = empObservaciones;
        this.empInactivo = empInactivo;
        this.empAcumulaXiiiSueldo = empAcumulaXiiiSueldo;
        this.empAcumulaXivSueldo = empAcumulaXivSueldo;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatNombre() {
        return catNombre;
    }

    public void setCatNombre(String catNombre) {
        this.catNombre = catNombre;
    }

    public Boolean getEmpAcumulaFondoReserva() {
        return empAcumulaFondoReserva;
    }

    public void setEmpAcumulaFondoReserva(Boolean empAcumulaFondoReserva) {
        this.empAcumulaFondoReserva = empAcumulaFondoReserva;
    }

    public Boolean getEmpAcumulaXiiiSueldo() {
        return empAcumulaXiiiSueldo;
    }

    public void setEmpAcumulaXiiiSueldo(Boolean empAcumulaXiiiSueldo) {
        this.empAcumulaXiiiSueldo = empAcumulaXiiiSueldo;
    }

    public Boolean getEmpAcumulaXivSueldo() {
        return empAcumulaXivSueldo;
    }

    public void setEmpAcumulaXivSueldo(Boolean empAcumulaXivSueldo) {
        this.empAcumulaXivSueldo = empAcumulaXivSueldo;
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

    public String getEmpCuentaNumero() {
        return empCuentaNumero;
    }

    public void setEmpCuentaNumero(String empCuentaNumero) {
        this.empCuentaNumero = empCuentaNumero;
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

    public String getEmpNacionalidad() {
        return empNacionalidad;
    }

    public void setEmpNacionalidad(String empNacionalidad) {
        this.empNacionalidad = empNacionalidad;
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

    public String getEmpProvincia() {
        return empProvincia;
    }

    public void setEmpProvincia(String empProvincia) {
        this.empProvincia = empProvincia;
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

    public BigDecimal getEmpSueldoReal() {
        return empSueldoReal;
    }

    public void setEmpSueldoReal(BigDecimal empSueldoReal) {
        this.empSueldoReal = empSueldoReal;
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

    public String getEmpCorreoElectronico() {
        return empCorreoElectronico;
    }

    public void setEmpCorreoElectronico(String empCorreoElectronico) {
        this.empCorreoElectronico = empCorreoElectronico;
    }

    public Boolean getEmpMaternidad() {
        return empMaternidad;
    }

    public void setEmpMaternidad(Boolean empMaternidad) {
        this.empMaternidad = empMaternidad;
    }

    public Boolean getEmpLactancia() {
        return empLactancia;
    }

    public void setEmpLactancia(Boolean empLactancia) {
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

    public boolean isEmpSalarioNeto() {
        return empSalarioNeto;
    }

    public void setEmpSalarioNeto(boolean empSalarioNeto) {
        this.empSalarioNeto = empSalarioNeto;
    }

    public String getEmpDiscapacidadTipo() {
        return empDiscapacidadTipo;
    }

    public void setEmpDiscapacidadTipo(String empDiscapacidadTipo) {
        this.empDiscapacidadTipo = empDiscapacidadTipo;
    }

    public Short getEmpDiscapacidadPorcentaje() {
        return empDiscapacidadPorcentaje;
    }

    public void setEmpDiscapacidadPorcentaje(Short empDiscapacidadPorcentaje) {
        this.empDiscapacidadPorcentaje = empDiscapacidadPorcentaje;
    }

}
