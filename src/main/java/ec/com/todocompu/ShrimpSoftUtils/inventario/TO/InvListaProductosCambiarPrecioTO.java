package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvListaProductosCambiarPrecioTO implements Serializable {
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
	@Column(name = "lpsp_descuento1")
	private BigDecimal stockDescuento1;
	@Column(name = "lpsp_margen_Utilidad1")
	private BigDecimal stockUtilidad1;
	@Column(name = "lpsp_precio2")
	private BigDecimal stockPrecio2;
	@Column(name = "lpsp_descuento2")
	private BigDecimal stockDescuento2;
	@Column(name = "lpsp_margen_Utilidad2")
	private BigDecimal stockUtilidad2;
	@Column(name = "lpsp_precio3")
	private BigDecimal stockPrecio3;
	@Column(name = "lpsp_descuento3")
	private BigDecimal stockDescuento3;
	@Column(name = "lpsp_margen_Utilidad3")
	private BigDecimal stockUtilidad3;
	@Column(name = "lpsp_precio4")
	private BigDecimal stockPrecio4;
	@Column(name = "lpsp_descuento4")
	private BigDecimal stockDescuento4;
	@Column(name = "lpsp_margen_Utilidad4")
	private BigDecimal stockUtilidad4;
	@Column(name = "lpsp_precio5")
	private BigDecimal stockPrecio5;
	@Column(name = "lpsp_descuento5")
	private BigDecimal stockDescuento5;
	@Column(name = "lpsp_margen_Utilidad5")
	private BigDecimal stockUtilidad5;
	@Column(name = "lpsp_iva")
	private String stockGrabaIva;

	public InvListaProductosCambiarPrecioTO() {
	}

	public InvListaProductosCambiarPrecioTO(String proCodigoPrincipal, String proNombre, String proCategoria,
			BigDecimal stockSaldo, BigDecimal stockUltimoCosto, String detalleMedida, BigDecimal stockPrecio1,
			BigDecimal stockDescuento1, BigDecimal stockPrecio2, BigDecimal stockDescuento2, BigDecimal stockPrecio3,
			BigDecimal stockDescuento3, BigDecimal stockPrecio4, BigDecimal stockDescuento4, BigDecimal stockPrecio5,
			BigDecimal stockDescuento5) {
		this.proCodigoPrincipal = proCodigoPrincipal;
		this.proNombre = proNombre;
		this.proCategoria = proCategoria;
		this.stockSaldo = stockSaldo;
		this.stockUltimoCosto = stockUltimoCosto;
		this.detalleMedida = detalleMedida;
		this.stockPrecio1 = stockPrecio1;
		this.stockDescuento1 = stockDescuento1;
		this.stockPrecio2 = stockPrecio2;
		this.stockDescuento2 = stockDescuento2;
		this.stockPrecio3 = stockPrecio3;
		this.stockDescuento3 = stockDescuento3;
		this.stockPrecio4 = stockPrecio4;
		this.stockDescuento4 = stockDescuento4;
		this.stockPrecio5 = stockPrecio5;
		this.stockDescuento5 = stockDescuento5;
	}

	public InvListaProductosCambiarPrecioTO(String proCodigoPrincipal, String proNombre, String proCategoria,
			BigDecimal stockSaldo, BigDecimal stockUltimoCosto, String detalleMedida, BigDecimal stockPrecio1,
			BigDecimal stockUtilidad1, BigDecimal stockPrecio2, BigDecimal stockUtilidad2, BigDecimal stockPrecio3,
			BigDecimal stockUtilidad3, BigDecimal stockPrecio4, BigDecimal stockUtilidad4, BigDecimal stockPrecio5,
			BigDecimal stockUtilidad5, boolean utilidad) {
		this.proCodigoPrincipal = proCodigoPrincipal;
		this.proNombre = proNombre;
		this.proCategoria = proCategoria;
		this.stockSaldo = stockSaldo;
		this.stockUltimoCosto = stockUltimoCosto;
		this.detalleMedida = detalleMedida;
		this.stockPrecio1 = stockPrecio1;
		this.stockUtilidad1 = stockUtilidad1;
		this.stockPrecio2 = stockPrecio2;
		this.stockUtilidad2 = stockUtilidad2;
		this.stockPrecio3 = stockPrecio3;
		this.stockUtilidad3 = stockUtilidad3;
		this.stockPrecio4 = stockPrecio4;
		this.stockUtilidad4 = stockUtilidad4;
		this.stockPrecio5 = stockPrecio5;
		this.stockUtilidad5 = stockUtilidad5;
	}

	public InvListaProductosCambiarPrecioTO(Integer id, String proCodigoPrincipal, String proNombre,
			String proCategoria, BigDecimal stockSaldo, BigDecimal stockUltimoCosto, BigDecimal stockCostoPromedio,
			String detalleMedida, BigDecimal stockPrecio1, BigDecimal stockDescuento1, BigDecimal stockPrecio2,
			BigDecimal stockDescuento2, BigDecimal stockPrecio3, BigDecimal stockDescuento3, BigDecimal stockPrecio4,
			BigDecimal stockDescuento4, BigDecimal stockPrecio5, BigDecimal stockDescuento5, String stockGrabaIva) {
		this.id = id;
		this.proCodigoPrincipal = proCodigoPrincipal;
		this.proNombre = proNombre;
		this.proCategoria = proCategoria;
		this.stockSaldo = stockSaldo;
		this.stockUltimoCosto = stockUltimoCosto;
		this.stockCostoPromedio = stockCostoPromedio;
		this.detalleMedida = detalleMedida;
		this.stockPrecio1 = stockPrecio1;
		this.stockDescuento1 = stockDescuento1;
		this.stockPrecio2 = stockPrecio2;
		this.stockDescuento2 = stockDescuento2;
		this.stockPrecio3 = stockPrecio3;
		this.stockDescuento3 = stockDescuento3;
		this.stockPrecio4 = stockPrecio4;
		this.stockDescuento4 = stockDescuento4;
		this.stockPrecio5 = stockPrecio5;
		this.stockDescuento5 = stockDescuento5;
		this.stockGrabaIva = stockGrabaIva;
	}

	public InvListaProductosCambiarPrecioTO(Integer id, String proCodigoPrincipal, String proNombre,
			String proCategoria, BigDecimal stockSaldo, BigDecimal stockUltimoCosto, BigDecimal stockCostoPromedio,
			String detalleMedida, BigDecimal stockPrecio1, BigDecimal stockDescuento1, BigDecimal stockUtilidad1,
			BigDecimal stockPrecio2, BigDecimal stockDescuento2, BigDecimal stockUtilidad2, BigDecimal stockPrecio3,
			BigDecimal stockDescuento3, BigDecimal stockUtilidad3, BigDecimal stockPrecio4, BigDecimal stockDescuento4,
			BigDecimal stockUtilidad4, BigDecimal stockPrecio5, BigDecimal stockDescuento5, BigDecimal stockUtilidad5,
			String stockGrabaIva) {
		this.id = id;
		this.proCodigoPrincipal = proCodigoPrincipal;
		this.proNombre = proNombre;
		this.proCategoria = proCategoria;
		this.stockSaldo = stockSaldo;
		this.stockUltimoCosto = stockUltimoCosto;
		this.stockCostoPromedio = stockCostoPromedio;
		this.detalleMedida = detalleMedida;
		this.stockPrecio1 = stockPrecio1;
		this.stockDescuento1 = stockDescuento1;
		this.stockUtilidad1 = stockUtilidad1;
		this.stockPrecio2 = stockPrecio2;
		this.stockDescuento2 = stockDescuento2;
		this.stockUtilidad2 = stockUtilidad2;
		this.stockPrecio3 = stockPrecio3;
		this.stockDescuento3 = stockDescuento3;
		this.stockUtilidad3 = stockUtilidad3;
		this.stockPrecio4 = stockPrecio4;
		this.stockDescuento4 = stockDescuento4;
		this.stockUtilidad4 = stockUtilidad4;
		this.stockPrecio5 = stockPrecio5;
		this.stockDescuento5 = stockDescuento5;
		this.stockUtilidad5 = stockUtilidad5;
		this.stockGrabaIva = stockGrabaIva;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getProCategoria() {
		return proCategoria;
	}

	public void setProCategoria(String proCategoria) {
		this.proCategoria = proCategoria;
	}

	public BigDecimal getStockSaldo() {
		return stockSaldo;
	}

	public void setStockSaldo(BigDecimal stockSaldo) {
		this.stockSaldo = stockSaldo;
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

	public String getDetalleMedida() {
		return detalleMedida;
	}

	public void setDetalleMedida(String detalleMedida) {
		this.detalleMedida = detalleMedida;
	}

	public BigDecimal getStockPrecio1() {
		return stockPrecio1;
	}

	public void setStockPrecio1(BigDecimal stockPrecio1) {
		this.stockPrecio1 = stockPrecio1;
	}

	public BigDecimal getStockDescuento1() {
		return stockDescuento1;
	}

	public void setStockDescuento1(BigDecimal stockDescuento1) {
		this.stockDescuento1 = stockDescuento1;
	}

	public BigDecimal getStockPrecio2() {
		return stockPrecio2;
	}

	public void setStockPrecio2(BigDecimal stockPrecio2) {
		this.stockPrecio2 = stockPrecio2;
	}

	public BigDecimal getStockDescuento2() {
		return stockDescuento2;
	}

	public void setStockDescuento2(BigDecimal stockDescuento2) {
		this.stockDescuento2 = stockDescuento2;
	}

	public BigDecimal getStockPrecio3() {
		return stockPrecio3;
	}

	public void setStockPrecio3(BigDecimal stockPrecio3) {
		this.stockPrecio3 = stockPrecio3;
	}

	public BigDecimal getStockDescuento3() {
		return stockDescuento3;
	}

	public void setStockDescuento3(BigDecimal stockDescuento3) {
		this.stockDescuento3 = stockDescuento3;
	}

	public BigDecimal getStockPrecio4() {
		return stockPrecio4;
	}

	public void setStockPrecio4(BigDecimal stockPrecio4) {
		this.stockPrecio4 = stockPrecio4;
	}

	public BigDecimal getStockDescuento4() {
		return stockDescuento4;
	}

	public void setStockDescuento4(BigDecimal stockDescuento4) {
		this.stockDescuento4 = stockDescuento4;
	}

	public BigDecimal getStockPrecio5() {
		return stockPrecio5;
	}

	public void setStockPrecio5(BigDecimal stockPrecio5) {
		this.stockPrecio5 = stockPrecio5;
	}

	public BigDecimal getStockDescuento5() {
		return stockDescuento5;
	}

	public void setStockDescuento5(BigDecimal stockDescuento5) {
		this.stockDescuento5 = stockDescuento5;
	}

	public String getStockGrabaIva() {
		return stockGrabaIva;
	}

	public void setStockGrabaIva(String stockGrabaIva) {
		this.stockGrabaIva = stockGrabaIva;
	}

	public BigDecimal getStockUtilidad1() {
		return stockUtilidad1;
	}

	public void setStockUtilidad1(BigDecimal stockUtilidad1) {
		this.stockUtilidad1 = stockUtilidad1;
	}

	public BigDecimal getStockUtilidad2() {
		return stockUtilidad2;
	}

	public void setStockUtilidad2(BigDecimal stockUtilidad2) {
		this.stockUtilidad2 = stockUtilidad2;
	}

	public BigDecimal getStockUtilidad3() {
		return stockUtilidad3;
	}

	public void setStockUtilidad3(BigDecimal stockUtilidad3) {
		this.stockUtilidad3 = stockUtilidad3;
	}

	public BigDecimal getStockUtilidad4() {
		return stockUtilidad4;
	}

	public void setStockUtilidad4(BigDecimal stockUtilidad4) {
		this.stockUtilidad4 = stockUtilidad4;
	}

	public BigDecimal getStockUtilidad5() {
		return stockUtilidad5;
	}

	public void setStockUtilidad5(BigDecimal stockUtilidad5) {
		this.stockUtilidad5 = stockUtilidad5;
	}

}
