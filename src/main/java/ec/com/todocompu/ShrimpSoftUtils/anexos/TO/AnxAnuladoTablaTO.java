package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnxAnuladoTablaTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "anu_secuencial")
	private Integer anuSecuencial;
	@Column(name = "anu_comprobante_tipo")
	private String anuComprobanteTipo;
	@Column(name = "anu_comprobante_establecimiento")
	private String anuComprobanteEstablecimiento;

	@Column(name = "anu_comprobante_punto_emision")
	private String anuComprobantePuntoEmision;

	@Column(name = "anu_secuencial_inicio")
	private String anuSecuencialInicio;

	@Column(name = "anu_secuencial_fin")
	private String anuSecuencialFin;

	@Column(name = "anu_secuencial_inicial")
	private String anuSecuencialInicial;

	@Column(name = "anu_secuencial_final")
	private String anuSecuencialFinal;

	@Column(name = "anu_autorizacion")
	private String anuAutorizacion;

	@Column(name = "anu_fecha")
	private String anuFecha;

	@Column(name = "anu_comprobante_nombre")
	private String tcDescripcion;

	public AnxAnuladoTablaTO() {
	}

	public AnxAnuladoTablaTO(Integer anuSecuencial, String anuComprobanteTipo, String anuComprobanteEstablecimiento,
			String anuComprobantePuntoEmision, String anuSecuencialInicio, String anuSecuencialFin,
			String anuSecuencialInicial, String anuSecuencialFinal, String anuAutorizacion, String anuFecha,
			String tcDescripcion, Integer id) {
		this.anuSecuencial = anuSecuencial;
		this.anuComprobanteTipo = anuComprobanteTipo;
		this.anuComprobanteEstablecimiento = anuComprobanteEstablecimiento;
		this.anuComprobantePuntoEmision = anuComprobantePuntoEmision;
		this.anuSecuencialInicio = anuSecuencialInicio;
		this.anuSecuencialFin = anuSecuencialFin;
		this.anuSecuencialInicial = anuSecuencialInicial;
		this.anuSecuencialFinal = anuSecuencialFinal;
		this.anuAutorizacion = anuAutorizacion;
		this.anuFecha = anuFecha;
		this.tcDescripcion = tcDescripcion;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnuAutorizacion() {
		return anuAutorizacion;
	}

	public void setAnuAutorizacion(String anuAutorizacion) {
		this.anuAutorizacion = anuAutorizacion;
	}

	public String getAnuComprobanteEstablecimiento() {
		return anuComprobanteEstablecimiento;
	}

	public void setAnuComprobanteEstablecimiento(String anuComprobanteEstablecimiento) {
		this.anuComprobanteEstablecimiento = anuComprobanteEstablecimiento;
	}

	public String getAnuComprobantePuntoEmision() {
		return anuComprobantePuntoEmision;
	}

	public void setAnuComprobantePuntoEmision(String anuComprobantePuntoEmision) {
		this.anuComprobantePuntoEmision = anuComprobantePuntoEmision;
	}

	public String getAnuComprobanteTipo() {
		return anuComprobanteTipo;
	}

	public void setAnuComprobanteTipo(String anuComprobanteTipo) {
		this.anuComprobanteTipo = anuComprobanteTipo;
	}

	public String getAnuFecha() {
		return anuFecha;
	}

	public void setAnuFecha(String anuFecha) {
		this.anuFecha = anuFecha;
	}

	public Integer getAnuSecuencial() {
		return anuSecuencial;
	}

	public void setAnuSecuencial(Integer anuSecuencial) {
		this.anuSecuencial = anuSecuencial;
	}

	public String getAnuSecuencialFin() {
		return anuSecuencialFin;
	}

	public void setAnuSecuencialFin(String anuSecuencialFin) {
		this.anuSecuencialFin = anuSecuencialFin;
	}

	public String getAnuSecuencialFinal() {
		return anuSecuencialFinal;
	}

	public void setAnuSecuencialFinal(String anuSecuencialFinal) {
		this.anuSecuencialFinal = anuSecuencialFinal;
	}

	public String getAnuSecuencialInicial() {
		return anuSecuencialInicial;
	}

	public void setAnuSecuencialInicial(String anuSecuencialInicial) {
		this.anuSecuencialInicial = anuSecuencialInicial;
	}

	public String getAnuSecuencialInicio() {
		return anuSecuencialInicio;
	}

	public void setAnuSecuencialInicio(String anuSecuencialInicio) {
		this.anuSecuencialInicio = anuSecuencialInicio;
	}

	public String getTcDescripcion() {
		return tcDescripcion;
	}

	public void setTcDescripcion(String tcDescripcion) {
		this.tcDescripcion = tcDescripcion;
	}
}
