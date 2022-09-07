/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.banco.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Usuario1
 */
@Entity
@Table(name = "ban_cheque_motivo_reversado", schema = "banco")
public class BanChequeMotivoReversado implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected BanChequeMotivoReversadoPK banChequeMotivoReversadoPK;
    @Column(name = "ban_descripcion")
    private String banDescripcion;
    @Column(name = "ban_contable")
    private String banContable;
    @Column(name = "ban_estado")
    private boolean banEstado;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    private Timestamp usrFechaInserta;

    public BanChequeMotivoReversado() {
    }

    public BanChequeMotivoReversado(BanChequeMotivoReversadoPK banChequeMotivoReversadoPK) {
        this.banChequeMotivoReversadoPK = banChequeMotivoReversadoPK;
    }

    public BanChequeMotivoReversado(BanChequeMotivoReversadoPK banChequeMotivoReversadoPK, String banDescripcion, String banContable, boolean banEstado, String usrEmpresa, String usrCodigo, Timestamp usrFechaInserta) {
        this.banChequeMotivoReversadoPK = banChequeMotivoReversadoPK;
        this.banDescripcion = banDescripcion;
        this.banContable = banContable;
        this.banEstado = banEstado;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public BanChequeMotivoReversado(String banEmpresa, String banCodigoContable) {
        this.banChequeMotivoReversadoPK = new BanChequeMotivoReversadoPK(banEmpresa, banCodigoContable);
    }

    public BanChequeMotivoReversadoPK getBanChequeMotivoReversadoPK() {
        return banChequeMotivoReversadoPK;
    }

    public void setBanChequeMotivoReversadoPK(BanChequeMotivoReversadoPK banChequeMotivoReversadoPK) {
        this.banChequeMotivoReversadoPK = banChequeMotivoReversadoPK;
    }

    public String getBanDescripcion() {
        return banDescripcion;
    }

    public void setBanDescripcion(String banDescripcion) {
        this.banDescripcion = banDescripcion;
    }

    public String getBanContable() {
        return banContable;
    }

    public void setBanContable(String banContable) {
        this.banContable = banContable;
    }

    public boolean getBanEstado() {
        return banEstado;
    }

    public void setBanEstado(boolean banEstado) {
        this.banEstado = banEstado;
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

    public Timestamp getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Timestamp usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (banChequeMotivoReversadoPK != null ? banChequeMotivoReversadoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof BanChequeMotivoReversado)) {
            return false;
        }
        BanChequeMotivoReversado other = (BanChequeMotivoReversado) object;
        if ((this.banChequeMotivoReversadoPK == null && other.banChequeMotivoReversadoPK != null) || (this.banChequeMotivoReversadoPK != null && !this.banChequeMotivoReversadoPK.equals(other.banChequeMotivoReversadoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banco.entity.BanChequeMotivoReversado[banChequeMotivoReversadoPK=" + banChequeMotivoReversadoPK + "]";
    }
}
