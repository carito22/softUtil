package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "inv_producto_saldos", schema = "inventario")
public class InvProductoSaldos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "stk_secuencial", insertable = false, updatable = false)
	private Integer stkSecuencial;
	@Column(name = "stk_saldo_inicial", insertable = false, updatable = false)
	private BigDecimal stkSaldoInicial;
	@Column(name = "stk_valor_promedio_inicial", insertable = false, updatable = false)
	private BigDecimal stkValorPromedioInicial;
	@Column(name = "stk_valor_ultima_compra_inicial", insertable = false, updatable = false)
	private BigDecimal stkValorUltimaCompraInicial;
	@Column(name = "stk_fecha_ultima_compra_inicial", insertable = false, updatable = false)
	@Temporal(TemporalType.DATE)
	private Date stkFechaUltimaCompraInicial;
	@Column(name = "stk_saldo_final", insertable = false, updatable = false)
	private BigDecimal stkSaldoFinal;
	@Column(name = "stk_valor_promedio_final", insertable = false, updatable = false)
	private BigDecimal stkValorPromedioFinal;
	@Column(name = "stk_valor_ultima_compra_final", insertable = false, updatable = false)
	private BigDecimal stkValorUltimaCompraFinal;
	@Column(name = "stk_fecha_ultima_compra_final", insertable = false, updatable = false)
	@Temporal(TemporalType.DATE)
	private Date stkFechaUltimaCompraFinal;
	@JoinColumns({ @JoinColumn(name = "pro_empresa", referencedColumnName = "pro_empresa"),
			@JoinColumn(name = "pro_codigo_principal", referencedColumnName = "pro_codigo_principal") })
	@ManyToOne
	private InvProducto invProducto;
	@JoinColumns({ @JoinColumn(name = "bod_empresa", referencedColumnName = "bod_empresa"),
			@JoinColumn(name = "bod_codigo", referencedColumnName = "bod_codigo") })
	@ManyToOne
	private InvBodega invBodega;

	public InvProductoSaldos() {
	}

	public InvProductoSaldos(Integer stkSecuencial) {
		this.stkSecuencial = stkSecuencial;
	}

	public Integer getStkSecuencial() {
		return stkSecuencial;
	}

	public void setStkSecuencial(Integer stkSecuencial) {
		this.stkSecuencial = stkSecuencial;
	}

	public BigDecimal getStkSaldoInicial() {
		return stkSaldoInicial;
	}

	public void setStkSaldoInicial(BigDecimal stkSaldoInicial) {
		this.stkSaldoInicial = stkSaldoInicial;
	}

	public BigDecimal getStkValorPromedioInicial() {
		return stkValorPromedioInicial;
	}

	public void setStkValorPromedioInicial(BigDecimal stkValorPromedioInicial) {
		this.stkValorPromedioInicial = stkValorPromedioInicial;
	}

	public BigDecimal getStkValorUltimaCompraInicial() {
		return stkValorUltimaCompraInicial;
	}

	public void setStkValorUltimaCompraInicial(BigDecimal stkValorUltimaCompraInicial) {
		this.stkValorUltimaCompraInicial = stkValorUltimaCompraInicial;
	}

	public Date getStkFechaUltimaCompraInicial() {
		return stkFechaUltimaCompraInicial;
	}

	public void setStkFechaUltimaCompraInicial(Date stkFechaUltimaCompraInicial) {
		this.stkFechaUltimaCompraInicial = stkFechaUltimaCompraInicial;
	}

	public BigDecimal getStkSaldoFinal() {
		return stkSaldoFinal;
	}

	public void setStkSaldoFinal(BigDecimal stkSaldoFinal) {
		this.stkSaldoFinal = stkSaldoFinal;
	}

	public BigDecimal getStkValorPromedioFinal() {
		return stkValorPromedioFinal;
	}

	public void setStkValorPromedioFinal(BigDecimal stkValorPromedioFinal) {
		this.stkValorPromedioFinal = stkValorPromedioFinal;
	}

	public BigDecimal getStkValorUltimaCompraFinal() {
		return stkValorUltimaCompraFinal;
	}

	public void setStkValorUltimaCompraFinal(BigDecimal stkValorUltimaCompraFinal) {
		this.stkValorUltimaCompraFinal = stkValorUltimaCompraFinal;
	}

	public Date getStkFechaUltimaCompraFinal() {
		return stkFechaUltimaCompraFinal;
	}

	public void setStkFechaUltimaCompraFinal(Date stkFechaUltimaCompraFinal) {
		this.stkFechaUltimaCompraFinal = stkFechaUltimaCompraFinal;
	}

	public InvProducto getInvProducto() {
		return invProducto;
	}

	public void setInvProducto(InvProducto invProducto) {
		this.invProducto = invProducto;
	}

	public InvBodega getInvBodega() {
		return invBodega;
	}

	public void setInvBodega(InvBodega invBodega) {
		this.invBodega = invBodega;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stkSecuencial == null) ? 0 : stkSecuencial.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvProductoSaldos other = (InvProductoSaldos) obj;
		if (stkSecuencial == null) {
			if (other.stkSecuencial != null)
				return false;
		} else if (!stkSecuencial.equals(other.stkSecuencial))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvProductoSaldos[ stkSecuencial=" + stkSecuencial + " ]";
	}

}
