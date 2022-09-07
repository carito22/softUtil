package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContablePK;

@Entity
public class ListaConContableTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String empCodigo;
	private String perCodigo;
	private String tipCodigo;
	private String conNumero;
	private String conFecha;
	private String conPendiente;
	private String conAnulado;
	private String conReversado;
	private String conBloqueado;
	private String conConcepto;
	private String conDetalle;
	private String conObservaciones;
	private String conReferencia;

	public ListaConContableTO() {
	}

	public ListaConContableTO(String id, String empCodigo, String perCodigo, String tipCodigo, String conNumero,
			String conFecha, String conPendiente, String conAnulado, String conBloqueado, String conConcepto,
			String conDetalle, String conObservaciones) {
		this.id = id;
		this.empCodigo = empCodigo;
		this.perCodigo = perCodigo;
		this.tipCodigo = tipCodigo;
		this.conNumero = conNumero;
		this.conFecha = conFecha;
		this.conPendiente = conPendiente;
		this.conAnulado = conAnulado;
		this.conBloqueado = conBloqueado;
		this.conConcepto = conConcepto;
		this.conDetalle = conDetalle;
		this.conObservaciones = conObservaciones;
	}

	public ListaConContableTO(String id, String empCodigo, String perCodigo, String tipCodigo, String conNumero,
			String conFecha, String conPendiente, String conAnulado, String conReversado, String conBloqueado,
			String conConcepto, String conDetalle, String conObservaciones, String conReferencia) {
		this.id = id;
		this.empCodigo = empCodigo;
		this.perCodigo = perCodigo;
		this.tipCodigo = tipCodigo;
		this.conNumero = conNumero;
		this.conFecha = conFecha;
		this.conPendiente = conPendiente;
		this.conAnulado = conAnulado;
		this.conReversado = conReversado;
		this.conBloqueado = conBloqueado;
		this.conConcepto = conConcepto;
		this.conDetalle = conDetalle;
		this.conObservaciones = conObservaciones;
		this.conReferencia = conReferencia;
	}

	@Id
	@Column(name = "con_id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "con_empresa")
	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	@Column(name = "con_periodo")
	public String getPerCodigo() {
		return perCodigo;
	}

	public void setPerCodigo(String perCodigo) {
		this.perCodigo = perCodigo;
	}

	@Column(name = "con_tipo")
	public String getTipCodigo() {
		return tipCodigo;
	}

	public void setTipCodigo(String tipCodigo) {
		this.tipCodigo = tipCodigo;
	}

	@Column(name = "con_numero")
	public String getConNumero() {
		return conNumero;
	}

	public void setConNumero(String conNumero) {
		this.conNumero = conNumero;
	}

	@Column(name = "con_fecha")
	public String getConFecha() {
		return conFecha;
	}

	public void setConFecha(String conFecha) {
		this.conFecha = conFecha;
	}

	@Column(name = "con_pendiente")
	public String getConPendiente() {
		return conPendiente;
	}

	public void setConPendiente(String conPendiente) {
		this.conPendiente = conPendiente;
	}

	@Column(name = "con_anulado")
	public String getConAnulado() {
		return conAnulado;
	}

	public void setConAnulado(String conAnulado) {
		this.conAnulado = conAnulado;
	}

	@Column(name = "con_reversado")
	public String getConReversado() {
		return conReversado;
	}

	public void setConReversado(String conReversado) {
		this.conReversado = conReversado;
	}

	@Column(name = "con_bloqueado")
	public String getConBloqueado() {
		return conBloqueado;
	}

	public void setConBloqueado(String conBloqueado) {
		this.conBloqueado = conBloqueado;
	}

	@Column(name = "con_concepto")
	public String getConConcepto() {
		return conConcepto;
	}

	public void setConConcepto(String conConcepto) {
		this.conConcepto = conConcepto;
	}

	@Column(name = "con_detalle")
	public String getConDetalle() {
		return conDetalle;
	}

	public void setConDetalle(String conDetalle) {
		this.conDetalle = conDetalle;
	}

	@Column(name = "con_observaciones")
	public String getConObservaciones() {
		return conObservaciones;
	}

	public void setConObservaciones(String conObservaciones) {
		this.conObservaciones = conObservaciones;
	}

	@Column(name = "con_referencia")
	public String getConReferencia() {
		return conReferencia;
	}

	public void setConReferencia(String conReferencia) {
		this.conReferencia = conReferencia;
	}

	public ConContablePK toConContablePK() {
		return new ConContablePK(empCodigo, perCodigo, tipCodigo, conNumero);
	}

	@Override
	public String toString() {
		return "[Empresa=" + empCodigo + ", Periodo=" + perCodigo + ", Tipo=" + tipCodigo + ", Numero=" + conNumero
				+ "]";
	}

}
