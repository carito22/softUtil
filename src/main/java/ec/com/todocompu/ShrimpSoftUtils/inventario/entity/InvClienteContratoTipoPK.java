/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Usuario1
 */
@Embeddable
public class InvClienteContratoTipoPK implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "cli_codigo")
    private String cliCodigo;
    @Column(name = "cli_empresa")
    private String cliEmpresa;
    
    public InvClienteContratoTipoPK() {}
    
    public InvClienteContratoTipoPK(String cliCodigo, String cliEmpresa){
        this.cliCodigo = cliCodigo;
        this.cliEmpresa = cliEmpresa;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliEmpresa() {
        return cliEmpresa;
    }

    public void setCliEmpresa(String cliEmpresa) {
        this.cliEmpresa = cliEmpresa;
    }
    
    @Override
	public int hashCode() {
		int hash = 0;
		hash += (cliEmpresa != null ? cliEmpresa.hashCode() : 0);
		hash += (cliCodigo != null ? cliCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvClienteContratoTipoPK)) {
			return false;
		}
		InvClienteContratoTipoPK other = (InvClienteContratoTipoPK) object;
		if ((this.cliEmpresa == null && other.cliEmpresa != null)
				|| (this.cliEmpresa != null && !this.cliEmpresa.equals(other.cliEmpresa))) {
			return false;
		}
		if ((this.cliCodigo == null && other.cliCodigo != null)
				|| (this.cliCodigo != null && !this.cliCodigo.equals(other.cliCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvClienteContratoTipoPK[ cliEmpresa=" + cliEmpresa + ", cliCodigo=" + cliCodigo + " ]";
	}
    
}
