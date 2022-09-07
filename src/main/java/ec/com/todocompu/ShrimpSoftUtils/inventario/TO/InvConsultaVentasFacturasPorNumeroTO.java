/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvConsultaVentasFacturasPorNumeroTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "vta_empresa")
	private String vtaEmpresa;

	@Column(name = "vta_periodo")
	private String vtaPeriodo;

	@Column(name = "vta_motivo")
	private String vtaMotivo;

	@Column(name = "vta_numero")
	private String vtaNumero;

	public InvConsultaVentasFacturasPorNumeroTO() {
	}

	public InvConsultaVentasFacturasPorNumeroTO(String vtaEmpresa, String vtaPeriodo, String vtaMotivo,
			String vtaNumero) {
		this.vtaEmpresa = vtaEmpresa;
		this.vtaPeriodo = vtaPeriodo;
		this.vtaMotivo = vtaMotivo;
		this.vtaNumero = vtaNumero;
	}

	public String getVtaEmpresa() {
		return vtaEmpresa;
	}

	public void setVtaEmpresa(String vtaEmpresa) {
		this.vtaEmpresa = vtaEmpresa;
	}

	public String getVtaMotivo() {
		return vtaMotivo;
	}

	public void setVtaMotivo(String vtaMotivo) {
		this.vtaMotivo = vtaMotivo;
	}

	public String getVtaNumero() {
		return vtaNumero;
	}

	public void setVtaNumero(String vtaNumero) {
		this.vtaNumero = vtaNumero;
	}

	public String getVtaPeriodo() {
		return vtaPeriodo;
	}

	public void setVtaPeriodo(String vtaPeriodo) {
		this.vtaPeriodo = vtaPeriodo;
	}

}
