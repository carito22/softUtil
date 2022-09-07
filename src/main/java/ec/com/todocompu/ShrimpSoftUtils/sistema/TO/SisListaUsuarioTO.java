package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SisListaUsuarioTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_nombre")
    private String usrNombre;
    @Column(name = "usr_apellido")
    private String usrApellido;
    @Column(name = "usr_email_usuario")
    private String usrEmailUsuario;

    public SisListaUsuarioTO() {
    }

    public SisListaUsuarioTO(String usrCodigo, String usrNombre, String usrApellido,String usrEmailUsuario) {
        this.usrCodigo = usrCodigo;
        this.usrNombre = usrNombre;
        this.usrApellido = usrApellido;
        this.usrEmailUsuario = usrEmailUsuario;
    }

    public String getUsrApellido() {
        return usrApellido;
    }

    public void setUsrApellido(String usrApellido) {
        this.usrApellido = usrApellido;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrNombre() {
        return usrNombre;
    }

    public void setUsrNombre(String usrNombre) {
        this.usrNombre = usrNombre;
    }

    public String getUsrEmailUsuario() {
        return usrEmailUsuario;
    }

    public void setUsrEmailUsuario(String usrEmailUsuario) {
        this.usrEmailUsuario = usrEmailUsuario;
    }

    @Override
    public String toString() {
        return (getUsrNombre() + " " + getUsrApellido());
    }

}
