package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "rh_utilidades_periodo", schema = "recursoshumanos")
public class RhUtilidadesPeriodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected RhUtilidadesPeriodoPK rhUtilidadesPeriodoPK;
	@Column(name = "uti_desde")
	@Temporal(TemporalType.DATE)
	private Date utiDesde;
	@Column(name = "uti_hasta")
	@Temporal(TemporalType.DATE)
	private Date utiHasta;
	@Column(name = "uti_fecha_maxima_pago")
	@Temporal(TemporalType.DATE)
	private Date utiFechaMaximaPago;
	@Column(name = "uti_total_dias")
	private Long utiTotalDias;
	@Column(name = "uti_total_cargas")
	private Long utiTotalCargas;
	@Column(name = "uti_total_pagar")
	private BigDecimal utiTotalPagar;

	public RhUtilidadesPeriodo() {
	}

	public RhUtilidadesPeriodo(RhUtilidadesPeriodoPK rhUtilidadesPeriodoPK) {
		this.rhUtilidadesPeriodoPK = rhUtilidadesPeriodoPK;
	}

	public RhUtilidadesPeriodo(String utiEmpresa, String utiDescripcion) {
		this.rhUtilidadesPeriodoPK = new RhUtilidadesPeriodoPK(utiEmpresa, utiDescripcion);
	}

	public RhUtilidadesPeriodoPK getRhUtilidadesPeriodoPK() {
		return rhUtilidadesPeriodoPK;
	}

	public void setRhUtilidadesPeriodoPK(RhUtilidadesPeriodoPK rhUtilidadesPeriodoPK) {
		this.rhUtilidadesPeriodoPK = rhUtilidadesPeriodoPK;
	}

	public Date getUtiDesde() {
		return utiDesde;
	}

	public void setUtiDesde(Date utiDesde) {
		this.utiDesde = utiDesde;
	}

	public Date getUtiHasta() {
		return utiHasta;
	}

	public void setUtiHasta(Date utiHasta) {
		this.utiHasta = utiHasta;
	}

	public Date getUtiFechaMaximaPago() {
		return utiFechaMaximaPago;
	}

	public void setUtiFechaMaximaPago(Date utiFechaMaximaPago) {
		this.utiFechaMaximaPago = utiFechaMaximaPago;
	}

	public Long getUtiTotalDias() {
		return utiTotalDias;
	}

	public void setUtiTotalDias(Long utiTotalDias) {
		this.utiTotalDias = utiTotalDias;
	}

	public Long getUtiTotalCargas() {
		return utiTotalCargas;
	}

	public void setUtiTotalCargas(Long utiTotalCargas) {
		this.utiTotalCargas = utiTotalCargas;
	}

	public BigDecimal getUtiTotalPagar() {
		return utiTotalPagar;
	}

	public void setUtiTotalPagar(BigDecimal utiTotalPagar) {
		this.utiTotalPagar = utiTotalPagar;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (rhUtilidadesPeriodoPK != null ? rhUtilidadesPeriodoPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhUtilidadesPeriodo)) {
			return false;
		}
		RhUtilidadesPeriodo other = (RhUtilidadesPeriodo) object;
		if ((this.rhUtilidadesPeriodoPK == null && other.rhUtilidadesPeriodoPK != null)
				|| (this.rhUtilidadesPeriodoPK != null
						&& !this.rhUtilidadesPeriodoPK.equals(other.rhUtilidadesPeriodoPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhUtilidadesPeriodo[ rhUtilidadesPeriodoPK=" + rhUtilidadesPeriodoPK + " ]";
	}
}
