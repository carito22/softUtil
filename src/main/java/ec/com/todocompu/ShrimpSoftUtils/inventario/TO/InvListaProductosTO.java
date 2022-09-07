package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvListaProductosTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "lpsp_codigo_principal")
	private String proCodigoPrincipal;
	@Column(name = "lpsp_codigo_barra")
	private String proCodigoBarra;
	@Column(name = "lpsp_codigo_barra2")
	private String proCodigoBarra2;
	@Column(name = "lpsp_codigo_barra3")
	private String proCodigoBarra3;
	@Column(name = "lpsp_codigo_barra4")
	private String proCodigoBarra4;
	@Column(name = "lpsp_codigo_barra5")
	private String proCodigoBarra5;
	@Column(name = "lpsp_nombre")
	private String proNombre;
	@Column(name = "lpsp_categoria")
	private String proCategoria;
	@Column(name = "lpsp_empaque")
	private String proEmpaque;
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
	@Column(name = "lpsp_precio2")
	private BigDecimal stockPrecio2;
	@Column(name = "lpsp_precio3")
	private BigDecimal stockPrecio3;
	@Column(name = "lpsp_precio4")
	private BigDecimal stockPrecio4;
	@Column(name = "lpsp_precio5")
	private BigDecimal stockPrecio5;
	@Column(name = "lpsp_precio_caja")
	private BigDecimal stockPrecioCaja;

	@Column(name = "lpsp_iva")
	private String proGravaIva;
        @Column(name = "lpsp_porcentaje_ice")
        private BigDecimal icePorcentaje;
        @Column(name = "lpsp_tarifa_fija_ice")
        private BigDecimal iceTarifaFija;
        @Column(name = "lpsp_ice_codigo")
        private String iceCodigo;

	public InvListaProductosTO() {
	}

	public InvListaProductosTO(Integer id, String proCodigoPrincipal, String proCodigoBarra, String proCodigoBarra2,
			String proCodigoBarra3, String proCodigoBarra4, String proCodigoBarra5, String proNombre,
			String proCategoria, String proEmpaque, BigDecimal stockSaldo, BigDecimal stockUltimoCosto,
			BigDecimal stockCostoPromedio, String detalleMedida, BigDecimal stockPrecio1, BigDecimal stockPrecio2,
			BigDecimal stockPrecio3, BigDecimal stockPrecio4, BigDecimal stockPrecio5, BigDecimal stockPrecioCaja,
			String proGravaIva) {
		this.id = id;
		this.proCodigoPrincipal = proCodigoPrincipal;
		this.proCodigoBarra = proCodigoBarra;
		this.proCodigoBarra2 = proCodigoBarra2;
		this.proCodigoBarra3 = proCodigoBarra3;
		this.proCodigoBarra4 = proCodigoBarra4;
		this.proCodigoBarra5 = proCodigoBarra5;
		this.proNombre = proNombre;
		this.proCategoria = proCategoria;
		this.proEmpaque = proEmpaque;
		this.stockSaldo = stockSaldo;
		this.stockUltimoCosto = stockUltimoCosto;
		this.stockCostoPromedio = stockCostoPromedio;
		this.detalleMedida = detalleMedida;
		this.stockPrecio1 = stockPrecio1;
		this.stockPrecio2 = stockPrecio2;
		this.stockPrecio3 = stockPrecio3;
		this.stockPrecio4 = stockPrecio4;
		this.stockPrecio5 = stockPrecio5;
		this.stockPrecioCaja = stockPrecioCaja;
		this.proGravaIva = proGravaIva;
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

	public String getProCodigoBarra() {
		return proCodigoBarra;
	}

	public void setProCodigoBarra(String proCodigoBarra) {
		this.proCodigoBarra = proCodigoBarra;
	}

	public String getProCodigoBarra2() {
		return proCodigoBarra2;
	}

	public void setProCodigoBarra2(String proCodigoBarra2) {
		this.proCodigoBarra2 = proCodigoBarra2;
	}

	public String getProCodigoBarra3() {
		return proCodigoBarra3;
	}

	public void setProCodigoBarra3(String proCodigoBarra3) {
		this.proCodigoBarra3 = proCodigoBarra3;
	}

	public String getProCodigoBarra4() {
		return proCodigoBarra4;
	}

	public void setProCodigoBarra4(String proCodigoBarra4) {
		this.proCodigoBarra4 = proCodigoBarra4;
	}

	public String getProCodigoBarra5() {
		return proCodigoBarra5;
	}

	public void setProCodigoBarra5(String proCodigoBarra5) {
		this.proCodigoBarra5 = proCodigoBarra5;
	}

	public String getProCodigoPrincipal() {
		return proCodigoPrincipal;
	}

	public void setProCodigoPrincipal(String proCodigoPrincipal) {
		this.proCodigoPrincipal = proCodigoPrincipal;
	}

	public String getProEmpaque() {
		return proEmpaque;
	}

	public void setProEmpaque(String proEmpaque) {
		this.proEmpaque = proEmpaque;
	}

	public String getProGravaIva() {
		return proGravaIva;
	}

	public void setProGravaIva(String proGravaIva) {
		this.proGravaIva = proGravaIva;
	}

	public String getProNombre() {
		return proNombre;
	}

	public void setProNombre(String proNombre) {
		this.proNombre = proNombre;
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

	public BigDecimal getStockPrecioCaja() {
		return stockPrecioCaja;
	}

	public void setStockPrecioCaja(BigDecimal stockPrecioCaja) {
		this.stockPrecioCaja = stockPrecioCaja;
	}

	public BigDecimal getStockSaldo() {
		return stockSaldo;
	}

	public void setStockSaldo(BigDecimal stockSaldo) {
		this.stockSaldo = stockSaldo;
	}

        public BigDecimal getIcePorcentaje() {
            return icePorcentaje;
        }

        public void setIcePorcentaje(BigDecimal icePorcentaje) {
            this.icePorcentaje = icePorcentaje;
        }

        public BigDecimal getIceTarifaFija() {
            return iceTarifaFija;
        }

        public void setIceTarifaFija(BigDecimal iceTarifaFija) {
            this.iceTarifaFija = iceTarifaFija;
        }

        public String getIceCodigo() {
            return iceCodigo;
        }

        public void setIceCodigo(String iceCodigo) {
            this.iceCodigo = iceCodigo;
        }

}
