package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "prd_preliquidacion_motivo", schema = "produccion")
public class PrdPreLiquidacionMotivo implements Serializable {
	private static final long serialVersionUID = 1L;

	protected PrdPreLiquidacionMotivoPK prdPreLiquidacionMotivoPK;
	private String plmDetalle;
	private boolean plmInactivo;
	private String usrEmpresa;
	private String usrCodigo;
	private Timestamp usrFechaInserta;

	public PrdPreLiquidacionMotivo() {
	}

	public PrdPreLiquidacionMotivo(PrdPreLiquidacionMotivoPK prdPreLiquidacionMotivoPK) {
		this.prdPreLiquidacionMotivoPK = prdPreLiquidacionMotivoPK;
	}

	public PrdPreLiquidacionMotivo(PrdPreLiquidacionMotivoPK prdPreLiquidacionMotivoPK, String plmDetalle,
			boolean plmInactivo, String usrEmpresa, String usrCodigo, Timestamp usrFechaInserta) {
		this.prdPreLiquidacionMotivoPK = prdPreLiquidacionMotivoPK;
		this.plmDetalle = plmDetalle;
		this.plmInactivo = plmInactivo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public PrdPreLiquidacionMotivo(String lmEmpresa, String lmCodigo) {
		this.prdPreLiquidacionMotivoPK = new PrdPreLiquidacionMotivoPK(lmEmpresa, lmCodigo);
	}

	@EmbeddedId
	public PrdPreLiquidacionMotivoPK getPrdPreLiquidacionMotivoPK() {
		return prdPreLiquidacionMotivoPK;
	}

	public void setPrdPreLiquidacionMotivoPK(PrdPreLiquidacionMotivoPK prdPreLiquidacionMotivoPK) {
		this.prdPreLiquidacionMotivoPK = prdPreLiquidacionMotivoPK;
	}

	@Column(name = "plm_detalle")
	public String getPlmDetalle() {
		return plmDetalle;
	}

	public void setPlmDetalle(String plmDetalle) {
		this.plmDetalle = plmDetalle;
	}

	@Column(name = "plm_inactivo")
	public boolean getPlmInactivo() {
		return plmInactivo;
	}

	public void setPlmInactivo(boolean plmInactivo) {
		this.plmInactivo = plmInactivo;
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
		hash += (prdPreLiquidacionMotivoPK != null ? prdPreLiquidacionMotivoPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdPreLiquidacionMotivo)) {
			return false;
		}
		PrdPreLiquidacionMotivo other = (PrdPreLiquidacionMotivo) object;
		if ((this.prdPreLiquidacionMotivoPK == null && other.prdPreLiquidacionMotivoPK != null)
				|| (this.prdPreLiquidacionMotivoPK != null
						&& !this.prdPreLiquidacionMotivoPK.equals(other.prdPreLiquidacionMotivoPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdLiquidacionMotivo[ prdPreLiquidacionMotivoPK=" + prdPreLiquidacionMotivoPK + " ]";
	}

}
