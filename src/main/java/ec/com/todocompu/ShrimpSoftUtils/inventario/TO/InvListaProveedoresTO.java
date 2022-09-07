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
public class InvListaProveedoresTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "prov_codigo")
	private String provCodigo;

	@Column(name = "prov_id_numero")
	private String provId;

	@Column(name = "prov_razon_social")
	private String provRazonSocial;

	@Column(name = "prov_categoria")
	private String catDetalle;

	public InvListaProveedoresTO() {
	}

	public InvListaProveedoresTO(String provCodigo, String provId, String provRazonSocial, String catDetalle) {
		this.provCodigo = provCodigo;
		this.provId = provId;
		this.provRazonSocial = provRazonSocial;
		this.catDetalle = catDetalle;
	}

	public String getCatDetalle() {
		return catDetalle;
	}

	public void setCatDetalle(String catDetalle) {
		this.catDetalle = catDetalle;
	}

	public String getProvCodigo() {
		return provCodigo;
	}

	public void setProvCodigo(String provCodigo) {
		this.provCodigo = provCodigo;
	}

	public String getProvId() {
		return provId;
	}

	public void setProvId(String provId) {
		this.provId = provId;
	}

        public String getProvRazonSocial() {
            return provRazonSocial;
        }

        public void setProvRazonSocial(String provRazonSocial) {
            this.provRazonSocial = provRazonSocial;
        }
}
