package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

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
@Table(name = "con_cuentas_flujo_detalle", schema = "contabilidad")
public class ConCuentasFlujoDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected ConCuentasFlujoDetallePK conCuentasFlujoDetallePK;
	@Column(name = "det_cuenta_flujo")
	private String detCuentaFlujo;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;
	@JoinColumns({ @JoinColumn(name = "flu_empresa", referencedColumnName = "flu_empresa"),
			@JoinColumn(name = "flu_codigo", referencedColumnName = "flu_codigo") })
	@ManyToOne(optional = false)
	private ConCuentasFlujo conCuentasFlujo;
	@JoinColumns({ @JoinColumn(name = "cta_empresa", referencedColumnName = "cta_empresa"),
			@JoinColumn(name = "cta_codigo", referencedColumnName = "cta_codigo") })
	@ManyToOne(optional = false)
	private ConCuentas conCuentas;

	public ConCuentasFlujoDetalle() {
	}

	public ConCuentasFlujoDetalle(ConCuentasFlujoDetallePK conCuentasFlujoDetallePK) {
		this.conCuentasFlujoDetallePK = conCuentasFlujoDetallePK;
	}

	public ConCuentasFlujoDetalle(ConCuentasFlujoDetallePK conCuentasFlujoDetallePK, String detCuentaFlujo,
			String usrEmpresa) {
		this.conCuentasFlujoDetallePK = conCuentasFlujoDetallePK;
		this.detCuentaFlujo = detCuentaFlujo;
		this.usrEmpresa = usrEmpresa;
	}

	public ConCuentasFlujoDetalle(String detEmpresa, String detCuentaContable, char detDebitoCredito) {
		this.conCuentasFlujoDetallePK = new ConCuentasFlujoDetallePK(detEmpresa, detCuentaContable, detDebitoCredito);
	}

	public ConCuentasFlujoDetallePK getConCuentasFlujoDetallePK() {
		return conCuentasFlujoDetallePK;
	}

	public void setConCuentasFlujoDetallePK(ConCuentasFlujoDetallePK conCuentasFlujoDetallePK) {
		this.conCuentasFlujoDetallePK = conCuentasFlujoDetallePK;
	}

	public String getDetCuentaFlujo() {
		return detCuentaFlujo;
	}

	public void setDetCuentaFlujo(String detCuentaFlujo) {
		this.detCuentaFlujo = detCuentaFlujo;
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

	public ConCuentasFlujo getConCuentasFlujo() {
		return conCuentasFlujo;
	}

	public void setConCuentasFlujo(ConCuentasFlujo conCuentasFlujo) {
		this.conCuentasFlujo = conCuentasFlujo;
	}

	public ConCuentas getConCuentas() {
		return conCuentas;
	}

	public void setConCuentas(ConCuentas conCuentas) {
		this.conCuentas = conCuentas;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (conCuentasFlujoDetallePK != null ? conCuentasFlujoDetallePK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof ConCuentasFlujoDetalle)) {
			return false;
		}
		ConCuentasFlujoDetalle other = (ConCuentasFlujoDetalle) object;
		if ((this.conCuentasFlujoDetallePK == null && other.conCuentasFlujoDetallePK != null)
				|| (this.conCuentasFlujoDetallePK != null
						&& !this.conCuentasFlujoDetallePK.equals(other.conCuentasFlujoDetallePK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "contabilidad.entity.ConCuentasFlujoDetalle[ conCuentasFlujoDetallePK=" + conCuentasFlujoDetallePK
				+ " ]";
	}

}
