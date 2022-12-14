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
public class PrdGrameajeTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "gra_empresa")
	private String graEmpresa;

	@Column(name = "gra_sector")
	private String graSector;

	@Column(name = "gra_piscina")
	private String graPiscina;

	@Column(name = "gra_fecha")
	private String graFecha;

	@Column(name = "gra_tgrande")
	private BigDecimal graTGrande;

	@Column(name = "gra_tmediano")
	private BigDecimal graTMediano;

	@Column(name = "gra_tpequeno")
	private BigDecimal graTPequeno;

	@Column(name = "gra_tpromedio")
	private BigDecimal graTPromedio;

	@Column(name = "gra_itgrande")
	private BigDecimal graItGrande;

	@Column(name = "gra_itmediano")
	private BigDecimal graItMediano;

	@Column(name = "gra_itpequeno")
	private BigDecimal graItPequeno;

	@Column(name = "gra_ipromedio")
	private BigDecimal graItPromedio;

	@Column(name = "gra_biomasa")
	private BigDecimal graBiomasa;

	@Column(name = "gra_sobrevivencia")
	private BigDecimal graSobrevivencia;

	@Column(name = "gra_alimentacion")
	private BigDecimal graAlimentacion;

	@Column(name = "gra_libras_balanceado")
	private BigDecimal graLibrasBalanceado;

	@Column(name = "gra_costo_directo")
	private BigDecimal graCostoDirecto;

	@Column(name = "gra_costo_indirecto")
	private BigDecimal graCostoIndirecto;

	@Column(name = "gra_comentario")
	private String graComentario;

	@Column(name = "gra_anulado")
	private Boolean graAnulado;

	@Column(name = "pis_empresa")
	private String pisEmpresa;

	@Column(name = "pis_sector")
	private String pisSector;

	@Column(name = "pis_numero")
	private String pisNumero;

	@Column(name = "usr_empresa")
	private String usrEmpresa;

	@Column(name = "usr_codigo")
	private String usrCodigo;

	@Column(name = "usr_fecha_inserta")
	private String usrFechaInsertaGrameaje;

	public PrdGrameajeTO() {
	}

	public PrdGrameajeTO(String graEmpresa, String graSector, String graPiscina, String graFecha, BigDecimal graTGrande,
			BigDecimal graTMediano, BigDecimal graTPequeno, BigDecimal graTPromedio, BigDecimal graItGrande,
			BigDecimal graItMediano, BigDecimal graItPequeno, BigDecimal graItPromedio, BigDecimal graBiomasa,
			BigDecimal graSobrevivencia, BigDecimal graAlimentacion, BigDecimal graLibrasBalanceado,
			BigDecimal graCostoDirecto, BigDecimal graCostoIndirecto, String graComentario, Boolean graAnulado,
			String pisEmpresa, String pisSector, String pisNumero, String usrEmpresa, String usrCodigo,
			String usrFechaInsertaGrameaje) {
		this.graEmpresa = graEmpresa;
		this.graSector = graSector;
		this.graPiscina = graPiscina;
		this.graFecha = graFecha;
		this.graTGrande = graTGrande;
		this.graTMediano = graTMediano;
		this.graTPequeno = graTPequeno;
		this.graTPromedio = graTPromedio;
		this.graItGrande = graItGrande;
		this.graItMediano = graItMediano;
		this.graItPequeno = graItPequeno;
		this.graItPromedio = graItPromedio;
		this.graBiomasa = graBiomasa;
		this.graSobrevivencia = graSobrevivencia;
		this.graAlimentacion = graAlimentacion;
		this.graLibrasBalanceado = graLibrasBalanceado;
		this.graCostoDirecto = graCostoDirecto;
		this.graCostoIndirecto = graCostoIndirecto;
		this.graComentario = graComentario;
		this.graAnulado = graAnulado;
		this.pisEmpresa = pisEmpresa;
		this.pisSector = pisSector;
		this.pisNumero = pisNumero;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInsertaGrameaje = usrFechaInsertaGrameaje;
	}

	public BigDecimal getGraAlimentacion() {
		return graAlimentacion;
	}

	public void setGraAlimentacion(BigDecimal graAlimentacion) {
		this.graAlimentacion = graAlimentacion;
	}

	public Boolean getGraAnulado() {
		return graAnulado;
	}

	public void setGraAnulado(Boolean graAnulado) {
		this.graAnulado = graAnulado;
	}

	public BigDecimal getGraBiomasa() {
		return graBiomasa;
	}

	public void setGraBiomasa(BigDecimal graBiomasa) {
		this.graBiomasa = graBiomasa;
	}

	public String getGraComentario() {
		return graComentario;
	}

	public void setGraComentario(String graComentario) {
		this.graComentario = graComentario;
	}

	public BigDecimal getGraCostoDirecto() {
		return graCostoDirecto;
	}

	public void setGraCostoDirecto(BigDecimal graCostoDirecto) {
		this.graCostoDirecto = graCostoDirecto;
	}

	public BigDecimal getGraCostoIndirecto() {
		return graCostoIndirecto;
	}

	public void setGraCostoIndirecto(BigDecimal graCostoIndirecto) {
		this.graCostoIndirecto = graCostoIndirecto;
	}

	public String getGraEmpresa() {
		return graEmpresa;
	}

	public void setGraEmpresa(String graEmpresa) {
		this.graEmpresa = graEmpresa;
	}

	public String getGraFecha() {
		return graFecha;
	}

	public void setGraFecha(String graFecha) {
		this.graFecha = graFecha;
	}

	public BigDecimal getGraItGrande() {
		return graItGrande;
	}

	public void setGraItGrande(BigDecimal graItGrande) {
		this.graItGrande = graItGrande;
	}

	public BigDecimal getGraItMediano() {
		return graItMediano;
	}

	public void setGraItMediano(BigDecimal graItMediano) {
		this.graItMediano = graItMediano;
	}

	public BigDecimal getGraItPequeno() {
		return graItPequeno;
	}

	public void setGraItPequeno(BigDecimal graItPequeno) {
		this.graItPequeno = graItPequeno;
	}

	public BigDecimal getGraItPromedio() {
		return graItPromedio;
	}

	public void setGraItPromedio(BigDecimal graItPromedio) {
		this.graItPromedio = graItPromedio;
	}

	public BigDecimal getGraLibrasBalanceado() {
		return graLibrasBalanceado;
	}

	public void setGraLibrasBalanceado(BigDecimal graLibrasBalanceado) {
		this.graLibrasBalanceado = graLibrasBalanceado;
	}

	public String getGraPiscina() {
		return graPiscina;
	}

	public void setGraPiscina(String graPiscina) {
		this.graPiscina = graPiscina;
	}

	public String getGraSector() {
		return graSector;
	}

	public void setGraSector(String graSector) {
		this.graSector = graSector;
	}

	public BigDecimal getGraSobrevivencia() {
		return graSobrevivencia;
	}

	public void setGraSobrevivencia(BigDecimal graSobrevivencia) {
		this.graSobrevivencia = graSobrevivencia;
	}

	public BigDecimal getGraTGrande() {
		return graTGrande;
	}

	public void setGraTGrande(BigDecimal graTGrande) {
		this.graTGrande = graTGrande;
	}

	public BigDecimal getGraTMediano() {
		return graTMediano;
	}

	public void setGraTMediano(BigDecimal graTMediano) {
		this.graTMediano = graTMediano;
	}

	public BigDecimal getGraTPequeno() {
		return graTPequeno;
	}

	public void setGraTPequeno(BigDecimal graTPequeno) {
		this.graTPequeno = graTPequeno;
	}

	public BigDecimal getGraTPromedio() {
		return graTPromedio;
	}

	public void setGraTPromedio(BigDecimal graTPromedio) {
		this.graTPromedio = graTPromedio;
	}

	public String getPisEmpresa() {
		return pisEmpresa;
	}

	public void setPisEmpresa(String pisEmpresa) {
		this.pisEmpresa = pisEmpresa;
	}

	public String getPisNumero() {
		return pisNumero;
	}

	public void setPisNumero(String pisNumero) {
		this.pisNumero = pisNumero;
	}

	public String getPisSector() {
		return pisSector;
	}

	public void setPisSector(String pisSector) {
		this.pisSector = pisSector;
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

	public String getUsrFechaInsertaGrameaje() {
		return usrFechaInsertaGrameaje;
	}

	public void setUsrFechaInsertaGrameaje(String usrFechaInsertaGrameaje) {
		this.usrFechaInsertaGrameaje = usrFechaInsertaGrameaje;
	}
}
