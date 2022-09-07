package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "rh_impuesto_renta", schema = "recursoshumanos")
public class RhImpuestoRenta implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "rta_secuencial")
	private Integer rtaSecuencial;
	@Column(name = "rta_fraccion_basica")
	private BigDecimal rtaFraccionBasica;
	@Column(name = "rta_fraccion_excedente")
	private BigDecimal rtaFraccionExcedente;
	@Column(name = "rta_impuesto_fraccion_basica")
	private BigDecimal rtaImpuestoFraccionBasica;
	@Column(name = "rta_impuesto_fraccion_excedente")
	private BigDecimal rtaImpuestoFraccionExcedente;
	@Column(name = "rta_desde")
	@Temporal(TemporalType.DATE)
	private Date rtaDesde;
	@Column(name = "rta_hasta")
	@Temporal(TemporalType.DATE)
	private Date rtaHasta;

	public RhImpuestoRenta() {
	}

	public RhImpuestoRenta(Integer rtaSecuencial) {
		this.rtaSecuencial = rtaSecuencial;
	}

	public RhImpuestoRenta(Integer rtaSecuencial, BigDecimal rtaFraccionBasica, BigDecimal rtaFraccionExcedente,
			BigDecimal rtaImpuestoFraccionBasica, BigDecimal rtaImpuestoFraccionExcedente, Date rtaDesde,
			Date rtaHasta) {
		this.rtaSecuencial = rtaSecuencial;
		this.rtaFraccionBasica = rtaFraccionBasica;
		this.rtaFraccionExcedente = rtaFraccionExcedente;
		this.rtaImpuestoFraccionBasica = rtaImpuestoFraccionBasica;
		this.rtaImpuestoFraccionExcedente = rtaImpuestoFraccionExcedente;
		this.rtaDesde = rtaDesde;
		this.rtaHasta = rtaHasta;
	}

	public Integer getRtaSecuencial() {
		return rtaSecuencial;
	}

	public void setRtaSecuencial(Integer rtaSecuencial) {
		this.rtaSecuencial = rtaSecuencial;
	}

	public BigDecimal getRtaFraccionBasica() {
		return rtaFraccionBasica;
	}

	public void setRtaFraccionBasica(BigDecimal rtaFraccionBasica) {
		this.rtaFraccionBasica = rtaFraccionBasica;
	}

	public BigDecimal getRtaFraccionExcedente() {
		return rtaFraccionExcedente;
	}

	public void setRtaFraccionExcedente(BigDecimal rtaFraccionExcedente) {
		this.rtaFraccionExcedente = rtaFraccionExcedente;
	}

	public BigDecimal getRtaImpuestoFraccionBasica() {
		return rtaImpuestoFraccionBasica;
	}

	public void setRtaImpuestoFraccionBasica(BigDecimal rtaImpuestoFraccionBasica) {
		this.rtaImpuestoFraccionBasica = rtaImpuestoFraccionBasica;
	}

	public BigDecimal getRtaImpuestoFraccionExcedente() {
		return rtaImpuestoFraccionExcedente;
	}

	public void setRtaImpuestoFraccionExcedente(BigDecimal rtaImpuestoFraccionExcedente) {
		this.rtaImpuestoFraccionExcedente = rtaImpuestoFraccionExcedente;
	}

	public Date getRtaDesde() {
		return rtaDesde;
	}

	public void setRtaDesde(Date rtaDesde) {
		this.rtaDesde = rtaDesde;
	}

	public Date getRtaHasta() {
		return rtaHasta;
	}

	public void setRtaHasta(Date rtaHasta) {
		this.rtaHasta = rtaHasta;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (rtaSecuencial != null ? rtaSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhImpuestoRenta)) {
			return false;
		}
		RhImpuestoRenta other = (RhImpuestoRenta) object;
		if ((this.rtaSecuencial == null && other.rtaSecuencial != null)
				|| (this.rtaSecuencial != null && !this.rtaSecuencial.equals(other.rtaSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhImpuestoRenta[ rtaSecuencial=" + rtaSecuencial + " ]";
	}
}
