/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.ecommerce.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mario
 */
@Entity
@Table(name = "ecomm_pedido_ecommerce", schema = "ecommerce")
public class EcommPedidoEcommerce implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EcommPedidoEcommercePK ecommPedidoEcommercePK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "e_direccion")
    private String eDireccion;
    @Column(name = "e_descripcion")
    private String eDescripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "e_email")
    private String eEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "e_telefono")
    private String eTelefono;
    @Size(max = 2147483647)
    @Column(name = "e_nombres")
    private String eNombres;
    @Size(max = 2147483647)
    @Column(name = "e_apellidos")
    private String eApellidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "e_estado")
    private boolean eEstado;
    @Size(max = 2147483647)
    @Column(name = "e_usuario")
    private String eUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "e_total")
    private BigDecimal eTotal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ecommPedidoEcommerce")
    private List<EcommPedidoEcommerceDetalle> ecommPedidoEcommerceDetalleList;

    public EcommPedidoEcommerce() {
    }

    public EcommPedidoEcommerce(EcommPedidoEcommercePK ecommPedidoEcommercePK) {
        this.ecommPedidoEcommercePK = ecommPedidoEcommercePK;
    }

    public EcommPedidoEcommerce(EcommPedidoEcommercePK ecommPedidoEcommercePK, String eDireccion, String eEmail, String eTelefono, boolean eEstado) {
        this.ecommPedidoEcommercePK = ecommPedidoEcommercePK;
        this.eDireccion = eDireccion;
        this.eEmail = eEmail;
        this.eTelefono = eTelefono;
        this.eEstado = eEstado;
    }

    public EcommPedidoEcommerce(String eCodigoPedido, String eEmpresa) {
        this.ecommPedidoEcommercePK = new EcommPedidoEcommercePK(eCodigoPedido, eEmpresa);
    }

    public EcommPedidoEcommercePK getEcommPedidoEcommercePK() {
        return ecommPedidoEcommercePK;
    }

    public void setEcommPedidoEcommercePK(EcommPedidoEcommercePK ecommPedidoEcommercePK) {
        this.ecommPedidoEcommercePK = ecommPedidoEcommercePK;
    }

    public String geteDireccion() {
        return eDireccion;
    }

    public void seteDireccion(String eDireccion) {
        this.eDireccion = eDireccion;
    }

    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail;
    }

    public String geteTelefono() {
        return eTelefono;
    }

    public void seteTelefono(String eTelefono) {
        this.eTelefono = eTelefono;
    }

    public String geteNombres() {
        return eNombres;
    }

    public void seteNombres(String eNombres) {
        this.eNombres = eNombres;
    }

    public String geteApellidos() {
        return eApellidos;
    }

    public void seteApellidos(String eApellidos) {
        this.eApellidos = eApellidos;
    }

    public boolean iseEstado() {
        return eEstado;
    }

    public void seteEstado(boolean eEstado) {
        this.eEstado = eEstado;
    }

    public String geteUsuario() {
        return eUsuario;
    }

    public void seteUsuario(String eUsuario) {
        this.eUsuario = eUsuario;
    }

    public BigDecimal geteTotal() {
        return eTotal;
    }

    public void seteTotal(BigDecimal eTotal) {
        this.eTotal = eTotal;
    }

    public String geteDescripcion() {
        return eDescripcion;
    }

    public void seteDescripcion(String eDescripcion) {
        this.eDescripcion = eDescripcion;
    }

    public List<EcommPedidoEcommerceDetalle> getEcommPedidoEcommerceDetalleList() {
        return ecommPedidoEcommerceDetalleList;
    }

    public void setEcommPedidoEcommerceDetalleList(List<EcommPedidoEcommerceDetalle> ecommPedidoEcommerceDetalleList) {
        this.ecommPedidoEcommerceDetalleList = ecommPedidoEcommerceDetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ecommPedidoEcommercePK != null ? ecommPedidoEcommercePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcommPedidoEcommerce)) {
            return false;
        }
        EcommPedidoEcommerce other = (EcommPedidoEcommerce) object;
        if ((this.ecommPedidoEcommercePK == null && other.ecommPedidoEcommercePK != null) || (this.ecommPedidoEcommercePK != null && !this.ecommPedidoEcommercePK.equals(other.ecommPedidoEcommercePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.ecommerce.entity.EcommPedidoEcommerce[ ecommPedidoEcommercePK=" + ecommPedidoEcommercePK + " ]";
    }

}
