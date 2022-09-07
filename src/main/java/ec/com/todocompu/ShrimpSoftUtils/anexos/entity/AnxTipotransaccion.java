package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "anx_tipotransaccion", schema = "anexo")
@XmlRootElement
public class AnxTipotransaccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "tt_codigo")
	private String ttCodigo;
	@Column(name = "tt_transaccion")
	private String ttTransaccion;
	@Column(name = "tt_id")
	private char ttId;

	public AnxTipotransaccion() {
	}

	public AnxTipotransaccion(String ttCodigo) {
		this.ttCodigo = ttCodigo;
	}

	public AnxTipotransaccion(String ttCodigo, String ttTransaccion, char ttId) {
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

	public String getTtTransaccion() {
		return ttTransaccion;
	}

	public void setTtTransaccion(String ttTransaccion) {
		this.ttTransaccion = ttTransaccion;
	}

	public char getTtId() {
		return ttId;
	}

	public void setTtId(char ttId) {
		this.ttId = ttId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (ttCodigo != null ? ttCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxTipotransaccion)) {
			return false;
		}
		AnxTipotransaccion other = (AnxTipotransaccion) object;
		if ((this.ttCodigo == null && other.ttCodigo != null)
				|| (this.ttCodigo != null && !this.ttCodigo.equals(other.ttCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxTipotransaccion[ ttCodigo=" + ttCodigo + " ]";
	}

}
