package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

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
@Table(name = "prd_preliquidacion_detalle", schema = "produccion")
public class PrdPreLiquidacionDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer detSecuencial;
	private int detOrden;
	private BigDecimal detLibras;
	private BigDecimal detPrecio;
	private PrdProducto prdProducto;
	private PrdTalla prdTalla;
	private PrdPreLiquidacion prdPreLiquidacion;

	public PrdPreLiquidacionDetalle() {
	}

	public PrdPreLiquidacionDetalle(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public PrdPreLiquidacionDetalle(Integer detSecuencial, int detOrden, BigDecimal detLibras, BigDecimal detPrecio) {
		this.detSecuencial = detSecuencial;
		this.detOrden = detOrden;
		this.detLibras = detLibras;
		this.detPrecio = detPrecio;
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

	@Column(name = "det_libras")
	public BigDecimal getDetLibras() {
		return detLibras;
	}

	public void setDetLibras(BigDecimal detLibras) {
		this.detLibras = detLibras;
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
	public PrdTalla getPrdTalla() {
		return prdTalla;
	}

	public void setPrdTalla(PrdTalla prdTalla) {
		this.prdTalla = prdTalla;
	}

	@JoinColumns({ @JoinColumn(name = "prod_empresa", referencedColumnName = "prod_empresa"),
			@JoinColumn(name = "prod_codigo", referencedColumnName = "prod_codigo") })
	@ManyToOne(optional = false)
	public PrdProducto getPrdProducto() {
		return prdProducto;
	}

	public void setPrdProducto(PrdProducto prdProducto) {
		this.prdProducto = prdProducto;
	}

	@JoinColumns({ @JoinColumn(name = "pl_empresa", referencedColumnName = "pl_empresa"),
			@JoinColumn(name = "pl_motivo", referencedColumnName = "pl_motivo"),
			@JoinColumn(name = "pl_numero", referencedColumnName = "pl_numero") })
	@ManyToOne(optional = false)
	@JsonIgnore
	public PrdPreLiquidacion getPrdPreLiquidacion() {
		return prdPreLiquidacion;
	}

	public void setPrdPreLiquidacion(PrdPreLiquidacion prdPreLiquidacion) {
		this.prdPreLiquidacion = prdPreLiquidacion;
	}

	public BigDecimal totalPrecio() {
		if (detLibras == null || detPrecio == null)
			return new BigDecimal("0.00");
		return (detLibras.divide(new BigDecimal("2.2"), 2, RoundingMode.HALF_EVEN)).multiply(detPrecio);
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (detSecuencial != null ? detSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdPreLiquidacionDetalle)) {
			return false;
		}
		PrdPreLiquidacionDetalle other = (PrdPreLiquidacionDetalle) object;
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
