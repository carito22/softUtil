/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvMedidaComboTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "med_codigo")
	private String medidaCodigo;

	@Column(name = "med_detalle")
	private String medidaDetalle;

	@Column(name = "med_conversion_libras")
	private String conversionLibras;

	public InvMedidaComboTO() {
	}

	public InvMedidaComboTO(String medidaCodigo, String medidaDetalle, String conversionLibras) {
		this.medidaCodigo = medidaCodigo;
		this.medidaDetalle = medidaDetalle;
		this.conversionLibras = conversionLibras;
	}

	public String getConversionLibras() {
		return conversionLibras;
	}

	public void setConversionLibras(String conversionLibras) {
		this.conversionLibras = conversionLibras;
	}

	public String getMedidaCodigo() {
		return medidaCodigo;
	}

	public void setMedidaCodigo(String medidaCodigo) {
		this.medidaCodigo = medidaCodigo;
	}

	public String getMedidaDetalle() {
		return medidaDetalle;
	}

	public void setMedidaDetalle(String medidaDetalle) {
		this.medidaDetalle = medidaDetalle;
	}

	@Override
	public String toString() {
		return this.medidaDetalle;
	}
}
