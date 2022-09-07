package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "inv_consumos_motivo", schema = "inventario")
public class InvConsumosMotivo implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected InvConsumosMotivoPK invConsumosMotivoPK;
    @Column(name = "cm_detalle")
    private String cmDetalle;
    @Column(name = "cm_sector")
    private String cmSector;
    @Column(name = "cm_bodega")
    private String cmBodega;
    @Column(name = "cm_forma_contabilizar")
    private String cmFormaContabilizar;
    @Column(name = "cm_inactivo")
    private boolean cmInactivo;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @Column(name = "cm_exigir_cliente")
    private boolean cmExigirCliente;
    @Column(name = "cm_exigir_proveedor")
    private boolean cmExigirProveedor;
    @Column(name = "cm_exigir_trabajador")
    private boolean cmExigirTrabajador;
    @Column(name = "cm_exigir_producto")
    private boolean cmExigirProducto;

    public InvConsumosMotivo() {
    }

    public InvConsumosMotivo(InvConsumosMotivoPK invConsumosMotivoPK) {
        this.invConsumosMotivoPK = invConsumosMotivoPK;
    }

    public InvConsumosMotivo(String cmEmpresa, String cmCodigo) {
        this.invConsumosMotivoPK = new InvConsumosMotivoPK(cmEmpresa, cmCodigo);
    }

    public InvConsumosMotivoPK getInvConsumosMotivoPK() {
        return invConsumosMotivoPK;
    }

    public void setInvConsumosMotivoPK(InvConsumosMotivoPK invConsumosMotivoPK) {
        this.invConsumosMotivoPK = invConsumosMotivoPK;
    }

    public String getCmDetalle() {
        return cmDetalle;
    }

    public void setCmDetalle(String cmDetalle) {
        this.cmDetalle = cmDetalle;
    }

    public String getCmFormaContabilizar() {
        return cmFormaContabilizar;
    }

    public void setCmFormaContabilizar(String cmFormaContabilizar) {
        this.cmFormaContabilizar = cmFormaContabilizar;
    }

    public boolean getCmInactivo() {
        return cmInactivo;
    }

    public void setCmInactivo(boolean cmInactivo) {
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

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
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

    public boolean isCmExigirCliente() {
        return cmExigirCliente;
    }

    public void setCmExigirCliente(boolean cmExigirCliente) {
        this.cmExigirCliente = cmExigirCliente;
    }

    public boolean isCmExigirProveedor() {
        return cmExigirProveedor;
    }

    public void setCmExigirProveedor(boolean cmExigirProveedor) {
        this.cmExigirProveedor = cmExigirProveedor;
    }

    public boolean isCmExigirTrabajador() {
        return cmExigirTrabajador;
    }

    public void setCmExigirTrabajador(boolean cmExigirTrabajador) {
        this.cmExigirTrabajador = cmExigirTrabajador;
    }

    public boolean isCmExigirProducto() {
        return cmExigirProducto;
    }

    public void setCmExigirProducto(boolean cmExigirProducto) {
        this.cmExigirProducto = cmExigirProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invConsumosMotivoPK != null ? invConsumosMotivoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvConsumosMotivo)) {
            return false;
        }
        InvConsumosMotivo other = (InvConsumosMotivo) object;
        if ((this.invConsumosMotivoPK == null && other.invConsumosMotivoPK != null)
                || (this.invConsumosMotivoPK != null && !this.invConsumosMotivoPK.equals(other.invConsumosMotivoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvConsumosMotivo[ invConsumosMotivoPK=" + invConsumosMotivoPK + " ]";
    }

}
