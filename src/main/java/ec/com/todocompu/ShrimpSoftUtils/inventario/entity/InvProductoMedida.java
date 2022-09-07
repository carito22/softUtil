package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "inv_producto_medida", schema = "inventario")
public class InvProductoMedida implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected InvProductoMedidaPK invProductoMedidaPK;
    @Column(name = "med_detalle")
    private String medDetalle;
    @Column(name = "med_conversion_libras")
    private BigDecimal medConversionLibras;
    @Column(name = "med_conversion_kilos")
    private BigDecimal medConversionKilos;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invProductoMedida")
    @JsonIgnore
    private List<InvProducto> invProductoList;
    @Column(name = "med_replicar")
    private boolean medReplicar;

    public InvProductoMedida() {
    }

    public InvProductoMedida(InvProductoMedidaPK invProductoMedidaPK) {
        this.invProductoMedidaPK = invProductoMedidaPK;
    }

    public InvProductoMedida(InvProductoMedidaPK invProductoMedidaPK, String medDetalle, String usrEmpresa,
            String usrCodigo) {
        this.invProductoMedidaPK = invProductoMedidaPK;
        this.medDetalle = medDetalle;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
    }

    public InvProductoMedida(String medEmpresa, String medCodigo) {
        this.invProductoMedidaPK = new InvProductoMedidaPK(medEmpresa, medCodigo);
    }

    public InvProductoMedidaPK getInvProductoMedidaPK() {
        return invProductoMedidaPK;
    }

    public void setInvProductoMedidaPK(InvProductoMedidaPK invProductoMedidaPK) {
        this.invProductoMedidaPK = invProductoMedidaPK;
    }

    public String getMedDetalle() {
        return medDetalle;
    }

    public void setMedDetalle(String medDetalle) {
        this.medDetalle = medDetalle;
    }

    public BigDecimal getMedConversionLibras() {
        return medConversionLibras;
    }

    public void setMedConversionLibras(BigDecimal medConversionLibras) {
        this.medConversionLibras = medConversionLibras;
    }

    public BigDecimal getMedConversionKilos() {
        return medConversionKilos;
    }

    public void setMedConversionKilos(BigDecimal medConversionKilos) {
        this.medConversionKilos = medConversionKilos;
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

    public List<InvProducto> getInvProductoList() {
        return invProductoList;
    }

    public void setInvProductoList(List<InvProducto> invProductoList) {
        this.invProductoList = invProductoList;
    }

    public boolean isMedReplicar() {
        return medReplicar;
    }

    public void setMedReplicar(boolean medReplicar) {
        this.medReplicar = medReplicar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invProductoMedidaPK != null ? invProductoMedidaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvProductoMedida)) {
            return false;
        }
        InvProductoMedida other = (InvProductoMedida) object;
        if ((this.invProductoMedidaPK == null && other.invProductoMedidaPK != null)
                || (this.invProductoMedidaPK != null && !this.invProductoMedidaPK.equals(other.invProductoMedidaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvProductoMedida[ invProductoMedidaPK=" + invProductoMedidaPK + " ]";
    }

}
