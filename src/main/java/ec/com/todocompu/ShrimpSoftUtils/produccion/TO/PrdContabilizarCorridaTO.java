package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdContabilizarCorridaTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "rc_empresa")
	private String empCodigo;
	@Column(name = "rc_sector")
	private String secCodigo;
	@Column(name = "rc_piscina")
	private String pisNumero;
	@Column(name = "rc_corrida")
	private String rcCorridaNumero;
	@Column(name = "rc_fecha_desde")
	private String rcFechaDesde;
	@Column(name = "rc_fecha_hasta")
	private String rcFechaHasta;
	@Column(name = "rc_costo_total")
	private BigDecimal rcCosto;
	@Column(name = "rc_costo_directo")
	private BigDecimal rcDirecto;
	@Column(name = "rc_costo_indirecto")
	private BigDecimal rcIndirecto;
	@Column(name = "rc_costo_transferencia")
	private BigDecimal rcCostoTransferencia;
	@Column(name = "rc_contable_periodo")
	private String rcContablePeriodo;
	@Column(name = "rc_contable_tipo")
	private String rcContableTipo;
	@Column(name = "rc_contable_numero")
	private String rcContableNumero;

	public PrdContabilizarCorridaTO() {
	}

	public PrdContabilizarCorridaTO(Integer id, String empCodigo, String secCodigo, String pisNumero,
			String rcCorridaNumero, String rcFechaDesde, String rcFechaHasta, BigDecimal rcCosto, BigDecimal rcDirecto,
			BigDecimal rcIndirecto, BigDecimal rcCostoTransferencia, String rcContablePeriodo, String rcContableTipo,
			String rcContableNumero) {
		this.id = id;
		this.empCodigo = empCodigo;
		this.secCodigo = secCodigo;
		this.pisNumero = pisNumero;
		this.rcCorridaNumero = rcCorridaNumero;
		this.rcFechaDesde = rcFechaDesde;
		this.rcFechaHasta = rcFechaHasta;
		this.rcCosto = rcCosto;
		this.rcDirecto = rcDirecto;
		this.rcIndirecto = rcIndirecto;
		this.rcCostoTransferencia = rcCostoTransferencia;
		this.rcContablePeriodo = rcContablePeriodo;
		this.rcContableTipo = rcContableTipo;
		this.rcContableNumero = rcContableNumero;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public String getPisNumero() {
		return pisNumero;
	}

	public void setPisNumero(String pisNumero) {
		this.pisNumero = pisNumero;
	}

	public String getRcCorridaNumero() {
		return rcCorridaNumero;
	}

	public void setRcCorridaNumero(String rcCorridaNumero) {
		this.rcCorridaNumero = rcCorridaNumero;
	}

	public String getRcFechaDesde() {
		return rcFechaDesde;
	}

	public void setRcFechaDesde(String rcFechaDesde) {
		this.rcFechaDesde = rcFechaDesde;
	}

	public String getRcFechaHasta() {
		return rcFechaHasta;
	}

	public void setRcFechaHasta(String rcFechaHasta) {
		this.rcFechaHasta = rcFechaHasta;
	}

	public BigDecimal getRcCosto() {
		return rcCosto;
	}

	public void setRcCosto(BigDecimal rcCosto) {
		this.rcCosto = rcCosto;
	}

	public BigDecimal getRcDirecto() {
		return rcDirecto;
	}

	public void setRcDirecto(BigDecimal rcDirecto) {
		this.rcDirecto = rcDirecto;
	}

	public BigDecimal getRcIndirecto() {
		return rcIndirecto;
	}

	public void setRcIndirecto(BigDecimal rcIndirecto) {
		this.rcIndirecto = rcIndirecto;
	}

	public BigDecimal getRcCostoTransferencia() {
		return rcCostoTransferencia;
	}

	public void setRcCostoTransferencia(BigDecimal rcCostoTransferencia) {
		this.rcCostoTransferencia = rcCostoTransferencia;
	}

	public String getRcContablePeriodo() {
		return rcContablePeriodo;
	}

	public void setRcContablePeriodo(String rcContablePeriodo) {
		this.rcContablePeriodo = rcContablePeriodo;
	}

	public String getRcContableTipo() {
		return rcContableTipo;
	}

	public void setRcContableTipo(String rcContableTipo) {
		this.rcContableTipo = rcContableTipo;
	}

	public String getRcContableNumero() {
		return rcContableNumero;
	}

	public void setRcContableNumero(String rcContableNumero) {
		this.rcContableNumero = rcContableNumero;
	}

}
