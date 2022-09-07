package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.Transient;

@Entity
public class InvClienteTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cli_empresa")
    private String empCodigo;

    @Column(name = "cli_codigo")
    private String cliCodigo;

    @Column(name = "cli_id_tipo")
    private Character cliTipoId;

    @Column(name = "cli_extranjero_tipo")
    private String cliExtranjeroTipo;

    @Column(name = "cli_id_numero")
    private String cliId;

    @Column(name = "cli_nombre_comercial")
    private String cliNombreComercial;

    @Column(name = "cli_razon_social")
    private String cliRazonSocial;

    @Column(name = "cli_provincia")
    private String cliProvincia;

    @Column(name = "cli_ciudad")
    private String cliCiudad;

    @Column(name = "cli_parroquia")
    private String cliParroquia;

    @Column(name = "cli_zona")
    private String cliZona;

    @Column(name = "cli_codigo_establecimiento")
    private String cliCodigoEstablecimiento;

    @Column(name = "cli_direccion")
    private String cliDireccion;

    @Column(name = "cli_telefono")
    private String cliTelefono;

    @Column(name = "cli_celular")
    private String cliCelular;

    @Column(name = "cli_email")
    private String cliEmail;

    @Column(name = "cli_precio")
    private Short cliPrecio;

    @Column(name = "cli_dias_credito")
    private Short cliDiasCredito;

    @Column(name = "cli_cupo_credito")
    private java.math.BigDecimal cliCupoCredito;

    @Column(name = "cli_observaciones")
    private String cliObservaciones;

    @Column(name = "cli_relacionado")
    private Boolean cliRelacionado;

    @Column(name = "cli_inactivo")
    private Boolean cliInactivo;

    @Column(name = "vend_empresa")
    private String vendEmpresa;

    @Column(name = "vend_codigo")
    private String vendCodigo;

    @Column(name = "cc_codigo")
    private String cliCategoria;

    @Column(name = "usr_codigo")
    private String usrInsertaCliente;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInsertaCliente;

    @Column(name = "ge_empresa")
    private String geEmpresa;

    @Column(name = "ge_codigo")
    private String geCodigo;

    @Column(name = "cli_lugares_entrega")
    private String cliLugaresEntrega;

    @Column(name = "cli_numero_cuenta")
    private String cliNumeroCuenta;

    @Column(name = "cli_tipo_cuenta")
    private String cliTipoCuenta;

    @Column(name = "cli_sexo")
    private String cliSexo;

    @Column(name = "cli_estado_civil")
    private String cliEstadoCivil;

    @Column(name = "ban_codigo")
    private String banCodigo;

    @Column(name = "ban_empresa")
    private String banEmpresa;

    @Column(name = "vm_codigo")
    private String vmCodigo;

    @Column(name = "vm_empresa")
    private String vmEmpresa;

    @Column(name = "cli_fecha_facturacion")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date cliFechaFacturacion;

    @Column(name = "cli_descripcion")
    private String cliDescripcion;

    @Column(name = "cli_exportador")
    private Boolean cliExportador;

    @Column(name = "cli_razon_social_verificada")
    private String cliRazonSocialVerificada;

    @Column(name = "cli_dias_credito_aseguradora")
    private Integer cliDiasCreditoAseguradora;
    @Column(name = "cli_cupo_credito_aseguradora")
    private BigDecimal cliCupoCreditoAseguradora;
    @Transient
    private String claveAcceso;
    @Column(name = "pro_garantia")
    private BigDecimal proGarantia;
    @Column(name = "cli_pais")
    private String cliPais;

    public InvClienteTO() {
    }

    public InvClienteTO(String empCodigo, String cliCodigo, Character cliTipoId, String cliExtranjeroTipo, String cliId, String cliNombreComercial, String cliRazonSocial, String cliProvincia, String cliCiudad, String cliParroquia, String cliZona, String cliDireccion, String cliTelefono, String cliCelular, String cliEmail, Short cliPrecio, Short cliDiasCredito, BigDecimal cliCupoCredito, String cliObservaciones, Boolean cliRelacionado, Boolean cliInactivo, String vendEmpresa, String vendCodigo, String cliCategoria, String usrInsertaCliente, String usrFechaInsertaCliente, String geEmpresa, String geCodigo, String cliNumeroCuenta, String cliTipoCuenta, String cliSexo, String cliEstadoCivil, String banCodigo, String banEmpresa, String cliDescripcion, Boolean cliExportador) {
        this.empCodigo = empCodigo;
        this.cliCodigo = cliCodigo;
        this.cliTipoId = cliTipoId;
        this.cliExtranjeroTipo = cliExtranjeroTipo;
        this.cliId = cliId;
        this.cliNombreComercial = cliNombreComercial;
        this.cliRazonSocial = cliRazonSocial;
        this.cliProvincia = cliProvincia;
        this.cliCiudad = cliCiudad;
        this.cliParroquia = cliParroquia;
        this.cliZona = cliZona;
        this.cliDireccion = cliDireccion;
        this.cliTelefono = cliTelefono;
        this.cliCelular = cliCelular;
        this.cliEmail = cliEmail;
        this.cliPrecio = cliPrecio;
        this.cliDiasCredito = cliDiasCredito;
        this.cliCupoCredito = cliCupoCredito;
        this.cliObservaciones = cliObservaciones;
        this.cliRelacionado = cliRelacionado;
        this.cliInactivo = cliInactivo;
        this.vendEmpresa = vendEmpresa;
        this.vendCodigo = vendCodigo;
        this.cliCategoria = cliCategoria;
        this.usrInsertaCliente = usrInsertaCliente;
        this.usrFechaInsertaCliente = usrFechaInsertaCliente;
        this.geEmpresa = geEmpresa;
        this.geCodigo = geCodigo;
        this.cliNumeroCuenta = cliNumeroCuenta;
        this.cliTipoCuenta = cliTipoCuenta;
        this.cliSexo = cliSexo;
        this.cliEstadoCivil = cliEstadoCivil;
        this.banCodigo = banCodigo;
        this.banEmpresa = banEmpresa;
        this.cliDescripcion = cliDescripcion;
        this.cliExportador = cliExportador;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public Character getCliTipoId() {
        return cliTipoId;
    }

    public void setCliTipoId(Character cliTipoId) {
        this.cliTipoId = cliTipoId;
    }

    public String getCliExtranjeroTipo() {
        return cliExtranjeroTipo;
    }

    public void setCliExtranjeroTipo(String cliExtranjeroTipo) {
        this.cliExtranjeroTipo = cliExtranjeroTipo;
    }

    public String getCliId() {
        return cliId;
    }

    public void setCliId(String cliId) {
        this.cliId = cliId;
    }

    public String getCliNombreComercial() {
        return cliNombreComercial;
    }

    public void setCliNombreComercial(String cliNombreComercial) {
        this.cliNombreComercial = cliNombreComercial;
    }

    public String getCliRazonSocial() {
        return cliRazonSocial;
    }

    public void setCliRazonSocial(String cliRazonSocial) {
        this.cliRazonSocial = cliRazonSocial;
    }

    public String getCliProvincia() {
        return cliProvincia;
    }

    public void setCliProvincia(String cliProvincia) {
        this.cliProvincia = cliProvincia;
    }

    public String getCliCiudad() {
        return cliCiudad;
    }

    public void setCliCiudad(String cliCiudad) {
        this.cliCiudad = cliCiudad;
    }

    public String getCliParroquia() {
        return cliParroquia;
    }

    public void setCliParroquia(String cliParroquia) {
        this.cliParroquia = cliParroquia;
    }

    public String getCliZona() {
        return cliZona;
    }

    public void setCliZona(String cliZona) {
        this.cliZona = cliZona;
    }

    public String getCliCodigoEstablecimiento() {
        return cliCodigoEstablecimiento;
    }

    public void setCliCodigoEstablecimiento(String cliCodigoEstablecimiento) {
        this.cliCodigoEstablecimiento = cliCodigoEstablecimiento;
    }

    public String getCliDireccion() {
        return cliDireccion;
    }

    public void setCliDireccion(String cliDireccion) {
        this.cliDireccion = cliDireccion;
    }

    public String getCliTelefono() {
        return cliTelefono;
    }

    public void setCliTelefono(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }

    public String getCliCelular() {
        return cliCelular;
    }

    public void setCliCelular(String cliCelular) {
        this.cliCelular = cliCelular;
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        this.cliEmail = cliEmail;
    }

    public Short getCliPrecio() {
        return cliPrecio;
    }

    public void setCliPrecio(Short cliPrecio) {
        this.cliPrecio = cliPrecio;
    }

    public Short getCliDiasCredito() {
        return cliDiasCredito;
    }

    public void setCliDiasCredito(Short cliDiasCredito) {
        this.cliDiasCredito = cliDiasCredito;
    }

    public BigDecimal getCliCupoCredito() {
        return cliCupoCredito;
    }

    public void setCliCupoCredito(BigDecimal cliCupoCredito) {
        this.cliCupoCredito = cliCupoCredito;
    }

    public String getCliObservaciones() {
        return cliObservaciones;
    }

    public void setCliObservaciones(String cliObservaciones) {
        this.cliObservaciones = cliObservaciones;
    }

    public Boolean getCliRelacionado() {
        return cliRelacionado;
    }

    public void setCliRelacionado(Boolean cliRelacionado) {
        this.cliRelacionado = cliRelacionado;
    }

    public Boolean getCliInactivo() {
        return cliInactivo;
    }

    public void setCliInactivo(Boolean cliInactivo) {
        this.cliInactivo = cliInactivo;
    }

    public String getCliSexo() {
        return cliSexo;
    }

    public void setCliSexo(String cliSexo) {
        this.cliSexo = cliSexo;
    }

    public String getCliEstadoCivil() {
        return cliEstadoCivil;
    }

    public void setCliEstadoCivil(String cliEstadoCivil) {
        this.cliEstadoCivil = cliEstadoCivil;
    }

    public String getVendEmpresa() {
        return vendEmpresa;
    }

    public void setVendEmpresa(String vendEmpresa) {
        this.vendEmpresa = vendEmpresa;
    }

    public String getVendCodigo() {
        return vendCodigo;
    }

    public void setVendCodigo(String vendCodigo) {
        this.vendCodigo = vendCodigo;
    }

    public String getCliCategoria() {
        return cliCategoria;
    }

    public void setCliCategoria(String cliCategoria) {
        this.cliCategoria = cliCategoria;
    }

    public String getUsrInsertaCliente() {
        return usrInsertaCliente;
    }

    public void setUsrInsertaCliente(String usrInsertaCliente) {
        this.usrInsertaCliente = usrInsertaCliente;
    }

    public String getUsrFechaInsertaCliente() {
        return usrFechaInsertaCliente;
    }

    public void setUsrFechaInsertaCliente(String usrFechaInsertaCliente) {
        this.usrFechaInsertaCliente = usrFechaInsertaCliente;
    }

    public String getGeEmpresa() {
        return geEmpresa;
    }

    public void setGeEmpresa(String geEmpresa) {
        this.geEmpresa = geEmpresa;
    }

    public String getGeCodigo() {
        return geCodigo;
    }

    public void setGeCodigo(String geCodigo) {
        this.geCodigo = geCodigo;
    }

    public String getCliLugaresEntrega() {
        return cliLugaresEntrega;
    }

    public void setCliLugaresEntrega(String cliLugaresEntrega) {
        this.cliLugaresEntrega = cliLugaresEntrega;
    }

    public String getCliNumeroCuenta() {
        return cliNumeroCuenta;
    }

    public void setCliNumeroCuenta(String cliNumeroCuenta) {
        this.cliNumeroCuenta = cliNumeroCuenta;
    }

    public String getCliTipoCuenta() {
        return cliTipoCuenta;
    }

    public void setCliTipoCuenta(String cliTipoCuenta) {
        this.cliTipoCuenta = cliTipoCuenta;
    }

    public String getCliDescripcion() {
        return cliDescripcion;
    }

    public void setCliDescripcion(String cliDescripcion) {
        this.cliDescripcion = cliDescripcion;
    }

    public String getBanCodigo() {
        return banCodigo;
    }

    public void setBanCodigo(String banCodigo) {
        this.banCodigo = banCodigo;
    }

    public String getBanEmpresa() {
        return banEmpresa;
    }

    public void setBanEmpresa(String banEmpresa) {
        this.banEmpresa = banEmpresa;
    }

    public String getVmCodigo() {
        return vmCodigo;
    }

    public void setVmCodigo(String vmCodigo) {
        this.vmCodigo = vmCodigo;
    }

    public String getVmEmpresa() {
        return vmEmpresa;
    }

    public void setVmEmpresa(String vmEmpresa) {
        this.vmEmpresa = vmEmpresa;
    }

    public Date getCliFechaFacturacion() {
        return cliFechaFacturacion;
    }

    public void setCliFechaFacturacion(Date cliFechaFacturacion) {
        this.cliFechaFacturacion = cliFechaFacturacion;
    }

    public Boolean getCliExportador() {
        return cliExportador;
    }

    public void setCliExportador(Boolean cliExportador) {
        this.cliExportador = cliExportador;
    }

    public String getCliRazonSocialVerificada() {
        return cliRazonSocialVerificada;
    }

    public void setCliRazonSocialVerificada(String cliRazonSocialVerificada) {
        this.cliRazonSocialVerificada = cliRazonSocialVerificada;
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

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public BigDecimal getProGarantia() {
        return proGarantia;
    }

    public void setProGarantia(BigDecimal proGarantia) {
        this.proGarantia = proGarantia;
    }

    public String getCliPais() {
        return cliPais;
    }

    public void setCliPais(String cliPais) {
        this.cliPais = cliPais;
    }

    @Override
    public String toString() {
        return this.empCodigo + " " + this.cliCodigo + " " + this.cliTipoId + " " + this.cliId + " " + this.cliNombreComercial
                + " " + this.cliRazonSocial + " " + this.cliProvincia + " " + this.cliCiudad + " " + this.cliZona + " "
                + this.cliDireccion + " " + this.cliTelefono + " " + this.cliCelular + this.cliEmail + " "
                + this.cliPrecio + " " + this.cliDiasCredito + " " + this.cliCupoCredito + " " + this.cliObservaciones
                + " " + this.cliInactivo + " " + " " + this.usrInsertaCliente + " " + this.usrFechaInsertaCliente;
    }
}
