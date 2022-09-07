package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "inv_vendedor", schema = "inventario")
public class InvVendedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected InvVendedorPK invVendedorPK;
	@Column(name = "vend_nombre")
	private String vendNombre;
        @Column(name = "vend_inactivo")
        private boolean vendInactivo;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;
	@OneToMany(mappedBy = "invVendedor")
	@JsonIgnore
	private List<InvCliente> invClienteList;

	public InvVendedor() {
	}

	public InvVendedor(InvVendedorPK invVendedorPK) {
		this.invVendedorPK = invVendedorPK;
	}

	public InvVendedor(InvVendedorPK invVendedorPK, String vendNombre, String usrEmpresa, String usrCodigo,
			Date usrFechaInserta) {
		this.invVendedorPK = invVendedorPK;
		this.vendNombre = vendNombre;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public InvVendedor(String vendEmpresa, String vendCodigo) {
		this.invVendedorPK = new InvVendedorPK(vendEmpresa, vendCodigo);
	}

	public InvVendedorPK getInvVendedorPK() {
		return invVendedorPK;
	}

	public void setInvVendedorPK(InvVendedorPK invVendedorPK) {
		this.invVendedorPK = invVendedorPK;
	}

	public String getVendNombre() {
		return vendNombre;
	}

	public void setVendNombre(String vendNombre) {
		this.vendNombre = vendNombre;
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

	public List<InvCliente> getInvClienteList() {
		return invClienteList;
	}

	public void setInvClienteList(List<InvCliente> invClienteList) {
		this.invClienteList = invClienteList;
	}

        public boolean getVendInactivo() {
            return vendInactivo;
        }

        public void setVendInactivo(boolean vendInactivo) {
            this.vendInactivo = vendInactivo;
        }

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (invVendedorPK != null ? invVendedorPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvVendedor)) {
			return false;
		}
		InvVendedor other = (InvVendedor) object;
		if ((this.invVendedorPK == null && other.invVendedorPK != null)
				|| (this.invVendedorPK != null && !this.invVendedorPK.equals(other.invVendedorPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvVendedor[ invVendedorPK=" + invVendedorPK + " ]";
	}

}
