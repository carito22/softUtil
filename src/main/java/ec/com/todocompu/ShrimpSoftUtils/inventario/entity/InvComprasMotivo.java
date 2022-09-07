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
@Table(name = "inv_compras_motivo", schema = "inventario")
public class InvComprasMotivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected InvComprasMotivoPK invComprasMotivoPK;
	@Column(name = "cm_detalle")
	private String cmDetalle;
	@Column(name = "cm_forma_contabilizar")
	private String cmFormaContabilizar;
	@Column(name = "cm_forma_imprimir")
	private String cmFormaImprimir;
	@Column(name = "cm_ajustes_de_inventario")
	private boolean cmAjustesDeInventario;
	@Column(name = "cm_inactivo")
	private boolean cmInactivo;
	@Column(name = "tip_empresa")
	private String tipEmpresa;
	@Column(name = "tip_codigo")
	private String tipCodigo;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;
        @Column(name = "cm_imb")
        private boolean cmImb;
        @Column(name = "cm_exigir_liquidacion")
        private boolean cmExigirLiquidacion;
        @Column(name = "cm_exigir_imb")
        private boolean cmExigirImb;
        @Column(name = "cm_exigir_orden_compra")
        private boolean cmExigirOrdenCompra;
        
	public InvComprasMotivo() {
	}

	public InvComprasMotivo(InvComprasMotivoPK invComprasMotivoPK) {
		this.invComprasMotivoPK = invComprasMotivoPK;
	}

	public InvComprasMotivo(InvComprasMotivoPK invComprasMotivoPK, String cmDetalle, String cmFormaContabilizar,
			String cmFormaImprimir, boolean cmAjustesDeInventario, boolean cmInactivo, String usrEmpresa,
			String usrCodigo, Date usrFechaInserta) {
		this.invComprasMotivoPK = invComprasMotivoPK;
		this.cmDetalle = cmDetalle;
		this.cmFormaContabilizar = cmFormaContabilizar;
		this.cmFormaImprimir = cmFormaImprimir;
		this.cmAjustesDeInventario = cmAjustesDeInventario;
		this.cmInactivo = cmInactivo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public InvComprasMotivo(String cmEmpresa, String cmCodigo) {
		this.invComprasMotivoPK = new InvComprasMotivoPK(cmEmpresa, cmCodigo);
	}

	public InvComprasMotivoPK getInvComprasMotivoPK() {
		return invComprasMotivoPK;
	}

	public void setInvComprasMotivoPK(InvComprasMotivoPK invComprasMotivoPK) {
		this.invComprasMotivoPK = invComprasMotivoPK;
	}

	public String getCmDetalle() {
		return cmDetalle;
	}

	public void setCmDetalle(String cmDetalle) {
		this.cmDetalle = cmDetalle;
	}

	public String getCmFormaContabilizar() {
		return cmFormaContabilizar;
	}

	public void setCmFormaContabilizar(String cmFormaContabilizar) {
		this.cmFormaContabilizar = cmFormaContabilizar;
	}

	public String getCmFormaImprimir() {
		return cmFormaImprimir;
	}

	public void setCmFormaImprimir(String cmFormaImprimir) {
		this.cmFormaImprimir = cmFormaImprimir;
	}

	public boolean getCmAjustesDeInventario() {
		return cmAjustesDeInventario;
	}

	public void setCmAjustesDeInventario(boolean cmAjustesDeInventario) {
		this.cmAjustesDeInventario = cmAjustesDeInventario;
	}

	public boolean getCmInactivo() {
		return cmInactivo;
	}

	public void setCmInactivo(boolean cmInactivo) {
		this.cmInactivo = cmInactivo;
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

         public boolean isCmImb() {
            return cmImb;
        }

        public void setCmImb(boolean cmImb) {
            this.cmImb = cmImb;
        }

        public boolean isCmExigirLiquidacion() {
            return cmExigirLiquidacion;
        }

         public void setCmExigirLiquidacion(boolean cmExigirLiquidacion) {
            this.cmExigirLiquidacion = cmExigirLiquidacion;
        }

        public boolean isCmExigirImb() {
            return cmExigirImb;
        }

        public void setCmExigirImb(boolean cmExigirImb) {
            this.cmExigirImb = cmExigirImb;
        }

        public boolean isCmExigirOrdenCompra() {
            return cmExigirOrdenCompra;
        }

        public void setCmExigirOrdenCompra(boolean cmExigirOrdenCompra) {
            this.cmExigirOrdenCompra = cmExigirOrdenCompra;
        }
        
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (invComprasMotivoPK != null ? invComprasMotivoPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvComprasMotivo)) {
			return false;
		}
		InvComprasMotivo other = (InvComprasMotivo) object;
		if ((this.invComprasMotivoPK == null && other.invComprasMotivoPK != null)
				|| (this.invComprasMotivoPK != null && !this.invComprasMotivoPK.equals(other.invComprasMotivoPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvComprasMotivo[ invComprasMotivoPK=" + invComprasMotivoPK + " ]";
	}

}
