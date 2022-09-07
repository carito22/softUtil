/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhListaDetalleBonosTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "db_categoria")
	private String dbCategoria;

	@Column(name = "db_fecha")
	private String dbFecha;

	@Column(name = "db_id")
	private String dbId;

	@Column(name = "db_nombres")
	private String dbNombres;

	@Column(name = "db_concepto")
	private String dbConcepto;

	@Column(name = "db_sector")
	private String dbSector;

	@Column(name = "db_piscina")
	private String dbPiscina;

	@Column(name = "db_valor")
	private BigDecimal dbValor;

	@Column(name = "db_deducible")
	private Boolean dbDeducible;
	@Column(name = "db_pendiente")
	private Boolean dbPendiente;
	@Column(name = "db_reversado")
	private Boolean dbReversado;
	@Column(name = "db_anulado")
	private Boolean dbAnulado;
	@Column(name = "db_contable")
	private String dbContable;

	@Column(name = "db_observaciones")
	private String dbObservaciones;

	public RhListaDetalleBonosTO() {
	}

	public RhListaDetalleBonosTO(Integer id, String dbCategoria, String dbFecha, String dbId, String dbNombres,
			String dbConcepto, String dbSector, String dbPiscina, BigDecimal dbValor, Boolean dbDeducible,
			Boolean dbPendiente, Boolean dbReversado, Boolean dbAnulado, String dbContable, String dbObservaciones) {
		this.id = id;
		this.dbCategoria = dbCategoria;
		this.dbFecha = dbFecha;
		this.dbId = dbId;
		this.dbNombres = dbNombres;
		this.dbConcepto = dbConcepto;
		this.dbSector = dbSector;
		this.dbPiscina = dbPiscina;
		this.dbValor = dbValor;
		this.dbDeducible = dbDeducible;
		this.dbPendiente = dbPendiente;
		this.dbReversado = dbReversado;
		this.dbAnulado = dbAnulado;
		this.dbContable = dbContable;
		this.dbObservaciones = dbObservaciones;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDbCategoria() {
		return dbCategoria;
	}

	public void setDbCategoria(String dbCategoria) {
		this.dbCategoria = dbCategoria;
	}

	public String getDbFecha() {
		return dbFecha;
	}

	public void setDbFecha(String dbFecha) {
		this.dbFecha = dbFecha;
	}

	public String getDbId() {
		return dbId;
	}

	public void setDbId(String dbId) {
		this.dbId = dbId;
	}

	public String getDbNombres() {
		return dbNombres;
	}

	public void setDbNombres(String dbNombres) {
		this.dbNombres = dbNombres;
	}

	public String getDbConcepto() {
		return dbConcepto;
	}

	public void setDbConcepto(String dbConcepto) {
		this.dbConcepto = dbConcepto;
	}

	public String getDbSector() {
		return dbSector;
	}

	public void setDbSector(String dbSector) {
		this.dbSector = dbSector;
	}

	public String getDbPiscina() {
		return dbPiscina;
	}

	public void setDbPiscina(String dbPiscina) {
		this.dbPiscina = dbPiscina;
	}

	public BigDecimal getDbValor() {
		return dbValor;
	}

	public void setDbValor(BigDecimal dbValor) {
		this.dbValor = dbValor;
	}

	public Boolean getDbDeducible() {
		return dbDeducible;
	}

	public void setDbDeducible(Boolean dbDeducible) {
		this.dbDeducible = dbDeducible;
	}

	public Boolean getDbPendiente() {
		return dbPendiente;
	}

	public void setDbPendiente(Boolean dbPendiente) {
		this.dbPendiente = dbPendiente;
	}

	public Boolean getDbReversado() {
		return dbReversado;
	}

	public void setDbReversado(Boolean dbReversado) {
		this.dbReversado = dbReversado;
	}

	public Boolean getDbAnulado() {
		return dbAnulado;
	}

	public void setDbAnulado(Boolean dbAnulado) {
		this.dbAnulado = dbAnulado;
	}

	public String getDbContable() {
		return dbContable;
	}

	public void setDbContable(String dbContable) {
		this.dbContable = dbContable;
	}

	public String getDbObservaciones() {
		return dbObservaciones;
	}

	public void setDbObservaciones(String dbObservaciones) {
		this.dbObservaciones = dbObservaciones;
	}

}
