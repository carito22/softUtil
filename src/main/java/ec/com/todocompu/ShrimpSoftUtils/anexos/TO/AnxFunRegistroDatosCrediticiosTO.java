/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author charly
 */
@Entity
public class AnxFunRegistroDatosCrediticiosTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "cli_codigo_dinardap")
	private String cliCodigoDinardap;

	@Column(name = "cli_fecha_corte")
	private String cliFechaCorte;

	@Column(name = "cli_id_tipo")
	private Character cliTipoId;

	@Column(name = "cli_id_numero")
	private String cliID;

	@Column(name = "cli_razon_social")
	private String cliRazonSocial;

	@Column(name = "cli_clase_sujeto")
	private Character cliClaseSujeto;

	@Column(name = "cli_provincia")
	private String cliProvincia;

	@Column(name = "cli_ciudad")
	private String cliCiudad;

	@Column(name = "cli_parroquia")
	private String cliParroquia;

	@Column(name = "cli_sexo")
	private String cliSexo;

	@Column(name = "cli_estado_civil")
	private String cliEstadoCivil;

	@Column(name = "cli_origen_ingresos")
	private String cliOrigenIngreso;

	@Column(name = "vta_documento_numero")
	private String vtaDocumentoNumero;

	@Column(name = "vta_total")
	private BigDecimal vtaTotal;

	@Column(name = "vta_saldo")
	private BigDecimal vtaSaldo;

	@Column(name = "vta_fecha")
	private String vtaFechaConcecion;

	@Column(name = "vta_fecha_vencimiento")
	private String VtaFechaVencimiento;

	@Column(name = "vta_fecha_exigible")
	private String vtaFechaExigible;

	@Column(name = "vta_plazo_operacion")
	private BigDecimal vtaPlazoOperacion;

	@Column(name = "vta_periodicidad_pago")
	private BigDecimal vtaPeriodicidadPago;

	@Column(name = "vta_dias_morosidad")
	private BigDecimal vtaDiasMorosidad;

	@Column(name = "vta_monto_morosidad")
	private BigDecimal vtaMontoMorosidad;

	@Column(name = "vta_monto_interes_mora")
	private BigDecimal vtaMontoInteresMora;

	@Column(name = "vta_valor_por_vencer_01_30")
	private BigDecimal vtaValorPorVencer0130;

	@Column(name = "vta_valor_por_vencer_31_90")
	private BigDecimal vtaValorPorVencer3190;

	@Column(name = "vta_valor_por_vencer_91_180")
	private BigDecimal vtaValorPorVencer91180;

	@Column(name = "vta_valor_por_vencer_181_360")
	private BigDecimal vtaValorporVencer181360;

	@Column(name = "vta_valor_por_vencer_mas_360")
	private BigDecimal vtaValorPorVencerMas360;

	@Column(name = "vta_valor_vencido_01_30")
	private BigDecimal vtaValorVencido0130;

	@Column(name = "vta_valor_vencido_31_90")
	private BigDecimal vtaValorVencido3190;

	@Column(name = "vta_valor_vencido_91_180")
	private BigDecimal vtaValorVencido91180;

	@Column(name = "vta_valor_vencido_181_360")
	private BigDecimal vtaValorVencido181360;

	@Column(name = "vta_valor_vencido_mas_360")
	private BigDecimal vtaValorVencidomas360;

	@Column(name = "vta_valor_demanda_judicial")
	private BigDecimal vtaValorDemandaJudicial;

	@Column(name = "vta_cartera_castigada")
	private BigDecimal vtaCarteraCastigada;

	@Column(name = "vta_cuota_credito")
	private BigDecimal vtaCuotaCredito;

	@Column(name = "vta_fecha_cancelacion")
	private String vtaFechaCancelacion;

	@Column(name = "vta_forma_cancelacion")
	private Character vtaFormaCancelacion;

	public AnxFunRegistroDatosCrediticiosTO() {
	}

	public AnxFunRegistroDatosCrediticiosTO(String cliCodigoDinardap, String cliFechaCorte, Character cliTipoId,
			String cliID, String cliRazonSocial, Character cliClaseSujeto, String cliProvincia, String cliCiudad,
			String cliParroquia, String cliSexo, String cliEstadoCivil, String cliOrigenIngreso,
			String vtaDocumentoNumero, BigDecimal vtaTotal, BigDecimal vtaSaldo, String vtaFechaConcecion,
			String VtaFechaVencimiento, String vtaFechaExigible, BigDecimal vtaPlazoOperacion,
			BigDecimal vtaPeriodicidadPago, BigDecimal vtaDiasMorosidad, BigDecimal vtaMontoMorosidad,
			BigDecimal vtaMontoInteresMora, BigDecimal vtaValorPorVencer0130, BigDecimal vtaValorPorVencer3190,
			BigDecimal vtaValorPorVencer91180, BigDecimal vtaValorporVencer181360, BigDecimal vtaValorPorVencerMas360,
			BigDecimal vtaValorVencido0130, BigDecimal vtaValorVencido3190, BigDecimal vtaValorVencido91180,
			BigDecimal vtaValorVencido181360, BigDecimal vtaValorVencidomas360, BigDecimal vtaValorDemandaJudicial,
			BigDecimal vtaCarteraCastigada, BigDecimal vtaCuotaCredito, String vtaFechaCancelacion,
			Character vtaFormaCancelacion, Integer id) {
		this.cliCodigoDinardap = cliCodigoDinardap;
		this.cliFechaCorte = cliFechaCorte;
		this.cliTipoId = cliTipoId;
		this.cliID = cliID;
		this.cliRazonSocial = cliRazonSocial;
		this.cliClaseSujeto = cliClaseSujeto;
		this.cliProvincia = cliProvincia;
		this.cliCiudad = cliCiudad;
		this.cliParroquia = cliParroquia;
		this.cliSexo = cliSexo;
		this.cliEstadoCivil = cliEstadoCivil;
		this.cliOrigenIngreso = cliOrigenIngreso;
		this.vtaDocumentoNumero = vtaDocumentoNumero;
		this.vtaTotal = vtaTotal;
		this.vtaSaldo = vtaSaldo;
		this.vtaFechaConcecion = vtaFechaConcecion;
		this.VtaFechaVencimiento = VtaFechaVencimiento;
		this.vtaFechaExigible = vtaFechaExigible;
		this.vtaPlazoOperacion = vtaPlazoOperacion;
		this.vtaPeriodicidadPago = vtaPeriodicidadPago;
		this.vtaDiasMorosidad = vtaDiasMorosidad;
		this.vtaMontoMorosidad = vtaMontoMorosidad;
		this.vtaMontoInteresMora = vtaMontoInteresMora;
		this.vtaValorPorVencer0130 = vtaValorPorVencer0130;
		this.vtaValorPorVencer3190 = vtaValorPorVencer3190;
		this.vtaValorPorVencer91180 = vtaValorPorVencer91180;
		this.vtaValorporVencer181360 = vtaValorporVencer181360;
		this.vtaValorPorVencerMas360 = vtaValorPorVencerMas360;
		this.vtaValorVencido0130 = vtaValorVencido0130;
		this.vtaValorVencido3190 = vtaValorVencido3190;
		this.vtaValorVencido91180 = vtaValorVencido91180;
		this.vtaValorVencido181360 = vtaValorVencido181360;
		this.vtaValorVencidomas360 = vtaValorVencidomas360;
		this.vtaValorDemandaJudicial = vtaValorDemandaJudicial;
		this.vtaCarteraCastigada = vtaCarteraCastigada;
		this.vtaCuotaCredito = vtaCuotaCredito;
		this.vtaFechaCancelacion = vtaFechaCancelacion;
		this.vtaFormaCancelacion = vtaFormaCancelacion;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVtaFechaVencimiento() {
		return VtaFechaVencimiento;
	}

	public void setVtaFechaVencimiento(String VtaFechaVencimiento) {
		this.VtaFechaVencimiento = VtaFechaVencimiento;
	}

	public String getCliCiudad() {
		return cliCiudad;
	}

	public void setCliCiudad(String cliCiudad) {
		this.cliCiudad = cliCiudad;
	}

	public Character getCliClaseSujeto() {
		return cliClaseSujeto;
	}

	public void setCliClaseSujeto(Character cliClaseSujeto) {
		this.cliClaseSujeto = cliClaseSujeto;
	}

	public String getCliCodigoDinardap() {
		return cliCodigoDinardap;
	}

	public void setCliCodigoDinardap(String cliCodigoDinardap) {
		this.cliCodigoDinardap = cliCodigoDinardap;
	}

	public String getCliEstadoCivil() {
		return cliEstadoCivil;
	}

	public void setCliEstadoCivil(String cliEstadoCivil) {
		this.cliEstadoCivil = cliEstadoCivil;
	}

	public String getCliFechaCorte() {
		return cliFechaCorte;
	}

	public void setCliFechaCorte(String cliFechaCorte) {
		this.cliFechaCorte = cliFechaCorte;
	}

	public String getCliID() {
		return cliID;
	}

	public void setCliID(String cliID) {
		this.cliID = cliID;
	}

        public String getCliRazonSocial() {
            return cliRazonSocial;
        }

        public void setCliRazonSocial(String cliRazonSocial) {
            this.cliRazonSocial = cliRazonSocial;
        }

	public String getCliOrigenIngreso() {
		return cliOrigenIngreso;
	}

	public void setCliOrigenIngreso(String cliOrigenIngreso) {
		this.cliOrigenIngreso = cliOrigenIngreso;
	}

	public String getCliParroquia() {
		return cliParroquia;
	}

	public void setCliParroquia(String cliParroquia) {
		this.cliParroquia = cliParroquia;
	}

	public String getCliProvincia() {
		return cliProvincia;
	}

	public void setCliProvincia(String cliProvincia) {
		this.cliProvincia = cliProvincia;
	}

	public String getCliSexo() {
		return cliSexo;
	}

	public void setCliSexo(String cliSexo) {
		this.cliSexo = cliSexo;
	}

	public Character getCliTipoId() {
		return cliTipoId;
	}

	public void setCliTipoId(Character cliTipoId) {
		this.cliTipoId = cliTipoId;
	}

	public BigDecimal getVtaCarteraCastigada() {
		return vtaCarteraCastigada;
	}

	public void setVtaCarteraCastigada(BigDecimal vtaCarteraCastigada) {
		this.vtaCarteraCastigada = vtaCarteraCastigada;
	}

	public BigDecimal getVtaCuotaCredito() {
		return vtaCuotaCredito;
	}

	public void setVtaCuotaCredito(BigDecimal vtaCuotaCredito) {
		this.vtaCuotaCredito = vtaCuotaCredito;
	}

	public BigDecimal getVtaDiasMorosidad() {
		return vtaDiasMorosidad;
	}

	public void setVtaDiasMorosidad(BigDecimal vtaDiasMorosidad) {
		this.vtaDiasMorosidad = vtaDiasMorosidad;
	}

	public String getVtaDocumentoNumero() {
		return vtaDocumentoNumero;
	}

	public void setVtaDocumentoNumero(String vtaDocumentoNumero) {
		this.vtaDocumentoNumero = vtaDocumentoNumero;
	}

	public String getVtaFechaCancelacion() {
		return vtaFechaCancelacion;
	}

	public void setVtaFechaCancelacion(String vtaFechaCancelacion) {
		this.vtaFechaCancelacion = vtaFechaCancelacion;
	}

	public String getVtaFechaConcecion() {
		return vtaFechaConcecion;
	}

	public void setVtaFechaConcecion(String vtaFechaConcecion) {
		this.vtaFechaConcecion = vtaFechaConcecion;
	}

	public String getVtaFechaExigible() {
		return vtaFechaExigible;
	}

	public void setVtaFechaExigible(String vtaFechaExigible) {
		this.vtaFechaExigible = vtaFechaExigible;
	}

	public Character getVtaFormaCancelacion() {
		return vtaFormaCancelacion;
	}

	public void setVtaFormaCancelacion(Character vtaFormaCancelacion) {
		this.vtaFormaCancelacion = vtaFormaCancelacion;
	}

	public BigDecimal getVtaMontoInteresMora() {
		return vtaMontoInteresMora;
	}

	public void setVtaMontoInteresMora(BigDecimal vtaMontoInteresMora) {
		this.vtaMontoInteresMora = vtaMontoInteresMora;
	}

	public BigDecimal getVtaMontoMorosidad() {
		return vtaMontoMorosidad;
	}

	public void setVtaMontoMorosidad(BigDecimal vtaMontoMorosidad) {
		this.vtaMontoMorosidad = vtaMontoMorosidad;
	}

	public BigDecimal getVtaPeriodicidadPago() {
		return vtaPeriodicidadPago;
	}

	public void setVtaPeriodicidadPago(BigDecimal vtaPeriodicidadPago) {
		this.vtaPeriodicidadPago = vtaPeriodicidadPago;
	}

	public BigDecimal getVtaPlazoOperacion() {
		return vtaPlazoOperacion;
	}

	public void setVtaPlazoOperacion(BigDecimal vtaPlazoOperacion) {
		this.vtaPlazoOperacion = vtaPlazoOperacion;
	}

	public BigDecimal getVtaSaldo() {
		return vtaSaldo;
	}

	public void setVtaSaldo(BigDecimal vtaSaldo) {
		this.vtaSaldo = vtaSaldo;
	}

	public BigDecimal getVtaTotal() {
		return vtaTotal;
	}

	public void setVtaTotal(BigDecimal vtaTotal) {
		this.vtaTotal = vtaTotal;
	}

	public BigDecimal getVtaValorDemandaJudicial() {
		return vtaValorDemandaJudicial;
	}

	public void setVtaValorDemandaJudicial(BigDecimal vtaValorDemandaJudicial) {
		this.vtaValorDemandaJudicial = vtaValorDemandaJudicial;
	}

	public BigDecimal getVtaValorPorVencer0130() {
		return vtaValorPorVencer0130;
	}

	public void setVtaValorPorVencer0130(BigDecimal vtaValorPorVencer0130) {
		this.vtaValorPorVencer0130 = vtaValorPorVencer0130;
	}

	public BigDecimal getVtaValorPorVencer3190() {
		return vtaValorPorVencer3190;
	}

	public void setVtaValorPorVencer3190(BigDecimal vtaValorPorVencer3190) {
		this.vtaValorPorVencer3190 = vtaValorPorVencer3190;
	}

	public BigDecimal getVtaValorPorVencer91180() {
		return vtaValorPorVencer91180;
	}

	public void setVtaValorPorVencer91180(BigDecimal vtaValorPorVencer91180) {
		this.vtaValorPorVencer91180 = vtaValorPorVencer91180;
	}

	public BigDecimal getVtaValorPorVencerMas360() {
		return vtaValorPorVencerMas360;
	}

	public void setVtaValorPorVencerMas360(BigDecimal vtaValorPorVencerMas360) {
		this.vtaValorPorVencerMas360 = vtaValorPorVencerMas360;
	}

	public BigDecimal getVtaValorVencido0130() {
		return vtaValorVencido0130;
	}

	public void setVtaValorVencido0130(BigDecimal vtaValorVencido0130) {
		this.vtaValorVencido0130 = vtaValorVencido0130;
	}

	public BigDecimal getVtaValorVencido181360() {
		return vtaValorVencido181360;
	}

	public void setVtaValorVencido181360(BigDecimal vtaValorVencido181360) {
		this.vtaValorVencido181360 = vtaValorVencido181360;
	}

	public BigDecimal getVtaValorVencido3190() {
		return vtaValorVencido3190;
	}

	public void setVtaValorVencido3190(BigDecimal vtaValorVencido3190) {
		this.vtaValorVencido3190 = vtaValorVencido3190;
	}

	public BigDecimal getVtaValorVencido91180() {
		return vtaValorVencido91180;
	}

	public void setVtaValorVencido91180(BigDecimal vtaValorVencido91180) {
		this.vtaValorVencido91180 = vtaValorVencido91180;
	}

	public BigDecimal getVtaValorVencidomas360() {
		return vtaValorVencidomas360;
	}

	public void setVtaValorVencidomas360(BigDecimal vtaValorVencidomas360) {
		this.vtaValorVencidomas360 = vtaValorVencidomas360;
	}

	public BigDecimal getVtaValorporVencer181360() {
		return vtaValorporVencer181360;
	}

	public void setVtaValorporVencer181360(BigDecimal vtaValorporVencer181360) {
		this.vtaValorporVencer181360 = vtaValorporVencer181360;
	}
}
