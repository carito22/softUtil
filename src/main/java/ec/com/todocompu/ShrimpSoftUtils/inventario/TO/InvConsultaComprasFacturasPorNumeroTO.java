/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvConsultaComprasFacturasPorNumeroTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	/*
	  comp_empresa, comp_periodo, comp_motivo, comp_numero 
	 */
	@Id
	@Column(name = "comp_empresa")
	private String compEmpresa;

	@Column(name = "comp_periodo")
	private String compPeriodo;

	@Column(name = "comp_motivo")
	private String compMotivo;

	@Column(name = "comp_numero")
	private String compNumero;

	
	
	
	public InvConsultaComprasFacturasPorNumeroTO(String compEmpresa, String compPeriodo, String compMotivo,
			String compNumero) {
		this.compEmpresa = compEmpresa;
		this.compPeriodo = compPeriodo;
		this.compMotivo = compMotivo;
		this.compNumero = compNumero;
	}

	public InvConsultaComprasFacturasPorNumeroTO() {
	}

	public String getCompEmpresa() {
		return compEmpresa;
	}

	public void setCompEmpresa(String compEmpresa) {
		this.compEmpresa = compEmpresa;
	}

	public String getCompPeriodo() {
		return compPeriodo;
	}

	public void setCompPeriodo(String compPeriodo) {
		this.compPeriodo = compPeriodo;
	}

	public String getCompMotivo() {
		return compMotivo;
	}

	public void setCompMotivo(String compMotivo) {
		this.compMotivo = compMotivo;
	}

	public String getCompNumero() {
		return compNumero;
	}

	public void setCompNumero(String compNumero) {
		this.compNumero = compNumero;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
