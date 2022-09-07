package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import ec.com.todocompu.ShrimpSoftUtils.UtilsDate;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdCorrida;

@Entity
@Table(name = "con_contable", schema = "contabilidad")
public class ConContable implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected ConContablePK conContablePK;
    @Column(name = "con_codigo", updatable = false)
    private String conCodigo;
    @Column(name = "con_fecha")
    private Date conFecha;
    @Column(name = "con_pendiente")
    private boolean conPendiente;
    @Column(name = "con_bloqueado")
    private boolean conBloqueado;
    @Column(name = "con_reversado")
    private boolean conReversado;
    @Column(name = "con_anulado")
    private boolean conAnulado;
    @Column(name = "con_generado", updatable = false)
    private boolean conGenerado;
    @Column(name = "con_referencia", updatable = false)
    private String conReferencia;
    @Column(name = "con_concepto")
    private String conConcepto;
    @Column(name = "con_detalle")
    private String conDetalle;
    @Column(name = "con_observaciones")
    private String conObservaciones;
    @Column(name = "usr_empresa", updatable = false)
    private String usrEmpresa;
    @Column(name = "usr_codigo", updatable = false)
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    private Timestamp usrFechaInserta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "conContable")
    @JsonIgnore
    private List<ConDetalle> conDetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "conContable")
    @JsonIgnore
    private List<PrdCorrida> prdCorridaList;

    public ConContable() {
    }

    public ConContable(ConContablePK conContablePK) {
        this.conContablePK = conContablePK;
    }

    public ConContable(ConContablePK conContablePK, Date conFecha) {
        this.conContablePK = conContablePK;
        this.conFecha = conFecha;
    }

    public ConContable(String conEmpresa, String conPeriodo, String conTipo, String conNumero) {
        this.conContablePK = new ConContablePK(conEmpresa, conPeriodo, conTipo, conNumero);
    }

    public ConContablePK getConContablePK() {
        return conContablePK;
    }

    public ConContable(ConContablePK conContablePK, String conCodigo, Date conFecha, boolean conPendiente,
            boolean conBloqueado, boolean conReversado, boolean conAnulado, boolean conGenerado, String conReferencia,
            String conConcepto, String conDetalle, String conObservaciones, String usrEmpresa, String usrCodigo,
            Timestamp usrFechaInserta) {
        this.conContablePK = conContablePK;
        this.conCodigo = conCodigo;
        this.conFecha = conFecha;
        this.conPendiente = conPendiente;
        this.conBloqueado = conBloqueado;
        this.conReversado = conReversado;
        this.conAnulado = conAnulado;
        this.conGenerado = conGenerado;
        this.conReferencia = conReferencia;
        this.conConcepto = conConcepto;
        this.conDetalle = conDetalle;
        this.conObservaciones = conObservaciones;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public void setConContablePK(ConContablePK conContablePK) {
        this.conContablePK = conContablePK;
    }

    public String getConCodigo() {
        return conCodigo;
    }

    public void setConCodigo(String conCodigo) {
        this.conCodigo = conCodigo;
    }

    public Date getConFecha() {
        return conFecha;
    }

    public void setConFecha(Date conFecha) {
        this.conFecha = conFecha;
    }

    public boolean getConPendiente() {
        return conPendiente;
    }

    public void setConPendiente(boolean conPendiente) {
        this.conPendiente = conPendiente;
    }

    public boolean getConBloqueado() {
        return conBloqueado;
    }

    public void setConBloqueado(boolean conBloqueado) {
        this.conBloqueado = conBloqueado;
    }

    public boolean getConReversado() {
        return conReversado;
    }

    public void setConReversado(boolean conReversado) {
        this.conReversado = conReversado;
    }

    public boolean getConAnulado() {
        return conAnulado;
    }

    public void setConAnulado(boolean conAnulado) {
        this.conAnulado = conAnulado;
    }

    public boolean getConGenerado() {
        return conGenerado;
    }

    public void setConGenerado(boolean conGenerado) {
        this.conGenerado = conGenerado;
    }

    public String getConReferencia() {
        return conReferencia;
    }

    public void setConReferencia(String conReferencia) {
        this.conReferencia = conReferencia;
    }

    public String getConConcepto() {
        return conConcepto;
    }

    public void setConConcepto(String conConcepto) {
        this.conConcepto = conConcepto;
    }

    public String getConDetalle() {
        return conDetalle;
    }

    public void setConDetalle(String conDetalle) {
        this.conDetalle = conDetalle;
    }

    public String getConObservaciones() {
        return conObservaciones;
    }

    public void setConObservaciones(String conObservaciones) {
        this.conObservaciones = conObservaciones;
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

    public Timestamp getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Timestamp usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    @JsonIgnore
    public List<ConDetalle> getConDetalleList() {
        return conDetalleList;
    }

    public void setConDetalleList(List<ConDetalle> conDetalleList) {
        this.conDetalleList = conDetalleList;
    }

    @JsonIgnore
    public List<PrdCorrida> getPrdCorridaList() {
        return prdCorridaList;
    }

    public void setPrdCorridaList(List<PrdCorrida> prdCorridaList) {
        this.prdCorridaList = prdCorridaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conContablePK != null ? conContablePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ConContable)) {
            return false;
        }
        ConContable other = (ConContable) object;
        if ((this.conContablePK == null && other.conContablePK != null)
                || (this.conContablePK != null && !this.conContablePK.equals(other.conContablePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "contabilidad.entity.ConContable[ conContablePK=" + conContablePK + " ]";
    }

    public String string() {
        return "'" + conContablePK.getConEmpresa() + "', '" + conContablePK.getConPeriodo() + "', '"
                + conContablePK.getConTipo() + "', '" + conContablePK.getConNumero() + "', '" + UtilsDate.fechaFormatoString(conFecha, "yyyy-MM-dd").toString() + "', '"
                + conPendiente + "', '" + conBloqueado + "', '" + conReversado + "', '" + conAnulado + "', '"
                + conGenerado + "', '" + conReferencia + "', '" + conConcepto + "', '" + conDetalle + "', '"
                + conObservaciones + "', '" + usrEmpresa + "', '" + usrCodigo + "', '" + usrFechaInserta + "'";
    }

    }
