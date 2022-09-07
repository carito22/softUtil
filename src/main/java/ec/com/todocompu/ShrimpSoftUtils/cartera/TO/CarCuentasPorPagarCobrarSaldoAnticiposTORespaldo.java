package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarCuentasPorPagarCobrarSaldoAnticiposTORespaldo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "ant_periodo")
	private String antPeriodo;
	@Column(name = "ant_tipo")
	private String antTipo;
	@Column(name = "ant_numero")
	private String antNumero;
	@Column(name = "ant_sector")
	private String antSector;
	@Column(name = "ant_fecha")
	private String antFecha;
	@Column(name = "ant_valor")
	private BigDecimal antValor;
	@Column(name = "ant_proveedor_codigo")
	private String antProveedorCodigo;
	@Column(name = "ant_proveedor_razon_social")
	private String antProveedorRazonSocial;
	@Column(name = "ant_observaciones")
	private String antObservaciones;

	public CarCuentasPorPagarCobrarSaldoAnticiposTORespaldo() {
	}

	public CarCuentasPorPagarCobrarSaldoAnticiposTORespaldo(String antPeriodo, String antTipo, String antNumero,
			String antSector, String antFecha, BigDecimal antValor, String antProveedorCodigo,
			String antProveedorRazonSocial, String antObservaciones, Integer id) {
		this.antPeriodo = antPeriodo;
		this.antTipo = antTipo;
		this.antNumero = antNumero;
		this.antSector = antSector;
		this.antFecha = antFecha;
		this.antValor = antValor;
		this.antProveedorCodigo = antProveedorCodigo;
		this.antProveedorRazonSocial = antProveedorRazonSocial;
		this.antObservaciones = antObservaciones;
		this.id = id;
	}

	public CarCuentasPorPagarCobrarSaldoAnticiposTORespaldo(Integer id, String antPeriodo, String antTipo, String antNumero,
			String antSector, String antFecha, BigDecimal antValor, String antProveedorCodigo,
			String antProveedorRazonSocial) {

		this.id = id;
		this.antPeriodo = antPeriodo;
		this.antTipo = antTipo;
		this.antNumero = antNumero;
		this.antSector = antSector;
		this.antFecha = antFecha;
		this.antValor = antValor;
		this.antProveedorCodigo = antProveedorCodigo;
		this.antProveedorRazonSocial = antProveedorRazonSocial;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAntPeriodo() {
		return antPeriodo;
	}

	public void setAntPeriodo(String antPeriodo) {
		this.antPeriodo = antPeriodo;
	}

	public String getAntTipo() {
		return antTipo;
	}

	public void setAntTipo(String antTipo) {
		this.antTipo = antTipo;
	}

	public String getAntNumero() {
		return antNumero;
	}

	public void setAntNumero(String antNumero) {
		this.antNumero = antNumero;
	}

	public String getAntSector() {
		return antSector;
	}

	public void setAntSector(String antSector) {
		this.antSector = antSector;
	}

	public String getAntFecha() {
		return antFecha;
	}

	public void setAntFecha(String antFecha) {
		this.antFecha = antFecha;
	}

	public BigDecimal getAntValor() {
		return antValor;
	}

	public void setAntValor(BigDecimal antValor) {
		this.antValor = antValor;
	}

	public String getAntProveedorCodigo() {
		return antProveedorCodigo;
	}

	public void setAntProveedorCodigo(String antProveedorCodigo) {
		this.antProveedorCodigo = antProveedorCodigo;
	}

        public String getAntProveedorRazonSocial() {
            return antProveedorRazonSocial;
        }

        public void setAntProveedorRazonSocial(String antProveedorRazonSocial) {
            this.antProveedorRazonSocial = antProveedorRazonSocial;
        }

	public String getAntObservaciones() {
		return antObservaciones;
	}

	public void setAntObservaciones(String antObservaciones) {
		this.antObservaciones = antObservaciones;
	}

}
