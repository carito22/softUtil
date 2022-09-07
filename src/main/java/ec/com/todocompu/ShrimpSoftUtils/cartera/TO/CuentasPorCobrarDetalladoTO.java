package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CuentasPorCobrarDetalladoTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "cxcd_periodo")
    private String cxcdPeriodo;
    @Column(name = "cxcd_motivo")
    private String cxcdMotivo;
    @Column(name = "cxcd_numero")
    private String cxcdNumero;
    @Column(name = "cxcd_cliente")
    private String cxcdCliente;
    @Column(name = "cxcd_cliente_id")
    private String cxcdClienteId;
    @Column(name = "cxcd_cliente_tipo_id")
    private String cxcdClienteTipoId;
    @Column(name = "cxcd_Cliente_razon_social")
    private String cxcdClienteRazonSocial;
    @Column(name = "cxcd_cliente_celular")
    private String cxcdClienteCelular;
    @Column(name = "cxcd_cliente_email")
    private String cxcdClienteEmail;
    @Column(name = "cxcd_cliente_grupo_empresarial")
    private String cxcdClienteGrupoEmpresarial;
    @Column(name = "cxcd_cliente_direccion")
    private String cxcdClienteDireccion;
    @Column(name = "cxcd_cliente_canton")
    private String cxcdClienteCanton;
    @Column(name = "cxcd_fecha_emision")
    private String cxcdFechaEmision;
    @Column(name = "cxcd_fecha_vencimiento")
    private String cxcdFechaVencimiento;
    @Column(name = "cxcd_dias_credito")
    private Integer cxcdDiasCredito;
    @Column(name = "cxcd_dias_vencidos")
    private Integer cxcdDiasVencidos;
    @Column(name = "cxcd_retencion_valor")
    private BigDecimal cxcdRetencionValor;
    @Column(name = "cxcd_retencion_numero")
    private String cxcdRetencionNumero;
    @Column(name = "cxcd_cheque_numero")
    private String cxcdChequeNumero;
    @Column(name = "cxcd_abono")
    private BigDecimal cxcdAbono;
    @Column(name = "cxcd_saldo")
    private BigDecimal cxcdSaldo;
    @Column(name = "cxcd_total")
    private BigDecimal cxcdTotal;
    @Column(name = "cxcd_cliente_banco")
    private String cxcdClienteBanco;
    @Column(name = "cxcd_cliente_tipo_cuenta")
    private String cxcdClienteTipoCuenta;
    @Column(name = "cxcd_cliente_numero_cuenta")
    private String cxcdClienteNumeroCuenta;
    @Column(name = "cxcd_vta_recurrente")
    private Integer cxcdVtaRecurrente;
    @Column(name = "cxcd_vta_observaciones")
    private String cxcdVtaObservaciones;
    @Column(name = "cxcd_cliente_codigo")
    private String cxcdClienteCodigo;
    @Column(name = "cli_dias_credito_aseguradora")
    private Integer cliDiasCreditoAseguradora;
    @Column(name = "cli_cupo_credito_aseguradora")
    private BigDecimal cliCupoCreditoAseguradora;
    @Column(name = "cxcd_cupo_credito")
    private BigDecimal cxcdCupoCredito;
    @Column(name = "cli_garantia")
    private BigDecimal cliGarantia;
    @Column(name = "cxcd_cobro")
    private String cxcdCobro;
    @Column(name = "cxcd_contrato")
    private String cxcdContrato;

    public CuentasPorCobrarDetalladoTO() {
    }

    public String getCxcdClienteCodigo() {
        return cxcdClienteCodigo;
    }

    public void setCxcdClienteCodigo(String cxcdClienteCodigo) {
        this.cxcdClienteCodigo = cxcdClienteCodigo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCxcdPeriodo() {
        return cxcdPeriodo;
    }

    public void setCxcdPeriodo(String cxcdPeriodo) {
        this.cxcdPeriodo = cxcdPeriodo;
    }

    public String getCxcdMotivo() {
        return cxcdMotivo;
    }

    public void setCxcdMotivo(String cxcdMotivo) {
        this.cxcdMotivo = cxcdMotivo;
    }

    public String getCxcdNumero() {
        return cxcdNumero;
    }

    public void setCxcdNumero(String cxcdNumero) {
        this.cxcdNumero = cxcdNumero;
    }

    public String getCxcdClienteRazonSocial() {
        return cxcdClienteRazonSocial;
    }

    public void setCxcdClienteRazonSocial(String cxcdClienteRazonSocial) {
        this.cxcdClienteRazonSocial = cxcdClienteRazonSocial;
    }

    public String getCxcdClienteCelular() {
        return cxcdClienteCelular;
    }

    public void setCxcdClienteCelular(String cxcdClienteCelular) {
        this.cxcdClienteCelular = cxcdClienteCelular;
    }

    public String getCxcdClienteEmail() {
        return cxcdClienteEmail;
    }

    public void setCxcdClienteEmail(String cxcdClienteEmail) {
        this.cxcdClienteEmail = cxcdClienteEmail;
    }

    public String getCxcdFechaEmision() {
        return cxcdFechaEmision;
    }

    public void setCxcdFechaEmision(String cxcdFechaEmision) {
        this.cxcdFechaEmision = cxcdFechaEmision;
    }

    public String getCxcdFechaVencimiento() {
        return cxcdFechaVencimiento;
    }

    public void setCxcdFechaVencimiento(String cxcdFechaVencimiento) {
        this.cxcdFechaVencimiento = cxcdFechaVencimiento;
    }

    public BigDecimal getCxcdSaldo() {
        return cxcdSaldo;
    }

    public void setCxcdSaldo(BigDecimal cxcdSaldo) {
        this.cxcdSaldo = cxcdSaldo;
    }

    public String getCxcdCliente() {
        return cxcdCliente;
    }

    public void setCxcdCliente(String cxcdCliente) {
        this.cxcdCliente = cxcdCliente;
    }

    public String getCxcdClienteId() {
        return cxcdClienteId;
    }

    public void setCxcdClienteId(String cxcdClienteId) {
        this.cxcdClienteId = cxcdClienteId;
    }

    public Integer getCxcdDiasCredito() {
        return cxcdDiasCredito;
    }

    public void setCxcdDiasCredito(Integer cxcdDiasCredito) {
        this.cxcdDiasCredito = cxcdDiasCredito;
    }

    public Integer getCxcdDiasVencidos() {
        return cxcdDiasVencidos;
    }

    public void setCxcdDiasVencidos(Integer cxcdDiasVencidos) {
        this.cxcdDiasVencidos = cxcdDiasVencidos;
    }

    public BigDecimal getCxcdTotal() {
        return cxcdTotal;
    }

    public void setCxcdTotal(BigDecimal cxcdTotal) {
        this.cxcdTotal = cxcdTotal;
    }

    public BigDecimal getCxcdRetencionValor() {
        return cxcdRetencionValor;
    }

    public void setCxcdRetencionValor(BigDecimal cxcdRetencionValor) {
        this.cxcdRetencionValor = cxcdRetencionValor;
    }

    public BigDecimal getCxcdAbono() {
        return cxcdAbono;
    }

    public void setCxcdAbono(BigDecimal cxcdAbono) {
        this.cxcdAbono = cxcdAbono;
    }

    public String getCxcdClienteGrupoEmpresarial() {
        return cxcdClienteGrupoEmpresarial;
    }

    public void setCxcdClienteGrupoEmpresarial(String cxcdClienteGrupoEmpresarial) {
        this.cxcdClienteGrupoEmpresarial = cxcdClienteGrupoEmpresarial;
    }

    public String getCxcdRetencionNumero() {
        return cxcdRetencionNumero;
    }

    public void setCxcdRetencionNumero(String cxcdRetencionNumero) {
        this.cxcdRetencionNumero = cxcdRetencionNumero;
    }

    public String getCxcdClienteTipoId() {
        return cxcdClienteTipoId;
    }

    public void setCxcdClienteTipoId(String cxcdClienteTipoId) {
        this.cxcdClienteTipoId = cxcdClienteTipoId;
    }

    public String getCxcdClienteBanco() {
        return cxcdClienteBanco;
    }

    public void setCxcdClienteBanco(String cxcdClienteBanco) {
        this.cxcdClienteBanco = cxcdClienteBanco;
    }

    public String getCxcdClienteTipoCuenta() {
        return cxcdClienteTipoCuenta;
    }

    public void setCxcdClienteTipoCuenta(String cxcdClienteTipoCuenta) {
        this.cxcdClienteTipoCuenta = cxcdClienteTipoCuenta;
    }

    public String getCxcdClienteNumeroCuenta() {
        return cxcdClienteNumeroCuenta;
    }

    public void setCxcdClienteNumeroCuenta(String cxcdClienteNumeroCuenta) {
        this.cxcdClienteNumeroCuenta = cxcdClienteNumeroCuenta;
    }

    public Integer getCxcdVtaRecurrente() {
        return cxcdVtaRecurrente;
    }

    public void setCxcdVtaRecurrente(Integer cxcdVtaRecurrente) {
        this.cxcdVtaRecurrente = cxcdVtaRecurrente;
    }

    public String getCxcdVtaObservaciones() {
        return cxcdVtaObservaciones;
    }

    public void setCxcdVtaObservaciones(String cxcdVtaObservaciones) {
        this.cxcdVtaObservaciones = cxcdVtaObservaciones;
    }

    public String getCxcdClienteDireccion() {
        return cxcdClienteDireccion;
    }

    public void setCxcdClienteDireccion(String cxcdClienteDireccion) {
        this.cxcdClienteDireccion = cxcdClienteDireccion;
    }

    public String getCxcdClienteCanton() {
        return cxcdClienteCanton;
    }

    public void setCxcdClienteCanton(String cxcdClienteCanton) {
        this.cxcdClienteCanton = cxcdClienteCanton;
    }

    public Integer getCliDiasCreditoAseguradora() {
        return cliDiasCreditoAseguradora;
    }

    public void setCliDiasCreditoAseguradora(Integer cliDiasCreditoAseguradora) {
        this.cliDiasCreditoAseguradora = cliDiasCreditoAseguradora;
    }

    public BigDecimal getCliCupoCreditoAseguradora() {
        return cliCupoCreditoAseguradora;
    }

    public void setCliCupoCreditoAseguradora(BigDecimal cliCupoCreditoAseguradora) {
        this.cliCupoCreditoAseguradora = cliCupoCreditoAseguradora;
    }

    public String getCxcdChequeNumero() {
        return cxcdChequeNumero;
    }

    public void setCxcdChequeNumero(String cxcdChequeNumero) {
        this.cxcdChequeNumero = cxcdChequeNumero;
    }

    public BigDecimal getCxcdCupoCredito() {
        return cxcdCupoCredito;
    }

    public void setCxcdCupoCredito(BigDecimal cxcdCupoCredito) {
        this.cxcdCupoCredito = cxcdCupoCredito;
    }

    public String getCxcdCobro() {
        return cxcdCobro;
    }

    public void setCxcdCobro(String cxcdCobro) {
        this.cxcdCobro = cxcdCobro;
    }

    public BigDecimal getCliGarantia() {
        return cliGarantia;
    }

    public void setCliGarantia(BigDecimal cliGarantia) {
        this.cliGarantia = cliGarantia;
    }

    public String getCxcdContrato() {
        return cxcdContrato;
    }

    public void setCxcdContrato(String cxcdContrato) {
        this.cxcdContrato = cxcdContrato;
    }

}
