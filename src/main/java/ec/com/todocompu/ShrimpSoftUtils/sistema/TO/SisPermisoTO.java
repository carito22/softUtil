/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class SisPermisoTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "per_item")
	private String perItem;
	@Column(name = "per_empresa")
	private String perEmpresa;
	@Column(name = "per_modulo")
	private String perModulo;
	@Column(name = "per_menu")
	private String perMenu;
	@Column(name = "per_item_etiqueta")
	private String perItemEtiqueta;
	@Column(name = "per_secuencia")
	private Integer perSecuencia;
	@Column(name = "per_usuarios")
	// perUsuarios
	private String codigoGrupo;
	@Column(name = "per_activo")
	private Boolean perActivo;
	@Column(name = "emp_codigo")
	private String empCodigo;

	public SisPermisoTO() {
	}

	public SisPermisoTO(String perEmpresa, String perModulo, String perMenu, String perItem, String perItemEtiqueta,
			Integer perSecuencia, String codigoGrupo, Boolean perActivo, String empCodigo) {
		this.perEmpresa = perEmpresa;
		this.perModulo = perModulo;
		this.perMenu = perMenu;
		this.perItem = perItem;
		this.perItemEtiqueta = perItemEtiqueta;
		this.perSecuencia = perSecuencia;
		this.codigoGrupo = codigoGrupo;
		this.perActivo = perActivo;
		this.empCodigo = empCodigo;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public Boolean getPerActivo() {
		return perActivo;
	}

	public void setPerActivo(Boolean perActivo) {
		this.perActivo = perActivo;
	}

	public String getPerEmpresa() {
		return perEmpresa;
	}

	public void setPerEmpresa(String perEmpresa) {
		this.perEmpresa = perEmpresa;
	}

	public String getPerItem() {
		return perItem;
	}

	public void setPerItem(String perItem) {
		this.perItem = perItem;
	}

	public String getPerItemEtiqueta() {
		return perItemEtiqueta;
	}

	public void setPerItemEtiqueta(String perItemEtiqueta) {
		this.perItemEtiqueta = perItemEtiqueta;
	}

	public String getPerMenu() {
		return perMenu;
	}

	public void setPerMenu(String perMenu) {
		this.perMenu = perMenu;
	}

	public String getPerModulo() {
		return perModulo;
	}

	public void setPerModulo(String perModulo) {
		this.perModulo = perModulo;
	}

	public Integer getPerSecuencia() {
		return perSecuencia;
	}

	public void setPerSecuencia(Integer perSecuencia) {
		this.perSecuencia = perSecuencia;
	}

	public String getCodigoGrupo() {
		return codigoGrupo;
	}

	public void setCodigoGrupos(String codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}
}
