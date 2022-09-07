package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhUtilidadesPeriodoTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "uti_descripcion")
	private String utiDescripcion;

	@Column(name = "uti_empresa")
	private String utiEmpresa;

	@Column(name = "uti_desde")
	private String utiDesde;

	@Column(name = "uti_hasta")
	private String utiHasta;

	@Column(name = "uti_fecha_maxima_pago")
	private String utiFechaMaximaPago;

	@Column(name = "uti_total_dias")
	private Integer utiTotalDias;

	@Column(name = "uti_total_cargas")
	private Integer utiTotalCargas;

	@Column(name = "uti_total_pagar")
	private BigDecimal utiTotalPagar;

	public RhUtilidadesPeriodoTO() {
	}

	public RhUtilidadesPeriodoTO(String utiEmpresa, String utiDescripcion, String utiDesde, String utiHasta,
			String utiFechaMaximaPago, Integer utiTotalDias, Integer utiTotalCargas, BigDecimal utiTotalPagar) {
		this.utiEmpresa = utiEmpresa;
		this.utiDescripcion = utiDescripcion;
		this.utiDesde = utiDesde;
		this.utiHasta = utiHasta;
		this.utiFechaMaximaPago = utiFechaMaximaPago;
		this.utiTotalDias = utiTotalDias;
		this.utiTotalCargas = utiTotalCargas;
		this.utiTotalPagar = utiTotalPagar;
	}

	public RhUtilidadesPeriodoTO(String utiDescripcion, String utiDesde, String utiHasta, String utiFechaMaximaPago,
			Integer utiTotalDias, Integer utiTotalCargas, BigDecimal utiTotalPagar) {
		this.utiDescripcion = utiDescripcion;
		this.utiDesde = utiDesde;
		this.utiHasta = utiHasta;
		this.utiFechaMaximaPago = utiFechaMaximaPago;
		this.utiTotalDias = utiTotalDias;
		this.utiTotalCargas = utiTotalCargas;
		this.utiTotalPagar = utiTotalPagar;
	}

	public String getUtiEmpresa() {
		return utiEmpresa;
	}

	public void setUtiEmpresa(String utiEmpresa) {
		this.utiEmpresa = utiEmpresa;
	}

	public String getUtiDescripcion() {
		return utiDescripcion;
	}

	public void setUtiDescripcion(String utiDescripcion) {
		this.utiDescripcion = utiDescripcion;
	}

	public String getUtiDesde() {
		return utiDesde;
	}

	public void setUtiDesde(String utiDesde) {
		this.utiDesde = utiDesde;
	}

	public String getUtiHasta() {
		return utiHasta;
	}

	public void setUtiHasta(String utiHasta) {
		this.utiHasta = utiHasta;
	}

	public String getUtiFechaMaximaPago() {
		return utiFechaMaximaPago;
	}

	public void setUtiFechaMaximaPago(String utiFechaMaximaPago) {
		this.utiFechaMaximaPago = utiFechaMaximaPago;
	}

	public Integer getUtiTotalDias() {
		return utiTotalDias;
	}

	public void setUtiTotalDias(Integer utiTotalDias) {
		this.utiTotalDias = utiTotalDias;
	}

	public Integer getUtiTotalCargas() {
		return utiTotalCargas;
	}

	public void setUtiTotalCargas(Integer utiTotalCargas) {
		this.utiTotalCargas = utiTotalCargas;
	}

	public BigDecimal getUtiTotalPagar() {
		return utiTotalPagar;
	}

	public void setUtiTotalPagar(BigDecimal utiTotalPagar) {
		this.utiTotalPagar = utiTotalPagar;
	}

	@Override
	public String toString() {
		return this.utiDescripcion;
	}

}
