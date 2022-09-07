/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvProveedorTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "prov_codigo")
    private String provCodigo;

    @Column(name = "prov_empresa")
    private String empCodigo;

    @Column(name = "prov_id_tipo")
    private String provTipoId;

    @Column(name = "prov_extranjero_tipo")
    private String provExtranjeroTipo;

    @Column(name = "prov_id_numero")
    private String provId;

    @Column(name = "prov_nombre_comercial")
    private String provNombreComercial;

    @Column(name = "prov_razon_social")
    private String provRazonSocial;

    @Column(name = "prov_provincia")
    private String provProvincia;

    @Column(name = "prov_ciudad")
    private String provCiudad;

    @Column(name = "prov_parroquia")
    private String provParroquia;

    @Column(name = "prov_zona")
    private String provZona;

    @Column(name = "prov_direccion")
    private String provDireccion;

    @Column(name = "prov_telefono")
    private String provTelefono;

    @Column(name = "prov_celular")
    private String provCelular;

    @Column(name = "prov_email")
    private String provEmail;

    @Column(name = "prov_email_orden_compra")
    private String provEmailOrdenCompra;

    @Column(name = "prov_observaciones")
    private String provObservaciones;

    @Column(name = "prov_relacionado")
    private Boolean provRelacionado;

    @Column(name = "prov_inactivo")
    private Boolean provInactivo;

    @Column(name = "pc_empresa")
    private String provEmpresa;

    @Column(name = "pc_codigo")
    private String provCategoria;

    @Column(name = "usr_codigo")
    private String usrInsertaProveedor;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInsertaProveedor;

    @Column(name = "prov_cupo_credito")
    private BigDecimal provCupoCredito;

    @Column(name = "prov_lugares_entrega")
    private String provLugaresEntrega;

    @Column(name = "prov_dias_credito")
    private Integer provDiasCredito;

    @Column(name = "prov_banco")
    private String provBanco;

    @Column(name = "prov_tipo_cuenta")
    private String provTipoCuenta;

    @Column(name = "prov_nro_cuenta")
    private String provNroCuenta;

    @Column(name = "prov_descripcion")
    private String provDescripcion;

    @Column(name = "prov_razon_social_verificada")
    private String provRazonSocialVerificada;

    @Column(name = "prov_pais")
    private String provPais;

    @Column(name = "prov_codigo_asc")
    private String provCodigoAsc;

    @Column(name = "prov_codigo_inp")
    private String provCodigoInp;

    @Column(name = "prov_tipo_identificacion_bancaria")
    private String provTipoIdentificacionBancaria;
    @Column(name = "prov_identificacion_bancaria")
    private String provIdentificacionBancaria;

    public InvProveedorTO() {
    }

    public InvProveedorTO(String empCodigo, String provCodigo, String provTipoId, String provId, String provNombreComercial,
            String provRazonSocial, String provProvincia, String provCiudad, String provParroquia, String provZona,
            String provDireccion, String provTelefono, String provCelular, String provEmail, String provObservaciones,
            Boolean provRelacionado, Boolean provInactivo, String provCategoria, String usrInsertaProveedor,
            String usrFechaInsertaProveedor, BigDecimal provCupoCredito) {
        this.empCodigo = empCodigo;
        this.provCodigo = provCodigo;
        this.provTipoId = provTipoId;
        this.provId = provId;
        this.provNombreComercial = provNombreComercial;
        this.provRazonSocial = provRazonSocial;
        this.provProvincia = provProvincia;
        this.provCiudad = provCiudad;
        this.provParroquia = provParroquia;
        this.provZona = provZona;
        this.provDireccion = provDireccion;
        this.provTelefono = provTelefono;
        this.provCelular = provCelular;
        this.provEmail = provEmail;
        this.provObservaciones = provObservaciones;
        this.provRelacionado = provRelacionado;
        this.provInactivo = provInactivo;
        this.provCategoria = provCategoria;
        this.usrInsertaProveedor = usrInsertaProveedor;
        this.usrFechaInsertaProveedor = usrFechaInsertaProveedor;
        this.provCupoCredito = provCupoCredito;
    }

    public InvProveedorTO(String provCodigo, String empCodigo, String provTipoId, String provExtranjeroTipo, String provId, String provNombreComercial, String provRazonSocial, String provProvincia, String provCiudad, String provParroquia, String provZona, String provDireccion, String provTelefono, String provCelular, String provEmail, String provEmailOrdenCompra, String provObservaciones, Boolean provRelacionado, Boolean provInactivo, String provEmpresa, String provCategoria, String usrInsertaProveedor, String usrFechaInsertaProveedor, BigDecimal provCupoCredito, String provLugaresEntrega) {
        this.provCodigo = provCodigo;
        this.empCodigo = empCodigo;
        this.provTipoId = provTipoId;
        this.provExtranjeroTipo = provExtranjeroTipo;
        this.provId = provId;
        this.provNombreComercial = provNombreComercial;
        this.provRazonSocial = provRazonSocial;
        this.provProvincia = provProvincia;
        this.provCiudad = provCiudad;
        this.provParroquia = provParroquia;
        this.provZona = provZona;
        this.provDireccion = provDireccion;
        this.provTelefono = provTelefono;
        this.provCelular = provCelular;
        this.provEmail = provEmail;
        this.provEmailOrdenCompra = provEmailOrdenCompra;
        this.provObservaciones = provObservaciones;
        this.provRelacionado = provRelacionado;
        this.provInactivo = provInactivo;
        this.provEmpresa = provEmpresa;
        this.provCategoria = provCategoria;
        this.usrInsertaProveedor = usrInsertaProveedor;
        this.usrFechaInsertaProveedor = usrFechaInsertaProveedor;
        this.provCupoCredito = provCupoCredito;
        this.provLugaresEntrega = provLugaresEntrega;
    }

    public String getProvExtranjeroTipo() {
        return provExtranjeroTipo;
    }

    public void setProvExtranjeroTipo(String provExtranjeroTipo) {
        this.provExtranjeroTipo = provExtranjeroTipo;
    }

    public Boolean getProvRelacionado() {
        return provRelacionado;
    }

    public void setProvRelacionado(Boolean provRelacionado) {
        this.provRelacionado = provRelacionado;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getProvCategoria() {
        return provCategoria;
    }

    public void setProvCategoria(String provCategoria) {
        this.provCategoria = provCategoria;
    }

    public String getProvEmailOrdenCompra() {
        return provEmailOrdenCompra;
    }

    public void setProvEmailOrdenCompra(String provEmailOrdenCompra) {
        this.provEmailOrdenCompra = provEmailOrdenCompra;
    }

    public String getProvEmpresa() {
        return provEmpresa;
    }

    public void setProvEmpresa(String provEmpresa) {
        this.provEmpresa = provEmpresa;
    }

    public String getProvCelular() {
        return provCelular;
    }

    public void setProvCelular(String provCelular) {
        this.provCelular = provCelular;
    }

    public String getProvCiudad() {
        return provCiudad;
    }

    public void setProvCiudad(String provCiudad) {
        this.provCiudad = provCiudad;
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
    }

    public String getProvParroquia() {
        return provParroquia;
    }

    public void setProvParroquia(String provParroquia) {
        this.provParroquia = provParroquia;
    }

    public String getProvDireccion() {
        return provDireccion;
    }

    public void setProvDireccion(String provDireccion) {
        this.provDireccion = provDireccion;
    }

    public String getProvEmail() {
        return provEmail;
    }

    public void setProvEmail(String provEmail) {
        this.provEmail = provEmail;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public Boolean getProvInactivo() {
        return provInactivo;
    }

    public void setProvInactivo(Boolean provInactivo) {
        this.provInactivo = provInactivo;
    }

    public String getProvNombreComercial() {
        return provNombreComercial;
    }

    public void setProvNombreComercial(String provNombreComercial) {
        this.provNombreComercial = provNombreComercial;
    }

    public String getProvObservaciones() {
        return provObservaciones;
    }

    public void setProvObservaciones(String provObservaciones) {
        this.provObservaciones = provObservaciones;
    }

    public String getProvProvincia() {
        return provProvincia;
    }

    public void setProvProvincia(String provProvincia) {
        this.provProvincia = provProvincia;
    }

    public String getProvRazonSocial() {
        return provRazonSocial;
    }

    public void setProvRazonSocial(String provRazonSocial) {
        this.provRazonSocial = provRazonSocial;
    }

    public String getProvTelefono() {
        return provTelefono;
    }

    public void setProvTelefono(String provTelefono) {
        this.provTelefono = provTelefono;
    }

    public String getProvTipoId() {
        return provTipoId;
    }

    public void setProvTipoId(String provTipoId) {
        this.provTipoId = provTipoId;
    }

    public String getProvZona() {
        return provZona;
    }

    public void setProvZona(String provZona) {
        this.provZona = provZona;
    }

    public String getUsrFechaInsertaProveedor() {
        return usrFechaInsertaProveedor;
    }

    public void setUsrFechaInsertaProveedor(String usrFechaInsertaProveedor) {
        this.usrFechaInsertaProveedor = usrFechaInsertaProveedor;
    }

    public String getUsrInsertaProveedor() {
        return usrInsertaProveedor;
    }

    public void setUsrInsertaProveedor(String usrInsertaProveedor) {
        this.usrInsertaProveedor = usrInsertaProveedor;
    }

    public BigDecimal getProvCupoCredito() {
        return provCupoCredito;
    }

    public void setProvCupoCredito(BigDecimal provCupoCredito) {
        this.provCupoCredito = provCupoCredito;
    }

    public String getProvLugaresEntrega() {
        return provLugaresEntrega;
    }

    public void setProvLugaresEntrega(String provLugaresEntrega) {
        this.provLugaresEntrega = provLugaresEntrega;
    }

    public String getProvBanco() {
        return provBanco;
    }

    public void setProvBanco(String provBanco) {
        this.provBanco = provBanco;
    }

    public String getProvTipoCuenta() {
        return provTipoCuenta;
    }

    public void setProvTipoCuenta(String provTipoCuenta) {
        this.provTipoCuenta = provTipoCuenta;
    }

    public String getProvNroCuenta() {
        return provNroCuenta;
    }

    public void setProvNroCuenta(String provNroCuenta) {
        this.provNroCuenta = provNroCuenta;
    }

    public Integer getProvDiasCredito() {
        return provDiasCredito;
    }

    public void setProvDiasCredito(Integer provDiasCredito) {
        this.provDiasCredito = provDiasCredito;
    }

    public String getProvDescripcion() {
        return provDescripcion;
    }

    public void setProvDescripcion(String provDescripcion) {
        this.provDescripcion = provDescripcion;
    }

    public String getProvRazonSocialVerificada() {
        return provRazonSocialVerificada;
    }

    public void setProvRazonSocialVerificada(String provRazonSocialVerificada) {
        this.provRazonSocialVerificada = provRazonSocialVerificada;
    }

    public String getProvPais() {
        return provPais;
    }

    public void setProvPais(String provPais) {
        this.provPais = provPais;
    }

    public String getProvCodigoAsc() {
        return provCodigoAsc;
    }

    public void setProvCodigoAsc(String provCodigoAsc) {
        this.provCodigoAsc = provCodigoAsc;
    }

    public String getProvCodigoInp() {
        return provCodigoInp;
    }

    public void setProvCodigoInp(String provCodigoInp) {
        this.provCodigoInp = provCodigoInp;
    }

    public String getProvTipoIdentificacionBancaria() {
        return provTipoIdentificacionBancaria;
    }

    public void setProvTipoIdentificacionBancaria(String provTipoIdentificacionBancaria) {
        this.provTipoIdentificacionBancaria = provTipoIdentificacionBancaria;
    }

    public String getProvIdentificacionBancaria() {
        return provIdentificacionBancaria;
    }

    public void setProvIdentificacionBancaria(String provIdentificacionBancaria) {
        this.provIdentificacionBancaria = provIdentificacionBancaria;
    }

}
