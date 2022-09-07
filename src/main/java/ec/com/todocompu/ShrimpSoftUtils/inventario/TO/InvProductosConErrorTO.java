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
public class InvProductosConErrorTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "err_bodega")
	private String errBodega;

	@Column(name = "err_producto_codigo")
	private String errProductoCodigo;

	@Column(name = "err_producto_nombre")
	private String errProductoNombre;

	@Column(name = "err_cantidad")
	private Integer errCantidad;

	@Column(name = "err_desde")
	private String errDesde;

	@Column(name = "err_hasta")
	private String errHasta;

	public InvProductosConErrorTO() {
	}

	public InvProductosConErrorTO(String errBodega, String errProductoCodigo, String errProductoNombre,
			Integer errCantidad, String errDesde, String errHasta, Integer id) {
		this.errBodega = errBodega;
		this.errProductoCodigo = errProductoCodigo;
		this.errProductoNombre = errProductoNombre;
		this.errCantidad = errCantidad;
		this.errDesde = errDesde;
		this.errHasta = errHasta;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getErrBodega() {
		return errBodega;
	}

	public void setErrBodega(String errBodega) {
		this.errBodega = errBodega;
	}

	public Integer getErrCantidad() {
		return errCantidad;
	}

	public void setErrCantidad(Integer errCantidad) {
		this.errCantidad = errCantidad;
	}

	public String getErrProductoCodigo() {
		return errProductoCodigo;
	}

	public void setErrProductoCodigo(String errProductoCodigo) {
		this.errProductoCodigo = errProductoCodigo;
	}

	public String getErrProductoNombre() {
		return errProductoNombre;
	}

	public void setErrProductoNombre(String errProductoNombre) {
		this.errProductoNombre = errProductoNombre;
	}

	public String getErrDesde() {
		return errDesde;
	}

	public void setErrDesde(String errDesde) {
		this.errDesde = errDesde;
	}

	public String getErrHasta() {
		return errHasta;
	}

	public void setErrHasta(String errHasta) {
		this.errHasta = errHasta;
	}
}
