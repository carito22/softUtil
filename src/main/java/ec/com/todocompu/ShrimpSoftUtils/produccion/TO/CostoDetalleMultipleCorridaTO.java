
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CostoDetalleMultipleCorridaTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "costo_sector")
	private String costoSector;
	@Column(name = "costo_piscina")
	private String costoPiscina;
	@Column(name = "costo_corrida")
	private String costoCorrida;
	@Column(name = "costo_producto")
	private String costoProducto;
	@Column(name = "costo_codigo")
	private String costoCodigo;
	@Column(name = "costo_medida")
	private String costoMedida;
	@Column(name = "costo_cantidad")
	private BigDecimal costoCantidad;
	@Column(name = "costo_total")
	private BigDecimal costoTotal;
	@Column(name = "costo_porcentaje")
	private BigDecimal costoPorcentaje;

	public CostoDetalleMultipleCorridaTO() {
	}

	public CostoDetalleMultipleCorridaTO(String costoSector, String costoPiscina, String costoCorrida,
			String costoProducto, String costoCodigo, String costoMedida, BigDecimal costoCantidad,
			BigDecimal costoTotal, BigDecimal costoPorcentaje, Integer id) {
		this.costoSector = costoSector;
		this.costoPiscina = costoPiscina;
		this.costoCorrida = costoCorrida;
		this.costoProducto = costoProducto;
		this.costoCodigo = costoCodigo;
		this.costoMedida = costoMedida;
		this.costoCantidad = costoCantidad;
		this.costoTotal = costoTotal;
		this.costoPorcentaje = costoPorcentaje;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getCostoCantidad() {
		return costoCantidad;
	}

	public void setCostoCantidad(BigDecimal costoCantidad) {
		this.costoCantidad = costoCantidad;
	}

	public String getCostoCodigo() {
		return costoCodigo;
	}

	public void setCostoCodigo(String costoCodigo) {
		this.costoCodigo = costoCodigo;
	}

	public String getCostoCorrida() {
		return costoCorrida;
	}

	public void setCostoCorrida(String costoCorrida) {
		this.costoCorrida = costoCorrida;
	}

	public String getCostoMedida() {
		return costoMedida;
	}

	public void setCostoMedida(String costoMedida) {
		this.costoMedida = costoMedida;
	}

	public String getCostoPiscina() {
		return costoPiscina;
	}

	public void setCostoPiscina(String costoPiscina) {
		this.costoPiscina = costoPiscina;
	}

	public BigDecimal getCostoPorcentaje() {
		return costoPorcentaje;
	}

	public void setCostoPorcentaje(BigDecimal costoPorcentaje) {
		this.costoPorcentaje = costoPorcentaje;
	}

	public String getCostoProducto() {
		return costoProducto;
	}

	public void setCostoProducto(String costoProducto) {
		this.costoProducto = costoProducto;
	}

	public String getCostoSector() {
		return costoSector;
	}

	public void setCostoSector(String costoSector) {
		this.costoSector = costoSector;
	}

	public BigDecimal getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(BigDecimal costoTotal) {
		this.costoTotal = costoTotal;
	}
}
