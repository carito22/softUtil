package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarCuentasPorPagarCobrarGeneralTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "cxpg_codigo")
	private String cxpgCodigo;
	@Column(name = "cxpg_nombre")
	private String cxpgNombre;
	@Column(name = "cxpp_saldo")
	private BigDecimal cxpgSaldo;

	public CarCuentasPorPagarCobrarGeneralTO() {
	}

	public CarCuentasPorPagarCobrarGeneralTO(String cxpgCodigo, String cxpgNombre, BigDecimal cxpgSaldo, Integer id) {
		this.cxpgCodigo = cxpgCodigo;
		this.cxpgNombre = cxpgNombre;
		this.cxpgSaldo = cxpgSaldo;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCxpgCodigo() {
		return cxpgCodigo;
	}

	public void setCxpgCodigo(String cxpgCodigo) {
		this.cxpgCodigo = cxpgCodigo;
	}

	public String getCxpgNombre() {
		return cxpgNombre;
	}

	public void setCxpgNombre(String cxpgNombre) {
		this.cxpgNombre = cxpgNombre;
	}

	public BigDecimal getCxpgSaldo() {
		return cxpgSaldo;
	}

	public void setCxpgSaldo(BigDecimal cxpgSaldo) {
		this.cxpgSaldo = cxpgSaldo;
	}
}
