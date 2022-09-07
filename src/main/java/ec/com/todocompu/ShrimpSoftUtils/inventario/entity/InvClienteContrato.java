/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author VALDIVIEZO
 */
@Entity
@Table(name = "inv_cliente_contrato", schema = "inventario")
public class InvClienteContrato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "cli_secuencial")
    private Integer cliSecuencial;

    @JoinColumns({
        @JoinColumn(name = "cli_empresa", referencedColumnName = "cli_empresa")
        ,@JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo")})
    @ManyToOne
    private InvCliente invCliente;

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

    @JoinColumns({
        @JoinColumn(name = "bod_empresa", referencedColumnName = "bod_empresa")
        ,
        @JoinColumn(name = "bod_codigo", referencedColumnName = "bod_codigo")})
    @ManyToOne
    private InvBodega invBodega;

    @JoinColumns({
        @JoinColumn(name = "cli_tipo_codigo", referencedColumnName = "cli_codigo")
        ,
        @JoinColumn(name = "cli_tipo_empresa", referencedColumnName = "cli_empresa")})
    @ManyToOne
    private InvClienteContratoTipo invClienteContratoTipo;

    @Column(name = "cli_usuario")
    private String cliUsuario;
    @Column(name = "cli_password")
    private String cliPassword;

    @Column(name = "wispro_contrato_id")
    private String wisproContratoId;

    @Column(name = "cli_fecha_corte")
    private Date cliFechaCorte;

    public InvClienteContrato() {
    }

    public InvClienteContrato(Integer cliSecuencial) {
        this.cliSecuencial = cliSecuencial;
    }

    public Integer getCliSecuencial() {
        return cliSecuencial;
    }

    public void setCliSecuencial(Integer cliSecuencial) {
        this.cliSecuencial = cliSecuencial;
    }

    public InvCliente getInvCliente() {
        return invCliente;
    }

    public void setInvCliente(InvCliente invCliente) {
        this.invCliente = invCliente;
    }

    public String getCliEstablecimiento() {
        return cliEstablecimiento;
    }

    public void setCliEstablecimiento(String cliEstablecimiento) {
        this.cliEstablecimiento = cliEstablecimiento;
    }

    public String getCliNumeroContrato() {
        return cliNumeroContrato;
    }

    public void setCliNumeroContrato(String cliNumeroContrato) {
        this.cliNumeroContrato = cliNumeroContrato;
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

    public BigDecimal getCliTarifa() {
        return cliTarifa;
    }

    public void setCliTarifa(BigDecimal cliTarifa) {
        this.cliTarifa = cliTarifa;
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

    public InvBodega getInvBodega() {
        return invBodega;
    }

    public void setInvBodega(InvBodega invBodega) {
        this.invBodega = invBodega;
    }

    public InvClienteContratoTipo getInvClienteContratoTipo() {
        return invClienteContratoTipo;
    }

    public void setInvClienteContratoTipo(InvClienteContratoTipo invClienteContratoTipo) {
        this.invClienteContratoTipo = invClienteContratoTipo;
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
