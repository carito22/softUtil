package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "inv_producto_presentacion_cajas", schema = "inventario")
public class InvProductoPresentacionCajas implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected InvProductoPresentacionCajasPK invProductoPresentacionCajasPK;
	@Column(name = "presc_detalle")
	private String prescDetalle;
	@Column(name = "presc_abreviado")
	private String prescAbreviado;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "invProductoPresentacionCajas")
	@JsonIgnore	private List<InvProducto> invProductoList;

	public InvProductoPresentacionCajas() {
	}

	public InvProductoPresentacionCajas(InvProductoPresentacionCajasPK invProductoPresentacionCajasPK) {
		this.invProductoPresentacionCajasPK = invProductoPresentacionCajasPK;
	}

	public InvProductoPresentacionCajas(InvProductoPresentacionCajasPK invProductoPresentacionCajasPK,
			String prescDetalle, String prescAbreviado, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
		this.invProductoPresentacionCajasPK = invProductoPresentacionCajasPK;
		this.prescDetalle = prescDetalle;
		this.prescAbreviado = prescAbreviado;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public InvProductoPresentacionCajas(String prescEmpresa, String prescCodigo) {
		this.invProductoPresentacionCajasPK = new InvProductoPresentacionCajasPK(prescEmpresa, prescCodigo);
	}

	public InvProductoPresentacionCajasPK getInvProductoPresentacionCajasPK() {
		return invProductoPresentacionCajasPK;
	}

	public void setInvProductoPresentacionCajasPK(InvProductoPresentacionCajasPK invProductoPresentacionCajasPK) {
		this.invProductoPresentacionCajasPK = invProductoPresentacionCajasPK;
	}

	public String getPrescDetalle() {
		return prescDetalle;
	}

	public void setPrescDetalle(String prescDetalle) {
		this.prescDetalle = prescDetalle;
	}

	public String getPrescAbreviado() {
		return prescAbreviado;
	}

	public void setPrescAbreviado(String prescAbreviado) {
		this.prescAbreviado = prescAbreviado;
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

	public List<InvProducto> getInvProductoList() {
		return invProductoList;
	}

	public void setInvProductoList(List<InvProducto> invProductoList) {
		this.invProductoList = invProductoList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (invProductoPresentacionCajasPK != null ? invProductoPresentacionCajasPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvProductoPresentacionCajas)) {
			return false;
		}
		InvProductoPresentacionCajas other = (InvProductoPresentacionCajas) object;
		if ((this.invProductoPresentacionCajasPK == null && other.invProductoPresentacionCajasPK != null)
				|| (this.invProductoPresentacionCajasPK != null
						&& !this.invProductoPresentacionCajasPK.equals(other.invProductoPresentacionCajasPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvProductoPresentacionCajas[ invProductoPresentacionCajasPK="
				+ invProductoPresentacionCajasPK + " ]";
	}

}
