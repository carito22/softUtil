/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.isp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Trabajo
 */
@Entity
public class IspReporteArcotel implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "contrato_secuencial")
    private Integer contratoSecuencial;

    @Column(name = "contrato_establecimiento")
    private String contratoEstablecimiento;

    @Column(name = "contrato_establecimiento_direccion")
    private String contratoEstablecimientoDireccion;

    @Column(name = "contrato_cliente_empresa")
    private String contratoClienteEmpresa;

    @Column(name = "contrato_cliente_codigo")
    private String contratoClienteCodigo;

    @Column(name = "contrato_cliente_identificacion")
    private String contratoClienteIdentificacion;

    @Column(name = "contrato_cliente_razon_social")
    private String contratoClienteRazonSocial;

    @Column(name = "contrato_direccion_ip")
    private String contratoDireccionIp;

    @Column(name = "contrato_tipo_plan")
    private String contratoTipoPlan;

    @Column(name = "contrato_comparticion")
    private String contratoComparticion;

    @Column(name = "contrato_cliente_ciudad")
    private String contratoClienteCiudad;
    @Column(name = "contrato_cliente_telefono")
    private String contratoClienteTelefono;
    @Column(name = "contrato_distancia")
    private String contratoDistancia;
    @Column(name = "contrato_fecha_consumo")
    private String contratoFechaConsumo;
    @Column(name = "contrato_tarifa")
    private String contratoTarifa;
    @Column(name = "contrato_down_link")
    private String contratoDownLink;
    @Column(name = "contrato_up_link")
    private String contratoUpLink;

    public IspReporteArcotel() {
    }

    public IspReporteArcotel(Integer contratoSecuencial, String contratoEstablecimiento, String contratoEstablecimientoDireccion, String contratoClienteEmpresa, String contratoClienteCodigo, String contratoClienteIdentificacion, String contratoClienteRazonSocial, String contratoDireccionIp, String contratoTipoPlan, String contratoComparticion) {
        this.contratoSecuencial = contratoSecuencial;
        this.contratoEstablecimiento = contratoEstablecimiento;
        this.contratoEstablecimientoDireccion = contratoEstablecimientoDireccion;
        this.contratoClienteEmpresa = contratoClienteEmpresa;
        this.contratoClienteCodigo = contratoClienteCodigo;
        this.contratoClienteIdentificacion = contratoClienteIdentificacion;
        this.contratoClienteRazonSocial = contratoClienteRazonSocial;
        this.contratoDireccionIp = contratoDireccionIp;
        this.contratoTipoPlan = contratoTipoPlan;
        this.contratoComparticion = contratoComparticion;
    }

    public Integer getContratoSecuencial() {
        return contratoSecuencial;
    }

    public void setContratoSecuencial(Integer contratoSecuencial) {
        this.contratoSecuencial = contratoSecuencial;
    }

    public String getContratoEstablecimiento() {
        return contratoEstablecimiento;
    }

    public void setContratoEstablecimiento(String contratoEstablecimiento) {
        this.contratoEstablecimiento = contratoEstablecimiento;
    }

    public String getContratoEstablecimientoDireccion() {
        return contratoEstablecimientoDireccion;
    }

    public void setContratoEstablecimientoDireccion(String contratoEstablecimientoDireccion) {
        this.contratoEstablecimientoDireccion = contratoEstablecimientoDireccion;
    }

    public String getContratoClienteEmpresa() {
        return contratoClienteEmpresa;
    }

    public void setContratoClienteEmpresa(String contratoClienteEmpresa) {
        this.contratoClienteEmpresa = contratoClienteEmpresa;
    }

    public String getContratoClienteCodigo() {
        return contratoClienteCodigo;
    }

    public void setContratoClienteCodigo(String contratoClienteCodigo) {
        this.contratoClienteCodigo = contratoClienteCodigo;
    }

    public String getContratoClienteIdentificacion() {
        return contratoClienteIdentificacion;
    }

    public void setContratoClienteIdentificacion(String contratoClienteIdentificacion) {
        this.contratoClienteIdentificacion = contratoClienteIdentificacion;
    }

    public String getContratoClienteRazonSocial() {
        return contratoClienteRazonSocial;
    }

    public void setContratoClienteRazonSocial(String contratoClienteRazonSocial) {
        this.contratoClienteRazonSocial = contratoClienteRazonSocial;
    }

    public String getContratoDireccionIp() {
        return contratoDireccionIp;
    }

    public void setContratoDireccionIp(String contratoDireccionIp) {
        this.contratoDireccionIp = contratoDireccionIp;
    }

    public String getContratoTipoPlan() {
        return contratoTipoPlan;
    }

    public void setContratoTipoPlan(String contratoTipoPlan) {
        this.contratoTipoPlan = contratoTipoPlan;
    }

    public String getContratoComparticion() {
        return contratoComparticion;
    }

    public void setContratoComparticion(String contratoComparticion) {
        this.contratoComparticion = contratoComparticion;
    }

    public String getContratoClienteCiudad() {
        return contratoClienteCiudad;
    }

    public void setContratoClienteCiudad(String contratoClienteCiudad) {
        this.contratoClienteCiudad = contratoClienteCiudad;
    }

    public String getContratoClienteTelefono() {
        return contratoClienteTelefono;
    }

    public void setContratoClienteTelefono(String contratoClienteTelefono) {
        this.contratoClienteTelefono = contratoClienteTelefono;
    }

    public String getContratoDistancia() {
        return contratoDistancia;
    }

    public void setContratoDistancia(String contratoDistancia) {
        this.contratoDistancia = contratoDistancia;
    }

    public String getContratoFechaConsumo() {
        return contratoFechaConsumo;
    }

    public void setContratoFechaConsumo(String contratoFechaConsumo) {
        this.contratoFechaConsumo = contratoFechaConsumo;
    }

    public String getContratoTarifa() {
        return contratoTarifa;
    }

    public void setContratoTarifa(String contratoTarifa) {
        this.contratoTarifa = contratoTarifa;
    }

    public String getContratoDownLink() {
        return contratoDownLink;
    }

    public void setContratoDownLink(String contratoDownLink) {
        this.contratoDownLink = contratoDownLink;
    }

    public String getContratoUpLink() {
        return contratoUpLink;
    }

    public void setContratoUpLink(String contratoUpLink) {
        this.contratoUpLink = contratoUpLink;
    }

}
