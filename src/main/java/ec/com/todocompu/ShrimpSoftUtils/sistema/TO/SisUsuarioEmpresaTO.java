package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;

public class SisUsuarioEmpresaTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String usrCodigo;
    private String usrNombre;
    private String usrApellido;
    private String usrEstado;
    private String usrNick;
    private String empCodigo;
    private String empRuc;
    private String empRazonSocial;
    private String empNombre;
    private String empDireccion;
    private String empTelefono;
    private String empPais;
    private String empCiudad;
    private String empGerente;
    private String empIdGerente;
    private String empContador;
    private String empRucContador;
    private String empActividad;
    private String empEscogerPrecioPor;
    private Boolean perEliminarFilas;
    private Boolean perAplicarDescuentos;
    private Boolean perCambiarFecha;
    private String perMotivoPermitido;
    private String perBodegaPermitida;
    private String perDocumentoPermitido;
    private String perSecuencialPermitidoVentas;
    private String perSecuencialPermitidoRetenciones;
    private String perSecuencialPermitidoGuias;
    private String perSecuencialPermitidoLiquidacionCompras;
    private String perFormaPagoPermitida;
    private Boolean perPermisoCredito;
    private Integer perPrecioPermitido;
    private Boolean perCambiarPrecio;
    private String empParResolucionContribuyenteEspecia;
    private String empParRutaReportes;
    private String empParRutaLogo;
    private Boolean empParObligadoLlevarContabilidad;
    private String empEmail;
    private String empClave;
    private String empWebDocumentosElectronicos;
    private boolean parObligadoEmitirDocumentosElectronicos;
    private boolean parObligadoRegistrarLiquidacionPesca;

    public SisUsuarioEmpresaTO() {
    }

    public String getEmpWebDocumentosElectronicos() {
        return empWebDocumentosElectronicos;
    }

    public void setEmpWebDocumentosElectronicos(String empWebDocumentosElectronicos) {
        this.empWebDocumentosElectronicos = empWebDocumentosElectronicos;
    }

    public String getEmpActividad() {
        return empActividad;
    }

    public void setEmpActividad(String empActividad) {
        this.empActividad = empActividad;
    }

    public String getEmpPais() {
        return empPais;
    }

    public void setEmpPais(String empPais) {
        this.empPais = empPais;
    }

    public String getEmpCiudad() {
        return empCiudad;
    }

    public void setEmpCiudad(String empCiudad) {
        this.empCiudad = empCiudad;
    }

    public String getEmpClave() {
        return empClave;
    }

    public void setEmpClave(String empClave) {
        this.empClave = empClave;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
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

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpEscogerPrecioPor() {
        return empEscogerPrecioPor;
    }

    public void setEmpEscogerPrecioPor(String empEscogerPrecioPor) {
        this.empEscogerPrecioPor = empEscogerPrecioPor;
    }

    public String getEmpGerente() {
        return empGerente;
    }

    public void setEmpGerente(String empGerente) {
        this.empGerente = empGerente;
    }

    public String getEmpIdGerente() {
        return empIdGerente;
    }

    public void setEmpIdGerente(String empIdGerente) {
        this.empIdGerente = empIdGerente;
    }

    public String getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    public Boolean getEmpParObligadoLlevarContabilidad() {
        return empParObligadoLlevarContabilidad;
    }

    public void setEmpParObligadoLlevarContabilidad(Boolean empParObligadoLlevarContabilidad) {
        this.empParObligadoLlevarContabilidad = empParObligadoLlevarContabilidad;
    }

    public String getEmpParResolucionContribuyenteEspecia() {
        return empParResolucionContribuyenteEspecia;
    }

    public void setEmpParResolucionContribuyenteEspecia(String empParResolucionContribuyenteEspecia) {
        this.empParResolucionContribuyenteEspecia = empParResolucionContribuyenteEspecia;
    }

    public String getEmpRazonSocial() {
        return empRazonSocial;
    }

    public void setEmpRazonSocial(String empRazonSocial) {
        this.empRazonSocial = empRazonSocial;
    }

    public String getEmpRuc() {
        return empRuc;
    }

    public void setEmpRuc(String empRuc) {
        this.empRuc = empRuc;
    }

    public String getEmpRucContador() {
        return empRucContador;
    }

    public void setEmpRucContador(String empRucContador) {
        this.empRucContador = empRucContador;
    }

    public String getEmpTelefono() {
        return empTelefono;
    }

    public void setEmpTelefono(String empTelefono) {
        this.empTelefono = empTelefono;
    }

    public Boolean getPerAplicarDescuentos() {
        return perAplicarDescuentos;
    }

    public void setPerAplicarDescuentos(Boolean perAplicarDescuentos) {
        this.perAplicarDescuentos = perAplicarDescuentos;
    }

    public String getPerBodegaPermitida() {
        return perBodegaPermitida;
    }

    public void setPerBodegaPermitida(String perBodegaPermitida) {
        this.perBodegaPermitida = perBodegaPermitida;
    }

    public Boolean getPerCambiarFecha() {
        return perCambiarFecha;
    }

    public void setPerCambiarFecha(Boolean perCambiarFecha) {
        this.perCambiarFecha = perCambiarFecha;
    }

    public Boolean getPerCambiarPrecio() {
        return perCambiarPrecio;
    }

    public void setPerCambiarPrecio(Boolean perCambiarPrecio) {
        this.perCambiarPrecio = perCambiarPrecio;
    }

    public String getPerDocumentoPermitido() {
        return perDocumentoPermitido;
    }

    public void setPerDocumentoPermitido(String perDocumentoPermitido) {
        this.perDocumentoPermitido = perDocumentoPermitido;
    }

    public Boolean getPerEliminarFilas() {
        return perEliminarFilas;
    }

    public void setPerEliminarFilas(Boolean perEliminarFilas) {
        this.perEliminarFilas = perEliminarFilas;
    }

    public String getPerFormaPagoPermitida() {
        return perFormaPagoPermitida;
    }

    public void setPerFormaPagoPermitida(String perFormaPagoPermitida) {
        this.perFormaPagoPermitida = perFormaPagoPermitida;
    }

    public String getPerMotivoPermitido() {
        return perMotivoPermitido;
    }

    public void setPerMotivoPermitido(String perMotivoPermitido) {
        this.perMotivoPermitido = perMotivoPermitido;
    }

    public Boolean getPerPermisoCredito() {
        return perPermisoCredito;
    }

    public void setPerPermisoCredito(Boolean perPermisoCredito) {
        this.perPermisoCredito = perPermisoCredito;
    }

    public Integer getPerPrecioPermitido() {
        return perPrecioPermitido;
    }

    public void setPerPrecioPermitido(Integer perPrecioPermitido) {
        this.perPrecioPermitido = perPrecioPermitido;
    }

    public String getPerSecuencialPermitidoVentas() {
        return perSecuencialPermitidoVentas;
    }

    public void setPerSecuencialPermitidoVentas(String perSecuencialPermitidoVentas) {
        this.perSecuencialPermitidoVentas = perSecuencialPermitidoVentas;
    }

    public String getPerSecuencialPermitidoRetenciones() {
        return perSecuencialPermitidoRetenciones;
    }

    public void setPerSecuencialPermitidoRetenciones(String perSecuencialPermitidoRetenciones) {
        this.perSecuencialPermitidoRetenciones = perSecuencialPermitidoRetenciones;
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

    public String getUsrEstado() {
        return usrEstado;
    }

    public void setUsrEstado(String usrEstado) {
        this.usrEstado = usrEstado;
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

    public boolean isParObligadoEmitirDocumentosElectronicos() {
        return parObligadoEmitirDocumentosElectronicos;
    }

    public void setParObligadoEmitirDocumentosElectronicos(boolean parObligadoEmitirDocumentosElectronicos) {
        this.parObligadoEmitirDocumentosElectronicos = parObligadoEmitirDocumentosElectronicos;
    }

    public boolean isParObligadoRegistrarLiquidacionPesca() {
        return parObligadoRegistrarLiquidacionPesca;
    }

    public void setParObligadoRegistrarLiquidacionPesca(boolean parObligadoRegistrarLiquidacionPesca) {
        this.parObligadoRegistrarLiquidacionPesca = parObligadoRegistrarLiquidacionPesca;
    }

    public String getPerSecuencialPermitidoGuias() {
        return perSecuencialPermitidoGuias;
    }

    public void setPerSecuencialPermitidoGuias(String perSecuencialPermitidoGuias) {
        this.perSecuencialPermitidoGuias = perSecuencialPermitidoGuias;
    }

    public String getPerSecuencialPermitidoLiquidacionCompras() {
        return perSecuencialPermitidoLiquidacionCompras;
    }

    public void setPerSecuencialPermitidoLiquidacionCompras(String perSecuencialPermitidoLiquidacionCompras) {
        this.perSecuencialPermitidoLiquidacionCompras = perSecuencialPermitidoLiquidacionCompras;
    }

    public String getEmpParRutaReportes() {
        return empParRutaReportes;
    }

    public void setEmpParRutaReportes(String empParRutaReportes) {
        this.empParRutaReportes = empParRutaReportes;
    }

    public String getEmpParRutaLogo() {
        return empParRutaLogo;
    }

    public void setEmpParRutaLogo(String empParRutaLogo) {
        this.empParRutaLogo = empParRutaLogo;
    }

    @Override
    public String toString() {
        return this.empNombre + " " + this.empRazonSocial;
    }
}
