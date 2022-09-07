package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ConContableTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "con_numero")
	private String conNumero;
	@Column(name = "con_empresa")
	private String empCodigo;
	@Column(name = "con_periodo")
	private String perCodigo;
	@Column(name = "con_tipo")
	private String tipCodigo;
	@Column(name = "con_fecha")
	private String conFecha;
	@Column(name = "con_pendiente")
	private Boolean conPendiente;
	@Column(name = "con_bloqueado")
	private Boolean conBloqueado;
	@Column(name = "con_anulado")
	private Boolean conAnulado;
	@Column(name = "con_reversado")
	private Boolean conReversado;
	@Column(name = "con_generado")
	private Boolean conGenerado;
	@Column(name = "con_concepto")
	private String conConcepto;
	@Column(name = "con_detalle")
	private String conDetalle;
	@Column(name = "con_observaciones")
	private String conObservaciones;
	@Column(name = "usr_codigo")
	private String usrInsertaContable;
	@Column(name = "usr_fecha_inserta")
	private String usrFechaInsertaContable;

	@Column(name = "con_codigo")
	private String conCodigo;

	@Column(name = "con_referencia")
	private String conReferencia;

	public ConContableTO() {
	}

	public ConContableTO(String conNumero, String empCodigo, String perCodigo, String tipCodigo, String conFecha,
			Boolean conPendiente, Boolean conBloqueado, Boolean conAnulado, Boolean conReversado, Boolean conGenerado,
			String conConcepto, String conDetalle, String conObservaciones, String usrInsertaContable,
			String usrFechaInsertaContable, String conCodigo, String conReferencia) {

		this.conNumero = conNumero;
		this.empCodigo = empCodigo;
		this.perCodigo = perCodigo;
		this.tipCodigo = tipCodigo;
		this.conFecha = conFecha;
		this.conPendiente = conPendiente;
		this.conBloqueado = conBloqueado;
		this.conAnulado = conAnulado;
		this.conReversado = conReversado;
		this.conGenerado = conGenerado;
		this.conConcepto = conConcepto;
		this.conDetalle = conDetalle;
		this.conObservaciones = conObservaciones;
		this.usrInsertaContable = usrInsertaContable;
		this.usrFechaInsertaContable = usrFechaInsertaContable;
		this.conCodigo = conCodigo;
		this.conReferencia = conReferencia;
	}

	public String getConCodigo() {
		return conCodigo;
	}

	public void setConCodigo(String conCodigo) {
		this.conCodigo = conCodigo;
	}

	public String getConReferencia() {
		return conReferencia;
	}

	public void setConReferencia(String conReferencia) {
		this.conReferencia = conReferencia;
	}

	public Boolean getConAnulado() {
		return conAnulado;
	}

	public void setConAnulado(Boolean conAnulado) {
		this.conAnulado = conAnulado;
	}

	public Boolean getConBloqueado() {
		return conBloqueado;
	}

	public void setConBloqueado(Boolean conBloqueado) {
		this.conBloqueado = conBloqueado;
	}

	public String getConConcepto() {
		return conConcepto;
	}

	public void setConConcepto(String conConcepto) {
		this.conConcepto = conConcepto;
	}

	public String getConDetalle() {
		return conDetalle;
	}

	public void setConDetalle(String conDetalle) {
		this.conDetalle = conDetalle;
	}

	public String getConFecha() {
		return conFecha;
	}

	public void setConFecha(String conFecha) {
		this.conFecha = conFecha;
	}

	public Boolean getConGenerado() {
		return conGenerado;
	}

	public void setConGenerado(Boolean conGenerado) {
		this.conGenerado = conGenerado;
	}

	public String getConNumero() {
		return conNumero;
	}

	public void setConNumero(String conNumero) {
		this.conNumero = conNumero;
	}

	public String getConObservaciones() {
		return conObservaciones;
	}

	public void setConObservaciones(String conObservaciones) {
		this.conObservaciones = conObservaciones;
	}

	public Boolean getConPendiente() {
		return conPendiente;
	}

	public void setConPendiente(Boolean conPendiente) {
		this.conPendiente = conPendiente;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getPerCodigo() {
		return perCodigo;
	}

	public void setPerCodigo(String perCodigo) {
		this.perCodigo = perCodigo;
	}

	public String getTipCodigo() {
		return tipCodigo;
	}

	public void setTipCodigo(String tipCodigo) {
		this.tipCodigo = tipCodigo;
	}

	public String getUsrFechaInsertaContable() {
		return usrFechaInsertaContable;
	}

	public void setUsrFechaInsertaContable(String usrFechaInsertaContable) {
		this.usrFechaInsertaContable = usrFechaInsertaContable;
	}

	public String getUsrInsertaContable() {
		return usrInsertaContable;
	}

	public void setUsrInsertaContable(String usrInsertaContable) {
		this.usrInsertaContable = usrInsertaContable;
	}

	public Boolean getConReversado() {
		return conReversado;
	}

	public void setConReversado(Boolean conReversado) {
		this.conReversado = conReversado;
	}

	@Override
	public String toString() {
		return this.empCodigo + " " + this.perCodigo + " " + this.tipCodigo + " " + this.conNumero + " " + this.conFecha
				+ " " + this.conPendiente + " " + this.conBloqueado + " " + this.conAnulado + " " + this.conGenerado
				+ " " + this.conConcepto + " " + this.conDetalle + " " + this.conObservaciones + " "
				+ this.usrInsertaContable + " " + this.usrFechaInsertaContable;
	}
}
