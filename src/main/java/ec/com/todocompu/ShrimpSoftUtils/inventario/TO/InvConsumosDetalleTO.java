/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvConsumosDetalleTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "det_secuencial")
	private Integer detSecuencial;

	@Column(name = "det_orden")
	private Integer detOrden;

	@Column(name = "det_cantidad")
	private java.math.BigDecimal detCantidad;

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
	private String consEmpresa;

	@Column(name = "cons_periodo")
	private String consPeriodo;

	@Column(name = "cons_motivo")
	private String consMotivo;

	@Column(name = "cons_numero")
	private String consNumero;

	public InvConsumosDetalleTO() {
	}

	public InvConsumosDetalleTO(Integer detSecuencial, Integer detOrden, java.math.BigDecimal detCantidad,
			String bodEmpresa, String bodCodigo, String proEmpresa, String proCodigoPrincipal, String secEmpresa,
			String secCodigo, String pisEmpresa, String pisSector, String pisNumero, String consEmpresa,
			String consPeriodo, String consMotivo, String consNumero) {
		this.detSecuencial = detSecuencial;
		this.detOrden = detOrden;
		this.detCantidad = detCantidad;
		this.bodEmpresa = bodEmpresa;
		this.bodCodigo = bodCodigo;
		this.proEmpresa = proEmpresa;
		this.proCodigoPrincipal = proCodigoPrincipal;
		this.secEmpresa = secEmpresa;
		this.secCodigo = secCodigo;
		this.pisEmpresa = pisEmpresa;
		this.pisSector = pisSector;
		this.pisNumero = pisNumero;
		this.consEmpresa = consEmpresa;
		this.consPeriodo = consPeriodo;
		this.consMotivo = consMotivo;
		this.consNumero = consNumero;
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

	public String getConsEmpresa() {
		return consEmpresa;
	}

	public void setConsEmpresa(String consEmpresa) {
		this.consEmpresa = consEmpresa;
	}

	public String getConsMotivo() {
		return consMotivo;
	}

	public void setConsMotivo(String consMotivo) {
		this.consMotivo = consMotivo;
	}

	public String getConsNumero() {
		return consNumero;
	}

	public void setConsNumero(String consNumero) {
		this.consNumero = consNumero;
	}

	public String getConsPeriodo() {
		return consPeriodo;
	}

	public void setConsPeriodo(String consPeriodo) {
		this.consPeriodo = consPeriodo;
	}

	public java.math.BigDecimal getDetCantidad() {
		return detCantidad;
	}

	public void setDetCantidad(java.math.BigDecimal detCantidad) {
		this.detCantidad = detCantidad;
	}

	public Integer getDetOrden() {
		return detOrden;
	}

	public void setDetOrden(Integer detOrden) {
		this.detOrden = detOrden;
	}

	public Integer getDetSecuencial() {
		return detSecuencial;
	}

	public void setDetSecuencial(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
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
