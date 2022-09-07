package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "sis_usuario", schema = "sistemaweb")
public class SisUsuario implements Serializable {

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
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrCaduca;
    @Column(name = "usr_activo")
    private boolean usrActivo;
    @Column(name = "usr_cambiar_contrasenia")
    private boolean usrCambiarContrasenia;
    @Column(name = "usr_email_usuario")
    private String usrEmail;
    @Column(name = "usr_email_password")
    private String usrPasswordEmail;
    @Column(name = "usr_ip")
    private String usrIP;
    @Column(name = "usr_codigo_inserta")
    private String usrCodigoInserta;
    @Column(name = "usr_fecha_inserta_usuario")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInsertaUsuario;
    @Column(name = "usr_telefono")
    private String usrTelefono;

    public SisUsuario() {
    }

    public SisUsuario(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public SisUsuario(String usrCodigo, String usrNick, String usrNombre, String usrApellido, String usrPassword,
            Date usrCaduca, boolean usrActivo, boolean usrCambiarContrasenia, String usrEmail, String usrPasswordEmail,
            String usrIP, String usrCodigoInserta, Date usrFechaInsertaUsuario, String usrTelefono) {
        this.usrCodigo = usrCodigo;
        this.usrNick = usrNick;
        this.usrNombre = usrNombre;
        this.usrApellido = usrApellido;
        this.usrPassword = usrPassword;
        this.usrCaduca = usrCaduca;
        this.usrActivo = usrActivo;
        this.usrCambiarContrasenia = usrCambiarContrasenia;
        this.usrEmail = usrEmail;
        this.usrPasswordEmail = usrPasswordEmail;
        this.usrIP = usrIP;
        this.usrCodigoInserta = usrCodigoInserta;
        this.usrFechaInsertaUsuario = usrFechaInsertaUsuario;
        this.usrTelefono = usrTelefono;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
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

    public String getUsrApellido() {
        return usrApellido;
    }

    public void setUsrApellido(String usrApellido) {
        this.usrApellido = usrApellido;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public Date getUsrCaduca() {
        return usrCaduca;
    }

    public void setUsrCaduca(Date usrCaduca) {
        this.usrCaduca = usrCaduca;
    }

    public boolean getUsrActivo() {
        return usrActivo;
    }

    public void setUsrActivo(boolean usrActivo) {
        this.usrActivo = usrActivo;
    }

    public boolean getUsrCambiarContrasenia() {
        return usrCambiarContrasenia;
    }

    public void setUsrCambiarContrasenia(boolean usrCambiarContrasenia) {
        this.usrCambiarContrasenia = usrCambiarContrasenia;
    }

    public String getUsrCodigoInserta() {
        return usrCodigoInserta;
    }

    public void setUsrCodigoInserta(String usrCodigoInserta) {
        this.usrCodigoInserta = usrCodigoInserta;
    }

    public Date getUsrFechaInsertaUsuario() {
        return usrFechaInsertaUsuario;
    }

    public void setUsrFechaInsertaUsuario(Date usrFechaInsertaUsuario) {
        this.usrFechaInsertaUsuario = usrFechaInsertaUsuario;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrPasswordEmail(String usrPasswordEmail) {
        this.usrPasswordEmail = usrPasswordEmail;
    }

    public String getUsrPasswordEmail() {
        return usrPasswordEmail;
    }

    public String getUsrIP() {
        return usrIP;
    }

    public void setUsrIP(String usrIP) {
        this.usrIP = usrIP;
    }

    public String getUsrTelefono() {
        return usrTelefono;
    }

    public void setUsrTelefono(String usrTelefono) {
        this.usrTelefono = usrTelefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrCodigo != null ? usrCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SisUsuario)) {
            return false;
        }
        SisUsuario other = (SisUsuario) object;
        if ((this.usrCodigo == null && other.usrCodigo != null)
                || (this.usrCodigo != null && !this.usrCodigo.equals(other.usrCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistemaWeb.entity.SisUsuario[ usrCodigo=" + usrCodigo + " ]";
    }
}
