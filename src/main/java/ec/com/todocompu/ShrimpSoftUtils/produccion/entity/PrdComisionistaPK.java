package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdComisionistaPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "co_empresa")
    private String coEmpresa;
    @Column(name = "co_codigo")
    private String coCodigo;
    @Column(name = "co_cedula")
    private String coCedula;

    public PrdComisionistaPK() {
    }

    public PrdComisionistaPK(String coEmpresa, String coCodigo, String coCedula) {
        this.coEmpresa = coEmpresa;
        this.coCodigo = coCodigo;
        this.coCedula = coCedula;
    }

    public String getCoEmpresa() {
        return coEmpresa;
    }

    public void setCoEmpresa(String coEmpresa) {
        this.coEmpresa = coEmpresa;
    }

    public String getCoCodigo() {
        return coCodigo;
    }

    public void setCoCodigo(String coCodigo) {
        this.coCodigo = coCodigo;
    }

    public String getCoCedula() {
        return coCedula;
    }

    public void setCoCedula(String coCedula) {
        this.coCedula = coCedula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coEmpresa != null ? coEmpresa.hashCode() : 0);
        hash += (coCodigo != null ? coCodigo.hashCode() : 0);
        hash += (coCedula != null ? coCedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PrdComisionistaPK)) {
            return false;
        }
        PrdComisionistaPK other = (PrdComisionistaPK) object;
        if ((this.coEmpresa == null && other.coEmpresa != null)
                || (this.coEmpresa != null && !this.coEmpresa.equals(other.coEmpresa))) {
            return false;
        }
        if ((this.coCodigo == null && other.coCodigo != null)
                || (this.coCodigo != null && !this.coCodigo.equals(other.coCodigo))) {
            return false;
        }
        if ((this.coCedula == null && other.coCedula != null)
                || (this.coCedula != null && !this.coCedula.equals(other.coCedula))) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "produccion.entity.PrdComisionistaPK[ coEmpresa=" + coEmpresa + ", coCodigo=" + coCodigo
                + ", coCedula=" + coCedula + " ]";
    }

}
