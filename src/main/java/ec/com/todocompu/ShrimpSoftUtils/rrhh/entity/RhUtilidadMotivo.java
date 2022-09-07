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
@Table(name = "rh_utilidades_motivo", schema = "recursoshumanos")
public class RhUtilidadMotivo implements Serializable {
	private static final long serialVersionUID = 1L;

	protected RhUtilidadMotivoPK rhUtilidadMotivoPK;
	private boolean motInactivo;
	private ConTipo conTipo;
	private String usrEmpresa;
	private String usrCodigo;
	private Timestamp usrFechaInserta;

	public RhUtilidadMotivo() {
	}

	public RhUtilidadMotivo(RhUtilidadMotivoPK rhUtilidadMotivoPK) {
		this.rhUtilidadMotivoPK = rhUtilidadMotivoPK;
	}

	public RhUtilidadMotivo(RhUtilidadMotivoPK rhUtilidadMotivoPK, boolean motInactivo, ConTipo conTipo,
			String usrEmpresa, String usrCodigo, Timestamp usrFechaInserta) {
		this.rhUtilidadMotivoPK = rhUtilidadMotivoPK;
		this.motInactivo = motInactivo;
		this.conTipo = conTipo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public RhUtilidadMotivo(String motEmpresa, String motDetalle) {
		this.rhUtilidadMotivoPK = new RhUtilidadMotivoPK(motEmpresa, motDetalle);
	}

	@EmbeddedId
	public RhUtilidadMotivoPK getRhUtilidadMotivoPK() {
		return rhUtilidadMotivoPK;
	}

	public void setRhUtilidadMotivoPK(RhUtilidadMotivoPK rhUtilidadMotivoPK) {
		this.rhUtilidadMotivoPK = rhUtilidadMotivoPK;
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
		result = prime * result + ((rhUtilidadMotivoPK == null) ? 0 : rhUtilidadMotivoPK.hashCode());
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
		RhUtilidadMotivo other = (RhUtilidadMotivo) obj;
		if (rhUtilidadMotivoPK == null) {
			if (other.rhUtilidadMotivoPK != null)
				return false;
		} else if (!rhUtilidadMotivoPK.equals(other.rhUtilidadMotivoPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RhUtilidadMotivo [rhUtilidadMotivoPK=" + rhUtilidadMotivoPK + "]";
	}

}
