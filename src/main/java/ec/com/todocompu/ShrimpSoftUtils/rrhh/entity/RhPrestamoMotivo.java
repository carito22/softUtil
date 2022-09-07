package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConTipo;

@Entity
@Table(name = "rh_prestamo_motivo", schema = "recursoshumanos")
public class RhPrestamoMotivo implements Serializable {
	private static final long serialVersionUID = 1L;

	protected RhPrestamoMotivoPK rhPrestamoMotivoPK;
	private boolean motInactivo;
	private ConTipo conTipo;
	private String usrEmpresa;
	private String usrCodigo;
	private Timestamp usrFechaInserta;
	private List<RhEmpleadoDescuentosFijos> rhEmpleadoDescuentosFijosList;

	public RhPrestamoMotivo() {
	}

	public RhPrestamoMotivo(RhPrestamoMotivoPK rhPrestamoMotivoPK) {
		this.rhPrestamoMotivoPK = rhPrestamoMotivoPK;
	}

	public RhPrestamoMotivo(RhPrestamoMotivoPK rhPrestamoMotivoPK, boolean motInactivo, ConTipo conTipo,
			String usrEmpresa, String usrCodigo, Timestamp usrFechaInserta,
			List<RhEmpleadoDescuentosFijos> rhEmpleadoDescuentosFijosList) {
		this.rhPrestamoMotivoPK = rhPrestamoMotivoPK;
		this.motInactivo = motInactivo;
		this.conTipo = conTipo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
		this.rhEmpleadoDescuentosFijosList = rhEmpleadoDescuentosFijosList;
	}

	public RhPrestamoMotivo(String motEmpresa, String motDetalle) {
		this.rhPrestamoMotivoPK = new RhPrestamoMotivoPK(motEmpresa, motDetalle);
	}

	@EmbeddedId
	public RhPrestamoMotivoPK getRhPrestamoMotivoPK() {
		return rhPrestamoMotivoPK;
	}

	public void setRhPrestamoMotivoPK(RhPrestamoMotivoPK rhPrestamoMotivoPK) {
		this.rhPrestamoMotivoPK = rhPrestamoMotivoPK;
	}

	@Column(name = "mot_inactivo")
	public boolean getMotInactivo() {
		return motInactivo;
	}

	public void setMotInactivo(boolean motInactivo) {
		this.motInactivo = motInactivo;
	}

	@JoinColumns({ @JoinColumn(name = "tip_empresa", referencedColumnName = "tip_empresa"),
			@JoinColumn(name = "tip_codigo", referencedColumnName = "tip_codigo") })
	@ManyToOne(optional = false)
	public ConTipo getConTipo() {
		return conTipo;
	}

	public void setConTipo(ConTipo conTipo) {
		this.conTipo = conTipo;
	}

	@Column(name = "usr_empresa")
	public String getUsrEmpresa() {
		return usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

	@Column(name = "usr_codigo")
	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	public Timestamp getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(Timestamp usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "rhAnticipoMotivo")
	@JsonIgnore
	public List<RhEmpleadoDescuentosFijos> getRhEmpleadoDescuentosFijosList() {
		return rhEmpleadoDescuentosFijosList;
	}

	public void setRhEmpleadoDescuentosFijosList(List<RhEmpleadoDescuentosFijos> rhEmpleadoDescuentosFijosList) {
		this.rhEmpleadoDescuentosFijosList = rhEmpleadoDescuentosFijosList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (rhPrestamoMotivoPK != null ? rhPrestamoMotivoPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhPrestamoMotivo)) {
			return false;
		}
		RhPrestamoMotivo other = (RhPrestamoMotivo) object;
		if ((this.rhPrestamoMotivoPK == null && other.rhPrestamoMotivoPK != null)
				|| (this.rhPrestamoMotivoPK != null && !this.rhPrestamoMotivoPK.equals(other.rhPrestamoMotivoPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhPrestamoMotivo[ rhPrestamoMotivoPK=" + rhPrestamoMotivoPK + " ]";
	}
}
