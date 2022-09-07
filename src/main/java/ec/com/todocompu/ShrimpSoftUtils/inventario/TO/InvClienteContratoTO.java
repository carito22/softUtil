/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.math.BigDecimal;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Trabajo
 */
@Entity
public class InvClienteContratoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cli_secuencial")
    private Integer cliSecuencial;

    @Column(name = "cli_empresa")
    private String cliEmpresa;
    @Column(name = "cli_codigo")
    private String cliCodigo;

    @Column(name = "cli_id_numero")
    private String cliIdNumero;
    @Column(name = "cli_razon_social")
    private String cliRazonSocial;
    @Column(name = "cli_numero_contrato")
    private String cliNumeroContrato;
    @Column(name = "cli_establecimiento")
    private String cliEstablecimiento;
    @Column(name = "cli_tipo_plan")
    private String cliTipoPlan;
    @Column(name = "cli_comparticion")
    private String cliComparticion;
    @Column(name = "cli_direccion_ip")
    private String cliDireccionIp;
    @Column(name = "cli_distancia")
    private String cliDistancia;
    @Column(name = "cli_fecha_consumo")
    private Date cliFechaConsumo;
    @Column(name = "cli_downlink")
    private String cliDownlink;
    @Column(name = "cli_uplink")
    private String cliUplink;
    @Column(name = "cli_tarifa")
    private BigDecimal cliTarifa;

    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @Column(name = "cli_punto_emision")
    private String cliPuntoEmision;
    @Column(name = "cli_es_tercera_edad")
    private Boolean cliEsTerceraEdad;
    @Column(name = "cli_discapacitado")
    private Boolean cliDiscapacitado;

    @Column(name = "bod_empresa")
    private String bodEmpresa;
    @Column(name = "bod_codigo")
    private String bodCodigo;
    @Column(name = "bod_nombre")
    private String bodNombre;

    @Column(name = "cli_tipo_codigo")
    private String cliTipoCodigo;
    @Column(name = "cli_tipo_empresa")
    private String cliTipoEmpresa;

    @Column(name = "cli_usuario")
    private String cliUsuario;
    @Column(name = "cli_password")
    private String cliPassword;
    @Column(name = "wispro_contrato_id")
    private String wisproContratoId;
    @Column(name = "cli_fecha_corte")
    private Date cliFechaCorte;

    public InvClienteContratoTO() {
    }

    public Integer getCliSecuencial() {
        return cliSecuencial;
    }

    public void setCliSecuencial(Integer cliSecuencial) {
        this.cliSecuencial = cliSecuencial;
    }

    public String getCliEmpresa() {
        return cliEmpresa;
    }

    public void setCliEmpresa(String cliEmpresa) {
        this.cliEmpresa = cliEmpresa;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliIdNumero() {
        return cliIdNumero;
    }

    public void setCliIdNumero(String cliIdNumero) {
        this.cliIdNumero = cliIdNumero;
    }

    public String getCliRazonSocial() {
        return cliRazonSocial;
    }

    public void setCliRazonSocial(String cliRazonSocial) {
        this.cliRazonSocial = cliRazonSocial;
    }

    public String getCliNumeroContrato() {
        return cliNumeroContrato;
    }

    public void setCliNumeroContrato(String cliNumeroContrato) {
        this.cliNumeroContrato = cliNumeroContrato;
    }

    public String getCliEstablecimiento() {
        return cliEstablecimiento;
    }

    public void setCliEstablecimiento(String cliEstablecimiento) {
        this.cliEstablecimiento = cliEstablecimiento;
    }

    public String getCliTipoPlan() {
        return cliTipoPlan;
    }

    public void setCliTipoPlan(String cliTipoPlan) {
        this.cliTipoPlan = cliTipoPlan;
    }

    public String getCliComparticion() {
        return cliComparticion;
    }

    public void setCliComparticion(String cliComparticion) {
        this.cliComparticion = cliComparticion;
    }

    public String getCliDireccionIp() {
        return cliDireccionIp;
    }

    public void setCliDireccionIp(String cliDireccionIp) {
        this.cliDireccionIp = cliDireccionIp;
    }

    public String getCliDistancia() {
        return cliDistancia;
    }

    public void setCliDistancia(String cliDistancia) {
        this.cliDistancia = cliDistancia;
    }

    public Date getCliFechaConsumo() {
        return cliFechaConsumo;
    }

    public void setCliFechaConsumo(Date cliFechaConsumo) {
        this.cliFechaConsumo = cliFechaConsumo;
    }

    public String getCliDownlink() {
        return cliDownlink;
    }

    public void setCliDownlink(String cliDownlink) {
        this.cliDownlink = cliDownlink;
    }

    public String getCliUplink() {
        return cliUplink;
    }

    public void setCliUplink(String cliUplink) {
        this.cliUplink = cliUplink;
    }

    public BigDecimal getCliTarifa() {
        return cliTarifa;
    }

    public void setCliTarifa(BigDecimal cliTarifa) {
        this.cliTarifa = cliTarifa;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getCliPuntoEmision() {
        return cliPuntoEmision;
    }

    public void setCliPuntoEmision(String cliPuntoEmision) {
        this.cliPuntoEmision = cliPuntoEmision;
    }

    public Boolean getCliEsTerceraEdad() {
        return cliEsTerceraEdad;
    }

    public void setCliEsTerceraEdad(Boolean cliEsTerceraEdad) {
        this.cliEsTerceraEdad = cliEsTerceraEdad;
    }

    public Boolean getCliDiscapacitado() {
        return cliDiscapacitado;
    }

    public void setCliDiscapacitado(Boolean cliDiscapacitado) {
        this.cliDiscapacitado = cliDiscapacitado;
    }

    public String getBodEmpresa() {
        return bodEmpresa;
    }

    public void setBodEmpresa(String bodEmpresa) {
        this.bodEmpresa = bodEmpresa;
    }

    public String getBodCodigo() {
        return bodCodigo;
    }

    public void setBodCodigo(String bodCodigo) {
        this.bodCodigo = bodCodigo;
    }

    public String getBodNombre() {
        return bodNombre;
    }

    public void setBodNombre(String bodNombre) {
        this.bodNombre = bodNombre;
    }

    public String getCliTipoCodigo() {
        return cliTipoCodigo;
    }

    public void setCliTipoCodigo(String cliTipoCodigo) {
        this.cliTipoCodigo = cliTipoCodigo;
    }

    public String getCliTipoEmpresa() {
        return cliTipoEmpresa;
    }

    public void setCliTipoEmpresa(String cliTipoEmpresa) {
        this.cliTipoEmpresa = cliTipoEmpresa;
    }

    public String getCliUsuario() {
        return cliUsuario;
    }

    public void setCliUsuario(String cliUsuario) {
        this.cliUsuario = cliUsuario;
    }

    public String getCliPassword() {
        return cliPassword;
    }

    public void setCliPassword(String cliPassword) {
        this.cliPassword = cliPassword;
    }

    public String getWisproContratoId() {
        return wisproContratoId;
    }

    public void setWisproContratoId(String wisproContratoId) {
        this.wisproContratoId = wisproContratoId;
    }

    public Date getCliFechaCorte() {
        return cliFechaCorte;
    }

    public void setCliFechaCorte(Date cliFechaCorte) {
        this.cliFechaCorte = cliFechaCorte;
    }

}
