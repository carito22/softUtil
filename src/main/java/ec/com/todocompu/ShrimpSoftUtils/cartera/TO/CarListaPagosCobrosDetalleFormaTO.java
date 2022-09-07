package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarListaPagosCobrosDetalleFormaTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "forma")
	private String fpForma;
	@Column(name = "fp_secuencial")
	private Integer fpSecuencial;
	@Column(name = "ban_nombre")
	private String fpBanco;
	@Column(name = "cuenta")
	private String fpCuenta;
	@Column(name = "fecha")
	private String fpFecha;
	@Column(name = "referencia")
	private String fpReferencia;
	@Column(name = "valor")
	private BigDecimal fpValor;
	@Column(name = "observaciones")
	private String fpObservaciones;

	public CarListaPagosCobrosDetalleFormaTO() {
	}

	public CarListaPagosCobrosDetalleFormaTO(String fpForma, String fpBanco, String fpCuenta, String fpFecha,
			String fpReferencia, BigDecimal fpValor, String fpObservaciones, int id) {
		this.fpForma = fpForma;
		this.fpBanco = fpBanco;
		this.fpCuenta = fpCuenta;
		this.fpFecha = fpFecha;
		this.fpReferencia = fpReferencia;
		this.fpValor = fpValor;
		this.fpObservaciones = fpObservaciones;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFpForma() {
		return fpForma;
	}

	public void setFpForma(String fpForma) {
		this.fpForma = fpForma;
	}

	public String getFpObservaciones() {
		return fpObservaciones;
	}

	public void setFpObservaciones(String fpObservaciones) {
		this.fpObservaciones = fpObservaciones;
	}

	public String getFpReferencia() {
		return fpReferencia;
	}

	public void setFpReferencia(String fpReferencia) {
		this.fpReferencia = fpReferencia;
	}

	public BigDecimal getFpValor() {
		return fpValor;
	}

	public void setFpValor(BigDecimal fpValor) {
		this.fpValor = fpValor;
	}

	public String getFpBanco() {
		return fpBanco;
	}

	public void setFpBanco(String fpBanco) {
		this.fpBanco = fpBanco;
	}

	public String getFpCuenta() {
		return fpCuenta;
	}

	public void setFpCuenta(String fpCuenta) {
		this.fpCuenta = fpCuenta;
	}

	public String getFpFecha() {
		return fpFecha;
	}

	public void setFpFecha(String fpFecha) {
		this.fpFecha = fpFecha;
	}

        public Integer getFpSecuencial() {
            return fpSecuencial;
        }

        public void setFpSecuencial(Integer fpSecuencial) {
            this.fpSecuencial = fpSecuencial;
        }

}