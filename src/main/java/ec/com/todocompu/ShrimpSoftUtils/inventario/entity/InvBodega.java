package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "inv_bodega", schema = "inventario")
public class InvBodega implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected InvBodegaPK invBodegaPK;
    @Column(name = "bod_nombre")
    private String bodNombre;
    @Column(name = "bod_inactiva")
    private Boolean bodInactiva;
    @Column(name = "sec_empresa")
    private String secEmpresa;
    @Column(name = "sec_codigo")
    private String secCodigo;
    @Column(name = "det_empresa")
    private String detEmpresa;
    @Column(name = "det_usuario")
    private String detUsuario;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @Column(name = "bod_producto_tipo_permitido")
    private String bodProductoPermitido;
    @Column(name = "bod_producto_tipo_no_permitido")
    private String bodProductoNoPermitido;

    @OneToMany(mappedBy = "invBodega")
    @JsonIgnore
    private List<InvConsumos> invConsumosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invBodega")
    @JsonIgnore
    private List<InvVentasDetalle> invVentasDetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invBodega")
    @JsonIgnore
    private List<InvConsumosDetalle> invConsumosDetalleList;
    @OneToMany(mappedBy = "invBodega")
    @JsonIgnore
    private List<InvTransferencias> invTransferenciasList;
    @OneToMany(mappedBy = "invBodega1")
    @JsonIgnore
    private List<InvTransferencias> invTransferenciasList1;
    @OneToMany(mappedBy = "invBodega")
    @JsonIgnore
    private List<InvTransferenciasDetalle> invTransferenciasDetalleList;
    @OneToMany(mappedBy = "invBodega1")
    @JsonIgnore
    private List<InvTransferenciasDetalle> invTransferenciasDetalleList1;
    @OneToMany(mappedBy = "invBodega")
    @JsonIgnore
    private List<InvProductoSaldos> invProductoSaldosList;
    @OneToMany(mappedBy = "invBodega")
    @JsonIgnore
    private List<InvCompras> invComprasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invBodega")
    @JsonIgnore
    private List<InvComprasDetalle> invComprasDetalleList;
    @OneToMany(mappedBy = "invBodega")
    @JsonIgnore
    private List<InvVentas> invVentasList;

    public InvBodega() {
    }

    public InvBodega(InvBodegaPK invBodegaPK) {
        this.invBodegaPK = invBodegaPK;
    }

    public InvBodega(InvBodegaPK invBodegaPK, String bodNombre, String secEmpresa, String secCodigo,
            String bodProductoTipoPermitido, String bodProductoTipoNoPermitido) {
        this.invBodegaPK = invBodegaPK;
        this.bodNombre = bodNombre;
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.bodProductoPermitido = bodProductoTipoPermitido;
        this.bodProductoNoPermitido = bodProductoTipoNoPermitido;
    }

    public InvBodega(String bodEmpresa, String bodCodigo) {
        this.invBodegaPK = new InvBodegaPK(bodEmpresa, bodCodigo);
    }

    public InvBodegaPK getInvBodegaPK() {
        return invBodegaPK;
    }

    public void setInvBodegaPK(InvBodegaPK invBodegaPK) {
        this.invBodegaPK = invBodegaPK;
    }

    public String getBodNombre() {
        return bodNombre;
    }

    public void setBodNombre(String bodNombre) {
        this.bodNombre = bodNombre;
    }

    public Boolean getBodInactiva() {
        return bodInactiva;
    }

    public void setBodInactiva(Boolean bodInactiva) {
        this.bodInactiva = bodInactiva;
    }

    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getDetEmpresa() {
        return detEmpresa;
    }

    public void setDetEmpresa(String detEmpresa) {
        this.detEmpresa = detEmpresa;
    }

    public String getDetUsuario() {
        return detUsuario;
    }

    public void setDetUsuario(String detUsuario) {
        this.detUsuario = detUsuario;
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

    public String getBodProductoPermitido() {
        return bodProductoPermitido;
    }

    public void setBodProductoPermitido(String bodProductoPermitido) {
        this.bodProductoPermitido = bodProductoPermitido;
    }

    public String getBodProductoNoPermitido() {
        return bodProductoNoPermitido;
    }

    public void setBodProductoNoPermitido(String bodProductoNoPermitido) {
        this.bodProductoNoPermitido = bodProductoNoPermitido;
    }

    public List<InvConsumos> getInvConsumosList() {
        return invConsumosList;
    }

    public void setInvConsumosList(List<InvConsumos> invConsumosList) {
        this.invConsumosList = invConsumosList;
    }

    public List<InvVentasDetalle> getInvVentasDetalleList() {
        return invVentasDetalleList;
    }

    public void setInvVentasDetalleList(List<InvVentasDetalle> invVentasDetalleList) {
        this.invVentasDetalleList = invVentasDetalleList;
    }

    public List<InvConsumosDetalle> getInvConsumosDetalleList() {
        return invConsumosDetalleList;
    }

    public void setInvConsumosDetalleList(List<InvConsumosDetalle> invConsumosDetalleList) {
        this.invConsumosDetalleList = invConsumosDetalleList;
    }

    public List<InvTransferencias> getInvTransferenciasList() {
        return invTransferenciasList;
    }

    public void setInvTransferenciasList(List<InvTransferencias> invTransferenciasList) {
        this.invTransferenciasList = invTransferenciasList;
    }

    public List<InvTransferencias> getInvTransferenciasList1() {
        return invTransferenciasList1;
    }

    public void setInvTransferenciasList1(List<InvTransferencias> invTransferenciasList1) {
        this.invTransferenciasList1 = invTransferenciasList1;
    }

    public List<InvTransferenciasDetalle> getInvTransferenciasDetalleList() {
        return invTransferenciasDetalleList;
    }

    public void setInvTransferenciasDetalleList(List<InvTransferenciasDetalle> invTransferenciasDetalleList) {
        this.invTransferenciasDetalleList = invTransferenciasDetalleList;
    }

    public List<InvTransferenciasDetalle> getInvTransferenciasDetalleList1() {
        return invTransferenciasDetalleList1;
    }

    public void setInvTransferenciasDetalleList1(List<InvTransferenciasDetalle> invTransferenciasDetalleList1) {
        this.invTransferenciasDetalleList1 = invTransferenciasDetalleList1;
    }

    public List<InvProductoSaldos> getInvProductoSaldosList() {
        return invProductoSaldosList;
    }

    public void setInvProductoSaldosList(List<InvProductoSaldos> invProductoSaldosList) {
        this.invProductoSaldosList = invProductoSaldosList;
    }

    public List<InvCompras> getInvComprasList() {
        return invComprasList;
    }

    public void setInvComprasList(List<InvCompras> invComprasList) {
        this.invComprasList = invComprasList;
    }

    public List<InvComprasDetalle> getInvComprasDetalleList() {
        return invComprasDetalleList;
    }

    public void setInvComprasDetalleList(List<InvComprasDetalle> invComprasDetalleList) {
        this.invComprasDetalleList = invComprasDetalleList;
    }

    public List<InvVentas> getInvVentasList() {
        return invVentasList;
    }

    public void setInvVentasList(List<InvVentas> invVentasList) {
        this.invVentasList = invVentasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invBodegaPK != null ? invBodegaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof InvBodega)) {
            return false;
        }
        InvBodega other = (InvBodega) object;
        if ((this.invBodegaPK == null && other.invBodegaPK != null)
                || (this.invBodegaPK != null && !this.invBodegaPK.equals(other.invBodegaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvBodega[ invBodegaPK=" + invBodegaPK + " ]";
    }

}
