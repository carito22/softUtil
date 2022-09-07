/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author VALDIVIEZO
 */
@Entity
public class PrdPiscinaGrupoRelacionTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "grupo_secuencial")
    private Integer grupoSecuencial;
    @Column(name = "pis_empresa")
    private String pisEmpresa;
    @Column(name = "pis_sector")
    private String pisSector;
    @Column(name = "pis_numero")
    private String pisNumero;
    @Column(name = "grupo_empresa")
    private String grupoEmpresa;
    @Column(name = "grupo_codigo")
    private String grupoCodigo;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    public PrdPiscinaGrupoRelacionTO() {
    }

    public Integer getGrupoSecuencial() {
        return grupoSecuencial;
    }

    public void setGrupoSecuencial(Integer grupoSecuencial) {
        this.grupoSecuencial = grupoSecuencial;
    }

    public String getPisEmpresa() {
        return pisEmpresa;
    }

    public void setPisEmpresa(String pisEmpresa) {
        this.pisEmpresa = pisEmpresa;
    }

    public String getPisSector() {
        return pisSector;
    }

    public void setPisSector(String pisSector) {
        this.pisSector = pisSector;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    public String getGrupoEmpresa() {
        return grupoEmpresa;
    }

    public void setGrupoEmpresa(String grupoEmpresa) {
        this.grupoEmpresa = grupoEmpresa;
    }

    public String getGrupoCodigo() {
        return grupoCodigo;
    }

    public void setGrupoCodigo(String grupoCodigo) {
        this.grupoCodigo = grupoCodigo;
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

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

}
