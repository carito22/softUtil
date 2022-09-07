/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author VALDIVIEZO
 */
@Entity
@Table(name = "sis_empresa_parametros_mikrotik", schema = "sistemaweb")
public class SisEmpresaParametrosMikrotik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "par_secuencial")
    private Integer parSecuencial;
    @Column(name = "par_empresa")
    private String parEmpresa;
    @Column(name = "par_name")
    private String parName;
    @Column(name = "par_password")
    private String parPassword;
    @Column(name = "par_ip")
    private String parIp;

    public SisEmpresaParametrosMikrotik() {
    }

    public SisEmpresaParametrosMikrotik(Integer parSecuencial) {
        this.parSecuencial = parSecuencial;
    }

    public SisEmpresaParametrosMikrotik(Integer parSecuencial, String parEmpresa, String parName, String parPassword, String parIp) {
        this.parSecuencial = parSecuencial;
        this.parEmpresa = parEmpresa;
        this.parName = parName;
        this.parPassword = parPassword;
        this.parIp = parIp;
    }

    public Integer getParSecuencial() {
        return parSecuencial;
    }

    public void setParSecuencial(Integer parSecuencial) {
        this.parSecuencial = parSecuencial;
    }

    public String getParEmpresa() {
        return parEmpresa;
    }

    public void setParEmpresa(String parEmpresa) {
        this.parEmpresa = parEmpresa;
    }

    public String getParName() {
        return parName;
    }

    public void setParName(String parName) {
        this.parName = parName;
    }

    public String getParPassword() {
        return parPassword;
    }

    public void setParPassword(String parPassword) {
        this.parPassword = parPassword;
    }

    public String getParIp() {
        return parIp;
    }

    public void setParIp(String parIp) {
        this.parIp = parIp;
    }

}
