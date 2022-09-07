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
 * @author Andres Guachisaca
 */
@Entity
public class InvConsumosMotivoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cm_codigo")
    private String cmCodigo;

    @Column(name = "cm_empresa")
    private String cmEmpresa;

    @Column(name = "cm_detalle")
    private String cmDetalle;

    @Column(name = "cm_inactivo")
    private Boolean cmInactivo;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    @Column(name = "cm_forma_contabilizar")
    private String cmFormaContabilizar;

    @Column(name = "cm_sector")
    private String cmSector;

    @Column(name = "cm_bodega")
    private String cmBodega;

    @Column(name = "cm_exigir_cliente")
    private Boolean cmExigirCliente;

    @Column(name = "cm_exigir_proveedor")
    private Boolean cmExigirProveedor;

    @Column(name = "cm_exigir_trabajador")
    private Boolean cmExigirTrabajador;

    @Column(name = "cm_exigir_producto")
    private Boolean cmExigirProducto;

    public InvConsumosMotivoTO() {
    }

    public String getCmFormaContabilizar() {
        return cmFormaContabilizar;
    }

    public void setCmFormaContabilizar(String cmFormaContabilizar) {
        this.cmFormaContabilizar = cmFormaContabilizar;
    }

    public String getCmEmpresa() {
        return cmEmpresa;
    }

    public void setCmEmpresa(String cmEmpresa) {
        this.cmEmpresa = cmEmpresa;
    }

    public String getCmCodigo() {
        return cmCodigo;
    }

    public void setCmCodigo(String cmCodigo) {
        this.cmCodigo = cmCodigo;
    }

    public String getCmDetalle() {
        return cmDetalle;
    }

    public void setCmDetalle(String cmDetalle) {
        this.cmDetalle = cmDetalle;
    }

    public Boolean getCmInactivo() {
        return cmInactivo;
    }

    public void setCmInactivo(Boolean cmInactivo) {
        this.cmInactivo = cmInactivo;
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

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getCmSector() {
        return cmSector;
    }

    public void setCmSector(String cmSector) {
        this.cmSector = cmSector;
    }

    public String getCmBodega() {
        return cmBodega;
    }

    public void setCmBodega(String cmBodega) {
        this.cmBodega = cmBodega;
    }

    public Boolean getCmExigirCliente() {
        return cmExigirCliente;
    }

    public void setCmExigirCliente(Boolean cmExigirCliente) {
        this.cmExigirCliente = cmExigirCliente;
    }

    public Boolean getCmExigirProveedor() {
        return cmExigirProveedor;
    }

    public void setCmExigirProveedor(Boolean cmExigirProveedor) {
        this.cmExigirProveedor = cmExigirProveedor;
    }

    public Boolean getCmExigirTrabajador() {
        return cmExigirTrabajador;
    }

    public void setCmExigirTrabajador(Boolean cmExigirTrabajador) {
        this.cmExigirTrabajador = cmExigirTrabajador;
    }

    public Boolean getCmExigirProducto() {
        return cmExigirProducto;
    }

    public void setCmExigirProducto(Boolean cmExigirProducto) {
        this.cmExigirProducto = cmExigirProducto;
    }

}
