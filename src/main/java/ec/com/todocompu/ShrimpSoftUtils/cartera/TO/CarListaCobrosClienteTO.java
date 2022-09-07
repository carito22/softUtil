/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

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
public class CarListaCobrosClienteTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cli_codigo")
	private String cliCodigo;

	@Column(name = "cli_razon_social")
	private String cliRazonSocial;

	@Column(name = "cli_id_numero")
	private String cliRuc;

	@Column(name = "cli_direccion")
	private String cliDireccion;

	@Column(name = "con_observaciones")
	private String cliObservaciones;

	@Column(name = "con_fecha")
	private String conFecha;

	@Column(name = "con_anulado")
	private boolean conAnulado;
	
	@Column(name = "cob_saldo_anterior")
	private BigDecimal cobSaldoAnterior;

	@Column(name = "cob_valor")
	private BigDecimal cobValor;

	@Column(name = "cob_saldo_actual")
	private BigDecimal cobSaldoActual;

	public CarListaCobrosClienteTO() {
	}


	public CarListaCobrosClienteTO(String cliCodigo, String cliRazonSocial, String cliRuc, String cliDireccion,
			String cliObservaciones, String conFecha, boolean conAnulado, BigDecimal cobSaldoAnterior,
			BigDecimal cobValor, BigDecimal cobSaldoActual) {
		this.cliCodigo = cliCodigo;
		this.cliRazonSocial = cliRazonSocial;
		this.cliRuc = cliRuc;
		this.cliDireccion = cliDireccion;
		this.cliObservaciones = cliObservaciones;
		this.conFecha = conFecha;
		this.conAnulado = conAnulado;
		this.cobSaldoAnterior = cobSaldoAnterior;
		this.cobValor = cobValor;
		this.cobSaldoActual = cobSaldoActual;
	}

	public BigDecimal getCobSaldoAnterior() {
		return cobSaldoAnterior;
	}


	public void setCobSaldoAnterior(BigDecimal cobSaldoAnterior) {
		this.cobSaldoAnterior = cobSaldoAnterior;
	}


	public BigDecimal getCobValor() {
		return cobValor;
	}


	public void setCobValor(BigDecimal cobValor) {
		this.cobValor = cobValor;
	}


	public BigDecimal getCobSaldoActual() {
		return cobSaldoActual;
	}


	public void setCobSaldoActual(BigDecimal cobSaldoActual) {
		this.cobSaldoActual = cobSaldoActual;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getCliCodigo() {
		return cliCodigo;
	}

	public void setCliCodigo(String cliCodigo) {
		this.cliCodigo = cliCodigo;
	}

	public String getCliDireccion() {
		return cliDireccion;
	}

	public void setCliDireccion(String cliDireccion) {
		this.cliDireccion = cliDireccion;
	}

        public String getCliRazonSocial() {
            return cliRazonSocial;
        }

        public void setCliRazonSocial(String cliRazonSocial) {
            this.cliRazonSocial = cliRazonSocial;
        }

	public String getCliObservaciones() {
		return cliObservaciones;
	}

	public void setCliObservaciones(String cliObservaciones) {
		this.cliObservaciones = cliObservaciones;
	}

	public String getCliRuc() {
		return cliRuc;
	}

	public void setCliRuc(String cliRuc) {
		this.cliRuc = cliRuc;
	}

	public boolean getConAnulado() {
		return conAnulado;
	}

	public void setConAnulado(boolean conAnulado) {
		this.conAnulado = conAnulado;
	}

	public String getConFecha() {
		return conFecha;
	}

	public void setConFecha(String conFecha) {
		this.conFecha = conFecha;
	}
}