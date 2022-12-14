package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "con_estructura_flujo", schema = "contabilidad")
public class ConEstructuraFlujo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "est_empresa")
	private String estEmpresa;
	@Column(name = "est_grupo1")
	private short estGrupo1;
	@Column(name = "est_grupo2")
	private short estGrupo2;
	@Column(name = "est_grupo3")
	private short estGrupo3;
	@Column(name = "est_grupo4")
	private short estGrupo4;
	@Column(name = "est_grupo5")
	private short estGrupo5;
	@Column(name = "est_grupo6")
	private short estGrupo6;
	@Column(name = "emp_codigo")
	private String empCodigo;

	public ConEstructuraFlujo() {
	}

	public ConEstructuraFlujo(String estEmpresa) {
		this.estEmpresa = estEmpresa;
	}

	public ConEstructuraFlujo(String estEmpresa, short estGrupo1, short estGrupo2, short estGrupo3, short estGrupo4,
			short estGrupo5, short estGrupo6, String empCodigo) {
		this.estEmpresa = estEmpresa;
		this.estGrupo1 = estGrupo1;
		this.estGrupo2 = estGrupo2;
		this.estGrupo3 = estGrupo3;
		this.estGrupo4 = estGrupo4;
		this.estGrupo5 = estGrupo5;
		this.estGrupo6 = estGrupo6;
		this.empCodigo = empCodigo;
	}

	public String getEstEmpresa() {
		return estEmpresa;
	}

	public void setEstEmpresa(String estEmpresa) {
		this.estEmpresa = estEmpresa;
	}

	public short getEstGrupo1() {
		return estGrupo1;
	}

	public void setEstGrupo1(short estGrupo1) {
		this.estGrupo1 = estGrupo1;
	}

	public short getEstGrupo2() {
		return estGrupo2;
	}

	public void setEstGrupo2(short estGrupo2) {
		this.estGrupo2 = estGrupo2;
	}

	public short getEstGrupo3() {
		return estGrupo3;
	}

	public void setEstGrupo3(short estGrupo3) {
		this.estGrupo3 = estGrupo3;
	}

	public short getEstGrupo4() {
		return estGrupo4;
	}

	public void setEstGrupo4(short estGrupo4) {
		this.estGrupo4 = estGrupo4;
	}

	public short getEstGrupo5() {
		return estGrupo5;
	}

	public void setEstGrupo5(short estGrupo5) {
		this.estGrupo5 = estGrupo5;
	}

	public short getEstGrupo6() {
		return estGrupo6;
	}

	public void setEstGrupo6(short estGrupo6) {
		this.estGrupo6 = estGrupo6;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (estEmpresa != null ? estEmpresa.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof ConEstructuraFlujo)) {
			return false;
		}
		ConEstructuraFlujo other = (ConEstructuraFlujo) object;
		if ((this.estEmpresa == null && other.estEmpresa != null)
				|| (this.estEmpresa != null && !this.estEmpresa.equals(other.estEmpresa))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "contabilidad.entity.ConEstructuraFlujo[ estEmpresa=" + estEmpresa + " ]";
	}

}
