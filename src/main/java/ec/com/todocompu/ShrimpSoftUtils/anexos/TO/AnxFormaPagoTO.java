package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnxFormaPagoTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "fp_codigo")
	private String fpCodigo;
	@Column(name = "fp_detalle")
	private String fpDetalle;

	public AnxFormaPagoTO() {
	}

	public AnxFormaPagoTO(String fpCodigo, String fpDetalle) {
		this.fpCodigo = fpCodigo;
		this.fpDetalle = fpDetalle;
	}

	public String getFpCodigo() {
		return fpCodigo;
	}

	public void setFpCodigo(String fpCodigo) {
		this.fpCodigo = fpCodigo;
	}

	public String getFpDetalle() {
		return fpDetalle;
	}

	public void setFpDetalle(String fpDetalle) {
		this.fpDetalle = fpDetalle;
	}

	@Override
	public String toString() {
		return fpDetalle;
	}
}
