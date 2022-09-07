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
 * @author charly
 */
@Entity
public class RhFunFormulario107_2013TO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "f107_id")
    private String f107Id;

    @Column(name = "f107_tipo")
    private String f107Tipo;

    @Column(name = "f107_apellidos")
    private String f107Apellidos;

    @Column(name = "f107_nombres")
    private String f107Nombres;

    @Column(name = "f107_establecimiento")
    private String f107Establecimiento;

    @Column(name = "f107_residencia_tipo")
    private String f107ResidenciaTipo;

    @Column(name = "f107_residencia_pais")
    private String f107ResidenciaPais;

    @Column(name = "f107_convenio")
    private String f107Convenio;

    @Column(name = "f107_discapacidad_tipo")
    private String f107DiscapacidadTipo;

    @Column(name = "f107_discapacidad_porcentaje")
    private BigDecimal f107DiscapacidadPorcentaje;/// 10

    @Column(name = "f107_discapacidad_id_tipo")
    private String f107DiscapacidadIdTipo;//

    @Column(name = "f107_discapacidad_id_numero")
    private String f107DiscapacidadIdNumero;

    @Column(name = "f107_sueldo")
    private BigDecimal f107Sueldo;

    @Column(name = "f107_bonos")
    private BigDecimal f107Bonos;

    @Column(name = "f107_utilidades")
    private BigDecimal f107Utilidades;

    @Column(name = "f107_sueldo_otros_empleadores")
    private BigDecimal f107SueldoOtrosEmpleadores;

    @Column(name = "f107_impuesto_asumido")
    private BigDecimal f107ImpuestoAsumido;//

    @Column(name = "f107_xiii_sueldo")
    private BigDecimal f107XiiiSueldo;

    @Column(name = "f107_xiv_sueldo")
    private BigDecimal f107XivSueldo;

    @Column(name = "f107_fondo_reserva")
    private BigDecimal f107FondoReserva;// 20

    @Column(name = "f107_salario_digno")
    private BigDecimal f107SalarioDigno;

    @Column(name = "f107_desahucio")
    private BigDecimal f107Desahucio;

    @Column(name = "f107_subtotal")
    private BigDecimal f107Subtotal;

    @Column(name = "f107_salario_neto")
    private String f107SalarioNeto;

    @Column(name = "f107_iess")
    private BigDecimal f107Iess;

    @Column(name = "f107_iess_otros_empleadores")
    private BigDecimal f107IessOtrosEmpleadores;//

    @Column(name = "f107_vivienda")
    private BigDecimal f107Vivienda;

    @Column(name = "f107_salud")
    private BigDecimal f107Salud;

    @Column(name = "f107_educacion")
    private BigDecimal f107Educacion;

    @Column(name = "f107_alimentacion")
    private BigDecimal f107Alimentacion;// 30

    @Column(name = "f107_vestuario")
    private BigDecimal f107Vestuario;

    @Column(name = "f107_rebaja_discapacitado")
    private BigDecimal f107RebajaDiscapacitado;

    @Column(name = "f107_rebaja_tercera_edad")
    private BigDecimal f107RebajaTerceraEdad;

    @Column(name = "f107_base_imponible")
    private BigDecimal f107BaseImponible;

    @Column(name = "f107_impuesto_causado")
    private BigDecimal f107ImpuestoCausado;

    @Column(name = "f107_impuesto_asumido_otros_empleadores")
    private BigDecimal f107ImpuestoAsumidoOtrosEmpleadores;

    @Column(name = "f107_impuesto_asumido_este_empleador")
    private BigDecimal f107ImpuestoAsumidoEsteEmpleador;

    @Column(name = "f107_valor_retenido")
    private BigDecimal f107ValorRetenido;

    @Column(name = "f107_empleado_inactivo")
    private Boolean f107EmpleadoInactivo;// 39

    @Column(name = "f107_turismo")
    private BigDecimal f107Turismo;

    /*
	 * private String usrEmpresa; private String usrCodigo; private String
	 * usrFechaInserta;
     */
    public RhFunFormulario107_2013TO() {
    }

    public RhFunFormulario107_2013TO(String f107Tipo, String f107Id, String f107Apellidos, String f107Nombres,
            String f107Establecimiento, String f107ResidenciaTipo, String f107ResidenciaPais, String f107Convenio,
            String f107DiscapacidadTipo, BigDecimal f107DiscapacidadPorcentaje, String f107DiscapacidadIdTipo,
            String f107DiscapacidadIdNumero, BigDecimal f107Sueldo, BigDecimal f107Bonos, BigDecimal f107Utilidades,
            BigDecimal f107SueldoOtrosEmpleadores, BigDecimal f107ImpuestoAsumido, BigDecimal f107XiiiSueldo,
            BigDecimal f107XivSueldo, BigDecimal f107FondoReserva, BigDecimal f107SalarioDigno,
            BigDecimal f107Desahucio, BigDecimal f107Subtotal, String f107SalarioNeto, BigDecimal f107Iess,
            BigDecimal f107IessOtrosEmpleadores, BigDecimal f107Vivienda, BigDecimal f107Salud,
            BigDecimal f107Educacion, BigDecimal f107Alimentacion, BigDecimal f107Vestuario,
            BigDecimal f107RebajaDiscapacitado, BigDecimal f107RebajaTerceraEdad, BigDecimal f107BaseImponible,
            BigDecimal f107ImpuestoCausado, BigDecimal f107ImpuestoAsumidoOtrosEmpleadores,
            BigDecimal f107ImpuestoAsumidoEsteEmpleador, BigDecimal f107ValorRetenido, Boolean f107EmpleadoInactivo) {
        this.f107Tipo = f107Tipo;
        this.f107Id = f107Id;
        this.f107Apellidos = f107Apellidos;
        this.f107Nombres = f107Nombres;
        this.f107Establecimiento = f107Establecimiento;
        this.f107ResidenciaTipo = f107ResidenciaTipo;
        this.f107ResidenciaPais = f107ResidenciaPais;
        this.f107Convenio = f107Convenio;
        this.f107DiscapacidadTipo = f107DiscapacidadTipo;
        this.f107DiscapacidadPorcentaje = f107DiscapacidadPorcentaje;
        this.f107DiscapacidadIdTipo = f107DiscapacidadIdTipo;
        this.f107DiscapacidadIdNumero = f107DiscapacidadIdNumero;// ----
        this.f107Sueldo = f107Sueldo;
        this.f107Bonos = f107Bonos;
        this.f107Utilidades = f107Utilidades;
        this.f107SueldoOtrosEmpleadores = f107SueldoOtrosEmpleadores;
        this.f107ImpuestoAsumido = f107ImpuestoAsumido;
        this.f107XiiiSueldo = f107XiiiSueldo;
        this.f107XivSueldo = f107XivSueldo;
        this.f107FondoReserva = f107FondoReserva;
        this.f107SalarioDigno = f107SalarioDigno;
        this.f107Desahucio = f107Desahucio;// ----
        this.f107Subtotal = f107Subtotal;
        this.f107SalarioNeto = f107SalarioNeto;
        this.f107Iess = f107Iess;
        this.f107IessOtrosEmpleadores = f107IessOtrosEmpleadores;
        this.f107Vivienda = f107Vivienda;// ---
        this.f107Salud = f107Salud;
        this.f107Educacion = f107Educacion;
        this.f107Alimentacion = f107Alimentacion;
        this.f107Vestuario = f107Vestuario;
        this.f107RebajaDiscapacitado = f107RebajaDiscapacitado;
        this.f107RebajaTerceraEdad = f107RebajaTerceraEdad;
        this.f107BaseImponible = f107BaseImponible;
        this.f107ImpuestoCausado = f107ImpuestoCausado;// --
        this.f107ImpuestoAsumidoOtrosEmpleadores = f107ImpuestoAsumidoOtrosEmpleadores;
        this.f107ImpuestoAsumidoEsteEmpleador = f107ImpuestoAsumidoEsteEmpleador;
        this.f107ValorRetenido = f107ValorRetenido;
        this.f107EmpleadoInactivo = f107EmpleadoInactivo;
    }

    public BigDecimal getF107Alimentacion() {
        return f107Alimentacion;
    }

    public void setF107Alimentacion(BigDecimal f107Alimentacion) {
        this.f107Alimentacion = f107Alimentacion;
    }

    public String getF107Apellidos() {
        return f107Apellidos;
    }

    public void setF107Apellidos(String f107Apellidos) {
        this.f107Apellidos = f107Apellidos;
    }

    public BigDecimal getF107BaseImponible() {
        return f107BaseImponible;
    }

    public void setF107BaseImponible(BigDecimal f107BaseImponible) {
        this.f107BaseImponible = f107BaseImponible;
    }

    public BigDecimal getF107Bonos() {
        return f107Bonos;
    }

    public void setF107Bonos(BigDecimal f107Bonos) {
        this.f107Bonos = f107Bonos;
    }

    public String getF107Convenio() {
        return f107Convenio;
    }

    public void setF107Convenio(String f107Convenio) {
        this.f107Convenio = f107Convenio;
    }

    public BigDecimal getF107Desahucio() {
        return f107Desahucio;
    }

    public void setF107Desahucio(BigDecimal f107Desahucio) {
        this.f107Desahucio = f107Desahucio;
    }

    public String getF107DiscapacidadIdNumero() {
        return f107DiscapacidadIdNumero;
    }

    public void setF107DiscapacidadIdNumero(String f107DiscapacidadIdNumero) {
        this.f107DiscapacidadIdNumero = f107DiscapacidadIdNumero;
    }

    public String getF107DiscapacidadIdTipo() {
        return f107DiscapacidadIdTipo;
    }

    public void setF107DiscapacidadIdTipo(String f107DiscapacidadIdTipo) {
        this.f107DiscapacidadIdTipo = f107DiscapacidadIdTipo;
    }

    public BigDecimal getF107DiscapacidadPorcentaje() {
        return f107DiscapacidadPorcentaje;
    }

    public void setF107DiscapacidadPorcentaje(BigDecimal f107DiscapacidadPorcentaje) {
        this.f107DiscapacidadPorcentaje = f107DiscapacidadPorcentaje;
    }

    public String getF107DiscapacidadTipo() {
        return f107DiscapacidadTipo;
    }

    public void setF107DiscapacidadTipo(String f107DiscapacidadTipo) {
        this.f107DiscapacidadTipo = f107DiscapacidadTipo;
    }

    public BigDecimal getF107Educacion() {
        return f107Educacion;
    }

    public void setF107Educacion(BigDecimal f107Educacion) {
        this.f107Educacion = f107Educacion;
    }

    public Boolean getF107EmpleadoInactivo() {
        return f107EmpleadoInactivo;
    }

    public void setF107EmpleadoInactivo(Boolean f107EmpleadoInactivo) {
        this.f107EmpleadoInactivo = f107EmpleadoInactivo;
    }

    public String getF107Establecimiento() {
        return f107Establecimiento;
    }

    public void setF107Establecimiento(String f107Establecimiento) {
        this.f107Establecimiento = f107Establecimiento;
    }

    public BigDecimal getF107FondoReserva() {
        return f107FondoReserva;
    }

    public void setF107FondoReserva(BigDecimal f107FondoReserva) {
        this.f107FondoReserva = f107FondoReserva;
    }

    public String getF107Id() {
        return f107Id;
    }

    public void setF107Id(String f107Id) {
        this.f107Id = f107Id;
    }

    public BigDecimal getF107Iess() {
        return f107Iess;
    }

    public void setF107Iess(BigDecimal f107Iess) {
        this.f107Iess = f107Iess;
    }

    public BigDecimal getF107IessOtrosEmpleadores() {
        return f107IessOtrosEmpleadores;
    }

    public void setF107IessOtrosEmpleadores(BigDecimal f107IessOtrosEmpleadores) {
        this.f107IessOtrosEmpleadores = f107IessOtrosEmpleadores;
    }

    public BigDecimal getF107ImpuestoAsumido() {
        return f107ImpuestoAsumido;
    }

    public void setF107ImpuestoAsumido(BigDecimal f107ImpuestoAsumido) {
        this.f107ImpuestoAsumido = f107ImpuestoAsumido;
    }

    public BigDecimal getF107ImpuestoAsumidoEsteEmpleador() {
        return f107ImpuestoAsumidoEsteEmpleador;
    }

    public void setF107ImpuestoAsumidoEsteEmpleador(BigDecimal f107ImpuestoAsumidoEsteEmpleador) {
        this.f107ImpuestoAsumidoEsteEmpleador = f107ImpuestoAsumidoEsteEmpleador;
    }

    public BigDecimal getF107ImpuestoAsumidoOtrosEmpleadores() {
        return f107ImpuestoAsumidoOtrosEmpleadores;
    }

    public void setF107ImpuestoAsumidoOtrosEmpleadores(BigDecimal f107ImpuestoAsumidoOtrosEmpleadores) {
        this.f107ImpuestoAsumidoOtrosEmpleadores = f107ImpuestoAsumidoOtrosEmpleadores;
    }

    public BigDecimal getF107ImpuestoCausado() {
        return f107ImpuestoCausado;
    }

    public void setF107ImpuestoCausado(BigDecimal f107ImpuestoCausado) {
        this.f107ImpuestoCausado = f107ImpuestoCausado;
    }

    public String getF107Nombres() {
        return f107Nombres;
    }

    public void setF107Nombres(String f107Nombres) {
        this.f107Nombres = f107Nombres;
    }

    public BigDecimal getF107RebajaDiscapacitado() {
        return f107RebajaDiscapacitado;
    }

    public void setF107RebajaDiscapacitado(BigDecimal f107RebajaDiscapacitado) {
        this.f107RebajaDiscapacitado = f107RebajaDiscapacitado;
    }

    public BigDecimal getF107RebajaTerceraEdad() {
        return f107RebajaTerceraEdad;
    }

    public void setF107RebajaTerceraEdad(BigDecimal f107RebajaTerceraEdad) {
        this.f107RebajaTerceraEdad = f107RebajaTerceraEdad;
    }

    public String getF107ResidenciaPais() {
        return f107ResidenciaPais;
    }

    public void setF107ResidenciaPais(String f107ResidenciaPais) {
        this.f107ResidenciaPais = f107ResidenciaPais;
    }

    public String getF107ResidenciaTipo() {
        return f107ResidenciaTipo;
    }

    public void setF107ResidenciaTipo(String f107ResidenciaTipo) {
        this.f107ResidenciaTipo = f107ResidenciaTipo;
    }

    public BigDecimal getF107SalarioDigno() {
        return f107SalarioDigno;
    }

    public void setF107SalarioDigno(BigDecimal f107SalarioDigno) {
        this.f107SalarioDigno = f107SalarioDigno;
    }

    public String getF107SalarioNeto() {
        return f107SalarioNeto;
    }

    public void setF107SalarioNeto(String f107SalarioNeto) {
        this.f107SalarioNeto = f107SalarioNeto;
    }

    public BigDecimal getF107Salud() {
        return f107Salud;
    }

    public void setF107Salud(BigDecimal f107Salud) {
        this.f107Salud = f107Salud;
    }

    public BigDecimal getF107Subtotal() {
        return f107Subtotal;
    }

    public void setF107Subtotal(BigDecimal f107Subtotal) {
        this.f107Subtotal = f107Subtotal;
    }

    public BigDecimal getF107Sueldo() {
        return f107Sueldo;
    }

    public void setF107Sueldo(BigDecimal f107Sueldo) {
        this.f107Sueldo = f107Sueldo;
    }

    public BigDecimal getF107SueldoOtrosEmpleadores() {
        return f107SueldoOtrosEmpleadores;
    }

    public void setF107SueldoOtrosEmpleadores(BigDecimal f107SueldoOtrosEmpleadores) {
        this.f107SueldoOtrosEmpleadores = f107SueldoOtrosEmpleadores;
    }

    public String getF107Tipo() {
        return f107Tipo;
    }

    public void setF107Tipo(String f107Tipo) {
        this.f107Tipo = f107Tipo;
    }

    public BigDecimal getF107Utilidades() {
        return f107Utilidades;
    }

    public void setF107Utilidades(BigDecimal f107Utilidades) {
        this.f107Utilidades = f107Utilidades;
    }

    public BigDecimal getF107ValorRetenido() {
        return f107ValorRetenido;
    }

    public void setF107ValorRetenido(BigDecimal f107ValorRetenido) {
        this.f107ValorRetenido = f107ValorRetenido;
    }

    public BigDecimal getF107Vestuario() {
        return f107Vestuario;
    }

    public void setF107Vestuario(BigDecimal f107Vestuario) {
        this.f107Vestuario = f107Vestuario;
    }

    public BigDecimal getF107Vivienda() {
        return f107Vivienda;
    }

    public void setF107Vivienda(BigDecimal f107Vivienda) {
        this.f107Vivienda = f107Vivienda;
    }

    public BigDecimal getF107XiiiSueldo() {
        return f107XiiiSueldo;
    }

    public void setF107XiiiSueldo(BigDecimal f107XiiiSueldo) {
        this.f107XiiiSueldo = f107XiiiSueldo;
    }

    public BigDecimal getF107XivSueldo() {
        return f107XivSueldo;
    }

    public void setF107XivSueldo(BigDecimal f107XivSueldo) {
        this.f107XivSueldo = f107XivSueldo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getF107Turismo() {
        return f107Turismo;
    }

    public void setF107Turismo(BigDecimal f107Turismo) {
        this.f107Turismo = f107Turismo;
    }

}
