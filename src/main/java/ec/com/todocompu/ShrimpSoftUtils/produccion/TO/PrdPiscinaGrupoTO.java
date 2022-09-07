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
public class PrdPiscinaGrupoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "grupo_empresa")
    private String grupoEmpresa;
    @Column(name = "grupo_codigo")
    private String grupoCodigo;
    @Column(name = "grupo_descripcion")
    private String grupoDescripcion;
    @Column(name = "grupo_activo")
    private boolean grupoActivo;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    public PrdPiscinaGrupoTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getGrupoDescripcion() {
        return grupoDescripcion;
    }

    public void setGrupoDescripcion(String grupoDescripcion) {
        this.grupoDescripcion = grupoDescripcion;
    }

    public boolean isGrupoActivo() {
        return grupoActivo;
    }

    public void setGrupoActivo(boolean grupoActivo) {
        this.grupoActivo = grupoActivo;
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
