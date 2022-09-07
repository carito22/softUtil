/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.produccion.report;

import java.math.BigDecimal;

/**
 *
 * @author Andres Guachisaca
 */
public class ReportePrdFunCostosPorFechaSimpleTO {
	private String desde;
	private String hasta;

	///// DETALLE
	private String costo_sector;
	private String costo_piscina;
	private String costo_corrida;
	private java.math.BigDecimal costo_total;

	public ReportePrdFunCostosPorFechaSimpleTO() {
	}

	public ReportePrdFunCostosPorFechaSimpleTO(String desde, String hasta, String costo_sector, String costo_piscina,
			String costo_corrida, BigDecimal costo_total) {
		this.desde = desde;
		this.hasta = hasta;
		this.costo_sector = costo_sector;
		this.costo_piscina = costo_piscina;
		this.costo_corrida = costo_corrida;
		this.costo_total = costo_total;
	}

	public String getCosto_corrida() {
		return costo_corrida;
	}

	public void setCosto_corrida(String costo_corrida) {
		this.costo_corrida = costo_corrida;
	}

	public String getCosto_piscina() {
		return costo_piscina;
	}

	public void setCosto_piscina(String costo_piscina) {
		this.costo_piscina = costo_piscina;
	}

	public String getCosto_sector() {
		return costo_sector;
	}

	public void setCosto_sector(String costo_sector) {
		this.costo_sector = costo_sector;
	}

	public BigDecimal getCosto_total() {
		return costo_total;
	}

	public void setCosto_total(BigDecimal costo_total) {
		this.costo_total = costo_total;
	}

	public String getDesde() {
		return desde;
	}

	public void setDesde(String desde) {
		this.desde = desde;
	}

	public String getHasta() {
		return hasta;
	}

	public void setHasta(String hasta) {
		this.hasta = hasta;
	}

}
