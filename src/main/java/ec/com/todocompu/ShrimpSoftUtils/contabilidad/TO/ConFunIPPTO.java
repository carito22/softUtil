package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ConFunIPPTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "costo_id")
	private Integer id;
	@Column(name = "costo_empresa")
	private String costoEmpresa;
	@Column(name = "costo_sector")
	private String costoSector;
	@Column(name = "costo_piscina")
	private String costoPiscina;
	@Column(name = "costo_total")
	private BigDecimal costoTotal;
	@Column(name = "costo_cuenta_origen")
	private String costoCuentaOrigen;
	@Column(name = "costo_cuenta_destino")
	private String costoCuentaDestino;

	public ConFunIPPTO() {
	}

	public ConFunIPPTO(Integer id, String costoEmpresa, String costoSector, String costoPiscina, BigDecimal costoTotal,
			String costoCuentaOrigen, String costoCuentaDestino) {
		this.id = id;
		this.costoEmpresa = costoEmpresa;
		this.costoSector = costoSector;
		this.costoPiscina = costoPiscina;
		this.costoTotal = costoTotal;
		this.costoCuentaOrigen = costoCuentaOrigen;
		this.costoCuentaDestino = costoCuentaDestino;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCostoEmpresa() {
		return costoEmpresa;
	}

	public void setCostoEmpresa(String costoEmpresa) {
		this.costoEmpresa = costoEmpresa;
	}

	public String getCostoSector() {
		return costoSector;
	}

	public void setCostoSector(String costoSector) {
		this.costoSector = costoSector;
	}

	public String getCostoPiscina() {
		return costoPiscina;
	}

	public void setCostoPiscina(String costoPiscina) {
		this.costoPiscina = costoPiscina;
	}

	public BigDecimal getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(BigDecimal costoTotal) {
		this.costoTotal = costoTotal;
	}

	public String getCostoCuentaOrigen() {
		return costoCuentaOrigen;
	}

	public void setCostoCuentaOrigen(String costoCuentaOrigen) {
		this.costoCuentaOrigen = costoCuentaOrigen;
	}

	public String getCostoCuentaDestino() {
		return costoCuentaDestino;
	}

	public void setCostoCuentaDestino(String costoCuentaDestino) {
		this.costoCuentaDestino = costoCuentaDestino;
	}

}
