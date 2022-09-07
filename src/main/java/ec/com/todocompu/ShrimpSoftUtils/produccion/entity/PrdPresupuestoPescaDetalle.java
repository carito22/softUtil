package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "prd_presupuesto_pesca_detalle", schema = "produccion")
public class PrdPresupuestoPescaDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer detSecuencial;
	private int detOrden;
	private int detCantidad;
	private BigDecimal detGramos;
	private BigDecimal detPorcentaje;
	private BigDecimal detPrecio;
	private PrdTalla prdLiquidacionTalla;
	private PrdPresupuestoPesca prdPresupuestoPesca;

	public PrdPresupuestoPescaDetalle() {
	}

	public PrdPresupuestoPescaDetalle(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public PrdPresupuestoPescaDetalle(Integer detSecuencial, int detOrden, int detCantidad, BigDecimal detGramos,
			BigDecimal detPorcentaje, BigDecimal detPrecio, PrdTalla prdLiquidacionTalla,
			PrdPresupuestoPesca prdPresupuestoPesca) {
		this.detSecuencial = detSecuencial;
		this.detOrden = detOrden;
		this.detCantidad = detCantidad;
		this.detGramos = detGramos;
		this.detPorcentaje = detPorcentaje;
		this.detPrecio = detPrecio;
		this.prdLiquidacionTalla = prdLiquidacionTalla;
		this.prdPresupuestoPesca = prdPresupuestoPesca;
	}

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "det_secuencial")
	public Integer getDetSecuencial() {
		return detSecuencial;
	}

	public void setDetSecuencial(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	@Column(name = "det_orden")
	public int getDetOrden() {
		return detOrden;
	}

	public void setDetOrden(int detOrden) {
		this.detOrden = detOrden;
	}

	@Column(name = "det_cantidad")
	public int getDetCantidad() {
		return detCantidad;
	}

	public void setDetCantidad(int detCantidad) {
		this.detCantidad = detCantidad;
	}

	@Column(name = "det_gramos")
	public BigDecimal getDetGramos() {
		return detGramos;
	}

	public void setDetGramos(BigDecimal detGramos) {
		this.detGramos = detGramos;
	}

	@Column(name = "det_porcentaje")
	public BigDecimal getDetPorcentaje() {
		return detPorcentaje;
	}

	public void setDetPorcentaje(BigDecimal detPorcentaje) {
		this.detPorcentaje = detPorcentaje;
	}

	@Column(name = "det_precio")
	public BigDecimal getDetPrecio() {
		return detPrecio;
	}

	public void setDetPrecio(BigDecimal detPrecio) {
		this.detPrecio = detPrecio;
	}

	@JoinColumns({ @JoinColumn(name = "talla_empresa", referencedColumnName = "talla_empresa"),
			@JoinColumn(name = "talla_codigo", referencedColumnName = "talla_codigo") })
	@ManyToOne(optional = false)
	public PrdTalla getPrdLiquidacionTalla() {
		return prdLiquidacionTalla;
	}

	public void setPrdLiquidacionTalla(PrdTalla prdLiquidacionTalla) {
		this.prdLiquidacionTalla = prdLiquidacionTalla;
	}

	@JoinColumns({ @JoinColumn(name = "presu_empresa", referencedColumnName = "presu_empresa"),
			@JoinColumn(name = "presu_motivo", referencedColumnName = "presu_motivo"),
			@JoinColumn(name = "presu_numero", referencedColumnName = "presu_numero") })
	@ManyToOne(optional = false)
	@JsonIgnore
	public PrdPresupuestoPesca getPrdPresupuestoPesca() {
		return prdPresupuestoPesca;
	}

	public void setPrdPresupuestoPesca(PrdPresupuestoPesca prdPresupuestoPesca) {
		this.prdPresupuestoPesca = prdPresupuestoPesca;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (detSecuencial != null ? detSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdPresupuestoPescaDetalle)) {
			return false;
		}
		PrdPresupuestoPescaDetalle other = (PrdPresupuestoPescaDetalle) object;
		if ((this.detSecuencial == null && other.detSecuencial != null)
				|| (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdLiquidacionDetalle[ detSecuencial=" + detSecuencial + " ]";
	}

}
