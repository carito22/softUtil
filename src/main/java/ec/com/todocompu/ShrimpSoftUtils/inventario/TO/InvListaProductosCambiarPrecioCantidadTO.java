package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvListaProductosCambiarPrecioCantidadTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "lpsp_codigo_principal")
	private String proCodigoPrincipal;
	@Column(name = "lpsp_nombre")
	private String proNombre;
	@Column(name = "lpsp_categoria")
	private String proCategoria;
	@Column(name = "lpsp_saldo")
	private BigDecimal stockSaldo;
	@Column(name = "lpsp_ultimo_costo")
	private BigDecimal stockUltimoCosto;
	@Column(name = "lpsp_costo_promedio")
	private BigDecimal stockCostoPromedio;
	@Column(name = "lpsp_medida")
	private String detalleMedida;
	@Column(name = "lpsp_precio1")
	private BigDecimal stockPrecio1;
	@Column(name = "lpsp_cantidad1")
	private BigDecimal stockCantidad1;
	@Column(name = "lpsp_precio2")
	private BigDecimal stockPrecio2;
	@Column(name = "lpsp_cantidad2")
	private BigDecimal stockCantidad2;
	@Column(name = "lpsp_precio3")
	private BigDecimal stockPrecio3;
	@Column(name = "lpsp_cantidad3")
	private BigDecimal stockCantidad3;
	@Column(name = "lpsp_precio4")
	private BigDecimal stockPrecio4;
	@Column(name = "lpsp_cantidad4")
	private BigDecimal stockCantidad4;
	@Column(name = "lpsp_precio5")
	private BigDecimal stockPrecio5;
	@Column(name = "lpsp_cantidad5")
	private BigDecimal stockCantidad5;
	@Column(name = "lpsp_iva")
	private String stockGrabaIva;

	public InvListaProductosCambiarPrecioCantidadTO() {
	}

	public InvListaProductosCambiarPrecioCantidadTO(String proCodigoPrincipal, String proNombre, String proCategoria,
			BigDecimal stockSaldo, BigDecimal stockUltimoCosto, String detalleMedida, BigDecimal stockPrecio1,
			BigDecimal stockCantidad1, BigDecimal stockPrecio2, BigDecimal stockCantidad2, BigDecimal stockPrecio3,
			BigDecimal stockCantidad3, BigDecimal stockPrecio4, BigDecimal stockCantidad4, BigDecimal stockPrecio5,
			BigDecimal stockCantidad5) {
		this.proCodigoPrincipal = proCodigoPrincipal;
		this.proNombre = proNombre;
		this.proCategoria = proCategoria;
		this.stockSaldo = stockSaldo;
		this.stockUltimoCosto = stockUltimoCosto;
		this.detalleMedida = detalleMedida;
		this.stockPrecio1 = stockPrecio1;
		this.stockCantidad1 = stockCantidad1;
		this.stockPrecio2 = stockPrecio2;
		this.stockCantidad2 = stockCantidad2;
		this.stockPrecio3 = stockPrecio3;
		this.stockCantidad3 = stockCantidad3;
		this.stockPrecio4 = stockPrecio4;
		this.stockCantidad4 = stockCantidad4;
		this.stockPrecio5 = stockPrecio5;
		this.stockCantidad5 = stockCantidad5;
	}

	public InvListaProductosCambiarPrecioCantidadTO(Integer id, String proCodigoPrincipal, String proNombre,
			String proCategoria, BigDecimal stockSaldo, BigDecimal stockUltimoCosto, BigDecimal stockCostoPromedio,
			String detalleMedida, BigDecimal stockPrecio1, BigDecimal stockCantidad1, BigDecimal stockPrecio2,
			BigDecimal stockCantidad2, BigDecimal stockPrecio3, BigDecimal stockCantidad3, BigDecimal stockPrecio4,
			BigDecimal stockCantidad4, BigDecimal stockPrecio5, BigDecimal stockCantidad5, String stockGrabaIva) {
		this.id = id;
		this.proCodigoPrincipal = proCodigoPrincipal;
		this.proNombre = proNombre;
		this.proCategoria = proCategoria;
		this.stockSaldo = stockSaldo;
		this.stockUltimoCosto = stockUltimoCosto;
		this.stockCostoPromedio = stockCostoPromedio;
		this.detalleMedida = detalleMedida;
		this.stockPrecio1 = stockPrecio1;
		this.stockCantidad1 = stockCantidad1;
		this.stockPrecio2 = stockPrecio2;
		this.stockCantidad2 = stockCantidad2;
		this.stockPrecio3 = stockPrecio3;
		this.stockCantidad3 = stockCantidad3;
		this.stockPrecio4 = stockPrecio4;
		this.stockCantidad4 = stockCantidad4;
		this.stockPrecio5 = stockPrecio5;
		this.stockCantidad5 = stockCantidad5;
		this.stockGrabaIva = stockGrabaIva;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDetalleMedida() {
		return detalleMedida;
	}

	public void setDetalleMedida(String detalleMedida) {
		this.detalleMedida = detalleMedida;
	}

	public String getProCategoria() {
		return proCategoria;
	}

	public void setProCategoria(String proCategoria) {
		this.proCategoria = proCategoria;
	}

	public String getProCodigoPrincipal() {
		return proCodigoPrincipal;
	}

	public void setProCodigoPrincipal(String proCodigoPrincipal) {
		this.proCodigoPrincipal = proCodigoPrincipal;
	}

	public String getProNombre() {
		return proNombre;
	}

	public void setProNombre(String proNombre) {
		this.proNombre = proNombre;
	}

	public BigDecimal getStockCantidad1() {
		return stockCantidad1;
	}

	public void setStockCantidad1(BigDecimal stockCantidad1) {
		this.stockCantidad1 = stockCantidad1;
	}

	public BigDecimal getStockCantidad2() {
		return stockCantidad2;
	}

	public void setStockCantidad2(BigDecimal stockCantidad2) {
		this.stockCantidad2 = stockCantidad2;
	}

	public BigDecimal getStockCantidad3() {
		return stockCantidad3;
	}

	public void setStockCantidad3(BigDecimal stockCantidad3) {
		this.stockCantidad3 = stockCantidad3;
	}

	public BigDecimal getStockCantidad4() {
		return stockCantidad4;
	}

	public void setStockCantidad4(BigDecimal stockCantidad4) {
		this.stockCantidad4 = stockCantidad4;
	}

	public BigDecimal getStockCantidad5() {
		return stockCantidad5;
	}

	public void setStockCantidad5(BigDecimal stockCantidad5) {
		this.stockCantidad5 = stockCantidad5;
	}

	public BigDecimal getStockUltimoCosto() {
		return stockUltimoCosto;
	}

	public void setStockUltimoCosto(BigDecimal stockUltimoCosto) {
		this.stockUltimoCosto = stockUltimoCosto;
	}

	public BigDecimal getStockCostoPromedio() {
		return stockCostoPromedio;
	}

	public void setStockCostoPromedio(BigDecimal stockCostoPromedio) {
		this.stockCostoPromedio = stockCostoPromedio;
	}

	public String getStockGrabaIva() {
		return stockGrabaIva;
	}

	public void setStockGrabaIva(String stockGrabaIva) {
		this.stockGrabaIva = stockGrabaIva;
	}

	public BigDecimal getStockPrecio1() {
		return stockPrecio1;
	}

	public void setStockPrecio1(BigDecimal stockPrecio1) {
		this.stockPrecio1 = stockPrecio1;
	}

	public BigDecimal getStockPrecio2() {
		return stockPrecio2;
	}

	public void setStockPrecio2(BigDecimal stockPrecio2) {
		this.stockPrecio2 = stockPrecio2;
	}

	public BigDecimal getStockPrecio3() {
		return stockPrecio3;
	}

	public void setStockPrecio3(BigDecimal stockPrecio3) {
		this.stockPrecio3 = stockPrecio3;
	}

	public BigDecimal getStockPrecio4() {
		return stockPrecio4;
	}

	public void setStockPrecio4(BigDecimal stockPrecio4) {
		this.stockPrecio4 = stockPrecio4;
	}

	public BigDecimal getStockPrecio5() {
		return stockPrecio5;
	}

	public void setStockPrecio5(BigDecimal stockPrecio5) {
		this.stockPrecio5 = stockPrecio5;
	}

	public BigDecimal getStockSaldo() {
		return stockSaldo;
	}

	public void setStockSaldo(BigDecimal stockSaldo) {
		this.stockSaldo = stockSaldo;
	}
}
