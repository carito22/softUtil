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
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "inv_producto_presentacion_unidades", schema = "inventario")
@XmlRootElement
public class InvProductoPresentacionUnidades implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected InvProductoPresentacionUnidadesPK invProductoPresentacionUnidadesPK;
	@Column(name = "presu_detalle")
	private String presuDetalle;
	@Column(name = "presu_abreviado")
	private String presuAbreviado;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "invProductoPresentacionUnidades")
	@JsonIgnore
	private List<InvProducto> invProductoList;

	public InvProductoPresentacionUnidades() {
	}

	public InvProductoPresentacionUnidades(InvProductoPresentacionUnidadesPK invProductoPresentacionUnidadesPK) {
		this.invProductoPresentacionUnidadesPK = invProductoPresentacionUnidadesPK;
	}

	public InvProductoPresentacionUnidades(InvProductoPresentacionUnidadesPK invProductoPresentacionUnidadesPK,
			String presuDetalle, String presuAbreviado, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
		this.invProductoPresentacionUnidadesPK = invProductoPresentacionUnidadesPK;
		this.presuDetalle = presuDetalle;
		this.presuAbreviado = presuAbreviado;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public InvProductoPresentacionUnidades(String presuEmpresa, String presuCodigo) {
		this.invProductoPresentacionUnidadesPK = new InvProductoPresentacionUnidadesPK(presuEmpresa, presuCodigo);
	}

	public InvProductoPresentacionUnidadesPK getInvProductoPresentacionUnidadesPK() {
		return invProductoPresentacionUnidadesPK;
	}

	public void setInvProductoPresentacionUnidadesPK(
			InvProductoPresentacionUnidadesPK invProductoPresentacionUnidadesPK) {
		this.invProductoPresentacionUnidadesPK = invProductoPresentacionUnidadesPK;
	}

	public String getPresuDetalle() {
		return presuDetalle;
	}

	public void setPresuDetalle(String presuDetalle) {
		this.presuDetalle = presuDetalle;
	}

	public String getPresuAbreviado() {
		return presuAbreviado;
	}

	public void setPresuAbreviado(String presuAbreviado) {
		this.presuAbreviado = presuAbreviado;
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
		hash += (invProductoPresentacionUnidadesPK != null ? invProductoPresentacionUnidadesPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvProductoPresentacionUnidades)) {
			return false;
		}
		InvProductoPresentacionUnidades other = (InvProductoPresentacionUnidades) object;
		if ((this.invProductoPresentacionUnidadesPK == null && other.invProductoPresentacionUnidadesPK != null)
				|| (this.invProductoPresentacionUnidadesPK != null
						&& !this.invProductoPresentacionUnidadesPK.equals(other.invProductoPresentacionUnidadesPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvProductoPresentacionUnidades[ invProductoPresentacionUnidadesPK="
				+ invProductoPresentacionUnidadesPK + " ]";
	}

}
