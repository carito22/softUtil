package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "prd_equipo_control", schema = "produccion")
public class PrdEquipoControl implements Serializable {

    private static final long serialVersionUID = 1L;

    protected PrdEquipoControlPK prdEquipoControlPK;
    private String ecDescripcion;
    private String usrEmpresa;
    private String usrCodigo;
    private Timestamp usrFechaInserta;

    public PrdEquipoControl() {
    }

    public PrdEquipoControl(PrdEquipoControlPK prdEquipoControlPK) {
        this.prdEquipoControlPK = prdEquipoControlPK;
    }

    public PrdEquipoControl(PrdEquipoControlPK PrdEquipoControlPK, String ecDescripcion, String usrEmpresa, String usrCodigo, Timestamp usrFechaInserta) {
        this.prdEquipoControlPK = PrdEquipoControlPK;
        this.ecDescripcion = ecDescripcion;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public PrdEquipoControl(String ecEmpresa, String ecCodigo) {
        this.prdEquipoControlPK = new PrdEquipoControlPK(ecEmpresa, ecCodigo);
    }

    @EmbeddedId
    public PrdEquipoControlPK getPrdEquipoControlPK() {
        return prdEquipoControlPK;
    }

    public void setPrdEquipoControlPK(PrdEquipoControlPK prdEquipoControlPK) {
        this.prdEquipoControlPK = prdEquipoControlPK;
    }

    @Column(name = "ec_descripcion")
    public String getEcDescripcion() {
        return ecDescripcion;
    }

    public void setEcDescripcion(String ecDescripcion) {
        this.ecDescripcion = ecDescripcion;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdEquipoControlPK != null ? prdEquipoControlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PrdEquipoControl)) {
            return false;
        }
        PrdEquipoControl other = (PrdEquipoControl) object;
        if ((this.prdEquipoControlPK == null && other.prdEquipoControlPK != null)
                || (this.prdEquipoControlPK != null
                && !this.prdEquipoControlPK.equals(other.prdEquipoControlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "produccion.entity.PrdEquipoControl[ prdEquipoControlPK=" + prdEquipoControlPK + " ]";
    }

}
