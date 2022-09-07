package ec.com.todocompu.ShrimpSoftUtils.banco.entity;

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

@Entity
@Table(name = "ban_banco", schema = "banco")
public class BanBanco implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected BanBancoPK banBancoPK;
	@Column(name = "ban_nombre")
	private String banNombre;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "banBanco")
	private List<BanCuenta> banCuentaList;

	public BanBanco() {
	}

	public BanBanco(BanBancoPK banBancoPK) {
		this.banBancoPK = banBancoPK;
	}

	public BanBanco(BanBancoPK banBancoPK, String banNombre, String usrEmpresa, String usrCodigo,
			Date usrFechaInserta) {
		this.banBancoPK = banBancoPK;
		this.banNombre = banNombre;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public BanBanco(String banEmpresa, String banCodigo) {
		this.banBancoPK = new BanBancoPK(banEmpresa, banCodigo);
	}

	public BanBancoPK getBanBancoPK() {
		return banBancoPK;
	}

	public void setBanBancoPK(BanBancoPK banBancoPK) {
		this.banBancoPK = banBancoPK;
	}

	public String getBanNombre() {
		return banNombre;
	}

	public void setBanNombre(String banNombre) {
		this.banNombre = banNombre;
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

	public List<BanCuenta> getBanCuentaList() {
		return banCuentaList;
	}

	public void setBanCuentaList(List<BanCuenta> banCuentaList) {
		this.banCuentaList = banCuentaList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (banBancoPK != null ? banBancoPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof BanBanco)) {
			return false;
		}
		BanBanco other = (BanBanco) object;
		if ((this.banBancoPK == null && other.banBancoPK != null)
				|| (this.banBancoPK != null && !this.banBancoPK.equals(other.banBancoPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "banco.entity.BanBanco[ banBancoPK=" + banBancoPK + " ]";
	}

}
