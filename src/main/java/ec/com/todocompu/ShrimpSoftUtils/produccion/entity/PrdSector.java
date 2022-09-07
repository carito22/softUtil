package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "prd_sector", schema = "produccion")
public class PrdSector implements Serializable {

    private static final long serialVersionUID = 1L;

    protected PrdSectorPK prdSectorPK;
    private String secNombre;
    private String secLatitud;
    private String secLongitud;
    private Boolean secActivo;
    private String usrEmpresa;
    private String usrCodigo;
    private Timestamp usrFechaInserta;
    private String secDireccion;
    private String secTelefono;
    private List<PrdSobrevivencia> prdSobrevivenciaList;
    private List<PrdPiscina> prdPiscinaList;
    private String secActividad;

    public PrdSector() {
    }

    public PrdSector(PrdSectorPK prdSectorPK) {
        this.prdSectorPK = prdSectorPK;
    }

    public PrdSector(PrdSectorPK prdSectorPK, String secNombre, String usrEmpresa, String usrCodigo,
            Timestamp usrFechaInserta) {
        this.prdSectorPK = prdSectorPK;
        this.secNombre = secNombre;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public PrdSector(String secEmpresa, String secCodigo) {
        this.prdSectorPK = new PrdSectorPK(secEmpresa, secCodigo);
    }

    @EmbeddedId
    public PrdSectorPK getPrdSectorPK() {
        return prdSectorPK;
    }

    public void setPrdSectorPK(PrdSectorPK prdSectorPK) {
        this.prdSectorPK = prdSectorPK;
    }

    @Column(name = "sec_nombre")
    public String getSecNombre() {
        return secNombre;
    }

    public void setSecNombre(String secNombre) {
        this.secNombre = secNombre;
    }

    @Column(name = "sec_latitud")
    public String getSecLatitud() {
        return secLatitud;
    }

    public void setSecLatitud(String secLatitud) {
        this.secLatitud = secLatitud;
    }

    @Column(name = "sec_longitud")
    public String getSecLongitud() {
        return secLongitud;
    }

    public void setSecLongitud(String secLongitud) {
        this.secLongitud = secLongitud;
    }

    @Column(name = "sec_activo")
    public Boolean getSecActivo() {
        return secActivo;
    }

    public void setSecActivo(Boolean secActivo) {
        this.secActivo = secActivo;
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

    @Column(name = "sec_direccion")
    public String getSecDireccion() {
        return secDireccion;
    }

    public void setSecDireccion(String secDireccion) {
        this.secDireccion = secDireccion;
    }

    @Column(name = "sec_telefono")
    public String getSecTelefono() {
        return secTelefono;
    }

    @Column(name = "sec_actividad")
    public String getSecActividad() {
        return secActividad;
    }

    public void setSecActividad(String secActividad) {
        this.secActividad = secActividad;
    }

    public void setSecTelefono(String secTelefono) {
        this.secTelefono = secTelefono;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prdSector")
    @JsonIgnore
    public List<PrdSobrevivencia> getPrdSobrevivenciaList() {
        return prdSobrevivenciaList;
    }

    public void setPrdSobrevivenciaList(List<PrdSobrevivencia> prdSobrevivenciaList) {
        this.prdSobrevivenciaList = prdSobrevivenciaList;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prdSector")
    @JsonIgnore
    public List<PrdPiscina> getPrdPiscinaList() {
        return prdPiscinaList;
    }

    public void setPrdPiscinaList(List<PrdPiscina> prdPiscinaList) {
        this.prdPiscinaList = prdPiscinaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdSectorPK != null ? prdSectorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PrdSector)) {
            return false;
        }
        PrdSector other = (PrdSector) object;
        if ((this.prdSectorPK == null && other.prdSectorPK != null)
                || (this.prdSectorPK != null && !this.prdSectorPK.equals(other.prdSectorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "produccion.entity.PrdSector[ prdSectorPK=" + prdSectorPK + " ]";
    }

}
