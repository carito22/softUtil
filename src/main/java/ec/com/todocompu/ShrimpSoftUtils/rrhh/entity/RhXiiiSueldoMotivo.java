package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConTipo;

@Entity
@Table(name = "rh_xiii_sueldo_motivo", schema = "recursoshumanos")
public class RhXiiiSueldoMotivo implements Serializable {
	private static final long serialVersionUID = 1L;

	protected RhXiiiSueldoMotivoPK rhXiiiSueldoMotivoPK;
	private boolean motInactivo;
	private ConTipo conTipo;
	private String usrEmpresa;
	private String usrCodigo;
	private Timestamp usrFechaInserta;

	public RhXiiiSueldoMotivo() {
	}

	public RhXiiiSueldoMotivo(RhXiiiSueldoMotivoPK rhXiiiSueldoMotivoPK) {
		this.rhXiiiSueldoMotivoPK = rhXiiiSueldoMotivoPK;
	}

	public RhXiiiSueldoMotivo(RhXiiiSueldoMotivoPK rhXiiiSueldoMotivoPK, boolean motInactivo, ConTipo conTipo,
			String usrEmpresa, String usrCodigo, Timestamp usrFechaInserta) {
		this.rhXiiiSueldoMotivoPK = rhXiiiSueldoMotivoPK;
		this.motInactivo = motInactivo;
		this.conTipo = conTipo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public RhXiiiSueldoMotivo(String motEmpresa, String motDetalle) {
		this.rhXiiiSueldoMotivoPK = new RhXiiiSueldoMotivoPK(motEmpresa, motDetalle);
	}

	@EmbeddedId
	public RhXiiiSueldoMotivoPK getRhXiiiSueldoMotivoPK() {
		return rhXiiiSueldoMotivoPK;
	}

	public void setRhXiiiSueldoMotivoPK(RhXiiiSueldoMotivoPK rhXiiiSueldoMotivoPK) {
		this.rhXiiiSueldoMotivoPK = rhXiiiSueldoMotivoPK;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rhXiiiSueldoMotivoPK == null) ? 0 : rhXiiiSueldoMotivoPK.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RhXiiiSueldoMotivo other = (RhXiiiSueldoMotivo) obj;
		if (rhXiiiSueldoMotivoPK == null) {
			if (other.rhXiiiSueldoMotivoPK != null)
				return false;
		} else if (!rhXiiiSueldoMotivoPK.equals(other.rhXiiiSueldoMotivoPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RhXiiiMotivo [rhXiiiSueldoMotivoPK=" + rhXiiiSueldoMotivoPK + "]";
	}

}
