package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdCorridaDetalleTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long detSecuencial;
	private String det_corrida_destino_empresa;
	private String det_corrida_destino_sector;
	private String det_corrida_destino_piscina;
	private String det_corrida_destino_numero;
	private String det_corrida_origen_empresa;
	private String det_corrida_origen_sector;
	private String det_corrida_origen_piscina;
	private String det_corrida_origen_numero;
	private BigDecimal detPorcentaje;

	public PrdCorridaDetalleTO() {

	}

	public PrdCorridaDetalleTO(Long detSecuencial, String det_corrida_destino_empresa,
			String det_corrida_destino_sector, String det_corrida_destino_piscina, String det_corrida_destino_numero,
			String det_corrida_origen_empresa, String det_corrida_origen_sector, String det_corrida_origen_piscina,
			String det_corrida_origen_numero, BigDecimal detPorcentaje) {
		this.detSecuencial = detSecuencial;
		this.det_corrida_destino_empresa = det_corrida_destino_empresa;
		this.det_corrida_destino_sector = det_corrida_destino_sector;
		this.det_corrida_destino_piscina = det_corrida_destino_piscina;
		this.det_corrida_destino_numero = det_corrida_destino_numero;
		this.det_corrida_origen_empresa = det_corrida_origen_empresa;
		this.det_corrida_origen_sector = det_corrida_origen_sector;
		this.det_corrida_origen_piscina = det_corrida_origen_piscina;
		this.det_corrida_origen_numero = det_corrida_origen_numero;
		this.detPorcentaje = detPorcentaje;
	}

	@Id
	@Column(name = "det_secuencial")
	public Long getDetSecuencial() {
		return detSecuencial;
	}

	public void setDetSecuencial(Long detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public String getDet_corrida_destino_empresa() {
		return det_corrida_destino_empresa;
	}

	public void setDet_corrida_destino_empresa(String det_corrida_destino_empresa) {
		this.det_corrida_destino_empresa = det_corrida_destino_empresa;
	}

	public String getDet_corrida_destino_sector() {
		return det_corrida_destino_sector;
	}

	public void setDet_corrida_destino_sector(String det_corrida_destino_sector) {
		this.det_corrida_destino_sector = det_corrida_destino_sector;
	}

	public String getDet_corrida_destino_piscina() {
		return det_corrida_destino_piscina;
	}

	public void setDet_corrida_destino_piscina(String det_corrida_destino_piscina) {
		this.det_corrida_destino_piscina = det_corrida_destino_piscina;
	}

	public String getDet_corrida_destino_numero() {
		return det_corrida_destino_numero;
	}

	public void setDet_corrida_destino_numero(String det_corrida_destino_numero) {
		this.det_corrida_destino_numero = det_corrida_destino_numero;
	}

	public String getDet_corrida_origen_empresa() {
		return det_corrida_origen_empresa;
	}

	public void setDet_corrida_origen_empresa(String det_corrida_origen_empresa) {
		this.det_corrida_origen_empresa = det_corrida_origen_empresa;
	}

	public String getDet_corrida_origen_sector() {
		return det_corrida_origen_sector;
	}

	public void setDet_corrida_origen_sector(String det_corrida_origen_sector) {
		this.det_corrida_origen_sector = det_corrida_origen_sector;
	}

	public String getDet_corrida_origen_piscina() {
		return det_corrida_origen_piscina;
	}

	public void setDet_corrida_origen_piscina(String det_corrida_origen_piscina) {
		this.det_corrida_origen_piscina = det_corrida_origen_piscina;
	}

	public String getDet_corrida_origen_numero() {
		return det_corrida_origen_numero;
	}

	public void setDet_corrida_origen_numero(String det_corrida_origen_numero) {
		this.det_corrida_origen_numero = det_corrida_origen_numero;
	}
	@Column(name = "det_porcentaje")
	public BigDecimal getDetPorcentaje() {
		return detPorcentaje;
	}

	public void setDetPorcentaje(BigDecimal detPorcentaje) {
		this.detPorcentaje = detPorcentaje;
	}

}
