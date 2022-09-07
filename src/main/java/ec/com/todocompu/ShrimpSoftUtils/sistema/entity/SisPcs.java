package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "sis_pcs", schema = "sistemaweb")
public class SisPcs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "inf_mac")
    private String infMac;
    @Column(name = "inf_nombre")
    private String infNombre;
    @Column(name = "inf_descripcion")
    private String infDescripcion;
    @Column(name = "inf_estado")
    private boolean infEstado;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta_pc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInsertaPc;

    public SisPcs() {
    }

    public SisPcs(String infMac) {
        this.infMac = infMac;
    }

    public SisPcs(String infMac, String infNombre, String infDescripcion, boolean infEstado, String usrCodigo, Date usrFechaInsertaPc) {
        this.infMac = infMac;
        this.infNombre = infNombre;
        this.infDescripcion = infDescripcion;
        this.infEstado = infEstado;
        this.usrCodigo = usrCodigo;
        this.usrFechaInsertaPc = usrFechaInsertaPc;
    }

    public String getInfMac() {
        return infMac;
    }

    public void setInfMac(String infMac) {
        this.infMac = infMac;
    }

    public String getInfNombre() {
        return infNombre;
    }

    public void setInfNombre(String infNombre) {
        this.infNombre = infNombre;
    }

    public String getInfDescripcion() {
        return infDescripcion;
    }

    public void setInfDescripcion(String infDescripcion) {
        this.infDescripcion = infDescripcion;
    }

    public boolean getInfEstado() {
        return infEstado;
    }

    public void setInfEstado(boolean infEstado) {
        this.infEstado = infEstado;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Date getUsrFechaInsertaPc() {
        return usrFechaInsertaPc;
    }

    public void setUsrFechaInsertaPc(Date usrFechaInsertaPc) {
        this.usrFechaInsertaPc = usrFechaInsertaPc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (infMac != null ? infMac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SisPcs)) {
            return false;
        }
        SisPcs other = (SisPcs) object;
        if ((this.infMac == null && other.infMac != null)
                || (this.infMac != null && !this.infMac.equals(other.infMac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistemaWeb.entity.SisPcs[ infMac=" + infMac + " ]";
    }

}
