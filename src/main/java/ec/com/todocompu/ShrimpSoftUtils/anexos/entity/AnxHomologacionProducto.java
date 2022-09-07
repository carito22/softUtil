/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProducto;
import java.io.Serializable;
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
@Table(name = "anx_homologacion_producto", schema = "anexo")
public class AnxHomologacionProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "hom_secuencial")
    private Integer homSecuencial;

    @Column(name = "hom_empresa")
    private String homEmpresa;

    @Column(name = "prov_razon_social")
    private String provRazonSocial;

    @Column(name = "prov_identificacion")
    private String provIdentificacion;

    @JoinColumns({
        @JoinColumn(name = "pro_empresa", referencedColumnName = "pro_empresa")
        , @JoinColumn(name = "pro_codigo_principal", referencedColumnName = "pro_codigo_principal")})
    @ManyToOne(optional = true)
    private InvProducto invProducto;

    @Column(name = "hom_codigo_producto_proveedor")
    private String homCodigoProductoProveedor;
    @Column(name = "hom_descripcion_producto_proveedor")
    private String homDescripcionProductoProveedor;

    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;

    public AnxHomologacionProducto() {
    }

    public Integer getHomSecuencial() {
        return homSecuencial;
    }

    public void setHomSecuencial(Integer homSecuencial) {
        this.homSecuencial = homSecuencial;
    }

    public String getHomEmpresa() {
        return homEmpresa;
    }

    public void setHomEmpresa(String homEmpresa) {
        this.homEmpresa = homEmpresa;
    }

    public String getProvRazonSocial() {
        return provRazonSocial;
    }

    public void setProvRazonSocial(String provRazonSocial) {
        this.provRazonSocial = provRazonSocial;
    }

    public String getProvIdentificacion() {
        return provIdentificacion;
    }

    public void setProvIdentificacion(String provIdentificacion) {
        this.provIdentificacion = provIdentificacion;
    }

    public InvProducto getInvProducto() {
        return invProducto;
    }

    public void setInvProducto(InvProducto invProducto) {
        this.invProducto = invProducto;
    }

    public String getHomCodigoProductoProveedor() {
        return homCodigoProductoProveedor;
    }

    public void setHomCodigoProductoProveedor(String homCodigoProductoProveedor) {
        this.homCodigoProductoProveedor = homCodigoProductoProveedor;
    }

    public String getHomDescripcionProductoProveedor() {
        return homDescripcionProductoProveedor;
    }

    public void setHomDescripcionProductoProveedor(String homDescripcionProductoProveedor) {
        this.homDescripcionProductoProveedor = homDescripcionProductoProveedor;
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

}
