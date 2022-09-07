package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ListaPreLiquidacionTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String plMotivo;
	private String plNumero;
	private String plLote;
	private String plFecha;
	private String pisSector;
	private String pisNumero;
	private String cliCodigo;
	private String cliNombre;
	private BigDecimal plLibrasEnviadas;
	private BigDecimal plLibrasRecibidas;
	private BigDecimal plLibrasBasura;
	private BigDecimal plLibrasRetiradas;
	private BigDecimal plLibrasNetas;
	private BigDecimal plLibrasEntero;
	private BigDecimal plLibrasCola;
	private BigDecimal plLibrasColaProcesadas;
	private BigDecimal plAnimalesCosechados;
	private BigDecimal plTotalMonto;
	private String plPendiente;
	private String plAnulado;

	public ListaPreLiquidacionTO() {
	}

	public ListaPreLiquidacionTO(String plMotivo, String plNumero, String plLote, String plFecha,
			BigDecimal plLibrasEnviadas, BigDecimal plLibrasRecibidas, BigDecimal plLibrasBasura,
			BigDecimal plLibrasRetiradas, BigDecimal plLibrasNetas, BigDecimal plLibrasEntero, BigDecimal plLibrasCola,
			BigDecimal plLibrasColaProcesadas, BigDecimal plAnimalesCosechados, BigDecimal plTotalMonto,
			String plPendiente, String plAnulado, String cliCodigo, String cliNombre, String pisSector,
			String pisNumero, Integer id) {
		this.plMotivo = plMotivo;
		this.plNumero = plNumero;
		this.plLote = plLote;
		this.plFecha = plFecha;
		this.plLibrasEnviadas = plLibrasEnviadas;
		this.plLibrasRecibidas = plLibrasRecibidas;
		this.plLibrasBasura = plLibrasBasura;
		this.plLibrasRetiradas = plLibrasRetiradas;
		this.plLibrasNetas = plLibrasNetas;
		this.plLibrasEntero = plLibrasEntero;
		this.plLibrasCola = plLibrasCola;
		this.plLibrasColaProcesadas = plLibrasColaProcesadas;
		this.plAnimalesCosechados = plAnimalesCosechados;
		this.plTotalMonto = plTotalMonto;
		this.plPendiente = plPendiente;
		this.plAnulado = plAnulado;
		this.cliCodigo = cliCodigo;
		this.cliNombre = cliNombre;
		this.pisSector = pisSector;
		this.pisNumero = pisNumero;
		this.id = id;
	}

	@Id
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "pl_cliente_codigo")
	public String getCliCodigo() {
		return cliCodigo;
	}

	@Column(name = "pl_cliente_nombre")
	public String getCliNombre() {
		return cliNombre;
	}

	@Column(name = "pl_animales_cosechados")
	public BigDecimal getPlAnimalesCosechados() {
		return plAnimalesCosechados;
	}

	@Column(name = "pl_anulado")
	public String getPlAnulado() {
		return plAnulado;
	}

	@Column(name = "pl_fecha")
	public String getPlFecha() {
		return plFecha;
	}

	@Column(name = "pl_libras_basura")
	public BigDecimal getPlLibrasBasura() {
		return plLibrasBasura;
	}

	@Column(name = "pl_libras_cola")
	public BigDecimal getPlLibrasCola() {
		return plLibrasCola;
	}

	@Column(name = "pl_libras_cola_procesadas")
	public BigDecimal getPlLibrasColaProcesadas() {
		return plLibrasColaProcesadas;
	}

	@Column(name = "pl_libras_entero")
	public BigDecimal getPlLibrasEntero() {
		return plLibrasEntero;
	}

	@Column(name = "pl_libras_enviadas")
	public BigDecimal getPlLibrasEnviadas() {
		return plLibrasEnviadas;
	}

	@Column(name = "pl_libras_neta")
	public BigDecimal getPlLibrasNetas() {
		return plLibrasNetas;
	}

	@Column(name = "pl_libras_recibidas")
	public BigDecimal getPlLibrasRecibidas() {
		return plLibrasRecibidas;
	}

	@Column(name = "pl_libras_retiradas")
	public BigDecimal getPlLibrasRetiradas() {
		return plLibrasRetiradas;
	}

	@Column(name = "pl_lote")
	public String getPlLote() {
		return plLote;
	}

	@Column(name = "pl_motivo")
	public String getPlMotivo() {
		return plMotivo;
	}

	@Column(name = "pl_numero")
	public String getPlNumero() {
		return plNumero;
	}

	@Column(name = "pl_pendiente")
	public String getPlPendiente() {
		return plPendiente;
	}

	@Column(name = "pl_total_monto")
	public BigDecimal getPlTotalMonto() {
		return plTotalMonto;
	}

	@Column(name = "pl_piscina")
	public String getPisNumero() {
		return pisNumero;
	}

	@Column(name = "pl_sector")
	public String getPisSector() {
		return pisSector;
	}

	public void setPlMotivo(String plMotivo) {
		this.plMotivo = plMotivo;
	}

	public void setPlNumero(String plNumero) {
		this.plNumero = plNumero;
	}

	public void setPlLote(String plLote) {
		this.plLote = plLote;
	}

	public void setPlFecha(String plFecha) {
		this.plFecha = plFecha;
	}

	public void setPisSector(String pisSector) {
		this.pisSector = pisSector;
	}

	public void setPisNumero(String pisNumero) {
		this.pisNumero = pisNumero;
	}

	public void setCliCodigo(String cliCodigo) {
		this.cliCodigo = cliCodigo;
	}

	public void setCliNombre(String cliNombre) {
		this.cliNombre = cliNombre;
	}

	public void setPlLibrasEnviadas(BigDecimal plLibrasEnviadas) {
		this.plLibrasEnviadas = plLibrasEnviadas;
	}

	public void setPlLibrasRecibidas(BigDecimal plLibrasRecibidas) {
		this.plLibrasRecibidas = plLibrasRecibidas;
	}

	public void setPlLibrasBasura(BigDecimal plLibrasBasura) {
		this.plLibrasBasura = plLibrasBasura;
	}

	public void setPlLibrasRetiradas(BigDecimal plLibrasRetiradas) {
		this.plLibrasRetiradas = plLibrasRetiradas;
	}

	public void setPlLibrasNetas(BigDecimal plLibrasNetas) {
		this.plLibrasNetas = plLibrasNetas;
	}

	public void setPlLibrasEntero(BigDecimal plLibrasEntero) {
		this.plLibrasEntero = plLibrasEntero;
	}

	public void setPlLibrasCola(BigDecimal plLibrasCola) {
		this.plLibrasCola = plLibrasCola;
	}

	public void setPlLibrasColaProcesadas(BigDecimal plLibrasColaProcesadas) {
		this.plLibrasColaProcesadas = plLibrasColaProcesadas;
	}

	public void setPlAnimalesCosechados(BigDecimal plAnimalesCosechados) {
		this.plAnimalesCosechados = plAnimalesCosechados;
	}

	public void setPlTotalMonto(BigDecimal plTotalMonto) {
		this.plTotalMonto = plTotalMonto;
	}

	public void setPlPendiente(String plPendiente) {
		this.plPendiente = plPendiente;
	}

	public void setPlAnulado(String plAnulado) {
		this.plAnulado = plAnulado;
	}

}
