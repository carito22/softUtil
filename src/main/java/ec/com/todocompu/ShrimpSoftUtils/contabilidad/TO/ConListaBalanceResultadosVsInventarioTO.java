/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class ConListaBalanceResultadosVsInventarioTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "bri_id")
	private Integer id;
	@Column(name = "bri_codigo_cuenta_contable")
	private String vriCuentaContable;
	@Column(name = "bri_nombre_cuenta_contable")
	private String vriNombre;
	@Column(name = "bri_resultado_contable")
	private BigDecimal vriSaldoContable;
	@Column(name = "bri_resultado_inventario")
	private BigDecimal vriInventarioInicial;
	@Column(name = "bri_diferencia")
	private BigDecimal vriDiferencia;

	public ConListaBalanceResultadosVsInventarioTO(String vriCuentaContable, String vriNombre,
			BigDecimal vriSaldoContable, BigDecimal vriInventarioInicial, BigDecimal vriDiferencia, Integer id) {
		this.vriCuentaContable = vriCuentaContable;
		this.vriNombre = vriNombre;
		this.vriSaldoContable = vriSaldoContable;
		this.vriInventarioInicial = vriInventarioInicial;
		this.vriDiferencia = vriDiferencia;
		this.id = id;
	}

	public ConListaBalanceResultadosVsInventarioTO() {
	}

	public String getVriCuentaContable() {
		return vriCuentaContable;
	}

	public void setVriCuentaContable(String vriCuentaContable) {
		this.vriCuentaContable = vriCuentaContable;
	}

	public BigDecimal getVriDiferencia() {
		return vriDiferencia;
	}

	public void setVriDiferencia(BigDecimal vriDiferencia) {
		this.vriDiferencia = vriDiferencia;
	}

	public BigDecimal getVriInventarioInicial() {
		return vriInventarioInicial;
	}

	public void setVriInventarioInicial(BigDecimal vriInventarioInicial) {
		this.vriInventarioInicial = vriInventarioInicial;
	}

	public String getVriNombre() {
		return vriNombre;
	}

	public void setVriNombre(String vriNombre) {
		this.vriNombre = vriNombre;
	}

	public BigDecimal getVriSaldoContable() {
		return vriSaldoContable;
	}

	public void setVriSaldoContable(BigDecimal vriSaldoContable) {
		this.vriSaldoContable = vriSaldoContable;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
