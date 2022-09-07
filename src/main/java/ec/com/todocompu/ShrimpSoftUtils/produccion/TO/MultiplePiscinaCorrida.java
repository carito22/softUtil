/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MultiplePiscinaCorrida implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cor_sector")
	private String sector;

	@Column(name = "cor_piscina")
	private String piscina;

	@Column(name = "cor_numero")
	private String corrida;

	@Column(name = "cor_fecha_desde")
	private String desde;

	@Column(name = "cor_fecha_hasta")
	private String hasta;

	public MultiplePiscinaCorrida() {
	}

	public MultiplePiscinaCorrida(String sector, String piscina, String corrida, String desde, String hasta) {
		this.sector = sector;
		this.piscina = piscina;
		this.corrida = corrida;
		this.desde = desde;
		this.hasta = hasta;
	}

	public String getCorrida() {
		return corrida;
	}

	public void setCorrida(String corrida) {
		this.corrida = corrida;
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

	public String getPiscina() {
		return piscina;
	}

	public void setPiscina(String piscina) {
		this.piscina = piscina;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	@Override
	public boolean equals(Object obj) {
		MultiplePiscinaCorrida other = (MultiplePiscinaCorrida) obj;
		if (corrida.compareToIgnoreCase(other.corrida) == 0 && piscina.compareToIgnoreCase(other.piscina) == 0
				&& sector.compareToIgnoreCase(other.sector) == 0)
			return true;
		return false;
	}

}
