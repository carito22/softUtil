package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "sis_usuario_detalle", schema = "sistemaweb")
public class SisUsuarioDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected SisUsuarioDetallePK sisUsuarioDetallePK;
	@Column(name = "det_equipo")
	private String detEquipo;
	@Column(name = "det_activo")
	private boolean detActivo;
	@Column(name = "usr_fecha_inserta_usuario")
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInsertaUsuario;
	@JoinColumn(name = "usr_codigo", referencedColumnName = "usr_codigo")
	@ManyToOne
	private SisUsuario sisUsuario;
	@JoinColumns({ @JoinColumn(name = "gru_empresa", referencedColumnName = "gru_empresa"),
			@JoinColumn(name = "gru_codigo", referencedColumnName = "gru_codigo") })
	@ManyToOne
	private SisGrupo sisGrupo;

	public SisUsuarioDetalle() {
	}

	public SisUsuarioDetalle(SisUsuarioDetallePK sisUsuarioDetallePK) {
		this.sisUsuarioDetallePK = sisUsuarioDetallePK;
	}

	public SisUsuarioDetalle(SisUsuarioDetallePK sisUsuarioDetallePK, String detEquipo, boolean detActivo,
			Date usrFechaInsertaUsuario) {
		this.sisUsuarioDetallePK = sisUsuarioDetallePK;
		this.detEquipo = detEquipo;
		this.detActivo = detActivo;
		this.usrFechaInsertaUsuario = usrFechaInsertaUsuario;
	}

	public SisUsuarioDetalle(String detEmpresa, String detUsuario) {
		this.sisUsuarioDetallePK = new SisUsuarioDetallePK(detEmpresa, detUsuario);
	}

	public SisUsuarioDetallePK getSisUsuarioDetallePK() {
		return sisUsuarioDetallePK;
	}

	public void setSisUsuarioDetallePK(SisUsuarioDetallePK sisUsuarioDetallePK) {
		this.sisUsuarioDetallePK = sisUsuarioDetallePK;
	}

	public String getDetEquipo() {
		return detEquipo;
	}

	public void setDetEquipo(String detEquipo) {
		this.detEquipo = detEquipo;
	}

	public boolean getDetActivo() {
		return detActivo;
	}

	public void setDetActivo(boolean detActivo) {
		this.detActivo = detActivo;
	}

	public Date getUsrFechaInsertaUsuario() {
		return usrFechaInsertaUsuario;
	}

	public void setUsrFechaInsertaUsuario(Date usrFechaInsertaUsuario) {
		this.usrFechaInsertaUsuario = usrFechaInsertaUsuario;
	}

	public SisUsuario getSisUsuario() {
		return sisUsuario;
	}

	public void setSisUsuario(SisUsuario sisUsuario) {
		this.sisUsuario = sisUsuario;
	}

	public SisGrupo getSisGrupo() {
		return sisGrupo;
	}

	public void setSisGrupo(SisGrupo sisGrupo) {
		this.sisGrupo = sisGrupo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (sisUsuarioDetallePK != null ? sisUsuarioDetallePK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof SisUsuarioDetalle)) {
			return false;
		}
		SisUsuarioDetalle other = (SisUsuarioDetalle) object;
		if ((this.sisUsuarioDetallePK == null && other.sisUsuarioDetallePK != null)
				|| (this.sisUsuarioDetallePK != null && !this.sisUsuarioDetallePK.equals(other.sisUsuarioDetallePK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "sistemaWeb.entity.SisUsuarioDetalle[ sisUsuarioDetallePK=" + sisUsuarioDetallePK + " ]";
	}
}
