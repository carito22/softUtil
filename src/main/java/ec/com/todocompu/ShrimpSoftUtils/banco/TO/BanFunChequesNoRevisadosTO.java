package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BanFunChequesNoRevisadosTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "chq_secuencia")
	private Long chqSecuencia;

	@Column(name = "chq_cuenta_codigo")
	private String chqCuentaCodigo;

	@Column(name = "chq_cuenta_detalle")
	private String chqCuentaDetalle;

	@Column(name = "chq_beneficiario")
	private String chqBeneficiario;

	@Column(name = "chq_numero")
	private String chqNumero;

	@Column(name = "chq_valor")
	private java.math.BigDecimal chqValor;

	@Column(name = "chq_fecha_emision")
	private String chqFechaEmision;

	@Column(name = "chq_fecha_vencimiento")
	private String chqFechaVencimiento;

	@Column(name = "chq_observacion")
	private String chqObservacion;

	@Column(name = "chq_impreso")
	private Boolean chqImpreso;

	@Column(name = "chq_entregado")
	private Boolean chqEntregado;

	@Column(name = "chq_contable_periodo")
	private String chqContablePeriodo;

	@Column(name = "chq_contable_tipo")
	private String chqContableTipo;

	@Column(name = "chq_contable_numero")
	private String chqContableNumero;

	@Column(name = "chq_orden")
	private java.math.BigInteger chqOrden;

	private boolean estado;

	public BanFunChequesNoRevisadosTO() {
	}

	public BanFunChequesNoRevisadosTO(String chqCuentaCodigo, String chqCuentaDetalle, String chqBeneficiario,
			String chqNumero, BigDecimal chqValor, String chqFechaEmision, String chqFechaVencimiento,
			String chqObservacion, Boolean chqImpreso, Boolean chqEntregado, String chqContablePeriodo,
			String chqContableTipo, String chqContableNumero, Long chqSecuencia, BigInteger chqOrden,
			Integer id) {
		this.chqCuentaCodigo = chqCuentaCodigo;
		this.chqCuentaDetalle = chqCuentaDetalle;
		this.chqBeneficiario = chqBeneficiario;
		this.chqNumero = chqNumero;
		this.chqValor = chqValor;
		this.chqFechaEmision = chqFechaEmision;
		this.chqFechaVencimiento = chqFechaVencimiento;
		this.chqObservacion = chqObservacion;
		this.chqImpreso = chqImpreso;
		this.chqEntregado = chqEntregado;
		this.chqContablePeriodo = chqContablePeriodo;
		this.chqContableTipo = chqContableTipo;
		this.chqContableNumero = chqContableNumero;
		this.chqSecuencia = chqSecuencia;
		this.chqOrden = chqOrden;
		this.id = id;
	}

	public BanFunChequesNoRevisadosTO(String chqCuentaCodigo, String chqCuentaDetalle, String chqBeneficiario,
			String chqNumero, BigDecimal chqValor, String chqFechaEmision, String chqFechaVencimiento,
			String chqObservacion, Boolean chqImpreso, Boolean chqEntregado, String chqContablePeriodo,
			String chqContableTipo, String chqContableNumero, Long chqSecuencia, BigInteger chqOrden,
			boolean estado) {
		this.chqCuentaCodigo = chqCuentaCodigo;
		this.chqCuentaDetalle = chqCuentaDetalle;
		this.chqBeneficiario = chqBeneficiario;
		this.chqNumero = chqNumero;
		this.chqValor = chqValor;
		this.chqFechaEmision = chqFechaEmision;
		this.chqFechaVencimiento = chqFechaVencimiento;
		this.chqObservacion = chqObservacion;
		this.chqImpreso = chqImpreso;
		this.chqEntregado = chqEntregado;
		this.chqContablePeriodo = chqContablePeriodo;
		this.chqContableTipo = chqContableTipo;
		this.chqContableNumero = chqContableNumero;
		this.chqSecuencia = chqSecuencia;
		this.chqOrden = chqOrden;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChqBeneficiario() {
		return chqBeneficiario;
	}

	public void setChqBeneficiario(String chqBeneficiario) {
		this.chqBeneficiario = chqBeneficiario;
	}

	public String getChqContableNumero() {
		return chqContableNumero;
	}

	public void setChqContableNumero(String chqContableNumero) {
		this.chqContableNumero = chqContableNumero;
	}

	public String getChqContablePeriodo() {
		return chqContablePeriodo;
	}

	public void setChqContablePeriodo(String chqContablePeriodo) {
		this.chqContablePeriodo = chqContablePeriodo;
	}

	public String getChqContableTipo() {
		return chqContableTipo;
	}

	public void setChqContableTipo(String chqContableTipo) {
		this.chqContableTipo = chqContableTipo;
	}

	public String getChqCuentaCodigo() {
		return chqCuentaCodigo;
	}

	public void setChqCuentaCodigo(String chqCuentaCodigo) {
		this.chqCuentaCodigo = chqCuentaCodigo;
	}

	public String getChqCuentaDetalle() {
		return chqCuentaDetalle;
	}

	public void setChqCuentaDetalle(String chqCuentaDetalle) {
		this.chqCuentaDetalle = chqCuentaDetalle;
	}

	public String getChqFechaEmision() {
		return chqFechaEmision;
	}

	public void setChqFechaEmision(String chqFechaEmision) {
		this.chqFechaEmision = chqFechaEmision;
	}

	public String getChqFechaVencimiento() {
		return chqFechaVencimiento;
	}

	public void setChqFechaVencimiento(String chqFechaVencimiento) {
		this.chqFechaVencimiento = chqFechaVencimiento;
	}

	public String getChqNumero() {
		return chqNumero;
	}

	public void setChqNumero(String chqNumero) {
		this.chqNumero = chqNumero;
	}

	public BigInteger getChqOrden() {
		return chqOrden;
	}

	public void setChqOrden(BigInteger chqOrden) {
		this.chqOrden = chqOrden;
	}

	public Long getChqSecuencia() {
		return chqSecuencia;
	}

	public void setChqSecuencia(Long chqSecuencia) {
		this.chqSecuencia = chqSecuencia;
	}

	public BigDecimal getChqValor() {
		return chqValor;
	}

	public void setChqValor(BigDecimal chqValor) {
		this.chqValor = chqValor;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getChqObservacion() {
		return chqObservacion;
	}

	public void setChqObservacion(String chqObservacion) {
		this.chqObservacion = chqObservacion;
	}

	public Boolean getChqEntregado() {
		return chqEntregado;
	}

	public void setChqEntregado(Boolean chqEntregado) {
		this.chqEntregado = chqEntregado;
	}

	public Boolean getChqImpreso() {
		return chqImpreso;
	}

	public void setChqImpreso(Boolean chqImpreso) {
		this.chqImpreso = chqImpreso;
	}

}
