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
@Table(name = "inv_transferencias_motivo", schema = "inventario")
public class InvTransferenciasMotivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected InvTransferenciasMotivoPK invTransferenciasMotivoPK;
	@Column(name = "tm_detalle")
	private String tmDetalle;
	@Column(name = "tm_inactivo")
	private boolean tmInactivo;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;

	public InvTransferenciasMotivo() {
	}

	public InvTransferenciasMotivo(InvTransferenciasMotivoPK invTransferenciasMotivoPK) {
		this.invTransferenciasMotivoPK = invTransferenciasMotivoPK;
	}

	public InvTransferenciasMotivo(InvTransferenciasMotivoPK invTransferenciasMotivoPK, String tmDetalle,
			boolean tmInactivo, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
		this.invTransferenciasMotivoPK = invTransferenciasMotivoPK;
		this.tmDetalle = tmDetalle;
		this.tmInactivo = tmInactivo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public InvTransferenciasMotivo(String tmEmpresa, String tmCodigo) {
		this.invTransferenciasMotivoPK = new InvTransferenciasMotivoPK(tmEmpresa, tmCodigo);
	}

	public InvTransferenciasMotivoPK getInvTransferenciasMotivoPK() {
		return invTransferenciasMotivoPK;
	}

	public void setInvTransferenciasMotivoPK(InvTransferenciasMotivoPK invTransferenciasMotivoPK) {
		this.invTransferenciasMotivoPK = invTransferenciasMotivoPK;
	}

	public String getTmDetalle() {
		return tmDetalle;
	}

	public void setTmDetalle(String tmDetalle) {
		this.tmDetalle = tmDetalle;
	}

	public boolean getTmInactivo() {
		return tmInactivo;
	}

	public void setTmInactivo(boolean tmInactivo) {
		this.tmInactivo = tmInactivo;
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
		hash += (invTransferenciasMotivoPK != null ? invTransferenciasMotivoPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvTransferenciasMotivo)) {
			return false;
		}
		InvTransferenciasMotivo other = (InvTransferenciasMotivo) object;
		if ((this.invTransferenciasMotivoPK == null && other.invTransferenciasMotivoPK != null)
				|| (this.invTransferenciasMotivoPK != null
						&& !this.invTransferenciasMotivoPK.equals(other.invTransferenciasMotivoPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvTransferenciasMotivo[ invTransferenciasMotivoPK=" + invTransferenciasMotivoPK
				+ " ]";
	}

}
