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
public class InvConsumosImpExpTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cons_empresa")
	private String consEmpresa;

	@Column(name = "cons_periodo")
	private String consPeriodo;

	@Column(name = "cons_motivo")
	private String consMotivo;

	@Column(name = "cons_numero")
	private String consNumero;

	@Column(name = "cons_referencia")
	private String consReferencia;

	@Column(name = "cons_fecha")
	private String consFecha;

	@Column(name = "cons_observaciones")
	private String consObservaciones;

	@Column(name = "cons_pendiente")
	private Boolean consPendiente;

	@Column(name = "cons_revisado")
	private Boolean consRevisado;

	@Column(name = "cons_anulado")
	private Boolean consAnulado;

	@Column(name = "con_empresa")
	private String conEmpresa;

	@Column(name = "con_periodo")
	private String conPeriodo;

	@Column(name = "con_tipo")
	private String conTipo;

	@Column(name = "con_numero")
	private String conNumero;

	@Column(name = "usr_empresa")
	private String usrEmpresa;

	@Column(name = "usr_codigo")
	private String usrCodigo;

	@Column(name = "usr_fecha_inserta")
	private String usrFechaInserta;

	public InvConsumosImpExpTO() {
	}

	public InvConsumosImpExpTO(String consEmpresa, String consPeriodo, String consMotivo, String consNumero,
			String consReferencia, String consFecha, String consObservaciones, Boolean consPendiente,
			Boolean consRevisado, Boolean consAnulado, String conEmpresa, String conPeriodo, String conTipo,
			String conNumero, String usrEmpresa, String usrCodigo, String usrFechaInserta) {
		this.consEmpresa = consEmpresa;
		this.consPeriodo = consPeriodo;
		this.consMotivo = consMotivo;
		this.consNumero = consNumero;
		this.consReferencia = consReferencia;
		this.consFecha = consFecha;
		this.consObservaciones = consObservaciones;
		this.consPendiente = consPendiente;
		this.consRevisado = consRevisado;
		this.consAnulado = consAnulado;
		this.conEmpresa = conEmpresa;
		this.conPeriodo = conPeriodo;
		this.conTipo = conTipo;
		this.conNumero = conNumero;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
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

	public Boolean getConsAnulado() {
		return consAnulado;
	}

	public void setConsAnulado(Boolean consAnulado) {
		this.consAnulado = consAnulado;
	}

	public String getConsEmpresa() {
		return consEmpresa;
	}

	public void setConsEmpresa(String consEmpresa) {
		this.consEmpresa = consEmpresa;
	}

	public String getConsFecha() {
		return consFecha;
	}

	public void setConsFecha(String consFecha) {
		this.consFecha = consFecha;
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

	public String getConsObservaciones() {
		return consObservaciones;
	}

	public void setConsObservaciones(String consObservaciones) {
		this.consObservaciones = consObservaciones;
	}

	public Boolean getConsPendiente() {
		return consPendiente;
	}

	public void setConsPendiente(Boolean consPendiente) {
		this.consPendiente = consPendiente;
	}

	public String getConsPeriodo() {
		return consPeriodo;
	}

	public void setConsPeriodo(String consPeriodo) {
		this.consPeriodo = consPeriodo;
	}

	public String getConsReferencia() {
		return consReferencia;
	}

	public void setConsReferencia(String consReferencia) {
		this.consReferencia = consReferencia;
	}

	public Boolean getConsRevisado() {
		return consRevisado;
	}

	public void setConsRevisado(Boolean consRevisado) {
		this.consRevisado = consRevisado;
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

}
