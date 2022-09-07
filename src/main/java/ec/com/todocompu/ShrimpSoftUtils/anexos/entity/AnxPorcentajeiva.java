package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

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
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "anx_porcentajeiva", schema = "anexo")
@XmlRootElement
public class AnxPorcentajeiva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "pi_codigo")
	private String piCodigo;
	@Column(name = "pi_porcentaje")
	private BigDecimal piPorcentaje;
	@Column(name = "pi_monto_maximo_consumidor_final")
	private BigDecimal piMontoMaximoConsumidorFinal;
	@Column(name = "pi_fecha_inicio")
	@Temporal(TemporalType.DATE)
	private Date piFechaInicio;
	@Column(name = "pi_fecha_fin")
	@Temporal(TemporalType.DATE)
	private Date piFechaFin;

	public AnxPorcentajeiva() {
	}

	public AnxPorcentajeiva(String piCodigo) {
		this.piCodigo = piCodigo;
	}

	public AnxPorcentajeiva(String piCodigo, BigDecimal piPorcentaje, BigDecimal piMontoMaximoConsumidorFinal,
			Date piFechaInicio) {
		this.piCodigo = piCodigo;
		this.piPorcentaje = piPorcentaje;
		this.piMontoMaximoConsumidorFinal = piMontoMaximoConsumidorFinal;
		this.piFechaInicio = piFechaInicio;
	}

	public String getPiCodigo() {
		return piCodigo;
	}

	public void setPiCodigo(String piCodigo) {
		this.piCodigo = piCodigo;
	}

	public BigDecimal getPiPorcentaje() {
		return piPorcentaje;
	}

	public void setPiPorcentaje(BigDecimal piPorcentaje) {
		this.piPorcentaje = piPorcentaje;
	}

	public BigDecimal getPiMontoMaximoConsumidorFinal() {
		return piMontoMaximoConsumidorFinal;
	}

	public void setPiMontoMaximoConsumidorFinal(BigDecimal piMontoMaximoConsumidorFinal) {
		this.piMontoMaximoConsumidorFinal = piMontoMaximoConsumidorFinal;
	}

	public Date getPiFechaInicio() {
		return piFechaInicio;
	}

	public void setPiFechaInicio(Date piFechaInicio) {
		this.piFechaInicio = piFechaInicio;
	}

	public Date getPiFechaFin() {
		return piFechaFin;
	}

	public void setPiFechaFin(Date piFechaFin) {
		this.piFechaFin = piFechaFin;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (piCodigo != null ? piCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxPorcentajeiva)) {
			return false;
		}
		AnxPorcentajeiva other = (AnxPorcentajeiva) object;
		if ((this.piCodigo == null && other.piCodigo != null)
				|| (this.piCodigo != null && !this.piCodigo.equals(other.piCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxPorcentajeiva[ piCodigo=" + piCodigo + " ]";
	}

}
