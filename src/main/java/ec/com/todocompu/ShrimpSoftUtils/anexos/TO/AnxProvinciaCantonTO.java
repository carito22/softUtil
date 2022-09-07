package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnxProvinciaCantonTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String codigo;
	private String nombre;

	public AnxProvinciaCantonTO() {

	}

	public AnxProvinciaCantonTO(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	@Id
	@Column(name = "codigo_provincia")
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "nombre_provincia")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
}