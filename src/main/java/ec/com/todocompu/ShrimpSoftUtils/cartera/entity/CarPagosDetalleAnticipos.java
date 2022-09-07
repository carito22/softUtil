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
@Table(name = "car_pagos_detalle_anticipos", schema = "cartera")
public class CarPagosDetalleAnticipos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "det_secuencial")
	private Integer detSecuencial;
	@Column(name = "det_valor")
	private BigDecimal detValor;
	@Column(name = "det_observaciones")
	private String detObservaciones;
	@JoinColumns({ @JoinColumn(name = "ant_empresa", referencedColumnName = "ant_empresa"),
			@JoinColumn(name = "ant_periodo", referencedColumnName = "ant_periodo"),
			@JoinColumn(name = "ant_tipo", referencedColumnName = "ant_tipo"),
			@JoinColumn(name = "ant_numero", referencedColumnName = "ant_numero") })
	@ManyToOne(optional = false)
	private CarPagosAnticipos carPagosAnticipos;
	@JoinColumns({ @JoinColumn(name = "pag_empresa", referencedColumnName = "pag_empresa"),
			@JoinColumn(name = "pag_periodo", referencedColumnName = "pag_periodo"),
			@JoinColumn(name = "pag_tipo", referencedColumnName = "pag_tipo"),
			@JoinColumn(name = "pag_numero", referencedColumnName = "pag_numero") })
	@ManyToOne(optional = false)
	private CarPagos carPagos;

	public CarPagosDetalleAnticipos() {
	}

	public CarPagosDetalleAnticipos(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public CarPagosDetalleAnticipos(Integer detSecuencial, BigDecimal detValor) {
		this.detSecuencial = detSecuencial;
		this.detValor = detValor;
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

	public String getDetObservaciones() {
		return detObservaciones;
	}

	public void setDetObservaciones(String detObservaciones) {
		this.detObservaciones = detObservaciones;
	}

	public CarPagosAnticipos getCarPagosAnticipos() {
		return carPagosAnticipos;
	}

	public void setCarPagosAnticipos(CarPagosAnticipos carPagosAnticipos) {
		this.carPagosAnticipos = carPagosAnticipos;
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

		if (!(object instanceof CarPagosDetalleAnticipos)) {
			return false;
		}
		CarPagosDetalleAnticipos other = (CarPagosDetalleAnticipos) object;
		if ((this.detSecuencial == null && other.detSecuencial != null)
				|| (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "cartera.entity.CarPagosDetalleAnticipos[ detSecuencial=" + detSecuencial + " ]";
	}

}
