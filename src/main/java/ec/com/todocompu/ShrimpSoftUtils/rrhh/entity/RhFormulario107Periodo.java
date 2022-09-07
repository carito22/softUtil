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
@Table(name = "rh_formulario_107_periodo", schema = "recursoshumanos")
public class RhFormulario107Periodo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "f107p_anio")
	private String f107pAnio;
	@Column(name = "f107p_fecha_desde")
	@Temporal(TemporalType.DATE)
	private Date f107pFechaDesde;
	@Column(name = "f107p_fecha_hasta")
	@Temporal(TemporalType.DATE)
	private Date f107pFechaHasta;
	@Column(name = "f107p_fecha_entrega")
	@Temporal(TemporalType.DATE)
	private Date f107pFechaEntrega;

	public RhFormulario107Periodo() {
	}

	public RhFormulario107Periodo(String f107pAnio) {
		this.f107pAnio = f107pAnio;
	}

	public String getF107pAnio() {
		return f107pAnio;
	}

	public void setF107pAnio(String f107pAnio) {
		this.f107pAnio = f107pAnio;
	}

	public Date getF107pFechaDesde() {
		return f107pFechaDesde;
	}

	public void setF107pFechaDesde(Date f107pFechaDesde) {
		this.f107pFechaDesde = f107pFechaDesde;
	}

	public Date getF107pFechaHasta() {
		return f107pFechaHasta;
	}

	public void setF107pFechaHasta(Date f107pFechaHasta) {
		this.f107pFechaHasta = f107pFechaHasta;
	}

	public Date getF107pFechaEntrega() {
		return f107pFechaEntrega;
	}

	public void setF107pFechaEntrega(Date f107pFechaEntrega) {
		this.f107pFechaEntrega = f107pFechaEntrega;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (f107pAnio != null ? f107pAnio.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof RhFormulario107Periodo)) {
			return false;
		}
		RhFormulario107Periodo other = (RhFormulario107Periodo) object;
		if ((this.f107pAnio == null && other.f107pAnio != null)
				|| (this.f107pAnio != null && !this.f107pAnio.equals(other.f107pAnio))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhFormulario107Periodo[ f107pAnio=" + f107pAnio + " ]";
	}
}
