/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author DEVELOPER3
 */
@Entity
public class InvClienteGrupoEmpresarialTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "ge_empresa")
    private String geEmpresa;
    @Id
    @Column(name = "ge_codigo")
    private String geCodigo;

    @Column(name = "ge_nombre")
    private String geNombre;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    public InvClienteGrupoEmpresarialTO() {

    }

    public String getGeEmpresa() {
        return geEmpresa;
    }

    public void setGeEmpresa(String geEmpresa) {
        this.geEmpresa = geEmpresa;
    }

    public String getGeCodigo() {
        return geCodigo;
    }

    public void setGeCodigo(String geCodigo) {
        this.geCodigo = geCodigo;
    }

    public String getGeNombre() {
        return geNombre;
    }

    public void setGeNombre(String geNombre) {
        this.geNombre = geNombre;
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
