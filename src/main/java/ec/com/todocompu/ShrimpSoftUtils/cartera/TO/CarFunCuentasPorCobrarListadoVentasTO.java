package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarFunCuentasPorCobrarListadoVentasTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "cxcd_periodo")
	private String cxcdPeriodo;
	@Column(name = "cxcd_motivo")
	private String cxcdMotivo;
	@Column(name = "cxcd_numero")
	private String cxcdNumero;
	@Column(name = "cxcd_proveedor")
	private String cxcdCliente;
	@Column(name = "cxcd_fecha_emision")
	private String cxcdFechaEmision;
	@Column(name = "cxcd_fecha_vencimiento")
	private String cxcdFechaVencimiento;
	@Column(name = "cxcd_saldo")
	private BigDecimal cxcdSaldo;

	public CarFunCuentasPorCobrarListadoVentasTO() {
	}

	public CarFunCuentasPorCobrarListadoVentasTO(String cxcdPeriodo, String cxcdMotivo, String cxcdNumero,
			String cxcdCliente, String cxcdFechaEmision, String cxcdFechaVencimiento, BigDecimal cxcdSaldo,
			Integer id) {
		this.cxcdPeriodo = cxcdPeriodo;
		this.cxcdMotivo = cxcdMotivo;
		this.cxcdNumero = cxcdNumero;
		this.cxcdCliente = cxcdCliente;
		this.cxcdFechaEmision = cxcdFechaEmision;
		this.cxcdFechaVencimiento = cxcdFechaVencimiento;
		this.cxcdSaldo = cxcdSaldo;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCxcdFechaEmision() {
		return cxcdFechaEmision;
	}

	public void setCxcdFechaEmision(String cxcdFechaEmision) {
		this.cxcdFechaEmision = cxcdFechaEmision;
	}

	public String getCxcdFechaVencimiento() {
		return cxcdFechaVencimiento;
	}

	public void setCxcdFechaVencimiento(String cxcdFechaVencimiento) {
		this.cxcdFechaVencimiento = cxcdFechaVencimiento;
	}

	public String getCxcdMotivo() {
		return cxcdMotivo;
	}

	public void setCxcdMotivo(String cxcdMotivo) {
		this.cxcdMotivo = cxcdMotivo;
	}

	public String getCxcdNumero() {
		return cxcdNumero;
	}

	public void setCxcdNumero(String cxcdNumero) {
		this.cxcdNumero = cxcdNumero;
	}

	public String getCxcdPeriodo() {
		return cxcdPeriodo;
	}

	public void setCxcdPeriodo(String cxcdPeriodo) {
		this.cxcdPeriodo = cxcdPeriodo;
	}

	public String getCxcdCliente() {
		return cxcdCliente;
	}

	public void setCxcdCliente(String cxcdCliente) {
		this.cxcdCliente = cxcdCliente;
	}

	public BigDecimal getCxcdSaldo() {
		return cxcdSaldo;
	}

	public void setCxcdSaldo(BigDecimal cxcdSaldo) {
		this.cxcdSaldo = cxcdSaldo;
	}

}
