package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SisListaSusTablaTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "sus_tabla")
	private String susTabla;

	public SisListaSusTablaTO() {
	}

	public SisListaSusTablaTO(String susTabla) {
		this.susTabla = susTabla;
	}

	public String getSusTabla() {
		return susTabla;
	}

	public void setSusTabla(String susTabla) {
		this.susTabla = susTabla;
	}

	@Override
	public String toString() {
		return susTabla;
	}

}
