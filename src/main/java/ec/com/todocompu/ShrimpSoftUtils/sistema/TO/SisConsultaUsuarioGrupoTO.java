/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SisConsultaUsuarioGrupoTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_nick")
    private String usrNick;
    @Column(name = "usr_nombre")
    private String usrNombre;
    @Column(name = "usr_apellido")
    private String usrApellido;
    @Column(name = "usr_password")
    private String usrPassword;
    @Column(name = "usr_caduca")
    private String usrCaduca;
    @Column(name = "usr_activo")
    private Boolean usrActivo;
    @Column(name = "usr_cambiar_contrasenia")
    private Boolean usrCambiarContraseña;
    @Column(name = "usr_codigo_inserta")
    private String usrCodigoInserta;
    @Column(name = "usr_fecha_inserta_usuario")
    private String usrFechaInsertaUsuario;
    @Column(name = "usr_email_usuario")
    private String usrEmail;
    @Column(name = "usr_email_password", nullable = true)
    private String usrPasswordEmail;
    @Column(name = "gru_codigo")
    private String gruCodigo;
    @Column(name = "usr_telefono")
    private String usrTelefono;

    public SisConsultaUsuarioGrupoTO() {
    }

    public SisConsultaUsuarioGrupoTO(String usrCodigo, String usrNick, String usrNombre, String usrApellido,
            String usrPassword, String usrCaduca, Boolean usrActivo, Boolean usrCambiarContraseña,
            String usrCodigoInserta, String usrFechaInsertaUsuario, String gruCodigo, String usrEmail,
            String usrPasswordEmail, String usrTelefono) {
        this.usrCodigo = usrCodigo;
        this.usrNick = usrNick;
        this.usrNombre = usrNombre;
        this.usrApellido = usrApellido;
        this.usrPassword = usrPassword;
        this.usrCaduca = usrCaduca;
        this.usrActivo = usrActivo;
        this.usrCambiarContraseña = usrCambiarContraseña;
        this.usrCodigoInserta = usrCodigoInserta;
        this.usrFechaInsertaUsuario = usrFechaInsertaUsuario;
        this.gruCodigo = gruCodigo;
        this.usrEmail = usrEmail;
        this.usrPasswordEmail = usrPasswordEmail;
        this.usrTelefono = usrTelefono;
    }

    public Boolean getUsrActivo() {
        return usrActivo;
    }

    public void setUsrActivo(Boolean usrActivo) {
        this.usrActivo = usrActivo;
    }

    public String getUsrApellido() {
        return usrApellido;
    }

    public void setUsrApellido(String usrApellido) {
        this.usrApellido = usrApellido;
    }

    public String getUsrCaduca() {
        return usrCaduca;
    }

    public void setUsrCaduca(String usrCaduca) {
        this.usrCaduca = usrCaduca;
    }

    public Boolean getUsrCambiarContraseña() {
        return usrCambiarContraseña;
    }

    public void setUsrCambiarContraseña(Boolean usrCambiarContraseña) {
        this.usrCambiarContraseña = usrCambiarContraseña;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrCodigoInserta() {
        return usrCodigoInserta;
    }

    public void setUsrCodigoInserta(String usrCodigoInserta) {
        this.usrCodigoInserta = usrCodigoInserta;
    }

    public String getUsrFechaInsertaUsuario() {
        return usrFechaInsertaUsuario;
    }

    public void setUsrFechaInsertaUsuario(String usrFechaInsertaUsuario) {
        this.usrFechaInsertaUsuario = usrFechaInsertaUsuario;
    }

    public String getUsrNick() {
        return usrNick;
    }

    public void setUsrNick(String usrNick) {
        this.usrNick = usrNick;
    }

    public String getUsrNombre() {
        return usrNombre;
    }

    public void setUsrNombre(String usrNombre) {
        this.usrNombre = usrNombre;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public String getGruCodigo() {
        return gruCodigo;
    }

    public void setGruCodigo(String gruCodigo) {
        this.gruCodigo = gruCodigo;
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public String setUsrEmail(String usrEmail) {
        return this.usrEmail = usrEmail;
    }

    public String getUsrPasswordEmail() {
        return usrPasswordEmail;
    }

    public String setUsrPasswordEmail(String usrPasswordEmail) {
        return this.usrPasswordEmail = usrPasswordEmail;
    }

    public String getUsrTelefono() {
        return usrTelefono;
    }

    public void setUsrTelefono(String usrTelefono) {
        this.usrTelefono = usrTelefono;
    }

}
