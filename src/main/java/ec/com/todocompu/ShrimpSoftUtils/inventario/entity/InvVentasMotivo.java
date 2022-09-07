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
@Table(name = "inv_ventas_motivo", schema = "inventario")
public class InvVentasMotivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected InvVentasMotivoPK invVentasMotivoPK;
	@Column(name = "vm_detalle")
	private String vmDetalle;
	@Column(name = "vm_forma_contabilizar")
	private String vmFormaContabilizar;
	@Column(name = "vm_forma_imprimir")
	private String vmFormaImprimir;
	@Column(name = "vm_inactivo")
	private boolean vmInactivo;
	@Column(name = "tip_empresa")
	private String tipEmpresa;
	@Column(name = "tip_codigo")
	private String tipCodigo;
	@Column(name = "tc_codigo")
	private String tcCodigo;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;
        @Column(name = "vm_exigir_liquidacion")
        private boolean vmExigirLiquidacion;
        @Column(name = "vm_exigir_bodega")
        private boolean vmExigirBodega;

	public InvVentasMotivo() {
	}

	public InvVentasMotivo(InvVentasMotivoPK invVentasMotivoPK) {
		this.invVentasMotivoPK = invVentasMotivoPK;
	}

	public InvVentasMotivo(InvVentasMotivoPK invVentasMotivoPK, String vmDetalle, String vmFormaContabilizar,
			String vmFormaImprimir, boolean vmInactivo, String tipEmpresa, String tipCodigo, String usrEmpresa,
			String usrCodigo, Date usrFechaInserta) {
		this.invVentasMotivoPK = invVentasMotivoPK;
		this.vmDetalle = vmDetalle;
		this.vmFormaContabilizar = vmFormaContabilizar;
		this.vmFormaImprimir = vmFormaImprimir;
		this.vmInactivo = vmInactivo;
		this.tipEmpresa = tipEmpresa;
		this.tipCodigo = tipCodigo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public InvVentasMotivo(String vmEmpresa, String vmCodigo) {
		this.invVentasMotivoPK = new InvVentasMotivoPK(vmEmpresa, vmCodigo);
	}

	public InvVentasMotivoPK getInvVentasMotivoPK() {
		return invVentasMotivoPK;
	}

	public void setInvVentasMotivoPK(InvVentasMotivoPK invVentasMotivoPK) {
		this.invVentasMotivoPK = invVentasMotivoPK;
	}

	public String getVmDetalle() {
		return vmDetalle;
	}

	public void setVmDetalle(String vmDetalle) {
		this.vmDetalle = vmDetalle;
	}

	public String getVmFormaContabilizar() {
		return vmFormaContabilizar;
	}

	public void setVmFormaContabilizar(String vmFormaContabilizar) {
		this.vmFormaContabilizar = vmFormaContabilizar;
	}

	public String getVmFormaImprimir() {
		return vmFormaImprimir;
	}

	public void setVmFormaImprimir(String vmFormaImprimir) {
		this.vmFormaImprimir = vmFormaImprimir;
	}

	public boolean getVmInactivo() {
		return vmInactivo;
	}

	public void setVmInactivo(boolean vmInactivo) {
		this.vmInactivo = vmInactivo;
	}

	public String getTipEmpresa() {
		return tipEmpresa;
	}

	public void setTipEmpresa(String tipEmpresa) {
		this.tipEmpresa = tipEmpresa;
	}

	public String getTipCodigo() {
		return tipCodigo;
	}

	public void setTipCodigo(String tipCodigo) {
		this.tipCodigo = tipCodigo;
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

        public String getTcCodigo() {
            return tcCodigo;
        }

        public void setTcCodigo(String tcCodigo) {
            this.tcCodigo = tcCodigo;
        }

        public boolean isVmExigirLiquidacion() {
            return vmExigirLiquidacion;
        }

        public void setVmExigirLiquidacion(boolean vmExigirLiquidacion) {
            this.vmExigirLiquidacion = vmExigirLiquidacion;
        }

        public boolean isVmExigirBodega() {
            return vmExigirBodega;
        }

        public void setVmExigirBodega(boolean vmExigirBodega) {
            this.vmExigirBodega = vmExigirBodega;
        }

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (invVentasMotivoPK != null ? invVentasMotivoPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvVentasMotivo)) {
			return false;
		}
		InvVentasMotivo other = (InvVentasMotivo) object;
		if ((this.invVentasMotivoPK == null && other.invVentasMotivoPK != null)
				|| (this.invVentasMotivoPK != null && !this.invVentasMotivoPK.equals(other.invVentasMotivoPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvVentasMotivo[ invVentasMotivoPK=" + invVentasMotivoPK + " ]";
	}

}
