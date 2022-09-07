/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.report;

/**
 *
 * @author CarolValdiviezo
 */
public class ReporteSuceso {

    private String usuario;
    private String desde;
    private String hasta;
    private String suceso;
    private String secuencia;
    private String tabla;
    private String clave;
    private String sucesoDetalle;
    private String detalle;
    private String codigo;
    private String fecha;

    public ReporteSuceso() {
    }

    public ReporteSuceso(String usuario, String desde, String hasta, String suceso, String secuencia, String tabla, String clave, String sucesoDetalle, String detalle, String codigo, String fecha) {
        this.usuario = usuario;
        this.desde = desde;
        this.hasta = hasta;
        this.suceso = suceso;
        this.secuencia = secuencia;
        this.tabla = tabla;
        this.clave = clave;
        this.sucesoDetalle = sucesoDetalle;
        this.detalle = detalle;
        this.codigo = codigo;
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHasta() {
        return hasta;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }

    public String getSuceso() {
        return suceso;
    }

    public void setSuceso(String suceso) {
        this.suceso = suceso;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getSucesoDetalle() {
        return sucesoDetalle;
    }

    public void setSucesoDetalle(String sucesoDetalle) {
        this.sucesoDetalle = sucesoDetalle;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
