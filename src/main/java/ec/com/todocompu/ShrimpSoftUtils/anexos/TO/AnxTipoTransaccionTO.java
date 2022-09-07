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
public class AnxTipoTransaccionTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "tt_codigo")
	private String ttCodigo;

	public AnxTipoTransaccionTO() {
	}

	public AnxTipoTransaccionTO(String ttCodigo) {
		this.ttCodigo = ttCodigo;
	}

	public String getTtCodigo() {
		return ttCodigo;
	}

	public void setTtCodigo(String ttCodigo) {
		this.ttCodigo = ttCodigo;
	}
}
