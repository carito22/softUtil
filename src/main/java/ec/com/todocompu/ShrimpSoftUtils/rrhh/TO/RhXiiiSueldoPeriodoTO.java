package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhXiiiSueldoPeriodoTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "xiii_descripcion")
	private String xiiiDescripcion;
	@Column(name = "xiii_desde")
	private String xiiiDesde;
	@Column(name = "xiii_hasta")
	private String xiiiHasta;
	@Column(name = "xiii_fecha_maxima_pago")
	private String xiiiFechaMaximaPago;
	@Column(name = "xiii_secuencial")
	private Integer periodoSecuencial;

	public RhXiiiSueldoPeriodoTO() {
	}

	public RhXiiiSueldoPeriodoTO(String xiiiDescripcion, String xiiiDesde, String xiiiHasta, String xiiiFechaMaximaPago,
			Integer periodoSecuencial) {
		this.xiiiDescripcion = xiiiDescripcion;
		this.xiiiDesde = xiiiDesde;
		this.xiiiHasta = xiiiHasta;
		this.xiiiFechaMaximaPago = xiiiFechaMaximaPago;
		this.periodoSecuencial = periodoSecuencial;
	}

	public Integer getPeriodoSecuencial() {
		return periodoSecuencial;
	}

	public void setPeriodoSecuencial(Integer periodoSecuencial) {
		this.periodoSecuencial = periodoSecuencial;
	}

	public String getXiiiDescripcion() {
		return xiiiDescripcion;
	}

	public void setXiiiDescripcion(String xiiiDescripcion) {
		this.xiiiDescripcion = xiiiDescripcion;
	}

	public String getXiiiDesde() {
		return xiiiDesde;
	}

	public void setXiiiDesde(String xiiiDesde) {
		this.xiiiDesde = xiiiDesde;
	}

	public String getXiiiFechaMaximaPago() {
		return xiiiFechaMaximaPago;
	}

	public void setXiiiFechaMaximaPago(String xiiiFechaMaximaPago) {
		this.xiiiFechaMaximaPago = xiiiFechaMaximaPago;
	}

	public String getXiiiHasta() {
		return xiiiHasta;
	}

	public void setXiiiHasta(String xiiiHasta) {
		this.xiiiHasta = xiiiHasta;
	}

	@Override
	public String toString() {
		return this.xiiiDescripcion;
	}

}
