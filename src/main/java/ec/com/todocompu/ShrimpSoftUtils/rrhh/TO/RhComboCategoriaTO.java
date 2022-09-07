package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhComboCategoriaTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String catNombre;

	public RhComboCategoriaTO() {
	}

	public RhComboCategoriaTO(String catNombre) {
		this.catNombre = catNombre;
	}

	@Id
	@Column(name = "cat_nombre")
	public String getCatNombre() {
		return catNombre;
	}

	public void setCatNombre(String catNombre) {
		this.catNombre = catNombre;
	}

	@Override
	public String toString() {
		return this.catNombre.trim();
	}
}
