package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvComprasRecepcionTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "recep_secuencial")
	private Long recep_secuencial;
	@Column(name = "recep_fecha")
	private String recepFecha;
	@Column(name = "comp_empresa")
	private String compEmpresa;
	@Column(name = "comp_periodo")
	private String compPeriodo;
	@Column(name = "comp_motivo")
	private String compMotivo;
	@Column(name = "comp_numero")
	private String compNumero;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta")
	private String usrFechaInserta;

	public InvComprasRecepcionTO() {
	}

	public InvComprasRecepcionTO(Long recep_secuencial, String recepFecha, String compEmpresa, String compPeriodo,
			String compMotivo, String compNumero, String usrEmpresa, String usrCodigo, String usrFechaInserta) {
		this.recep_secuencial = recep_secuencial;
		this.recepFecha = recepFecha;
		this.compEmpresa = compEmpresa;
		this.compPeriodo = compPeriodo;
		this.compMotivo = compMotivo;
		this.compNumero = compNumero;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public InvComprasRecepcionTO(String recepEmpresa, String recepPeriodo, String recepMotivo, String recepNumero,
			String recepFecha, String compEmpresa, String compPeriodo, String compMotivo, String compNumero,
			String usrEmpresa, String usrCodigo, String usrFechaInserta) {
		this.recepFecha = recepFecha;
		this.compEmpresa = compEmpresa;
		this.compPeriodo = compPeriodo;
		this.compMotivo = compMotivo;
		this.compNumero = compNumero;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public Long getRecep_secuencial() {
		return recep_secuencial;
	}

	public void setRecep_secuencial(Long recep_secuencial) {
		this.recep_secuencial = recep_secuencial;
	}

	public String getCompEmpresa() {
		return compEmpresa;
	}

	public void setCompEmpresa(String compEmpresa) {
		this.compEmpresa = compEmpresa;
	}

	public String getCompMotivo() {
		return compMotivo;
	}

	public void setCompMotivo(String compMotivo) {
		this.compMotivo = compMotivo;
	}

	public String getCompNumero() {
		return compNumero;
	}

	public void setCompNumero(String compNumero) {
		this.compNumero = compNumero;
	}

	public String getCompPeriodo() {
		return compPeriodo;
	}

	public void setCompPeriodo(String compPeriodo) {
		this.compPeriodo = compPeriodo;
	}

	public String getRecepFecha() {
		return recepFecha;
	}

	public void setRecepFecha(String recepFecha) {
		this.recepFecha = recepFecha;
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

	@Override
	public String toString() {
		return this.recepFecha + " " + this.compEmpresa + " " + this.compPeriodo + " " + this.compMotivo + " "
				+ this.compNumero + " " + this.usrEmpresa + " " + this.usrCodigo + " " + this.usrFechaInserta;
	}
}
