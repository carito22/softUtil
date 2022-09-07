package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
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
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "inv_proveedor", schema = "inventario")
public class InvProveedor implements Serializable {

    @Size(max = 2147483647)
    @Column(name = "prov_email_orden_compra")
    private String provEmailOrdenCompra;

    @Column(name = "prov_id_tipo")
    private String provIdTipo;
    @Column(name = "prov_extranjero_tipo")
    private String provExtranjeroTipo;
    @Column(name = "prov_relacionado")
    private boolean provRelacionado;
    @Column(name = "prov_inactivo")
    private boolean provInactivo;
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected InvProveedorPK invProveedorPK;
    @Column(name = "prov_id_numero")
    private String provIdNumero;
    @NotNull
    @Column(name = "prov_razon_social")
    private String provRazonSocial;//antes se llamaba nombre
    @Column(name = "prov_nombre_comercial")
    private String provNombreComercial;//antes era razon social
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
    @Column(name = "prov_observaciones")
    private String provObservaciones;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "prov_cupo_credito")
    @NotNull
    private BigDecimal provCupoCredito;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invProveedor")
    @JsonIgnore
    private List<InvCompras> invComprasList;
    @JoinColumns({
        @JoinColumn(name = "pc_empresa", referencedColumnName = "pc_empresa")
        ,
        @JoinColumn(name = "pc_codigo", referencedColumnName = "pc_codigo")})
    @ManyToOne(optional = false)
    private InvProveedorCategoria invProveedorCategoria;
    @Size(max = 2147483647)
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

    public InvProveedor() {
    }

    public InvProveedor(InvProveedorPK invProveedorPK) {
        this.invProveedorPK = invProveedorPK;
    }

    public InvProveedor(InvProveedorPK invProveedorPK, String provRazonSocial, String usrEmpresa, String usrCodigo) {
        this.invProveedorPK = invProveedorPK;
        this.provRazonSocial = provRazonSocial;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
    }

    public String getProvExtranjeroTipo() {
        return provExtranjeroTipo;
    }

    public void setProvExtranjeroTipo(String provExtranjeroTipo) {
        this.provExtranjeroTipo = provExtranjeroTipo;
    }

    public InvProveedor(String provEmpresa, String provCodigo) {
        this.invProveedorPK = new InvProveedorPK(provEmpresa, provCodigo);
    }

    public InvProveedorPK getInvProveedorPK() {
        return invProveedorPK;
    }

    public void setInvProveedorPK(InvProveedorPK invProveedorPK) {
        this.invProveedorPK = invProveedorPK;
    }

    public String getProvIdNumero() {
        return provIdNumero;
    }

    public void setProvIdNumero(String provIdNumero) {
        this.provIdNumero = provIdNumero;
    }

    public String getProvRazonSocial() {
        return provRazonSocial;
    }

    public void setProvRazonSocial(String provRazonSocial) {
        this.provRazonSocial = provRazonSocial;
    }

    public String getProvProvincia() {
        return provProvincia;
    }

    public void setProvProvincia(String provProvincia) {
        this.provProvincia = provProvincia;
    }

    public String getProvCiudad() {
        return provCiudad;
    }

    public BigDecimal getProvCupoCredito() {
        return provCupoCredito;
    }

    public void setProvCupoCredito(BigDecimal provCupoCredito) {
        this.provCupoCredito = provCupoCredito;
    }

    public void setProvCiudad(String provCiudad) {
        this.provCiudad = provCiudad;
    }

    public String getProvParroquia() {
        return provParroquia;
    }

    public void setProvParroquia(String provParroquia) {
        this.provParroquia = provParroquia;
    }

    public String getProvZona() {
        return provZona;
    }

    public void setProvZona(String provZona) {
        this.provZona = provZona;
    }

    public String getProvDireccion() {
        return provDireccion;
    }

    public void setProvDireccion(String provDireccion) {
        this.provDireccion = provDireccion;
    }

    public String getProvTelefono() {
        return provTelefono;
    }

    public void setProvTelefono(String provTelefono) {
        this.provTelefono = provTelefono;
    }

    public String getProvCelular() {
        return provCelular;
    }

    public void setProvCelular(String provCelular) {
        this.provCelular = provCelular;
    }

    public String getProvEmail() {
        return provEmail;
    }

    public void setProvEmail(String provEmail) {
        this.provEmail = provEmail;
    }

    public String getProvObservaciones() {
        return provObservaciones;
    }

    public void setProvObservaciones(String provObservaciones) {
        this.provObservaciones = provObservaciones;
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

    public List<InvCompras> getInvComprasList() {
        return invComprasList;
    }

    public void setInvComprasList(List<InvCompras> invComprasList) {
        this.invComprasList = invComprasList;
    }

    public InvProveedorCategoria getInvProveedorCategoria() {
        return invProveedorCategoria;
    }

    public void setInvProveedorCategoria(InvProveedorCategoria invProveedorCategoria) {
        this.invProveedorCategoria = invProveedorCategoria;
    }

    public String getProvIdTipo() {
        return provIdTipo;
    }

    public void setProvIdTipo(String provIdTipo) {
        this.provIdTipo = provIdTipo;
    }

    public boolean getProvRelacionado() {
        return provRelacionado;
    }

    public void setProvRelacionado(boolean provRelacionado) {
        this.provRelacionado = provRelacionado;
    }

    public boolean getProvInactivo() {
        return provInactivo;
    }

    public void setProvInactivo(boolean provInactivo) {
        this.provInactivo = provInactivo;
    }

    public String getProvRazonSocialVerificada() {
        return provRazonSocialVerificada;
    }

    public void setProvRazonSocialVerificada(String provRazonSocialVerificada) {
        this.provRazonSocialVerificada = provRazonSocialVerificada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invProveedorPK != null ? invProveedorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvProveedor)) {
            return false;
        }
        InvProveedor other = (InvProveedor) object;
        if ((this.invProveedorPK == null && other.invProveedorPK != null)
                || (this.invProveedorPK != null && !this.invProveedorPK.equals(other.invProveedorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvProveedor[ invProveedorPK=" + invProveedorPK + " ]";
    }

    public String getProvNombreComercial() {
        return provNombreComercial;
    }

    public void setProvNombreComercial(String provNombreComercial) {
        this.provNombreComercial = provNombreComercial;
    }

    public String getProvEmailOrdenCompra() {
        return provEmailOrdenCompra;
    }

    public void setProvEmailOrdenCompra(String provEmailOrdenCompra) {
        this.provEmailOrdenCompra = provEmailOrdenCompra;
    }

    public String getProvLugaresEntrega() {
        return provLugaresEntrega;
    }

    public void setProvLugaresEntrega(String provLugaresEntrega) {
        this.provLugaresEntrega = provLugaresEntrega;
    }

    public Integer getProvDiasCredito() {
        return provDiasCredito;
    }

    public void setProvDiasCredito(Integer provDiasCredito) {
        this.provDiasCredito = provDiasCredito;
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

    public String getProvDescripcion() {
        return provDescripcion;
    }

    public void setProvDescripcion(String provDescripcion) {
        this.provDescripcion = provDescripcion;
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
