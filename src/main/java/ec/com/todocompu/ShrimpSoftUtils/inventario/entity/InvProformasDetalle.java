package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "inv_proformas_detalle", schema = "inventario")
public class InvProformasDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "det_secuencial")
	private Integer detSecuencial;
	@Column(name = "det_orden")
	private Integer detOrden;
	@Column(name = "det_cantidad")
	private BigDecimal detCantidad;
	@Column(name = "det_precio")
	private BigDecimal detPrecio;
	@Column(name = "det_porcentaje_recargo")
	private BigDecimal detPorcentajeRecargo;
	@Column(name = "det_porcentaje_descuento")
	private BigDecimal detPorcentajeDescuento;
	@Column(name = "pro_nombre")
	private String proNombre;
	@JoinColumns({ @JoinColumn(name = "prof_empresa", referencedColumnName = "prof_empresa"),
			@JoinColumn(name = "prof_periodo", referencedColumnName = "prof_periodo"),
			@JoinColumn(name = "prof_motivo", referencedColumnName = "prof_motivo"),
			@JoinColumn(name = "prof_numero", referencedColumnName = "prof_numero") })
	@ManyToOne(optional = false)
	private InvProformas invProformas;
	@JoinColumns({ @JoinColumn(name = "pro_empresa", referencedColumnName = "pro_empresa"),
			@JoinColumn(name = "pro_codigo_principal", referencedColumnName = "pro_codigo_principal") })
	@ManyToOne(optional = false)
	private InvProducto invProducto;

	public InvProformasDetalle() {
	}

	public InvProformasDetalle(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public InvProformasDetalle(Integer detSecuencial, String proNombre) {
		this.detSecuencial = detSecuencial;
		this.proNombre = proNombre;
	}

	public Integer getDetSecuencial() {
		return detSecuencial;
	}

	public void setDetSecuencial(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public Integer getDetOrden() {
		return detOrden;
	}

	public void setDetOrden(Integer detOrden) {
		this.detOrden = detOrden;
	}

	public BigDecimal getDetCantidad() {
		return detCantidad;
	}

	public void setDetCantidad(BigDecimal detCantidad) {
		this.detCantidad = detCantidad;
	}

	public BigDecimal getDetPrecio() {
		return detPrecio;
	}

	public void setDetPrecio(BigDecimal detPrecio) {
		this.detPrecio = detPrecio;
	}

	public BigDecimal getDetPorcentajeRecargo() {
		return detPorcentajeRecargo;
	}

	public void setDetPorcentajeRecargo(BigDecimal detPorcentajeRecargo) {
		this.detPorcentajeRecargo = detPorcentajeRecargo;
	}

	public BigDecimal getDetPorcentajeDescuento() {
		return detPorcentajeDescuento;
	}

	public void setDetPorcentajeDescuento(BigDecimal detPorcentajeDescuento) {
		this.detPorcentajeDescuento = detPorcentajeDescuento;
	}

	public String getProNombre() {
		return proNombre;
	}

	public void setProNombre(String proNombre) {
		this.proNombre = proNombre;
	}

	public InvProformas getInvProformas() {
		return invProformas;
	}

	public void setInvProformas(InvProformas invProformas) {
		this.invProformas = invProformas;
	}

	public InvProducto getInvProducto() {
		return invProducto;
	}

	public void setInvProducto(InvProducto invProducto) {
		this.invProducto = invProducto;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (detSecuencial != null ? detSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvProformasDetalle)) {
			return false;
		}
		InvProformasDetalle other = (InvProformasDetalle) object;
		if ((this.detSecuencial == null && other.detSecuencial != null)
				|| (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvProformasDetalle[ detSecuencial=" + detSecuencial + " ]";
	}

}
