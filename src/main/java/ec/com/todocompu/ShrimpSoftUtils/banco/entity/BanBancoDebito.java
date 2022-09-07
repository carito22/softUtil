package ec.com.todocompu.ShrimpSoftUtils.banco.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author KevinQuispe
 */
@Entity
@Table(name = "ban_banco_debito", schema = "banco")
public class BanBancoDebito implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BanBancoDebitoPK banBancoDebitoPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ban_nombre")
    private String banNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usr_fecha_inserta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;

    public BanBancoDebito() {
    }

    public BanBancoDebito(BanBancoDebitoPK banBancoDebitoPK) {
        this.banBancoDebitoPK = banBancoDebitoPK;
    }

    public BanBancoDebito(BanBancoDebitoPK banBancoDebitoPK, String banNombre, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.banBancoDebitoPK = banBancoDebitoPK;
        this.banNombre = banNombre;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public BanBancoDebito(String banEmpresa, String banCodigo) {
        this.banBancoDebitoPK = new BanBancoDebitoPK(banEmpresa, banCodigo);
    }

    public BanBancoDebitoPK getBanBancoDebitoPK() {
        return banBancoDebitoPK;
    }

    public void setBanBancoDebitoPK(BanBancoDebitoPK banBancoDebitoPK) {
        this.banBancoDebitoPK = banBancoDebitoPK;
    }

    public String getBanNombre() {
        return banNombre;
    }

    public void setBanNombre(String banNombre) {
        this.banNombre = banNombre;
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

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (banBancoDebitoPK != null ? banBancoDebitoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BanBancoDebito)) {
            return false;
        }
        BanBancoDebito other = (BanBancoDebito) object;
        if ((this.banBancoDebitoPK == null && other.banBancoDebitoPK != null) || (this.banBancoDebitoPK != null && !this.banBancoDebitoPK.equals(other.banBancoDebitoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.banco.entity.BanBancoDebito[ banBancoDebitoPK=" + banBancoDebitoPK + " ]";
    }

}
