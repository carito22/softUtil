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
@Table(name = "rh_bono_motivo", schema = "recursoshumanos")
public class RhBonoMotivo implements Serializable {
	private static final long serialVersionUID = 1L;

	protected RhBonoMotivoPK rhBonoMotivoPK;
	private boolean motInactivo;
	private ConTipo conTipo;
	private String usrEmpresa;
	private String usrCodigo;
	private Timestamp usrFechaInserta;

	public RhBonoMotivo() {
	}

	public RhBonoMotivo(RhBonoMotivoPK rhBonoMotivoPK) {
		this.rhBonoMotivoPK = rhBonoMotivoPK;
	}

	public RhBonoMotivo(RhBonoMotivoPK rhBonoMotivoPK, boolean motInactivo, ConTipo conTipo, String usrEmpresa,
			String usrCodigo, Timestamp usrFechaInserta) {
		this.rhBonoMotivoPK = rhBonoMotivoPK;
		this.motInactivo = motInactivo;
		this.conTipo = conTipo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public RhBonoMotivo(String motEmpresa, String motDetalle) {
		this.rhBonoMotivoPK = new RhBonoMotivoPK(motEmpresa, motDetalle);
	}

	@EmbeddedId
	public RhBonoMotivoPK getRhBonoMotivoPK() {
		return rhBonoMotivoPK;
	}

	public void setRhBonoMotivoPK(RhBonoMotivoPK rhBonoMotivoPK) {
		this.rhBonoMotivoPK = rhBonoMotivoPK;
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
		int hash = 0;
		hash += (rhBonoMotivoPK != null ? rhBonoMotivoPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhBonoMotivo)) {
			return false;
		}
		RhBonoMotivo other = (RhBonoMotivo) object;
		if ((this.rhBonoMotivoPK == null && other.rhBonoMotivoPK != null)
				|| (this.rhBonoMotivoPK != null && !this.rhBonoMotivoPK.equals(other.rhBonoMotivoPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhBonoMotivo[ rhBonoMotivoPK=" + rhBonoMotivoPK + " ]";
	}
}
