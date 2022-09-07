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
@Table(name = "rh_xiii_sueldo_periodo", schema = "recursoshumanos")
public class RhXiiiSueldoPeriodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "xiii_secuencial")
	private Integer xiiiSecuencial;
	@Column(name = "xiii_descripcion")
	private String xiiiDescripcion;
	@Column(name = "xiii_desde")
	@Temporal(TemporalType.DATE)
	private Date xiiiDesde;
	@Column(name = "xiii_hasta")
	@Temporal(TemporalType.DATE)
	private Date xiiiHasta;
	@Column(name = "xiii_fecha_maxima_pago")
	@Temporal(TemporalType.DATE)
	private Date xiiiFechaMaximaPago;

	public RhXiiiSueldoPeriodo() {
	}

	public RhXiiiSueldoPeriodo(Integer xiiiSecuencial) {
		this.xiiiSecuencial = xiiiSecuencial;
	}

	public Integer getXiiiSecuencial() {
		return xiiiSecuencial;
	}

	public void setXiiiSecuencial(Integer xiiiSecuencial) {
		this.xiiiSecuencial = xiiiSecuencial;
	}

	public String getXiiiDescripcion() {
		return xiiiDescripcion;
	}

	public void setXiiiDescripcion(String xiiiDescripcion) {
		this.xiiiDescripcion = xiiiDescripcion;
	}

	public Date getXiiiDesde() {
		return xiiiDesde;
	}

	public void setXiiiDesde(Date xiiiDesde) {
		this.xiiiDesde = xiiiDesde;
	}

	public Date getXiiiHasta() {
		return xiiiHasta;
	}

	public void setXiiiHasta(Date xiiiHasta) {
		this.xiiiHasta = xiiiHasta;
	}

	public Date getXiiiFechaMaximaPago() {
		return xiiiFechaMaximaPago;
	}

	public void setXiiiFechaMaximaPago(Date xiiiFechaMaximaPago) {
		this.xiiiFechaMaximaPago = xiiiFechaMaximaPago;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (xiiiSecuencial != null ? xiiiSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhXiiiSueldoPeriodo)) {
			return false;
		}
		RhXiiiSueldoPeriodo other = (RhXiiiSueldoPeriodo) object;
		if ((this.xiiiSecuencial == null && other.xiiiSecuencial != null)
				|| (this.xiiiSecuencial != null && !this.xiiiSecuencial.equals(other.xiiiSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhXiiiSueldoPeriodo[ xiiiSecuencial=" + xiiiSecuencial + " ]";
	}
}
