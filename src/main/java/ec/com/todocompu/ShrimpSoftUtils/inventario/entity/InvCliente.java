package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "inv_cliente", schema = "inventario")
public class InvCliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected InvClientePK invClientePK;
    @Column(name = "cli_id_tipo")
    private Character cliIdTipo;
    @Column(name = "cli_id_numero")
    private String cliIdNumero;
    @Column(name = "cli_extranjero_tipo")
    private String cliExtranjeroTipo;
    @NotNull
    @Column(name = "cli_razon_social")
    private String cliRazonSocial; //antes era el nombre
    @Size(max = 2147483647)
    @Column(name = "cli_nombre_comercial")
    private String cliNombreComercial; //antes era razon social
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
    private BigDecimal cliCupoCredito;
    @Column(name = "cli_observaciones")
    private String cliObservaciones;
    @Column(name = "cli_relacionado")
    private Boolean cliRelacionado;
    @Column(name = "cli_inactivo")
    private Boolean cliInactivo;
    @Column(name = "cli_sexo")
    private String cliSexo;
    @Column(name = "cli_estado_civil")
    private String cliEstadoCivil;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @Column(name = "cli_lugares_entrega")
    private String cliLugaresEntrega;
    @Column(name = "cli_descripcion")
    private String cliDescripcion;
    @JoinColumns({
        @JoinColumn(name = "ge_empresa", referencedColumnName = "ge_empresa")
        ,
        @JoinColumn(name = "ge_codigo", referencedColumnName = "ge_codigo")})
    @ManyToOne
    private InvClienteGrupoEmpresarial invClienteGrupoEmpresarial;
    @JoinColumns({
        @JoinColumn(name = "vend_empresa", referencedColumnName = "vend_empresa")
        ,
        @JoinColumn(name = "vend_codigo", referencedColumnName = "vend_codigo")})
    @ManyToOne
    private InvVendedor invVendedor;
    @JoinColumns({
        @JoinColumn(name = "cc_empresa", referencedColumnName = "cc_empresa")
        ,
        @JoinColumn(name = "cc_codigo", referencedColumnName = "cc_codigo")})
    @ManyToOne(optional = false)
    private InvClienteCategoria invClienteCategoria;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invCliente")
    private List<InvProformas> invProformasList;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invCliente")
    private List<InvVentas> invVentasList;

    @Size(max = 2147483647)
    @Column(name = "cli_numero_cuenta")
    private String cliNumeroCuenta;
    @Size(max = 2147483647)
    @Column(name = "cli_tipo_cuenta")
    private String cliTipoCuenta;
    @Size(max = 2147483647)
    @Column(name = "ban_codigo")
    private String banCodigo;
    @Size(max = 2147483647)
    @Column(name = "ban_empresa")
    private String banEmpresa;

    @JoinColumns({
        @JoinColumn(name = "vm_codigo", referencedColumnName = "vm_codigo")
        ,
        @JoinColumn(name = "vm_empresa", referencedColumnName = "vm_empresa")})
    @ManyToOne
    private InvVentasMotivo invVentasMotivo;
    @Column(name = "cli_fecha_facturacion")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date cliFechaFacturacion;

    @Column(name = "cli_exportador")
    private Boolean cliExportador;

    @Column(name = "cli_razon_social_verificada")
    private String cliRazonSocialVerificada;

    @Column(name = "cli_dias_credito_aseguradora")
    private Integer cliDiasCreditoAseguradora;
    @Column(name = "cli_cupo_credito_aseguradora")
    private BigDecimal cliCupoCreditoAseguradora;
    @Column(name = "pro_garantia")
    private BigDecimal proGarantia;
    @Column(name = "cli_pais")
    private String cliPais;

    public InvCliente() {
    }

    public InvCliente(InvClientePK invClientePK) {
        this.invClientePK = invClientePK;
    }

    public InvCliente(InvClientePK invClientePK, String cliRazonSocial, String usrEmpresa, String usrCodigo,
            Date usrFechaInserta) {
        this.invClientePK = invClientePK;
        this.cliRazonSocial = cliRazonSocial;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvCliente(String cliEmpresa, String cliCodigo) {
        this.invClientePK = new InvClientePK(cliEmpresa, cliCodigo);
    }

    public InvClientePK getInvClientePK() {
        return invClientePK;
    }

    public void setInvClientePK(InvClientePK invClientePK) {
        this.invClientePK = invClientePK;
    }

    public Character getCliIdTipo() {
        return cliIdTipo;
    }

    public void setCliIdTipo(Character cliIdTipo) {
        this.cliIdTipo = cliIdTipo;
    }

    public String getCliIdNumero() {
        return cliIdNumero;
    }

    public void setCliIdNumero(String cliIdNumero) {
        this.cliIdNumero = cliIdNumero;
    }

    public String getCliExtranjeroTipo() {
        return cliExtranjeroTipo;
    }

    public void setCliExtranjeroTipo(String cliExtranjeroTipo) {
        this.cliExtranjeroTipo = cliExtranjeroTipo;
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

    public String getCliDescripcion() {
        return cliDescripcion;
    }

    public void setCliDescripcion(String cliDescripcion) {
        this.cliDescripcion = cliDescripcion;
    }

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvVendedor getInvVendedor() {
        return invVendedor;
    }

    public void setInvVendedor(InvVendedor invVendedor) {
        this.invVendedor = invVendedor;
    }

    public InvClienteCategoria getInvClienteCategoria() {
        return invClienteCategoria;
    }

    public void setInvClienteCategoria(InvClienteCategoria invClienteCategoria) {
        this.invClienteCategoria = invClienteCategoria;
    }

    public List<InvProformas> getInvProformasList() {
        return invProformasList;
    }

    public void setInvProformasList(List<InvProformas> invProformasList) {
        this.invProformasList = invProformasList;
    }

    public List<InvVentas> getInvVentasList() {
        return invVentasList;
    }

    public void setInvVentasList(List<InvVentas> invVentasList) {
        this.invVentasList = invVentasList;
    }

    public BigDecimal getProGarantia() {
        return proGarantia;
    }

    public void setProGarantia(BigDecimal proGarantia) {
        this.proGarantia = proGarantia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invClientePK != null ? invClientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof InvCliente)) {
            return false;
        }
        InvCliente other = (InvCliente) object;
        if ((this.invClientePK == null && other.invClientePK != null)
                || (this.invClientePK != null && !this.invClientePK.equals(other.invClientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvCliente[ invClientePK=" + invClientePK + " ]";
    }

    public String getCliNombreComercial() {
        return cliNombreComercial;
    }

    public void setCliNombreComercial(String cliNombreComercial) {
        this.cliNombreComercial = cliNombreComercial;
    }

    public InvClienteGrupoEmpresarial getInvClienteGrupoEmpresarial() {
        return invClienteGrupoEmpresarial;
    }

    public void setInvClienteGrupoEmpresarial(InvClienteGrupoEmpresarial invClienteGrupoEmpresarial) {
        this.invClienteGrupoEmpresarial = invClienteGrupoEmpresarial;
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

    public InvVentasMotivo getInvVentasMotivo() {
        return invVentasMotivo;
    }

    public void setInvVentasMotivo(InvVentasMotivo invVentasMotivo) {
        this.invVentasMotivo = invVentasMotivo;
    }

    public String getCliCodigoEstablecimiento() {
        return cliCodigoEstablecimiento;
    }

    public void setCliCodigoEstablecimiento(String cliCodigoEstablecimiento) {
        this.cliCodigoEstablecimiento = cliCodigoEstablecimiento;
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

    public String getCliPais() {
        return cliPais;
    }

    public void setCliPais(String cliPais) {
        this.cliPais = cliPais;
    }

}
