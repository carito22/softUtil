/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class ConFunContablesVerificacionesComprasTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "verificacion_id")
	private Integer id;
	@Column(name = "contabilidad_fecha")
	private String contabilidadFecha;
	@Column(name = "contabilidad_secuencial")
	private String contabilidadSecuencial;
	@Column(name = "inventario_fecha")
	private String inventarioFecha;
	@Column(name = "inventario_secuencial")
	private String inventarioSecuencial;
	@Column(name = "inventario_monto")
	private BigDecimal inventarioMonto;
	@Column(name = "inventario_observaciones")
	private String inventarioObservacion;

	public ConFunContablesVerificacionesComprasTO() {
	}

	public ConFunContablesVerificacionesComprasTO(String contabilidadFecha, String contabilidadSecuencial,
			String inventarioFecha, String inventarioSecuencial, BigDecimal inventarioMonto,
			String inventarioObservacion, Integer id) {
		this.contabilidadFecha = contabilidadFecha;
		this.contabilidadSecuencial = contabilidadSecuencial;
		this.inventarioFecha = inventarioFecha;
		this.inventarioSecuencial = inventarioSecuencial;
		this.inventarioMonto = inventarioMonto;
		this.inventarioObservacion = inventarioObservacion;
		this.id = id;
	}

	public String getContabilidadFecha() {
		return contabilidadFecha;
	}

	public void setContabilidadFecha(String contabilidadFecha) {
		this.contabilidadFecha = contabilidadFecha;
	}

	public String getContabilidadSecuencial() {
		return contabilidadSecuencial;
	}

	public void setContabilidadSecuencial(String contabilidadSecuencial) {
		this.contabilidadSecuencial = contabilidadSecuencial;
	}

	public String getInventarioFecha() {
		return inventarioFecha;
	}

	public void setInventarioFecha(String inventarioFecha) {
		this.inventarioFecha = inventarioFecha;
	}

	public BigDecimal getInventarioMonto() {
		return inventarioMonto;
	}

	public void setInventarioMonto(BigDecimal inventarioMonto) {
		this.inventarioMonto = inventarioMonto;
	}

	public String getInventarioSecuencial() {
		return inventarioSecuencial;
	}

	public void setInventarioSecuencial(String inventarioSecuencial) {
		this.inventarioSecuencial = inventarioSecuencial;
	}

	public String getInventarioObservacion() {
		return inventarioObservacion;
	}

	public void setInventarioObservacion(String inventarioObservacion) {
		this.inventarioObservacion = inventarioObservacion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
