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
@Table(name = "rh_anticipo_motivo", schema = "recursoshumanos")
public class RhAnticipoMotivo implements Serializable {
	private static final long serialVersionUID = 1L;

	protected RhAnticipoMotivoPK rhAnticipoMotivoPK;
	private boolean motInactivo;
	private ConTipo conTipo;
	private String usrEmpresa;
	private String usrCodigo;
	private Timestamp usrFechaInserta;
	private List<RhEmpleadoDescuentosFijos> rhEmpleadoDescuentosFijosList;

	public RhAnticipoMotivo() {
	}

	public RhAnticipoMotivo(RhAnticipoMotivoPK rhAnticipoMotivoPK) {
		this.rhAnticipoMotivoPK = rhAnticipoMotivoPK;
	}

	public RhAnticipoMotivo(RhAnticipoMotivoPK rhAnticipoMotivoPK, boolean motInactivo, ConTipo conTipo,
			String usrEmpresa, String usrCodigo, Timestamp usrFechaInserta,
			List<RhEmpleadoDescuentosFijos> rhEmpleadoDescuentosFijosList) {
		this.rhAnticipoMotivoPK = rhAnticipoMotivoPK;
		this.motInactivo = motInactivo;
		this.conTipo = conTipo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
		this.rhEmpleadoDescuentosFijosList = rhEmpleadoDescuentosFijosList;
	}

	public RhAnticipoMotivo(String motEmpresa, String motDetalle) {
		this.rhAnticipoMotivoPK = new RhAnticipoMotivoPK(motEmpresa, motDetalle);
	}

	@EmbeddedId
	public RhAnticipoMotivoPK getRhAnticipoMotivoPK() {
		return rhAnticipoMotivoPK;
	}

	public void setRhAnticipoMotivoPK(RhAnticipoMotivoPK rhAnticipoMotivoPK) {
		this.rhAnticipoMotivoPK = rhAnticipoMotivoPK;
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
		hash += (rhAnticipoMotivoPK != null ? rhAnticipoMotivoPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhAnticipoMotivo)) {
			return false;
		}
		RhAnticipoMotivo other = (RhAnticipoMotivo) object;
		if ((this.rhAnticipoMotivoPK == null && other.rhAnticipoMotivoPK != null)
				|| (this.rhAnticipoMotivoPK != null && !this.rhAnticipoMotivoPK.equals(other.rhAnticipoMotivoPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhAnticipoMotivo[ rhAnticipoMotivoPK=" + rhAnticipoMotivoPK + " ]";
	}
}
