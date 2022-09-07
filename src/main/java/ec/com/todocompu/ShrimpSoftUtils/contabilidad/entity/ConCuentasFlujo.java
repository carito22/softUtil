package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

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
@Table(name = "con_cuentas_flujo", schema = "contabilidad")
public class ConCuentasFlujo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected ConCuentasFlujoPK conCuentasFlujoPK;
	@Column(name = "flu_detalle")
	private String fluDetalle;
	@Column(name = "flu_activo")
	private boolean fluActivo;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "conCuentasFlujo")
	private List<ConCuentasFlujoDetalle> conCuentasFlujoDetalleList;

	public ConCuentasFlujo() {
	}

	public ConCuentasFlujo(ConCuentasFlujoPK conCuentasFlujoPK) {
		this.conCuentasFlujoPK = conCuentasFlujoPK;
	}

	public ConCuentasFlujo(ConCuentasFlujoPK conCuentasFlujoPK, String fluDetalle, boolean fluActivo,
			String usrEmpresa) {
		this.conCuentasFlujoPK = conCuentasFlujoPK;
		this.fluDetalle = fluDetalle;
		this.fluActivo = fluActivo;
		this.usrEmpresa = usrEmpresa;
	}

	public ConCuentasFlujo(String fluEmpresa, String fluCodigo) {
		this.conCuentasFlujoPK = new ConCuentasFlujoPK(fluEmpresa, fluCodigo);
	}

	public ConCuentasFlujoPK getConCuentasFlujoPK() {
		return conCuentasFlujoPK;
	}

	public void setConCuentasFlujoPK(ConCuentasFlujoPK conCuentasFlujoPK) {
		this.conCuentasFlujoPK = conCuentasFlujoPK;
	}

	public String getFluDetalle() {
		return fluDetalle;
	}

	public void setFluDetalle(String fluDetalle) {
		this.fluDetalle = fluDetalle;
	}

	public boolean getFluActivo() {
		return fluActivo;
	}

	public void setFluActivo(boolean fluActivo) {
		this.fluActivo = fluActivo;
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

	public List<ConCuentasFlujoDetalle> getConCuentasFlujoDetalleList() {
		return conCuentasFlujoDetalleList;
	}

	public void setConCuentasFlujoDetalleList(List<ConCuentasFlujoDetalle> conCuentasFlujoDetalleList) {
		this.conCuentasFlujoDetalleList = conCuentasFlujoDetalleList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (conCuentasFlujoPK != null ? conCuentasFlujoPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof ConCuentasFlujo)) {
			return false;
		}
		ConCuentasFlujo other = (ConCuentasFlujo) object;
		if ((this.conCuentasFlujoPK == null && other.conCuentasFlujoPK != null)
				|| (this.conCuentasFlujoPK != null && !this.conCuentasFlujoPK.equals(other.conCuentasFlujoPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "contabilidad.entity.ConCuentasFlujo[ conCuentasFlujoPK=" + conCuentasFlujoPK + " ]";
	}

}
