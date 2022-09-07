package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdCostoTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "costo_sector_piscina")
	private String costoSectorPiscina;
	@Column(name = "costo_producto")
	private String costoProducto;
	@Column(name = "costo_codigo")
	private String costoCodigo;
	@Column(name = "costo_medida")
	private String costoMedida;
	@Column(name = "costo_total")
	private BigDecimal costoTotal;

	public PrdCostoTO() {
	}

	public PrdCostoTO(String costoSectorPiscina, String costoProducto, String costoCodigo, String costoMedida,
			BigDecimal costoTotal, Integer id) {
		this.costoSectorPiscina = costoSectorPiscina;
		this.costoProducto = costoProducto;
		this.costoCodigo = costoCodigo;
		this.costoMedida = costoMedida;
		this.costoTotal = costoTotal;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCostoCodigo() {
		return costoCodigo;
	}

	public void setCostoCodigo(String costoCodigo) {
		this.costoCodigo = costoCodigo;
	}

	public String getCostoMedida() {
		return costoMedida;
	}

	public void setCostoMedida(String costoMedida) {
		this.costoMedida = costoMedida;
	}

	public String getCostoProducto() {
		return costoProducto;
	}

	public void setCostoProducto(String costoProducto) {
		this.costoProducto = costoProducto;
	}

	public String getCostoSectorPiscina() {
		return costoSectorPiscina;
	}

	public void setCostoSectorPiscina(String costoSectorPiscina) {
		this.costoSectorPiscina = costoSectorPiscina;
	}

	public BigDecimal getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(BigDecimal costoTotal) {
		this.costoTotal = costoTotal;
	}
}
