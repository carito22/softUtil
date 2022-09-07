package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "prd_presupuesto_pesca_motivo", schema = "produccion")
public class PrdPresupuestoPescaMotivo implements Serializable {
	private static final long serialVersionUID = 1L;

	protected PrdPresupuestoPescaMotivoPK prdPresupuestoPescaMotivoPK;
	private String presuDetalle;
	private boolean presuInactivo;
	private String usrEmpresa;
	private String usrCodigo;
	private Timestamp usrFechaInserta;

	public PrdPresupuestoPescaMotivo() {
	}

	public PrdPresupuestoPescaMotivo(PrdPresupuestoPescaMotivoPK prdPresupuestoPescaMotivoPK) {
		this.prdPresupuestoPescaMotivoPK = prdPresupuestoPescaMotivoPK;
	}

	public PrdPresupuestoPescaMotivo(PrdPresupuestoPescaMotivoPK prdPresupuestoPescaMotivoPK, String presuDetalle,
			boolean presuInactivo, String usrEmpresa, String usrCodigo, Timestamp usrFechaInserta) {
		this.prdPresupuestoPescaMotivoPK = prdPresupuestoPescaMotivoPK;
		this.presuDetalle = presuDetalle;
		this.presuInactivo = presuInactivo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public PrdPresupuestoPescaMotivo(String lmEmpresa, String lmCodigo) {
		this.prdPresupuestoPescaMotivoPK = new PrdPresupuestoPescaMotivoPK(lmEmpresa, lmCodigo);
	}

	@EmbeddedId
	public PrdPresupuestoPescaMotivoPK getPrdPresupuestoPescaMotivoPK() {
		return prdPresupuestoPescaMotivoPK;
	}

	public void setPrdPresupuestoPescaMotivoPK(PrdPresupuestoPescaMotivoPK prdPresupuestoPescaMotivoPK) {
		this.prdPresupuestoPescaMotivoPK = prdPresupuestoPescaMotivoPK;
	}

	@Column(name = "presu_detalle")
	public String getPresuDetalle() {
		return presuDetalle;
	}

	public void setPresuDetalle(String presuDetalle) {
		this.presuDetalle = presuDetalle;
	}

	@Column(name = "presu_inactivo")
	public boolean getPresuInactivo() {
		return presuInactivo;
	}

	public void setPresuInactivo(boolean presuInactivo) {
		this.presuInactivo = presuInactivo;
	}

	@Column(name = "usr_empresa")
	public String getUsrEmpresa() {
		return usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

	@Column(name = "usr_codigo")
	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	public Timestamp getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(Timestamp usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (prdPresupuestoPescaMotivoPK != null ? prdPresupuestoPescaMotivoPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdPresupuestoPescaMotivo)) {
			return false;
		}
		PrdPresupuestoPescaMotivo other = (PrdPresupuestoPescaMotivo) object;
		if ((this.prdPresupuestoPescaMotivoPK == null && other.prdPresupuestoPescaMotivoPK != null)
				|| (this.prdPresupuestoPescaMotivoPK != null
						&& !this.prdPresupuestoPescaMotivoPK.equals(other.prdPresupuestoPescaMotivoPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdLiquidacionMotivo[ prdPresupuestoPescaMotivoPK=" + prdPresupuestoPescaMotivoPK
				+ " ]";
	}

}
