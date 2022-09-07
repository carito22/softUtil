/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author VALDIVIEZO
 */
@Entity
@Table(name = "prd_piscina_grupos_relacion", schema = "produccion")
@NamedQueries({
    @NamedQuery(name = "PrdPiscinaGrupoRelacion.findAll", query = "SELECT i FROM PrdPiscinaGrupoRelacion i")})
public class PrdPiscinaGrupoRelacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grupo_secuencial")
    private Integer grupoSecuencial;
    @JoinColumns({
        @JoinColumn(name = "pis_empresa", referencedColumnName = "pis_empresa")
        ,@JoinColumn(name = "pis_sector", referencedColumnName = "pis_sector")
        ,@JoinColumn(name = "pis_numero", referencedColumnName = "pis_numero")})
    @ManyToOne(optional = false)
    private PrdPiscina prdPiscina;
    @JoinColumns({
        @JoinColumn(name = "grupo_empresa", referencedColumnName = "grupo_empresa")
        ,@JoinColumn(name = "grupo_codigo", referencedColumnName = "grupo_codigo")})
    @ManyToOne(optional = false)
    private PrdPiscinaGrupo prdPiscinaGrupo;

    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    private Timestamp usrFechaInserta;

    public PrdPiscinaGrupoRelacion() {
    }

    public Integer getGrupoSecuencial() {
        return grupoSecuencial;
    }

    public void setGrupoSecuencial(Integer grupoSecuencial) {
        this.grupoSecuencial = grupoSecuencial;
    }

    public PrdPiscina getPrdPiscina() {
        return prdPiscina;
    }

    public void setPrdPiscina(PrdPiscina prdPiscina) {
        this.prdPiscina = prdPiscina;
    }

    public PrdPiscinaGrupo getPrdPiscinaGrupo() {
        return prdPiscinaGrupo;
    }

    public void setPrdPiscinaGrupo(PrdPiscinaGrupo prdPiscinaGrupo) {
        this.prdPiscinaGrupo = prdPiscinaGrupo;
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

}
