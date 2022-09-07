package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdEquipoControlPK implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ecEmpresa;
    private String ecCodigo;

    public PrdEquipoControlPK() {
    }

    public PrdEquipoControlPK(String ecEmpresa, String ecCodigo) {
        this.ecEmpresa = ecEmpresa;
        this.ecCodigo = ecCodigo;
    }

    @Column(name = "ec_empresa")
    public String getEcEmpresa() {
        return ecEmpresa;
    }

    public void setEcEmpresa(String ecEmpresa) {
        this.ecEmpresa = ecEmpresa;
    }

    @Column(name = "ec_codigo")
    public String getEcCodigo() {
        return ecCodigo;
    }

    public void setEcCodigo(String ecCodigo) {
        this.ecCodigo = ecCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ecEmpresa != null ? ecEmpresa.hashCode() : 0);
        hash += (ecCodigo != null ? ecCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PrdEquipoControlPK)) {
            return false;
        }
        PrdEquipoControlPK other = (PrdEquipoControlPK) object;
        if ((this.ecEmpresa == null && other.ecEmpresa != null)
                || (this.ecEmpresa != null && !this.ecEmpresa.equals(other.ecEmpresa))) {
            return false;
        }
        if ((this.ecCodigo == null && other.ecCodigo != null)
                || (this.ecCodigo != null && !this.ecCodigo.equals(other.ecCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "produccion.entity.PrdEquipoControlPK[ ecEmpresa=" + ecEmpresa + ", ecCodigo=" + ecCodigo + " ]";
    }

}
