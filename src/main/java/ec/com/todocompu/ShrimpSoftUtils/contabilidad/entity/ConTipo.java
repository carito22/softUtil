package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "con_tipo", schema = "contabilidad")
public class ConTipo implements Serializable {

    private static final long serialVersionUID = 1L;

    protected ConTipoPK conTipoPK;
    private String tipDetalle;
    private String tipModulo;
    private String tipTipoPrincipal;
    private boolean tipInactivo;
    private String usrEmpresa;
    private String usrCodigo;
    private Timestamp usrFechaInserta;

    public ConTipo() {
    }

    public ConTipo(ConTipoPK conTipoPK) {
        this.conTipoPK = conTipoPK;
    }

    public ConTipo(ConTipoPK conTipoPK, String tipDetalle, String tipModulo, String tipTipoPrincipal, boolean tipInactivo, String usrEmpresa, String usrCodigo,
            Timestamp usrFechaInserta) {
        this.conTipoPK = conTipoPK;
        this.tipDetalle = tipDetalle;
        this.tipModulo = tipModulo;
        this.tipTipoPrincipal = tipTipoPrincipal;
        this.tipInactivo = tipInactivo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public ConTipo(String tipEmpresa, String tipCodigo) {
        this.conTipoPK = new ConTipoPK(tipEmpresa, tipCodigo);
    }

    @EmbeddedId
    public ConTipoPK getConTipoPK() {
        return conTipoPK;
    }

    public void setConTipoPK(ConTipoPK conTipoPK) {
        this.conTipoPK = conTipoPK;
    }

    @Column(name = "tip_detalle")
    public String getTipDetalle() {
        return tipDetalle;
    }

    public void setTipDetalle(String tipDetalle) {
        this.tipDetalle = tipDetalle;
    }

    @Column(name = "tip_modulo")
    public String getTipModulo() {
        return tipModulo;
    }

    public void setTipModulo(String tipModulo) {
        this.tipModulo = tipModulo;
    }
    
    @Column(name = "tip_tipo_principal")
    public String getTipTipoPrincipal() {
        return tipTipoPrincipal;
    }

    public void setTipTipoPrincipal(String tipTipoPrincipal) {
        this.tipTipoPrincipal = tipTipoPrincipal;
    }
    
    @Column(name = "tip_inactivo")
    public boolean getTipInactivo() {
        return tipInactivo;
    }

    public void setTipInactivo(boolean tipInactivo) {
        this.tipInactivo = tipInactivo;
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
        hash += (conTipoPK != null ? conTipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ConTipo)) {
            return false;
        }
        ConTipo other = (ConTipo) object;
        if ((this.conTipoPK == null && other.conTipoPK != null)
                || (this.conTipoPK != null && !this.conTipoPK.equals(other.conTipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "contabilidad.entity.ConTipo[ conTipoPK=" + conTipoPK + " ]";
    }

}
