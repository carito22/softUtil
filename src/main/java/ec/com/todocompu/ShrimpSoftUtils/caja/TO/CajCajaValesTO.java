package ec.com.todocompu.ShrimpSoftUtils.caja.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CajCajaValesTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id	
	private Integer id;
	
	@Column(name = "vale_empresa")
	private String valeEmpresa;

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

	@Column(name = "conc_empresa")
	private String concEmpresa;

	@Column(name = "conc_codigo")
	private String concCodigo;

	@Column(name = "usr_empresa")
	private String usrEmpresa;

	@Column(name = "vae_usuario")
	private String vaeUsuario;

	@Column(name = "usr_fecha_inserta")
	private String usrFechaInserta;
	
	@Column(name = "vale_anulado")
	private Boolean valeAnulado;

	public CajCajaValesTO() {
	}

	public CajCajaValesTO(String valeEmpresa, String valePeriodo, String valeMotivo, String valeNumero,
			String valeFecha, BigDecimal valeValor, String valeConcepto, String valeBeneficiario, String valeObservaciones,
			Boolean valeAnulado, String usrEmpresa, String vaeUsuario, String usrFechaInserta, String concEmpresa,
			String concCodigo, Integer id) {
		this.valeEmpresa = valeEmpresa;
		this.valePeriodo = valePeriodo;
		this.valeMotivo = valeMotivo;
		this.valeNumero = valeNumero;
		this.valeFecha = valeFecha;
		this.valeValor = valeValor;
		this.valeConcepto = valeConcepto;
		this.valeBeneficiario = valeBeneficiario;
		this.valeObservaciones = valeObservaciones;
		this.valeAnulado = valeAnulado;
		this.usrEmpresa = usrEmpresa;
		this.vaeUsuario = vaeUsuario;
		this.usrFechaInserta = usrFechaInserta;
		this.concEmpresa = concEmpresa;
		this.concCodigo = concCodigo;
		this.id = id;
	}

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	
	public String getVaeUsuario() {
		return vaeUsuario;
	}

	public void setVaeUsuario(String vaeUsuario) {
		this.vaeUsuario = vaeUsuario;
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

	public Boolean getValeAnulado() {
		return valeAnulado;
	}

	public void setValeAnulado(Boolean valeAnulado) {
		this.valeAnulado = valeAnulado;
	}

	public String getValeBeneficiario() {
		return valeBeneficiario;
	}

	public void setValeBeneficiario(String valeBeneficiario) {
		this.valeBeneficiario = valeBeneficiario;
	}

	public String getValeEmpresa() {
		return valeEmpresa;
	}

	public void setValeEmpresa(String valeEmpresa) {
		this.valeEmpresa = valeEmpresa;
	}

	public String getValeFecha() {
		return valeFecha;
	}

	public void setValeFecha(String valeFecha) {
		this.valeFecha = valeFecha;
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

	public String getValeObservaciones() {
		return valeObservaciones;
	}

	public void setValeObservaciones(String valeObservaciones) {
		this.valeObservaciones = valeObservaciones;
	}

	public String getValePeriodo() {
		return valePeriodo;
	}

	public void setValePeriodo(String valePeriodo) {
		this.valePeriodo = valePeriodo;
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

	public String getConcCodigo() {
		return concCodigo;
	}

	public void setConcCodigo(String concCodigo) {
		this.concCodigo = concCodigo;
	}

	public String getConcEmpresa() {
		return concEmpresa;
	}

	public void setConcEmpresa(String concEmpresa) {
		this.concEmpresa = concEmpresa;
	}

}
