/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class ConDiarioAuxiliarTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ld_id")
	private Integer id;
	@Column(name = "ld_bloque")
	private String daBloque;
	@Column(name = "ld_orden")
	private Integer daOrden;
	@Column(name = "ld_cuenta")
	private String daCuenta;
	@Column(name = "ld_detalle")
	private String daDetalle;
	@Column(name = "ld_cp")
	private String daCP;
	@Column(name = "ld_cc")
	private String daCC;
	@Column(name = "ld_documento")
	private String daDocumento;
	@Column(name = "ld_debe")
	private String daDebe;
	@Column(name = "ld_haber")
	private String daHaber;

	public ConDiarioAuxiliarTO() {
	}

	public ConDiarioAuxiliarTO(Integer daOrden, String daCuenta, String daDetalle, String daCP, String daCC,
			String daDocumento, String daDebe, String daHaber, String daBloque, Integer id) {
		this.daOrden = daOrden;
		this.daCuenta = daCuenta;
		this.daDetalle = daDetalle;
		this.daCP = daCP;
		this.daCC = daCC;
		this.daDocumento = daDocumento;
		this.daDebe = daDebe;
		this.daHaber = daHaber;
		this.daBloque = daBloque;
		this.id = id;
	}

	public String getDaBloque() {
		return daBloque;
	}

	public void setDaBloque(String daBloque) {
		this.daBloque = daBloque;
	}

	public String getDaCC() {
		return daCC;
	}

	public void setDaCC(String daCC) {
		this.daCC = daCC;
	}

	public String getDaCP() {
		return daCP;
	}

	public void setDaCP(String daCP) {
		this.daCP = daCP;
	}

	public String getDaCuenta() {
		return daCuenta;
	}

	public void setDaCuenta(String daCuenta) {
		this.daCuenta = daCuenta;
	}

	public String getDaHaber() {
		return daHaber;
	}

	public void setDaDHaber(String daHaber) {
		this.daHaber = daHaber;
	}

	public String getDaDebe() {
		return daDebe;
	}

	public void setDaDebe(String daDebe) {
		this.daDebe = daDebe;
	}

	public String getDaDetalle() {
		return daDetalle;
	}

	public void setDaDetalle(String daDetalle) {
		this.daDetalle = daDetalle;
	}

	public String getDaDocumento() {
		return daDocumento;
	}

	public void setDaDocumento(String daDocumento) {
		this.daDocumento = daDocumento;
	}

	public Integer getDaOrden() {
		return daOrden;
	}

	public void setDaOrden(Integer daOrden) {
		this.daOrden = daOrden;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
