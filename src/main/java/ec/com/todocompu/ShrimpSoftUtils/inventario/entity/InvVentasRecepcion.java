package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "inv_ventas_recepcion", schema = "inventario")
public class InvVentasRecepcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected InvVentasRecepcionPK invVentasRecepcionPK;
	@Column(name = "recep_fecha")
	@Temporal(TemporalType.DATE)
	private Date recepFecha;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;
	@JoinColumns({ @JoinColumn(name = "vta_empresa", referencedColumnName = "vta_empresa"),
			@JoinColumn(name = "vta_periodo", referencedColumnName = "vta_periodo"),
			@JoinColumn(name = "vta_motivo", referencedColumnName = "vta_motivo"),
			@JoinColumn(name = "vta_numero", referencedColumnName = "vta_numero") })
	@ManyToOne(optional = false)
	private InvVentas invVentas;

	public InvVentasRecepcion() {
	}

	public InvVentasRecepcion(InvVentasRecepcionPK invVentasRecepcionPK) {
		this.invVentasRecepcionPK = invVentasRecepcionPK;
	}

	public InvVentasRecepcion(InvVentasRecepcionPK invVentasRecepcionPK, Date recepFecha, String usrEmpresa,
			String usrCodigo, Date usrFechaInserta) {
		this.invVentasRecepcionPK = invVentasRecepcionPK;
		this.recepFecha = recepFecha;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public InvVentasRecepcion(String recepEmpresa, String recepPeriodo, String recepMotivo, String recepNumero) {
		this.invVentasRecepcionPK = new InvVentasRecepcionPK(recepEmpresa, recepPeriodo, recepMotivo, recepNumero);
	}

	public InvVentasRecepcionPK getInvVentasRecepcionPK() {
		return invVentasRecepcionPK;
	}

	public void setInvVentasRecepcionPK(InvVentasRecepcionPK invVentasRecepcionPK) {
		this.invVentasRecepcionPK = invVentasRecepcionPK;
	}

	public Date getRecepFecha() {
		return recepFecha;
	}

	public void setRecepFecha(Date recepFecha) {
		this.recepFecha = recepFecha;
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

	public InvVentas getInvVentas() {
		return invVentas;
	}

	public void setInvVentas(InvVentas invVentas) {
		this.invVentas = invVentas;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (invVentasRecepcionPK != null ? invVentasRecepcionPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvVentasRecepcion)) {
			return false;
		}
		InvVentasRecepcion other = (InvVentasRecepcion) object;
		if ((this.invVentasRecepcionPK == null && other.invVentasRecepcionPK != null)
				|| (this.invVentasRecepcionPK != null
						&& !this.invVentasRecepcionPK.equals(other.invVentasRecepcionPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvVentasRecepcion[ invVentasRecepcionPK=" + invVentasRecepcionPK + " ]";
	}

}
