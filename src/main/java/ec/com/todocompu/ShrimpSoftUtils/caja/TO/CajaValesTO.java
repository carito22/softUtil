package ec.com.todocompu.ShrimpSoftUtils.caja.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CajaValesTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "vale_periodo")
	private String valePeriodo;
	@Column(name = "vale_motivo")
	private String valeMotivo;
	@Column(name = "vale_numero")
	private String valeNumero;
	@Column(name = "vale_fecha")
	private String valeFecha;
	@Column(name = "vale_valor")
	private BigDecimal valeValor;
	@Column(name = "vale_concepto")
	private String valeConcepto;
	@Column(name = "vale_beneficiario")
	private String valeBeneficiario;
	@Column(name = "vale_observaciones")
	private String valeObservaciones;
	@Column(name = "vae_usuario")
	private String vaeUsuario;
	@Column(name = "usr_fecha_inserta")
	private String usrFechaInserta;
	@Column(name = "vale_anulado")
	private Boolean valeAnulado;
	@Id
	private int id;

	public CajaValesTO() {
	}

	public CajaValesTO(String valePeriodo, String valeMotivo, String valeNumero, String valeFecha, BigDecimal valeValor,
			String valeConcepto, String valeBeneficiario, String valeObservaciones, String vaeUsuario,
			String usrFechaInserta, Boolean valeAnulado, int id) {
		this.valePeriodo = valePeriodo;
		this.valeMotivo = valeMotivo;
		this.valeNumero = valeNumero;
		this.valeFecha = valeFecha;
		this.valeValor = valeValor;
		this.valeConcepto = valeConcepto;
		this.valeBeneficiario = valeBeneficiario;
		this.valeObservaciones = valeObservaciones;
		this.vaeUsuario = vaeUsuario;
		this.usrFechaInserta = usrFechaInserta;
		this.valeAnulado = valeAnulado;
		this.id = id;
	}

	public String getValePeriodo() {
		return valePeriodo;
	}

	public void setValePeriodo(String valePeriodo) {
		this.valePeriodo = valePeriodo;
	}

	public String getValeMotivo() {
		return valeMotivo;
	}

	public void setValeMotivo(String valeMotivo) {
		this.valeMotivo = valeMotivo;
	}

	public String getValeNumero() {
		return valeNumero;
	}

	public void setValeNumero(String valeNumero) {
		this.valeNumero = valeNumero;
	}

	public String getValeFecha() {
		return valeFecha;
	}

	public void setValeFecha(String valeFecha) {
		this.valeFecha = valeFecha;
	}

	public BigDecimal getValeValor() {
		return valeValor;
	}

	public void setValeValor(BigDecimal valeValor) {
		this.valeValor = valeValor;
	}

	public String getValeConcepto() {
		return valeConcepto;
	}

	public void setValeConcepto(String valeConcepto) {
		this.valeConcepto = valeConcepto;
	}

	public String getValeBeneficiario() {
		return valeBeneficiario;
	}

	public void setValeBeneficiario(String valeBeneficiario) {
		this.valeBeneficiario = valeBeneficiario;
	}

	public String getValeObservaciones() {
		return valeObservaciones;
	}

	public void setValeObservaciones(String valeObservaciones) {
		this.valeObservaciones = valeObservaciones;
	}

	public String getVaeUsuario() {
		return vaeUsuario;
	}

	public void setVaeUsuario(String vaeUsuario) {
		this.vaeUsuario = vaeUsuario;
	}

	public String getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(String usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

	public Boolean getValeAnulado() {
		return valeAnulado;
	}

	public void setValeAnulado(Boolean valeAnulado) {
		this.valeAnulado = valeAnulado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
