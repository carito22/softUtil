/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class AnxTipoListaTransaccionTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "tt_codigo")
	private String ttCodigo;

	@Column(name = "tt_transaccion")
	private String ttTransaccion;

	@Column(name = "tt_id")
	private Character ttId;

	public AnxTipoListaTransaccionTO() {
	}

	public AnxTipoListaTransaccionTO(String ttCodigo, String ttTransaccion, Character ttId) {
		this.ttCodigo = ttCodigo;
		this.ttTransaccion = ttTransaccion;
		this.ttId = ttId;
	}

	public String getTtCodigo() {
		return ttCodigo;
	}

	public void setTtCodigo(String ttCodigo) {
		this.ttCodigo = ttCodigo;
	}

	public Character getTtId() {
		return ttId;
	}

	public void setTtId(Character ttId) {
		this.ttId = ttId;
	}

	public String getTtTransaccion() {
		return ttTransaccion;
	}

	public void setTtTransaccion(String ttTransaccion) {
		this.ttTransaccion = ttTransaccion;
	}
}
