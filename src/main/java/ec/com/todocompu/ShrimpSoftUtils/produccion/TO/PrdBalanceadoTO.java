/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;

/**
 *
 * @author Carlos Ajila
 */
public class PrdBalanceadoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String balEmpresa;
	private String balCodigoPrincipal;
	private double balFactorLibras;

	public PrdBalanceadoTO() {
	}

	public PrdBalanceadoTO(String balEmpresa, String balCodigoPrincipal, double balFactorLibras) {
		this.balEmpresa = balEmpresa;
		this.balCodigoPrincipal = balCodigoPrincipal;
		this.balFactorLibras = balFactorLibras;
	}

	public String getBalCodigoPrincipal() {
		return balCodigoPrincipal;
	}

	public void setBalCodigoPrincipal(String balCodigoPrincipal) {
		this.balCodigoPrincipal = balCodigoPrincipal;
	}

	public String getBalEmpresa() {
		return balEmpresa;
	}

	public void setBalEmpresa(String balEmpresa) {
		this.balEmpresa = balEmpresa;
	}

	public double getBalFactorLibras() {
		return balFactorLibras;
	}

	public void setBalFactorLibras(double balFactorLibras) {
		this.balFactorLibras = balFactorLibras;
	}

}
