/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author misayo
 */
@Entity
public class InvFunListadoProveedoresTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "prov_codigo")
    private String provCodigo;

    @Column(name = "prov_tipo_id")
    private Character provTipoId;

    @Column(name = "prov_id")
    private String provId;

    @Column(name = "prov_razon_social")
    private String provRazonSocial;

    @Column(name = "prov_nombre_comercial")
    private String provNombreComercial;

    @Column(name = "prov_categoria")
    private String provCategoria;

    @Column(name = "prov_provincia")
    private String provProvincia;

    @Column(name = "prov_ciudad")
    private String provCiudad;

    @Column(name = "prov_zona")
    private String provZona;

    @Column(name = "prov_direccion")
    private String provDireccion;

    @Column(name = "prov_telefono")
    private String provTelefono;

    @Column(name = "prov_Celular")
    private String provCelular;

    @Column(name = "prov_email")
    private String provEmail;

    @Column(name = "prov_observaciones")
    private String provObservaciones;

    @Column(name = "prov_inactivo")
    private Boolean provInactivo;

    @Column(name = "prov_descripcion")
    private String provDescripcion;

    public InvFunListadoProveedoresTO() {
    }

    public InvFunListadoProveedoresTO(String provCodigo, Character provTipoId, String provId, String provNombreComercial,
            String provRazonSocial, String provCategoria, String provProvincia, String provCiudad, String provZona,
            String provDireccion, String provTelefono, String provCelular, String provEmail, String provObservaciones,
            Boolean provInactivo, Integer id) {
        this.provCodigo = provCodigo;
        this.provTipoId = provTipoId;
        this.provId = provId;
        this.provNombreComercial = provNombreComercial;
        this.provRazonSocial = provRazonSocial;
        this.provCategoria = provCategoria;
        this.provProvincia = provProvincia;
        this.provCiudad = provCiudad;
        this.provZona = provZona;
        this.provDireccion = provDireccion;
        this.provTelefono = provTelefono;
        this.provCelular = provCelular;
        this.provEmail = provEmail;
        this.provObservaciones = provObservaciones;
        this.provInactivo = provInactivo;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvCategoria() {
        return provCategoria;
    }

    public void setProvCategoria(String provCategoria) {
        this.provCategoria = provCategoria;
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

    public Character getProvTipoId() {
        return provTipoId;
    }

    public void setProvTipoId(Character provTipoId) {
        this.provTipoId = provTipoId;
    }

    public String getProvZona() {
        return provZona;
    }

    public void setProvZona(String provZona) {
        this.provZona = provZona;
    }

    public String getProvDescripcion() {
        return provDescripcion;
    }

    public void setProvDescripcion(String provDescripcion) {
        this.provDescripcion = provDescripcion;
    }

}
