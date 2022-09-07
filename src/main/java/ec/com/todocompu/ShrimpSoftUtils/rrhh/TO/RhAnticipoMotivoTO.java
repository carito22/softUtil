package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhAnticipoMotivoTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String motEmpresa;
	private String motDetalle;
	private Boolean motInactivo;
	private String tipEmpresa;
	private String tipCodigo;
	private String usrEmpresa;
	private String usrCodigo;
	private String usrFechaInserta;

	public RhAnticipoMotivoTO() {
	}

	public RhAnticipoMotivoTO(String motEmpresa, String motDetalle, Boolean motInactivo, String tipEmpresa,
			String tipCodigo, String usrEmpresa, String usrCodigo, String usrFechaInserta) {
		this.motEmpresa = motEmpresa;
		this.motDetalle = motDetalle;
		this.motInactivo = motInactivo;
		this.tipEmpresa = tipEmpresa;
		this.tipCodigo = tipCodigo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	@Id
	@Column(name = "mot_detalle")
	public String getMotDetalle() {
		return motDetalle;
	}

	public void setMotDetalle(String motDetalle) {
		this.motDetalle = motDetalle;
	}

	@Column(name = "mot_empresa")
	public String getMotEmpresa() {
		return motEmpresa;
	}

	public void setMotEmpresa(String motEmpresa) {
		this.motEmpresa = motEmpresa;
	}

	@Column(name = "mot_inactivo")
	public Boolean isMotInactivo() {
		return motInactivo;
	}

	public void setMotInactivo(Boolean motInactivo) {
		this.motInactivo = motInactivo;
	}

	@Column(name = "tip_empresa")
	public String getTipEmpresa() {
		return tipEmpresa;
	}

	public void setTipEmpresa(String tipEmpresa) {
		this.tipEmpresa = tipEmpresa;
	}

	@Column(name = "tip_codigo")
	public String getTipCodigo() {
		return tipCodigo;
	}

	public void setTipCodigo(String tipCodigo) {
		this.tipCodigo = tipCodigo;
	}

	@Column(name = "usr_codigo")
	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	@Column(name = "usr_empresa")
	public String getUsrEmpresa() {
		return usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

	@Column(name = "usr_fecha_inserta")
	public String getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(String usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

	@Override
	public String toString() {
		return motDetalle;
	}

}
