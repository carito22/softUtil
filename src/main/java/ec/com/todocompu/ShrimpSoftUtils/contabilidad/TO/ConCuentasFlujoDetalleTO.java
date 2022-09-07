/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class ConCuentasFlujoDetalleTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "det_empresa")
	private String detEmpresa;
	@Column(name = "det_cuenta_contable")
	private String detCuentaContable;
	@Column(name = "det_debito_credito")
	private char detDebitoCredito;
	@Column(name = "det_cuenta_flujo")
	private String detCuentaFlujo;
	@Column(name = "flu_empresa")
	private String fluEmpresa;
	@Column(name = "flu_codigo")
	private String fluCodigo;
	@Column(name = "cta_empresa")
	private String ctaEmpresa;
	@Id
	@Column(name = "cta_codigo")
	private String ctaCodigo;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta")
	private String usrFechaInserta;
	@Column(name = "cta_detalle")
	private String detalleContable;
	@Column(name = "flu_detalle")
	private String detalleFlujo;

	public ConCuentasFlujoDetalleTO(String detEmpresa, String detCuentaContable, char detDebitoCredito,
			String detCuentaFlujo, String fluEmpresa, String fluCodigo, String ctaEmpresa, String ctaCodigo,
			String usrEmpresa, String usrCodigo, String usrFechaInserta) {
		this.detEmpresa = detEmpresa;
		this.detCuentaContable = detCuentaContable;
		this.detDebitoCredito = detDebitoCredito;
		this.detCuentaFlujo = detCuentaFlujo;
		this.fluEmpresa = fluEmpresa;
		this.fluCodigo = fluCodigo;
		this.ctaEmpresa = ctaEmpresa;
		this.ctaCodigo = ctaCodigo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public ConCuentasFlujoDetalleTO() {
	}

	public String getCtaCodigo() {
		return ctaCodigo;
	}

	public void setCtaCodigo(String ctaCodigo) {
		this.ctaCodigo = ctaCodigo;
	}

	public String getCtaEmpresa() {
		return ctaEmpresa;
	}

	public void setCtaEmpresa(String ctaEmpresa) {
		this.ctaEmpresa = ctaEmpresa;
	}

	public String getDetCuentaContable() {
		return detCuentaContable;
	}

	public void setDetCuentaContable(String detCuentaContable) {
		this.detCuentaContable = detCuentaContable;
	}

	public String getDetCuentaFlujo() {
		return detCuentaFlujo;
	}

	public void setDetCuentaFlujo(String detCuentaFlujo) {
		this.detCuentaFlujo = detCuentaFlujo;
	}

	public String getDetEmpresa() {
		return detEmpresa;
	}

	public void setDetEmpresa(String detEmpresa) {
		this.detEmpresa = detEmpresa;
	}

	public String getFluCodigo() {
		return fluCodigo;
	}

	public void setFluCodigo(String fluCodigo) {
		this.fluCodigo = fluCodigo;
	}

	public String getFluEmpresa() {
		return fluEmpresa;
	}

	public void setFluEmpresa(String fluEmpresa) {
		this.fluEmpresa = fluEmpresa;
	}

	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public String getUsrEmpresa() {
		return usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

	public String getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(String usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

	public String getDetalleContable() {
		return detalleContable;
	}

	public void setDetalleContable(String detalleContable) {
		this.detalleContable = detalleContable;
	}

	public String getDetalleFlujo() {
		return detalleFlujo;
	}

	public void setDetalleFlujo(String detalleFlujo) {
		this.detalleFlujo = detalleFlujo;
	}

	public char getDetDebitoCredito() {
		return detDebitoCredito;
	}

	public void setDetDebitoCredito(char detDebitoCredito) {
		this.detDebitoCredito = detDebitoCredito;
	}

}
