package ec.com.todocompu.ShrimpSoftUtils.web;

public class SessionItemTO {

    private String token;
    private String usuarioId;
    private String nombrecompleto;
    private String codigo;
    private String email;

    public SessionItemTO(String token, String usuarioId) {
        this.token = token;
        this.usuarioId = usuarioId;
    }

    public SessionItemTO() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
