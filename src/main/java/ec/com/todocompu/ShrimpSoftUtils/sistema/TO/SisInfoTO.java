package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

public class SisInfoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String empresa;
    private String usuarioCompleto;
    private String usuario;
    private String usuarioNick;
    private String mac;
    private String empresaRuc;
    private String ambiente;
    private String imagen;
    private String email;
    private String telefono;

    public SisInfoTO() {
    }

    public SisInfoTO(String empresa, String usuario, String usuarioNick, String mac, String ambiente) {
        this.empresa = empresa;
        this.usuario = usuario;
        this.usuarioNick = usuarioNick;
        this.mac = mac;
        this.ambiente = ambiente;
    }

    public SisInfoTO(String empresa, String usuario, String usuarioNick, String mac, String empresaRuc,
            String ambiente) {
        this.empresa = empresa;
        this.usuario = usuario;
        this.usuarioNick = usuarioNick;
        this.mac = mac;
        this.empresaRuc = empresaRuc;
        this.ambiente = ambiente;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getUsuarioCompleto() {
        return usuarioCompleto;
    }

    public void setUsuarioCompleto(String usuarioCompleto) {
        this.usuarioCompleto = usuarioCompleto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuarioNick() {
        return usuarioNick;
    }

    public void setUsuarioNick(String usuarioNick) {
        this.usuarioNick = usuarioNick;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getEmpresaRuc() {
        return empresaRuc;
    }

    public void setEmpresaRuc(String empresaRuc) {
        this.empresaRuc = empresaRuc;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "SisInfoTO [empresa=" + empresa + ", usuario=" + usuario + ", usuarioNick=" + usuarioNick + ", mac="
                + mac + ", empresaRuc=" + empresaRuc + ", ambiente=" + ambiente + "]";
    }

}
