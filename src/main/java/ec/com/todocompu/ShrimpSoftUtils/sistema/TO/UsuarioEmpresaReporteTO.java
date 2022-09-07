package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;

public class UsuarioEmpresaReporteTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String empCodigo;
    private String empNombre;
    private String empRuc;
    private String empRazonSocial;
    private String empGerente;
    private String empContador;
    private String empDireccion;
    private String empTelefono;
    private String empCiudad;
    private String empEmail;
    private String usrNick;
    private String usrNombre;
    private String usrApellido;
    private String empRutaReportes;
    private String empRutaLogo;

    public UsuarioEmpresaReporteTO() {
    }

    public UsuarioEmpresaReporteTO(SisUsuarioEmpresaTO sisUsuarioEmpresaTO) {
        this.empCodigo = sisUsuarioEmpresaTO.getEmpCodigo();
        this.empNombre = sisUsuarioEmpresaTO.getEmpNombre();
        this.empRuc = sisUsuarioEmpresaTO.getEmpRuc();
        this.empRazonSocial = sisUsuarioEmpresaTO.getEmpRazonSocial();
        this.empGerente = sisUsuarioEmpresaTO.getEmpGerente();
        this.empContador = sisUsuarioEmpresaTO.getEmpContador();
        this.empDireccion = sisUsuarioEmpresaTO.getEmpDireccion();
        this.empTelefono = sisUsuarioEmpresaTO.getEmpTelefono();
        this.usrNick = sisUsuarioEmpresaTO.getUsrNick();
        this.usrNombre = sisUsuarioEmpresaTO.getUsrNombre();
        this.usrApellido = sisUsuarioEmpresaTO.getUsrApellido();
        this.empCiudad = sisUsuarioEmpresaTO.getEmpCiudad();
        this.empRutaReportes = sisUsuarioEmpresaTO.getEmpParRutaReportes();
        this.empRutaLogo = sisUsuarioEmpresaTO.getEmpParRutaLogo();
        this.empEmail = sisUsuarioEmpresaTO.getEmpEmail();
    }

    private void iniciar(SisUsuarioEmpresaTO sisUsuarioEmpresaTO) {

    }

    public void setUsuarioEmpresaReporteTO(SisUsuarioEmpresaTO sisUsuarioEmpresaTO) {
        iniciar(sisUsuarioEmpresaTO);
    }

    public UsuarioEmpresaReporteTO(String empCodigo, String empNombre, String empRuc, String empRazonSocial,
            String empGerente, String empContador, String empDireccion, String empTelefono, String empEmail, String usrNick,
            String usrNombre, String usrApellido) {
        this.empCodigo = empCodigo;
        this.empNombre = empNombre;
        this.empRuc = empRuc;
        this.empRazonSocial = empRazonSocial;
        this.empGerente = empGerente;
        this.empContador = empContador;
        this.empDireccion = empDireccion;
        this.empTelefono = empTelefono;
        this.empEmail = empEmail;
        this.usrNick = usrNick;
        this.usrNombre = usrNombre;
        this.usrApellido = usrApellido;
    }

    public String getEmpCiudad() {
        return empCiudad;
    }

    public void setEmpCiudad(String empCiudad) {
        this.empCiudad = empCiudad;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    public String getEmpRuc() {
        return empRuc;
    }

    public void setEmpRuc(String empRuc) {
        this.empRuc = empRuc;
    }

    public String getEmpRazonSocial() {
        return empRazonSocial;
    }

    public void setEmpRazonSocial(String empRazonSocial) {
        this.empRazonSocial = empRazonSocial;
    }

    public String getEmpGerente() {
        return empGerente;
    }

    public void setEmpGerente(String empGerente) {
        this.empGerente = empGerente;
    }

    public String getEmpContador() {
        return empContador;
    }

    public void setEmpContador(String empContador) {
        this.empContador = empContador;
    }

    public String getEmpDireccion() {
        return empDireccion;
    }

    public void setEmpDireccion(String empDireccion) {
        this.empDireccion = empDireccion;
    }

    public String getEmpTelefono() {
        return empTelefono;
    }

    public void setEmpTelefono(String empTelefono) {
        this.empTelefono = empTelefono;
    }

    public String getUsrNick() {
        return usrNick;
    }

    public void setUsrNick(String usrNick) {
        this.usrNick = usrNick;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
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

    public String getEmpRutaReportes() {
        return empRutaReportes;
    }

    public void setEmpRutaReportes(String empRutaReportes) {
        this.empRutaReportes = empRutaReportes;
    }

    public String getEmpRutaLogo() {
        return empRutaLogo;
    }

    public void setEmpRutaLogo(String empRutaLogo) {
        this.empRutaLogo = empRutaLogo;
    }

}
