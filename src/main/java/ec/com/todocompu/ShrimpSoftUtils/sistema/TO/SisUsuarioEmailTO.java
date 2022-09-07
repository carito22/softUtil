/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class SisUsuarioEmailTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_nombre")
    private String usrNombre;
    @Column(name = "usr_apellido")
    private String usrApellido;
    @Column(name = "usr_email")
    private String usrEmail;

    public SisUsuarioEmailTO() {
    }

    public SisUsuarioEmailTO(String usrCodigo, String usrEmpresa, String usrNombre, String usrApellido, String usrEmail) {
        this.usrCodigo = usrCodigo;
        this.usrEmpresa = usrEmpresa;
        this.usrNombre = usrNombre;
        this.usrApellido = usrApellido;
        this.usrEmail = usrEmail;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrNombre() {
        return usrNombre;
    }

    public void setUsrNombre(String usrNombre) {
        this.usrNombre = usrNombre;
    }

    public String getUsrApellido() {
        return usrApellido;
    }

    public void setUsrApellido(String usrApellido) {
        this.usrApellido = usrApellido;
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }

}
