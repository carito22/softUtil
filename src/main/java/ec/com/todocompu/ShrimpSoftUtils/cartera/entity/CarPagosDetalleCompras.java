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
@Table(name = "car_pagos_detalle_compras", schema = "cartera")
public class CarPagosDetalleCompras implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "det_secuencial")
	private Integer detSecuencial;
	@Column(name = "det_valor")
	private BigDecimal detValor;
	@Column(name = "comp_empresa")
	private String compEmpresa;
	@Column(name = "comp_periodo")
	private String compPeriodo;
	@Column(name = "comp_motivo")
	private String compMotivo;
	@Column(name = "comp_numero")
	private String compNumero;
	@Column(name = "sec_empresa")
	private String secEmpresa;
	@Column(name = "sec_codigo")
	private String secCodigo;
	@JoinColumns({ @JoinColumn(name = "pag_empresa", referencedColumnName = "pag_empresa"),
			@JoinColumn(name = "pag_periodo", referencedColumnName = "pag_periodo"),
			@JoinColumn(name = "pag_tipo", referencedColumnName = "pag_tipo"),
			@JoinColumn(name = "pag_numero", referencedColumnName = "pag_numero") })
	@ManyToOne(optional = false)
	private CarPagos carPagos;

	public CarPagosDetalleCompras() {
	}

	public CarPagosDetalleCompras(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public CarPagosDetalleCompras(Integer detSecuencial, BigDecimal detValor, String compEmpresa, String compPeriodo,
			String compMotivo, String compNumero, String secEmpresa, String secCodigo) {
		this.detSecuencial = detSecuencial;
		this.detValor = detValor;
		this.compEmpresa = compEmpresa;
		this.compPeriodo = compPeriodo;
		this.compMotivo = compMotivo;
		this.compNumero = compNumero;
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

	public String getCompEmpresa() {
		return compEmpresa;
	}

	public void setCompEmpresa(String compEmpresa) {
		this.compEmpresa = compEmpresa;
	}

	public String getCompPeriodo() {
		return compPeriodo;
	}

	public void setCompPeriodo(String compPeriodo) {
		this.compPeriodo = compPeriodo;
	}

	public String getCompMotivo() {
		return compMotivo;
	}

	public void setCompMotivo(String compMotivo) {
		this.compMotivo = compMotivo;
	}

	public String getCompNumero() {
		return compNumero;
	}

	public void setCompNumero(String compNumero) {
		this.compNumero = compNumero;
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

	public CarPagos getCarPagos() {
		return carPagos;
	}

	public void setCarPagos(CarPagos carPagos) {
		this.carPagos = carPagos;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (detSecuencial != null ? detSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof CarPagosDetalleCompras)) {
			return false;
		}
		CarPagosDetalleCompras other = (CarPagosDetalleCompras) object;
		if ((this.detSecuencial == null && other.detSecuencial != null)
				|| (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "cartera.entity.CarPagosDetalleCompras[ detSecuencial=" + detSecuencial + " ]";
	}

}
