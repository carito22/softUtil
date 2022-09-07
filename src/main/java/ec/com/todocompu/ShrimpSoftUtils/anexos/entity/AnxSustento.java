package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "anx_sustento", schema = "anexo")
public class AnxSustento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "sus_codigo")
    private String susCodigo;
    @Column(name = "sus_descripcion")
    private String susDescripcion;
    @Column(name = "sus_comprobante")
    private String susComprobante;
    @Column(name = "sus_tipo_credito_tributario")
    private String susTipoCreditoTributario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compSustentotributario")
    private List<AnxCompra> anxCompraList;

    public AnxSustento() {
    }

    public AnxSustento(String susCodigo) {
        this.susCodigo = susCodigo;
    }

    public String getSusCodigo() {
        return susCodigo;
    }

    public void setSusCodigo(String susCodigo) {
        this.susCodigo = susCodigo;
    }

    public String getSusDescripcion() {
        return susDescripcion;
    }

    public void setSusDescripcion(String susDescripcion) {
        this.susDescripcion = susDescripcion;
    }

    public String getSusComprobante() {
        return susComprobante;
    }

    public void setSusComprobante(String susComprobante) {
        this.susComprobante = susComprobante;
    }

    public List<AnxCompra> getAnxCompraList() {
        return anxCompraList;
    }

    public void setAnxCompraList(List<AnxCompra> anxCompraList) {
        this.anxCompraList = anxCompraList;
    }

    public String getSusTipoCreditoTributario() {
        return susTipoCreditoTributario;
    }

    public void setSusTipoCreditoTributario(String susTipoCreditoTributario) {
        this.susTipoCreditoTributario = susTipoCreditoTributario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (susCodigo != null ? susCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AnxSustento)) {
            return false;
        }
        AnxSustento other = (AnxSustento) object;
        if ((this.susCodigo == null && other.susCodigo != null)
                || (this.susCodigo != null && !this.susCodigo.equals(other.susCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anexos.entity.AnxSustento[ susCodigo=" + susCodigo + " ]";
    }

}
