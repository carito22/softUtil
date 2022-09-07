package ec.com.todocompu.ShrimpSoftUtils.caja.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CajCuadreCajaTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	
	@Column(name = "cua_detalle")
	private String cuadrarCaja;

	@Column(name = "cua_cantidad")
	private Integer cuaCantidad;

	@Column(name = "cua_base0")
	private BigDecimal cuaBase0;

	@Column(name = "cua_base_imponible")
	private BigDecimal cuaBaseImponible;

	@Column(name = "cua_monto_iva")
	private BigDecimal cuaMontoIva;

	@Column(name = "cua_total")
	private BigDecimal cuaTotal;

	public CajCuadreCajaTO() {
	}

	public CajCuadreCajaTO(String cuadrarCaja, Integer cuaCantidad, BigDecimal cuaBase0, BigDecimal cuaBaseImponible,
			BigDecimal cuaMontoIva, BigDecimal cuaTotal, Integer id) {
		this.cuadrarCaja = cuadrarCaja;
		this.cuaCantidad = cuaCantidad;
		this.cuaBase0 = cuaBase0;
		this.cuaBaseImponible = cuaBaseImponible;
		this.cuaMontoIva = cuaMontoIva;
		this.cuaTotal = cuaTotal;
		this.id = id;
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getCuaBase0() {
		return cuaBase0;
	}

	public void setCuaBase0(BigDecimal cuaBase0) {
		this.cuaBase0 = cuaBase0;
	}

	public BigDecimal getCuaBaseImponible() {
		return cuaBaseImponible;
	}

	public void setCuaBaseImponible(BigDecimal cuaBaseImponible) {
		this.cuaBaseImponible = cuaBaseImponible;
	}

	public BigDecimal getCuaMontoIva() {
		return cuaMontoIva;
	}

	public void setCuaMontoIva(BigDecimal cuaMontoIva) {
		this.cuaMontoIva = cuaMontoIva;
	}

	public Integer getCuaCantidad() {
		return cuaCantidad;
	}

	public void setCuaCantidad(Integer cuaCantidad) {
		this.cuaCantidad = cuaCantidad;
	}

	public BigDecimal getCuaTotal() {
		return cuaTotal;
	}

	public void setCuaTotal(BigDecimal cuaTotal) {
		this.cuaTotal = cuaTotal;
	}

	public String getCuadrarCaja() {
		return cuadrarCaja;
	}

	public void setCuadrarCaja(String cuadrarCaja) {
		this.cuadrarCaja = cuadrarCaja;
	}

	@Override
	public String toString() {
		return this.cuadrarCaja + " " + this.cuaCantidad + " " + this.cuaTotal;
	}

}
