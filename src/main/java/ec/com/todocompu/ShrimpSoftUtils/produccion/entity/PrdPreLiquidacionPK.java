package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdPreLiquidacionPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "pl_empresa")
    private String plEmpresa;
    @Column(name = "pl_motivo")
    private String plMotivo;
    @Column(name = "pl_numero")
    private String plNumero;

    public PrdPreLiquidacionPK() {
    }

    public PrdPreLiquidacionPK(String plEmpresa, String plMotivo, String plNumero) {
        this.plEmpresa = plEmpresa;
        this.plMotivo = plMotivo;
        this.plNumero = plNumero;
    }

    public String getPlEmpresa() {
        return plEmpresa;
    }

    public void setPlEmpresa(String plEmpresa) {
        this.plEmpresa = plEmpresa;
    }

    public String getPlMotivo() {
        return plMotivo;
    }

    public void setPlMotivo(String plMotivo) {
        this.plMotivo = plMotivo;
    }

    public String getPlNumero() {
        return plNumero;
    }

    public void setPlNumero(String plNumero) {
        this.plNumero = plNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plEmpresa != null ? plEmpresa.hashCode() : 0);
        hash += (plMotivo != null ? plMotivo.hashCode() : 0);
        hash += (plNumero != null ? plNumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PrdPreLiquidacionPK)) {
            return false;
        }
        PrdPreLiquidacionPK other = (PrdPreLiquidacionPK) object;
        if ((this.plEmpresa == null && other.plEmpresa != null)
                || (this.plEmpresa != null && !this.plEmpresa.equals(other.plEmpresa))) {
            return false;
        }
        if ((this.plMotivo == null && other.plMotivo != null)
                || (this.plMotivo != null && !this.plMotivo.equals(other.plMotivo))) {
            return false;
        }
        if ((this.plNumero == null && other.plNumero != null)
                || (this.plNumero != null && !this.plNumero.equals(other.plNumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "produccion.entity.PrdPreLiquidacionPK[ plEmpresa=" + plEmpresa + ", plMotivo=" + plMotivo
                + ", plNumero=" + plNumero + " ]";
    }

}
