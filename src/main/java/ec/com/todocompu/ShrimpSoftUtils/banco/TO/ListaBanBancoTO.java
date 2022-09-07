package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ListaBanBancoTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String banCodigo;
	private String banNombre;

	public ListaBanBancoTO() {
	}

	public ListaBanBancoTO(String banCodigo, String banNombre) {
		this.banCodigo = banCodigo;
		this.banNombre = banNombre;
	}

	@Id
	@Column(name = "ban_codigo")
	public String getBanCodigo() {
		return banCodigo;
	}

	public void setBanCodigo(String banCodigo) {
		this.banCodigo = banCodigo;
	}

	@Column(name = "ban_nombre")
	public String getBanNombre() {
		return banNombre;
	}

	public void setBanNombre(String banNombre) {
		this.banNombre = banNombre;
	}

	public String retornoDatos() {
		return this.banCodigo + " " + this.banNombre + " ";
	}

	@Override
	public String toString() {
		return this.banCodigo + " " + this.banNombre + " ";
	}

}
