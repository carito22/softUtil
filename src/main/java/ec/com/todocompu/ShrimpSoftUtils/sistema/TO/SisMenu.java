package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SisMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	private String perModulo;
	private String perMenu;
	private String perItem;
	private String perItemEtiqueta;
	private String perUrl;
	private String perIcono;
	private Boolean perEstado;

	public SisMenu() {
	}

	public SisMenu(String perModulo, String perMenu, String perItem, String perItemEtiqueta, String perUrl,
			String perIcono, Boolean perEstado) {
		this.perModulo = perModulo;
		this.perMenu = perMenu;
		this.perItem = perItem;
		this.perItemEtiqueta = perItemEtiqueta;
		this.perUrl = perUrl;
		this.perIcono = perIcono;
		this.perEstado = perEstado;
	}

	@Column(name = "per_modulo")
	public String getPerModulo() {
		return perModulo;
	}

	public void setPerModulo(String perModulo) {
		this.perModulo = perModulo;
	}

	@Column(name = "per_menu")
	public String getPerMenu() {
		return perMenu;
	}

	public void setPerMenu(String perMenu) {
		this.perMenu = perMenu;
	}

	@Id
	@Column(name = "per_item")
	public String getPerItem() {
		return perItem;
	}

	public void setPerItem(String perItem) {
		this.perItem = perItem;
	}

	@Column(name = "per_item_etiqueta")
	public String getPerItemEtiqueta() {
		return perItemEtiqueta;
	}

	public void setPerItemEtiqueta(String perItemEtiqueta) {
		this.perItemEtiqueta = perItemEtiqueta;
	}

	@Column(name = "per_url")
	public String getPerUrl() {
		return perUrl;
	}

	public void setPerUrl(String perUrl) {
		this.perUrl = perUrl;
	}

	@Column(name = "per_icono")
	public String getPerIcono() {
		return perIcono;
	}

	public void setPerIcono(String perIcono) {
		this.perIcono = perIcono;
	}

	@Column(name = "per_estado")
	public Boolean getPerEstado() {
		return perEstado;
	}

	public void setPerEstado(Boolean perEstado) {
		this.perEstado = perEstado;
	}

	@Override
	public String toString() {
		return "SisMenu [perModulo=" + perModulo + ", perMenu=" + perMenu + ", perItem=" + perItem
				+ ", perItemEtiqueta=" + perItemEtiqueta + ", perUrl=" + perUrl + ", perIcono=" + perIcono
				+ ", perEstado=" + perEstado + "]";
	}

}
