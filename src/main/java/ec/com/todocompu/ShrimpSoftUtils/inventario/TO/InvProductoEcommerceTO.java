/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;
import org.hibernate.annotations.Type;

/**
 *
 * @author Mario Ramos
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class InvProductoEcommerceTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "pro_empresa")
    private String proEmpresa;
    @Column(name = "pro_codigo_principal")
    private String proCodigoPrincipal;
    @Column(name = "pro_nombre")
    private String proNombre;
    @Column(name = "pro_detalle")
    private String proDetalle;
    @Column(name = "pro_categoria")
    private String proCategoria;
    @Column(name = "cat_codigo")
    private String catCodigo;
    @Column(name = "pro_tipo")
    private String proTipo;
    @Column(name = "pro_precio")
    private BigDecimal proPrecio;
    @Column(name = "pro_inactivo")
    private boolean proInactivo;
    @Column(name = "pro_ecommerce")
    private boolean proEcommerce;
    @JsonIgnore
    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    @Column(name = "pro_imagen")
    private byte[] proImagen;
    @Transient
    private String imagen;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProEmpresa() {
        return proEmpresa;
    }

    public void setProEmpresa(String proEmpresa) {
        this.proEmpresa = proEmpresa;
    }

    public String getProCodigoPrincipal() {
        return proCodigoPrincipal;
    }

    public void setProCodigoPrincipal(String proCodigoPrincipal) {
        this.proCodigoPrincipal = proCodigoPrincipal;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    public String getProCategoria() {
        return proCategoria;
    }

    public void setProCategoria(String proCategoria) {
        this.proCategoria = proCategoria;
    }

    public String getCatCodigo() {
        return catCodigo;
    }

    public void setCatCodigo(String catCodigo) {
        this.catCodigo = catCodigo;
    }

    public String getProTipo() {
        return proTipo;
    }

    public void setProTipo(String proTipo) {
        this.proTipo = proTipo;
    }

    public BigDecimal getProPrecio() {
        return proPrecio;
    }

    public void setProPrecio(BigDecimal proPrecio) {
        this.proPrecio = proPrecio;
    }

    public boolean isProInactivo() {
        return proInactivo;
    }

    public void setProInactivo(boolean proInactivo) {
        this.proInactivo = proInactivo;
    }

    public boolean isProEcommerce() {
        return proEcommerce;
    }

    public void setProEcommerce(boolean proEcommerce) {
        this.proEcommerce = proEcommerce;
    }

    public byte[] getProImagen() {
        return proImagen;
    }

    public void setProImagen(byte[] proImagen) {
        this.proImagen = proImagen;
    }

    public String getImagen() throws UnsupportedEncodingException {
        if (proImagen != null) {
            this.imagen = new String(this.proImagen, "UTF-8");
        }
        return imagen;
    }

    public void setImagen(String imagen) throws UnsupportedEncodingException {
        if (proImagen != null) {
            this.imagen = new String(this.proImagen, "UTF-8");
        } else {
            this.imagen = imagen;
        }
    }

    public String getProDetalle() {
        return proDetalle;
    }

    public void setProDetalle(String proDetalle) {
        this.proDetalle = proDetalle;
    }

}
