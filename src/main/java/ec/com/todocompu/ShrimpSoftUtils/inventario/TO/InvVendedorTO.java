/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author developer1
 */
@Entity
public class InvVendedorTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "vend_empresa")
	String vendEmpresa;

	@Column(name = "vend_codigo")
	String vendCodigo;

	@Column(name = "vend_nombre")
	String vendNombre;

	@Column(name = "usr_empresa")
	String usrEmpresa;

	@Column(name = "usr_codigo")
	String usrCodigo;

	@Column(name = "usr_fecha_inserta")
	String usrFechaInserta;
        
        @Column(name = "vend_inactivo")
	Boolean vendInactivo;

	public InvVendedorTO() {
	}

	public InvVendedorTO(String vendEmpresa, String vendCodigo, String vendNombre, String usrEmpresa, String usrCodigo,
			String usrFechaInserta, Boolean vendInactivo) {
		this.vendEmpresa = vendEmpresa;
		this.vendCodigo = vendCodigo;
		this.vendNombre = vendNombre;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
                this.vendInactivo = vendInactivo;
	}

	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public String getUsrEmpresa() {
		return usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

	public String getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(String usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

	public String getVendCodigo() {
		return vendCodigo;
	}

	public void setVendCodigo(String vendCodigo) {
		this.vendCodigo = vendCodigo;
	}

	public String getVendEmpresa() {
		return vendEmpresa;
	}

	public void setVendEmpresa(String vendEmpresa) {
		this.vendEmpresa = vendEmpresa;
	}

	public String getVendNombre() {
		return vendNombre;
	}

	public void setVendNombre(String vendNombre) {
		this.vendNombre = vendNombre;
	}

        public Boolean getVendInactivo() {
            return vendInactivo;
        }

        public void setVendInactivo(Boolean vendInactivo) {
            this.vendInactivo = vendInactivo;
        }     

}
