package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "prd_liquidacion_motivo", schema = "produccion")
public class PrdLiquidacionMotivo implements Serializable {

    private static final long serialVersionUID = 1L;

    protected PrdLiquidacionMotivoPK prdLiquidacionMotivoPK;
    private String lmDetalle;
    private boolean lmInactivo;
    private String usrEmpresa;
    private String usrCodigo;
    private Timestamp usrFechaInserta;
    private boolean lmExigirCliente;
    private boolean lmExigirProveedor;
    private boolean lmGenerarNumeroLote;

    public PrdLiquidacionMotivo() {
    }

    public PrdLiquidacionMotivo(PrdLiquidacionMotivoPK prdLiquidacionMotivoPK) {
        this.prdLiquidacionMotivoPK = prdLiquidacionMotivoPK;
    }

    public PrdLiquidacionMotivo(PrdLiquidacionMotivoPK prdLiquidacionMotivoPK, String lmDetalle, boolean lmInactivo,
            String usrEmpresa, String usrCodigo, Timestamp usrFechaInserta, boolean lmExigirCliente, boolean lmExigirProveedor) {
        this.prdLiquidacionMotivoPK = prdLiquidacionMotivoPK;
        this.lmDetalle = lmDetalle;
        this.lmInactivo = lmInactivo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.lmExigirCliente = lmExigirCliente;
        this.lmExigirProveedor = lmExigirProveedor;
    }

    public PrdLiquidacionMotivo(String lmEmpresa, String lmCodigo) {
        this.prdLiquidacionMotivoPK = new PrdLiquidacionMotivoPK(lmEmpresa, lmCodigo);
    }

    @EmbeddedId
    public PrdLiquidacionMotivoPK getPrdLiquidacionMotivoPK() {
        return prdLiquidacionMotivoPK;
    }

    public void setPrdLiquidacionMotivoPK(PrdLiquidacionMotivoPK prdLiquidacionMotivoPK) {
        this.prdLiquidacionMotivoPK = prdLiquidacionMotivoPK;
    }

    @Column(name = "lm_generar_numero_lote")
    public boolean getLmGenerarNumeroLote() {
        return lmGenerarNumeroLote;
    }

    public void setLmGenerarNumeroLote(boolean lmGenerarNumeroLote) {
        this.lmGenerarNumeroLote = lmGenerarNumeroLote;
    }

    @Column(name = "lm_detalle")
    public String getLmDetalle() {
        return lmDetalle;
    }

    public void setLmDetalle(String lmDetalle) {
        this.lmDetalle = lmDetalle;
    }

    @Column(name = "lm_inactivo")
    public boolean getLmInactivo() {
        return lmInactivo;
    }

    public void setLmInactivo(boolean lmInactivo) {
        this.lmInactivo = lmInactivo;
    }

    @Column(name = "usr_empresa")
    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    @Column(name = "usr_codigo")
    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    public Timestamp getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Timestamp usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    @Column(name = "lm_exigir_cliente")
    public boolean getLmExigirCliente() {
        return lmExigirCliente;
    }

    public void setLmExigirCliente(boolean lmExigirCliente) {
        this.lmExigirCliente = lmExigirCliente;
    }

    @Column(name = "lm_exigir_proveedor")
    public boolean getLmExigirProveedor() {
        return lmExigirProveedor;
    }

    public void setLmExigirProveedor(boolean lmExigirProveedor) {
        this.lmExigirProveedor = lmExigirProveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdLiquidacionMotivoPK != null ? prdLiquidacionMotivoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PrdLiquidacionMotivo)) {
            return false;
        }
        PrdLiquidacionMotivo other = (PrdLiquidacionMotivo) object;
        if ((this.prdLiquidacionMotivoPK == null && other.prdLiquidacionMotivoPK != null)
                || (this.prdLiquidacionMotivoPK != null
                && !this.prdLiquidacionMotivoPK.equals(other.prdLiquidacionMotivoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "produccion.entity.PrdLiquidacionMotivo[ prdLiquidacionMotivoPK=" + prdLiquidacionMotivoPK + " ]";
    }

}
