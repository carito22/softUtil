package ec.com.todocompu.ShrimpSoftUtils.cartera.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car_cobros_detalle_ventas", schema = "cartera")
public class CarCobrosDetalleVentas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "det_secuencial")
	private Integer detSecuencial;
	@Column(name = "det_valor")
	private BigDecimal detValor;
	@Column(name = "vta_empresa")
	private String vtaEmpresa;
	@Column(name = "vta_periodo")
	private String vtaPeriodo;
	@Column(name = "vta_motivo")
	private String vtaMotivo;
	@Column(name = "vta_numero")
	private String vtaNumero;
	@Column(name = "sec_empresa")
	private String secEmpresa;
	@Column(name = "sec_codigo")
	private String secCodigo;
	@JoinColumns({ @JoinColumn(name = "cob_empresa", referencedColumnName = "cob_empresa"),
			@JoinColumn(name = "cob_periodo", referencedColumnName = "cob_periodo"),
			@JoinColumn(name = "cob_tipo", referencedColumnName = "cob_tipo"),
			@JoinColumn(name = "cob_numero", referencedColumnName = "cob_numero") })
	@ManyToOne(optional = false)
	private CarCobros carCobros;

	public CarCobrosDetalleVentas() {
	}

	public CarCobrosDetalleVentas(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public CarCobrosDetalleVentas(Integer detSecuencial, BigDecimal detValor, String vtaEmpresa, String vtaPeriodo,
			String vtaMotivo, String vtaNumero, String secEmpresa, String secCodigo) {
		this.detSecuencial = detSecuencial;
		this.detValor = detValor;
		this.vtaEmpresa = vtaEmpresa;
		this.vtaPeriodo = vtaPeriodo;
		this.vtaMotivo = vtaMotivo;
		this.vtaNumero = vtaNumero;
		this.secEmpresa = secEmpresa;
		this.secCodigo = secCodigo;
	}

	public Integer getDetSecuencial() {
		return detSecuencial;
	}

	public void setDetSecuencial(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public BigDecimal getDetValor() {
		return detValor;
	}

	public void setDetValor(BigDecimal detValor) {
		this.detValor = detValor;
	}

	public String getVtaEmpresa() {
		return vtaEmpresa;
	}

	public void setVtaEmpresa(String vtaEmpresa) {
		this.vtaEmpresa = vtaEmpresa;
	}

	public String getVtaPeriodo() {
		return vtaPeriodo;
	}

	public void setVtaPeriodo(String vtaPeriodo) {
		this.vtaPeriodo = vtaPeriodo;
	}

	public String getVtaMotivo() {
		return vtaMotivo;
	}

	public void setVtaMotivo(String vtaMotivo) {
		this.vtaMotivo = vtaMotivo;
	}

	public String getVtaNumero() {
		return vtaNumero;
	}

	public void setVtaNumero(String vtaNumero) {
		this.vtaNumero = vtaNumero;
	}

	public String getSecEmpresa() {
		return secEmpresa;
	}

	public void setSecEmpresa(String secEmpresa) {
		this.secEmpresa = secEmpresa;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public CarCobros getCarCobros() {
		return carCobros;
	}

	public void setCarCobros(CarCobros carCobros) {
		this.carCobros = carCobros;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (detSecuencial != null ? detSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof CarCobrosDetalleVentas)) {
			return false;
		}
		CarCobrosDetalleVentas other = (CarCobrosDetalleVentas) object;
		if ((this.detSecuencial == null && other.detSecuencial != null)
				|| (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "cartera.entity.CarCobrosDetalleVentas[ detSecuencial=" + detSecuencial + " ]";
	}

}
