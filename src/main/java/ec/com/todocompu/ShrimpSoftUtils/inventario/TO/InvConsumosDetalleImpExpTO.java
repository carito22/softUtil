/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvConsumosDetalleImpExpTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "det_secuencial")
	private Integer detSecuencial;

	@Column(name = "det_orden")
	private Integer detOrden;

	@Column(name = "det_cantidad ")
	private java.math.BigDecimal detCantidad;

	@Column(name = "det_valor_promedio")
	private java.math.BigDecimal detValorPromedio;

	@Column(name = "det_valor_ultima_compra")
	private java.math.BigDecimal detValorUltimaCompra;

	@Column(name = "det_saldo")
	private java.math.BigDecimal detSaldo;

	@Column(name = "bod_empresa")
	private String bodEmpresa;

	@Column(name = "bod_codigo")
	private String bodCodigo;

	@Column(name = "pro_empresa")
	private String proEmpresa;

	@Column(name = "pro_codigo_principal")
	private String proCodigoPrincipal;

	@Column(name = "sec_empresa")
	private String secEmpresa;

	@Column(name = "sec_codigo")
	private String secCodigo;

	@Column(name = "pis_empresa")
	private String pisEmpresa;

	@Column(name = "pis_sector")
	private String pisSector;

	@Column(name = "pis_numero")
	private String pisNumero;

	@Column(name = "cons_empresa")
	private String conEmpresa;

	@Column(name = "cons_periodo")
	private String conPeriodo;

	@Column(name = "cons_motivo")
	private String conTipo;

	@Column(name = "cons_numero")
	private String conNumero;

	public InvConsumosDetalleImpExpTO() {
	}

	public InvConsumosDetalleImpExpTO(Integer detSecuencial, Integer detOrden, BigDecimal detCantidad,
			BigDecimal detValorPromedio, BigDecimal detValorUltimaCompra, BigDecimal detSaldo, String bodEmpresa,
			String bodCodigo, String proEmpresa, String proCodigoPrincipal, String secEmpresa, String secCodigo,
			String pisEmpresa, String pisSector, String pisNumero, String conEmpresa, String conPeriodo, String conTipo,
			String conNumero) {
		this.detSecuencial = detSecuencial;
		this.detOrden = detOrden;
		this.detCantidad = detCantidad;
		this.detValorPromedio = detValorPromedio;
		this.detValorUltimaCompra = detValorUltimaCompra;
		this.detSaldo = detSaldo;
		this.bodEmpresa = bodEmpresa;
		this.bodCodigo = bodCodigo;
		this.proEmpresa = proEmpresa;
		this.proCodigoPrincipal = proCodigoPrincipal;
		this.secEmpresa = secEmpresa;
		this.secCodigo = secCodigo;
		this.pisEmpresa = pisEmpresa;
		this.pisSector = pisSector;
		this.pisNumero = pisNumero;
		this.conEmpresa = conEmpresa;
		this.conPeriodo = conPeriodo;
		this.conTipo = conTipo;
		this.conNumero = conNumero;
	}

	public String getBodCodigo() {
		return bodCodigo;
	}

	public void setBodCodigo(String bodCodigo) {
		this.bodCodigo = bodCodigo;
	}

	public String getBodEmpresa() {
		return bodEmpresa;
	}

	public void setBodEmpresa(String bodEmpresa) {
		this.bodEmpresa = bodEmpresa;
	}

	public String getConEmpresa() {
		return conEmpresa;
	}

	public void setConEmpresa(String conEmpresa) {
		this.conEmpresa = conEmpresa;
	}

	public String getConNumero() {
		return conNumero;
	}

	public void setConNumero(String conNumero) {
		this.conNumero = conNumero;
	}

	public String getConPeriodo() {
		return conPeriodo;
	}

	public void setConPeriodo(String conPeriodo) {
		this.conPeriodo = conPeriodo;
	}

	public String getConTipo() {
		return conTipo;
	}

	public void setConTipo(String conTipo) {
		this.conTipo = conTipo;
	}

	public BigDecimal getDetCantidad() {
		return detCantidad;
	}

	public void setDetCantidad(BigDecimal detCantidad) {
		this.detCantidad = detCantidad;
	}

	public Integer getDetOrden() {
		return detOrden;
	}

	public void setDetOrden(Integer detOrden) {
		this.detOrden = detOrden;
	}

	public BigDecimal getDetSaldo() {
		return detSaldo;
	}

	public void setDetSaldo(BigDecimal detSaldo) {
		this.detSaldo = detSaldo;
	}

	public Integer getDetSecuencial() {
		return detSecuencial;
	}

	public void setDetSecuencial(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public BigDecimal getDetValorPromedio() {
		return detValorPromedio;
	}

	public void setDetValorPromedio(BigDecimal detValorPromedio) {
		this.detValorPromedio = detValorPromedio;
	}

	public BigDecimal getDetValorUltimaCompra() {
		return detValorUltimaCompra;
	}

	public void setDetValorUltimaCompra(BigDecimal detValorUltimaCompra) {
		this.detValorUltimaCompra = detValorUltimaCompra;
	}

	public String getPisEmpresa() {
		return pisEmpresa;
	}

	public void setPisEmpresa(String pisEmpresa) {
		this.pisEmpresa = pisEmpresa;
	}

	public String getPisNumero() {
		return pisNumero;
	}

	public void setPisNumero(String pisNumero) {
		this.pisNumero = pisNumero;
	}

	public String getPisSector() {
		return pisSector;
	}

	public void setPisSector(String pisSector) {
		this.pisSector = pisSector;
	}

	public String getProCodigoPrincipal() {
		return proCodigoPrincipal;
	}

	public void setProCodigoPrincipal(String proCodigoPrincipal) {
		this.proCodigoPrincipal = proCodigoPrincipal;
	}

	public String getProEmpresa() {
		return proEmpresa;
	}

	public void setProEmpresa(String proEmpresa) {
		this.proEmpresa = proEmpresa;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public String getSecEmpresa() {
		return secEmpresa;
	}

	public void setSecEmpresa(String secEmpresa) {
		this.secEmpresa = secEmpresa;
	}

}
