package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "rh_xiv_sueldo_periodo", schema = "recursoshumanos")
public class RhXivSueldoPeriodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "xiv_secuencial")
	private Integer xivSecuencial;
	@Column(name = "xiv_descripcion")
	private String xivDescripcion;
	@Column(name = "xiv_desde")
	@Temporal(TemporalType.DATE)
	private Date xivDesde;
	@Column(name = "xiv_hasta")
	@Temporal(TemporalType.DATE)
	private Date xivHasta;
	@Column(name = "xiv_fecha_maxima_pago")
	@Temporal(TemporalType.DATE)
	private Date xivFechaMaximaPago;

	public RhXivSueldoPeriodo() {
	}

	public RhXivSueldoPeriodo(Integer xivSecuencial) {
		this.xivSecuencial = xivSecuencial;
	}

	public Integer getXivSecuencial() {
		return xivSecuencial;
	}

	public void setXivSecuencial(Integer xivSecuencial) {
		this.xivSecuencial = xivSecuencial;
	}

	public String getXivDescripcion() {
		return xivDescripcion;
	}

	public void setXivDescripcion(String xivDescripcion) {
		this.xivDescripcion = xivDescripcion;
	}

	public Date getXivDesde() {
		return xivDesde;
	}

	public void setXivDesde(Date xivDesde) {
		this.xivDesde = xivDesde;
	}

	public Date getXivHasta() {
		return xivHasta;
	}

	public void setXivHasta(Date xivHasta) {
		this.xivHasta = xivHasta;
	}

	public Date getXivFechaMaximaPago() {
		return xivFechaMaximaPago;
	}

	public void setXivFechaMaximaPago(Date xivFechaMaximaPago) {
		this.xivFechaMaximaPago = xivFechaMaximaPago;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (xivSecuencial != null ? xivSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhXivSueldoPeriodo)) {
			return false;
		}
		RhXivSueldoPeriodo other = (RhXivSueldoPeriodo) object;
		if ((this.xivSecuencial == null && other.xivSecuencial != null)
				|| (this.xivSecuencial != null && !this.xivSecuencial.equals(other.xivSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhXivSueldoPeriodo[ xivSecuencial=" + xivSecuencial + " ]";
	}
}
