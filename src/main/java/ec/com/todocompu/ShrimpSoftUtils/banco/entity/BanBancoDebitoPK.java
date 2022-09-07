package ec.com.todocompu.ShrimpSoftUtils.banco.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author KevinQuispe
 */
@Embeddable
public class BanBancoDebitoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ban_empresa")
    private String banEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ban_codigo")
    private String banCodigo;

    public BanBancoDebitoPK() {
    }

    public BanBancoDebitoPK(String banEmpresa, String banCodigo) {
        this.banEmpresa = banEmpresa;
        this.banCodigo = banCodigo;
    }

    public String getBanEmpresa() {
        return banEmpresa;
    }

    public void setBanEmpresa(String banEmpresa) {
        this.banEmpresa = banEmpresa;
    }

    public String getBanCodigo() {
        return banCodigo;
    }

    public void setBanCodigo(String banCodigo) {
        this.banCodigo = banCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (banEmpresa != null ? banEmpresa.hashCode() : 0);
        hash += (banCodigo != null ? banCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BanBancoDebitoPK)) {
            return false;
        }
        BanBancoDebitoPK other = (BanBancoDebitoPK) object;
        if ((this.banEmpresa == null && other.banEmpresa != null) || (this.banEmpresa != null && !this.banEmpresa.equals(other.banEmpresa))) {
            return false;
        }
        if ((this.banCodigo == null && other.banCodigo != null) || (this.banCodigo != null && !this.banCodigo.equals(other.banCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.banco.entity.BanBancoDebitoPK[ banEmpresa=" + banEmpresa + ", banCodigo=" + banCodigo + " ]";
    }

}
