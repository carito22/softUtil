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
public class RhFunFormulario107TO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "f107_id")
	private String f107Id;

	@Column(name = "f107_nombres")
	private String f107Nombres;

	@Column(name = "f107_sueldo")
	private java.math.BigDecimal f107Sueldo;

	@Column(name = "f107_bonos")
	private java.math.BigDecimal f107Bonos;

	@Column(name = "f107_xiii_sueldo")
	private java.math.BigDecimal f107XiiiSueldo;

	@Column(name = "f107_xiv_sueldo")
	private java.math.BigDecimal f107XivSueldo;

	@Column(name = "f107_fondo_reserva")
	private java.math.BigDecimal f107FondoReserva;

	@Column(name = "f107_salario_digno")
	private java.math.BigDecimal f107SalarioDigno;

	@Column(name = "f107_utilidades")
	private java.math.BigDecimal f107Utilidades;

	@Column(name = "f107_desahucio")
	private java.math.BigDecimal f107Desahucio;

	@Column(name = "f107_iess")
	private java.math.BigDecimal f107Iess;

	@Column(name = "f107_vivienda")
	private java.math.BigDecimal f107Vivienda;

	@Column(name = "f107_salud")
	private java.math.BigDecimal f107Salud;

	@Column(name = "f107_educacion")
	private java.math.BigDecimal f107Educacion;

	@Column(name = "f107_alimentacion")
	private java.math.BigDecimal f107Alimentacion;

	@Column(name = "f107_vestuario")
	private java.math.BigDecimal f107Vestuario;

	@Column(name = "f107_rebaja_discapacitado")
	private java.math.BigDecimal f107RebajaDiscapacitado;

	@Column(name = "f107_rebaja_tercera_edad")
	private java.math.BigDecimal f107RebajaTerceraEdad;

	@Column(name = "f107_subtotal")
	private java.math.BigDecimal f107Subtotal;

	@Column(name = "f107_meses_trabajados")
	private java.math.BigDecimal f107MesesTrabajados;

	@Column(name = "f107_otros_ingresos")
	private java.math.BigDecimal f107OtrosIngresos;

	@Column(name = "f107_otras_deducciones")
	private java.math.BigDecimal f107OtrasDeducciones;

	@Column(name = "f107_otras_rebajas")
	private java.math.BigDecimal f107OtrasRebajas;

	@Column(name = "f107_base_imponible")
	private java.math.BigDecimal f107BaseImponible;

	@Column(name = "f107_impuesto_causado")
	private java.math.BigDecimal f107ImpuestoCausado;

	@Column(name = "f107_valor_retenido")
	private java.math.BigDecimal f107ValorRetenido;

	@Column(name = "f107_numero_retenciones")
	private java.math.BigDecimal f107NumeroRetenciones;

	@Column(name = "f107_empleado_inactivo")
	private Boolean f107EmpleadoInactivo;

	public RhFunFormulario107TO() {
	}

	public RhFunFormulario107TO(String f107Id, String f107Nombres, BigDecimal f107Sueldo, BigDecimal f107Bonos,
			BigDecimal f107XiiiSueldo, BigDecimal f107XivSueldo, BigDecimal f107FondoReserva,
			BigDecimal f107SalarioDigno, BigDecimal f107Utilidades, BigDecimal f107Desahucio, BigDecimal f107Iess,
			BigDecimal f107Vivienda, BigDecimal f107Salud, BigDecimal f107Educacion, BigDecimal f107Alimentacion,
			BigDecimal f107Vestuario, BigDecimal f107RebajaDiscapacitado, BigDecimal f107RebajaTerceraEdad,
			BigDecimal f107Subtotal, BigDecimal f107MesesTrabajados, BigDecimal f107OtrosIngresos,
			BigDecimal f107OtrasDeducciones, BigDecimal f107OtrasRebajas, BigDecimal f107BaseImponible,
			BigDecimal f107ImpuestoCausado, BigDecimal f107ValorRetenido, BigDecimal f107NumeroRetenciones,
			Boolean f107EmpleadoInactivo) {
		this.f107Id = f107Id;
		this.f107Nombres = f107Nombres;
		this.f107Sueldo = f107Sueldo;
		this.f107Bonos = f107Bonos;
		this.f107XiiiSueldo = f107XiiiSueldo;
		this.f107XivSueldo = f107XivSueldo;
		this.f107FondoReserva = f107FondoReserva;
		this.f107SalarioDigno = f107SalarioDigno;
		this.f107Utilidades = f107Utilidades;
		this.f107Desahucio = f107Desahucio;
		this.f107Iess = f107Iess;
		this.f107Vivienda = f107Vivienda;
		this.f107Salud = f107Salud;
		this.f107Educacion = f107Educacion;
		this.f107Alimentacion = f107Alimentacion;
		this.f107Vestuario = f107Vestuario;
		this.f107RebajaDiscapacitado = f107RebajaDiscapacitado;
		this.f107RebajaTerceraEdad = f107RebajaTerceraEdad;
		this.f107Subtotal = f107Subtotal;
		this.f107MesesTrabajados = f107MesesTrabajados;
		this.f107OtrosIngresos = f107OtrosIngresos;
		this.f107OtrasDeducciones = f107OtrasDeducciones;
		this.f107OtrasRebajas = f107OtrasRebajas;
		this.f107BaseImponible = f107BaseImponible;
		this.f107ImpuestoCausado = f107ImpuestoCausado;
		this.f107ValorRetenido = f107ValorRetenido;
		this.f107NumeroRetenciones = f107NumeroRetenciones;
		this.f107EmpleadoInactivo = f107EmpleadoInactivo;
	}

	public BigDecimal getF107Alimentacion() {
		return f107Alimentacion;
	}

	public void setF107Alimentacion(BigDecimal f107Alimentacion) {
		this.f107Alimentacion = f107Alimentacion;
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

	public BigDecimal getF107Desahucio() {
		return f107Desahucio;
	}

	public void setF107Desahucio(BigDecimal f107Desahucio) {
		this.f107Desahucio = f107Desahucio;
	}

	public BigDecimal getF107Educacion() {
		return f107Educacion;
	}

	public void setF107Educacion(BigDecimal f107Educacion) {
		this.f107Educacion = f107Educacion;
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

	public BigDecimal getF107ImpuestoCausado() {
		return f107ImpuestoCausado;
	}

	public void setF107ImpuestoCausado(BigDecimal f107ImpuestoCausado) {
		this.f107ImpuestoCausado = f107ImpuestoCausado;
	}

	public BigDecimal getF107MesesTrabajados() {
		return f107MesesTrabajados;
	}

	public void setF107MesesTrabajados(BigDecimal f107MesesTrabajados) {
		this.f107MesesTrabajados = f107MesesTrabajados;
	}

	public String getF107Nombres() {
		return f107Nombres;
	}

	public void setF107Nombres(String f107Nombres) {
		this.f107Nombres = f107Nombres;
	}

	public BigDecimal getF107NumeroRetenciones() {
		return f107NumeroRetenciones;
	}

	public void setF107NumeroRetenciones(BigDecimal f107NumeroRetenciones) {
		this.f107NumeroRetenciones = f107NumeroRetenciones;
	}

	public BigDecimal getF107OtrasDeducciones() {
		return f107OtrasDeducciones;
	}

	public void setF107OtrasDeducciones(BigDecimal f107OtrasDeducciones) {
		this.f107OtrasDeducciones = f107OtrasDeducciones;
	}

	public BigDecimal getF107OtrasRebajas() {
		return f107OtrasRebajas;
	}

	public void setF107OtrasRebajas(BigDecimal f107OtrasRebajas) {
		this.f107OtrasRebajas = f107OtrasRebajas;
	}

	public BigDecimal getF107OtrosIngresos() {
		return f107OtrosIngresos;
	}

	public void setF107OtrosIngresos(BigDecimal f107OtrosIngresos) {
		this.f107OtrosIngresos = f107OtrosIngresos;
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

	public BigDecimal getF107SalarioDigno() {
		return f107SalarioDigno;
	}

	public void setF107SalarioDigno(BigDecimal f107SalarioDigno) {
		this.f107SalarioDigno = f107SalarioDigno;
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

	public Boolean getF107EmpleadoInactivo() {
		return f107EmpleadoInactivo;
	}

	public void setF107EmpleadoInactivo(Boolean f107EmpleadoInactivo) {
		this.f107EmpleadoInactivo = f107EmpleadoInactivo;
	}

}
