package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnxListaComprobanteAnuladoTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
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
	@Column(name = "anu_autorizacion")
	private String anuAutorizacion;

	public AnxListaComprobanteAnuladoTO() {
	}

	public AnxListaComprobanteAnuladoTO(String anuComprobanteTipo, String anuComprobanteEstablecimiento,
			String anuComprobantePuntoEmision, String anuSecuencialInicio, String anuSecuencialFin,
			String anuAutorizacion, Integer id) {
		this.anuComprobanteTipo = anuComprobanteTipo;
		this.anuComprobanteEstablecimiento = anuComprobanteEstablecimiento;
		this.anuComprobantePuntoEmision = anuComprobantePuntoEmision;
		this.anuSecuencialInicio = anuSecuencialInicio;
		this.anuSecuencialFin = anuSecuencialFin;
		this.anuAutorizacion = anuAutorizacion;
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

	public String getAnuSecuencialFin() {
		return anuSecuencialFin;
	}

	public void setAnuSecuencialFin(String anuSecuencialFin) {
		this.anuSecuencialFin = anuSecuencialFin;
	}

	public String getAnuSecuencialInicio() {
		return anuSecuencialInicio;
	}

	public void setAnuSecuencialInicio(String anuSecuencialInicio) {
		this.anuSecuencialInicio = anuSecuencialInicio;
	}
}
