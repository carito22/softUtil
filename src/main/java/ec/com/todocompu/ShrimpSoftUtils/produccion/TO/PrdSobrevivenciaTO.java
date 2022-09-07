/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdSobrevivenciaTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "sob_codigo")
	private Integer sobCodigo;

	@Column(name = "sob_dias_desde")
	private Integer sobDiasDesde;

	@Column(name = "sob_dias_hasta")
	private Integer sobDiasHasta;

	@Column(name = "sob_sobrevivencia")
	private BigDecimal sobSobrevivencia;

	@Column(name = "sob_alimentacion")
	private BigDecimal sobAlimentacion;

	@Column(name = "sec_empresa")
	private String secEmpresa;

	@Column(name = "sec_codigo")
	private String secCodigo;

	@Column(name = "usr_empresa")
	private String UsrEmpresa;

	@Column(name = "usr_codigo")
	private String UsrCodigo;

	@Column(name = "usr_fecha_inserta")
	private String usrFechaInsertaSobrevivencia;

	public PrdSobrevivenciaTO() {
	}

	public PrdSobrevivenciaTO(Integer sobCodigo, Integer sobDiasDesde, Integer sobDiasHasta,
			BigDecimal sobSobrevivencia, BigDecimal sobAlimentacion, String secEmpresa, String secCodigo,
			String UsrEmpresa, String UsrCodigo, String usrFechaInsertaSobrevivencia) {
		this.sobCodigo = sobCodigo;
		this.sobDiasDesde = sobDiasDesde;
		this.sobDiasHasta = sobDiasHasta;
		this.sobSobrevivencia = sobSobrevivencia;
		this.sobAlimentacion = sobAlimentacion;
		this.secEmpresa = secEmpresa;
		this.secCodigo = secCodigo;
		this.UsrEmpresa = UsrEmpresa;
		this.UsrCodigo = UsrCodigo;
		this.usrFechaInsertaSobrevivencia = usrFechaInsertaSobrevivencia;
	}

	public String getUsrCodigo() {
		return UsrCodigo;
	}

	public void setUsrCodigo(String UsrCodigo) {
		this.UsrCodigo = UsrCodigo;
	}

	public String getUsrEmpresa() {
		return UsrEmpresa;
	}

	public void setUsrEmpresa(String UsrEmpresa) {
		this.UsrEmpresa = UsrEmpresa;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public String getSecEmpresa() {
		return secEmpresa;
	}

	public void setSecEmpresa(String secEmpresa) {
		this.secEmpresa = secEmpresa;
	}

	public BigDecimal getSobAlimentacion() {
		return sobAlimentacion;
	}

	public void setSobAlimentacion(BigDecimal sobAlimentacion) {
		this.sobAlimentacion = sobAlimentacion;
	}

	public Integer getSobCodigo() {
		return sobCodigo;
	}

	public void setSobCodigo(Integer sobCodigo) {
		this.sobCodigo = sobCodigo;
	}

	public Integer getSobDiasDesde() {
		return sobDiasDesde;
	}

	public void setSobDiasDesde(Integer sobDiasDesde) {
		this.sobDiasDesde = sobDiasDesde;
	}

	public Integer getSobDiasHasta() {
		return sobDiasHasta;
	}

	public void setSobDiasHasta(Integer sobDiasHasta) {
		this.sobDiasHasta = sobDiasHasta;
	}

	public BigDecimal getSobSobrevivencia() {
		return sobSobrevivencia;
	}

	public void setSobSobrevivencia(BigDecimal sobSobrevivencia) {
		this.sobSobrevivencia = sobSobrevivencia;
	}

	public String getUsrFechaInsertaSobrevivencia() {
		return usrFechaInsertaSobrevivencia;
	}

	public void setUsrFechaInsertaSobrevivencia(String usrFechaInsertaSobrevivencia) {
		this.usrFechaInsertaSobrevivencia = usrFechaInsertaSobrevivencia;
	}
}
