/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */

@Entity
public class BanBancoTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ban_empresa")
	private String empCodigo;

	@Column(name = "ban_codigo")
	private String banCodigo;

	@Column(name = "ban_nombre")
	private String banNombre;

	@Column(name = "usr_inserta_banco")
	private String usrInsertaBanco;

	@Column(name = "usr_fecha_inserta_banco")
	private String usrFechaInsertaBanco;

	public BanBancoTO() {
	}

	public BanBancoTO(String empCodigo, String banCodigo, String banNombre, String usrInsertaBanco,
			String usrFechaInsertaBanco) {
		this.empCodigo = empCodigo;
		this.banCodigo = banCodigo;
		this.banNombre = banNombre;
		this.usrInsertaBanco = usrInsertaBanco;
		this.usrFechaInsertaBanco = usrFechaInsertaBanco;
	}

	public String getBanCodigo() {
		return banCodigo;
	}

	public void setBanCodigo(String banCodigo) {
		this.banCodigo = banCodigo;
	}

	public String getBanNombre() {
		return banNombre;
	}

	public void setBanNombre(String banNombre) {
		this.banNombre = banNombre;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getUsrFechaInsertaBanco() {
		return usrFechaInsertaBanco;
	}

	public void setUsrFechaInsertaBanco(String usrFechaInsertaBanco) {
		this.usrFechaInsertaBanco = usrFechaInsertaBanco;
	}

	public String getUsrInsertaBanco() {
		return usrInsertaBanco;
	}

	public void setUsrInsertaBanco(String usrInsertaBanco) {
		this.usrInsertaBanco = usrInsertaBanco;
	}

	public String retornoDatos() {
		return this.empCodigo + " " + this.banCodigo + " " + this.banNombre + " " + this.usrInsertaBanco + " "
				+ this.usrFechaInsertaBanco;
	}

}
