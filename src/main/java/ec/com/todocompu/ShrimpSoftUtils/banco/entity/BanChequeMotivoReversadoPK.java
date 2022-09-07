/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.banco.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Usuario1
 */
@Embeddable
public class BanChequeMotivoReversadoPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "ban_empresa")
    private String banEmpresa;

    @Column(name = "ban_codigo_motivo")
    private String banCodigoMotivo;

    public BanChequeMotivoReversadoPK() {
    }

    public BanChequeMotivoReversadoPK(String banEmpresa, String banCodigoMotivo) {
        this.banEmpresa = banEmpresa;
        this.banCodigoMotivo = banCodigoMotivo;
    }

    public String getBanEmpresa() {
        return banEmpresa;
    }

    public void setBanEmpresa(String banEmpresa) {
        this.banEmpresa = banEmpresa;
    }

    public String getBanCodigoMotivo() {
        return banCodigoMotivo;
    }

    public void setBanCodigoMotivo(String banCodigoMotivo) {
        this.banCodigoMotivo = banCodigoMotivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (banEmpresa != null ? banEmpresa.hashCode() : 0);
        hash += (banCodigoMotivo != null ? banCodigoMotivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof BanChequeMotivoReversadoPK)) {
            return false;
        }
        BanChequeMotivoReversadoPK other = (BanChequeMotivoReversadoPK) object;
        if ((this.banEmpresa == null && other.banEmpresa != null) || (this.banEmpresa != null && !this.banEmpresa.equals(other.banEmpresa))) {
            return false;
        }
        if ((this.banCodigoMotivo == null && other.banCodigoMotivo != null) || (this.banCodigoMotivo != null && !this.banCodigoMotivo.equals(other.banCodigoMotivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banco.entity.BanChequeMotivoReversadoPK[banEmpresa= " + banEmpresa + ", banCodigoMotivo=" + banCodigoMotivo + "]";
    }
}
