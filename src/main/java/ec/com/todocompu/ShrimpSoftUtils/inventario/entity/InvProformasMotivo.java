package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "inv_proformas_motivo", schema = "inventario")
public class InvProformasMotivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected InvProformasMotivoPK invProformasMotivoPK;
	@Column(name = "pm_detalle")
	private String pmDetalle;
	@Column(name = "pm_inactivo")
	private boolean pmInactivo;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;

	public InvProformasMotivo() {
	}

	public InvProformasMotivo(InvProformasMotivoPK invProformasMotivoPK) {
		this.invProformasMotivoPK = invProformasMotivoPK;
	}

	public InvProformasMotivo(InvProformasMotivoPK invProformasMotivoPK, String pmDetalle, boolean pmInactivo,
			String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
		this.invProformasMotivoPK = invProformasMotivoPK;
		this.pmDetalle = pmDetalle;
		this.pmInactivo = pmInactivo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public InvProformasMotivo(String pmEmpresa, String pmCodigo) {
		this.invProformasMotivoPK = new InvProformasMotivoPK(pmEmpresa, pmCodigo);
	}

	public InvProformasMotivoPK getInvProformasMotivoPK() {
		return invProformasMotivoPK;
	}

	public void setInvProformasMotivoPK(InvProformasMotivoPK invProformasMotivoPK) {
		this.invProformasMotivoPK = invProformasMotivoPK;
	}

	public String getPmDetalle() {
		return pmDetalle;
	}

	public void setPmDetalle(String pmDetalle) {
		this.pmDetalle = pmDetalle;
	}

	public boolean getPmInactivo() {
		return pmInactivo;
	}

	public void setPmInactivo(boolean pmInactivo) {
		this.pmInactivo = pmInactivo;
	}

	public String getUsrEmpresa() {
		return usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public Date getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(Date usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (invProformasMotivoPK != null ? invProformasMotivoPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvProformasMotivo)) {
			return false;
		}
		InvProformasMotivo other = (InvProformasMotivo) object;
		if ((this.invProformasMotivoPK == null && other.invProformasMotivoPK != null)
				|| (this.invProformasMotivoPK != null
						&& !this.invProformasMotivoPK.equals(other.invProformasMotivoPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvProformasMotivo[ invProformasMotivoPK=" + invProformasMotivoPK + " ]";
	}

}
