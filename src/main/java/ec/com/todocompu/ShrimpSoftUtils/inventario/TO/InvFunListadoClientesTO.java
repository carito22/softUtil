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
public class InvFunListadoClientesTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "cli_codigo")
    private String cliCodigo;

    @Column(name = "cli_tipo_id")
    private Character cliTipoId;

    @Column(name = "cli_id")
    private String cliId;

    @Column(name = "cli_nombre_comercial")
    private String cliNombreComercial;

    @Column(name = "cli_razon_social")
    private String cliRazonSocial;

    @Column(name = "cli_categoria")
    private String cliCategoria;

    @Column(name = "cli_provincia")
    private String cliProvincia;

    @Column(name = "cli_ciudad")
    private String cliCiudad;

    @Column(name = "cli_zona")
    private String cliZona;

    @Column(name = "cli_direccion")
    private String cliDireccion;

    @Column(name = "cli_telefono")
    private String cliTelefono;

    @Column(name = "cli_celular")
    private String cliCelular;

    @Column(name = "cli_email")
    private String cliEmail;

    @Column(name = "cli_observaciones")
    private String cliObservaciones;

    @Column(name = "cli_inactivo")
    private Boolean cliInactivo;

    @Column(name = "cli_dias_credito")
    private Integer cliDiasCredito;

    @Column(name = "cli_precio")
    private Integer cliPrecio;

    @Column(name = "cli_lugares_entrega")
    private String cliLugaresEntrega;

    @Column(name = "cli_grupo_empresarial_nombre")
    private String cliGrupoEmpresarialNombre;

    @Column(name = "cli_vendedor")
    private String cliVendedor;

    @Column(name = "cli_cupo_credito")
    private Integer cliCupoCredito;

    @Column(name = "cli_descripcion")
    private String cliDescripcion;

    @Column(name = "cli_ip")
    private String cliIp;

    @Column(name = "cli_dias_credito_aseguradora")
    private Integer cliDiasCreditoAseguradora;
    @Column(name = "cli_cupo_credito_aseguradora")
    private BigDecimal cliCupoCreditoAseguradora;
    @Column(name = "pro_garantia")
    private BigDecimal proGarantia;

    public InvFunListadoClientesTO() {
    }

    public InvFunListadoClientesTO(Integer id, String cliCodigo, Character cliTipoId, String cliId, String cliNombreComercial, String cliRazonSocial, String cliCategoria, String cliProvincia, String cliCiudad, String cliZona, String cliDireccion, String cliTelefono, String cliCelular, String cliEmail, String cliObservaciones, Boolean cliInactivo, Integer cliDiasCredito, String cliVendedor, Integer cliCupoCredito) {
        this.id = id;
        this.cliCodigo = cliCodigo;
        this.cliTipoId = cliTipoId;
        this.cliId = cliId;
        this.cliNombreComercial = cliNombreComercial;
        this.cliRazonSocial = cliRazonSocial;
        this.cliCategoria = cliCategoria;
        this.cliProvincia = cliProvincia;
        this.cliCiudad = cliCiudad;
        this.cliZona = cliZona;
        this.cliDireccion = cliDireccion;
        this.cliTelefono = cliTelefono;
        this.cliCelular = cliCelular;
        this.cliEmail = cliEmail;
        this.cliObservaciones = cliObservaciones;
        this.cliInactivo = cliInactivo;
        this.cliDiasCredito = cliDiasCredito;
        this.cliVendedor = cliVendedor;
        this.cliCupoCredito = cliCupoCredito;
    }

    public Integer getCliCupoCredito() {
        return cliCupoCredito;
    }

    public void setCliCupoCredito(Integer cliCupoCredito) {
        this.cliCupoCredito = cliCupoCredito;
    }

    public String getCliVendedor() {
        return cliVendedor;
    }

    public void setCliVendedor(String cliVendedor) {
        this.cliVendedor = cliVendedor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCliCategoria() {
        return cliCategoria;
    }

    public void setCliCategoria(String cliCategoria) {
        this.cliCategoria = cliCategoria;
    }

    public String getCliCelular() {
        return cliCelular;
    }

    public void setCliCelular(String cliCelular) {
        this.cliCelular = cliCelular;
    }

    public String getCliCiudad() {
        return cliCiudad;
    }

    public void setCliCiudad(String cliCiudad) {
        this.cliCiudad = cliCiudad;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliDireccion() {
        return cliDireccion;
    }

    public void setCliDireccion(String cliDireccion) {
        this.cliDireccion = cliDireccion;
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        this.cliEmail = cliEmail;
    }

    public String getCliId() {
        return cliId;
    }

    public void setCliId(String cliId) {
        this.cliId = cliId;
    }

    public Boolean getCliInactivo() {
        return cliInactivo;
    }

    public void setCliInactivo(Boolean cliInactivo) {
        this.cliInactivo = cliInactivo;
    }

    public String getCliNombreComercial() {
        return cliNombreComercial;
    }

    public void setCliNombreComercial(String cliNombreComercial) {
        this.cliNombreComercial = cliNombreComercial;
    }

    public String getCliObservaciones() {
        return cliObservaciones;
    }

    public void setCliObservaciones(String cliObservaciones) {
        this.cliObservaciones = cliObservaciones;
    }

    public String getCliProvincia() {
        return cliProvincia;
    }

    public void setCliProvincia(String cliProvincia) {
        this.cliProvincia = cliProvincia;
    }

    public String getCliRazonSocial() {
        return cliRazonSocial;
    }

    public void setCliRazonSocial(String cliRazonSocial) {
        this.cliRazonSocial = cliRazonSocial;
    }

    public String getCliTelefono() {
        return cliTelefono;
    }

    public void setCliTelefono(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }

    public Character getCliTipoId() {
        return cliTipoId;
    }

    public void setCliTipoId(Character cliTipoId) {
        this.cliTipoId = cliTipoId;
    }

    public String getCliZona() {
        return cliZona;
    }

    public void setCliZona(String cliZona) {
        this.cliZona = cliZona;
    }

    public Integer getCliDiasCredito() {
        return cliDiasCredito;
    }

    public void setCliDiasCredito(Integer cliDiasCredito) {
        this.cliDiasCredito = cliDiasCredito;
    }

    public Integer getCliPrecio() {
        return cliPrecio;
    }

    public void setCliPrecio(Integer cliPrecio) {
        this.cliPrecio = cliPrecio;
    }

    public String getCliLugaresEntrega() {
        return cliLugaresEntrega;
    }

    public void setCliLugaresEntrega(String cliLugaresEntrega) {
        this.cliLugaresEntrega = cliLugaresEntrega;
    }

    public String getCliGrupoEmpresarialNombre() {
        return cliGrupoEmpresarialNombre;
    }

    public void setCliGrupoEmpresarialNombre(String cliGrupoEmpresarialNombre) {
        this.cliGrupoEmpresarialNombre = cliGrupoEmpresarialNombre;
    }

    public String getCliDescripcion() {
        return cliDescripcion;
    }

    public void setCliDescripcion(String cliDescripcion) {
        this.cliDescripcion = cliDescripcion;
    }

    public String getCliIp() {
        return cliIp;
    }

    public void setCliIp(String cliIp) {
        this.cliIp = cliIp;
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

    public BigDecimal getProGarantia() {
        return proGarantia;
    }

    public void setProGarantia(BigDecimal proGarantia) {
        this.proGarantia = proGarantia;
    }

}
